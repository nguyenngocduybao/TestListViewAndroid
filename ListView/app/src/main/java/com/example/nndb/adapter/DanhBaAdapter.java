package com.example.nndb.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nndb.listview.R;
import com.example.nndb.model.DanhBaDTO;

import java.util.List;

public class DanhBaAdapter extends ArrayAdapter<DanhBaDTO>  {

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
        TextView tvTen=(TextView)row.findViewById(R.id.tv_HoTen);
        TextView tvPhone=(TextView)row.findViewById((R.id.tv_SoDienThoai));
        ImageButton btnCall=row.findViewById(R.id.btn_Call);
        ImageButton btnSms=row.findViewById(R.id.btn_sms);
        ImageButton btnDetail=row.findViewById((R.id.btn_Detail));

        final DanhBaDTO db=this.objects.get(position);
        tvTen.setText(db.getTen());
        tvPhone.setText(db.getPhone());

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLyXemChiTiet(db);
            }
        });
        
        return row;

    }

    private void xuLyXemChiTiet(DanhBaDTO db) {
        Toast.makeText(this.context,"Bạn chọn: " +db.getTen(),Toast.LENGTH_LONG).show();
    }


}
