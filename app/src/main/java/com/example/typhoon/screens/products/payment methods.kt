package com.example.typhoon.screens.products

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.typhoon.R
import com.example.typhoon.navigate.ROUTE_LOGIN
import com.example.typhoon.navigate.ROUTE_PURCHASE_PRODUCT

@Composable
fun PaymentMethodScreen(navController: NavController){



    Box(modifier = Modifier.fillMaxSize()) {



        Image(painter = painterResource(id = R.drawable.paymentmethod), contentDescription ="Background Image" ,
            contentScale = ContentScale.FillBounds, modifier = Modifier.matchParentSize())

    }

    Column {


    Text(text = "CHOOSE YOUR PAYMENT METHOD",
              color = Color.Red, fontFamily = FontFamily.Cursive, fontSize = 20.sp
    )


    val cardItems = listOf(
        CardItem("Mpesa", com.example.typhoon.R.drawable.mpesa,),
        CardItem("Credit Card", com.example.typhoon.R.drawable.creditcard),
        CardItem("PayPal", com.example.typhoon.R.drawable.paypal),
        CardItem("MasterCard", com.example.typhoon.R.drawable.mastercard)
//        CardItem("Card 5", com.example.typhoon.R.drawable.necklace),
//        CardItem("Card 6", com.example.typhoon.R.drawable.login)
    )
        var price by remember { mutableStateOf("") }
        var productPrice by remember { mutableStateOf(TextFieldValue(price)) }
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(cardItems) { cardItem ->
                ClickableCard(navController, cardItem, productPrice)
            }
        }


    }
}


@Composable
fun ClickableCard(navController: NavController, cardItem: CardItem, productPrice: TextFieldValue) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable(onClick = { onClickCard(navController, cardItem, productPrice) })
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = cardItem.imageRes),
                contentDescription = null,
                modifier = Modifier
                    .size(100.dp)
                    .padding(bottom = 8.dp)
            )
            Text(text = cardItem.title)
        }
    }
}



fun navigateToDestination(navController: NavController, cardItem: CardItem) {
    // Perform navigation based on the clicked card
    when (cardItem.title) {
        "Card 1" -> navController.navigate(ROUTE_LOGIN)
        "Card 2" -> navController.navigate("LoginScreen")
        // Add cases for other cards as needed
    }
}


data class CardItem(val title: String, val imageRes: Int)

fun onClickCard(navController: NavController, cardItem: CardItem, productPrice: TextFieldValue) {
    // Perform navigation based on the clicked card
    when (cardItem.title) {
        "Mpesa" -> navController.navigate(ROUTE_PURCHASE_PRODUCT)
        //"Mpesa" -> navController.navigate(ROUTE_PURCHASE_PRODUCT)
        // Add cases for other cards as needed
    }
}

@Preview
@Composable
fun PaymentMethodScreenPreview(){

    PaymentMethodScreen(rememberNavController())

}









