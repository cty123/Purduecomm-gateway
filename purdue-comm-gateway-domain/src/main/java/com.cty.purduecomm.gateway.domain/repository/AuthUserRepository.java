package com.cty.purduecomm.gateway.domain.repository;

import com.cty.purduecomm.gateway.domain.converter.AuthUserConverter;
import com.cty.purduecomm.gateway.domain.entity.AuthUser;
import com.cty.purduecomm.gateway.infrastructure.persistant.dataobject.AuthUserDO;
import com.cty.purduecomm.gateway.infrastructure.persistant.mapper.AuthUserDOMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class AuthUserRepository {

    private AuthUserConverter authUserConverter;

    private AuthUserDOMapper authUserDOMapper;

    public void insertAuthUser(AuthUser authUser) {
        AuthUserDO authUserDO = authUserConverter.toAuthUserDO(authUser);
        authUserDOMapper.insertSelective(authUserDO);
    }
}
