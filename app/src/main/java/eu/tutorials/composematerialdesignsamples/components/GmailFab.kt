package eu.tutorials.composematerialdesignsamples.components

import androidx.compose.foundation.ScrollState
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

//Todo 1 create a new file and create GmailFab compose function in it
//Todo 4: create a scroll state variable
@Composable
fun GmailFab(scrollState: ScrollState) {
    //Todo 5: check if the scroll is at the top and show the extended fab else show the normal fab
    if (scrollState.value > 100) {
        ExtendedFloatingActionButton(
            text = {
                Text(
                    text = "Compose",
                    fontSize = 16.sp
                )
            },
            onClick = {},
            icon = {
                Icon(imageVector = Icons.Default.Edit,"")
            },
            backgroundColor = MaterialTheme.colors.surface,
        )

    } else {
        //Todo 2: add a floating action button
        FloatingActionButton(
            onClick = {},
            backgroundColor = MaterialTheme.colors.surface,
        ) {
            Icon(imageVector = Icons.Default.Edit, "")
        }}

    }