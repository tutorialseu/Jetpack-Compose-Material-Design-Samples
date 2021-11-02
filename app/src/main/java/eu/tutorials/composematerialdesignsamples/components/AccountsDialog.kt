package eu.tutorials.composematerialdesignsamples.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import eu.tutorials.composematerialdesignsamples.R

//Todo 2: create a new file Accounts Dialog and create a compose function
//Todo 8: create an openDialog variable and set value to false in onDisMissRequest
@Composable
fun AccountsDialog(openDialog: MutableState<Boolean>) {
    Dialog(onDismissRequest = { openDialog.value = false }) {
        AccountsDialogUI()
    }
}

/**Todo 10 create a compose Function for the Dialog UI
 * Add a Card and a Column with background set to white
 * Add a Row with an Icon Button and Image
 * The image has a weight of 2.0 to fill the remaining width and a size of 30dp
 *
 */
//Todo 14 create a modifier variable to use for other properties
@Composable
fun AccountsDialogUI(modifier: Modifier = Modifier) {
    Card {
        Column(
            modifier
                .background(Color.White)
                .padding(bottom = 16.dp)
        ) {
            //Todo 13 Add vertical alignment and center the contents vertically on the screen
            Row(
                modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = { }) {
                    Icon(
                        imageVector = Icons.Default.Close,
                        contentDescription = ""
                    )
                }
                //Todo 12: add a weight of 2.0 to make the Image fill the available space
                Image(
                    painter = painterResource(id = R.drawable.google), contentDescription = "",
                    modifier
                        .size(30.dp)
                        .weight(2.0f)
                )

            }
//Todo 15: Add a Row for the current account info with fillMaxWidth and padding top and start of 16dp
            Row(modifier
                .fillMaxWidth()
                .padding(start = 16.dp, top = 16.dp)) {
                //Todo 16:Add an Image with a size of 40dp, a clip with circle shape and background Gray color
                Image(
                    painter = painterResource(id = R.drawable.tutorials),
                    contentDescription = "Profile",
                    modifier
                        .size(40.dp)
                        .clip(CircleShape)
                        .background(color = Color.Gray)
                )
                //Todo 17: Add a Column with weight 2.0 to fill the larger part of the parent with padding start and bottom 16dp
                Column(
                    modifier
                        .weight(2.0f)
                        .padding(start = 16.dp, bottom = 16.dp)
                ) {
                    //Todo 18: Add 2 Text to show the Username and email
                    Text(text = "Tutorials Eu", fontWeight = FontWeight.SemiBold)
                    Text(text = "tutorials@eu.com")
                }
                //Todo 19: Add a Text to show email count with a padding end of 16dp
                Text(text = "99+", modifier = Modifier.padding(end = 16.dp))
            }
            /**Todo 20: Add a Row to fill max width and
             * A Card with 150dp width, rounded corner shape and Border stroke of 1dp with gray color
             * Now we add the Text to show the Google Account, add 8dp padding and align text to center
             */
            Row(
                modifier.fillMaxWidth(), horizontalArrangement =
                Arrangement.SpaceEvenly
            ) {
                Card(
                    modifier.requiredWidth(150.dp),
                    shape = RoundedCornerShape(50.dp),
                    border = BorderStroke(1.dp, color = Color.Gray)
                ) {
                    Text(
                        text = "Google Account",
                        modifier.padding(8.dp),
                        textAlign = TextAlign.Center
                    )
                }
//Todo 21: Add a Spacer to help the Card stay at the required position
                Spacer(modifier.width(10.dp))
            }
            //Todo 22: Add a line using the Divider element with a padding top of 16dp
            Divider(modifier.padding(top = 16.dp))
        }
    }

}




//Todo 11 : Add a preview function for the dialog ui
@Preview
@Composable
fun AccountsDialogUiPreview() {
    AccountsDialogUI()
}