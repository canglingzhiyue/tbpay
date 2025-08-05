package com.alibaba.triver.triver_shop.newShop.view;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.view.i;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.collections.ai;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class InfinityCycleAdapter$ViewHolder$targetViewClickListener$1$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ i this$0;
    public final /* synthetic */ i.b this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfinityCycleAdapter$ViewHolder$targetViewClickListener$1$1(i iVar, i.b bVar) {
        super(0);
        this.this$0 = iVar;
        this.this$1 = bVar;
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
        JSONObject b = com.alibaba.triver.triver_shop.newShop.ext.d.b(i.b(this.this$0).aE(), this.this$1.b());
        String string = b == null ? null : b.getString("utArg1");
        if (string == null) {
            return;
        }
        com.alibaba.triver.triver_shop.newShop.ext.m.a(i.b(this.this$0), string, ai.c(kotlin.j.a("actionType", "click")), null, 8, null);
    }
}
