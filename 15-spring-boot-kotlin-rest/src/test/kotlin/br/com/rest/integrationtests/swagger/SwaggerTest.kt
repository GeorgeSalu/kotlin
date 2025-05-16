package br.com.rest.integrationtests.swagger

import br.com.rest.integrationtests.ConfigsTest
import br.com.rest.integrationtests.testcontainers.AbstractIntegrationTest
import org.junit.Test
import org.springframework.boot.test.context.SpringBootTest
import io.restassured.RestAssured.given
import kotlin.test.assertTrue

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class SwaggerTest() : AbstractIntegrationTest() {

    @Test
    fun shouldDisplaySwaggerUIPage() {
        val content = given()
            .basePath("/swagger-ui/index.html")
            .port(ConfigsTest.SERVER_PORT)
                .`when`()
            .get()
            .then()
                .statusCode(200)
            .extract()
            .body()
                .asString();

        assertTrue(content.contains("Swagger UI"))
    }

}