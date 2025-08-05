package com.alibaba.triver.triver_shop.shop2023.nativeview;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class k extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f4126a;
    private final boolean b;

    static {
        kge.a(-991751138);
    }

    public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
        if (str.hashCode() == 104844539) {
            return new Boolean(super.p());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, com.alibaba.triver.triver_shop.newShop.data.d shopData, boolean z, boolean z2, int i) {
        super(context, shopData, i);
        q.d(context, "context");
        q.d(shopData, "shopData");
        this.f4126a = z;
        this.b = z2;
    }

    @Override // com.alibaba.triver.triver_shop.shop2023.nativeview.b
    public boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : (this.b && (this.f4126a || o())) || super.p();
    }

    @Override // com.alibaba.triver.triver_shop.shop2023.nativeview.b
    public boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue() : !this.b || (!this.f4126a && !o());
    }
}
