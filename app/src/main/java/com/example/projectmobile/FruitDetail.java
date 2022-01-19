package com.example.projectmobile;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FruitDetail extends AppCompatActivity {
    ImageView imageView;
    TextView name, desc;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit_detail);

        imageView = findViewById(R.id.detailImage);
        name = findViewById(R.id.detailName);
        desc = findViewById(R.id.detailDescription);

        if(position==0){
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String nama = bundle.getString("fruitName");
            String deskripsi = bundle.getString("fruitDesc");
            imageView.setImageResource(pic);
            name.setText(nama);
            desc.setText(deskripsi);
        }

        if(position==1){
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String nama = bundle.getString("fruitName");
            String deskripsi = bundle.getString("fruitDesc");
            imageView.setImageResource(pic);
            name.setText(nama);
            desc.setText(deskripsi);
        }

        if(position==2){
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String nama = bundle.getString("fruitName");
            String deskripsi = bundle.getString("fruitDesc");
            imageView.setImageResource(pic);
            name.setText(nama);
            desc.setText(deskripsi);
        }

        if(position==3){
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String nama = bundle.getString("fruitName");
            String deskripsi = bundle.getString("fruitDesc");
            imageView.setImageResource(pic);
            name.setText(nama);
            desc.setText(deskripsi);
        }

        if(position==4){
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String nama = bundle.getString("fruitName");
            String deskripsi = bundle.getString("fruitDesc");
            imageView.setImageResource(pic);
            name.setText(nama);
            desc.setText(deskripsi);
        }

        if(position==5){
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String nama = bundle.getString("fruitName");
            String deskripsi = bundle.getString("fruitDesc");
            imageView.setImageResource(pic);
            name.setText(nama);
            desc.setText(deskripsi);
        }

        if(position==6){
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String nama = bundle.getString("fruitName");
            String deskripsi = bundle.getString("fruitDesc");
            imageView.setImageResource(pic);
            name.setText(nama);
            desc.setText(deskripsi);
        }

        if(position==7){
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String nama = bundle.getString("fruitName");
            String deskripsi = bundle.getString("fruitDesc");
            imageView.setImageResource(pic);
            name.setText(nama);
            desc.setText(deskripsi);
        }

        if(position==8){
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String nama = bundle.getString("fruitName");
            String deskripsi = bundle.getString("fruitDesc");
            imageView.setImageResource(pic);
            name.setText(nama);
            desc.setText(deskripsi);
        }

        if(position==9){
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String nama = bundle.getString("fruitName");
            String deskripsi = bundle.getString("fruitDesc");
            imageView.setImageResource(pic);
            name.setText(nama);
            desc.setText(deskripsi);
        }
    }

}