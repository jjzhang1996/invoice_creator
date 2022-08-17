package com.jiajunzhang.invoicecreateor.controller;


import com.jiajunzhang.invoicecreateor.model.webuser.WebUser;
import com.jiajunzhang.invoicecreateor.model.webuser.WebUserService;
import com.jiajunzhang.invoicecreateor.security.jwt.JwtResponse;
import com.jiajunzhang.invoicecreateor.security.jwt.JwtUtils;
import com.jiajunzhang.invoicecreateor.security.jwt.WebUserRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/user")
@AllArgsConstructor
public class WebUserController {
    private final WebUserService webUserService;
    private final JwtUtils jwtUtils;
    private AuthenticationManager authenticationManager;

    @PostMapping("/login")
    public ResponseEntity<?> authenticateUser(@RequestBody WebUserRequest loginRequest){

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

        SecurityContextHolder.getContext()
                .setAuthentication(authentication);
        String jwt = jwtUtils.generateJwtToken(authentication);

        WebUser userDetails = (WebUser)
                authentication.getPrincipal();

        return ResponseEntity
                .ok(new JwtResponse(jwt, userDetails.getId(),
                        userDetails.getUsername()
                ));
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser
            (@RequestBody WebUserRequest signUpRequest) {
        return webUserService.registerUser(signUpRequest);
    }
}
