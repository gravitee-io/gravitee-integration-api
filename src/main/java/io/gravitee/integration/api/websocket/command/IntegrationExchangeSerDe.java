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
package io.gravitee.integration.api.websocket.command;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.gravitee.exchange.api.websocket.command.DefaultExchangeSerDe;
import io.gravitee.integration.api.command.IntegrationCommandType;
import io.gravitee.integration.api.command.discover.DiscoverCommand;
import io.gravitee.integration.api.command.discover.DiscoverReply;
import io.gravitee.integration.api.command.hello.HelloCommand;
import io.gravitee.integration.api.command.ingest.IngestCommand;
import io.gravitee.integration.api.command.ingest.IngestReply;
import io.gravitee.integration.api.command.ingest.StartIngestCommand;
import io.gravitee.integration.api.command.ingest.StartIngestReply;
import io.gravitee.integration.api.command.subscribe.SubscribeCommand;
import io.gravitee.integration.api.command.subscribe.SubscribeReply;
import io.gravitee.integration.api.command.unsubscribe.UnsubscribeCommand;
import io.gravitee.integration.api.command.unsubscribe.UnsubscribeReply;
import java.util.Map;

/**
 * @author Guillaume LAMIRAND (guillaume.lamirand at graviteesource.com)
 * @author GraviteeSource Team
 */
public class IntegrationExchangeSerDe extends DefaultExchangeSerDe {

    public IntegrationExchangeSerDe(final ObjectMapper objectMapper) {
        super(
            objectMapper,
            Map.ofEntries(
                Map.entry(IntegrationCommandType.HELLO.name(), HelloCommand.class),
                Map.entry(IntegrationCommandType.DISCOVER.name(), DiscoverCommand.class),
                Map.entry(IntegrationCommandType.START_INGEST.name(), StartIngestCommand.class),
                Map.entry(IntegrationCommandType.INGEST.name(), IngestCommand.class),
                Map.entry(IntegrationCommandType.SUBSCRIBE.name(), SubscribeCommand.class),
                Map.entry(IntegrationCommandType.UNSUBSCRIBE.name(), UnsubscribeCommand.class)
            ),
            Map.ofEntries(
                Map.entry(IntegrationCommandType.DISCOVER.name(), DiscoverReply.class),
                Map.entry(IntegrationCommandType.START_INGEST.name(), StartIngestReply.class),
                Map.entry(IntegrationCommandType.INGEST.name(), IngestReply.class),
                Map.entry(IntegrationCommandType.SUBSCRIBE.name(), SubscribeReply.class),
                Map.entry(IntegrationCommandType.UNSUBSCRIBE.name(), UnsubscribeReply.class)
            )
        );
    }
}
