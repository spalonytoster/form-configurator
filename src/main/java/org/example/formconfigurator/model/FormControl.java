package org.example.formconfigurator.model;

import lombok.Builder;
import lombok.Getter;
import org.springframework.expression.Expression;

import java.util.List;

@Builder
abstract sealed class FormControl implements UIControl permits SelectOptionsInput, TextInput {
        @Getter protected String name;
        @Getter protected String model;

        protected String label;
        protected boolean disabled;
        protected boolean required;
        protected boolean visible;

        protected List<UIValidator> validators;

        protected Expression valueDynamic;
        protected String value; // to może być object, pod warunkiem, że w module powstaną dedykowane convertery złożonych typów do stringa (np. LocalDateTime)
}
