package com.example.exercise;


import android.app.Activity;
import android.content.Intent;
import android.icu.text.Transliterator;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mcolorresourceid;

    public WordAdapter(Activity context, ArrayList<Word>getnos,int colorresourceid)
    {
        super(context,0,getnos);
        mcolorresourceid=colorresourceid;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        RelativeLayout listitemview= (RelativeLayout) convertView;
        if(listitemview==null) {
            listitemview = (RelativeLayout) LayoutInflater.from(getContext()).inflate(R.layout.activity_main, parent, false);
        }
        Word currentword=getItem(position);


        TextView numtextview= (TextView) listitemview.findViewById(R.id.name);
        numtextview.setText(currentword.getRepetion());


        ImageView imageview= (ImageView) listitemview.findViewById(R.id.image);

        if(currentword.hasImage()==true) {
            imageview.setImageResource(currentword.getImgageresourceid());
        }
        else
        {
            imageview.setVisibility(View.GONE);
        }






        return listitemview;



    }

}