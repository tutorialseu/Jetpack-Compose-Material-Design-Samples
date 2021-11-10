package eu.tutorials.composematerialdesignsamples.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import eu.tutorials.composematerialdesignsamples.DrawerMenuData


//Todo 7: create a new file and create a compose function with a column composable
//Todo 17: create a scroll state variable
@Composable
fun GmailDrawerMenu(dp: Dp = 8.dp,scrollState: ScrollState) {
    //Todo 13 create a list of the menu items
    //Todo 23: update list to contain divider and header
    val menuList = listOf(
        DrawerMenuData.Divider,
        DrawerMenuData.AllInboxes,
        DrawerMenuData.Divider,
        DrawerMenuData.Primary,
        DrawerMenuData.Social,
        DrawerMenuData.Promotions,
        DrawerMenuData.HeaderOne,
        DrawerMenuData.Starred,
        DrawerMenuData.Snoozed,
        DrawerMenuData.Important,
        DrawerMenuData.Sent,
        DrawerMenuData.Schedule,
        DrawerMenuData.Outbox,
        DrawerMenuData.Draft,
        DrawerMenuData.AllMail,
        DrawerMenuData.HeaderTwo,
        DrawerMenuData.Calendar,
        DrawerMenuData.Contacts,
        DrawerMenuData.Divider,
        DrawerMenuData.Setting,
        DrawerMenuData.Help
    )
//Todo 18: add a verticalScroll and pass the scroll state to it
        Column(Modifier.verticalScroll(scrollState)){
        //Todo 8: Add a Text element for the Gmail title
        Text(
            text = "Gmail", color = Color.Red,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 20.dp, top = 20.dp))
        //Todo 15: we loop though the list and add each item to the menu
        menuList.forEach{ item->
            //Todo 24 check for what each it is and display the correct composable
            when{
                item.isDivider ->{
                    Divider(modifier = Modifier.padding(bottom = dp, top = dp))
                }
                item.isHeader ->{
                    Text(text = item.title!!, fontWeight= FontWeight.Light,
                        modifier = Modifier.padding(start = 20.dp,bottom = dp,
                            top=dp))

                }
                else ->{

                    MailDrawerItem(item = item)
                }
            }
        }
    }
}

//Todo 14: create a ui template for each item
@Composable
fun MailDrawerItem(item: DrawerMenuData) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .padding(top = 16.dp)
    ) {
        //Todo 16: add weight to each item
        Image(
            imageVector = item.icon!!,
            contentDescription =item.title!!,
            modifier = Modifier.weight(0.5f)
        )
        Text(text = item.title,modifier = Modifier.weight(2.0f))
    }

}