package org.example.formconfigurator.model;

import lombok.Builder;
import lombok.NonNull;

import java.util.List;

@Builder
record Form(@NonNull String name,
            @NonNull String model,
            @NonNull List<UIControl> controls
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
