/*
 * easy come, easy go.
 *
 * Copyright (c) 2022,  http://oa.shangruitong.com/, All Rights Reserved.
 *
 * contact : syiae.jwy@gmail.com
 *
 * · · · · ||   ..     __       ___      ____  ®
 * · · · · ||  ||  || _ ||   ||    ||   ||      ||
 * · · · · ||  ||  \\_ ||_.||    ||   \\_  ||
 * · · _//                                       ||
 * · · · · · · · · · · · · · · · · · ·· ·    ___//
 */
package com.jwy.wisp.pojo.dto.gateway;

import lombok.Data;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.Map;

/**
 * <p>
 *     白名单信息
 * </p>
 * <p>
 *     对用仅内部rpc调用的数据信心，可以使用通用dto统一定义
 * </p>
 *
 * @author Jiang Wanyu
 * @version 1.0
 * @date 2022/10/10
 */
@Data
public class WhiteUriDto {

    private String uri;
    private String env;
    private String app;
    private String version;
    private String category;

    public static WhiteUriDto ofMap(Map<String, String> map) {

        WhiteUriDto dto = new WhiteUriDto();
        dto.setUri(map.get("uri"));
        dto.setApp(map.get("app"));
        dto.setEnv(map.get("env"));
        dto.setVersion(map.get("version"));
        dto.setCategory(map.get("category"));
        return dto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof WhiteUriDto)) return false;

        WhiteUriDto that = (WhiteUriDto) o;

        return new EqualsBuilder().append(uri, that.uri).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(uri).toHashCode();
    }
}
