package com.leadercoders.jetpackcomposeui.ders8

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class Yazi2(val baslik: String, val icerik: String, val yazar: String)

val yaziListesi = listOf(
    Yazi2(
        "Jetpack Compose Harika",
        "Modern Android arayüz geliştirme aracı olan Jetpack Compose ile daha az kod yazarak daha çok iş yapabilirsiniz.",
        "Ahmet Y."
    ),
    Yazi2(
        "LazyColumn ile Performans",
        "Binlerce veriyi ekranda donmadan göstermek için LazyColumn tam size göre. Yalnızca ekrandaki öğeleri çizer.",
        "Zeynep K."
    ),
    Yazi2(
        "Kotlin'in Gücü",
        "Kotlin dilinin sağladığı null güvenliği ve extension fonksiyonları ile kod yazmak çok daha keyifli.",
        "Mehmet A."
    ),
    Yazi2(
        "Tasarım Sistemleri",
        "Uygulamanızın tutarlı görünmesi için renk, tipografi ve şekillerden oluşan bir tasarım sistemi kurmalısınız.",
        "Ayşe D."
    ),
    Yazi2(
        "Mobil Uygulama Mimarisi",
        "MVVM mimarisi ve State akışları ile uygulamanızın veri katmanını ve arayüz katmanını mükemmel şekilde ayırabilirsiniz.",
        "Ali Ç."
    )
)

@Composable
fun KartListesi() {
    Column(
        modifier = Modifier
            .background(Color(0xFFF1F3F5))
            .fillMaxSize()
            .padding(24.dp)
    ) {
        Text(
            text = "Son yazılar",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1F2937),
            modifier = Modifier.padding(16.dp)
        )

        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            contentPadding = PaddingValues(16.dp)
        ) {

            items(yaziListesi) { yazi ->
                //metot adı gelecek
                YaziKarti(yazi)

            }


        }


    }
}


@Composable
fun YaziKarti(veri: Yazi2) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        shape = RoundedCornerShape(16.dp)
    ) {

        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = veri.baslik,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF111527)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                veri.icerik, fontSize = 15.sp, color = Color(0xFF485563),
                lineHeight = 22.sp
            )

            Spacer(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    "Yazar: ${veri.yazar}",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFF9CA3AF)
                )

                Row() {
                    IconButton(onClick = {}, modifier = Modifier.size(36.dp)) {
                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Favori",
                            tint = Color(0xFFEF4444)
                        )

                    }


                    IconButton(onClick = {}, modifier = Modifier.size(36.dp)) {
                        Icon(
                            imageVector = Icons.Default.Share,
                            contentDescription = "Paylaş",
                            tint = Color(0xFF6B7280)
                        )
                    }


                }

            }


        }


    }
}