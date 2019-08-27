package com.digitalsoftware.firstbelajar.wisatasayaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class About extends AppCompatActivity {
ImageView back_to;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        back_to = findViewById(R.id.back_to);

        back_to.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gogethome = new Intent(About.this,Halaman_Utama.class);
                startActivity(gogethome);
            }
        });
    }
}
