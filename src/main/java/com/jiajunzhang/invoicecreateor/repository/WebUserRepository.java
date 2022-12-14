package com.jiajunzhang.invoicecreateor.repository;

import com.jiajunzhang.invoicecreateor.model.webuser.WebUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface WebUserRepository extends JpaRepository<WebUser, Long> {
    Optional<WebUser> findByUsername(String username);
}
