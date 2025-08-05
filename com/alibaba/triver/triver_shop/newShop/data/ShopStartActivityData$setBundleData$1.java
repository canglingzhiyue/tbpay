package com.alibaba.triver.triver_shop.newShop.data;

import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ceg;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ShopStartActivityData$setBundleData$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Bundle $bundle;
    public final /* synthetic */ long $bundleId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopStartActivityData$setBundleData$1(long j, Bundle bundle) {
        super(0);
        this.$bundleId = j;
        this.$bundle = bundle;
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
        e.$ipChange.remove(Long.valueOf(this.$bundleId));
        ceg.Companion.b(q.a("auto remove shop start data , bundle id ", (Object) this.$bundle));
    }
}
