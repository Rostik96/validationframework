package dev.rost.validationframework.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NestedUpdateDto {
    private String text;
    private boolean flag;
}
