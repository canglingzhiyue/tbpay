package com.etao.feimagesearch.mnn.autodetect;

import com.alipay.mobile.common.logging.api.LogContext;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.p;
import kotlin.text.n;
import tb.kge;

/* loaded from: classes3.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f6756a;
    private Set<Integer> b = new LinkedHashSet();
    private Set<Integer> c = new LinkedHashSet();

    static {
        kge.a(-578304988);
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f6756a = str;
        }
    }

    public final Set<Integer> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("a0177257", new Object[]{this}) : this.b;
    }

    public final Set<Integer> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("6dc1d418", new Object[]{this}) : this.c;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.c.clear();
        this.b.clear();
        this.f6756a = null;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        String str = this.f6756a;
        if (str == null) {
            return false;
        }
        return n.b((CharSequence) str, (CharSequence) "6", false, 2, (Object) null);
    }

    public final Map<String, String> a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3dbdb7a1", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4), new Boolean(z5)});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!this.c.isEmpty()) {
            linkedHashMap.put("tipID", p.a(this.c, ",", null, null, 0, null, null, 62, null));
        }
        if (z) {
            this.b.add(2);
        }
        if (z3) {
            this.b.add(5);
        }
        if (!this.b.isEmpty()) {
            linkedHashMap.put(LogContext.LOCAL_STORAGE_ACTIONID, p.a(this.b, ",", null, null, 0, null, null, 62, null));
        }
        StringBuilder sb = new StringBuilder();
        if (z2) {
            sb.append(0);
            sb.append(",");
        }
        if (z4) {
            sb.append(1);
            sb.append(",");
        }
        linkedHashMap.put("stateID", sb.toString());
        if (d()) {
            linkedHashMap.put("TipID2", "6");
        }
        if (z5) {
            c();
        }
        return linkedHashMap;
    }
}
