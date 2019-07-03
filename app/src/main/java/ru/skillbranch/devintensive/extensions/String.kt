package ru.skillbranch.devintensive.extensions


fun String.truncate(lastIndex: Int = 16): String {
    val truncatedStr = this.substring(0, lastIndex)
    val trimmedStr = truncatedStr.trim()
    return trimmedStr + if (trimmedStr.length == truncatedStr.length) "..." else ""
}

fun String.stripHtml(): String {
    return this
            .replace("<.*?>".toRegex(), "")
            .replace("\\s+".toRegex(), " ")
            .replace("&.*?;".toRegex(), "")
}
