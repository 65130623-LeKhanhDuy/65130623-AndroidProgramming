package com.example.th9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class LandscapeAdapter extends RecyclerView.Adapter<LandscapeAdapter.ItemLandHolder> {

    private Context context;
    private ArrayList<LandScape> listData;

    public LandscapeAdapter(Context context, ArrayList<LandScape> listData) {
        this.context = context;
        this.listData = listData;
    }

    @NonNull
    @Override
    public ItemLandHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View viewItem = inflater.inflate(R.layout.item_landscape, parent, false);
        return new ItemLandHolder(viewItem);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLandHolder holder, int position) {
        LandScape currentLand = listData.get(position);
        holder.tvCaption.setText(currentLand.getCaption());

        String packageName = holder.itemView.getContext().getPackageName();
        int imageId = holder.itemView.getResources().getIdentifier(
                currentLand.getImageFileName(), "mipmap", packageName);
        holder.imgViewLand.setImageResource(imageId);
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }


    public class ItemLandHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgViewLand;
        TextView tvCaption;

        public ItemLandHolder(@NonNull View itemView) {
            super(itemView);
            imgViewLand = itemView.findViewById(R.id.imgViewLand);
            tvCaption = itemView.findViewById(R.id.tvCaption);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int positionClick = getAdapterPosition();
            LandScape phanTuDuocChon = listData.get(positionClick);

            Toast.makeText(context, "Bạn vừa click vào: " + phanTuDuocChon.getCaption(), Toast.LENGTH_SHORT).show();
        }
    }
}