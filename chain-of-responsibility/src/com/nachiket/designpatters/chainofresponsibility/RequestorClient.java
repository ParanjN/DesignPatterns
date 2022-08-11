package com.nachiket.designpatters.chainofresponsibility;

public class RequestorClient {
	
	public static AbstractSupportHandler getHandlerChain() {
		
		AbstractSupportHandler technicalSupportHandler = new TechnicalSupportHandler(AbstractSupportHandler.TECHNICAL);
		AbstractSupportHandler billingSupportHandler = new BillingSupportHandler(AbstractSupportHandler.BILLING);
		AbstractSupportHandler generSupportHandler = new GeneralSupportHandler(AbstractSupportHandler.GENERAL);
		
		technicalSupportHandler.setNextHandler(billingSupportHandler);
		billingSupportHandler.setNextHandler(generSupportHandler);
		
		return technicalSupportHandler;
	}

}
