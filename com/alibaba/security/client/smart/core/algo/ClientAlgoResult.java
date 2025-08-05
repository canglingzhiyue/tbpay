package com.alibaba.security.client.smart.core.algo;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.client.smart.core.constants.BaseConfigKey;
import com.alibaba.security.wukong.model.CCRCRiskSample;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class ClientAlgoResult implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String algoCode;
    @JSONField(serialize = false)
    public final SampleData mSampleData;
    public Object result;

    public ClientAlgoResult(String str, Object obj, SampleData sampleData) {
        this.algoCode = str;
        this.result = obj;
        this.mSampleData = sampleData;
    }

    public static ClientAlgoResult obtain(String str, Object obj, CCRCRiskSample cCRCRiskSample) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ClientAlgoResult) ipChange.ipc$dispatch("b3c0b897", new Object[]{str, obj, cCRCRiskSample}) : new ClientAlgoResult(str, obj, SampleData.transform(cCRCRiskSample));
    }

    public Map<String, Object> alignInferData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("289b5b4f", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(BaseConfigKey.KEY_SAMPLE_DATA, this.mSampleData);
        hashMap.put(this.algoCode, convertMapResult());
        return hashMap;
    }

    public Map<?, ?> convertMapResult() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("b42ec122", new Object[]{this}) : JsonUtils.toMap(this.result);
    }
}
