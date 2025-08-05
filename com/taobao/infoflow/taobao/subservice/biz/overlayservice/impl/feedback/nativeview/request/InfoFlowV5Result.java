package com.taobao.infoflow.taobao.subservice.biz.overlayservice.impl.feedback.nativeview.request;

import com.alibaba.fastjson.JSONObject;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes7.dex */
public class InfoFlowV5Result implements Serializable, IMTOPDataObject {
    public long cacheTimestamp;
    public long currentTimeMillis;
    public Map<String, String> currentUTParam;
    public Map<String, String> currentePageParam;
    public long expireIntervalTimeMillis;
    public JSONObject ext;
    public String isLastPage;
    public String itemLastCount;
    public String pageTotal;
    public List<SectionModel> sections;
    public String userId;

    static {
        kge.a(240825467);
        kge.a(1028243835);
        kge.a(-350052935);
    }
}
