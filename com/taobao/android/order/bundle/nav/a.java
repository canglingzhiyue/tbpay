package com.taobao.android.order.bundle.nav;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public abstract class a<T> implements b<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a<T> f14559a;

    static {
        kge.a(816478258);
        kge.a(-650922345);
    }

    public abstract boolean a(T t);

    public void a(a<T> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80e25a3d", new Object[]{this, aVar});
        } else {
            this.f14559a = aVar;
        }
    }

    public final boolean b(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f056ab89", new Object[]{this, t})).booleanValue();
        }
        if (!a((a<T>) t)) {
            a<T> aVar = this.f14559a;
            if (aVar == null) {
                return false;
            }
            return aVar.b(t);
        }
        return c(t);
    }
}
