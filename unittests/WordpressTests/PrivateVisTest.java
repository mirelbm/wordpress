package WordpressTests;

import com.company.PrivateVisibility;
import com.company.WordpressVisibility;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Lpsn on 10/30/2016.
 */
public class PrivateVisTest {

    @Test
    public void priVisTest(){

        WordpressVisibility visP = new PrivateVisibility();

        visP.isVisibleBy(PrivateVisibility.AccesLevel.Anyone);
        Assert.assertFalse(visP.isInFeed());
        Assert.assertFalse(visP.canBeSearched());

        visP.isVisibleBy(PrivateVisibility.AccesLevel.Editor);
        Assert.assertFalse(visP.isInFeed());
        Assert.assertFalse(visP.canBeSearched());

        visP.isVisibleBy(PrivateVisibility.AccesLevel.Administrator);
        Assert.assertFalse(visP.isInFeed());
        Assert.assertFalse(visP.canBeSearched());

         Assert.assertTrue(visP.canView("Parola"));

    }

}


