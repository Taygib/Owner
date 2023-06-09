package qa.guru.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qa.guru.owner.config.AuthConfig;
import static org.assertj.core.api.Assertions.assertThat;

public class AuthTest {

    @Test
    public void testAuthClasspath() {
        AuthConfig config = ConfigFactory.create(AuthConfig.class, System.getProperties());

        assertThat(config.username()).isEqualTo("iliyasov");
        assertThat(config.password()).isEqualTo("123123123");

    }
}
