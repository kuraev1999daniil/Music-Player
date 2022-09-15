package ru.kuraev.base_dagger.app.modules

import dagger.Binds
import dagger.Module
import ru.kuraev.data.cache.Cache
import ru.kuraev.data.cache.CacheImpl
import javax.inject.Singleton

@Module
interface CacheModule {

    @Binds
    @Singleton
    fun bindCache(cache: CacheImpl): Cache
}