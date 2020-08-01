package com.example.exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Word> getexe =new  ArrayList<Word>();
        //add elements to arraylist
        getexe.add(new Word("PUSH-UPS: X20",R.drawable.pushupsani));
        getexe.add(new Word("DONKEY-KICKS: X20",R.drawable.donkey));
        getexe.add(new Word("LUNGES: X20",R.drawable.lunges));
        getexe.add(new Word("HEELTOUCH: X20",R.drawable.heeltouch));
        getexe.add(new Word("CLAPS-OVERHEAD: X20",R.drawable.clapsoverhead));
        getexe.add(new Word("BUTTBRIDGE: X20",R.drawable.buttbridge));

        //accsess elements

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.list);
        LayoutInflater inflater = LayoutInflater.from(this);
        for (Word in :getexe) {
            View view  = inflater.inflate(R.layout.recyler, linearLayout, false);
            // set item content in view
            linearLayout.addView(view);
        }

    }


    }
