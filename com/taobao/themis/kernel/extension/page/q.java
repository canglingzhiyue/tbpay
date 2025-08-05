package com.taobao.themis.kernel.extension.page;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.TMSBackPressedType;
import com.taobao.themis.kernel.extension.page.s;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import tb.kge;

/* loaded from: classes9.dex */
public final class q implements s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final PriorityQueue<s.c> f22524a;
    private final ITMSPage b;

    static {
        kge.a(-1855809612);
        kge.a(1031586556);
    }

    /* loaded from: classes9.dex */
    public static final class a<T> implements Comparator<s.c> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // java.util.Comparator
        public /* synthetic */ int compare(s.c cVar, s.c cVar2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, cVar, cVar2})).intValue() : a(cVar, cVar2);
        }

        public final int a(s.c cVar, s.c cVar2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c9ce233b", new Object[]{this, cVar, cVar2})).intValue() : cVar2.b() - cVar.b();
        }
    }

    public q(ITMSPage page) {
        kotlin.jvm.internal.q.d(page, "page");
        this.b = page;
        this.f22524a = new PriorityQueue<>(10, a.INSTANCE);
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            s.b.c(this);
        }
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void c_(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f4ed18e", new Object[]{this, page});
            return;
        }
        kotlin.jvm.internal.q.d(page, "page");
        s.b.a(this, page);
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            s.b.b(this);
        }
    }

    @Override // com.taobao.themis.kernel.extension.page.s
    public boolean a(TMSBackPressedType tMSBackPressedType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b947806", new Object[]{this, tMSBackPressedType})).booleanValue();
        }
        Iterator<s.c> it = this.f22524a.iterator();
        while (it.hasNext()) {
            if (it.next().a(this.b, tMSBackPressedType)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.taobao.themis.kernel.extension.page.s
    public void a(s.c interceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc10809b", new Object[]{this, interceptor});
            return;
        }
        kotlin.jvm.internal.q.d(interceptor, "interceptor");
        this.f22524a.add(interceptor);
    }

    @Override // com.taobao.themis.kernel.extension.page.s
    public void b(s.c interceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edba26ba", new Object[]{this, interceptor});
            return;
        }
        kotlin.jvm.internal.q.d(interceptor, "interceptor");
        this.f22524a.remove(interceptor);
    }
}
