package com.zillionfortune.boss.web.controller.op.history.vo;

import com.zillionfortune.boss.common.dto.BasePageRequest;

/**
 * ClassName: HistoryQueryByPageRequestVo <br/>
 * Function: 查询日志（分页）Request. <br/>
 * Date: 2017年2月27日 下午2:28:28 <br/>
 *
 * @author wangzinan_tech@zillionfortune.com
 * @version 
 * @since JDK 1.7
 */
public class HistoryQueryByPageRequestVo extends BasePageRequest {
	
	private static final long serialVersionUID = 1L;

	/**
	 * userName:用户名.
	 */
	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
