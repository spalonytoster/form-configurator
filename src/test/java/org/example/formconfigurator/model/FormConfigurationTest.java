package org.example.formconfigurator.model;

import org.junit.jupiter.api.Test;

import java.util.List;

class FormConfigurationTest {

    @Test
    void builder() {
        FormConfiguration.builder()
                .form(Form.builder()
                        .name("exampleForm")
                        .model("form")
                        .controls(List.of(
                                FormGroup.builder()
                                        .name("vehicleFromGroup")
                                        .controls(List.of(
                                                SelectOptionsInput.builder()
                                                        .options(List.of("car", "motorcycle", "truck"))
                                                        .model("type")
                                                        .name("vehicleType")
                                                        .label("Typ pojazdu")
                                                        .build(),
                                                SelectOptionsInput.builder()
                                                        .name("vehicleMake")
                                                        .model("make")
                                                        .label("Marka pojazdu")
                                                        .build(),
                                                SelectOptionsInput.builder()
                                                        .name("vehicleModel")
                                                        .model("model")
                                                        .label("Model pojazdu")
                                                        .build(),
                                                SelectOptionsInput.builder()
                                                        .name("productionYear")
                                                        .model("productionYear")
                                                        .label("Rok produkcji")
                                                        .build()
                                        ))
                                        .build(),

                                FormGroup.builder()
                                        .name("addressFromGroup")
                                        .build()
                        ))
                        .build())
                .build();
    }
}