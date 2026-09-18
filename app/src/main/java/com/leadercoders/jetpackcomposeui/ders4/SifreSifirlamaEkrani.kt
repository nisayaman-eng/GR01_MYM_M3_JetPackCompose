package com.leadercoders.jetpackcomposeui.ders4

import androidx.compose.animation.animateBounds
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.saveable.rememberSerializable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SifreSifirlamaEkrani() {
    var eposta by rememberSaveable() { mutableStateOf("") }
    var kayitBasariliMi by rememberSaveable() { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .padding(24.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(text = "Şifremi Unuttum", fontSize = 28.sp, fontWeight = FontWeight.Bold, color = Color(0xFF333333))

        Spacer(modifier = Modifier.padding(6.dp))

        Text(text = "Kayıtlı e-posta adresinizi girin. Size bir sıfırlama bağlantısı göndereceğiz.", color = Color.Gray, modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Justify) //modifier = Modifier.padding( bottom = 32.dp)) //bottom la padding verince textte boşluk olur.

        Spacer(modifier = Modifier.height(32.dp))

        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = eposta,
            onValueChange = { eposta = it },
            label = { Text("E-Posta Adresi") },
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Done
            )
        )

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = {
                if (eposta.isNotEmpty()) kayitBasariliMi = true
            },
            modifier = Modifier.fillMaxWidth()
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF59E0B)),
            shape = RoundedCornerShape(8.dp)
        ) {
            Text(text = "Bağlantı Gönder", fontWeight = FontWeight.Bold)
        }

        if (kayitBasariliMi){
            Spacer(modifier = Modifier.height(24.dp))
            Text(text = "Şifre sıfırlama bağlantısı gönderildi", fontWeight = FontWeight.Bold, color = Color(0xFF388E3C))
        }





    }




}