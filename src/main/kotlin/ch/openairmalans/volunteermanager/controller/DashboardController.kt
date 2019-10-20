package ch.openairmalans.volunteermanager.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/dashboard")
class DashboardController {

    @RequestMapping("/")
    fun index():String {
        return "dashboard"
    }
}