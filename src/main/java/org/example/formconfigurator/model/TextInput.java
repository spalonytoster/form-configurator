package org.example.formconfigurator.model;

import lombok.experimental.SuperBuilder;

@SuperBuilder
final class TextInput extends FormControl {
    private int minLength;
    private int maxLength;
    private String regex;
}
