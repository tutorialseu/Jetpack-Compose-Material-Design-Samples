package eu.tutorials.composematerialdesignsamples.components

import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.window.Dialog

//Todo 2: create a new file Accounts Dialog and create a compose function
//Todo 8: create an openDialog variable and set value to false in onDisMissRequest
@Composable
fun AccountsDialog(openDialog:MutableState<Boolean>) {
    Dialog(onDismissRequest = {openDialog.value = false}) {
        Card(backgroundColor = Color.White) {
            Text(text = "Account")
        }
    }
}