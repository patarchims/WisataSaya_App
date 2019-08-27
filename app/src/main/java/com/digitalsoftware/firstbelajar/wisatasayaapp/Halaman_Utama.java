package com.digitalsoftware.firstbelajar.wisatasayaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Halaman_Utama extends AppCompatActivity {

    ImageView image_profile;
    LinearLayout vihara_info,
            taman_hewan_info,
            taman_bunga_info,
            waterpark_info,
            manigom_info,
            berastagi_info,
            bahmanik_info,
            danautoba_info,
            sibolga_info,
            bis_info, air_terjun_info;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman__utama);


        image_profile = findViewById(R.id.image_profile);
        vihara_info = findViewById(R.id.vihara_info);
        taman_hewan_info = findViewById(R.id.taman_hewan_info);
        taman_bunga_info = findViewById(R.id.taman_bunga_info);
 waterpark_info = findViewById(R.id.waterpark_info);
        manigom_info = findViewById(R.id.manigom_info);
        berastagi_info = findViewById(R.id.berastagi_info);
        bahmanik_info = findViewById(R.id.bahmanik_info);
        danautoba_info = findViewById(R.id.danautoba_info);
        sibolga_info = findViewById(R.id.sibolga_info);
        bis_info = findViewById(R.id.bis_info);
        air_terjun_info = findViewById(R.id.air_terjun_info);


        image_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoprofile = new Intent(Halaman_Utama.this,About.class);
                startActivity(gotoprofile);
            }
        });
        vihara_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotodetail = new Intent(Halaman_Utama.this,Detail_Wisata.class);
                gotodetail.putExtra("nama_wisata", "Vihara Avalokitesvara");
                startActivity(gotodetail);
            }
        });

        taman_hewan_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotodetail = new Intent(Halaman_Utama.this,Detail_Wisata.class);
                gotodetail.putExtra("nama_wisata", "Taman Hewan");
                startActivity(gotodetail);
            }
        });

        taman_bunga_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotodetail = new Intent(Halaman_Utama.this,Detail_Wisata.class);
                gotodetail.putExtra("nama_wisata", "Taman Bunga");
                startActivity(gotodetail);
            }
        });

  waterpark_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotodetail = new Intent(Halaman_Utama.this,Detail_Wisata.class);
                gotodetail.putExtra("nama_wisata", "Waterpark Siantar");
                startActivity(gotodetail);
            }
        });

        manigom_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotodetail = new Intent(Halaman_Utama.this,Detail_Wisata.class);
                gotodetail.putExtra("nama_wisata", "Manigom");
                startActivity(gotodetail);
            }
        });
        bahmanik_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotodetail = new Intent(Halaman_Utama.this,Detail_Wisata.class);
                gotodetail.putExtra("nama_wisata", "Bah Manik");
                startActivity(gotodetail);
            }
        });

        danautoba_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotodetail = new Intent(Halaman_Utama.this,Detail_Wisata.class);
                gotodetail.putExtra("nama_wisata", "Danau Toba");
                startActivity(gotodetail);
            }
        });

        sibolga_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotodetail = new Intent(Halaman_Utama.this,Detail_Wisata.class);
                gotodetail.putExtra("nama_wisata", "Sibolga");
                startActivity(gotodetail);
            }
        });
        bis_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotodetail = new Intent(Halaman_Utama.this,Detail_Wisata.class);
                gotodetail.putExtra("nama_wisata", "BIS");
                startActivity(gotodetail);
            }
        });

        berastagi_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotodetail = new Intent(Halaman_Utama.this,Detail_Wisata.class);
                gotodetail.putExtra("nama_wisata", "Berastagi");
                startActivity(gotodetail);
            }
        });

        air_terjun_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotodetail = new Intent(Halaman_Utama.this,Detail_Wisata.class);
                gotodetail.putExtra("nama_wisata", "Air Terjun Sipiso-piso");
                startActivity(gotodetail);
            }
        });

    }
}
