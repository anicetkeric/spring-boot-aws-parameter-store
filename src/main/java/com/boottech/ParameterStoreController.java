package com.boottech;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

record DatabaseCredential(String activeProfile, String username, String password){}

@RestController
@RequestMapping("/api")
public class ParameterStoreController {

    @Value("${spring.profiles.active}")
    private String activeProfile;
    @Value("${db.username}")
    private String username;

    @Value("${db.password}")
    private String password;

    @GetMapping(value = "/parameters")
    public ResponseEntity<DatabaseCredential> getParams() {
        return ResponseEntity.ok(new DatabaseCredential(activeProfile, username, password));
    }
}