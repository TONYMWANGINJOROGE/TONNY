//import android.content.Context
//import android.widget.GridView
//import android.widget.Toast
//import androidx.compose.foundation.ExperimentalFoundationApi
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.ColumnScope
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.width
//import androidx.compose.foundation.lazy.grid.GridCells
//import androidx.compose.foundation.lazy.grid.LazyGridScope
//import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
//import androidx.compose.material3.Card
//import androidx.compose.material3.Text
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Surface
//import androidx.compose.material3.TopAppBar
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.font.FontFamily
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.Dp
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.example.typhoon.R
//import com.example.typhoon.models.GridModal
//import com.example.typhoon.ui.theme.greenColor
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun CategoryScreen(){
//
//    Surface(
//        modifier = Modifier.fillMaxSize(),
//        color = Color.Blue
//    ) {
//        // on below line we are specifying theme as scaffold.
//        Scaffold(
//            // in scaffold we are specifying top bar.
//            topBar = {
//                // inside top bar we are specifying background color.
//                TopAppBar(modifier =Modifier.background(Color.Green),
//                    // along with that we are specifying title for our top bar.
//                    title = {
//                        // in the top bar we are specifying tile as a text
//                        TextComponent(
//                            value = "<-MENU",
//                            size = 20.sp,
//                            colorValue = Color.White,
//                            fontFamilyValue = FontFamily.Monospace,
//                            textAlignValue = TextAlign.Left)
//
//                    }
//                )
//
//            }
//
//    }
////        ) {
////            // on below line we are calling grid
////            // view method to load our grid view.
////            GridView(LocalContext.current)
////        }
////    }
//}
//
//
//
//// on below line we are creating grid view function for loading our grid view.
//@OptIn(ExperimentalFoundationApi::class, )
////@Composable
////fun GridView(context: Context) {
////    // on below line we are creating and initializing our array list
////    lateinit var courseList: List<GridModal>
////    courseList = ArrayList<GridModal>()
////
////    // on below line we are adding data to our list.
////    courseList = courseList + GridModal("rings", R.drawable.rings)
////    courseList = courseList + GridModal("necklace", R.drawable.necklace)
////    courseList = courseList + GridModal("bracelet", R.drawable.bracelet)
////    courseList = courseList + GridModal("set", R.drawable.set)
////    courseList = courseList + GridModal("watch", R.drawable.watch)
////
////
////    // on below line we are adding lazy
////    // vertical grid for creating a grid view.
////    LazyVerticalGrid(
////        // on below line we are setting the
////        // column count for our grid view.
////        cells = GridCells.Fixed(2),
////        // on below line we are adding padding
////        // from all sides to our grid view.
////        modifier = Modifier.padding(10.dp)
////    ) {
////        // on below line we are displaying our
////        // items upto the size of the list.
////        items(courseList.size) {
////            // on below line we are creating a
////            // card for each item of our grid view.
////            Card(
////                // inside our grid view on below line we are
////                // adding on click for each item of our grid view.
////                onClick = {
////                    // inside on click we are displaying the toast message.
////                    Toast.makeText(
////                        context,
////                        courseList[it].producttypeName + " selected..",
////                        Toast.LENGTH_SHORT
////                    ).show()
////                },
////
////                // on below line we are adding padding from our all sides.
////                modifier = Modifier.padding(8.dp),
////
////                // on below line we are adding elevation for the card.
////                elevation = 6.dp
////            ) {
////                // on below line we are creating a column on below sides.
////                Column(
////                    // on below line we are adding padding
////                    // padding for our column and filling the max size.
////                    Modifier
////                        .fillMaxSize()
////                        .padding(5.dp),
////
////                    // on below line we are adding
////                    // horizontal alignment for our column
////                    horizontalAlignment = Alignment.CenterHorizontally,
////
////                    // on below line we are adding
////                    // vertical arrangement for our column
////                    verticalArrangement = Arrangement.Center
////                ) {
////                    // on below line we are creating image for our grid view item.
////                    Image(
////                        // on below line we are specifying the drawable image for our image.
////                        painter = painterResource(id = courseList[it].producttypeImg),
////
////                        // on below line we are specifying
////                        // content description for our image
////                        contentDescription = "Javascript",
////
////                        // on below line we are setting height
////                        // and width for our image.
////                        modifier = Modifier
////                            .height(60.dp)
////                            .width(60.dp)
////                            .padding(5.dp)
////                    )
////
////                    // on the below line we are adding a spacer.
////                    Spacer(modifier = Modifier.height(9.dp))
////
////                    // on below line we are creating
////                    // a text for our grid view item
////                    Text(
////                        // inside the text on below line we are
////                        // setting text as the language name
////                        // from our modal class.
////                        text = courseList[it].producttypeName,
////
////                        // on below line we are adding padding
////                        // for our text from all sides.
////                        modifier = Modifier.padding(4.dp),
////
////                        // on below line we are
////                        // adding color for our text
////                        color = Color.Black
////
////
////                    )
////                }
////
////
////                }
////            }
////        }
////    }
////
////fun Card(onClick: () -> Unit, modifier: Modifier, elevation: Dp, content: @Composable() (ColumnScope.() -> Unit)) {
////    TODO("Not yet implemented")
////}
////
////fun Text(text: String, modifier: Modifier, color: Color) {
////    TODO("Not yet implemented")
////}
////
////
////fun LazyVerticalGrid(
////    cells: GridCells.Fixed,
////    modifier: Modifier,
////    content: LazyGridScope.() -> Unit
////) {
////    TODO("Not yet implemented")
////}
////
//@Preview(showSystemUi = true, showBackground = true)
//@Composable
//fun CategoryScreenPreview(){
//    CategoryScreen()
//}
////
////
