package com.alibaba.ability;

import com.alibaba.ability.inject.a;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public final class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final f INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static com.alibaba.ability.inject.c f1826a;
    private static a b;
    private static com.alibaba.ability.inject.b c;

    static {
        kge.a(-178383196);
        INSTANCE = new f();
        b = new com.alibaba.ability.inject.d();
        c = new com.alibaba.ability.inject.e();
    }

    private f() {
    }

    public final com.alibaba.ability.inject.c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.ability.inject.c) ipChange.ipc$dispatch("2c515c32", new Object[]{this}) : f1826a;
    }

    public final void a(com.alibaba.ability.inject.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf8bd12c", new Object[]{this, cVar});
        } else {
            f1826a = cVar;
        }
    }

    public final a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("69712013", new Object[]{this}) : b;
    }

    public final com.alibaba.ability.inject.b c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.ability.inject.b) ipChange.ipc$dispatch("a690e451", new Object[]{this}) : c;
    }
}
