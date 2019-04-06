package com.demo.licensingservice.controller;

import com.demo.licensingservice.model.License;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Log
@RestController
@RequestMapping(value = "/v1/organizations/{organizationId}/license")
public class LicenseServiceController {

    @RequestMapping(value = "/{licenseId}", method = RequestMethod.GET)
    public License getLicenses(@PathVariable("organizationId") String organizationId, @PathVariable("licenseId") String licenseId) {
        log.info(String.format("organizationId: %s, licenseId: %s", organizationId, licenseId));
        License license = new License();
        license.setLicenseId(licenseId);
        license.setProductName("Teleco");
        license.setLicenseType("Seat");
        license.setOrganizationId(organizationId);
        return license;
    }
}
