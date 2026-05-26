package com.example.beaconquantum.core.domain.repository

import com.example.beaconquantum.core.domain.model.PracticeSession
import kotlinx.coroutines.flow.Flow

interface PracticeRepository {
    fun getSessions(userId: String): Flow<List<PracticeSession>>
    suspend fun getSessionById(sessionId: String): PracticeSession?
    suspend fun startAnalysis(referenceVideoUrl: String, studentVideoUrl: String): String
}
