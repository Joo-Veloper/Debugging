package io.debugging.trace.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "io.debugging.trace")
@EnableAspectJAutoProxy
public class ProjectConfig {
}
