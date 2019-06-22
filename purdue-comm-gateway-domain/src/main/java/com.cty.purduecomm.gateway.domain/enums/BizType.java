package com.cty.purduecomm.gateway.domain.enums;

import lombok.Getter;

import java.util.stream.Stream;

@Getter
public enum BizType {
    GIT_HUB_USER((byte)0, "GIT_HUB_USER")
    ;

    private byte value;
    private String name;

    BizType(byte value, String name) {
        this.value = value;
        this.name = name;
    }

    public static BizType of(byte value) {
        return Stream.of(BizType.values())
                .filter(x -> x.getValue() == value)
                .findFirst().orElse(BizType.GIT_HUB_USER);
    }

    public static BizType of(Integer value) {
        return Stream.of(BizType.values())
                .filter(x -> value.byteValue() == x.getValue())
                .findFirst().orElse(BizType.GIT_HUB_USER);
    }

    public static BizType of(String name) {
        return Stream.of(BizType.values())
                .filter(x -> x.getName().equals(name))
                .findFirst().orElse(BizType.GIT_HUB_USER);
    }
}
