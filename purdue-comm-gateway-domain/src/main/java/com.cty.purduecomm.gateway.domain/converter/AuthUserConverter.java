package com.cty.purduecomm.gateway.domain.converter;

import com.cty.purduecomm.gateway.domain.entity.AuthUser;
import com.cty.purduecomm.gateway.domain.enums.BizType;
import com.cty.purduecomm.gateway.domain.factory.AuthUserFactory;
import com.cty.purduecomm.gateway.infrastructure.persistant.dataobject.AuthUserDO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AuthUserConverter {
    private AuthUserFactory authUserFactory;

    public AuthUserDO toAuthUserDO(AuthUser authUser) {
        AuthUserDO authUserDO = new AuthUserDO();

        authUserDO.setAccessToken(authUser.getAccessToken());
        authUserDO.setBizType(authUser.getBizType().getValue());
        authUserDO.setBizUserId(authUser.getBizUserId());

        return authUserDO;
    }

    public AuthUser toAuthUser(AuthUserDO authUserDO) {
        AuthUser authUser = authUserFactory.createAuthUser(
                authUserDO.getAccessToken(),
                authUserDO.getBizUserId(),
                BizType.of(authUserDO.getBizType()));
        authUser.setCreatedDate(authUserDO.getCreatedDate());
        authUser.setLastModifiedDate(authUserDO.getLastModifiedDate());

        return authUser;
    }
}
