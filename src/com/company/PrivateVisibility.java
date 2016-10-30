package com.company;

import com.company.WordpressVisibility;

/**
 * Created by Lpsn on 10/30/2016.
 */
public class PrivateVisibility  extends WordpressVisibility {


    @Override
    public boolean isVisibleBy(AccesLevel level) {

        return false;
    }

    @Override
    public boolean canView(String password) {
        return true;
    }

}
