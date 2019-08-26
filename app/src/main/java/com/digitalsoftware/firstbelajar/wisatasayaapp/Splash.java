package com.digitalsoftware.firstbelajar.wisatasayaapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;

public class Splash extends AppCompatActivity {

    Animation app_splash, btt;
    ImageView img_wisata, img_logo;
    TextView informasi;

    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // load animation
        app_splash = AnimationUtils.loadAnimation(this, R.anim.app_splash);
        btt = AnimationUtils.loadAnimation(this, R.anim.btt);

        //load element
        img_logo = findViewById(R.id.img_logo);
        img_wisata = findViewById(R.id.img_wisata);
        informasi = findViewById(R.id.informasi);

        // run animation
        img_logo.startAnimation(app_splash);
        img_wisata.startAnimation(app_splash);
        informasi.startAnimation(btt);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                // merubah activity ke activity lain
                Intent gogethome = new Intent(Splash.this,Halaman_Utama.class);
                startActivity(gogethome);
                finish();
            }
        }, 2000); // 2000 ms = 2s
        }

}
