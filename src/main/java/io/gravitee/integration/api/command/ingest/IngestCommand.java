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

package io.gravitee.integration.api.command.ingest;

import io.gravitee.exchange.api.command.Payload;
import io.gravitee.integration.api.command.IntegrationCommand;
import io.gravitee.integration.api.command.IntegrationCommandType;
import io.gravitee.integration.api.model.Api;
import java.util.List;
import lombok.Builder;
import lombok.EqualsAndHashCode;

/**
 * @author Remi Baptiste (remi.baptiste at graviteesource.com)
 * @author GraviteeSource Team
 */
@EqualsAndHashCode(callSuper = true)
public class IngestCommand extends IntegrationCommand<IngestCommand.Payload> {

    public IngestCommand() {
        super(IntegrationCommandType.INGEST);
    }

    public IngestCommand(final IngestCommand.Payload ingestCommandPayload) {
        this();
        this.payload = ingestCommandPayload;
    }

    public IngestCommand(String ingestJobId, List<Api> apis, boolean done) {
        this(new Payload(ingestJobId, apis, done));
    }

    /**
     * Data structure for the Ingest command.
     * @param ingestJobId the ID of the ingest job.
     * @param apis the list of APIs to ingest.
     * @param done true if no more APIs to ingest after this command.
     */
    @Builder
    public record Payload(String ingestJobId, List<Api> apis, boolean done) implements io.gravitee.exchange.api.command.Payload {
        public Payload(List<Api> apis) {
            this(null, apis, false);
        }
    }
}
