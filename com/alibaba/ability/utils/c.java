package com.alibaba.ability.utils;

import com.alibaba.ability.f;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes2.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final c INSTANCE;

    static {
        kge.a(2054427702);
        INSTANCE = new c();
    }

    private c() {
    }

    public final void a(String tag, String msg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, tag, msg});
            return;
        }
        q.d(tag, "tag");
        q.d(msg, "msg");
        com.alibaba.ability.inject.a b = f.INSTANCE.b();
        if (b == null) {
            return;
        }
        b.a(tag, msg);
    }
}
