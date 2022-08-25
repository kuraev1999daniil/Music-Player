package ru.kuraev.api

import ru.kuraev.feature_api.FeatureApi

interface ListAudioFeatureApi : FeatureApi {

    fun route(): String
}