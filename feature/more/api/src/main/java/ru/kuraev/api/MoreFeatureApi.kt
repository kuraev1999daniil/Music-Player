package ru.kuraev.api

import ru.kuraev.feature_api.FeatureApi

interface MoreFeatureApi : FeatureApi {

    fun route(): String
}