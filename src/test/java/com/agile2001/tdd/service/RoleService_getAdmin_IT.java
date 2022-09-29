package com.agile2001.tdd.service;

import static org.junit.jupiter.api.Assertions.*;

import com.agile2001.tdd.IntegrationTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@IntegrationTest
public class RoleService_getAdmin_IT {

    @Autowired
    private RoleService roleService;

    @Test
    public void should_return_true_given_admin_when_isAdmin() {
        Boolean result = roleService.isAdmin("ADMIN");
        Assertions.assertTrue(result);
    }

    @Test
    public void should_return_false_given_guest_when_isAdmin() {
        Boolean result = roleService.isAdmin("GUEST");
        Assertions.assertFalse(result);
    }
}
