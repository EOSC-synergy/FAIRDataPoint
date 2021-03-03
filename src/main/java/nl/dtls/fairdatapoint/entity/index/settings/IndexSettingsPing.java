package nl.dtls.fairdatapoint.entity.index.settings;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.time.Duration;
import java.util.Collections;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder(toBuilder = true)
@EqualsAndHashCode
public class IndexSettingsPing {
    @NotNull
    private Duration validDuration;

    @NotNull
    private Duration rateLimitDuration;

    @NotNull
    private Integer rateLimitHits;

    @NotNull
    private List<String> denyList;

    public static IndexSettingsPing getDefault() {
        IndexSettingsPing ping = new IndexSettingsPing();
        ping.setValidDuration(Duration.ofDays(7));
        ping.setRateLimitDuration(Duration.ofHours(6));
        ping.setRateLimitHits(10);
        ping.setDenyList(Collections.singletonList("^(http|https)://localhost(:[0-9]+){0,1}.*$"));
        return ping;
    }
}
