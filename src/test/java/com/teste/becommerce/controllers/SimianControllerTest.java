package com.teste.becommerce.controllers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SimianControllerTest {

    @LocalServerPort
    private int port;

    private String payload = "{\"dna\":[\"CTGAGA\",\"CTGAGC\",\"CATTGT\",\"CGAGGG\",\"CCCCTA\",\"TCACTG\"]}";
    private String payloadIvalid = "{\"dna\":[\"CFGAGA\",\"CTGAGC\",\"CATTGT\",\"CGAGGG\",\"CCCCTA\",\"TCACTG\"]}";
    private String payloadNotSimian = "{\"dna\":[\"CTGAGA\",\"CTAAGC\",\"CATCGT\",\"AGAACG\",\"CCTCAA\",\"TCACTG\"]}";


    @Test
    public void testeIsSimian() {
        RestAssured.given()
                .contentType(ContentType.JSON)
                .body(payload)
                .when().post("http://localhost:"+port+"/simian")
                .then()
                .assertThat()
                .statusCode(200);
    }

    @Test
    public void testeNotSimian() {
        RestAssured.given()
                .contentType(ContentType.JSON)
                .body(payloadNotSimian)
                .when().post("http://localhost:"+port+"/simian")
                .then()
                .assertThat()
                .statusCode(403);
    }

    @Test
    public void testeInvalid() {
        RestAssured.given()
                .contentType(ContentType.JSON)
                .body(payloadIvalid)
                .when().post("http://localhost:"+port+"/simian")
                .then()
                .assertThat()
                .statusCode(400);
    }

}