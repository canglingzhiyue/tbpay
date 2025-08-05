package com.alibaba.evo.internal.bucketing.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes.dex */
public class ExperimentVariationConfigV5 implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String scope;

    static {
        kge.a(-897120550);
        kge.a(1028243835);
    }

    public boolean isSwitch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ca57e89", new Object[]{this})).booleanValue() : "app".equals(this.scope);
    }

    public String getScope() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d6e9f91b", new Object[]{this}) : this.scope;
    }

    public void setScope(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b32dc023", new Object[]{this, str});
        } else {
            this.scope = str;
        }
    }
}
