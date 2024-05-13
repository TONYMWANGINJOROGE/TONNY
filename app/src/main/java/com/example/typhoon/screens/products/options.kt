import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
//import androidx.compose.material.Card
//import androidx.compose.material.Text
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import androidx.wear.compose.material.Card
import com.example.typhoon.navigate.ROUTE_LOGIN
import com.example.typhoon.navigate.ROUTE_PURCHASE_PRODUCT

@Composable
fun BuyerScreen(navController: NavController) {
    val cardItems = listOf(
        CardItem("Card 1", com.example.typhoon.R.drawable.mensjewelrytrends,),
        CardItem("Card 2", com.example.typhoon.R.drawable.rings),
        CardItem("Card 3", com.example.typhoon.R.drawable.set),
        CardItem("Card 4", com.example.typhoon.R.drawable.watch),
        CardItem("Card 5", com.example.typhoon.R.drawable.necklace),
        CardItem("Card 6", com.example.typhoon.R.drawable.login)
    )

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(cardItems) { cardItem ->
            ClickableCard(navController, cardItem)
        }
    }

}


@Composable
fun ClickableCard(navController: NavController, cardItem: CardItem) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable(onClick = { onClickCard(navController, cardItem) })
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

fun onClickCard(navController: NavController, cardItem: CardItem) {
    // Perform navigation based on the clicked card
    when (cardItem.title) {
        "Card 1" -> navController.navigate(ROUTE_PURCHASE_PRODUCT)
        // Add cases for other cards as needed
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BuyerScreenPreview() {
    BuyerScreen(rememberNavController())
}
