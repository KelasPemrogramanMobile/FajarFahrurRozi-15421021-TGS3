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
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private EditText masukNama;
    private EditText masukAlamat;
    private EditText masukTtl;
    private Spinner masukAgama;
    private RadioGroup masukJk;
    private RadioButton radiobt;
    private EditText masukPw;
    private Button btnambildata, btnexit;
    String nama, alamat, ttl, agama, radiojk, pw;
    private Spinner masukinAgama;
    int Jk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        masukNama = (EditText) findViewById(R.id.masukinNama);
        masukAlamat = (EditText) findViewById(R.id.masukinAlamat);
        masukTtl = (EditText) findViewById(R.id.masukinTtl);
        masukAgama = (Spinner) findViewById(R.id.masukinAgama);
        masukJk = (RadioGroup) findViewById(R.id.masukinJk);
        masukPw = (EditText) findViewById(R.id.masukinPassword);
        btnambildata = (Button) findViewById(R.id.btinputdata);
        btnexit = (Button) findViewById(R.id.btkeluar);

        btnambildata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama = masukNama.getText().toString();
                alamat = masukAlamat.getText().toString();
                ttl = masukTtl.getText().toString();
                agama = masukAgama.getSelectedItem().toString();
                Jk = masukJk.getCheckedRadioButtonId();
                pw = masukPw.getText().toString();
                radiobt = (RadioButton) findViewById(Jk);
                radiojk = radiobt.getText().toString();


                Intent go = new Intent(MainActivity.this, tampilan.class);
                go.putExtra("Nama", nama);
                go.putExtra("Alamat", alamat);
                go.putExtra("Ttl", ttl);
                go.putExtra("Agama", agama);
                go.putExtra("Jk", radiojk);
                go.putExtra("Password", pw);
                startActivity(go);

                finish();
            }
        });

        btnexit = (Button) findViewById(R.id.btkeluar);

        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.finish();
            }
        });
    }
}

