package com.example.beaconquantum.core.domain.repository

import com.example.beaconquantum.core.domain.model.User
import kotlinx.coroutines.flow.Flow

interface UserRepository {
    fun getCurrentUser(): Flow<User?>
    suspend fun getUserById(userId: String): User?
    suspend fun updateProfile(user: User)
}
