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
        dsDanhBa=new ArrayList<DanhBaDTO>();
        dsDanhBa.add(new DanhBaDTO(1,"Nguoi thu 1","01662222222"));
        dsDanhBa.add(new DanhBaDTO(2,"Nguoi thu 2","0166221235"));
        dsDanhBa.add(new DanhBaDTO(3,"Nguoi thu 3","01662289895"));

        danhBaAdapter=new DanhBaAdapter(MainListView.this,
                R.layout.item,
                dsDanhBa);
        lvDanhBa.setAdapter(danhBaAdapter);
    }
}
