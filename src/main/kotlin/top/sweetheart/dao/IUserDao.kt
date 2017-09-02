package top.sweetheart.dao

import org.springframework.stereotype.Service
import top.sweetheart.entity.User

@Service
interface IUserDao {
    fun login(user: User): User?
}