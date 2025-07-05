package cofim;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry reg) {
                reg.addMapping("/api/**")            // pattern URL cho phép
                        .allowedOrigins("http://127.0.0.1:5500",
                                "http://localhost:5500")  // FE đang chạy
                        .allowedMethods("*")              // GET,POST,...
                        .allowedHeaders("*")              // Header tuỳ ý
                        .allowCredentials(true);          // Cho gửi cookie/token
            }
        };
    }
}
