package WordpressTests;

import com.company.PublicVisibility;
import com.company.WordpressPage;
import com.company.WordpressVisibility;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Lpsn on 10/30/2016.
 */
public class PubVisTest {

    @Test
    public void pubVisTest(){

        WordpressVisibility vis = new PublicVisibility();

        vis.isVisibleBy(PublicVisibility.AccesLevel.Anyone);
        Assert.assertTrue(vis.isInFeed());
        Assert.assertTrue(vis.canBeSearched());

        vis.isVisibleBy(PublicVisibility.AccesLevel.Editor);
        Assert.assertTrue(vis.isInFeed());
        Assert.assertTrue(vis.canBeSearched());

        vis.isVisibleBy(PublicVisibility.AccesLevel.Administrator);
        Assert.assertTrue(vis.isInFeed());
        Assert.assertTrue(vis.canBeSearched());
    }

}
