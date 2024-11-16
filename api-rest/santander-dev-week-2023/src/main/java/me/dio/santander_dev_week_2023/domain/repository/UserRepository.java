package me.dio.santander_dev_week_2023.domain.repository;

import me.dio.santander_dev_week_2023.domain.models.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String number);
    boolean existsByCardNumber(String number);
}
