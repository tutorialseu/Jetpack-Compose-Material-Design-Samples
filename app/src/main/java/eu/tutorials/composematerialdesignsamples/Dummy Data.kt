package eu.tutorials.composematerialdesignsamples

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
//Todo 6: create the option lists
val menuList = listOf<MenuDataItem>(
    MenuDataItem(
        icon = Icons.Outlined.AllInbox,
        title = "All inboxes"
    ),
    MenuDataItem(
        icon = Icons.Outlined.Inbox,
        title = "Primary"
    ),
    MenuDataItem(
        icon = Icons.Outlined.Person,
        title = "Social"
    ),
    MenuDataItem(
        icon = Icons.Outlined.Tag,
        title = "Promotions",
    ),
    MenuDataItem(
        icon = Icons.Outlined.StarOutline,
        title = "Starred"
    ),
    MenuDataItem(
        icon = Icons.Outlined.Snooze,
        title = "Snoozed"
    ),
    MenuDataItem(
        icon = Icons.Outlined.Label,
        title = "Important"
    ),
    MenuDataItem(
        icon = Icons.Outlined.Send,
        title = "Sent"
    ),
    MenuDataItem(
        icon = Icons.Outlined.Schedule,
        title = "Scheduled"
    ),
    MenuDataItem(
        icon = Icons.Outlined.Outbox,
        title = "Outbox"
    ),
    MenuDataItem(
        icon = Icons.Outlined.Drafts,
        title = "Drafts"
    ),
    MenuDataItem(
        icon = Icons.Outlined.Mail,
        title = "All Mail"
    ),
    MenuDataItem(
        icon = Icons.Outlined.CalendarToday,
        title = "Calendar"
    ),

    MenuDataItem(
        icon = Icons.Outlined.Contacts,
        title = "Contacts"
    ),
    MenuDataItem(
        icon = Icons.Outlined.Settings,
        title = "Settings"
    ),
    MenuDataItem(
        icon = Icons.Outlined.Help,
        title = "Help & FeedBack"
    )
    )