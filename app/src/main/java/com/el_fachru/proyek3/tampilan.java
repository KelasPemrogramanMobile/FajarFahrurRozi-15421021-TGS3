package com.el_fachru.proyek3;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class tampilan extends AppCompatActivity {
    TextView textNama, textAlamat, textTtl, textAgama, textJk, textPw;
    Intent nama, alamat, ttl, agama, Jk,  pw;
    String strNama, strAlamat, strTtl, strAgama, strJk, strPw;
    Button btnback, btnexit;
   // int Jk;
   // char chJk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan);

        textNama = (TextView) findViewById(R.id.textNama);
        textAlamat= (TextView) findViewById(R.id.textAlamat);
        textTtl = (TextView) findViewById(R.id.textTtl);
        textAgama = (TextView) findViewById(R.id.textAgama);
        textJk = (TextView) findViewById(R.id.textJk);
        textPw = (TextView) findViewById(R.id.textPw);
        btnback = (Button) findViewById(R.id.kembali);

        nama = getIntent();
        strNama = nama.getStringExtra("Nama");
        textNama.setText(strNama);

        alamat = getIntent();
        strAlamat = alamat.getStringExtra("Alamat");
        textAlamat.setText(strAlamat);

        ttl = getIntent();
        strTtl = ttl.getStringExtra("Ttl");
        textTtl.setText(strTtl);

        agama = getIntent();
        strAgama = agama.getStringExtra("Agama");
        textAgama.setText(strAgama);

        Jk = getIntent();
        strJk = Jk.getStringExtra("Jk");
        textJk.setText(strJk);

        pw = getIntent();
        strPw = pw.getStringExtra("Password");
        textPw.setText(strPw);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(tampilan.this, MainActivity.class);
                startActivity(kembali);
                finish();
            }
        });

        btnexit = (Button) findViewById(R.id.keluar);

        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tampilan.this.finish();
            }
        });
    }
}
