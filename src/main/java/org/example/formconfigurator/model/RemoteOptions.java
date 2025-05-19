package org.example.formconfigurator.model;

import lombok.Builder;

@Builder
record RemoteOptions(
        String url,
        String httpMethod,
        String resourceId) implements SelectOptions {
}
