package dev.rost.validationframework.dto;

import dev.rost.validationframework.validation.TextLengthIsNumber;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@TextLengthIsNumber
public class UpdateDto {
    int number;
    String text;
    List<NestedUpdateDto> nested;
}
