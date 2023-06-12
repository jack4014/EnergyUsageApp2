package com.example.energyusageapp2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.Shapeable;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private final RecyclerViewInterface recyclerViewInterface;

    Context context;
    ArrayList<Appliance> applianceArrayList;

    public MyAdapter(Context context, ArrayList<Appliance> applianceArrayList,
                     RecyclerViewInterface recyclerViewInterface) {

        this.context = context;
        this.applianceArrayList = applianceArrayList;
        this.recyclerViewInterface = recyclerViewInterface;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);
        return new MyViewHolder(v, recyclerViewInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Appliance appliance = applianceArrayList.get(position);
        holder.tvHeading.setText(appliance.heading);
        holder.titleImage.setImageResource(appliance.titleImage);



    }

    @Override
    public int getItemCount() {
        return applianceArrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ShapeableImageView titleImage;
        TextView tvHeading;

        public MyViewHolder(@NonNull View itemView, RecyclerViewInterface recyclerViewInterface) {
            super(itemView);
            titleImage = itemView.findViewById(R.id.title_image);
            tvHeading = itemView.findViewById(R.id.tvHeading);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (recyclerViewInterface !=null){
                        int pos = getAdapterPosition();

                        if (pos != RecyclerView.NO_POSITION){
                            recyclerViewInterface.onItemClick(pos);
                        }
                    }
                }
            });
        }
    }

}
