package org.example.useraccount.Controllers;

import org.example.useraccount.Dto.ReponseDto;
import org.example.useraccount.Dto.UserDto;
import org.example.useraccount.Services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public ReponseDto createANewUser(@RequestBody UserDto userDto) {
        return service.createANewUser(userDto);
    }

    @GetMapping
    public List<ReponseDto> getAllUsers() {
        return service.getAllUsers();
    }
}
