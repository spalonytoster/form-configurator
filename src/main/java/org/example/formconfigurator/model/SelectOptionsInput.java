package org.example.formconfigurator.model;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
final class SelectOptionsInput extends FormControl implements WithOptions {
        @Getter private SelectOptions options;
}
