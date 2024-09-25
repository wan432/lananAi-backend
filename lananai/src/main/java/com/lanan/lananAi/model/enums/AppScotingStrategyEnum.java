package com.lanan.lananAi.model.enums;

import org.apache.commons.lang3.ObjectUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * App 应用类型枚举
 *
 * @author <a href="https://github.com/lilanan">程序员鱼皮</a>
 * @from <a href="https://lanan.icu">编程导航知识星球</a>
 */
public enum AppScotingStrategyEnum {
    CUSTOM("自定义", 0),
    AI("AI", 1);

    private final String text;

    private final int value;

    AppScotingStrategyEnum(String text, int value) {
        this.text = text;
        this.value = value;
    }

    /**
     * 获取值列表
     *
     * @return
     */
    public static List<Integer> getValues() {
        return Arrays.stream(values()).map(item -> item.value).collect(Collectors.toList());
    }

    /**
     * 根据 value 获取枚举
     *
     * @param value
     * @return
     */
    public static AppScotingStrategyEnum getEnumByValue(int value) {
        if (ObjectUtils.isEmpty(value)) {
            return null;
        }
        for (AppScotingStrategyEnum anEnum : AppScotingStrategyEnum.values()) {
            if (anEnum.value == value) {
                return anEnum;
            }
        }
        return null;
    }

    public int getValue() {
        return value;
    }

    public String getText() {
        return text;
    }
}
