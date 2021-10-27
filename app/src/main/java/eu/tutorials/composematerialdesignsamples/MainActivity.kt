package eu.tutorials.composematerialdesignsamples

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.tooling.preview.Preview
import eu.tutorials.composematerialdesignsamples.components.GmailDrawerMenu
import eu.tutorials.composematerialdesignsamples.components.HomeAppBar
import eu.tutorials.composematerialdesignsamples.components.HomeBottomMenu
import eu.tutorials.composematerialdesignsamples.components.MailList
import eu.tutorials.composematerialdesignsamples.ui.theme.ComposeMaterialDesignSamplesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeMaterialDesignSamplesTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    GmailApp()
                }
            }
        }
    }
}

@Composable
fun GmailApp() {
    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()
    val scrollState = rememberScrollState()
    Scaffold(scaffoldState = scaffoldState,
        topBar = {
        HomeAppBar(scaffoldState,coroutineScope)
    },
        drawerContent = {
            GmailDrawerMenu(scrollState = scrollState)
    },
        bottomBar = {
            HomeBottomMenu()
        }){
        /**Todo 1: add lazy column with items that accept count
         * Then pass in a Text and a Divider
         */
//        LazyColumn{
//            items(50){ index->
//             Text(text = "Index @ $index")
//                Divider()
//            }
//        }
//Todo 16: add the padding value the scaffold emits to the mailList
        MailList(it)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeMaterialDesignSamplesTheme {
        GmailApp()
    }
}