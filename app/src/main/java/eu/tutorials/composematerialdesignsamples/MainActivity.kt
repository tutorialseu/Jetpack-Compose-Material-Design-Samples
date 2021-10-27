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
import eu.tutorials.composematerialdesignsamples.components.*
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
        },
        //Todo 3: get the fab slot  and pass the GmailFab we created to it
        floatingActionButton = {
            //Todo 8: pass in the scrollstate value from the remember scroll state to GmailFab and MailList
            GmailFab(scrollState)
        }){
        MailList(it,scrollState)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeMaterialDesignSamplesTheme {
        GmailApp()
    }
}