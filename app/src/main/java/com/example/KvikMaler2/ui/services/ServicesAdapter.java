package com.example.KvikMaler2.ui.services;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.KvikMaler2.R;

import java.util.ArrayList;

public class ServicesAdapter  extends RecyclerView.Adapter<ServicesAdapter.ViewHolder> {

    private ArrayList<Services> services;
    private OnClickListener onClickListener;

    public ServicesAdapter(ArrayList<Services> services) { this.services=services;}

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.services_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        viewHolder.name.setText(services.get(position).getName());
        viewHolder.icon.setImageResource(services.get(position).getIconId());

    }

    @Override
    public int getItemCount() { return services.size();}

    public void setOnClickListener(OnClickListener listener) { this.onClickListener=listener;}

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        ImageView icon;

        ViewHolder (View itemView) {
            super(itemView);
            name= itemView.findViewById(R.id.textview_name);
            icon= itemView.findViewById(R.id.imageview_icon);
            itemView.setOnClickListener(v -> {
                onClickListener.onClick(services.get(getBindingAdapterPosition()));
            });
        }
    }
    public interface OnClickListener {
        void onClick(Services services);
    }
}
