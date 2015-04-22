package com.apress.springpersistence.audiomanager.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.apress.springpersistence.audiomanager.SpringMusicApplication;
import com.apress.springpersistence.audiomanager.domain.Person;
import com.apress.springpersistence.audiomanager.service.PersonRepository;

@Transactional()
@TransactionConfiguration(defaultRollback = true)
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringMusicApplication.class)
public class IntegrationJUnitTest {

    Person person;

    @Autowired
    PersonRepository personRepository;

    @Before
    public void setUp() {
        person = new Person();
        person.setName("Test User");
        personRepository.save(person);
    }

    @After
    public void tearDown() {
        personRepository.delete(person);
        person = null;
    }

    @Test
    public void testPersonPersisted() {
        // recall that our import.sql for this context is inserting 2 users before these tests run
        Assert.assertEquals(3, this.personRepository.count());
    }

}
