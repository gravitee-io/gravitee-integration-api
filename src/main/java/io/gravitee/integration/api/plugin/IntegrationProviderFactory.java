/*
 * Copyright © 2015 The Gravitee team (http://gravitee.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.gravitee.integration.api.plugin;

import io.gravitee.node.api.configuration.Configuration;

/**
 * Instances of this interfaces will be autowired in after construction. Injection can be done by setter but not by constructor.
 * @author Remi Baptiste (remi.baptiste at graviteesource.com)
 * @author GraviteeSource Team
 */
public interface IntegrationProviderFactory<I extends IntegrationProvider> {
    /**
     * Create an integration provider using Spring Environment and a Prefix to load the configuration
     * @param id The id of the integration provider.
     * @param environment The Environment where to load the configuration.
     * @param prefix The prefix to use to load the configuration.
     * @return The created integration provider.
     */
    I createIntegrationProvider(String id, Configuration environment, String prefix);
}
