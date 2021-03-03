package nl.dtls.fairdatapoint.entity.index.settings;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.time.Duration;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder(toBuilder = true)
@EqualsAndHashCode
public class IndexSettingsRetrieval {
    @NotNull
    private Duration rateLimitWait;

    @NotNull
    private Duration timeout;

    public static IndexSettingsRetrieval getDefault() {
        IndexSettingsRetrieval retrieval = new IndexSettingsRetrieval();
        retrieval.setRateLimitWait(Duration.ofMinutes(10));
        retrieval.setTimeout(Duration.ofMinutes(1));
        return retrieval;
    }
}
