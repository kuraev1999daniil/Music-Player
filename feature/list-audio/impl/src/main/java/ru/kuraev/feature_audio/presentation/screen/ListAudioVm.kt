package ru.kuraev.feature_audio.presentation.screen

import androidx.lifecycle.ViewModel
import ru.kuraev.feature_audio.domain.use_cases.all_audio.AllAudioUseCase
import javax.inject.Inject

class ListAudioVm @Inject constructor(
    private val allAudioUseCase: AllAudioUseCase
) : ViewModel() {

    fun getAllAudioUseCase() {
        allAudioUseCase.execute()
    }
}