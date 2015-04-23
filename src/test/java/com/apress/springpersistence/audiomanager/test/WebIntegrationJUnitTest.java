package com.apress.springpersistence.audiomanager.test;

import org.apache.http.HttpStatus;
import static org.hamcrest.Matchers.*;
import static com.jayway.restassured.module.mockmvc.RestAssuredMockMvc.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.apress.springpersistence.audiomanager.AudioManagerApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AudioManagerApplication.class)
@WebIntegrationTest
public class WebIntegrationJUnitTest {

    @Test
    public void canFetchPlaylist() {
        when().
                get("/playlists/1").
                then().
                statusCode(HttpStatus.SC_OK).
                body("name", is(equalTo("Classic Rock")));
    }

}
