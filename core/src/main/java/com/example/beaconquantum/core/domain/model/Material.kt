package com.example.beaconquantum.core.domain.model

data class Material(
    val id: String,
    val groupId: String,
    val type: MaterialType,
    val subtype: MaterialSubtype?,
    val videoUrl: String?,
    val title: String,
    val durationSec: Int?,
    val trainerComment: String?,
    val createdAt: Long
)

enum class MaterialType {
    VIDEO, AUDIO, TEXT
}

enum class MaterialSubtype {
    REFERENCE, MIRROR, SLOW, NOTES
}
