package com.alibaba.triver.triver_shop.newShop;

import android.content.Intent;
import android.net.Uri;
import com.alibaba.triver.triver_shop.newShop.data.d;
import com.alibaba.triver.triver_shop.newShop.ext.h;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class NativeShopActivity$requestFloatData$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ NativeShopActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeShopActivity$requestFloatData$1(NativeShopActivity nativeShopActivity) {
        super(0);
        this.this$0 = nativeShopActivity;
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
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        NativeShopActivity nativeShopActivity = this.this$0;
        NativeShopActivity nativeShopActivity2 = nativeShopActivity;
        Intent intent = nativeShopActivity.getIntent();
        String uri = (intent == null || (data = intent.getData()) == null) ? null : data.toString();
        d b = NativeShopActivity.b(this.this$0);
        if (b != null) {
            h.a(nativeShopActivity2, uri, b);
        } else {
            q.b("shopDataParser");
            throw null;
        }
    }
}
