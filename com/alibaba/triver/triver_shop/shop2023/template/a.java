package com.alibaba.triver.triver_shop.shop2023.template;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.shop2023.data.ShopComponentModel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Result;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.rul;

/* loaded from: classes3.dex */
public class a extends com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final ShopComponentModel f;
    private ArrayList<Runnable> g;
    private rul<? super a, t> h;

    static {
        kge.a(1784395866);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
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

    public final ShopComponentModel l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShopComponentModel) ipChange.ipc$dispatch("726fa8f", new Object[]{this}) : this.f;
    }

    public a(ShopComponentModel shopComponentModel) {
        q.d(shopComponentModel, "shopComponentModel");
        this.f = shopComponentModel;
        this.g = new ArrayList<>();
    }

    public final void a(rul<? super a, t> rulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc03baf", new Object[]{this, rulVar});
        } else {
            this.h = rulVar;
        }
    }

    public final rul<a, t> m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rul) ipChange.ipc$dispatch("6b5dfc29", new Object[]{this}) : this.h;
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
        n();
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else if (!this.f.getSendMtop()) {
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.h.a(b(), this.f, new Shop2023BaseTemplateComponent$tryToRequestAndRefreshData$1(this), new Shop2023BaseTemplateComponent$tryToRequestAndRefreshData$2(this));
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
            return;
        }
        q.d(view, "view");
        super.b(view);
        if (!this.f.getSendMtop()) {
            k();
        }
        o();
    }

    public final void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
            return;
        }
        ArrayList<Runnable> arrayList = this.g;
        if (runnable == null) {
            return;
        }
        arrayList.add(runnable);
    }

    private final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        Iterator<Runnable> it = this.g.iterator();
        while (it.hasNext()) {
            Runnable next = it.next();
            try {
                Result.a aVar = Result.Companion;
                next.run();
                Result.m2371constructorimpl(t.INSTANCE);
            } catch (Throwable th) {
                Result.a aVar2 = Result.Companion;
                Result.m2371constructorimpl(kotlin.i.a(th));
            }
        }
        this.g.clear();
    }

    public final void a(String key) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, key});
            return;
        }
        q.d(key, "key");
        if (!h() || (jSONObject = com.alibaba.triver.triver_shop.newShop.ext.h.a(e()).getJSONObject("nativeData")) == null) {
            return;
        }
        JSONObject jSONObject2 = (JSONObject) jSONObject.clone();
        jSONObject2.remove(key);
        a("nativeData", jSONObject2);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a
    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : i();
    }
}
