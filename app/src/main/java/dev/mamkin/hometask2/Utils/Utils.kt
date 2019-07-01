package dev.mamkin.hometask2.Utils

object Utils {
    fun parseFullname(fullname: String?): Pair<String?, String?>{
//        var tmpFullname = fullname
//        tmpFullname = tmpFullname?.trim()
        val parts: List<String>? = fullname?.trim()?.split(" ")?.filterNot { it.trim().isEmpty() }

        return Pair(parts?.getOrNull(0), parts?.getOrNull(1))
    }

    fun toInitials(firstName: String?, lastName: String?): String {
        var initials = ""
        if (!firstName.isNullOrEmpty()) {
            initials += firstName.trim().get(0).toUpperCase()
        }

    }
}