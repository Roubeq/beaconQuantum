package com.example.beaconquantum.core.domain.model

data class PracticeSession(
    val id: String,
    val userId: String,
    val referenceVideoId: String,
    val studentVideoUrl: String,
    val score: Int?,
    val metrics: PracticeMetrics?,
    val errors: List<PracticeError>?,
    val heatmap: Map<String, Float>?,
    val recommendations: List<String>?,
    val createdAt: Long
)

data class PracticeMetrics(
    val timing: Int,
    val positions: Int,
    val amplitude: Int,
    val energy: Int
)

data class PracticeError(
    val timeSec: Float,
    val bodyPart: String,
    val description: String,
    val recommendation: String
)
