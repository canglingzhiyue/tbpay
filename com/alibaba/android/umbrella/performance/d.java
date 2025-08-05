package com.alibaba.android.umbrella.performance;

import com.android.alibaba.ip.runtime.IpChange;
import tb.ept;

/* loaded from: classes2.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f2834a;
    private String b;
    public static final d INIT = new d(1, "init");
    public static final d LIFECYCLE = new d(2, ept.LIFECYCLE);
    public static final d NETWORK = new d(3, "netWork");
    public static final d DATAPARSE = new d(4, "dataParse");
    public static final d DRAWVIEW = new d(5, ept.DRAWVIEW);
    public static final d PAGELOAD = new d(6, ept.PAGELOAD);
    public static final d SUB_CREATE_VIEW = new d(7, ept.SUB_CREATE_VIEW);
    public static final d SUB_BIND_VIEW = new d(8, ept.SUB_BIND_VIEW);

    public d(int i, String str) {
        this.f2834a = i;
        this.b = str;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b;
    }
}
