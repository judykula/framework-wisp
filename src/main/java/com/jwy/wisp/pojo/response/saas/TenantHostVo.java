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
package com.jwy.wisp.pojo.response.saas;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 *     tenant与host的对应关系
 * </p>
 *
 * @author Jiang Wanyu
 * @version 1.0
 * @date 2024/3/19
 */
@Data
@Schema(description = "tenant与host")
@NoArgsConstructor
@AllArgsConstructor
public class TenantHostVo {
    @Schema(name = "tenant", description = "租户空间", example = "jwy")
    private String tenant;
    @Schema(name = "host", description = "域名", example = "localhost")
    private String host;
}
