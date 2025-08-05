package com.taobao.search.mmd.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.search.common.util.r;
import kotlin.jvm.internal.q;
import tb.ghi;
import tb.ghm;
import tb.imo;
import tb.kge;
import tb.llu;

/* loaded from: classes7.dex */
public final class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final j INSTANCE;

    static {
        kge.a(1355268493);
        INSTANCE = new j();
    }

    private j() {
    }

    public final String a(String switchKey) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, switchKey});
        }
        q.c(switchKey, "switchKey");
        String c = TBRevisionSwitchManager.i().c(switchKey);
        return c == null ? "" : c;
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (com.taobao.search.common.util.c.a()) {
            boolean a2 = com.taobao.search.common.util.j.INSTANCE.a(imo.b());
            return !a2 ? q.a((Object) "1", (Object) a("elderHome")) : a2;
        }
        return q.a((Object) "1", (Object) a("elderHome"));
    }

    private final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        if (!com.taobao.search.common.util.c.a()) {
            return q.a((Object) "1", (Object) a("evo_search_optimize")) && r.ah();
        }
        boolean b = com.taobao.search.common.util.j.INSTANCE.b(imo.b());
        return !b ? q.a((Object) "1", (Object) a("evo_search_optimize")) && r.ah() : b;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : a() && d();
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (r.ct()) {
            return false;
        }
        try {
            ghm ghmVar = (ghm) ghi.a(ghm.class);
            if (ghmVar != null) {
                return ghmVar.isSpecifyVersionCode(llu.GOOD_PRICE_VERSION);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (!com.taobao.search.common.util.c.a()) {
            return r.ai() && a() && z;
        }
        boolean d = com.taobao.search.common.util.j.INSTANCE.d(imo.b());
        return !d ? r.ai() && a() && z : d;
    }
}
