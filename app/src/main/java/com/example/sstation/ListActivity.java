package com.example.sstation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListActivity extends AppCompatActivity {
    private RecyclerView stations;
    private RecyclerView.LayoutManager layoutManager;
    private Adapter adapter;
private String desc="Description,description,,description,,description,,description,,description,,description,,description,,description,,description,,description,,description,,description,,description,,description,";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        List<Station> stationList= new ArrayList<>();
        stationList.add(new Station("Tunis",new Random().nextInt(36)+1+"",new Random().nextInt(80)+20+"",desc));
        stationList.add(new Station("Rades",new Random().nextInt(36)+1+"",new Random().nextInt(80)+20+"",desc));
        stationList.add(new Station("Bizerte",new Random().nextInt(36)+1+"",new Random().nextInt(80)+20+"",desc));
        stationList.add(new Station("Sfax",new Random().nextInt(36)+1+"",new Random().nextInt(80)+20+"",desc));
        stationList.add(new Station("Beja",new Random().nextInt(36)+1+"",new Random().nextInt(80)+20+"",desc));
        stationList.add(new Station("Kef",new Random().nextInt(36)+1+"",new Random().nextInt(80)+20+"",desc));
        stationList.add(new Station("Jendouba",new Random().nextInt(36)+1+"",new Random().nextInt(80)+20+"",desc));
        stationList.add(new Station("Mednine",new Random().nextInt(36)+1+"",new Random().nextInt(80)+20+"",desc));
        stationList.add(new Station("Gafsa",new Random().nextInt(36)+1+"",new Random().nextInt(80)+20+"",desc));
        stations=findViewById(R.id.Recview);
        layoutManager=new LinearLayoutManager(this);
        stations.setLayoutManager(layoutManager);
        adapter= new Adapter(stationList,getApplicationContext());
        stations.setAdapter(adapter);
        DividerItemDecoration dividerItemDecoration=new DividerItemDecoration(stations.getContext(),DividerItemDecoration.VERTICAL);
        stations.addItemDecoration(dividerItemDecoration);
    }

}