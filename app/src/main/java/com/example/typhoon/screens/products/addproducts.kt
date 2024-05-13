package com.example.typhoon.screens.products


import android.content.Context
import android.net.Uri
import android.provider.MediaStore
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
//import androidx.benchmark.perfetto.Row
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.typhoon.data.ProductViewModel
import com.example.typhoon.navigate.ROUTE_VIEW_UPLOAD
import com.example.typhoon.navigate.ROUTE_VIEW_PRODUCT

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddProductsScreen(navController: NavHostController) {

    val scrollState = rememberScrollState()

    Column(modifier = Modifier
        .verticalScroll(state=scrollState)
        .background(color=Color.Red)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        val context = LocalContext.current


        var productName by remember { mutableStateOf(TextFieldValue("")) }
        var productQuantity by remember { mutableStateOf(TextFieldValue("")) }
        var productPrice by remember { mutableStateOf(TextFieldValue("")) }
        var productColor by remember{ mutableStateOf(TextFieldValue(""))}

    Text(
        text = "Add Your Product",
        fontSize = 30.sp,
        fontFamily = FontFamily.Default,
        color = Color.Gray,
        modifier = Modifier.padding(20.dp),
        fontWeight = FontWeight.Bold,
//        textDecoration = TextDecoration.Underline
    )




        Spacer(modifier = Modifier.height(1.dp))

        OutlinedTextField(
            value = productName,
            onValueChange = { productName = it },
            label = { Text(text = "Product name *") },
           keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        Spacer(modifier = Modifier.height(5.dp))

        OutlinedTextField(
            value = productQuantity,
            onValueChange = { productQuantity = it },
            label = { Text(text = "Product quantity *") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        Spacer(modifier = Modifier.height(5.dp))

        OutlinedTextField(
            value = productPrice,
            onValueChange = { productPrice = it },
           label = { Text(text = "Product price *") },
           keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        Spacer(modifier = Modifier.height(5.dp))

        OutlinedTextField(
            value = productColor,
            onValueChange = { productColor = it },
            label = { Text(text = "Product Color *") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        Spacer(modifier = Modifier.height(5.dp))

        Button(onClick = {

            val productRepository = ProductViewModel(navController,context)
            productRepository.saveProduct(productName.text.trim(),productQuantity.text.trim(),
                productPrice.text, productColor.text)
            navController.navigate(ROUTE_VIEW_PRODUCT)


        }) {
            Text(text = "Save")
        }
        Spacer(modifier = Modifier.height(5.dp))

        //---------------------IMAGE PICKER START-----------------------------------//

        ImagePicker(Modifier,context, navController, productName.text.trim(), productQuantity.text.trim(), productPrice.text.trim(),productColor.text.trim())


    }
}
@Composable
fun ImagePicker(
    modifier: Modifier = Modifier,
    context: Context,
    navController: NavHostController,
    name: String,
    quantity: String,
    price: String,
    color: String
) {
    var hasImage by remember { mutableStateOf(false) }
    var imageUri by remember { mutableStateOf<Uri?>(null) }

    val imagePicker = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent(),
        onResult = { uri ->
            hasImage = uri != null
            imageUri = uri
        }
    )

    Column(modifier = modifier) {
        if (hasImage && imageUri != null) {
            val bitmap = MediaStore.Images.Media.getBitmap(context.contentResolver, imageUri)
            Image(bitmap = bitmap.asImageBitmap(), contentDescription = "Selected image")
        }
        Row(
            modifier = Modifier.fillMaxWidth().padding(bottom = 32.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = {
                    imagePicker.launch("image/*")
                }
            ) {
                Text(
                    text = "Select Image"
                )
            }

            Button(
                onClick = {
                    //-----------WRITE THE UPLOAD LOGIC HERE---------------//
                    val productRepository = ProductViewModel(navController, context)
                    productRepository.saveProductWithImage(name, quantity, price, color, imageUri!!)
                    navController.navigate(ROUTE_VIEW_UPLOAD)
                }
            ) {
                Text(text = "Upload")
            }

            Button(
                onClick = {
                    //-----------WRITE THE UPLOAD LOGIC HERE---------------//
                    navController.navigate(ROUTE_VIEW_UPLOAD)
                }
            ) {
                Text(text = "View Uploads")
            }
        }
    }
}

@Preview
@Composable
fun AddProductsScreenPreview() {
    AddProductsScreen(rememberNavController())

}

