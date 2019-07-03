package ru.skillbranch.devintensive.extensions


fun String.truncate(lastIndex: Int = 16): String {
    val trimmed = this.trim()
    val truncated = if (trimmed.length < lastIndex) trimmed else trimmed.substring(0..lastIndex).trim()
    return truncated + if (truncated.length != trimmed.length) "..." else ""
}

fun String.stripHtml(): String {
    return this
            .replace("<.*?>".toRegex(), "")
            .replace("\\s+".toRegex(), " ")
            .replace("&.*?;".toRegex(), "")
}
