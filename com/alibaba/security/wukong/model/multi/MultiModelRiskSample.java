package com.alibaba.security.wukong.model.multi;

import com.alibaba.security.wukong.model.CCRCRiskSample;
import com.alibaba.security.wukong.model.protocol.RiskSample;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class MultiModelRiskSample extends RiskSample {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public MultiModelRiskSample(String str) {
        super(str);
    }

    public void a(CCRCRiskSample cCRCRiskSample) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fad61141", new Object[]{this, cCRCRiskSample});
        } else if (cCRCRiskSample == null) {
        } else {
            cCRCRiskSample.getExtras().put(RiskSample.REAL_SAMPLE_ID, getSampleId());
            cCRCRiskSample.getExtras().put(RiskSample.REAL_SAMPLE_TYPE, type());
            Map<String, Object> extras = getExtras();
            if (extras == null) {
                return;
            }
            cCRCRiskSample.getExtras().putAll(extras);
        }
    }

    @Override // com.alibaba.security.wukong.model.protocol.RiskSample
    public Map<String, Object> getExtras() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cf016b95", new Object[]{this});
        }
        if (this.extras == null) {
            this.extras = new HashMap();
        }
        return this.extras;
    }

    @Deprecated
    public String getSampleId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d0dc7bfe", new Object[]{this}) : getSampleID();
    }

    @Override // com.alibaba.security.wukong.model.protocol.RiskSample
    public void setExtras(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52ba0699", new Object[]{this, map});
        } else {
            this.extras = map;
        }
    }

    public abstract String type();

    public MultiModelRiskSample(String str, Map<String, Object> map) {
        super(str, map);
    }
}
