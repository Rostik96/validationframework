package dev.rost.validationframework.validation;


import lombok.Value;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Value(staticConstructor = "of")
public class FieldDesc<T> {
    String name;
    Class<T> type;
}
