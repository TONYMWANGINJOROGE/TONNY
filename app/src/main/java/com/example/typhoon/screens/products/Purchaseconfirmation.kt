package com.example.typhoon.screens.products

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.typhoon.navigate.ROUTE_PURCHASE_CONFIRMATION
import com.example.typhoon.navigate.ROUTE_VIEW_PRODUCT

@Composable
fun PurchaseConfirmationScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Product purchased successfully!",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { navController.navigate(ROUTE_VIEW_PRODUCT) }
        ) {
            Text(text = "Back to products")
        }
    }
}


//@Composable
//fun MainScreen(navController: NavHostController) {
//    NavHost(navController = navController, startDestination = ROUTE_INITIAL) {
//        // Other destinations
//        composable(ROUTE_PURCHASE_CONFIRMATION) {
//            PurchaseConfirmationScreen(navController = navController)
//        }
//    }
//}

