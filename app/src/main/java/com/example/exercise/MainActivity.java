package com.example.exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.RelativeLayout;

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


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter adapter =
                new WordAdapter(this, getexe,R.color.background);


        RelativeLayout rl = (RelativeLayout) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        rl.setAdapter(adapter);

    }
    public void next(View view) {
        Intent myIntent = new Intent(MainActivity.this, CoreWorkOut.class);
        startActivity(myIntent);
    }
    public void done(View view) {
        Intent myIntent = new Intent(MainActivity.this, CoreWorkOut.class);
        startActivity(myIntent);
    }

    }
}