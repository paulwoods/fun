package org.mrpaulwoods.fun;

import org.junit.Assert;
import org.junit.Test;

public class FunControllerTests {

    private FunController controller = new FunController();

    @Test
    public void testIndex() {
        Assert.assertEquals("having fun yet?", controller.index());
    }

}
