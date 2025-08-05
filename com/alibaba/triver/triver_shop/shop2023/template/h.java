package com.alibaba.triver.triver_shop.shop2023.template;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.ruw;

/* loaded from: classes3.dex */
public final class h extends com.alibaba.triver.triver_shop.shop2023.template.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final ruw<Integer, Integer, t> f;
    private int g;
    private int h;
    private boolean i;
    private final Integer[] j;

    /* loaded from: classes3.dex */
    public static final class a extends com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Context context) {
            super(context, h.this);
        }

        @Override // com.alibaba.triver.triver_shop.newShop.data.h.b
        public void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            } else if (!h.this.h() || !(obj instanceof String)) {
            } else {
                int a2 = com.alibaba.triver.triver_shop.newShop.ext.b.a((String) obj);
                h.this.a(true);
                h hVar = h.this;
                hVar.a(hVar.o(), a2);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        public b(int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            h.this.a(this.b);
            h.this.b(this.c);
            h.a(h.this)[this.b] = Integer.valueOf(this.c);
            JSONObject jSONObject = com.alibaba.triver.triver_shop.newShop.ext.h.a(h.b(h.this)).getJSONObject("nativeData");
            if (jSONObject == null) {
                return;
            }
            h hVar = h.this;
            int i = this.b;
            int i2 = this.c;
            JSONObject jSONObject2 = (JSONObject) jSONObject.clone();
            JSONObject jSONObject3 = jSONObject2;
            jSONObject3.put((JSONObject) "tabData", (String) hVar.a().h(i).get("tabData"));
            jSONObject3.put((JSONObject) "bottomIndex", (String) Integer.valueOf(i));
            jSONObject3.put((JSONObject) com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SELECTED_INDEX, (String) Integer.valueOf(i2));
            hVar.a("nativeData", jSONObject2);
        }
    }

    static {
        kge.a(-606344121);
    }

    public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
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

    public static final /* synthetic */ Integer[] a(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer[]) ipChange.ipc$dispatch("12722ea6", new Object[]{hVar}) : hVar.j;
    }

    public static final /* synthetic */ View b(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("e366e875", new Object[]{hVar}) : hVar.e();
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public final int o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("631b569", new Object[]{this})).intValue() : this.g;
    }

    public final void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    public final int p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("63fccea", new Object[]{this})).intValue() : this.h;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
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
        JSONObject h = shopData.h(this.g);
        JSONObject dXJSONConfig = l().getDXJSONConfig();
        JSONObject a2 = shopData.bc().a(l().getData());
        JSONObject jSONObject2 = a2.getJSONObject("nativeData");
        if (jSONObject2 != null) {
            JSONObject jSONObject3 = jSONObject2;
            jSONObject3.put((JSONObject) "tabData", (String) h.get("tabData"));
            jSONObject3.put((JSONObject) "bottomIndex", (String) Integer.valueOf(o()));
            jSONObject3.put((JSONObject) com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SELECTED_INDEX, (String) Integer.valueOf(p()));
        }
        this.j[this.g] = Integer.valueOf(this.h);
        com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a.a(this, dXJSONConfig, a2, false, 4, null);
    }

    private final void c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ddc94a", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        b bVar = new b(i, i2);
        if (!h()) {
            a(bVar);
        } else {
            bVar.run();
        }
    }

    public final void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        c(i, i2);
        ruw<Integer, Integer, t> ruwVar = this.f;
        if (ruwVar == null) {
            return;
        }
        ruwVar.mo2423invoke(Integer.valueOf(i), Integer.valueOf(i2));
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
        super.b(view);
    }
}
