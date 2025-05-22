package org.example.formconfigurator.model;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpMethod;

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
                                                        .options(PredefinedOptions.of("car", "motorcycle", "truck"))
                                                        .validators(List.of(""))
                                                        .model("type")
                                                        .name("vehicleType")
                                                        .label("Typ pojazdu")
                                                        .build(),
                                                SelectOptionsInput.builder()
                                                        .options(RemoteOptions.builder()
                                                                .url("http://localhost:8080/api/config/dictionaries")
                                                                .resourceId("carMakesDict")
                                                                // default is GET
                                                                .build())
                                                        .name("vehicleMake")
                                                        .model("make")
                                                        .label("Marka pojazdu")
                                                        .build(),
                                                SelectOptionsInput.builder()
                                                        .name("vehicleModel")
                                                        .model("model")
                                                        .label("Model pojazdu")
                                                        .build(),
                                                TextInput.builder()
                                                        .name("productionYear")
                                                        .model("productionYear")
                                                        .label("Rok produkcji")
                                                        .validators(List.of(

                                                        ))
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