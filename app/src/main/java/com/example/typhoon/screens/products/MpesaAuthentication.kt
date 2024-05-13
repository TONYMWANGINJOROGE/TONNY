package com.example.typhoon.screens.products

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun MPesaAuthenticationScreen(navController: NavController, productPrice: String) {
    // Implement your MPesa authentication UI here
    // Include fields for MPesa details like phone number, PIN, etc.
    // Include a button to confirm the purchase

    // For demonstration purposes, I'm using a placeholder Text
    Text(text = "MPesa Authentication Screen. Product Price: $productPrice")

    Button(onClick = { onPurchaseConfirmed(navController) }) {
        Text(text = "Confirm Purchase")
    }
}


fun onPurchaseConfirmed(navController: NavController) {
    // Perform actions to confirm the purchase
    // For example, update the database to reflect the purchase, then navigate back
    navController.popBackStack()}


@Preview
@Composable
fun MPesaAuthenticationScreenPreview(){

    MPesaAuthenticationScreen(rememberNavController(), productPrice ="")
}