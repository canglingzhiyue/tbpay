package com.taobao.themis.kernel.extension.page;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.bj;
import com.taobao.themis.kernel.TMSBackPressedType;
import com.taobao.themis.kernel.extension.page.r;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes9.dex */
public final class t implements r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f22526a;
    private final CopyOnWriteArraySet<bj> b;
    private final ITMSPage c;

    static {
        kge.a(1928905082);
        kge.a(294978273);
    }

    @Override // com.taobao.themis.kernel.extension.page.s.c
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        return 1;
    }

    public t(ITMSPage page) {
        kotlin.jvm.internal.q.d(page, "page");
        this.c = page;
        this.f22526a = new AtomicBoolean(false);
        this.b = new CopyOnWriteArraySet<>();
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void c_(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f4ed18e", new Object[]{this, page});
            return;
        }
        kotlin.jvm.internal.q.d(page, "page");
        r.a.a(this, page);
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            r.a.b(this);
        }
    }

    @Override // com.taobao.themis.kernel.extension.page.r
    public void a(bj listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb7b4f5", new Object[]{this, listener});
            return;
        }
        kotlin.jvm.internal.q.d(listener, "listener");
        s sVar = (s) this.c.a(s.class);
        if (sVar != null && !this.f22526a.get()) {
            sVar.a(this);
            this.f22526a.set(true);
        }
        this.b.add(listener);
    }

    @Override // com.taobao.themis.kernel.extension.page.r
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.b.clear();
        }
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        r.a.c(this);
        s sVar = (s) this.c.a(s.class);
        if (sVar != null) {
            sVar.b(this);
        }
        this.b.clear();
    }

    @Override // com.taobao.themis.kernel.extension.page.s.c
    public boolean a(ITMSPage page, TMSBackPressedType tMSBackPressedType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19000c3b", new Object[]{this, page, tMSBackPressedType})).booleanValue();
        }
        kotlin.jvm.internal.q.d(page, "page");
        if (this.b.isEmpty()) {
            return false;
        }
        Iterator<bj> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        return true;
    }
}
