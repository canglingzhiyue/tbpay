package com.alibaba.security.ccrc.service;

import com.alibaba.security.ccrc.model.Label;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class CcrcDetectResult extends BaseCcrcDetectResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, Object> algoResults;
    public final List<Label> labels;

    public CcrcDetectResult(String str, String str2, boolean z, boolean z2, String str3, List<Label> list, Map<String, Object> map) {
        this.sampleID = str;
        this.dataID = str2;
        this.isRisk = z;
        this.success = z2;
        this.errorMsg = str3;
        this.labels = list;
        this.algoResults = map;
    }

    public Map<String, Object> getAlgoResults() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b37ca29", new Object[]{this}) : this.algoResults;
    }

    public List<Label> getLabels() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("889b35cb", new Object[]{this}) : this.labels;
    }

    public void setAlgoResults(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99ff21d", new Object[]{this, map});
        } else {
            this.algoResults = map;
        }
    }
}
