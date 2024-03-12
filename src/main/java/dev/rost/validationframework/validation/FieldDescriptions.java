package dev.rost.validationframework.validation;

import java.util.Collection;

public class FieldDescriptions {
    static FieldDesc<Integer> number = FieldDesc.of("number", Integer.class);
    static FieldDesc<String> text = FieldDesc.of("text", String.class);
    static FieldDesc<Boolean> flag = FieldDesc.of("flag", Boolean.class);

    static FieldDesc<Collection> nested = FieldDesc.of("nested", Collection.class);
}
