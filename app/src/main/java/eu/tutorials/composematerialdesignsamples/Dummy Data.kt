package eu.tutorials.composematerialdesignsamples

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
//Todo 6: create the option lists
//Todo 13: Update list to contain divider and header
val menuList = listOf<MenuDataItem>(
    MenuDataItem(
        isDivider = true
    ),
    MenuDataItem(
        icon = Icons.Outlined.AllInbox,
        title = "All inboxes"
    ),
    MenuDataItem(
        isDivider = true
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
        isHeader = true,
        title = "ALL LABELS"
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
        isHeader = true,
        title = "GOOGLE APPS"
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
        isDivider = true
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