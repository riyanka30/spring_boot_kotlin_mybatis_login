package top.sweetheart.service

import org.springframework.stereotype.Service
import top.sweetheart.dao.IUserDao
import top.sweetheart.entity.User

import javax.annotation.Resource

@Service
class UserServiceImpl : IUserService {

    @Resource
    private val userDao: IUserDao? = null

    override fun login(user: User): User? {
        return userDao!!.login(user)
    }
}