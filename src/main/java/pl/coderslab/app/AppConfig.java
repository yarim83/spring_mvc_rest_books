package pl.coderslab.app;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "pl.coderslab")
public class AppConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedMethods("GET", "POST", "PUT", "DELETE");
                //.allowedOrigins("http://localhost");
    }

//    @Bean
//    public ViewResolver viewResolver() {
//        InternalResourceViewResolver viewResolver =
//                new InternalResourceViewResolver();
//        viewResolver.setPrefix("/WEB-INF/views/");
//        viewResolver.setSuffix(".jsp");
//        return viewResolver;
//    }
//
//    @Override
//    public void configureDefaultServletHandling(
//            DefaultServletHandlerConfigurer configurer) {
//        configurer.enable();
//    }
}
