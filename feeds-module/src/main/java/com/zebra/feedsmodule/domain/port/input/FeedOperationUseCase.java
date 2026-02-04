package com.zebra.feedsmodule.domain.port.input;

import com.zebra.feedsmodule.domain.dto.FeedOperationRequestDto;

public interface FeedOperationUseCase {
    void performFeedOperation(FeedOperationRequestDto requestDto);
}
