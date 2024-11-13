package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    WhatsAppApi(
                        modifier = Modifier
                            .padding(innerPadding)
                            .background(color = colorResource(R.color.whatsapp_background))
                    )
                }
            }
        }
    }
}

@Composable
fun WhatsAppApi(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(5.dp)
            .fillMaxHeight()

    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.whatsapp),
                contentDescription = "WasaLogo",
                modifier = Modifier
                    .size(43.dp)
                    .padding(end = 8.dp)
            )
            Text(
                text = "WhatsApp",
                fontSize = 33.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.weight(1f))
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "BuscarLogo",
                modifier = Modifier
                    .size(39.dp)
                    .padding(start = 8.dp)
            )
            Icon(
                imageVector = Icons.Default.MoreVert,
                contentDescription = "MoreLogo",
                modifier = Modifier
                    .size(39.dp)
                    .padding(start = 8.dp)
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        ) {
            Icon(
                imageVector = Icons.Default.AccountCircle,
                contentDescription = "ContactoLogo",
                modifier = Modifier
                    .size(35.dp)
                    .padding(end = 8.dp)
            )
            Text(text = stringResource(R.string.contacto1))
            Spacer(modifier = Modifier.weight(1f))
            Image(
                painter = painterResource(R.drawable.chincheta),
                contentDescription = "FijadoIcon",
                modifier = Modifier
                    .size(27.dp)
                    .padding(end = 8.dp)
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        ) {
            Icon(
                imageVector = Icons.Default.AccountCircle,
                contentDescription = "ContactoLogo",
                modifier = Modifier
                    .size(35.dp)
                    .padding(end = 8.dp)
            )
            Text(text = stringResource(R.string.contacto2))
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        ) {
            Icon(
                imageVector = Icons.Default.AccountCircle,
                contentDescription = "ContactoLogo",
                modifier = Modifier
                    .size(35.dp)
                    .padding(end = 8.dp)
            )
            Text(text = stringResource(R.string.contacto3))
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        ) {
            Icon(
                imageVector = Icons.Default.AccountCircle,
                contentDescription = "ContactoLogo",
                modifier = Modifier
                    .size(35.dp)
                    .padding(end = 8.dp)
            )
            Text(text = stringResource(R.string.contacto4))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    MyApplicationTheme {
        WhatsAppApi()
    }
}