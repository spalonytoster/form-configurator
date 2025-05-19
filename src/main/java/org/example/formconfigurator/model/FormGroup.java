package org.example.formconfigurator.model;

import lombok.Builder;

import java.util.List;

@Builder
record FormGroup(
        String name,
        String model,
        List<UIControl> controls
) implements UIControl {
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getModel() {
        return model;
    }
}
