package com.demo.game.common.api;

public record ApiResponse<T>(int code, String message, String traceId, T data) {
    public static <T> ApiResponse<T> ok(String traceId, T data) {
        return new ApiResponse<>(0, "OK", traceId, data);
    }
    public static <T> ApiResponse<T> error(String traceId, int code, String message) {
        return new ApiResponse<>(code, message, traceId, null);
    }
}
