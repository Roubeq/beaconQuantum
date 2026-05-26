package com.example.beaconquantum.core.domain.repository

import com.example.beaconquantum.core.domain.model.Group
import kotlinx.coroutines.flow.Flow

interface GroupRepository {
    fun getGroups(): Flow<List<Group>>
    suspend fun getGroupById(groupId: String): Group?
    suspend fun createGroup(group: Group)
}
