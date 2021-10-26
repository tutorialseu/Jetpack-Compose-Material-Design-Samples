package eu.tutorials.composematerialdesignsamples.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Mail
import androidx.compose.material.icons.outlined.VideoCall
import androidx.compose.ui.graphics.vector.ImageVector

//Todo 4: create a sealed class for the menu items
sealed class BottomMenuData(val icon: ImageVector, val title: String) {
    //Todo 5: create object for each item
    object Mail : BottomMenuData( icon = Icons.Outlined.Mail,"Mail")
    object Meet : BottomMenuData(icon = Icons.Outlined.VideoCall, "Meet")
}
