package com.example.cw7;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.ClipData;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {



    ArrayList<Items> dishes   = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TextView Name , Price;
        // ImageView DImage;

        Items D1 = new Items("Miso Soup", R.drawable.misosoup, 1.440);
        Items D2 = new Items("Shrimp Siomai", R.drawable.shrimpsiomai, 3.375);
        Items D5 = new Items("Nasu Miso", R.drawable.nasumiso, 3.300);
        Items D3 = new Items("Yasai Tempura", R.drawable.yasaitempura, 3.300);
        Items D4 = new Items("Yaki Saba",R.drawable.yakisaba , 4.500);
        Items D6 = new Items("Kimchi",R.drawable.kimchi , 1.800);

        dishes.add(D1);
        dishes.add(D2);
        dishes.add(D3);
        dishes.add(D4);
        dishes.add(D5);
        dishes.add(D6);

        ItemAdapter ItemAdapter = new ItemAdapter(this, 0, dishes);


        ListView ListView = findViewById(R.id.LV);
        ListView.setAdapter(ItemAdapter);

            // cw8


                ListView.setOnItemClickListener (new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                        Items currentItem = dishes.get(i);

                        Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                        intent.putExtra("Items",currentItem);

                        startActivity(intent);

                    }
                });


    }

    // SNACKBAR
    ConstraintLayout rootlayout;
    Button button;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_main);

        rootlayout = findViewById(R.id.rootlayout);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar snackbar = Snackbar.make(rootlayout,"this is a snackbar", Snackbar.LENGTH_LONG);
                snackbar.setAction("ok", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Toast.makeText(MainActivity.this, "clicked.",Toast.LENGTH_SHORT)
                                .show();

                    }
                });

                snackbar.setActionTextColor(getResources().getColor(R.color.white));
                snackbar.setTextColor(getResources().getColor(R.color.white));
                snackbar.setBackgroundTint(getResources().getColor(R.color.purple_200));
                snackbar.show();



            }
        });


    }

}
