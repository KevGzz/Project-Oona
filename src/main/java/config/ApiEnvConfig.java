package config;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Configuration;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Configuration
public class ApiEnvConfig {
    private String access_token;
    private String token_type;
    private int expires_in;
    private String scope;
    private long user_id;
    private String refresh_token;
}
