package com.example.th8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class MonAnAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<MonAn> danhSachMonAn;

    public MonAnAdapter(Context context, ArrayList<MonAn> danhSachMonAn) {
        this.context = context;
        this.danhSachMonAn = danhSachMonAn;
    }

    @Override
    public int getCount() { return danhSachMonAn.size(); }

    @Override
    public Object getItem(int position) { return danhSachMonAn.get(position); }

    @Override
    public long getItemId(int position) { return position; }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.item_monan, parent, false);
        }


        ImageView imgAnh = convertView.findViewById(R.id.imgAnhDaiDien);
        TextView tvTen = convertView.findViewById(R.id.tvTenMon);
        TextView tvGia = convertView.findViewById(R.id.tvDonGia);
        TextView tvMoTa = convertView.findViewById(R.id.tvMoTa);


        MonAn monHienTai = danhSachMonAn.get(position);

        imgAnh.setImageResource(monHienTai.getIdAnhMinhHoa());
        tvTen.setText(monHienTai.getTenMonAn());
        tvGia.setText(monHienTai.getDonGia() + " VNĐ");
        tvMoTa.setText(monHienTai.getMoTa());

        return convertView;
    }
}