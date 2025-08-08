package com.alibaba.security.wukong.model;

import mtopsdk.common.util.StringUtils;
import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.wukong.model.meta.Data;
import com.alibaba.security.wukong.model.protocol.RiskSample;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class CCRCRiskSample extends RiskSample {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public CCRCRiskSample(String str) {
        super(str);
    }

    public void detect(CcrcService ccrcService, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36d63077", new Object[]{this, ccrcService, new Boolean(z)});
        } else {
            ccrcService.detect(this, z);
        }
    }

    public String getMetaId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("76fc2fc3", new Object[]{this}) : this.sampleID;
    }

    public abstract String getMetaType();

    public abstract Data getRawData();

    @Override // com.alibaba.security.wukong.model.protocol.RiskSample
    public String getSampleID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("25281e", new Object[]{this});
        }
        Object obj = getExtras().get(RiskSample.REAL_SAMPLE_ID);
        if (obj instanceof String) {
            return (String) obj;
        }
        return this.sampleID;
    }

    public String getSampleType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9467033f", new Object[]{this});
        }
        Object obj = getExtras().get(RiskSample.REAL_SAMPLE_TYPE);
        if (obj instanceof String) {
            return (String) obj;
        }
        return getMetaType();
    }

    public abstract long getTs();

    public boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : !StringUtils.isEmpty(this.sampleID);
    }

    public CCRCRiskSample(String str, Map<String, Object> map) {
        super(str, map);
    }

    public void detect(CcrcService ccrcService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f982c1fd", new Object[]{this, ccrcService});
        } else {
            ccrcService.detect(this, true);
        }
    }
}
