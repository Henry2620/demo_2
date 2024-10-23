package com.example.demo.controller

import com.example.demo.response.JSendResponse
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(Exception::class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    fun handleGeneralException(e: Exception): JSendResponse<String?> {
        return JSendResponse(
            status = "error",
            data = null,
            message = "Se ha producido un error: ${e.message}",
            code = 500
        )
    }
}