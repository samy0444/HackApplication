package com.example.hackapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainDashboard extends AppCompatActivity {


    TextView name;
    ImageView img;
    LinearLayout lyt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dashboard);

        name=findViewById(R.id.docTitle);
        img=findViewById(R.id.coverImage);
        lyt=findViewById(R.id.doc1);

        lyt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainDashboard.this, SpecificService.class));
            }
        });
    }
}