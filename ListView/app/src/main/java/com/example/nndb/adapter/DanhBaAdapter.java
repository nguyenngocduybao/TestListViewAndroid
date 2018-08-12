package com.example.nndb.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nndb.listview.R;
import com.example.nndb.model.DanhBaDTO;

import java.util.List;

public class DanhBaAdapter extends ArrayAdapter<DanhBaDTO> {

    Activity context;
    int resource;
    List<DanhBaDTO> objects;

    public DanhBaAdapter(Activity context, int resource, List<DanhBaDTO> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.objects=objects;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=this.context.getLayoutInflater();
        View row=inflater.inflate(this.resource,null);
        TextView tv_Ten=(TextView)row.findViewById(R.id.tv_HoTen);
        TextView tv_Phone=(TextView)row.findViewById((R.id.tv_SoDienThoai));
        ImageButton btnCall=row.findViewById(R.id.btn_Call);
        ImageButton btnSms=row.findViewById(R.id.btn_sms);
        ImageButton btnDetail=row.findViewById((R.id.btn_Detail));

        final DanhBaDTO db=this.objects.get(position);
        tv_Ten.setText(db.getTen());
        tv_Phone.setText(db.getPhone());

        
        return row;

    }



}
