package com.alibaba.security.wukong.model.protocol;

import android.text.TextUtils;
import com.alibaba.security.ccrc.manager.CcrcContextImpl;
import com.alibaba.security.ccrc.service.build.Yb;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public abstract class RiskSample implements IRisk, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String REAL_SAMPLE_ID = "_sampleID";
    public static final String REAL_SAMPLE_TYPE = "_sampleType";

    /* renamed from: a  reason: collision with root package name */
    public static final String f3626a = "WK_";
    public static final String b = "_";
    public Map<String, Object> extras;
    public String riskID;
    public final String sampleID;

    public RiskSample(String str) {
        this.sampleID = str;
    }

    private synchronized String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        StringBuilder a2 = Yb.a(f3626a);
        a2.append(UUID.randomUUID().toString());
        a2.append("_");
        a2.append(UTDevice.getUtdid(CcrcContextImpl.getContext()));
        return a2.toString();
    }

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

    public String getOriginRiskId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b114933", new Object[]{this}) : this.riskID;
    }

    @Override // com.alibaba.security.wukong.model.protocol.IRisk
    public synchronized String getRiskID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("201ec3d9", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.riskID)) {
            this.riskID = a();
        }
        return this.riskID;
    }

    public String getSampleID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("25281e", new Object[]{this}) : this.sampleID;
    }

    public void setExtras(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52ba0699", new Object[]{this, map});
        } else {
            this.extras = map;
        }
    }

    public RiskSample(String str, Map<String, Object> map) {
        this.sampleID = str;
        this.extras = map;
    }
}
