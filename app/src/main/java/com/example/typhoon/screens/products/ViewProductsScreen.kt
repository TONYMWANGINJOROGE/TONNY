package com.example.typhoon.screens.products


import android.content.Context
import android.graphics.Bitmap
import android.net.Uri
import android.provider.MediaStore
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.typhoon.data.ProductViewModel
import com.example.typhoon.models.Product
import com.example.typhoon.navigate.ROUTE_UPDATE_PRODUCT


@Composable
fun ViewProductsScreen (navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        val context = LocalContext.current
        val productRepository = ProductViewModel(navController, context)
        val emptyProductState = remember { mutableStateOf(Product("", "", "", "","")) }
        val emptyProductsListState = remember { mutableStateListOf<Product>() }

        val products = productRepository.viewProducts(emptyProductState, emptyProductsListState)



        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "All products",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Red
            )

            Spacer(modifier = Modifier.height(20.dp))

            // val products = productViewModel.viewProducts()
            LazyColumn(){
                items(emptyProductsListState){
                    ProductItems(
                        name = it.name,
                        quantity = it.quantity,
                        price = it.price,
                        id = it.id,
                        color=it.color,
                        navController = navController,
                        productRepository = productRepository
                    )
                }
            }
        }
    }

}

@Composable
fun ProductItems(name:String,quantity:String,price:String,id:String,color:String, navController: NavController, productRepository: ProductViewModel) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = name)
        Text(text = quantity)
        Text(text = price)
        Text(text=color)

//        let { uri ->
//            val bitmap = loadBitmapFromUri(uri, LocalContext.current)
//            Image(bitmap = bitmap.asImageBitmap(), contentDescription = "Product image")
//        }

        Button(onClick = {
            productRepository.deleteProduct(id)
        }) {
            Text(text = "Delete")
        }
        Button(onClick = {
            navController.navigate(ROUTE_UPDATE_PRODUCT+"/${id}")
        }) {
            Text(text = "Update")
        }
    }
}

//fun loadBitmapFromUri(uri: Any, context: Context): Bitmap {
//    return MediaStore.Images.Media.getBitmap(context.contentResolver, uri as Uri?)
//}

@Preview
@Composable
fun View() {
    ViewProductsScreen(rememberNavController())

}








