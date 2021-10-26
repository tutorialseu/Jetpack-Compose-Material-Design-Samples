package eu.tutorials.composematerialdesignsamples.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.AlertDialog
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import eu.tutorials.composematerialdesignsamples.R

@Composable
fun AccountsDialog(openDialog:MutableState<Boolean>) {
AlertDialog(onDismissRequest = { openDialog.value = false},title = {
               Row(modifier = Modifier.fillMaxWidth()) {
                   IconButton(onClick = { /*TODO*/ }) {
                       Icon(imageVector = Icons.Default.Close, contentDescription = "Close")
                   }
                   
                   Image(painter = painterResource(id = R.drawable.google), contentDescription ="Google" ,
                   modifier = Modifier.weight(2.0f))
               }                            
},buttons = {})
}