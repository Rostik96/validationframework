package dev.rost.validationframework.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NestedCreateDto {
    private String text;
    private boolean flag;
}
