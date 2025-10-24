package org.example.useraccount.Services;

import org.example.useraccount.Dto.ReponseDto;
import org.example.useraccount.Dto.UserDto;
import org.example.useraccount.Model.UserAccount;
import org.example.useraccount.Repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository repository;
    private final UserAccount account;

    public UserService(UserRepository userRepository, UserAccount account) {
        this.repository = userRepository;
        this.account = account;
    }

    public ReponseDto createANewUser(UserDto userDto) {
         account.setUsername(userDto.getUsername());
         account.setPassword(userDto.getPassword());
         account.setEmail(userDto.getEmail());
         repository.save(account);

         return new ReponseDto(account.getUsername(), account.getEmail());
    }

}
