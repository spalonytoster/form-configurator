package org.example.formconfigurator.model;

import lombok.AccessLevel;
import lombok.Builder;

import java.util.List;

@Builder(access = AccessLevel.PRIVATE)
record PredefinedOptions(List<String> options) implements SelectOptions {

    static PredefinedOptions of(String ...options) {
        return PredefinedOptions.builder()
                .options(List.of(options))
                .build();
    }
}
