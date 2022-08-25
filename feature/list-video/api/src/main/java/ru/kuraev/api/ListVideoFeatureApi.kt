package ru.kuraev.api

import ru.kuraev.feature_api.FeatureApi

interface ListVideoFeatureApi : FeatureApi {

    fun route(): String
}