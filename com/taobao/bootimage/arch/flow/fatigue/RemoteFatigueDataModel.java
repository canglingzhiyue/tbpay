package com.taobao.bootimage.arch.flow.fatigue;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes6.dex */
public class RemoteFatigueDataModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String globalLimitInSingleDay = String.valueOf(Integer.MAX_VALUE);
    public String globalLimitSeconds = "0";

    static {
        kge.a(-2123717561);
        kge.a(1028243835);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RemoteFatigueDataModel{globalLimitInSingleDay='" + this.globalLimitInSingleDay + "', globalLimitSeconds='" + this.globalLimitSeconds + "'}";
    }
}
