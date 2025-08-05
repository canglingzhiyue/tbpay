package com.alibaba.analytics.core.sync;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String e;

    /* renamed from: a  reason: collision with root package name */
    public int f2097a = -1;
    public long b = 0;
    public long c = 0;
    public long d = 0;
    public boolean f = false;

    static {
        kge.a(-1745900986);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f2097a == 0;
    }
}
