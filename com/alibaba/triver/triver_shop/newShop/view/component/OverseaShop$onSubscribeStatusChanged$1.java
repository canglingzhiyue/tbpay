package com.alibaba.triver.triver_shop.newShop.view.component;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.shop2023.template.OverseaShopHeaderInfoTemplate;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class OverseaShop$onSubscribeStatusChanged$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ JSONObject $subscribeData;
    public final /* synthetic */ boolean $subscribed;
    public final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverseaShop$onSubscribeStatusChanged$1(e eVar, boolean z, JSONObject jSONObject) {
        super(0);
        this.this$0 = eVar;
        this.$subscribed = z;
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
        e eVar = this.this$0;
        OverseaShopHeaderInfoTemplate overseaShopHeaderInfoTemplate = e.$ipChange;
        if (overseaShopHeaderInfoTemplate == null) {
            return;
        }
        overseaShopHeaderInfoTemplate.a(this.$subscribed, this.$subscribeData);
    }
}
