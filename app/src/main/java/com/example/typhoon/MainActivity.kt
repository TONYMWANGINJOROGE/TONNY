package com.example.typhoon

import android.app.ProgressDialog
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
//import com.example.typhoon.Constants.BUSINESS_SHORT_CODE
//import com.example.typhoon.Constants.CALLBACK
//import com.example.typhoon.Constants.PARTY
//import com.example.typhoon.Constants.PASSKEY
//import com.example.typhoon.Constants.TRANSACTION_TYPE
//import com.example.typhoon.models.AccessToken
//import com.example.typhoon.models.STKPush
import com.example.typhoon.navigate.AppNavHost
//import com.example.typhoon.services.DarajaApiClient
import com.example.typhoon.ui.theme.TyphoonTheme
//import retrofit2.Call
//import retrofit2.Callback
//import retrofit2.Response
//import timber.log.Timber
import java.text.SimpleDateFormat
import java.util.Locale

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TyphoonTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppNavHost()
                }
            }
        }
    }
}
