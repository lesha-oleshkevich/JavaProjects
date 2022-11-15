package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("Music")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
