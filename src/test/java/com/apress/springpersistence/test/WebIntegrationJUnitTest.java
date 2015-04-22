package com.apress.springpersistence.test;

import org.apache.http.HttpStatus;
import static org.hamcrest.Matchers.*;
import static com.jayway.restassured.RestAssured.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.apress.springpersistence.SpringMusicApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringMusicApplication.class)
@WebIntegrationTest
public class WebIntegrationJUnitTest {

    @Test
    public void canFetchPlaylist() {
        when().
                get("/playlists/1").
                then().
                statusCode(HttpStatus.SC_OK).
                body("name", equalTo("Classic Rock"));
    }

}
