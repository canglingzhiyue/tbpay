package com.taobao.infoflow.protocol.model.datamodel.request;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.model.datamodel.response.IPageDataModel;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes7.dex */
public interface IContainerParams<PAGE_DATA extends IPageDataModel> extends Serializable {
    void setBaseCacheTime(long j);

    void setBizParams(JSONObject jSONObject);

    void setClientReqOffsetTime(long j);

    void setClientReqTime(long j);

    void setDeltaCacheTime(long j);

    void setDeltaSections(List<String> list);

    void setPageParams(PAGE_DATA page_data);

    void setPassParams(JSONObject jSONObject);

    void setRealBaseCacheTime(long j);

    void setRequestType(String str);
}
