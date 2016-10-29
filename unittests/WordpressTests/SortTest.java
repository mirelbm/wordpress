package WordpressTests;

/**
 * Created by Lpsn on 10/29/2016.
 */


import com.company.WordpressPage;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class SortTest {


    @Test
    public void myTest() {

    }

    public void sortareTest() throws Exception {

        ArrayList<WordpressPage> sortTitle = new ArrayList<>();


        for (int t = 0; t <= 10; t++) {
            sortTitle.add(new WordpressPage("title" + (10 - t), "content"));
        }

        sortTitle = WordpressPage.doSort(sortTitle);


        for (int i = 0; i <= sortTitle.size(); i++) {

            Assert.assertEquals(sortTitle.get(i).title, "title" + i);

        }

        Assert.assertFalse(sortTitle.isEmpty());


    }

}
