package com.cty.purduecomm.gateway.domain.service;

import com.cty.purduecomm.gateway.domain.entity.AuthUser;
import com.cty.purduecomm.gateway.domain.enums.BizType;
import com.cty.purduecomm.gateway.domain.factory.AuthUserFactory;
import com.cty.purduecomm.gateway.domain.repository.AuthUserRepository;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseToken;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service("authUserService")
@AllArgsConstructor
public class AuthUserService {

    private final AuthUserRepository authUserRepository;
    private final AuthUserFactory authUserFactory;

    public void insertAuthUser(AuthUser authUser) {
        authUserRepository.insertAuthUser(authUser);
    }

    public void createIfNotExist(String accessToken) throws Exception {
        FirebaseToken decodedToken = FirebaseAuth.getInstance().verifyIdToken("");
        String uid = decodedToken.getUid();
        String issuer = decodedToken.getIssuer();
        AuthUser authUser = authUserFactory.createAuthUser(accessToken, uid, BizType.GIT_HUB_USER);
        insertAuthUser(authUser);
    }


}
