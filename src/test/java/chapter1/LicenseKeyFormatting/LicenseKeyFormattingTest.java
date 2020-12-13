package chapter1.LicenseKeyFormatting;

import org.junit.Assert;
import org.junit.Test;

public class LicenseKeyFormattingTest {

    @Test
    public void solve() {
        int k = 4;
        String str1 = "8F3Z-2e-9-wabcdef";
        Assert.assertEquals(LicenseKeyFormatting.solve(str1,4), "8F-3Z2E-9WAB-CDEF");
    }
    @Test
    public void solve2() {
        int k = 4;
        String str1 = "8-5g-3-3";
        Assert.assertEquals(LicenseKeyFormatting.solve(str1,4), "8-5G33");
    }
    @Test
    public void solve3() {
        int k = 4;
        String str1 = "8F3Z-2e-9-wabcdef";
        Assert.assertEquals(LicenseKeyFormatting.solve2(str1,4), "8F-3Z2E-9WAB-CDEF");
    }

}