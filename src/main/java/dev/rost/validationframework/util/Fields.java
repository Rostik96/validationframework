package dev.rost.validationframework.util;

import dev.rost.validationframework.validation.FieldDesc;
import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.reflect.FieldUtils;


@UtilityClass
public class Fields {

    @SneakyThrows
    public static <T> T get(Object obj, FieldDesc<T> fieldDesc) {
        var field = obj.getClass().getDeclaredField(fieldDesc.getName());
        field.setAccessible(true);
        return fieldDesc.getType().cast(field.get(obj));
    }


    @SneakyThrows
    public static Object get(Object obj, String fieldName) {
        return FieldUtils.readDeclaredField(obj, fieldName, true);
    }
}
