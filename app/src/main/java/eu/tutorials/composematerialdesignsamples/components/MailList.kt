package eu.tutorials.composematerialdesignsamples.components

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.StarOutline
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import eu.tutorials.composematerialdesignsamples.mailList
import eu.tutorials.composematerialdesignsamples.model.MailData

//Todo 3: create a new file and a compose function
//Todo 15: create a padding value variable and pass into Box as a padding
@Composable
fun MailList(paddingValues: PaddingValues) {
    /**Todo 13 Add a Box and a lazy column, call its items
     *   that accepts a list and pass in the mailList we created
     *   Call MailItem and pass in the data the items emits
     */

    Box(modifier = Modifier.padding(paddingValues)) {
        //Todo 14 add a modifier with fillMaxSize and padding of 16dp
     LazyColumn(modifier = Modifier
         .fillMaxSize()
         .padding(16.dp)){
     items(mailList){ mailData->
       MailItem(mailData = mailData)
     }
     }
    }
}

//Todo 4: create MailItem function with arguments maildata and modifier
@Composable
fun MailItem(mailData: MailData, modifier: Modifier = Modifier
) {
    //Todo 5 add a row to contain a card, with two columns
    //Todo 11:add a modifier to Row with fillmaxWidth and padding bottom
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(bottom = 8.dp)
    ) {
        //Todo 10:add a modifier to the card with a padding,size and circle shape, also add a background color
        Card(modifier = modifier
            .padding(end = 8.dp)
            .size(40.dp)
            .clip(CircleShape),
            backgroundColor = Color.Gray){
            //Todo 6 add a Text element and pass in the first character from the username
            Text(text = mailData.userName[0].toString(),
                textAlign = TextAlign.Center,modifier = modifier.padding(8.dp))
        }

        Column(modifier.weight(2.0f)) {
            //Todo 7 add 3 Text element for username, subject, and body
            Text(
                text = mailData.userName,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = mailData.subject,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = mailData.body,
                fontSize = 14.sp
            )
        }
        Column{
            //Todo 8: Add a Text for time stamp and IconButton for the star
            Text(text = mailData.timeStamp)
            IconButton(
                onClick = {},
                modifier = Modifier
                    .size(50.dp)
                    .padding(top = 16.dp)

            ){
                Icon(imageVector = Icons.Outlined.StarOutline,"") }

        }
    }
}

//Todo 9:create a preview function, call mailItem and pass a sample mail data
@Preview(showBackground = true)
@Composable
fun MailItemPreview() {
    MailItem(
        mailData = MailData(
            mailId = 4,
            userName = "Angelo",
            subject = "Email regarding job opportunity",
            body = "This is regarding a job opportunity for the profile or android developer in our organisation.",
            timeStamp = "21:10"
        )
    )
}