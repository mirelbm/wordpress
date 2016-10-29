package WordpressTests;

import com.company.IPublish;
import com.company.WordpressComment;
import com.company.WordpressPage;
import org.junit.Assert;
import org.junit.Test;


public class IPublishTest {


    public void testPublish(IPublish element) {
        element.publish();
        Assert.assertTrue(element.isPublished());
    }

    @Test
    public void interfacetestWPage() {
        testPublish(new WordpressPage());
    }

    @Test
    public void interfacetestCom() {
        testPublish(new WordpressComment());
    }


}
