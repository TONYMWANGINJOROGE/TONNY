package com.example.typhoon.navigate

//import AddProductsScreen
import BuyerScreen
import HomeScreen
import LoginScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.typhoon.models.PayScreen
//import com.example.typhoon.screens.BuyerScreen
//import com.example.typhoon.screens.products.ViewProductsScreen
//import com.example.typhoon.screens.products.ViewProductsScreen
import com.example.typhoon.screens.ContactScreen
//import com.example.typhoon.screens.PersonScreen
import com.example.typhoon.screens.SellerScreen
import com.example.typhoon.screens.about.AboutScreen
//import com.example.typhoon.screens.products.ViewUploadsScreen
//import com.example.typhoon.screens.about.AboutScreen
import com.example.typhoon.screens.products.AddProductsScreen
import com.example.typhoon.screens.products.MPesaAuthenticationScreen
import com.example.typhoon.screens.products.PaymentMethodScreen
import com.example.typhoon.screens.products.PurchaseConfirmationScreen
//import com.example.typhoon.screens.products.BuyerScreen
import com.example.typhoon.screens.products.PurchaseProductsScreen
import com.example.typhoon.screens.products.UpdateProductsScreen
import com.example.typhoon.screens.products.ViewUploadsScreen
//import com.example.typhoon.screens.products.ViewPurchasesScreen
//import com.example.typhoon.screens.products.ViewProductsScreen
import com.example.typhoon.screens.register.RegisterScreen

//import com.example.typhoon.screens.products.UpdateProductsScreen
//import com.example.typhoon.screens.products.ViewProductsScreen

@Composable
fun AppNavHost(modifier: Modifier=Modifier,
               navController:
               NavHostController = rememberNavController(),
               startDestination: String = ROUTE_REGISTER
) {
    NavHost(
        navController = navController,
        modifier = Modifier,
        startDestination = startDestination
    ) {
        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }

        composable(ROUTE_ABOUT) {
            AboutScreen(navController)


        }


        composable(ROUTE_LOGIN) {
            LoginScreen(navController)


        }

        composable(ROUTE_CONTACT) {
            ContactScreen(navController)


        }

//        composable(ROUTE_PERSON) {
//            PersonScreen(navController)
//
//
//        }
        composable(ROUTE_REGISTER) {
            RegisterScreen(navController)


        }




            composable(ROUTE_ADD_PRODUCT) {
            AddProductsScreen(navController)


        }


        composable(ROUTE_UPDATE_PRODUCT +"/{id}") {passedData ->
            UpdateProductsScreen(navController ,passedData.arguments?.getString("id")!!)


        }

        composable(ROUTE_VIEW_PRODUCT) {
            com.example.typhoon.screens.products.ViewProductsScreen(navController)


        }

        composable(ROUTE_BUYER) {
            BuyerScreen(navController)


        }

        composable(ROUTE_SELLER) {
            SellerScreen(navController)


        }




        composable(ROUTE_VIEW_UPLOAD) {
            ViewUploadsScreen(navController)


        }


        composable(ROUTE_PURCHASE_CONFIRMATION) {
            PurchaseConfirmationScreen(navController)


        }



//
//        composable(ROUTE_VIEW_PURCHASES) {
//            ViewPurchasesScreen(navController)
//
//
//        }
//        composable(ROUTE_UPLOAD_PRODUCT) {
//            ViewUploadProductScreen(navController)
//
//
//        }
//
        composable(ROUTE_PURCHASE_PRODUCT) {
            PurchaseProductsScreen(navController)


        }
        composable(ROUTE_PAYMENT_METHODS) {
            PaymentMethodScreen(navController)


        }

        composable(ROUTE_PAY) {
            PayScreen(navController)


        }




        composable(ROUTE_MPESA_AUTHENTICATION) {passedData ->
            MPesaAuthenticationScreen(navController ,passedData.arguments?.getString("id")!!)


        }


//        composable(ROUTE_DELETE_PRODUCT) {
//            ViewDeleteProductScreen(navController)
//
//
//        }

//









    }
}

fun ViewProductsScreen(navController: NavHostController) {

}

