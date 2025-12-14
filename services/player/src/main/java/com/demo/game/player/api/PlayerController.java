package com.demo.game.player.api;

import com.demo.game.common.api.ApiResponse;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class PlayerController {

    @GetMapping("/api/v1/player/{playerId}")
    public ApiResponse<Map<String, Object>> get(@PathVariable String playerId) {
        String traceId = MDC.get("traceId");
        return ApiResponse.ok(traceId, Map.of(
                "playerId", playerId,
                "level", 1,
                "power", 100,
                "title", "Newbie"
        ));
    }
}
