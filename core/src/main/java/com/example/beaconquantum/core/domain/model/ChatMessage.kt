package com.example.beaconquantum.core.domain.model

data class ChatMessage(
    val id: String,
    val chatId: String,
    val senderId: String,
    val type: MessageType,
    val content: String?,
    val mediaUrl: String?,
    val isPinned: Boolean,
    val sentAt: Long
)

enum class MessageType {
    TEXT, VOICE, VIDEO, AI_RESPONSE
}
