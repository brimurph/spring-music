package com.apress.springpersistence.audiomanager.test;

import org.junit.Test;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.apress.springpersistence.audiomanager.domain.Person;
import com.apress.springpersistence.audiomanager.AudioManagerApplication;
import com.apress.springpersistence.audiomanager.service.PersonRepository;

@Transactional()
@TransactionConfiguration(defaultRollback = true)
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AudioManagerApplication.class)
public class IntegrationJUnitTest {

    Person person;

    @Autowired
    PersonRepository personRepository;

    @Before
    public void setUp() {
        person = Person.builder().name("Test User").build();
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
