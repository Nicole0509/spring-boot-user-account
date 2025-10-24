package org.example.useraccount.Repositories;

import org.example.useraccount.Model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserAccount, Long> {
}
