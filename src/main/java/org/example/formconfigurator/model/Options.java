package org.example.formconfigurator.model;

import lombok.Builder;

import java.util.List;

@Builder
public class Options {

    private List<String> staticOptions;

    static Options of(List<String> staticOptions) {
        return Options.builder()
                .staticOptions(staticOptions)
                .build();
    }

//    List<>
}
