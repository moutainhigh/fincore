/*
 * Copyright (c) ${year}, 资邦金服（上海）网络科技有限公司. All Rights Reserved.
 *
 */
package com.zillionfortune.boss.web.controller.op.menu.vo;

import com.zillionfortune.boss.common.dto.BaseRequest;

/**
 * ClassName: MenuDeleteRequestVo <br/>
 * Function: 删除菜单Request. <br/>
 * Date: 2017年2月22日 上午10:11:08 <br/>
 *
 * @author wangzinan_tech@zillionfortune.com
 * @version 
 * @since JDK 1.7
 */
public class MenuDeleteRequestVo extends BaseRequest {

	private static final long serialVersionUID = 1L;
	
	/**
	 * menuId:菜单Id.
	 */
	private Integer menuId;

	/**
	 * deleteBy:删除人.
	 */
	private String deleteBy;

	/**
	 * 获取menuId的值.
	 *
	 * @return menuId
	 */
	public Integer getMenuId() {
		return menuId;
	}

	/**
	 * 设置menuId的值.
	 *
	 * @param  menuId
	 */
	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}

	/**
	 * 获取deleteBy的值.
	 *
	 * @return deleteBy
	 */
	public String getDeleteBy() {
		return deleteBy;
	}

	/**
	 * 设置deleteBy的值.
	 *
	 * @param  deleteBy
	 */
	public void setDeleteBy(String deleteBy) {
		this.deleteBy = deleteBy;
	}
	
}
