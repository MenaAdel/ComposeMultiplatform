package org.mena.composemp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import io.ktor.client.engine.okhttp.OkHttp
import org.mena.composemp.networking.InsultCensorClient
import org.mena.composemp.networking.createHttpClient

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        setContent {
            App(
                client = remember { InsultCensorClient(createHttpClient(OkHttp.create())) }
            )
        }
    }
}