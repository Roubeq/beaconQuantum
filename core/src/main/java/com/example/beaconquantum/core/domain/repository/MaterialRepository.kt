package com.example.beaconquantum.core.domain.repository

import com.example.beaconquantum.core.domain.model.Material
import kotlinx.coroutines.flow.Flow

interface MaterialRepository {
    fun getMaterials(groupId: String): Flow<List<Material>>
    suspend fun getMaterialById(materialId: String): Material?
    suspend fun uploadMaterial(material: Material)
}
