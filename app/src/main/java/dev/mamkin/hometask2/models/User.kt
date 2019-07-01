package dev.mamkin.hometask2.models

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

            val parts: List<String>? = fullName?.split(" ")
            return User(id = "$lastId", firstName = parts?.getOrNull(0), lastName = parts?.getOrNull(1), avatar = "avatar url")
        }
    }
}