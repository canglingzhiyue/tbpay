package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.model.Label;
import com.alibaba.security.ccrc.service.CcrcDetectResult;
import com.alibaba.security.ccrc.service.RiskShowCustomizedResult;
import com.alibaba.security.client.smart.core.algo.SampleData;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class W {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static CcrcDetectResult a(String str, SampleData sampleData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CcrcDetectResult) ipChange.ipc$dispatch("6a501945", new Object[]{str, sampleData});
        }
        String str2 = null;
        String str3 = sampleData != null ? sampleData.sampleId : null;
        if (sampleData != null) {
            str2 = sampleData.metaId;
        }
        CcrcDetectResult ccrcDetectResult = new CcrcDetectResult(str3, str2, false, false, str, null, null);
        if (sampleData != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("extras", sampleData.extras);
            ccrcDetectResult.setAlgoResults(hashMap);
        }
        return ccrcDetectResult;
    }

    public static RiskShowCustomizedResult a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RiskShowCustomizedResult) ipChange.ipc$dispatch("fb8913f", new Object[]{str}) : new RiskShowCustomizedResult(false, false, str);
    }

    public static RiskShowCustomizedResult a(String str, String str2, String str3, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RiskShowCustomizedResult) ipChange.ipc$dispatch("9ef96fab", new Object[]{str, str2, str3, new Boolean(z), new Boolean(z2)}) : new RiskShowCustomizedResult(str2, str3, z2, z, str);
    }

    public static RiskShowCustomizedResult a(SampleData sampleData, boolean z, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RiskShowCustomizedResult) ipChange.ipc$dispatch("cc59822e", new Object[]{sampleData, new Boolean(z), str}) : new RiskShowCustomizedResult(sampleData.sampleId, sampleData.metaId, z, true, "success", str);
    }

    public static CcrcDetectResult a(SampleData sampleData, boolean z, List<Label> list, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CcrcDetectResult) ipChange.ipc$dispatch("7b619a2f", new Object[]{sampleData, new Boolean(z), list, map});
        }
        return new CcrcDetectResult(sampleData != null ? sampleData.sampleId : null, sampleData != null ? sampleData.metaId : null, z, true, null, list, map);
    }
}
