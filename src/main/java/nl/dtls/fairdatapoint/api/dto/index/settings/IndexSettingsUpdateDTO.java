package nl.dtls.fairdatapoint.api.dto.index.settings;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class IndexSettingsUpdateDTO {
    @NotNull
    private IndexSettingsRetrievalDTO retrieval;

    @NotNull
    private IndexSettingsPingDTO ping;
}
