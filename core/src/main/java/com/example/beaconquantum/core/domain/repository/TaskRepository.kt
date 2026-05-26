package com.example.beaconquantum.core.domain.repository

import com.example.beaconquantum.core.domain.model.Task
import kotlinx.coroutines.flow.Flow

interface TaskRepository {
    fun getTasks(groupId: String): Flow<List<Task>>
    suspend fun getTaskById(taskId: String): Task?
    suspend fun updateTaskStatus(taskId: String, status: TaskStatus)
    suspend fun submitTask(taskId: String, videoUrl: String)
}

// Re-importing TaskStatus if needed, but it's in the same package usually or should be imported
import com.example.beaconquantum.core.domain.model.TaskStatus
