package com.alibaba.triver.triver_shop.preload;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ShopClassPreloader$Companion$preloadShopClass$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ShopClassPreloader$Companion$preloadShopClass$1 INSTANCE = new ShopClassPreloader$Companion$preloadShopClass$1();

    public ShopClassPreloader$Companion$preloadShopClass$1() {
        super(0);
    }

    @Override // tb.ruk
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2427invoke() {
        mo2427invoke();
        return t.INSTANCE;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        Iterator it = g.$ipChange.iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            Class.forName(cls.getName(), true, cls.getClassLoader());
        }
    }
}
