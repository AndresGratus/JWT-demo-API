package com.DEMOJWT.demo.service;

import com.DEMOJWT.demo.dto.User;
import com.DEMOJWT.demo.repositories.RepositorioUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private RepositorioUser repositorioUser;

}
