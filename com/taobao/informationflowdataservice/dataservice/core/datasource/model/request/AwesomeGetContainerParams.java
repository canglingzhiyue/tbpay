package com.taobao.informationflowdataservice.dataservice.core.datasource.model.request;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.model.datamodel.request.IContainerParams;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetPageData;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes7.dex */
public class AwesomeGetContainerParams implements IContainerParams<AwesomeGetPageData>, IMTOPDataObject {
    private long baseCacheTime;
    private JSONObject bizParams;
    private long clientReqOffsetTime;
    private long clientReqTime;
    private long deltaCacheTime;
    private List<String> deltaSections;
    private AwesomeGetPageData pageParams;
    private JSONObject passParams;
    private long realBaseCacheTime;
    private String requestType;

    static {
        kge.a(-1871239835);
        kge.a(-949421589);
        kge.a(-350052935);
    }

    public String getRequestType() {
        return this.requestType;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IContainerParams
    public void setRequestType(String str) {
        this.requestType = str;
    }

    public long getBaseCacheTime() {
        return this.baseCacheTime;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IContainerParams
    public void setBaseCacheTime(long j) {
        this.baseCacheTime = j;
    }

    public long getRealBaseCacheTime() {
        return this.realBaseCacheTime;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IContainerParams
    public void setRealBaseCacheTime(long j) {
        this.realBaseCacheTime = j;
    }

    public long getDeltaCacheTime() {
        return this.deltaCacheTime;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IContainerParams
    public void setDeltaCacheTime(long j) {
        this.deltaCacheTime = j;
    }

    public long getClientReqTime() {
        return this.clientReqTime;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IContainerParams
    public void setClientReqTime(long j) {
        this.clientReqTime = j;
    }

    public long getClientReqOffsetTime() {
        return this.clientReqOffsetTime;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IContainerParams
    public void setClientReqOffsetTime(long j) {
        this.clientReqOffsetTime = j;
    }

    public JSONObject getBizParams() {
        return this.bizParams;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IContainerParams
    public void setBizParams(JSONObject jSONObject) {
        this.bizParams = jSONObject;
    }

    public JSONObject getPassParams() {
        return this.passParams;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IContainerParams
    public void setPassParams(JSONObject jSONObject) {
        this.passParams = jSONObject;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IContainerParams
    public void setPageParams(AwesomeGetPageData awesomeGetPageData) {
        this.pageParams = awesomeGetPageData;
    }

    public AwesomeGetPageData getPageParams() {
        return this.pageParams;
    }

    public List<String> getDeltaSections() {
        return this.deltaSections;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IContainerParams
    public void setDeltaSections(List<String> list) {
        this.deltaSections = list;
    }
}
