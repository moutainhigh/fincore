package com.zb.fincore.ams.facade.dto.req;

import java.io.Serializable;

public class QueryAssetTransactionRequest implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7530423948993076014L;
	
	private int pageNo;
	private int pageSize;
	
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
}
