package com.ag04.jpaqueue.retry;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.Objects;
import java.util.Optional;

public class FixedDelayRetryPolicy implements RetryPolicy {
    private final Duration delay;

	public FixedDelayRetryPolicy(Duration delay){
        this.delay = Objects.requireNonNull(delay);
    }

    @Override
    public Optional<ZonedDateTime> calculateNextAttemptTime(ZonedDateTime lastAttemptTime, int attemptCount) {
        return Optional.of(lastAttemptTime.plus(delay));
    }
}
