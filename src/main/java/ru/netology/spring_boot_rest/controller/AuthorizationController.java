package ru.netology.spring_boot_rest.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.spring_boot_rest.service.Authorities;
import ru.netology.spring_boot_rest.service.AuthorizationService;

import java.util.List;


@AllArgsConstructor
@RestController
public class AuthorizationController {
    private AuthorizationService service;

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@RequestParam("user") String user, @RequestParam("password") String password) {
        return service.getAuthorities(user, password);
    }
}