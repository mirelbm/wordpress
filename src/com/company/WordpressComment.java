package com.company;

/**
 * Created by Lpsn on 10/29/2016.
 */
public class WordpressComment extends WordpressPage implements IPublish {


    @Override
    public void publish() {
        status = Status.Published;
        System.out.println(status);
    }

    @Override
    public void unpublish() {
        if(this.status == Status.Published){
            this.status = Status.Draft;
        }
    }

    @Override
    public boolean isPublished() {
        return status == Status.Published;
    }
}
