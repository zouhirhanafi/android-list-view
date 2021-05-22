package com.example.tuto3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Date;

public class DetailMessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_message);

        // récupérer le message en cours
        Message mes = (Message) getIntent().getSerializableExtra("msg");

        // récupérer le textview nom à partir du layout
        TextView nom = findViewById(R.id.nom);
        // remplir le textview nom avec sa valeur
        nom.setText(mes.getNom());

        // récupérer le textview text à partir du layout
        TextView text = findViewById(R.id.text);
        // remplir le textview text avec sa valeur
        text.setText(mes.getText());

        // récupérer le textview date à partir du layout
        TextView date = findViewById(R.id.date);
        // remplir le textview text avec sa valeur
        date.setText(String.valueOf(mes.getDate().getHours()));

        ImageView image = findViewById(R.id.image);
        image.setImageResource(mes.getImage());
    }
}