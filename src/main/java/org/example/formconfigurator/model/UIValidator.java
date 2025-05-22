package org.example.formconfigurator.model;

import lombok.Builder;

@Builder
abstract class UIValidator {
    protected ValidatorType type;
    protected ConditionExpression condition;

    // template method to inject strategy of validator rendering
    abstract void renderValidator();


    // zamodelować fakt, że różne rodzaje inputów mogą mieć różne walidatory
    // np. minValue i maxValue są tylko dla numberów
    // minDate i maxDate tylko dla date
    // minLength i maxLength tylko dla stringów
    // required jest dla wszystkich
    private enum ValidatorType {
        REQUIRED,
        MIN_LENGTH,
        MAX_LENGTH,
        REGEX,
        MIN_VALUE,
        MAX_VALUE,
        MIN_DATE,
        MAX_DATE,
        CUSTOM
    }
}