package com.alibaba.triver.triver_shop.newShop.manager;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class g<A extends Activity> extends c<A> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2033628235);
    }

    public g() {
        super(1);
    }

    public void a(A instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, instance});
            return;
        }
        q.d(instance, "instance");
        a((g<A>) instance);
        com.alibaba.triver.triver_shop.newShop.ext.b.a(new SingleActivityInstanceController$addInstance$1((Activity) d()), 500L);
    }

    public void b(A instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{this, instance});
            return;
        }
        q.d(instance, "instance");
        b((g<A>) instance);
    }
}
