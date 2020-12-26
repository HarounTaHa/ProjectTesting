package com.example.projecttestingforsmartdevice.harounActivityBusinessLogic.favoritesActivity.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.projecttestingforsmartdevice.R;
import com.example.projecttestingforsmartdevice.models.Product;
import com.squareup.picasso.Picasso;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerFavoritesAdapter extends RecyclerView.Adapter<RecyclerFavoritesAdapter.VHolderFavorites> {
    List<Product> products;

    public RecyclerFavoritesAdapter(List<Product> products) {
        this.products = products;
    }

    @NonNull
    @Override
    public RecyclerFavoritesAdapter.VHolderFavorites onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.haroun_design_item_favorites,parent,false);
        return new VHolderFavorites(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerFavoritesAdapter.VHolderFavorites holder, int position) {
        Product product= products.get(position);
        holder.textViewName.setText(product.getProductName());
        holder.textViewDescription.setText(product.getProductDescription());
        holder.textViewPrice.setText(String.valueOf(product.getProductPrice()));
        String imageUrl=product.getProductImageUrl();
        Log.e("uuuuuuuuuu",imageUrl);
//        Picasso.get().load(imageUrl).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public class VHolderFavorites extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textViewName;
        TextView textViewDescription;
        TextView textViewPrice;
        public VHolderFavorites(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.image_product_favorite);
            textViewName=itemView.findViewById(R.id.nameText_product_favorite);
            textViewDescription=itemView.findViewById(R.id.descriptionText_product_favorite);
            textViewPrice=itemView.findViewById(R.id.priceText_product_favorite);
        }
    }
}
