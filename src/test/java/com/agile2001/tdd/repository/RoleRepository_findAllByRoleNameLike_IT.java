package com.agile2001.tdd.repository;

import com.agile2001.tdd.IntegrationTest;
import com.agile2001.tdd.domain.Role;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@IntegrationTest
public class RoleRepository_findAllByRoleNameLike_IT {

    @Autowired
    private RoleRepository roleRepository;

    @Test
    public void testFindAllByRoleNameLike() {
        List<Role> list = roleRepository.findAllByRoleNameLike("Hr%");
        list
            .stream()
            .forEach(item -> {
                System.out.println("item = " + item);
            });
        Assertions.assertFalse(list.isEmpty());
    }
}
