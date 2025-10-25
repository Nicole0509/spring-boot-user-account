package org.example.useraccount.Controllers;

import org.example.useraccount.Dto.ReponseDto;
import org.example.useraccount.Dto.UserDto;
import org.example.useraccount.Services.UserService;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @PutMapping("/{id}")
    public Optional<ReponseDto> updateAUser (@RequestBody UserDto userDto,@PathVariable Long id){
        return service.updateAUser(userDto,id);
    }

}
