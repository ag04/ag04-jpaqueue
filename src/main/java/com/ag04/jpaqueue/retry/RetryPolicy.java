package com.ag04.jpaqueue.retry;

import java.time.ZonedDateTime;
import java.util.Optional;

public interface RetryPolicy {
    Optional<ZonedDateTime> calculateNextAttemptTime(ZonedDateTime lastAttemptTime, int attemptCount);
}
