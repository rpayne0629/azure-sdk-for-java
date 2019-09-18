// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.eventhubs.implementation;

import com.azure.core.amqp.exception.AmqpResponseCode;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.io.Closeable;

/**
 * Manages the authorization of the client to the CBS node.
 */
public interface TokenManager extends Closeable {
    /**
     * Invokes an authorization call on the CBS node.
     *
     * @return A Mono that completes with the milliseconds corresponding to when this token should be refreshed.
     */
    Mono<Long> authorize();

    /**
     * Gets a flux of the periodic authorization results from the CBS node. Terminates with an error if the
     * authorization is unsuccessful.
     *
     * @return A {@link Flux} of authorization results from the CBS node.
     */
    Flux<AmqpResponseCode> getAuthorizationResults();
}
