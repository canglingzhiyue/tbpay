package com.alibaba.triver.triver_shop.newShop.manager;

import com.alibaba.triver.triver_shop.newShop.view.q;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.x;
import tb.kge;

/* loaded from: classes3.dex */
public final class f<A extends q> extends c<A> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-277754101);
    }

    public f(int i) {
        super(i);
    }

    public synchronized void a(A instance) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("257085b1", new Object[]{this, instance});
            return;
        }
        kotlin.jvm.internal.q.d(instance, "instance");
        if (c(instance)) {
            d(instance);
        } else if (e() < b()) {
            a((f<A>) instance);
        } else {
            int b = b() - e();
            if (b == 0) {
                b = 1;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = a().iterator();
            while (it.hasNext()) {
                q qVar = (q) it.next();
                if (i >= b) {
                    break;
                } else if (!qVar.m()) {
                    arrayList.add(qVar);
                    i++;
                }
            }
            Collection a2 = a();
            if (a2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
            }
            x.c(a2).removeAll(arrayList);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((q) it2.next()).g();
            }
            a((f<A>) instance);
        }
    }

    public synchronized void b(A instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53492010", new Object[]{this, instance});
            return;
        }
        kotlin.jvm.internal.q.d(instance, "instance");
        b((f<A>) instance);
    }
}
