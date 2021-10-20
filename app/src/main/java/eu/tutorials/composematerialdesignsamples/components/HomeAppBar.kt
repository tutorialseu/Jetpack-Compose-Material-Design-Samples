package eu.tutorials.composematerialdesignsamples.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
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

//Todo 4: create HomeAppBar composable and add a Box with Card element
@Composable
fun HomeAppBar() {
Box(modifier = Modifier.padding(10.dp)) {
    //Todo 5: add rounded corner with an elevation attribute
    Card(modifier = Modifier.requiredHeight(50.dp),
        shape = RoundedCornerShape(10.dp),elevation = 6.dp) {
        /**Todo 8: Add a row for the app bar content with a modifier to fill max size and an
         * and an alignment to center them vertically
         */
        Row( verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxSize().padding(8.dp)) {
            /**Todo 9: Add the contents of the row an IconButton, a Text
             * and an Image
             *
             */
            IconButton(onClick = {

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
            modifier = Modifier.size(30.dp).clip(CircleShape)
                .background(color = Color.Gray))
        }
    }
}
}

//Todo: 6 add a preview function
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeMaterialDesignSamplesTheme {
        GmailApp()
    }
}