package com.alibaba.android.ultron.ext.vlayout.extend;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class PerformanceMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-467685880);
    }

    public void recordEnd(String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39d05f17", new Object[]{this, str, view});
        }
    }

    public void recordEnd(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e87326e5", new Object[]{this, str, str2});
        }
    }

    public void recordStart(String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fd8f30", new Object[]{this, str, view});
        }
    }

    public void recordStart(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7430fac", new Object[]{this, str, str2});
        }
    }
}
