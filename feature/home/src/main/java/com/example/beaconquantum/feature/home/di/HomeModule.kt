package com.example.beaconquantum.feature.home.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class HomeModule {
    // Здесь будут привязки для Use Cases или репозиториев, специфичных для Home
}
