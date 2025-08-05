package com.alibaba.android.bindingx.core.internal;

import android.view.animation.AnimationUtils;
import com.alibaba.android.bindingx.core.internal.b;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class q implements b.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public b f2245a;
    public a b;
    public double c;
    public double d;
    public boolean e;
    private com.alibaba.android.bindingx.core.internal.b f;

    /* loaded from: classes2.dex */
    interface a {
        void b(q qVar, double d, double d2);
    }

    /* loaded from: classes2.dex */
    interface b {
        void a(q qVar, double d, double d2);
    }

    static {
        kge.a(54570146);
        kge.a(-225136413);
    }

    public abstract void a(long j);

    public abstract void a(Map<String, Object> map);

    public abstract boolean a();

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd8a64c5", new Object[]{this, bVar});
        } else {
            this.f2245a = bVar;
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd89f066", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    public void b(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
            return;
        }
        a(map);
        if (this.f == null) {
            this.f = com.alibaba.android.bindingx.core.internal.b.a();
        }
        this.f.a(this);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        com.alibaba.android.bindingx.core.internal.b bVar = this.f;
        if (bVar != null) {
            bVar.b();
        }
        this.e = false;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.e;
    }

    public double e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5a", new Object[]{this})).doubleValue() : this.c;
    }

    public double f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1db", new Object[]{this})).doubleValue() : this.d;
    }

    @Override // com.alibaba.android.bindingx.core.internal.b.a
    public void g_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b513655f", new Object[]{this});
            return;
        }
        a(AnimationUtils.currentAnimationTimeMillis());
        b bVar = this.f2245a;
        if (bVar != null) {
            bVar.a(this, this.c, this.d);
        }
        if (!c()) {
            return;
        }
        a aVar = this.b;
        if (aVar != null) {
            aVar.b(this, this.c, this.d);
        }
        com.alibaba.android.bindingx.core.internal.b bVar2 = this.f;
        if (bVar2 == null) {
            return;
        }
        bVar2.b();
    }
}
