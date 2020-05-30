package com.xcodeassociated.events.converter;

import com.fasterxml.jackson.databind.util.StdConverter;
import java.util.Optional;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.text.WordUtils;

public class CapitalizeConverter extends StdConverter<String, String> {

    private static final char[] SURNAME_DELIMITERS = {' ', '-'};

    @Override
    public String convert(String value) {
        return Optional.ofNullable(value)
            .filter(StringUtils::isNotBlank)
            .map(s -> WordUtils.capitalizeFully(s, SURNAME_DELIMITERS))
            .orElse(null);
    }
}
