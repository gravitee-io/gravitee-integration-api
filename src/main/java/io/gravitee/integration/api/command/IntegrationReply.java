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
package io.gravitee.integration.api.command;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.gravitee.exchange.api.command.CommandStatus;
import io.gravitee.exchange.api.command.Payload;
import io.gravitee.exchange.api.command.Reply;
import io.gravitee.integration.api.command.fetch.FetchReply;
import io.gravitee.integration.api.command.list.ListReply;

/**
 * @author Guillaume LAMIRAND (guillaume.lamirand at graviteesource.com)
 * @author GraviteeSource Team
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class IntegrationReply<P extends Payload> extends Reply<P> {

    protected IntegrationReply(final IntegrationCommandType type) {
        super(type.name());
    }

    protected IntegrationReply(IntegrationCommandType type, String commandId, CommandStatus commandStatus) {
        super(type.name(), commandId, commandStatus);
    }
}
