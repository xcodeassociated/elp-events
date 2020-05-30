package com.xcodeassociated.events.converter;

import com.fasterxml.jackson.databind.util.StdConverter;
import java.util.Optional;
import org.apache.commons.lang3.StringUtils;

public class BlankValueConverter extends StdConverter<String, String> {

    @Override
    public String convert(String value) {
        return Optional.ofNullable(value).filter(StringUtils::isNotBlank).orElse(null);
    }
}
