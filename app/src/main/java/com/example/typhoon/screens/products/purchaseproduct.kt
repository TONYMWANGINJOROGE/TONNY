package com.example.typhoon.screens.products

//import Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
//import androidx.compose.material.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.typhoon.data.ProductViewModel
import com.example.typhoon.models.Product
import com.example.typhoon.navigate.ROUTE_PAYMENT_METHODS
import com.example.typhoon.navigate.ROUTE_PURCHASE_CONFIRMATION

@Composable
fun PurchaseProductsScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        val context = LocalContext.current
        val productRepository = ProductViewModel(navController, context)
        val emptyProductState = remember { mutableStateOf(Product("", "", "", "","")) }
        val emptyProductsListState = remember { mutableStateListOf<Product>() }

        val products = productRepository.viewProducts(emptyProductState, emptyProductsListState)
        val navBackStackEntry = navController.currentBackStackEntryAsState()
        val productId = navBackStackEntry.value?.arguments?.getString("productId")

        // If purchase confirmation screen is requested, show it
        if (productId != null) {
            PurchaseConfirmationScreen(productId = productId, navController = navController)
            return
        }

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "All products",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Red
            )

            Spacer(modifier = Modifier.height(20.dp))

            LazyColumn() {
                items(products) { product ->
                    ProductItem(
                        product = product,
                        navController = navController,
                        productRepository = productRepository
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                }
            }
        }
    }
}

@Composable
fun PurchaseConfirmationScreen(productId: String, navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Product purchased successfully!")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.popBackStack() }) {
            Text(text = "Back to products")
        }
    }
}










@Composable
fun ProductItem(
    product: Product,
    navController: NavController,
    productRepository: ProductViewModel
) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = "Name: ${product.name}")
        Text(text = "Quantity: ${product.quantity}")
        Text(text = "Price: ${product.price}")
        Text(text = "Color: ${product.color}")


        Button(onClick = {
            // Simulate purchase process (Replace with actual purchase logic)
            buyProduct(product, navController, productRepository)
        }) {
            Text(text = "Purchase")
        }

//        Button(onClick = {
//            productRepository.deleteProduct(product.id)
//        }) {
//            Text(text = "Delete")
//        }
//        Button(onClick = {
//            navController.navigate(ROUTE_UPDATE_PRODUCT + "/${product.id}")
//        }) {
//            Text(text = "Update")
//        }
    }
}

// Function to simulate the purchase process
// Function to handle the purchase process
fun buyProduct(product: Product, navController: NavController, productRepository: ProductViewModel) {
    // Deduct the product from inventory
    productRepository.deductProductFromInventory(product.id)

    // Delete the product from the database
    productRepository.deleteProduct(product.id)

    // Navigate to the purchase confirmation screen
    navController.navigate(ROUTE_PAYMENT_METHODS)
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PurchaseProductsScreenPreview(){

    PurchaseProductsScreen(rememberNavController())}



