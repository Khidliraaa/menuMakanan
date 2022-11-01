package com.example.menumakanankhidlira;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rec_Makanan;
    private ArrayList<Kuliner> listMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rec_Makanan = findViewById(R.id.rec_Makanan);
        initData();

        rec_Makanan.setAdapter(new KulinerAdapter(listMakanan));
        rec_Makanan.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData() {
        this.listMakanan = new ArrayList<>();
        listMakanan.add(new Kuliner("Bakso",
                "Rp. 10.000",
                "Bakso murah porsi banyak, segar untuk di makan saat hujan",
                R.drawable.bakso));
        listMakanan.add(new Kuliner("Bubur Ayam",
                "Rp. 10.000",
                "Bubur ayam full toping bisa pilih toping sesuka hati",
                R.drawable.bubur));
        listMakanan.add(new Kuliner("Lalapan",
                "Rp. 3.000",
                "Sayur segar serta fresh untuk pendorong nasi",
                R.drawable.lalapan));
        listMakanan.add(new Kuliner("Kwetiaw",
                "Rp. 12.000",
                "Mie gepeng dengan toping seafood yang sangat enduls.",
                R.drawable.kwetiaw));
        listMakanan.add(new Kuliner("Sate",
                "Rp. 20.000",
                "Sate ayam atau kambing dengan bumbu kecap atau bumbu kacang.",
                R.drawable.sate));
        listMakanan.add(new Kuliner("Soto Ayam",
                "Rp. 15.000",
                "Soto dengan suwiran ayam dan telur bacem.",
                R.drawable.soto));
        listMakanan.add(new Kuliner("Boci",
                "Rp. 10.000",
                "Boci dengan toping kerupuk udang dan cuanki tahu.",
                R.drawable.boci));
        listMakanan.add(new Kuliner("Steak",
                "Rp. 50.000",
                "Steak daging wagyu import teksturnya juicy rasanya bintang 5",
                R.drawable.steak));
    }
}