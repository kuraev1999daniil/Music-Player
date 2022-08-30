package ru.kuraev.base_dagger.app.modules

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import ru.kuraev.data.database.MediaPlayerDatabase
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(context: Context): MediaPlayerDatabase = Room.databaseBuilder(
        context.applicationContext,
        MediaPlayerDatabase::class.java,
        MediaPlayerDatabase.DB_NAME
    ).fallbackToDestructiveMigration().build()
}