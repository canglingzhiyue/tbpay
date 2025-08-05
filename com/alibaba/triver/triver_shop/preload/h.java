package com.alibaba.triver.triver_shop.preload;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final h INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static String f4032a;

    static {
        kge.a(587117321);
        INSTANCE = new h();
    }

    private h() {
    }

    public final void a(String key) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, key});
            return;
        }
        q.d(key, "key");
        f4032a = key;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        String str = f4032a;
        f4032a = null;
        return str;
    }
}
