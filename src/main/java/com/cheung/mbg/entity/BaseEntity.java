package com.cheung.mbg.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

@Data
public class BaseEntity implements Serializable {

    private Long id;

    private String creator;
    private String operator;
    private Instant createdTime;
    private Instant updatedTime;
}
