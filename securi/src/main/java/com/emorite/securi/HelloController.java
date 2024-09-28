package com.emorite.securi;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/greetings")
    public String greetings(@AuthenticationPrincipal OidcUser oidcUser) {
        String name = oidcUser.getFullName();
        return "Welcome , " + name + "!";
    }

    @GetMapping("/")
    public String home() {
        return "Welcome to Manoj's homepage!";
    }
}
