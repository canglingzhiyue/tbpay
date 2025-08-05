package com.taobao.search.searchdoor;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.p;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<p> f19354a;

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final f f19355a;

        static {
            kge.a(1120845409);
            f19355a = new f();
        }

        public static /* synthetic */ f a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("3484e65c", new Object[0]) : f19355a;
        }
    }

    static {
        kge.a(402152879);
    }

    private f() {
        this.f19354a = new ArrayList();
    }

    public static f a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("3484e65c", new Object[0]) : a.a();
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.f19354a.size();
    }

    public void a(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11e8b525", new Object[]{this, pVar});
        } else if (pVar == null) {
        } else {
            this.f19354a.add(pVar);
        }
    }

    public p c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p) ipChange.ipc$dispatch("99c93be7", new Object[]{this});
        }
        if (!this.f19354a.isEmpty()) {
            return this.f19354a.remove(0);
        }
        return null;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        for (p pVar : this.f19354a) {
            if (pVar != null) {
                pVar.destroy();
            }
        }
        this.f19354a.clear();
    }
}
