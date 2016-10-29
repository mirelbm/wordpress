package com.company;

import java.util.ArrayList;

/**
 * Created by Lpsn on 10/29/2016.
 */
public class WordpressPost extends WordpressPage  {

    static int postcount = 0;
    ArrayList<String> tags = new ArrayList<>();
     enum Format {Standard,Aside,Image,Video,Quote,Link};
     ArrayList<String> categories = new ArrayList<>();
     Format format = Format.Image;

    public WordpressPost(String title, String content) {
          super();
        postcount++;
        id = postcount;
    }


}
