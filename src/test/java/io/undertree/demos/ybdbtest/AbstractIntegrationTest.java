package io.undertree.demos.ybdbtest;

import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.YugabyteDBYSQLContainer;
import org.testcontainers.junit.jupiter.Container;

public class AbstractIntegrationTest {

    private static final String ENTRYPOINT = "bin/yugabyted start --background=false --tserver_flags=\"--yb_enable_read_committed_isolation=true\"";

//    @Container
//    public static YugabyteDBYSQLContainer container = new YugabyteDBYSQLContainer("yugabytedb/yugabyte:2.16.3.0-b43")
//            .withDatabaseName("yugabyte")
//            .withUsername("yugabyte")
//            .withPassword("yugabyte")
//            //.withCommand(ENTRYPOINT)
//            .withReuse(true);
//
//    @DynamicPropertySource
//    static void datasourceProps(final DynamicPropertyRegistry registry) {
//        registry.add("spring.datasource.url", container::getJdbcUrl);
//        registry.add("spring.datasource.username", container::getUsername);
//        registry.add("spring.datasource.password", container::getPassword);
//        registry.add("spring.datasource.driver-class-name", () -> "com.yugabyte.Driver");
//    }
}
