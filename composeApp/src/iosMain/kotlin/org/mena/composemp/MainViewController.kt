package org.mena.composemp

import androidx.compose.ui.window.ComposeUIViewController
import io.ktor.client.engine.darwin.Darwin
import org.mena.composemp.networking.InsultCensorClient
import org.mena.composemp.networking.createHttpClient

fun MainViewController() = ComposeUIViewController {
    App(
        InsultCensorClient(createHttpClient(Darwin.create()))
    )
}