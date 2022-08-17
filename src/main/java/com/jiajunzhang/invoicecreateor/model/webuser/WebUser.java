package com.jiajunzhang.invoicecreateor.model.webuser;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;

@Entity
@Table
@NoArgsConstructor
@Getter
@Setter
public class WebUser implements UserDetails {
    @Id
    @SequenceGenerator(
            name = "increment_sequence",
            sequenceName = "increment_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "increment_sequence"
    )
    private Long id;
    private String username;
    private String password;
    @Enumerated(EnumType.STRING)
    private WebUserRole webUserRole;
    private Boolean locked = false;
    private Boolean enabled = true;

    public WebUser(String username, String password) {
        this.username = username;
        this.password = password;
        this.webUserRole = WebUserRole.ADMIN;
        this.enabled = true;
        this.locked = false;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority authority =
                new SimpleGrantedAuthority(webUserRole.name());
        return Collections.singleton(authority);
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
