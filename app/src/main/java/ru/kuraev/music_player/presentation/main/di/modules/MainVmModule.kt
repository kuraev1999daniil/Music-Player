package ru.kuraev.music_player.presentation.main.di.modules

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import ru.kuraev.base_dagger.base.factory.ViewModelFactory
import ru.kuraev.base_dagger.base.key.VmKey
import ru.kuraev.base_dagger.base.scope.ActivityScoped
import ru.kuraev.music_player.presentation.main.MainActivityVm

@Module
interface MainVmModule {

    @Binds
    @ActivityScoped
    fun bindVmFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ActivityScoped
    @VmKey(MainActivityVm::class)
    fun bindMainVm(viewModel: MainActivityVm): ViewModel
}