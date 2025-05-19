package org.example.formconfigurator.model;

import java.util.List;

sealed interface WithOptions permits SelectOptionsInput {
    List<String> getOptions();
}
