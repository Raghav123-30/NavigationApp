package com.example.navigationapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.navigationapp.ui.theme.NavigationAppTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            NavigationAppTheme {
                // A surface container using the 'background' color from the theme
                val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
                val scope = rememberCoroutineScope()
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {

                    ModalNavigationDrawer(
                        drawerState = drawerState,
                        drawerContent = { ModalDrawerSheet {

                        } }) {
                        Scaffold(

                            topBar = {
                                CenterAlignedTopAppBar(
                                   navigationIcon = {
                                       IconButton(onClick = { scope.launch {
                                           drawerState.open()
                                       } }) {
                                           Icon(imageVector = Icons.Default.Menu, contentDescription ="navigation icon" )
                                       }
                                   },
                                    title = { Text(text = "Navigation app") },

                                    )
                            }

                        )


                        {paddingValues ->




                        }
                    }

                }
            }
        }
    }
}

