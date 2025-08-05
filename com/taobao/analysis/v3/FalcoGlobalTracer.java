package com.taobao.analysis.v3;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public final class FalcoGlobalTracer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static r sTracer;

    private FalcoGlobalTracer() {
    }

    public static void setTracerDelegate(r rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46d2a6ca", new Object[]{rVar});
        } else {
            sTracer = rVar;
        }
    }

    public static r get() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (r) ipChange.ipc$dispatch("2570ad68", new Object[0]) : sTracer;
    }
}
