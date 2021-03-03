package nl.dtls.fairdatapoint.api.dto.index.settings;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nl.dtls.fairdatapoint.api.validator.ValidDuration;

import javax.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class IndexSettingsRetrievalDTO {
    @NotNull
    @ValidDuration
    private String rateLimitWait;

    @NotNull
    @ValidDuration
    private String timeout;
}
