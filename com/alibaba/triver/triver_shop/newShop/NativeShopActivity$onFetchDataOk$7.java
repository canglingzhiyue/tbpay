package com.alibaba.triver.triver_shop.newShop;

import android.view.View;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.rul;

/* loaded from: classes3.dex */
public final class NativeShopActivity$onFetchDataOk$7 extends Lambda implements rul<View, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ NativeShopActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeShopActivity$onFetchDataOk$7(NativeShopActivity nativeShopActivity) {
        super(1);
        this.this$0 = nativeShopActivity;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(View view) {
        invoke2(view);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(View it) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6966f573", new Object[]{this, it});
            return;
        }
        q.d(it, "it");
        NativeShopActivity.g(this.this$0, it);
        NativeShopActivity nativeShopActivity = this.this$0;
        NativeShopActivity.$ipChange.addView(it);
        View F = NativeShopActivity.F(this.this$0);
        if (F == null) {
            q.b("videoShopTabView");
            throw null;
        }
        o.g(F);
        if (!NativeShopActivity.G(this.this$0)) {
            return;
        }
        NativeShopActivity nativeShopActivity2 = this.this$0;
        o.b(NativeShopActivity.$ipChange);
    }
}
