package com.example.energyusageapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String heading = getIntent().getStringExtra("heading");
        String description = getIntent().getStringExtra("description");
        int image = getIntent().getIntExtra("image", 0);

        TextView headingTextView = findViewById(R.id.HeadingTextView);
        TextView descriptionTextView = findViewById(R.id.DescriptionTextView);
        ImageView imageView = findViewById(R.id.imageView);


        headingTextView.setText(heading);
        descriptionTextView.setText(description);
        imageView.setImageResource(image);

    }
}