package com.DEMOJWT.demo.repositories;

import com.DEMOJWT.demo.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioUser extends JpaRepository<User, Long> {
}
