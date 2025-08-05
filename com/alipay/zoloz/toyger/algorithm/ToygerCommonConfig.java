package com.alipay.zoloz.toyger.algorithm;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ToygerCommonConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int logLevel = 0;
    public int productCode = 0;
    public int useXNN = 0;

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ToygerCommonConfig{logLevel='" + this.logLevel + "', productCode='" + this.productCode + "', useXNN=" + this.useXNN + '}';
    }
}
