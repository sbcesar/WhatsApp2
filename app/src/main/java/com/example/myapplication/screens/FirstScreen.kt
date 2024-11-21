package com.example.myapplication.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.R
import com.example.myapplication.navigation.AppScreen

@Composable
fun FirstScreen(navController: NavController) {
    WhatsAppApi(navController)
}

@Composable
fun WhatsAppApi(navController: NavController, modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(bottom = 16.dp, top = 30.dp)
                .background(color = colorResource(R.color.whatsapp_contact))
        ) {
            Row(
                verticalAlignment = Alignment.Bottom,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp)
                    .height(45.dp)
            ) {
                Text(
                    modifier = Modifier
                        .padding(start = 8.dp),
                    text = "WhatsApp",
                    fontSize = 27.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White,
                )
                Spacer(modifier = Modifier.weight(1f))
                Icon(
                    imageVector = Icons.Default.Search,
                    tint = Color.White,
                    contentDescription = "BuscarLogo",
                    modifier = Modifier
                        .size(35.dp)
                        .padding(start = 8.dp, end = 8.dp)
                )
                Icon(
                    imageVector = Icons.Default.MoreVert,
                    tint = Color.White,
                    contentDescription = "MoreLogo",
                    modifier = Modifier
                        .size(35.dp)
                        .padding(start = 8.dp, end = 8.dp)
                )
            }

            LazyColumn {
                items(25) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(color = colorResource(R.color.whatsapp_contact))
                            .clickable { navController.navigate(route = AppScreen.SecondScreen.route) },
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(R.drawable.usuario),
                            contentDescription = "imagen_contacto",
                            modifier = Modifier
                                .size(50.dp)
                                .padding(end = 8.dp)
                        )
                        Text(
                            text = stringResource(R.string.contacto1),
                            color = Color.White,
                            fontSize = 20.sp
                        )
                        Spacer(modifier = Modifier.weight(1f))
                        Image(
                            painter = painterResource(R.drawable.chincheta),
                            contentDescription = "FijadoIcon",
                            modifier = Modifier
                                .size(27.dp)
                                .padding(end = 8.dp)
                        )
                    }
                }
            }
        }
    }

}