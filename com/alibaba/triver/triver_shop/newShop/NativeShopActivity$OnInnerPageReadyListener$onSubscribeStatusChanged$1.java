package com.alibaba.triver.triver_shop.newShop;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.ext.h;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class NativeShopActivity$OnInnerPageReadyListener$onSubscribeStatusChanged$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ boolean $subscribe;
    public final /* synthetic */ JSONObject $subscribeData;
    public final /* synthetic */ NativeShopActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeShopActivity$OnInnerPageReadyListener$onSubscribeStatusChanged$1(NativeShopActivity nativeShopActivity, boolean z, JSONObject jSONObject) {
        super(0);
        this.this$0 = nativeShopActivity;
        this.$subscribe = z;
        this.$subscribeData = jSONObject;
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
        NativeShopActivity.c(this.this$0, this.$subscribe);
        NativeShopActivity.k(this.this$0);
        NativeShopActivity nativeShopActivity = this.this$0;
        if (NativeShopActivity.$ipChange == null) {
            return;
        }
        NativeShopActivity nativeShopActivity2 = this.this$0;
        View view = NativeShopActivity.$ipChange;
        DXRootView dXRootView = null;
        if (view == null) {
            q.b("secondView");
            throw null;
        }
        if (view instanceof DXRootView) {
            dXRootView = (DXRootView) view;
        }
        h.a(dXRootView, this.$subscribeData);
    }
}
