package com.leadercoders.jetpackcomposeui.ders6

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.MicNone
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun D363_IconEkleme() {

    Column(modifier = Modifier.fillMaxSize().padding(24.dp)) {

        Icon(
            imageVector = Icons.Default.Favorite,
            contentDescription = "Beğen",
            tint = Color.Red,
            modifier = Modifier.size(30.dp)
        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Epostanızı yazın") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "Beğen",
                    tint = Color.Gray,
                )
            },
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Info,
                    contentDescription = "Beğen",
                    tint = Color.LightGray,
                )
            }

        )



    }

}