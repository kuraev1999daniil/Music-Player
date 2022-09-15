package ru.kuraev.base_dagger.app.modules

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import ru.kuraev.data.dao.AudioDao
import ru.kuraev.data.dao.FileDao
import ru.kuraev.data.database.MediaPlayerDatabase
import javax.inject.Singleton

@Module
interface DatabaseModule {

    companion object {

        @Provides
        @Singleton
        fun provideDatabase(context: Context): MediaPlayerDatabase = Room.databaseBuilder(
            context.applicationContext,
            MediaPlayerDatabase::class.java,
            MediaPlayerDatabase.DB_NAME
        ).fallbackToDestructiveMigration().build()

        @Provides
        @Singleton
        fun provideAudioDao(database: MediaPlayerDatabase): AudioDao = database.audioDao()

        @Provides
        @Singleton
        fun provideFileDao(database: MediaPlayerDatabase): FileDao = database.fileDao()
    }
}