package eu.tutorials.composematerialdesignsamples

import androidx.compose.ui.graphics.vector.ImageVector

//Todo 5: create the menu data class with icon and title
data class MenuDataItem(
    val icon:ImageVector? = null,val title:String? = null
)
