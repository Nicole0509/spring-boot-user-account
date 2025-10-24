package org.example.useraccount.Services;

import org.example.useraccount.Repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository userRepository) {
        this.repository = userRepository;
    }
}
