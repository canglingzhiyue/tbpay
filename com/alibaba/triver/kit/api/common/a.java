package com.alibaba.triver.kit.api.common;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import tb.kge;

/* loaded from: classes3.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-460904954);
    }

    public static Thread a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("d060f65f", new Object[0]) : VExecutors.currentThread();
    }
}
