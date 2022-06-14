package com.citros.core.service.interface_impl;

import com.citros.core.model.User;

import java.util.Collection;
import java.util.List;

public interface UserService {
    User create(User user);
    User getUser(Long id);
    List<User> findAll();
    User update(User user);
    Boolean delete(Long id);

}
