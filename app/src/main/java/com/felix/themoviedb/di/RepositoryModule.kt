package com.felix.themoviedb.di

import com.felix.themoviedb.data.api.service.ApiService
import com.felix.themoviedb.data.repository.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @ViewModelScoped
    @Provides
    fun provideRepository(apiService: ApiService) = Repository(apiService)
}