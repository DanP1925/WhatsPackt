package com.danp1925.whatspack.ui.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.ui.NavDisplay
import com.danp1925.conversations.ui.ConversationsListScreen
import com.danp1925.framework.navigation.NavRoutes

@Composable
fun WhatsPacktNavigation() {

    val backStack = remember { mutableStateListOf<Any>(NavRoutes.ConversationsList) }

    NavDisplay(
        backStack = backStack,
        entryProvider = { key ->
            when (key) {
                is NavRoutes.ConversationsList -> NavEntry(key) {
                    ConversationsListScreen()
                }

                else -> NavEntry(Unit) { Text("Missing Route") }
            }
        }
    )
}