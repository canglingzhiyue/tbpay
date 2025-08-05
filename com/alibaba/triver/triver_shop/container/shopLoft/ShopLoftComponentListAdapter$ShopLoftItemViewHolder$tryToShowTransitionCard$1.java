package com.alibaba.triver.triver_shop.container.shopLoft;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.shopLoft.f;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ShopLoftComponentListAdapter$ShopLoftItemViewHolder$tryToShowTransitionCard$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String $content;
    public final /* synthetic */ JSONObject $data;
    public final /* synthetic */ String $iconUrl;
    public final /* synthetic */ long $showTimeBySecond;
    public final /* synthetic */ String $subContent;
    public final /* synthetic */ f this$0;
    public final /* synthetic */ f.a this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopLoftComponentListAdapter$ShopLoftItemViewHolder$tryToShowTransitionCard$1(JSONObject jSONObject, f fVar, f.a aVar, String str, String str2, String str3, long j) {
        super(0);
        this.$data = jSONObject;
        this.this$0 = fVar;
        this.this$1 = aVar;
        this.$content = str;
        this.$subContent = str2;
        this.$iconUrl = str3;
        this.$showTimeBySecond = j;
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
        } else if (q.a((Object) "true", (Object) this.$data.getString("alreadyLeave"))) {
        } else {
            this.$data.put((JSONObject) "alreadyShowBottomGuid", "true");
            if (!q.a(this.this$0.a(), this.this$1)) {
                return;
            }
            f.a.a(this.this$1, this.$content, this.$subContent, this.$iconUrl);
            com.alibaba.triver.triver_shop.newShop.ext.b.a(new AnonymousClass1(this.this$1), this.$showTimeBySecond * 1000);
        }
    }

    /* renamed from: com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftComponentListAdapter$ShopLoftItemViewHolder$tryToShowTransitionCard$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements ruk<t> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ f.a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(f.a aVar) {
            super(0);
            this.this$0 = aVar;
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
            View d = this.this$0.d();
            if (d == null) {
                return;
            }
            o.e(d);
        }
    }
}
