package dev.mamkin.hometask2.models

class Chat (
    id: String,
    members: MutableList<User> = mutableListOf(),
    messages: MutableList<BaseMessage> = mutableListOf()
)
