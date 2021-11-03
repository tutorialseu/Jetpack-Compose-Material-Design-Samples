package eu.tutorials.composematerialdesignsamples.components

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.PersonAddAlt
import androidx.compose.material.icons.outlined.ManageAccounts
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import eu.tutorials.composematerialdesignsamples.R
import eu.tutorials.composematerialdesignsamples.accountList
import eu.tutorials.composematerialdesignsamples.model.Account

//Todo 14: Add dialog propety and set dismissOnCLickOutside to false
@Composable
fun AccountsDialog(openDialog: MutableState<Boolean>) {
    Dialog(onDismissRequest = { openDialog.value = false },properties = DialogProperties(dismissOnClickOutside = false)) {
        //Todo 13: add value for open dialog
        AccountsDialogUI(openDialog = openDialog)
    }
}

//Todo 10 create a boolean variable for the dialog state
@Composable
fun AccountsDialogUI(modifier: Modifier = Modifier,openDialog:MutableState<Boolean>) {
    Card {
        Column(
            modifier
                .background(Color.White)
                .padding(bottom = 16.dp)
        ) {

            Row(
                modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                //Todo 11 set openDialogue to false when close button is clicked
                IconButton(onClick = {openDialog.value = false }) {
                    Icon(
                        imageVector = Icons.Default.Close,
                        contentDescription = "Close"
                    )
                }

                Image(
                    painter = painterResource(id = R.drawable.google), contentDescription = "Google",
                    modifier
                        .size(30.dp)
                        .weight(2.0f)
                )

            }
            //Todo 4: Replace the account info Row with a reusable function
         AccountItem(account = accountList[0])

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
            Spacer(modifier.width(10.dp))
            }
           Divider(modifier.padding(top = 16.dp))
            //Todo 5: Add a Column and call the reusable function to show two accounts
            Column {
                AccountItem(accountList[1])
                AccountItem(accountList[2])
            }
            //Todo 7: set the AddAccount function and pass in the icon and text
            AddAccount(icon = Icons.Default.PersonAddAlt, title = "Add Another Account")
            AddAccount(
                icon = Icons.Outlined.ManageAccounts,
                title = "Manage Accounts On This Device"
            )
            //Todo 8: Add a line using a Divider
            Divider(modifier = Modifier.padding(top = 16.dp, bottom = 16.dp))
            //Todo 9: Add a Row with two Text and a Card that creates a Dot
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(text = "Privacy Policy")
                Card(
                    modifier = Modifier
                        .padding(top = 10.dp)
                        .size(3.dp),
                    shape = CircleShape,
                    backgroundColor = Color.Black
                ) {

                }
                Text(text = "Terms Of Service")
            }
        }
    }

}


/**Todo 3: create a reusable function AccountItem to show account info
 * If the account contains an icon set Image element with the icon and if not
 * set a Card and a Text within it to show the First character of the user name
 * We also add the Column to show the username and email
 * a Text at the end of the Row to show unread mails
 */
@Composable
fun AccountItem(account: Account) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(start = 16.dp, top = 16.dp)) {
        if (account.icon != null) {
            Image(
                painter = painterResource(id = account.icon),
                contentDescription = "Profile",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .background(color = Color.Gray)
            )
        }else{
            Card(modifier = Modifier
                .padding(end = 8.dp)
                .size(40.dp)
                .clip(CircleShape),
                backgroundColor = Color.Gray){

                Text(text = account.userName[0].toString(),
                    textAlign = TextAlign.Center,modifier = Modifier.padding(8.dp))
            }
        }
        Column(
            modifier = Modifier
                .weight(2.0f)
                .padding(start = 16.dp, bottom = 16.dp)
        ) {
            Text(text = account.userName,fontWeight = FontWeight.SemiBold)
            Text(text = account.email)
        }

        Text(text = "${account.unReadMails}+", modifier = Modifier.padding(end = 16.dp))
    }
    }

/**Todo 6: create a reusable function for account manage options
 * With a Row to show the IconButton and Text side by side horizontally
 */
@Composable
fun AddAccount(icon: ImageVector, title:String) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(start = 16.dp)) {
        IconButton(onClick = {  }) {
            Icon(
                imageVector = icon,
                contentDescription = "",
                modifier = Modifier.padding(bottom = 8.dp)
            )
        }
        Text(text = title,fontWeight = FontWeight.SemiBold,modifier = Modifier.padding(top = 8.dp,start = 8.dp))
    }
}

//Todo 12: add value for open dialog and suppress the error for remember
@SuppressLint("UnrememberedMutableState")
@Preview
@Composable
fun AccountsDialogUiPreview() {
    AccountsDialogUI(openDialog = mutableStateOf(false))
}