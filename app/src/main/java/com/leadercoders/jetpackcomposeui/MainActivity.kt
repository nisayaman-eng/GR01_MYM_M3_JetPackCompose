package com.leadercoders.jetpackcomposeui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.leadercoders.jetpackcomposeui.ders1.SelamlamaEkrani
import com.leadercoders.jetpackcomposeui.ders2.D322_TemelDizilimler
import com.leadercoders.jetpackcomposeui.ders2.D326_ProfilKarti
import com.leadercoders.jetpackcomposeui.ders2.UrunDetayKarti
import com.leadercoders.jetpackcomposeui.ders3.D332_TextBileseni
import com.leadercoders.jetpackcomposeui.ders3.D333_ButonCesitleri
import com.leadercoders.jetpackcomposeui.ders4.BizeUlasinFormu
import com.leadercoders.jetpackcomposeui.ders4.D344_KullanicidanVeriAlma
import com.leadercoders.jetpackcomposeui.ders4.D345_GirisYapEkrani
import com.leadercoders.jetpackcomposeui.ders4.KullaniciKayitEkrani
import com.leadercoders.jetpackcomposeui.ders4.SifreSifirlamaEkrani
import com.leadercoders.jetpackcomposeui.ders6.D362_ResimEkleme
import com.leadercoders.jetpackcomposeui.ders6.D363_IconEkleme
import com.leadercoders.jetpackcomposeui.ders6.D364_KardEkleme
import com.leadercoders.jetpackcomposeui.ders6.MusteriDeneyimiYonetimi
import com.leadercoders.jetpackcomposeui.ui.theme.GR01_MYM_M3_JetpackComposeUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GR01_MYM_M3_JetpackComposeUITheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)) {
                        // O anki dersin ana ekranını buraya yazacağız.

                        //DERS-1
                        //SelamlamaEkrani()
      //                  DERS-2
              //          D322_TemelDizilimler()
                        //D326_ProfilKarti()
                        //UrunDetayKarti()

     //                   Ders - 3
                        //D332_TextBileseni()
                        //D333_ButonCesitleri()

                        //DERS - 4
                        //D344_KullanicidanVeriAlma()
                        //D345_GirisYapEkrani()
                        //BizeUlasinFormu()

                        //PROJE
                        //KullaniciKayitEkrani()
                        //SifreSifirlamaEkrani()

                        //DERS - 6
                        //D362_ResimEkleme()
                        //D363_IconEkleme()
                        //D364_KardEkleme()
                        MusteriDeneyimiYonetimi()


                    }
                }
            }
        }
    }
}




