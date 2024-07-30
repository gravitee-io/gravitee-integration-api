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

package io.gravitee.integration.api.command.hello;

import io.gravitee.integration.api.command.IntegrationCommand;
import io.gravitee.integration.api.command.IntegrationCommandType;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Remi Baptiste (remi.baptiste at graviteesource.com)
 * @author GraviteeSource Team
 */
public class HelloCommand extends IntegrationCommand<HelloCommand.Payload> {

    public HelloCommand() {
        super(IntegrationCommandType.HELLO);
    }

    public HelloCommand(final String originalCommandId, final HelloCommand.Payload helloCommandPayload) {
        this();
        this.id = originalCommandId;
        this.payload = helloCommandPayload;
    }

    public HelloCommand(final String originalCommandId, final String targetId, final String provider) {
        this();
        this.id = originalCommandId;
        this.payload = new Payload(targetId, provider);
    }

    @Getter
    @Setter
    public static class Payload extends io.gravitee.exchange.api.command.hello.HelloCommandPayload {

        private String provider;

        public Payload(final String targetId, final String provider) {
            super(targetId);
            this.provider = provider;
        }
    }
}
