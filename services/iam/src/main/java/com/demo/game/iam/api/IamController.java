package com.demo.game.iam.api;

import com.demo.game.common.api.ApiResponse;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class IamController {

    @GetMapping("/api/v1/iam/ping")
    public ApiResponse<Map<String, Object>> ping() {
        String traceId = MDC.get("traceId");
        return ApiResponse.ok(traceId, Map.of("service", "iam", "status", "ok"));
    }
}
