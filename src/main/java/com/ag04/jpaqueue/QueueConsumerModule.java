package com.ag04.jpaqueue;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Optional;

public interface QueueConsumerModule<ID> {

    List<ID> findItemIdsWhereQueueingNextAttemptTimeIsBefore(ZonedDateTime time, int limit);

    Optional<QueueingState> getQueueingStateForItem(ID itemId);

    Optional<QueueingState> processItem(ID itemId, int count, int size);
}
