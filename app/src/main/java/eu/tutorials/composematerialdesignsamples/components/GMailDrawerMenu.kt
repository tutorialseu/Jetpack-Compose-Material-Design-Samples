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
import eu.tutorials.composematerialdesignsamples.MenuDataItem
import eu.tutorials.composematerialdesignsamples.menuList

//Todo 3: create a new file and create a compose function with a column composable
@Composable
fun GmailDrawerMenu(scrollState: ScrollState,dp: Dp = 20.dp) {
    //Todo 10 add a vertical scroll to the column
 Column(
     Modifier
         .verticalScroll(scrollState)) {
     //Todo 4: Add a Text element for the Gmail title
     Text(
         text = "Gmail", color = Color.Red,
         fontSize = 20.sp,
         fontWeight = FontWeight.Bold,
         modifier = Modifier.padding(start = dp, top = dp)
     )
     //Todo 9: call the menu list and loop through to add a template for each item
     menuList.forEach { item ->
         /** Todo 15:
          * We check the item and show divider or header when the value is true or
          * we show mail drawer item instead
           */
         when{
             item.isDivider ->{
                 Divider(modifier = Modifier.padding(bottom = dp, top = dp))
             }
             item.isHeader ->{
                 Text(text = item.title!!, fontWeight= FontWeight.Light,
                         modifier = Modifier.padding(start = dp,bottom = dp,
                         top=dp))

             }
             else ->{

                 MailDrawerItem(item = item)
             }
         }

     }
 }

}
//Todo 7: create a ui template  for each item on the list
@Composable
fun MailDrawerItem(item: MenuDataItem) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .padding(top = 16.dp)
    ) {
        //Todo 14: check that the items are not null before setting to the composable
        if (item.icon != null && item.title != null) {
            Image(
                imageVector = item.icon,
                contentDescription = item.title,
                modifier = Modifier.weight(0.5f)
            )

            Text(text = item.title, modifier = Modifier.weight(2.0f))
        }
    }

}