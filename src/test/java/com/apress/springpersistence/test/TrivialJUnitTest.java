package com.apress.springpersistence.test;

import org.junit.Test;
import org.junit.Assert;

public class TrivialJUnitTest {

    @Test
    public void testSimpleStuff() {
        String name = "SpringPersistenceWithHibernate";
        Assert.assertEquals("SpringPersistenceWithHibernate", name);
    }

}
