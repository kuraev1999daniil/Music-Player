package ru.kuraev.data.media_scanner

import androidx.test.rule.GrantPermissionRule
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import ru.kuraev.data.audio_scanner.AudioScanner

@OptIn(ExperimentalCoroutinesApi::class)
class AudioScannerTest {

    @get:Rule
    var permissionRule: GrantPermissionRule?
            = GrantPermissionRule.grant(android.Manifest.permission.READ_EXTERNAL_STORAGE)

    private lateinit var audioScanner: AudioScanner

    @Before
    fun init() {
        audioScanner = AudioScanner()
    }

    @Test
    fun caseWhereExtensionReceiverFilesIsChecked(): Unit = runTest {
        audioScanner.getFilesBy().forEach {
            it.value.forEach { audio ->
                assert(listOf("mp3", "wav").contains(audio.extension))
            }
        }
    }
}