package com.example.cw7;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.renderscript.Sampler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.List;

public class ItemAdapter extends ArrayAdapter {

    List<Items> ItemsList;

    public ItemAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);

        ItemsList = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);

        Items currentItem = ItemsList.get(position);

        TextView DN = view.findViewById(R.id.Name);
        TextView DP = view.findViewById(R.id.Price);
        ImageView DI = view.findViewById(R.id.DImage);

        //cw8

        ImageView deleteI = view.findViewById(R.id.Delete);

        deleteI.setOnClickListener(new View.OnClickListener() {

            Items RI = ItemsList.get(position);

            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext()).setMessage("Are you sure?")
                    .setTitle("Confirmation").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                ItemsList.remove(RI);
                                notifyDataSetChanged();

                            }
                        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {

                                        dialogInterface.dismiss();

                                    }
                                });

                builder.show();

                                //  ItemsList.remove(position);
                                //  notifyDataSetChanged();

            }
        });





            //cw7

        DN.setText(currentItem.getIteName());
        DP.setText(String.valueOf(currentItem.getItemPrice()));
        DI.setImageResource(currentItem.getItemImage());

           return view;





    }
}
