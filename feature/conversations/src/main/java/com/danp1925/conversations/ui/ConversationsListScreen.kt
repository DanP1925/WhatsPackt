package com.danp1925.conversations.ui

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.danp1925.framework.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ConversationsListScreen(
    onConversationClick: (String) -> Unit
) {
    val tabs = generateTabs()
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(stringResource(R.string.conversations_list_title))
                },
                actions = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Rounded.Menu, contentDescription = "Menu")
                    }
                }
            )
        },
        bottomBar = {
            TabRow(selectedTabIndex = 1) {
                tabs.forEachIndexed { index, _ ->
                    Tab(
                        text = { Text(stringResource(tabs[index].title)) },
                        selected = index == 1,
                        onClick = {}
                    )
                }
            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { }
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add"
                )
            }
        }
    ) { innerPadding ->

    }
}

data class ConversationsListTab(
    @StringRes val title: Int
)

fun generateTabs(): List<ConversationsListTab> {
    return listOf(
        ConversationsListTab(
            title = R.string.conversations_tab_status_title
        ),
        ConversationsListTab(
            title = R.string.conversations_tab_chats_title
        ),
        ConversationsListTab(
            title = R.string.conversations_tab_calls_title
        ),
    )
}