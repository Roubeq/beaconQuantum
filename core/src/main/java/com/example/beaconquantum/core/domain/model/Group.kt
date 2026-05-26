package com.example.beaconquantum.core.domain.model

data class Group(
    val id: String,
    val name: String,
    val coverUrl: String?,
    val description: String?,
    val trainerId: String,
    val currentDance: String?,
    val memberCount: Int,
    val progress: Float
)
