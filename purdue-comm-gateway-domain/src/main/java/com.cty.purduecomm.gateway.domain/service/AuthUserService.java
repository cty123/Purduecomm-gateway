package com.cty.purduecomm.gateway.domain.service;

import com.cty.purduecomm.gateway.domain.entity.AuthUser;
import com.cty.purduecomm.gateway.domain.repository.AuthUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service("authUserService")
@AllArgsConstructor
public class AuthUserService {

    private final AuthUserRepository authUserRepository;

    public void insertAuthUser(AuthUser authUser) {
        authUserRepository.insertAuthUser(authUser);
    }

    public void createIfNotExist() {

    }
}
