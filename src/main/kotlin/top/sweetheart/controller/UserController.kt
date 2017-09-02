package top.sweetheart.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import top.sweetheart.entity.User
import top.sweetheart.service.IUserService
import top.sweetheart.service.UserServiceImpl

import javax.annotation.Resource

@Controller
class UserController {

    @Resource
    private val userService = UserServiceImpl()

    @RequestMapping(value = "/")
    fun index(): String {
        return "login"
    }

    @RequestMapping(value = "login")
    fun login(user_name: String, user_password: String): String {
        return if (userService.login(User(user_name, user_password)) != null) {
            "success"
        } else {
            "fail"
        }
    }
}