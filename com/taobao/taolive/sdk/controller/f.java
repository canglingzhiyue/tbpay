package com.taobao.taolive.sdk.controller;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f21820a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;

    static {
        kge.a(399837007);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.g = 0L;
        this.h = 0L;
    }
}
