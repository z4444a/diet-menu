package amm.vsu.dm.repository.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import amm.vsu.dm.repository.repository.base.BaseRepositoryImpl;

/**
 * Class for configuring Spring JPA.
 *
 */
@Configuration
@EntityScan("amm.vsu.dm.repository.entity")
@EnableJpaRepositories(basePackages = "amm.vsu.dm.repository.repository",
    repositoryBaseClass = BaseRepositoryImpl.class)
@EnableTransactionManagement
@PropertySource("application.properties")
public class JpaConfig {

}
