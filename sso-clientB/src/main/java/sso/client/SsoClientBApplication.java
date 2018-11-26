package sso.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author admin
 * @Date 2018/11/5 13:38
 * @Version 1.0
 */
@SpringBootApplication
@RestController
@EnableOAuth2Sso
public class SsoClientBApplication {

    @GetMapping("/user")
    public Authentication user(Authentication user) {
        return user;
    }

    public static void main(String[] args) {
        SpringApplication.run(SsoClientBApplication.class, args);
    }
}
