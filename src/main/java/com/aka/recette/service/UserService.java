package com.aka.recette.service;

import com.aka.recette.domain.User;

public interface UserService {
    User findByName (String name);
    User findByEmail (String email);
    User save (User user);

}
