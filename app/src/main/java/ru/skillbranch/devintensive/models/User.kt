package ru.skillbranch.devintensive.models

import ru.skillbranch.devintensive.utils.Utils
import java.util.*

data class User(
    val id : String?,
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

            val name = Utils.parseFullName(fullName)
            return User(id = "$lastId", firstName = name.first, lastName = name.second, avatar = "avatar url")
        }
    }

    data class Builder(
            var id : String? = null,
            var firstName : String? = null,
            var lastName : String? = null,
            var avatar : String? = null,
            var rating : Int = 0,
            var respect : Int = 0,
            var lastVisit : Date? = Date(),
            var isOnline : Boolean = false) {
        fun id(id: String) = apply { this.id = id }
        fun firstName(firstName : String?) = apply { this.firstName = firstName}
        fun lastName(lastName : String?) = apply { this.lastName = lastName}
        fun avatar(avatar : String?) = apply { this.avatar = avatar}
        fun rating(rating : Int = 0) = apply { this.rating = rating}
        fun respect(respect : Int = 0) = apply { this.respect = respect}
        fun lastVisit(lastVisit : Date? = Date()) = apply { this.lastVisit = lastVisit}
        fun isOnline(isOnline : Boolean = false) = apply { this.isOnline = isOnline}
        fun build() = User(id, firstName, lastName, avatar, rating, respect, lastVisit, isOnline)
    }
}