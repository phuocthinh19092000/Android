package com.midterm.finalexamorderfood.ViewHolder;

import android.app.Application;
import android.content.Intent;
import android.net.wifi.hotspot2.pps.HomeSp;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.midterm.finalexamorderfood.FoodList;
import com.midterm.finalexamorderfood.Home;
import com.midterm.finalexamorderfood.Interface.ItemClickListener;
import com.midterm.finalexamorderfood.Model.Categories;
import com.midterm.finalexamorderfood.Model.Food;
import com.midterm.finalexamorderfood.R;
import com.squareup.picasso.Picasso;

public class  MyAdapter extends FirebaseRecyclerAdapter<Categories, MenuViewHolder> {
    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public MyAdapter(@NonNull FirebaseRecyclerOptions<Categories> options) {
        super(options);
    }



    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_item, parent,false);
        return new MenuViewHolder(view);
    }

    @Override
    protected void onBindViewHolder(@NonNull MenuViewHolder holder, int position, @NonNull Categories model) {
        holder.txtMenuName.setText(model.getName());
        Picasso.get().load(model.getImage()).into(holder.imageView);
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {



            }

        });

    }
}
