package com.example.tutorial;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.ResponseBodyData;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static com.jayway.restassured.RestAssured.given;
/**
 * @Author: zn.wang
 * @Date: 2018/12/28 23:49:49
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class)
@WebAppConfiguration
public class SearchControllerTest {

    int port = 8080;

    @Before
    public void setUp() throws Exception {
        RestAssured.port = port;
    }

    /**
     * 测试请求串
     * @throws Exception
     */
    @Test
    public void testSearchReqProtoBuf() throws Exception {
        ResponseBodyData body = given()
                .log().all()
                .when()
                .get("/searchreq")
                .then()
                .log().all()
                .extract()
                .body();
    }

    /**
     * 测试响应串
     * @throws Exception
     */
    @Test
    public void testSearchResProtoBuf() throws Exception {
        ResponseBodyData body = given()
                .log().all()
                .when()
                .get("/searchres")
                .then()
                .log().all()
                .extract()
                .body();
    }

}
