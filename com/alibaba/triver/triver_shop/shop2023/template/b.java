package com.alibaba.triver.triver_shop.shop2023.template;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.d;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.rul;

/* loaded from: classes3.dex */
public final class b extends com.alibaba.triver.triver_shop.shop2023.template.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final rul<Integer, t> f;

    /* renamed from: com.alibaba.triver.triver_shop.shop2023.template.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class RunnableC0158b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        public RunnableC0158b(int i) {
            this.b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                b.this.b(com.alibaba.triver.triver_shop.newShop.ext.d.a(kotlin.j.a(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SELECTED_INDEX, Integer.valueOf(this.b))));
            }
        }
    }

    static {
        kge.a(1734528010);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1862045111) {
            super.b((View) objArr[0]);
            return null;
        } else if (hashCode != -511102794) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((Context) objArr[0], (com.alibaba.triver.triver_shop.newShop.data.d) objArr[1], (com.alibaba.triver.triver_shop.newShop.ext.e) objArr[2], (JSONObject) objArr[3]);
            return null;
        }
    }

    public static final /* synthetic */ rul a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rul) ipChange.ipc$dispatch("5988a65", new Object[]{bVar}) : bVar.f;
    }

    public static final /* synthetic */ void a(b bVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ca64b", new Object[]{bVar, new Integer(i)});
        } else {
            bVar.b(i);
        }
    }

    @Override // com.alibaba.triver.triver_shop.shop2023.template.a, com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a
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
        JSONObject M = shopData.M();
        JSONObject a2 = new d.c(shopData).a(l().getData());
        JSONObject jSONObject2 = a2.getJSONObject("nativeData");
        if (jSONObject2 != null) {
            JSONObject jSONObject3 = jSONObject2;
            jSONObject3.put((JSONObject) com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SELECTED_INDEX, (String) Integer.valueOf(shopData.p()));
            jSONObject3.put((JSONObject) "tabData", (String) M.get("tabData"));
        }
        com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a.a(this, l().getDXJSONConfig(), a2, false, 4, null);
    }

    private final void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        RunnableC0158b runnableC0158b = new RunnableC0158b(i);
        if (!h()) {
            a(runnableC0158b);
        } else {
            runnableC0158b.run();
        }
    }

    /* loaded from: classes3.dex */
    public static final class a extends com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Context context) {
            super(context, b.this);
        }

        @Override // com.alibaba.triver.triver_shop.newShop.data.h.b
        public void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            } else if (obj == null || !(obj instanceof String)) {
            } else {
                int a2 = com.alibaba.triver.triver_shop.newShop.ext.b.a((String) obj);
                rul a3 = b.a(b.this);
                if (a3 != null) {
                    a3.mo2421invoke(Integer.valueOf(a2));
                }
                b.a(b.this, a2);
                com.alibaba.triver.triver_shop.newShop.ext.b.b(new Shop2023BottomBarTemplate$createViewCallback$1$switchTabTo$1(this, a2));
            }
        }
    }

    @Override // com.alibaba.triver.triver_shop.shop2023.template.a, com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
            return;
        }
        q.d(view, "view");
        c().c().a((DXRootView) view, new a(b()));
        com.alibaba.triver.triver_shop.newShop.ext.k.a(a(), a().p());
        super.b(view);
        if (q.a((Object) a().L(), (Object) com.alibaba.triver.triver_shop.newShop.ext.g.KEY_DONG_TAI)) {
        }
    }
}
