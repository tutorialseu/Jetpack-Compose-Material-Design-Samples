package eu.tutorials.composematerialdesignsamples.components

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import eu.tutorials.composematerialdesignsamples.R
import eu.tutorials.composematerialdesignsamples.model.BottomMenuData

//Todo 2: create a new file and a composable and call bottom navigation
@Composable
fun HomeBottomMenu() {
    //Todo 6: create a list of the item
    val items = listOf(
        BottomMenuData.Mail,
        BottomMenuData.Meet
    )
    BottomNavigation(backgroundColor = colorResource(id = R.color.white),contentColor = colorResource(id = R.color.black))
    {
        //Todo 7: Loop through the list and add each item to the BottomNavigation item
        items.forEach {
            BottomNavigationItem(
                label = { Text(text = it.title)},
                alwaysShowLabel = true,
                selected = false,
                onClick = {  },
                icon ={ Icon(
                    imageVector = it.icon,
                    contentDescription = it.title)
                },
            )

        }

    }
}