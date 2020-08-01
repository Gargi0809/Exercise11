package com.example.exercise;


public class Word {

    private String mrepetion;
    private static final int NO_VALID_IMAGE=-1;
    private int mimgageresourceid=NO_VALID_IMAGE;


    public Word(String repetion,int imgageresourceid)
    {

        mrepetion=repetion;
        mimgageresourceid=imgageresourceid;
    }


    public String getRepetion() {
        return mrepetion;
    }

    public int getImgageresourceid()
    {

        return mimgageresourceid;

    }
    public boolean hasImage()
    {
        return mimgageresourceid!=NO_VALID_IMAGE;
    }


}

