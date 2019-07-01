package dev.mamkin.hometask2.models

import dev.mamkin.hometask2.Utils.Utils
import java.util.*

data class User(
    val id : String,
    var firstName : String?,
    var lastName : String?,
    var avatar : String?,
    var rating : Int = 0,
    var respect : Int = 0,
    var lastVisit : Date? = Date(),
    var isOnline : Boolean = false
) {
    companion object {
        private var lastId = -1
        fun makeUser(fullName: String?): User {
            lastId++

            val name = Utils.parseFullname(fullName)
            return User(id = "$lastId", firstName = name.first, lastName = name.second, avatar = "avatar url")
        }
    }
}