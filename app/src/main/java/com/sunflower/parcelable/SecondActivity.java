package com.sunflower.parcelable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static final String EXTRA_MHS= "extra_karyawan";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView nim = findViewById(R.id.tv_nim);
        TextView nama = findViewById(R.id.tv_nama);
        TextView jurusan = findViewById(R.id.tv_jurusan);
        TextView hobi = findViewById(R.id.tv_hobi);

        ModelMahasiswa mhs = getIntent().getParcelableExtra(EXTRA_MHS);

        if (mhs!=null){
            nim.setText(mhs.getNim());
            nama.setText(mhs.getNama());
            jurusan.setText(mhs.getJurusan());
            hobi.setText(mhs.getHobi());
        }
    }
}
