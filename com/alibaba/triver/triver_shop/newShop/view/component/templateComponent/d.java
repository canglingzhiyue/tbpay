package com.alibaba.triver.triver_shop.newShop.view.component.templateComponent;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ceg;
import tb.kge;
import tb.rul;

/* loaded from: classes3.dex */
public final class d extends com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int f;
    private final boolean g;
    private final rul<Integer, t> h;
    private final String i;
    private boolean j;

    /* loaded from: classes3.dex */
    public static final class a extends c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ com.alibaba.triver.triver_shop.newShop.data.d b;
        public final /* synthetic */ Context c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.alibaba.triver.triver_shop.newShop.data.d dVar, Context context) {
            super(context, d.this);
            this.b = dVar;
            this.c = context;
        }

        @Override // com.alibaba.triver.triver_shop.newShop.data.h.b
        public void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            } else if (!d.this.h() || !(obj instanceof String)) {
            } else {
                int a2 = com.alibaba.triver.triver_shop.newShop.ext.b.a((String) obj);
                d.this.a(true);
                d.this.a(a2);
                com.alibaba.triver.triver_shop.newShop.ext.b.a(new IndexNavComponent$init$1$switchTabTo$1(this.b, d.this, a2));
            }
        }
    }

    static {
        kge.a(-1043663771);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        if (str.hashCode() == -511102794) {
            super.a((Context) objArr[0], (com.alibaba.triver.triver_shop.newShop.data.d) objArr[1], (com.alibaba.triver.triver_shop.newShop.ext.e) objArr[2], (JSONObject) objArr[3]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a
    public void a(Context context, com.alibaba.triver.triver_shop.newShop.data.d shopData, com.alibaba.triver.triver_shop.newShop.ext.e shopDXEngine, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e18930b6", new Object[]{this, context, shopData, shopDXEngine, jSONObject});
            return;
        }
        q.d(context, "context");
        q.d(shopData, "shopData");
        q.d(shopDXEngine, "shopDXEngine");
        super.a(context, shopData, shopDXEngine, jSONObject);
        JSONObject l = shopData.l(this.i);
        if (l == null) {
            ceg.Companion.b(q.a("can not find shop template : ", (Object) this.i));
            shopDXEngine.d();
            return;
        }
        if (jSONObject == null) {
            jSONObject = shopData.h(this.f);
        }
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) com.alibaba.triver.triver_shop.newShop.ext.g.KEY_HAS_BIG_CARD_STYLE, (String) Boolean.valueOf(this.g));
        com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a.a(this, l, jSONObject2, false, 4, null);
        shopDXEngine.c().a(com.alibaba.triver.triver_shop.newShop.data.h.headerIndexNavArea, new a(shopData, context));
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        a(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SELECTED_INDEX, Integer.valueOf(i));
        rul<Integer, t> rulVar = this.h;
        if (rulVar == null) {
            return;
        }
        rulVar.mo2421invoke(Integer.valueOf(i));
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a
    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : d().getVisibility() == 0;
    }
}
