package com.retosincrono.reto.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Date;

@Data
public class ClientRequestBody {
    @NotBlank(message = "Name cannot be empty")
    @NotNull(message = "Name cannot be null")
    private String name;

    @NotBlank(message = "Father name cannot be empty")
    @NotNull(message = "Father name cannot be null")
    private String fatherLastName;

    private String motherLastName;

    private Date creationDate;

    private Boolean isActive;

    public ClientRequestBody() {

    }
}
