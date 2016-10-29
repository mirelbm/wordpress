package WordpressTests;

import com.company.WordpressPage;
import com.company.WordpressPost;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Lpsn on 10/29/2016.
 */
public class IdTest {

    @Test
    public void testingId() {


        WordpressPage page = new WordpressPage("title", "content");
        WordpressPage page1 = new WordpressPage("title", "content");
        WordpressPage post = new WordpressPost("title", "content");
        WordpressPage post1 = new WordpressPost("title", "content");

        System.out.println(page.id);
        System.out.println(page1.id);
        System.out.println(post.id);
        System.out.println(post1.id);

        Assert.assertTrue(page.id == 1);
        Assert.assertTrue(page.id != page1.id);
        Assert.assertTrue(post.id == 1);
        Assert.assertTrue(post1.id != post.id);


    }

}


