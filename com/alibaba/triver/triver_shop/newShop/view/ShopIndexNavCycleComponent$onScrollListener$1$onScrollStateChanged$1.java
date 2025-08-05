package com.alibaba.triver.triver_shop.newShop.view;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.collections.ai;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ShopIndexNavCycleComponent$onScrollListener$1$onScrollStateChanged$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ int $firstPosition;
    public final /* synthetic */ int $lastPosition;
    public final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopIndexNavCycleComponent$onScrollListener$1$onScrollStateChanged$1(l lVar, int i, int i2) {
        super(0);
        this.this$0 = lVar;
        this.$firstPosition = i;
        this.$lastPosition = i2;
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
        l lVar = this.this$0;
        com.alibaba.triver.triver_shop.newShop.data.d dVar = l.$ipChange;
        if (dVar == null) {
            kotlin.jvm.internal.q.b("shopData");
            throw null;
        }
        JSONArray aE = dVar.aE();
        int i = this.$firstPosition;
        if (i > this.$lastPosition) {
            return;
        }
        while (true) {
            int i2 = i + 1;
            JSONObject b = com.alibaba.triver.triver_shop.newShop.ext.d.b(aE, i);
            String string = b == null ? null : b.getString("utArg1");
            if (string != null) {
                l lVar2 = this.this$0;
                com.alibaba.triver.triver_shop.newShop.data.d dVar2 = l.$ipChange;
                if (dVar2 != null) {
                    com.alibaba.triver.triver_shop.newShop.ext.m.a(dVar2, string, ai.c(kotlin.j.a("actionType", "swipe")));
                } else {
                    kotlin.jvm.internal.q.b("shopData");
                    throw null;
                }
            }
            if (i == this.$lastPosition) {
                return;
            }
            i = i2;
        }
    }
}
