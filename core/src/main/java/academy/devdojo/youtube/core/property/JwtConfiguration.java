package academy.devdojo.youtube.core.property;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "jwt.config")
@Getter
@Setter
@ToString
public class JwtConfiguration {
    private String loginUrl = "/login/**";
    @NestedConfigurationProperty
    private Header header = new Header();
    
    private int expiration = 3600;
    private String privateKey = "19NDLPJVyHxBaO9Ac0AkxpBAEeSeWNrH";
    private String type = "encryted";

    @Data
    public static class Header {
        private String name = "Authorization";
        private String prefix = "Bearer ";
    }
}
