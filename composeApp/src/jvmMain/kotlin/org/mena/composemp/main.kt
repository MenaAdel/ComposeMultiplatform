package org.mena.composemp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import io.ktor.client.engine.okhttp.OkHttp
import org.mena.composemp.networking.InsultCensorClient
import org.mena.composemp.networking.createHttpClient

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "ComposeMultiplatform",
    ) {
        App(
            InsultCensorClient(createHttpClient(OkHttp.create()))
        )
    }
}