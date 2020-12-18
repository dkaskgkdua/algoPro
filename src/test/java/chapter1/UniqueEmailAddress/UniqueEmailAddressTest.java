package chapter1.UniqueEmailAddress;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueEmailAddressTest {

    @Test
    public void numUniqueEmials() {
        String[] emails = {
                "test.email+james@coding.com",
                "test.e.mail+toto.jane@coding.com",
                "testemail+tom@cod.ing.com"
        };

        Assert.assertEquals(UniqueEmailAddress.numUniqueEmials(emails), 2);
    }
}