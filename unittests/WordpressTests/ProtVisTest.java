package WordpressTests;

import com.company.PasswordVisibility;
import com.company.WordpressVisibility;
import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

/**
 * Created by Lpsn on 10/30/2016.
 */
public class ProtVisTest {

    @Test
    public void protVisTest(){

        WordpressVisibility visPro = new PasswordVisibility();

        visPro.isVisibleBy(PasswordVisibility.AccesLevel.Anyone);
        Assert.assertFalse(visPro.isInFeed());
        Assert.assertFalse(visPro.canBeSearched());

        visPro.isVisibleBy(PasswordVisibility.AccesLevel.Editor);
        Assert.assertFalse(visPro.isInFeed());
        Assert.assertFalse(visPro.canBeSearched());

        visPro.isVisibleBy(PasswordVisibility.AccesLevel.Administrator);
        Assert.assertFalse(visPro.isInFeed());
        Assert.assertFalse(visPro.canBeSearched());

        Assert.assertFalse(visPro.canView("Parola"));
        Assert.assertTrue(visPro.canView("Parola1234-"));

    }

}
