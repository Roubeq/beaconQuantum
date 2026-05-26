package com.example.beaconquantum.core.domain.repository

import com.example.beaconquantum.core.domain.model.ChatMessage
import kotlinx.coroutines.flow.Flow

interface ChatRepository {
    fun getMessages(chatId: String): Flow<List<ChatMessage>>
    suspend fun sendMessage(chatId: String, message: ChatMessage)
    suspend fun sendAiQuery(query: String): Flow<ChatMessage>
}
