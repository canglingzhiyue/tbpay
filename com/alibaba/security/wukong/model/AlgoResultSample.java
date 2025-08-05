package com.alibaba.security.wukong.model;

import android.text.TextUtils;
import com.alibaba.security.client.smart.core.algo.SampleData;
import com.alibaba.security.client.smart.core.constants.BaseConfigKey;
import com.alibaba.security.wukong.model.meta.AlgoResult;
import com.alibaba.security.wukong.model.meta.Data;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class AlgoResultSample extends CCRCRiskSample {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public AlgoResult algoResult;

    public AlgoResultSample(String str, String str2, String str3) {
        super(str);
        this.algoResult = new AlgoResult(str2, str3);
    }

    public static /* synthetic */ Object ipc$super(AlgoResultSample algoResultSample, String str, Object... objArr) {
        if (str.hashCode() == 67041405) {
            return new Boolean(super.isValid());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public AlgoResult getAlgoResult() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AlgoResult) ipChange.ipc$dispatch("3655e250", new Object[]{this}) : this.algoResult;
    }

    public String getCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fa4e0476", new Object[]{this}) : this.algoResult.getCode();
    }

    public Map<String, Object> getInferResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d3b12c11", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(BaseConfigKey.KEY_SAMPLE_DATA, SampleData.transform(this));
        hashMap.put(this.algoResult.getCode(), this.algoResult.getValue());
        return hashMap;
    }

    @Override // com.alibaba.security.wukong.model.CCRCRiskSample
    public String getMetaType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3168d9c4", new Object[]{this}) : "algoResult";
    }

    @Override // com.alibaba.security.wukong.model.CCRCRiskSample
    public Data getRawData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Data) ipChange.ipc$dispatch("b1c4156c", new Object[]{this}) : this.algoResult;
    }

    @Override // com.alibaba.security.wukong.model.CCRCRiskSample
    public long getTs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("31735e70", new Object[]{this})).longValue() : this.algoResult.getTs();
    }

    public Object getValue() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6045ccb0", new Object[]{this}) : this.algoResult.getValue();
    }

    public boolean isInferDirect() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fa49f858", new Object[]{this})).booleanValue() : this.algoResult.isInferDirect();
    }

    public boolean isTriggerHeart() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a1215843", new Object[]{this})).booleanValue() : this.algoResult.isTriggerHeart();
    }

    @Override // com.alibaba.security.wukong.model.CCRCRiskSample
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : super.isValid() && !TextUtils.isEmpty(getCode()) && getValue() != null;
    }

    public void setAlgoResult(AlgoResult algoResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb20ff9a", new Object[]{this, algoResult});
        } else {
            this.algoResult = algoResult;
        }
    }

    public void setCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3f1cac0", new Object[]{this, str});
        } else {
            this.algoResult.setCode(str);
        }
    }

    public void setValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae52f80", new Object[]{this, str});
        } else {
            this.algoResult.setValue(str);
        }
    }

    public AlgoResultSample(String str, AlgoResult algoResult) {
        super(str);
        this.algoResult = algoResult;
        getExtras().putAll(algoResult.getExtras());
    }
}
