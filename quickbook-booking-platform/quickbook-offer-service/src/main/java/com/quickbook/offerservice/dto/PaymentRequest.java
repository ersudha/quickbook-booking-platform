package com.quickbook.offerservice.dto;

import java.util.List;

public class PaymentRequest {
	private Long showId;
    private Integer seatCount;
    private List<String> seatTypes;
    private List<String> offerCodes;
}
