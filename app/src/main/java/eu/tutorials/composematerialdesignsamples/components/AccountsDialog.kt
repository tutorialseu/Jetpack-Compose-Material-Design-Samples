package eu.tutorials.composematerialdesignsamples.components

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import eu.tutorials.composematerialdesignsamples.R

//Todo 2: create a new file Accounts Dialog and create a compose function
//Todo 8: create an openDialog variable and set value to false in onDisMissRequest
@Composable
fun AccountsDialog(openDialog:MutableState<Boolean>) {
    Dialog(onDismissRequest = {openDialog.value = false}) {
         AccountsDialogUI()
        }
}

/**Todo 10 create a compose Function for the Dialog UI
 * Add a Card and a Column with background set to white
 * Add a Row with an Icon Button and Image
 * The image has a weight of 2.0 to fill the remaining width and a size of 30dp
 *
 */
@Composable
fun AccountsDialogUI() {
    Card{
        Column(
            modifier = Modifier
                .background(Color.White)
        ) {
            Row(modifier = Modifier.fillMaxWidth(),verticalAlignment = Alignment.CenterVertically) {
                IconButton(onClick = { }) {
                    Icon(
                        imageVector = Icons.Default.Close,
                        contentDescription = ""
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.google), contentDescription = "",
                    modifier = Modifier
                        .size(30.dp)
                        .weight(2.0f)
                )

            }
        }
    }

}

//Todo 11 : Add a preview function for the dialog ui
@Preview
@Composable
fun AccountsDialogUiPreview() {
    AccountsDialogUI()
}