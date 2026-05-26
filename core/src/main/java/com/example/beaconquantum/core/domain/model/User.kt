package com.example.beaconquantum.core.domain.model

data class User(
    val id: String,
    val name: String,
    val avatarUrl: String?,
    val role: UserRole,
    val level: String?,
    val danceStyle: String?
)

enum class UserRole {
    TRAINER, STUDENT
}
