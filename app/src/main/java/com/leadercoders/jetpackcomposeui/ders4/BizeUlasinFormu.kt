package com.leadercoders.jetpackcomposeui.ders4

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BizeUlasinFormu() {
    var ad by rememberSaveable() { mutableStateOf("") }
    var eposta by rememberSaveable() { mutableStateOf("") }
    var telefon by rememberSaveable() { mutableStateOf("") }
    var mesaj by rememberSaveable() { mutableStateOf("") }
    var mesajGonderildi by rememberSaveable() { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)

    ) {



        Text(
            text = "Bize Ulaşın",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF38793A
            )
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(//AD - KUTUSU
            modifier = Modifier.fillMaxWidth(),
            value = ad,
            onValueChange = { ad = it },
            label = { Text("Adınız") },
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Next
            )

        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(//E - POSTA KUTUSU
            modifier = Modifier.fillMaxWidth(),
            value = eposta,
            onValueChange = { eposta = it },
            label = { Text("E-posta Adresiniz") },
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Next
            )

        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(//TELEFON KUTUSU
            modifier = Modifier.fillMaxWidth(),
            value = telefon,
            onValueChange = { telefon = it },
            label = { Text("Telefon Numaranız") },
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Next
            )


        )

        Spacer(modifier = Modifier.height(16.dp))

        TextField(//MESAJ KUTUSU
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp),
            value = mesaj,
            onValueChange = { yeniMesaj -> mesaj = yeniMesaj },
            label = { Text("Mesajınız") },
            singleLine = false,
            placeholder = { Text("Mesajınızı giriniz...") },
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Done
            )

        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                if (ad.isNotEmpty() && eposta.isNotEmpty() && telefon.isNotEmpty() && mesaj.isNotEmpty()) {
                    mesajGonderildi = true
                }
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4BAF50))
        ) {
            Text(text = "Gönder", fontSize = 16.sp)
        }


        if (mesajGonderildi) {
            Spacer(modifier = Modifier.height(24.dp))
            Text(text = "Mesajınız başarıyla gönderildi!", color = Color(0xFF4BAF50), fontWeight = FontWeight.Bold)
        }


    }


}