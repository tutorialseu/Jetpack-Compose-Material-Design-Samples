package eu.tutorials.composematerialdesignsamples.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import eu.tutorials.composematerialdesignsamples.GmailApp
import eu.tutorials.composematerialdesignsamples.R
import eu.tutorials.composematerialdesignsamples.ui.theme.ComposeMaterialDesignSamplesTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun HomeAppBar(scaffoldState:ScaffoldState,scope: CoroutineScope,openDialog: MutableState<Boolean>) {
Box(modifier = Modifier.padding(10.dp)) {
    Card(modifier = Modifier.requiredHeight(50.dp),
        shape = RoundedCornerShape(10.dp),elevation = 6.dp) {

        Row( verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)) {

            IconButton(onClick = {
                scope.launch{
                    scaffoldState.drawerState.open()
                }
            }) {
                Icon(Icons.Default.Menu, "Menu")
            }
            Text(
                text = "Search in mail",
                modifier = Modifier.weight(2.0f)
            )
            Image(
                painter = painterResource(id = R.drawable.tutorials),
                contentDescription = "Profile",
            modifier = Modifier
                .size(30.dp)
                .clip(CircleShape)
                .background(color = Color.Gray)
                .clickable {
                    openDialog.value = true
                })
            if (openDialog.value){
                AccountsDialog(openDialog)
            }
        }
    }
}
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeMaterialDesignSamplesTheme {
        GmailApp()
    }
}