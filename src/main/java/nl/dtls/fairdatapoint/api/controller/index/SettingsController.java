package nl.dtls.fairdatapoint.api.controller.index;

import nl.dtls.fairdatapoint.api.dto.index.settings.IndexSettingsDTO;
import nl.dtls.fairdatapoint.api.dto.index.settings.IndexSettingsUpdateDTO;
import nl.dtls.fairdatapoint.service.index.settings.IndexSettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/index/settings")
public class SettingsController {

    @Autowired
    private IndexSettingsService indexSettingsService;

    @RequestMapping(method = RequestMethod.GET)
    @PreAuthorize("hasRole('ADMIN')")
    public IndexSettingsDTO getIndexSettings() {
        return indexSettingsService.getCurrentSettings();
    }

    @RequestMapping(method = RequestMethod.PUT)
    @PreAuthorize("hasRole('ADMIN')")
    public IndexSettingsDTO updateIndexSettings(@RequestBody @Valid IndexSettingsUpdateDTO reqDto) {
        return indexSettingsService.updateSettings(reqDto);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    @PreAuthorize("hasRole('ADMIN')")
    public IndexSettingsDTO resetIndexSettings() {
        return indexSettingsService.resetSettings();
    }
}
