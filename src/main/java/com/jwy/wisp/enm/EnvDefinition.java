/*
 * easy come, easy go.
 *
 * contact : syiae.jwy@gmail.com
 *
 * · · · · ||   ..     __       ___      ____  ®
 * · · · · ||  ||  || _ ||   ||    ||   ||      ||
 * · · · · ||  ||  \\_ ||_.||    ||   \\_  ||
 * · · _//                                       ||
 * · · · · · · · · · · · · · · · · · ·· ·    ___//
 */
package com.jwy.wisp.enm;

import com.google.common.collect.Maps;
import lombok.Getter;

import java.util.Map;
import java.util.Optional;

/**
 * <p>
 *     定义env
 * </p>
 *
 * @author Jiang Wanyu
 * @version 1.0
 * @date 2024/4/9
 */
@Getter
public enum EnvDefinition {

    PRO("PRO", 600),
    UAT("UAT", 500),
    QA("QA", 400),
    DEV("DEV", 200),
    LOCAL("LOC", 100)

    ;
    private String name;
    private int priority;

    private static Map<String, EnvDefinition> cache = Maps.newHashMapWithExpectedSize(5);
    static {
        for (EnvDefinition env : EnvDefinition.values()) {
            cache.put(env.getName(), env);
        }
    }

    EnvDefinition(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public static Optional<EnvDefinition> getInstance(String name) {
        return Optional.ofNullable(cache.get(name));
    }
}
