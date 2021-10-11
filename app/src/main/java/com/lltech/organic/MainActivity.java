package com.lltech.organic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    CardView mycard ;
    Intent i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14 ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mycard = (CardView) findViewById(R.id.alkane);
        i1 = new Intent(this,act_alkane.class);

        mycard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i1);
            }
        });

        mycard = (CardView) findViewById(R.id.alkene);
        i2 = new Intent(this,act_alkene.class);

        mycard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i2);
            }
        });

        mycard = (CardView) findViewById(R.id.alkyne);
        i3 = new Intent(this,act_alkyne.class);

        mycard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i3);
            }
        });

        mycard = (CardView) findViewById(R.id.benzene);
        i4 = new Intent(this,act_benzene.class);

        mycard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i4);
            }
        });

        mycard = (CardView) findViewById(R.id.anilene);
        i5 = new Intent(this,act_anilene.class);

        mycard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i5);
            }
        });


        mycard = (CardView) findViewById(R.id.phenol);
        i6 = new Intent(this,act_phenol.class);

        mycard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i6);
            }
        });

        mycard = (CardView) findViewById(R.id.alhelide);
        i7 = new Intent(this,act_alhelide.class);

        mycard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i7);
            }
        });

        mycard = (CardView) findViewById(R.id.alcohol);
        i8 = new Intent(this,act_alcohol.class);

        mycard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i8);
            }
        });
        mycard = (CardView) findViewById(R.id.aldehid);
        i9 = new Intent(this,act_aldehid.class);

        mycard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i9);
            }
        });

        mycard = (CardView) findViewById(R.id.carboxilic);
        i10 = new Intent(this,act_carboxilic.class);

        mycard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i10);
            }
        });


        mycard = (CardView) findViewById(R.id.acidclo);
        i11 = new Intent(this,act_acidcloride.class);

        mycard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i11);
            }
        });

        mycard = (CardView) findViewById(R.id.amine);
        i12 = new Intent(this,act_amine.class);

        mycard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i12);
            }
        });


        mycard = (CardView) findViewById(R.id.amide);
        i13 = new Intent(this,act_amide.class);

        mycard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i13);
            }
        });

        mycard = (CardView) findViewById(R.id.keton);
        i14 = new Intent(this,act_keton.class);

        mycard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i14);
            }
        });









    }





}