package com.example.demo.controller

import com.example.demo.response.JSendResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MyController {


    @GetMapping("/api/example")
    fun exampleEndpoint(): JSendResponse<String> {
        val exampleData = "Este es un ejemplo de datos."
        return JSendResponse(
            status = "success",
            data = exampleData,
            message = "Operación realizada correctamente"
        )
    }


    @GetMapping("/api/fail")
    fun failEndpoint(): JSendResponse<String?> {
        return JSendResponse(
            status = "fail",
            data = null,
            message = "La validación falló. Faltan algunos campos obligatorios.",
            code = 400
        )
    }


    @GetMapping("/api/error")
    fun errorEndpoint(): JSendResponse<String?> {
        return JSendResponse(
            status = "error",
            data = null,
            message = "Se produjo un error interno en el servidor.",
            code = 500
        )
    }
}