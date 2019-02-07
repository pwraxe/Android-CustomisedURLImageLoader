package com.example.akshay.customizedurlimageloader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity
{
    EditText txt;
    Button b;
    ImageView imgV;
    String url;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.getUrl);
        b = findViewById(R.id.butt);
        imgV = findViewById(R.id.img);
        b.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                url = txt.getText().toString();
                Glide.with(getApplicationContext()).load(url).into(imgV);
            }
        });


    }
}
