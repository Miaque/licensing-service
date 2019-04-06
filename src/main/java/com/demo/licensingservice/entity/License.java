package com.demo.licensingservice.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class License implements Serializable {

    private String id;

    private String productName;

    private String licenseType;

    private String  organizationId;
}
