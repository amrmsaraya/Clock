package com.github.amrmsaraya.clock.di

import com.github.amrmsaraya.clock.data.local.ClockDao
import com.github.amrmsaraya.clock.data.source.ClockLocalDataSource
import com.github.amrmsaraya.clock.data.sourceImpl.ClockLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataSource {

    @Provides
    @Singleton
    fun provideClockLocalDataSource(clockDao: ClockDao): ClockLocalDataSource {
        return ClockLocalDataSourceImpl(clockDao)
    }

}
