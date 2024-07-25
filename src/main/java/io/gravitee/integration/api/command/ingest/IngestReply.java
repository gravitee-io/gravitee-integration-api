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

import io.gravitee.exchange.api.command.CommandStatus;
import io.gravitee.integration.api.command.IntegrationCommandType;
import io.gravitee.integration.api.command.IntegrationReply;
import lombok.Builder;
import lombok.EqualsAndHashCode;

/**
 * @author Remi Baptiste (remi.baptiste at graviteesource.com)
 * @author GraviteeSource Team
 */
@Builder
@EqualsAndHashCode(callSuper = true)
public class IngestReply extends IntegrationReply<IngestReply.Payload> {

    public IngestReply() {
        super(IntegrationCommandType.INGEST);
    }

    public IngestReply(String commandId, String errorDetails) {
        super(IntegrationCommandType.INGEST, commandId, CommandStatus.ERROR);
        this.errorDetails = errorDetails;
    }

    public IngestReply(String commandId, IngestReply.Payload ingestReplyPayload) {
        super(IntegrationCommandType.INGEST, commandId, CommandStatus.SUCCEEDED);
        this.payload = ingestReplyPayload;
    }

    public IngestReply(String commandId) {
        this(commandId, new Payload());
    }

    public record Payload() implements io.gravitee.exchange.api.command.Payload {}
}
