package com.company;

/**
 * Created by Lpsn on 10/30/2016.
 */
public class PasswordVisibility extends PrivateVisibility {


    @Override
    public boolean canView(String password) {

        if(password == "Parola1234-"){
            return true;
        }
       else {
            return false;
        }
    }
}
