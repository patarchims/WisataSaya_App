package com.digitalsoftware.firstbelajar.wisatasayaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;


public class Detail_Wisata extends AppCompatActivity {
    DatabaseReference reference;
    TextView nama_wisata, alamat_wisata, deskripsi_wisata;
    ImageView back_to_menu, img_box, image_01, image_02, image_03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail__wisata);

        back_to_menu = findViewById(R.id.back_to_menu);
        img_box = findViewById(R.id.img_box);
        image_01 = findViewById(R.id.image_01);
        image_02 = findViewById(R.id.image_02);
        image_03 = findViewById(R.id.image_03);

        nama_wisata = findViewById(R.id.nama_wisata);
        deskripsi_wisata = findViewById(R.id.deskripsi_wisata);
        alamat_wisata = findViewById(R.id.alamat_wisata);

        // mengambil data dari intent
        Bundle bundle = getIntent().getExtras();
        final String nama_wisata_baru = bundle.getString("nama_wisata");

        // mengambil data dari firebase
        reference = FirebaseDatabase.getInstance().getReference().child("Wisata").child(nama_wisata_baru);
        reference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                nama_wisata.setText(dataSnapshot.child("name").getValue().toString());
                deskripsi_wisata.setText(dataSnapshot.child("deskripsi").getValue().toString());
                alamat_wisata.setText(dataSnapshot.child("address").getValue().toString());
                Picasso.with(Detail_Wisata.this)
                        .load(dataSnapshot.child("img")
                                .getValue().toString()).centerCrop().fit()
                        .into(img_box);
                Picasso.with(Detail_Wisata.this)
                        .load(dataSnapshot.child("img01")
                                .getValue().toString()).centerCrop().fit()
                        .into(image_01);
                Picasso.with(Detail_Wisata.this)
                        .load(dataSnapshot.child("img02")
                                .getValue().toString()).centerCrop().fit()
                        .into(image_02);
                Picasso.with(Detail_Wisata.this)
                        .load(dataSnapshot.child("img03")
                                .getValue().toString()).centerCrop().fit()
                        .into(image_03);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });




        back_to_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotomenu = new Intent(Detail_Wisata.this,Halaman_Utama.class);
                startActivity(gotomenu);
            }
        });

    }
}
