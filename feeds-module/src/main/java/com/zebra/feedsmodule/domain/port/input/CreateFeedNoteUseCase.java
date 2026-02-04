package com.zebra.feedsmodule.domain.port.input;

import com.zebra.feedsmodule.domain.model.FeedNote;

import java.util.UUID;

//input port for the useCase of creating feedNote
public interface CreateFeedNoteUseCase {
    FeedNote createFeedNote(UUID feedId, String message);
}
