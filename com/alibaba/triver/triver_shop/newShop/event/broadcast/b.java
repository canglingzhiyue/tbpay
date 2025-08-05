package com.alibaba.triver.triver_shop.newShop.event.broadcast;

import android.content.Context;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.d;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.j;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class b implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f3836a;
    private final com.alibaba.triver.triver_shop.newShop.data.d b;
    private final d.a c;
    private final d d;

    static {
        kge.a(-1469821364);
        kge.a(-2133792085);
    }

    public b(Context context, com.alibaba.triver.triver_shop.newShop.data.d shopData, d.a aVar) {
        q.d(context, "context");
        q.d(shopData, "shopData");
        this.f3836a = context;
        this.b = shopData;
        this.c = aVar;
        d a2 = d.a(this.f3836a);
        q.b(a2, "getInstance(context)");
        this.d = a2;
        this.d.a(this.c);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.d.a();
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.d.b(this.b.T(), i);
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.d.a(this.b.T(), i);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.a
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        d dVar = this.d;
        String T = this.b.T();
        StringBuilder sb = new StringBuilder();
        sb.append(o.f((Number) 12));
        sb.append(',');
        sb.append(this.b.v());
        dVar.a(i, i2, T, com.alibaba.triver.triver_shop.newShop.ext.d.a(j.a("paddingTopAndBottom", sb.toString())));
    }

    @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.a
    public void b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.d.b(i, i2, this.b.T());
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.a
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.d.a(this.b.T(), z);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.d.c(this.b.T());
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.d.b(this.b.T());
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.d.a(this.b.T());
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        d.a aVar = this.c;
        if (aVar == null) {
            return;
        }
        aVar.a(str, str2);
    }
}
