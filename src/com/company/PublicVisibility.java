package com.company;

/**
 * Created by Lpsn on 10/30/2016.
 */
public class PublicVisibility extends WordpressVisibility {


    @Override
    public boolean isVisibleBy(AccesLevel level) {

        if(level == AccesLevel.Anyone || level == AccesLevel.Administrator || level == AccesLevel.Editor) {
            return true;
        }
        else{ return false;}
    }

    @Override
    public boolean canView(String password) {
        return true;
    }
}
