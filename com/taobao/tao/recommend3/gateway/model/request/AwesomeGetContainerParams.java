package com.taobao.tao.recommend3.gateway.model.request;

import com.alibaba.fastjson.JSONObject;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetPageData;
import java.io.Serializable;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes.dex */
public class AwesomeGetContainerParams implements Serializable, IMTOPDataObject {
    public long baseCacheTime;
    public JSONObject bizParams;
    public long clientReqOffsetTime;
    public long clientReqTime;
    public long deltaCacheTime;
    public List<String> deltaSections;
    public AwesomeGetPageData pageParams;
    public JSONObject passParams;
    public long realBaseCacheTime;
    public String requestType;

    static {
        kge.a(1337803147);
        kge.a(1028243835);
        kge.a(-350052935);
    }
}
