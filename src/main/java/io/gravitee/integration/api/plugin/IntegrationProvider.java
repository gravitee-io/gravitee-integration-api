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

import io.gravitee.common.component.LifecycleComponent;
import io.gravitee.integration.api.model.Api;
import io.gravitee.integration.api.model.IngestStarted;
import io.gravitee.integration.api.model.Subscription;
import io.gravitee.integration.api.model.SubscriptionResult;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import java.util.List;

/**
 * @author Remi Baptiste (remi.baptiste at graviteesource.com)
 * @author GraviteeSource Team
 */
public interface IntegrationProvider extends LifecycleComponent<IntegrationProvider> {
    Flowable<Api> discover();

    Single<IngestStarted> startIngest(String ingestJobId, List<String> apiIds);

    Single<SubscriptionResult> subscribe(String apiId, Subscription subscription);

    Completable unsubscribe(String apiId, Subscription subscription);
}
