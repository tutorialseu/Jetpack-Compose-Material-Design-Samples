package eu.tutorials.composematerialdesignsamples

import androidx.compose.ui.graphics.vector.ImageVector

//Todo 5: create the menu data class with icon and title
//Todo 11:add boolean types for divider and headers
data class MenuDataItem(
    val icon:ImageVector? = null,val title:String? = null,
    val isDivider:Boolean=false, val isHeader:Boolean = false,
    var isSelected:Boolean=false
)
