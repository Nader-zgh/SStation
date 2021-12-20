package com.example.sstation;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.StationViewHolder> {
    @NonNull
    List<Station> stationList;
    Context context;
    View v;

    public Adapter(@NonNull List<Station> stationList, Context context) {
        this.stationList = stationList;
        this.context = context;
    }

    @Override
    public Adapter.StationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.model,parent,false);
        StationViewHolder stationViewHolder = new StationViewHolder(view);
        return stationViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.StationViewHolder holder, int position) {
        Station station=stationList.get(position);
        holder.name.setText("Station "+station.getName());
        holder.Temp.setText("Temp:"+station.getTemp()+" °C");
        holder.hum.setText("Hum: "+station.getHum()+" %");
        holder.more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(context,StationsActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra("name",station.getName());
                intent.putExtra("hum",station.getHum());
                intent.putExtra("temp",station.getTemp());
                intent.putExtra("desc",station.getDesc());
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return stationList.size();
    }
    public static class StationViewHolder extends RecyclerView.ViewHolder{
        TextView name ;
        TextView Temp;
        TextView hum;
        TextView more;

        public StationViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            Temp=itemView.findViewById(R.id.Temp);
            hum=itemView.findViewById(R.id.hum);
            more=itemView.findViewById(R.id.textView3);

        }
    }
}
