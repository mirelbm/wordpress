package com.company;

/**
 * Created by Lpsn on 10/30/2016.
 */
public abstract class WordpressVisibility {

    public enum AccesLevel {
        Anyone,
        Editor,
        Administrator
    }


    public abstract boolean isVisibleBy(AccesLevel level);
    public abstract boolean canView(String password);

    public boolean isInFeed(){
        return isVisibleBy(AccesLevel.Anyone);
    }

    public boolean canBeSearched(){
        return  isVisibleBy(AccesLevel.Anyone);
    }

}