package com.example.tugasrecycleview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.CardViewHolder> {
    private ArrayList<Sepatu> listSepatu;

    public CardViewAdapter(ArrayList<Sepatu> list){
        this.listSepatu= list;
    }
    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview, viewGroup, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewHolder holder, int position) {
        Sepatu sepatu = listSepatu.get(position);

        Glide.with(holder.itemView.getContext())
                .load(sepatu.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);

        holder.tvName.setText(sepatu.getName());
        holder.tvPrice.setText(sepatu.getPrice());
        holder.btnFavorite.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(holder.itemView.getContext(), "Favorite"+
                        listSepatu.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_LONG).show();
            }
        });
        holder.btnShare.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(holder.itemView.getContext(), "Share"+
                        listSepatu.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listSepatu.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvPrice;
        Button btnFavorite, btnShare;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvPrice= itemView.findViewById(R.id.tv_item_price);
            btnFavorite = itemView.findViewById(R.id.btn_set_favorite);
            btnShare = itemView.findViewById(R.id.btn_set_share);
        }
    }
}
