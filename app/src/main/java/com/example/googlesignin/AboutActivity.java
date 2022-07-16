package com.example.googlesignin;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    public void browser1(View view) {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/fnrshzla/MedicalCentreApp.git"));
        startActivity(browserIntent);
    }
}
