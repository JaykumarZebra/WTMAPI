package com.zebra.usermodule.domain.port.out;


import com.zebra.usermodule.adapter.out.entity.SessionEventEntity;
import org.springframework.modulith.NamedInterface;

@NamedInterface
public interface SessionEventRepositoryPort {
    void save(SessionEventEntity event);
}
