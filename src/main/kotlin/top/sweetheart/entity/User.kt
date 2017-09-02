package top.sweetheart.entity

class User {
    var user_id: Int = 0
    var user_name: String? = null
    var user_password: String? = null

    constructor() {}

    constructor(user_name: String, user_password: String) {
        this.user_name = user_name
        this.user_password = user_password
    }
}
