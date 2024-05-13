package com.example.typhoon.screens

import android.content.Intent
import android.content.Intent.ACTION_VIEW
import android.net.Uri
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun ContactScreen(navController: NavHostController) {
    Surface(color = Color.Transparent) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Text(
                text = "Contact Us",

                color = Color.Black,
                fontSize = 30.sp,
                modifier = Modifier.padding(bottom = 16.dp)

            )
            ContactItem(text = "Email: contact@tonymensjewelry.com")
            ContactItem(text = "Phone: +254 768602479")
            ContactItem(
                text = "Instagram: ",
                clickableText = "Tonymwangi91",
                onClick =  {
                    HandleInstagramClick()
                }
            )
            ContactItem(
                text = "Facebook: ",
                clickableText = "Tony_JEWELERY",
                onClick = { /* Handle Facebook click */ }
            )

        }
    }
}

@Composable
fun ContactItem(text: String, clickableText: String? = null, onClick: @Composable (() -> Unit)? = null) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(
            text = text,
           style = MaterialTheme.typography.bodyLarge,
            color = Color.Black,
            modifier = Modifier.weight(1f)
        )

        if (clickableText != null && onClick != null) {
            ClickableText(
                text = AnnotatedString(text = clickableText),
               style = MaterialTheme.typography.bodySmall,
                modifier = Modifier.padding(start = 4.dp),

                onClick = { offset ->
//                    onClick()
                },

            )


        }
    }
}


//fun startActivity(intent: Any) {
//    TODO("Not yet implemented")
//}
@Composable

fun HandleInstagramClick() {
    val context = LocalContext.current
    val instagramUsername = "Tonymwangi91"
    val instagramUrl = "https://www.instagram.com/$instagramUsername"
    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(instagramUrl))
    intent.setPackage("com.instagram.android")
    try {
        // Try to open the Instagram app
        context.startActivity(intent)
    } catch (e: Exception) {
        // If Instagram app is not installed, open the Instagram website
        context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(instagramUrl)))
    }
}

    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun PreviewContactScreen() {
        ContactScreen(rememberNavController())
    }


