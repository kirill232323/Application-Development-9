package com.example.recyclerviewcolors;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ColorViewHolder extends RecyclerView.ViewHolder {
    Context context;
    TextView tv;
    public ColorViewHolder(@NonNull View itemView) {
        super(itemView);
        context = itemView.getContext();
        tv = itemView.findViewById(R.id.color);
    }

    void bindTo(String color) {
        Resources resources = context.getResources();
        String package_name = context.getPackageName();
        int id = resources.getIdentifier(color, "color", package_name);
        if (id > 0)
            tv.setBackgroundColor(resources.getColor(id));
        tv.setText("color name: " + color);
    }
}