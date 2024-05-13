package com.example.typhoon.screens.about

import TextComponent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.typhoon.R

@Composable
fun AboutScreen(navController: NavController) {

        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(16.dp)
        ) {

            TextComponent(
                value = "ABOUT US",
                size = 20.sp,
                colorValue = Color.Red,
                fontFamilyValue = FontFamily.Default,
                textAlignValue = TextAlign.Center)
            Spacer(modifier = Modifier.height(5.dp))

            TextComponent(
                value = "Welcome to our men's jewelry emporium! At XYZ Men's Jewelry," +
                        " we specialize in crafting sophisticated and masculine pieces that elevate any look. " +
                        "With a passion for quality and style, our artisans meticulously create each design," +
                        " ensuring exceptional craftsmanship and attention to detail",
                size = 20.sp,
                colorValue = Color.Blue,
                fontFamilyValue = FontFamily.Serif,
                textAlignValue = TextAlign.Left)
            Spacer(modifier = Modifier.height(10.dp))


            TextComponent(
                value ="OUR HISTORY",
                size = 20.sp,
                colorValue = Color.Red,
                fontFamilyValue = FontFamily.Serif,
                textAlignValue = TextAlign.Left)
            Spacer(modifier = Modifier.height(10.dp))


            TextComponent(
                value ="Founded with a vision in 1995, XYZ Men's Jewelry began as a humble workshop in the heart of the city. Driven by a passion for craftsmanship and a commitment to excellence, our founder, John Smith, embarked on a journey to redefine men's fashion accessories. Over the years, our dedication to quality and innovation propelled us to become a renowned name in the industry. From our first collection of handcrafted rings to our expansive range of modern designs, each piece tells a story of tradition and contemporary elegance. Today, we continue to honor our heritage while pushing the boundaries of men's jewelry."



                ,
                size = 19.sp,
                colorValue = Color.Blue,
                fontFamilyValue = FontFamily.Serif,
                textAlignValue = TextAlign.Left)
            Spacer(modifier = Modifier.height(10.dp))









        }



        }


















@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AboutScreenPreview() {
    AboutScreen(rememberNavController())
}