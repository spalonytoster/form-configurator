package org.example.formconfigurator.model;

import lombok.Builder;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Builder
class FormConfiguration {
    private UUID id;
    private Long version;
    private Object audit;

    private Form form;
}
