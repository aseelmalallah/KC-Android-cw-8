package com.example.cw7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.BitSet;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //cw8


        Bundle b = getIntent().getExtras();

        Items deliverItem = (Items) b.getSerializable("Items");

        TextView TV = findViewById(R.id.textView2);
        ImageView IM = findViewById(R.id.imageView2);

        TV.setText(deliverItem.getIteName());
        IM.setImageResource(deliverItem.getItemImage());




    }
}