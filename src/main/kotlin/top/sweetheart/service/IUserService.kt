package top.sweetheart.service

import top.sweetheart.entity.User

interface IUserService {
    fun login(user: User): User?
}