package com.example.tuto3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    public void method1() {
        Message m2 = new Message(1, "safae", "cv ?", new Date());
        Message m3 = new Message(1, "zouhir", "oui", new Date());
        Message[] mesDonnees = {
                new Message(1, "zouhir", "salut", new Date()),
                m2,
                m3
        };

        //String messages[] = { "mwef", "wjefoiew"};
        //int[] valeus = {2, 4, 12};
        ArrayAdapter<Message> adapter = new ArrayAdapter<>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                mesDonnees
        );
        GridView messageListView = findViewById(R.id.messages);
        messageListView.setAdapter(adapter);
    }
    void method2() {
        Message m2 = new Message(1, "safae", "cv ?", new Date());
        Message m3 = new Message(1, "zouhir", "oui", new Date());

        ArrayList<Message> mesDonnees = new ArrayList<>();
        mesDonnees.add(new Message(1, "zouhir", "salut", new Date()));
        mesDonnees.add(m2);
        mesDonnees.add(m3);
        mesDonnees.add(new Message(1, "zouhir", "salut", new Date()));

        ArrayAdapter<Message> adapter = new ArrayAdapter<>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                mesDonnees
        );
        GridView messageListView = findViewById(R.id.messages);
        messageListView.setAdapter(adapter);
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Message m2 = new Message(R.drawable.logo1, "safae", "cv ?", new Date());
        Message m3 = new Message(R.drawable.logo2, "zouhir", "oui", new Date());

        ArrayList<Message> mesDonnees = new ArrayList<>();
        mesDonnees.add(new Message(R.drawable.logo3, "zouhir", "salut", new Date()));
        mesDonnees.add(m2);
        mesDonnees.add(m3);

        MessageAdapter adapter = new MessageAdapter(
                getApplicationContext(),
                mesDonnees
        );
        GridView listView = findViewById(R.id.messages);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((AdapterView<?> adapterView, View view, int p, long l) -> {
            Message mes = (Message) adapterView.getAdapter().getItem(p);
            //Toast.makeText(this, mes.getText(), 100).show();
            Intent it = new Intent(this, DetailMessage.class);
            it.putExtra("msg", mes);
            startActivity(it);
        });
        /*
        messageListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            }
        });
        */
    }

}