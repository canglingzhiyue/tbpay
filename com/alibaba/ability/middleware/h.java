package com.alibaba.ability.middleware;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes.dex */
public final class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final h INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static e f1980a;

    static {
        kge.a(1216012879);
        INSTANCE = new h();
    }

    private h() {
    }

    public static final e a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("d1b522cf", new Object[0]);
        }
        e eVar = f1980a;
        if (eVar == null) {
            q.b("middlewareHub");
        }
        return eVar;
    }

    public static final void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76188609", new Object[]{eVar});
            return;
        }
        q.d(eVar, "<set-?>");
        f1980a = eVar;
    }
}
