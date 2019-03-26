package com.zb.fincore.ams.facade.impl;

import com.zb.fincore.ams.common.dto.PageQueryResponse;
import com.zb.fincore.ams.common.exception.ExceptionHandler;
import com.zb.fincore.ams.facade.AssetPoolRelationServiceFacade;
import com.zb.fincore.ams.facade.dto.req.CreateAssetPoolRelationRequest;
import com.zb.fincore.ams.facade.dto.req.QueryAssetListForManageRequest;
import com.zb.fincore.ams.facade.dto.req.QueryAssetPoolRelationRequest;
import com.zb.fincore.ams.facade.dto.req.QueryPoolAssetListRequest;
import com.zb.fincore.ams.facade.dto.resp.CreateAssetPoolRelationResponse;
import com.zb.fincore.ams.facade.model.AssetModel;
import com.zb.fincore.ams.facade.model.AssetPoolRelationModel;
import com.zb.fincore.ams.service.AssetPoolRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 功能: 资产池资产匹配关系服务接口
 * 创建: liuchongguang - liuchongguang@zillionfortune.com
 * 日期: 2017/4/21 0021 14:08
 * 版本: V1.0
 */
@Service
public class AssetPoolRelationServiceFacadeImpl implements AssetPoolRelationServiceFacade {

    @Autowired
    private AssetPoolRelationService assetPoolRelationService;

    @Autowired
    private ExceptionHandler exceptionHandler;

    /**
     * 创建资产资产池关联关系
     *
     * @param req 创建资产资产池关联关系请求对象
     * @return 创建资产资产池关联关系响应对象
     */
    @Override
    public CreateAssetPoolRelationResponse createAssetPoolRelation(CreateAssetPoolRelationRequest req) {
        try {
            return assetPoolRelationService.createAssetPoolRelation(req);
        } catch (Exception e) {
            return exceptionHandler.handleException(e, CreateAssetPoolRelationResponse.class);
        }
    }

    /**
     * 查询资产资产池关联关系
     *
     * @param req 查询资产资产池关联关系请求对象
     * @return 查询资产资产池关联关系响应对象
     */
    @Override
    public PageQueryResponse<AssetPoolRelationModel> queryAssetPoolRelation(QueryAssetPoolRelationRequest req) {
        try {
            return assetPoolRelationService.queryAssetPoolRelation(req);
        } catch (Exception e) {
            return exceptionHandler.handleException(e, PageQueryResponse.class);
        }
    }

    /**
     * 查询资产池可匹配资产列表
     */
    @Override
    public PageQueryResponse<AssetModel> queryPoolAssetList(QueryPoolAssetListRequest req) {
        try {
            return assetPoolRelationService.queryPoolAssetList(req);
        } catch (Exception e) {
            return exceptionHandler.handleException(e, PageQueryResponse.class);
        }
    }
}
