package com.taobao.android.order.bundle.nav;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class c<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a<T> f14560a;

    static {
        kge.a(1297282943);
    }

    @SafeVarargs
    public final void a(a<T>... aVarArr) {
        int length;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c540bd8", new Object[]{this, aVarArr});
        } else if (aVarArr == null || (length = aVarArr.length) == 0) {
        } else {
            this.f14560a = aVarArr[0];
            if (length == 1) {
                return;
            }
            a<T> aVar = null;
            int length2 = aVarArr.length;
            while (i < length2) {
                a<T> aVar2 = aVarArr[i];
                if (aVar != null) {
                    aVar.a((a) aVar2);
                }
                i++;
                aVar = aVar2;
            }
        }
    }

    public boolean a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, t})).booleanValue();
        }
        a<T> aVar = this.f14560a;
        if (aVar != null) {
            return aVar.b(t);
        }
        return false;
    }
}
