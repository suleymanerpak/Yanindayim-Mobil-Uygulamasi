package com.example.yanndaym;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import java.util.ArrayList;

public class hatirlatici extends AppCompatActivity {

    ArrayList<String> hatırlatıcı = new ArrayList<>();
    ArrayList<String> hatırlatıcıacıklama = new ArrayList<>();
    ArrayList<Integer> resimler = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hatirlatici);

        RecyclerView recyclerView = findViewById(R.id.Recycler1Id);

        hatırlatıcı.add("SUYUNU İÇ");
        hatırlatıcı.add("İĞNENİ VUR");
        hatırlatıcı.add("İLACINI İÇ");
        hatırlatıcı.add("BİTKİLERİNİ SULA");
        hatırlatıcı.add("YÜRÜYÜŞ YAP");
        hatırlatıcı.add("EGZERSİZ YAP");
        hatırlatıcı.add("KİTAP/GAZETE OKU");
        hatırlatıcı.add("SEVDİKLERİNİ ARA");

        hatırlatıcıacıklama.add("Her 2  saatte bir 1.5 litre su içmeyi sakın unutma.Metabolizman için su çok önemlidir");
        hatırlatıcıacıklama.add("İğneni vurunmayı sakın unutma.");
        hatırlatıcıacıklama.add("Doktorunun verdiği ilaçlarını içmeyi sakın unutma iç.");
        hatırlatıcıacıklama.add("Bitkiler en iyi dostumuz.Ara ara onları sulamayı ihmal etme.");
        hatırlatıcıacıklama.add("Yürüyüş yapmak sağlığın ve metobolizman için çok önemli.Her gün 10.000 adım senin için en iyisi!");
        hatırlatıcıacıklama.add("Gün içinde yapılan egzersizler seni daha dinç tutar.");
        hatırlatıcıacıklama.add("Okumak birşeyler öğrenmeni sağlar ve haberdar olmanı sağlar.");
        hatırlatıcıacıklama.add("Sevdiklerini aramayı sakın unutma.");


        resimler.add(R.drawable.su);
        resimler.add(R.drawable.igne);
        resimler.add(R.drawable.ilac);
        resimler.add(R.drawable.bitkisulama);
        resimler.add(R.drawable.yuruyus);
        resimler.add(R.drawable.egzersiz);
        resimler.add(R.drawable.oku);
        resimler.add(R.drawable.ara);

        recycleradaptor recycleradaptor = new recycleradaptor(hatırlatıcı,hatırlatıcıacıklama,resimler,this);
        recyclerView.setAdapter(recycleradaptor);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));




    }
}