package io.undertree.demos.ybdbtest;

import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.testcontainers.containers.YugabyteDBYSQLContainer;

import javax.sql.DataSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.*;

@DataJpaTest
@ActiveProfiles("testcontainer")
//@Testcontainers <- seems to be autodiscovered
@AutoConfigureTestDatabase(replace = NONE)
public class JpaTests {

//    @Configuration
//    @EnableJpaRepositories
//    //@EntityScan
//    //@EnableTransactionManagement
//    static class Config {
//    }

//    static {
//        sqlContainer = new YugabyteDBYSQLContainer("postgres:10.7")
//                .
//                .withDatabaseName("integration-tests-db")
//                .withUsername("sa")
//                .withPassword("sa");
//        sqlContainer.start();
//    }

    @Autowired
    private DataSource dataSource;

    @Autowired
    private EntityManager entityManager;

    @Test
    void injectedComponentsAreNotNull() {
        assertThat(dataSource).isNotNull();
        assertThat(entityManager).isNotNull();
    }
}
