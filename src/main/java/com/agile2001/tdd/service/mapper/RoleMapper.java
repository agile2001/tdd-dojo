package com.agile2001.tdd.service.mapper;

import com.agile2001.tdd.domain.Role;
import com.agile2001.tdd.service.dto.RoleDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Role} and its DTO {@link RoleDTO}.
 */
@Mapper(componentModel = "spring")
public interface RoleMapper extends EntityMapper<RoleDTO, Role> {}
