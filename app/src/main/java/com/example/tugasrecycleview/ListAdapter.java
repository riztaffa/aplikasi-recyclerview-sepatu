package com.example.tugasrecycleview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> {
    private ArrayList<Sepatu> listSepatu;

    public  ListAdapter (ArrayList<Sepatu> list){
        this.listSepatu= list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Sepatu sepatu = listSepatu.get(position);

        Glide.with(holder.itemView.getContext()).load(sepatu.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);

        holder.tvName.setText(sepatu.getName());
        holder.tvPrice.setText(sepatu.getPrice());
    }


    @Override
    public int getItemCount() {
        return listSepatu.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvName, tvPrice;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName =  itemView.findViewById(R.id.tv_item_name);
            tvPrice=  itemView.findViewById(R.id.tv_item_price);
        }
    }
}

