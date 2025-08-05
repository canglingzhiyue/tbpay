package com.taobao.android.dinamicx;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class z implements com.taobao.android.dinamicx.monitor.k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.dinamicx.monitor.k
    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
        } else {
            com.taobao.metrickit.c.a().a(str, obj);
        }
    }
}
