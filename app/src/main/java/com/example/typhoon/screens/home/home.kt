import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.BoxScopeInstance.matchParentSize
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Divider
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.typhoon.R
import com.example.typhoon.navigate.ROUTE_ABOUT
import com.example.typhoon.navigate.ROUTE_BUYER
import com.example.typhoon.navigate.ROUTE_CONTACT
import com.example.typhoon.navigate.ROUTE_SELLER

//sealed class Screen(val route: String, val icon: ImageVector, val label: String) {
//    object Home : Screen("home", Icons.Filled.Home, "Home")
//    object About : Screen("about", Icons.Filled.Info, "About")
//    object Login : Screen("login", Icons.Filled.Lock, "Login")
//    object Register : Screen("register", Icons.Filled.AccountCircle, "Register")
//    object Settings : Screen("settings", Icons.Filled.Settings, "Settings")
//}
//
//@Composable
//fun AboutScreen() {
//    Column(
//        modifier = Modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Text(text = "About Screen")
//    }
//}
//
//@Composable
//fun LoginScreen() {
//    Column(
//        modifier = Modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Text(text = "Login Screen")
//    }
//}
//
//@Composable
//fun RegisterScreen() {
//    Column(
//        modifier = Modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Text(text = "Register Screen")
//    }
//}
//
//@Composable
//fun SettingsScreen() {
//    Column(
//        modifier = Modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Text(text = "Settings Screen")
//    }
//}
@Composable
fun HomeScreen(navController: NavController){

    Box(modifier = Modifier.fillMaxSize()) {



        Image(painter = painterResource(id =R.drawable.mensjewelrytrends), contentDescription ="Background Image" ,
            contentScale = ContentScale.FillBounds, modifier = Modifier.matchParentSize())

    }
    Column {

        TextComponent(
            value = "<-MENU",
            size = 20.sp,
            colorValue = Color.White,
            fontFamilyValue = FontFamily.Monospace,
            textAlignValue = TextAlign.Left)
        Spacer(modifier = Modifier.height(300.dp))
        TextComponent(
            value = "TONY'S COLLECTION",
            size = 40.sp,
            colorValue = Color.Blue,
            fontFamilyValue = FontFamily.Monospace,
            textAlignValue = TextAlign.Center)

        Spacer(modifier = Modifier.height(5.dp))

        TextComponent(
            value = "The House Of The Best Male Jewellery",
            size = 20.sp,
            colorValue = Color.White,
            fontFamilyValue = FontFamily.Cursive,
            textAlignValue = TextAlign.Center)









    }


    ModalNavigationDrawer(
        drawerContent = {
            ModalDrawerSheet {
                //Text("Drawer title", modifier = Modifier.padding(16.dp), color = Color.Black, textAlign = TextAlign.Center)
                Divider()
                NavigationDrawerItem(
                    label = { Text(text = "Buyer") },
                    selected = false,
                    onClick = {
                        navController.navigate(ROUTE_BUYER)
                    }
                )
                Divider()
                NavigationDrawerItem(
                    label = { Text(text = "Seller") },
                    selected = false,
                    onClick = {
                        navController.navigate(ROUTE_SELLER)
                    }
                )
                Divider()
                NavigationDrawerItem(
                    label = { Text(text = "About") },
                    selected = false,
                    onClick = {
                        navController.navigate(ROUTE_ABOUT)
                    }
                )
//                Divider()
//                NavigationDrawerItem(
//                    label = { Text(text = "LogIn") },
//                    selected = false,
//                    onClick = {
//                        navController.navigate(ROUTE_LOGIN)
//                    }
//                )
                Divider()

                NavigationDrawerItem(
                    label = { Text(text = "Contact") },
                    selected = false,
                    onClick = {
                        navController.navigate(
                            ROUTE_CONTACT)})
                Divider()


                // ...other drawer items
            }
        }
    ) {
        // Screen content
    }



}

fun Text(text: String, modifier: Any, textAlign: TextAlign, color: Color) {

}

@Composable
fun Text(s: String, modifier: Modifier, text: String) {

}


@Composable
fun TextComponent(value: String,
                  size: TextUnit,
                  colorValue: Color,
                  fontFamilyValue: FontFamily,
                  textAlignValue: TextAlign
) {
    Text(modifier = Modifier
        .wrapContentHeight()
        .background(color = Color.Transparent),

        text = value,
        fontSize = size,
        color = colorValue,
        fontFamily = FontFamily.Monospace,
        textAlign = TextAlign.Center
    )
}





@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    HomeScreen(rememberNavController())
}


