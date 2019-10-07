package com.sunflower.parcelable;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ModelMahasiswa mhs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv_nm = findViewById(R.id.tv_nama);
        Button btn_detail = findViewById(R.id.btn_detail);

        btn_detail.setOnClickListener(this);

        mhs = new ModelMahasiswa();

        mhs.setNim("8020140267");
        mhs.setNama("Lian Mafutra");
        mhs.setHobi("Programming");
        mhs.setJurusan("Teknik Informatika");
        tv_nm.setText(mhs.getNama());
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_detail) {
            Intent i = new Intent(this, SecondActivity.class);
            i.putExtra(SecondActivity.EXTRA_MHS, mhs);
            startActivity(i);
        }
    }
}
