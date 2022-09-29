package com.agile2001.tdd.service;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.agile2001.tdd.IntegrationTest;
import com.agile2001.tdd.domain.Role;
import com.agile2001.tdd.repository.RoleRepository;
import com.agile2001.tdd.service.impl.RoleServiceImpl;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class RoleService_getAdmin_Test {

    private RoleService roleService;
    private RoleRepository roleRepository;

    @BeforeEach
    public void setup() {
        roleRepository = mock(RoleRepository.class);

        Optional<Role> admin = roleRepository.findOneByRoleKey("ADMIN");
        when(admin).thenReturn(newRole("ADMIN"));

        Optional<Role> guest = roleRepository.findOneByRoleKey("GUEST");
        when(guest).thenReturn(newRole("GUEST"));

        roleService = new RoleServiceImpl(roleRepository, null);
    }

    @NotNull
    private Optional<Role> newRole(String roleName) {
        Role value = new Role() {
            {
                setRoleKey(roleName);
            }
        };
        return Optional.of(value);
    }

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
