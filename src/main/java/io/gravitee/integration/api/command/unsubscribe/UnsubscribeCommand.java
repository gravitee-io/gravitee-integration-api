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

import io.gravitee.integration.api.command.IntegrationCommand;
import io.gravitee.integration.api.command.IntegrationCommandType;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
public class UnsubscribeCommand extends IntegrationCommand<UnsubscribeCommandPayload> {

    public UnsubscribeCommand() {
        super(IntegrationCommandType.UNSUBSCRIBE);
    }

    public UnsubscribeCommand(final UnsubscribeCommandPayload unsubscribeCommandPayload) {
        this();
        this.payload = unsubscribeCommandPayload;
    }
}
