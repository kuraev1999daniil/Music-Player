package ru.kuraev.feature_audio.presentation.screen

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import ru.kuraev.data.audio.domain.models.Audio
import ru.kuraev.feature_audio.domain.use_cases.all_audio.AllAudioUseCase
import javax.inject.Inject

class ListAudioVm @Inject constructor(
    private val allAudioUseCase: AllAudioUseCase
) : ViewModel() {

    private val _allAudio = MutableStateFlow(emptyList<Audio>())
    val allAudio get() = _allAudio.asStateFlow()

    init {
        getAllAudioUseCase()
    }

    private fun getAllAudioUseCase() {
        allAudioUseCase.execute()
            .map {
                Log.d("daniil_log", "TITLE: ${it.map { it.title }}")

                _allAudio.value = it
            }
            .flowOn(Dispatchers.IO)
            .launchIn(viewModelScope)
    }
}