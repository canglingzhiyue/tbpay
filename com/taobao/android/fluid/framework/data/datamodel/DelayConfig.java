package com.taobao.android.fluid.framework.data.datamodel;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes5.dex */
public class DelayConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final boolean enableDelayInit = true;
    public final String delayInitTime = "1";
    public final String defaultTimeOut = "3000";

    static {
        kge.a(1880033401);
        kge.a(1028243835);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : "DelayConfig{enableDelayInit=true, delayInitTime='1', defaultTimeOut='3000'}";
    }
}
