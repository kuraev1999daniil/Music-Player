package ru.kuraev.music_player.presentation.base

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ru.kuraev.base_dagger.factory.ViewModelFactory
import ru.kuraev.music_player.App
import ru.kuraev.music_player.di.AppComponent
import javax.inject.Inject
import kotlin.reflect.KClass

abstract class BaseActivity<vm: ViewModel>(private val vmClass: KClass<vm>) : ComponentActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    @Suppress("MemberVisibilityCanBePrivate")
    protected val app: App by lazy { applicationContext as App }

    protected val appComponent: AppComponent by lazy { app.appComponent }

    abstract fun buildDagger()

    protected lateinit var viewModel: vm

    override fun onCreate(savedInstanceState: Bundle?) {
        buildDagger()

        createVm()

        super.onCreate(savedInstanceState)
    }

    private fun createVm() {
        viewModel = ViewModelProvider(this, viewModelFactory)[vmClass.java]
    }
}