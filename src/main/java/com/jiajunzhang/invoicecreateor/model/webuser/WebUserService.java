package com.jiajunzhang.invoicecreateor.model.webuser;

import com.jiajunzhang.invoicecreateor.repository.WebUserRepository;
import com.jiajunzhang.invoicecreateor.security.MessageResponse;
import com.jiajunzhang.invoicecreateor.security.jwt.JwtUtils;
import com.jiajunzhang.invoicecreateor.security.jwt.WebUserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class WebUserService implements UserDetailsService{
    private final WebUserRepository webUserRepository;
    @Autowired
    private PasswordEncoder encoder;

    private JwtUtils jwtUtils;
    private final static String USER_NOT_FOUND_MSG = "User with username %s not found";

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return webUserRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException(String.format(USER_NOT_FOUND_MSG, username)));
    }

    @Transactional
    public ResponseEntity<?> registerUser(WebUserRequest signUpRequest){
        // look if user was already created
        int isCreated = webUserRepository.findAll().size();
        if(isCreated > 0){
            ResponseEntity.badRequest()
                    .body(new MessageResponse
                            ("Error: username is already taken!"));
        }

        // Create new user account
        WebUser user = new WebUser(signUpRequest.getUsername(),
                encoder.encode(signUpRequest.getPassword()));

        webUserRepository.save(user);

        return ResponseEntity
                .ok(new MessageResponse("user registered successfully!"));
    }

    public Integer countUser(){
        return webUserRepository.findAll().size();
    }
    public void enableWebUser(String email){
        WebUser curUser = webUserRepository
                .findByUsername(email)
                .orElseThrow(() -> new IllegalStateException("Username not found!"));
        curUser.setEnabled(true);
    }
}
