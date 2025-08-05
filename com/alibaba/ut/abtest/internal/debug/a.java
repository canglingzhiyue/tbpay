package com.alibaba.ut.abtest.internal.debug;

import com.alibaba.ut.abtest.internal.util.s;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f4192a;
    private long b;
    private long c;
    private long d;
    private long e;

    static {
        kge.a(-1726482547);
    }

    public a(String str) {
        this.f4192a = str;
        String[] split = str.split("_");
        if (split == null || split.length < 6) {
            return;
        }
        this.b = s.a(split[1]);
        this.c = s.a(split[2]);
        this.d = s.a(split[3]);
        this.e = s.a(split[4]);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f4192a;
    }
}
