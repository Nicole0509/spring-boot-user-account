package org.example.useraccount.Services;

import org.example.useraccount.Dto.ReponseDto;
import org.example.useraccount.Dto.UserDto;
import org.example.useraccount.Model.UserAccount;
import org.example.useraccount.Repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository userRepository) {
        this.repository = userRepository;
    }

    public ReponseDto createANewUser(UserDto userDto) {
        UserAccount account = new UserAccount();

         account.setUsername(userDto.getUsername());
         account.setPassword(userDto.getPassword());
         account.setEmail(userDto.getEmail());
         repository.save(account);

         return new ReponseDto(account.getUsername(), account.getEmail());
    }

    public List<ReponseDto> getAllUsers() {
        return repository.findAll().stream().map(account ->new ReponseDto(account.getUsername(),account.getEmail())).collect(Collectors.toList());
    }
}
