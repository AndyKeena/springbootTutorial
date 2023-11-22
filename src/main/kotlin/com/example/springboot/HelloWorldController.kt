package com.example.springboot

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/hello")
class HelloWorldController {

    @GetMapping//using the parent path if we want can add ("springboot")
    fun helloWorld(): String = "Hello, this is a REST endpoint"
}