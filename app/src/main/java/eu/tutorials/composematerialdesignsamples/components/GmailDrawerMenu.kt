package eu.tutorials.composematerialdesignsamples.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


//Todo 7: create a new file and create a compose function with a column composable
@Composable
fun GmailDrawerMenu(dp: Dp = 20.dp) {
    Column {
        //Todo 8: Add a Text element for the Gmail title
        Text(
            text = "Gmail", color = Color.Red,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = dp, top = dp))
    }
}