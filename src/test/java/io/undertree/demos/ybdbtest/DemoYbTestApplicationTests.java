package io.undertree.demos.ybdbtest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.testcontainers.junit.jupiter.Testcontainers;

@SpringBootTest
@ActiveProfiles("test")
class DemoYbTestApplicationTests {

	// this is slow because it triggers flyway and the test container stuff
	@Test
	void contextLoads() {
	}

}
