package com.example.lesson3recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Adapter adapter;
    private ArrayList<Country> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.main_rv);
        adapter = new Adapter();
        recyclerView.setAdapter(adapter);


        list = new ArrayList<>();
        list();

        adapter.addList(list);
    }

    private void list() {
        list.add(0,new Country("Бразилия", "Бразилиа", R.drawable.unnamed));
        list.add(1,new Country("Аргентина", "Буэнос-Айрес",R.drawable.argentina));
        list.add(2,new Country("Франция", "Париж",R.drawable.france));
        list.add(3,new Country("Дания", "Коппенгагин",R.drawable.denmark));
        list.add(4,new Country("Германия", "Берлин",R.drawable.germany));
        list.add(5,new Country("Финляндия", "Хельсинки",R.drawable.finland));
        list.add(6,new Country("Швейцария", "Швейцария",R.drawable.shveiz));
        list.add(7,new Country("Австрия", "Вена",R.drawable.avstria));
        list.add(8,new Country("Чехия", "Прага",R.drawable.chez));
        list.add(9,new Country("Италия", "Рим",R.drawable.italia));
        list.add(10,new Country("Англия", "Лондон",R.drawable.england));
        list.add(11,new Country("Бельгия", "Брюссель",R.drawable.belgium));
        list.add(12,new Country("Россия", "Москва",R.drawable.russia));
        list.add(13,new Country("Кыргызстан", "Бишкек",R.drawable.kr));
        list.add(14,new Country("Казахстан", "Астана",R.drawable.kazah));

    }


}