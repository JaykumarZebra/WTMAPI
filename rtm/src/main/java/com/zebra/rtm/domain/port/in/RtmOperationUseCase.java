package com.zebra.rtm.domain.port.in;

import com.zebra.rtm.domain.dto.RtmOperationRequestDto;

// RtmOperationUseCase.java
public interface RtmOperationUseCase {
    //function to perform rtmOperation
    void performRtmOperation(RtmOperationRequestDto requestDto);
}
