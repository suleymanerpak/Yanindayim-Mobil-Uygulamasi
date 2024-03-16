package com.example.yanndaym;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Calendar;

public class bilgial extends AppCompatActivity {

    TextView ad;
    TextView soyad;
    EditText editAd;
    EditText editSoyad;
    TextView yazdır;
    Button kaydet;
    Button tarih;
    TextView tarihgoster;
    LinearLayout linearLayout;
    String adgoster;
    String soyadgoster;
    private DatePickerDialog.OnDateSetListener mDateSetListener;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilgial);

        ad = findViewById(R.id.AdId);
        soyad = findViewById(R.id.SoyadId);
        editAd = findViewById(R.id.editTextAdId);
        editSoyad = findViewById(R.id.editTextSoyadId);
        yazdır = findViewById(R.id.yazdırId);
        kaydet = findViewById(R.id.KaydetId);
        tarih = findViewById(R.id.TarihId);
        tarihgoster = findViewById(R.id.TarihGosterId);
        linearLayout = findViewById(R.id.lineerId);

        tarih.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {
                Calendar takvim = Calendar.getInstance();
                int year = takvim.get(Calendar.YEAR);
                int month = takvim.get(Calendar.MONTH);
                int day = takvim.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog dialog = new DatePickerDialog(bilgial.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,mDateSetListener,
                        year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.setTitle("Tarih Seçiniz");
                dialog.setButton(DatePickerDialog.BUTTON_POSITIVE, "SEÇ", dialog);
                dialog.setButton(DatePickerDialog.BUTTON_NEGATIVE, "İPTAL", dialog);
                dialog.show();
            }
        });

        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int yil, int ay, int gun) {
                ay = ay + 1;
                tarihgoster.setText(gun + "/" + ay + "/" + yil);
            }
        };

        kaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                yazdır.setText("Merhaba " + editAd.getText() + " " +editSoyad.getText() +".Hoşgeldin.");

                VeriKaydet();
                VeriGetir();

                Intent intent = new Intent(bilgial.this,secimekrani.class);
                startActivity(intent);


            }
        });




    }


    public void VeriKaydet()
    {
        sharedPreferences = getSharedPreferences("Save Data", Context.MODE_PRIVATE);
        adgoster = ad.getText().toString();
        soyadgoster = soyad.getText().toString();
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("key name",adgoster);
        editor.putString("key surname",soyadgoster);
        editor.commit();
        Toast.makeText(getApplicationContext(),"Bilgileriniz Kaydedildi...",Toast.LENGTH_SHORT).show();
    }

    public void VeriGetir()
    {
        sharedPreferences = getSharedPreferences("Save Data",Context.MODE_PRIVATE);
        adgoster = sharedPreferences.getString("key name",null);
        soyadgoster = sharedPreferences.getString("key surname",null);
        ad.setText(adgoster);
        soyad.setText(soyadgoster);
    }



}