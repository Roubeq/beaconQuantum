package com.example.beaconquantum.core.domain.model

data class Task(
    val id: String,
    val groupId: String,
    val title: String,
    val description: String?,
    val deadline: Long,
    val status: TaskStatus,
    val assignedTo: String
)

enum class TaskStatus {
    PENDING, IN_PROGRESS, SUBMITTED, ACCEPTED, REJECTED
}
