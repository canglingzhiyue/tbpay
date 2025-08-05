package com.alipay.mobile.common.transport.http;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class PerformanceDataCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void callback(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("981e7fb9", new Object[]{this, map});
        }
    }
}
