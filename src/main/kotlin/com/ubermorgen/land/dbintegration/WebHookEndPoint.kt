package com.ubermorgen.land.dbintegration

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class WebHookEndPoint {

    @GetMapping("/db-web-hook")
    @ResponseBody
    fun blog(@RequestParam(name = "code") code: Any): String {
        return "blog"
    }
}