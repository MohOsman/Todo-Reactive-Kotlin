package com.osman.todo

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.reactive.server.WebTestClient

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class TaskControllerTest (@Autowired val client: WebTestClient) {



   @Test
    fun `get Task that exist successfully `() {
        client.get().uri("/task/2")
                .exchange()
                .expectStatus().isOk
    }

    @Test
    fun `task that doesn't exist should return 404  `() {
        client.get().uri("/task/3")
                .exchange()
                .expectStatus().isNotFound
    }
}