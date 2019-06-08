package com.ag04.jpaqueue.retry;

import java.time.LocalDateTime;
import java.util.Optional;

public interface RetryPolicy {
    Optional<LocalDateTime> calculateNextAttemptTime(LocalDateTime lastAttemptTime, int attemptCount);
}
