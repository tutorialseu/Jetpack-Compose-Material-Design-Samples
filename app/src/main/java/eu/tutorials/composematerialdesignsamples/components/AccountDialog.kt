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
import androidx.compose.material.icons.filled.PersonAddAlt
import androidx.compose.material.icons.outlined.ManageAccounts
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import eu.tutorials.composematerialdesignsamples.R
import eu.tutorials.composematerialdesignsamples.accountList
import eu.tutorials.composematerialdesignsamples.mailList
import eu.tutorials.composematerialdesignsamples.model.Account

@Composable
fun AccountDialog(openDialog:MutableState<Boolean>) {
    Dialog(onDismissRequest = { openDialog.value = false }, properties = DialogProperties(dismissOnClickOutside = false)) {
        Card(
            shape = RoundedCornerShape(8.dp), modifier = Modifier
                .fillMaxWidth()
        ) {
            Column(
                modifier = Modifier
                    .background(Color.White)
                    .padding(bottom = 16.dp, top = 16.dp)
            ) {
                Row(modifier = Modifier.fillMaxWidth()) {
                    IconButton(onClick = { openDialog.value = false }) {
                        Icon(
                            imageVector = Icons.Default.Close,
                            contentDescription = "",
                            modifier = Modifier.padding(bottom = 16.dp)
                        )
                    }
                    Image(
                        painter = painterResource(id = R.drawable.google), contentDescription = "",
                        modifier = Modifier
                            .size(30.dp)
                            .weight(2.0f)
                    )

                }
                AccountItem(account = accountList[0])

                Row(
                    modifier = Modifier.fillMaxWidth(), horizontalArrangement =
                    Arrangement.SpaceEvenly
                ) {
                    Card(
                        modifier = Modifier.requiredWidth(150.dp),
                        shape = RoundedCornerShape(50.dp),
                        border = BorderStroke(1.dp, color = Color.Gray)
                    ) {
                        Text(
                            text = "Google Account",
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(8.dp)
                        )
                    }

                    Spacer(modifier = Modifier.width(10.dp))
                }
                Divider(modifier = Modifier.padding(top = 16.dp))

                Column {
                    AccountItem(accountList[1])
                    AccountItem(accountList[2])
                }
                AddAccount(icon = Icons.Default.PersonAddAlt, title = "Add Another Account")
                AddAccount(
                    icon = Icons.Outlined.ManageAccounts,
                    title = "Manage Accounts On This Device"
                )
                Divider(modifier = Modifier.padding(top = 16.dp, bottom = 16.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(text = "Privacy Policy")
                    Card(
                        modifier = Modifier
                            .padding(top = 12.dp)
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
}
    @Composable
    fun AccountItem(account: Account) {
        Row(modifier = Modifier.fillMaxWidth().padding(start = 16.dp,top = 16.dp)) {
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

            Text(text = "${account.ureadMails}+", modifier = Modifier.padding(end = 16.dp))
        }
    }

@Composable
fun AddAccount(icon:ImageVector, title:String) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(start = 16.dp)) {
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                imageVector = icon,
                contentDescription = "",
                modifier = Modifier.padding(bottom = 8.dp)
            )
        }
        Text(text = title,fontWeight = FontWeight.SemiBold,modifier = Modifier.padding(top = 8.dp,start = 8.dp))
    }
}