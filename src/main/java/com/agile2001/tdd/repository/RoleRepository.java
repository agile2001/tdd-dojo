package com.agile2001.tdd.repository;

import com.agile2001.tdd.domain.Role;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Role entity.
 */
@SuppressWarnings("unused")
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    List<Role> findAllByRoleNameLike(String hr);

    Optional<Role> findOneByRoleKey(String admin);
}
