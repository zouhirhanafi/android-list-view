package com.example.tuto3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MessageAdapter extends ArrayAdapter<Message> {
    public MessageAdapter(Context c, ArrayList<Message> d) {
        super(c , 0, d);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        //LayoutInflater inf = (LayoutInflater) getContext().
        //      getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        LayoutInflater inf = LayoutInflater.from(getContext());

        // créer une vue à partir du layout message_element
        View view = inf.inflate(R.layout.message_element, null);
        // récupérer le message en cours
        Message mes = getItem(position);

        // récupérer le textview nom à partir du layout
        TextView nom = view.findViewById(R.id.nom);
        // remplir le textview nom avec sa valeur
        nom.setText(mes.getNom());

        // récupérer le textview text à partir du layout
        TextView text = view.findViewById(R.id.text);
        // remplir le textview text avec sa valeur
        text.setText(mes.getText());

        // récupérer le textview date à partir du layout
        TextView date = view.findViewById(R.id.date);
        // remplir le textview text avec sa valeur
        date.setText(String.valueOf(mes.getDate().getHours()));

        ImageView image = view.findViewById(R.id.image);
        image.setImageResource(mes.getImage());
        return view;
    }
}
