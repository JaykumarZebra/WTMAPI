package com.zebra.rtm.adapter.out;


import com.zebra.rtm.adapter.out.entity.RTMEntity;
import com.zebra.rtm.adapter.out.repository.RtmOperationRepository;
import com.zebra.rtm.domain.port.out.RtmOperationRepositoryPort;
import org.springframework.stereotype.Component;

@Component
public class RtmOperationRepositoryAdapter implements RtmOperationRepositoryPort {

    private final RtmOperationRepository rtmOperationRepository;

    public RtmOperationRepositoryAdapter(RtmOperationRepository rtmOperationRepository) {
        this.rtmOperationRepository = rtmOperationRepository;
    }

    //to save in DB
    @Override
    public void save(RTMEntity rtmOperation) {
         rtmOperationRepository.save(rtmOperation);
    }
}


