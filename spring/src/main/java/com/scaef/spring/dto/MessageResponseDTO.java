package com.scaef.spring.dto;

import lombok.Data;
import lombok.Builder;

@Data
@Builder
public class MessageResponseDTO {
    private String message;
}