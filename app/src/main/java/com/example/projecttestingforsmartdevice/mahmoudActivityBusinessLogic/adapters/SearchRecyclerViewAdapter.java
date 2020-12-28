package com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.projecttestingforsmartdevice.R;
import com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.details.DetailsActivity;
import com.example.projecttestingforsmartdevice.models.Product;

import java.util.List;

public class SearchRecyclerViewAdapter extends RecyclerView.Adapter<com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.adapters.SearchRecyclerViewAdapter.ViewHolder>{
    private List<Product> mData;
    private LayoutInflater mInflater;

    public SearchRecyclerViewAdapter(Context context, List<Product> data) {
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_search, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final Product product = mData.get(position);

        Glide.with(holder.itemView.getContext())
                .load(product.getProductImageUrl())
                .into( holder.img_product);

        holder.name_product.setText(product.getProductName());
        holder.price_product.setText(product.getProductPrice()+"");

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(holder.itemView.getContext(), DetailsActivity.class);
                intent.putExtra("product",product);
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public void filterList(List<Product> filteredList) {
        mData = filteredList;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_product;
        TextView price_product,name_product;

        ViewHolder(View itemView) {
            super(itemView);
            img_product = itemView.findViewById(R.id.img_product);
            price_product=itemView.findViewById(R.id.price_product);
            name_product=itemView.findViewById(R.id.name_product);
        }

    }


}
