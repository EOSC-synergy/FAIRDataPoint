package nl.dtls.fairdatapoint.api.dto.index.settings;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nl.dtls.fairdatapoint.api.validator.ValidDuration;

import javax.validation.constraints.NotNull;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class IndexSettingsPingDTO {
    @NotNull
    @ValidDuration
    private String validDuration;
    @NotNull
    @ValidDuration
    private String rateLimitDuration;
    @NotNull
    @ValidDuration
    private Integer rateLimitHits;
    @NotNull
    private List<String> denyList;
}
