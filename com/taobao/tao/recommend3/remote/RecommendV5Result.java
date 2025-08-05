package com.taobao.tao.recommend3.remote;

import com.alibaba.fastjson.JSONObject;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class RecommendV5Result implements Serializable, IMTOPDataObject {
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
        kge.a(1560510791);
        kge.a(1028243835);
        kge.a(-350052935);
    }
}
