package com.cty.purduecomm.gateway.domain.factory;

import com.cty.purduecomm.gateway.domain.entity.AuthUser;
import com.cty.purduecomm.gateway.domain.enums.BizType;
import org.springframework.stereotype.Component;

@Component
public class AuthUserFactory {

    public AuthUser createAuthUser(String accessToken, String bizUserId, BizType bizType) {
        AuthUser authUser = new AuthUser();
        authUser.setAccessToken(accessToken);
        authUser.setBizUserId(bizUserId);
        authUser.setBizType(bizType);
        return authUser;
    }
}
