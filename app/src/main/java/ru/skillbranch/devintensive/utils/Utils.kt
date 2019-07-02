package ru.skillbranch.devintensive.utils

val dictionary: Map<String, String> = mapOf(
        "а" to "a",
        "б" to "b",
        "в" to "v",
        "г" to "g",
        "д" to "d",
        "е" to "e",
        "ё" to "e",
        "ж" to "zh",
        "з" to "z",
        "и" to "i",
        "й" to "i",
        "к" to "k",
        "л" to "l",
        "м" to "m",
        "н" to "n",
        "о" to "o",
        "п" to "p",
        "р" to "r",
        "с" to "s",
        "т" to "t",
        "у" to "u",
        "ф" to "f",
        "х" to "h",
        "ц" to "c",
        "ч" to "ch",
        "ш" to "sh",
        "щ" to "sh'",
        "ъ" to "",
        "ы" to "i",
        "ь" to "",
        "э" to "e",
        "ю" to "yu",
        "я" to "ya"
)

object Utils {
    fun parseFullName(fullname: String?): Pair<String?, String?> {
        val parts: List<String>? = fullname?.trim()?.split(" ")?.filterNot { it.trim().isEmpty() }

        return Pair(parts?.getOrNull(0), parts?.getOrNull(1))
    }

    fun toInitials(firstName: String?, lastName: String?): String? {
        var initials = ""
        if (firstName.isNullOrBlank() && lastName.isNullOrBlank()) {
            return null
        }
        initials += firstName?.trim()?.get(0)?.toUpperCase() ?: ""
        initials += lastName?.trim()?.get(0)?.toUpperCase() ?: ""

        return initials

    }

    fun transliteration(payload: String, divider: String = " "): String {
        val words = payload.toLowerCase().trim().split(" ")
        var transWords = ArrayList<String>()
        words.forEach { word ->
            var transword = ""
            word.forEach { letter: Char ->
                transword += if (dictionary.containsKey(letter.toString())) dictionary.get(letter.toString()) else letter
            }
            transWords.add(transword.capitalize())
        }
        return transWords.joinToString(divider)
    }
}