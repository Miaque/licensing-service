package com.demo.licensingservice.repository;

import com.demo.licensingservice.model.License;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LicenseRepository extends CrudRepository<License, String> {

    public List<License> findByOrOrganizationId(String organizationId);

    public License findByOrganizationIdAndLicenseId(String organizationId, String licenseId);
}