package eu.tutorials.composematerialdesignsamples.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Mail
import androidx.compose.material.icons.outlined.VideoCall
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomMenuData(val route: String, val icon:ImageVector, val title: String) {
    object Mail : BottomMenuData("mail", icon = Icons.Outlined.Mail,"Mail")
    object Meet : BottomMenuData("meet",icon = Icons.Outlined.VideoCall, "Meet")
}
