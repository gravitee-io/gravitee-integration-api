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
package io.gravitee.integration.api.command.unsubscribe;

import io.gravitee.exchange.api.command.CommandStatus;
import io.gravitee.exchange.api.command.Payload;
import io.gravitee.integration.api.command.IntegrationCommandType;
import io.gravitee.integration.api.command.IntegrationReply;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
public class UnsubscribeReply extends IntegrationReply<UnsubscribeReply.Payload> {

    public UnsubscribeReply() {
        super(IntegrationCommandType.UNSUBSCRIBE);
    }

    public UnsubscribeReply(String commandId, String errorDetails) {
        super(IntegrationCommandType.UNSUBSCRIBE, commandId, CommandStatus.ERROR);
        this.errorDetails = errorDetails;
    }

    public UnsubscribeReply(String commandId) {
        super(IntegrationCommandType.UNSUBSCRIBE, commandId, CommandStatus.SUCCEEDED);
        this.payload = new Payload();
    }

    public record Payload() implements io.gravitee.exchange.api.command.Payload {}
}
