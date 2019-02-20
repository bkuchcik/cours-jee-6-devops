package fr.isima.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class JspTestController{


    @GetMapping("/jsp")
    fun goToJsp() = "test-heroku"
}