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

package io.gravitee.integration.api.model;

import java.util.Map;
import lombok.Builder;

/**
 * @author Remi Baptiste (remi.baptiste at graviteesource.com)
 * @author GraviteeSource Team
 */
@Builder
public record Subscription(
    String graviteeApiId,
    String graviteeApplicationId,
    String graviteeUserId,
    String graviteeSubscriptionId,
    String graviteeEnvironmentId,
    String graviteeOrganizationId,
    String reason,
    SubscriptionType type,

    String apiKey,
    Map<String, String> metadata
) {}
