package com.zebra.usermodule.adapter.out;
import com.zebra.usermodule.adapter.out.entity.SessionEventEntity;
import com.zebra.usermodule.adapter.out.repository.SessionEventRepository;
import com.zebra.usermodule.domain.port.out.SessionEventRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SessionEventRepositoryAdapter implements SessionEventRepositoryPort {

    private final SessionEventRepository sessionEventRepository;

    @Override
    public void save(SessionEventEntity event) {
        sessionEventRepository.save(event);
    }
}
