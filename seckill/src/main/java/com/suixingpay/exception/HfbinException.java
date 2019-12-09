package com.suixingpay.exception;

import com.suixingpay.entity.CodeMsg;

public class HfbinException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	private CodeMsg cm;
	
	public HfbinException(CodeMsg cm) {
		super(cm.toString());
		this.cm = cm;
	}
	public CodeMsg getCm() {
		return cm;
	}

}
