package com.alibaba.security.client.smart.core.algo;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.security.wukong.model.CCRCRiskSample;
import com.alibaba.security.wukong.model.meta.Data;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class SampleData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, Object> extras;
    public Object label;
    @JSONField(serialize = false)
    public Data mRawData;
    public String metaId;
    public String metaType;
    public String riskId;
    public String sampleId;
    public String sampleType;
    public String sampleUrl;
    public long startDetectTs;

    public SampleData(long j) {
        this.startDetectTs = j;
    }

    public static SampleData transform(CCRCRiskSample cCRCRiskSample) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SampleData) ipChange.ipc$dispatch("23fcc1fd", new Object[]{cCRCRiskSample});
        }
        if (cCRCRiskSample == null) {
            return new SampleData(System.currentTimeMillis());
        }
        Long l = (Long) cCRCRiskSample.getExtras().get("__detectStart");
        if (l == null) {
            l = Long.valueOf(System.currentTimeMillis());
        }
        SampleData sampleData = new SampleData(l.longValue());
        cCRCRiskSample.getExtras().remove("__detectStart");
        sampleData.sampleId = cCRCRiskSample.getSampleID();
        sampleData.metaId = cCRCRiskSample.getMetaId();
        sampleData.extras = cCRCRiskSample.getExtras();
        sampleData.riskId = cCRCRiskSample.getOriginRiskId();
        sampleData.sampleType = cCRCRiskSample.getSampleType();
        sampleData.metaType = cCRCRiskSample.getMetaType();
        sampleData.mRawData = cCRCRiskSample.getRawData();
        return sampleData;
    }

    public long getTs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("31735e70", new Object[]{this})).longValue();
        }
        Data data = this.mRawData;
        if (data == null) {
            return 0L;
        }
        return data.getTs();
    }

    public Map<String, Object> inputEngineParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c0e1214e", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("dataId", this.sampleId);
        hashMap.put("metaId", this.metaId);
        hashMap.put("extras", this.extras);
        if (!StringUtils.isEmpty(this.riskId)) {
            hashMap.put("riskId", this.riskId);
        }
        return hashMap;
    }
}
