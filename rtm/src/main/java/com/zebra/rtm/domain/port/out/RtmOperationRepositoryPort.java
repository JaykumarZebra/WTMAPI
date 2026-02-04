package com.zebra.rtm.domain.port.out;


import com.zebra.rtm.adapter.out.entity.RTMEntity;
import org.springframework.modulith.NamedInterface;

@NamedInterface
public interface RtmOperationRepositoryPort {
    void save(RTMEntity rtmOperation);
}
