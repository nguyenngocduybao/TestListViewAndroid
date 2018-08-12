package com.example.nndb.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.nndb.adapter.DanhBaAdapter;
import com.example.nndb.model.DanhBaDTO;

import java.util.ArrayList;

import static com.example.nndb.listview.R.id.lv_DanhBa;

public class MainListView extends AppCompatActivity {


    ListView lvDanhBa;
    ArrayList<DanhBaDTO>dsDanhBa;
    DanhBaAdapter danhBaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list_view);

        addControls();
        addEvent();
    }

    private void addEvent() {
    }

    private void addControls() {
        lvDanhBa= this.<ListView>findViewById(R.id.lv_DanhBa);
        dsDanhBa=new ArrayList<>();
        dsDanhBa.add(new DanhBaDTO(1,"Day la nguoi thu 1","112233445566"));
        dsDanhBa.add(new DanhBaDTO(2,"Day la nguoi thu 2","0123456789"));
        dsDanhBa.add(new DanhBaDTO(3,"Day la nguoi thu 3","012585855654"));

        danhBaAdapter=new DanhBaAdapter(MainListView.this,
                R.layout.item,
                dsDanhBa);
        lvDanhBa.setAdapter(danhBaAdapter);
    }
}
