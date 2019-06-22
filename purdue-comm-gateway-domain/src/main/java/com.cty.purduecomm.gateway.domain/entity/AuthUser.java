package com.cty.purduecomm.gateway.domain.entity;

import com.cty.purduecomm.gateway.domain.enums.BizType;
import lombok.Data;

import java.util.Date;

@Data
public class AuthUser {

    private String accessToken;

    private String bizUserId;

    private BizType bizType;

    private Date createdDate;

    private Date lastModifiedDate;
}
