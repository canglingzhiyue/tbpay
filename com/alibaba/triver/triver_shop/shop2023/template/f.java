package com.alibaba.triver.triver_shop.shop2023.template;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.shop2023.data.ShopComponentModel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.rir;
import tb.ris;
import tb.rit;

/* loaded from: classes3.dex */
public final class f extends com.alibaba.triver.triver_shop.shop2023.template.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes3.dex */
    public static final class a implements rir {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.alibaba.triver.triver_shop.newShop.data.d f4142a;
        public final /* synthetic */ f b;

        public a(com.alibaba.triver.triver_shop.newShop.data.d dVar, f fVar) {
            this.f4142a = dVar;
            this.b = fVar;
        }

        @Override // tb.rir
        public final void a(Object obj) {
            JSONObject a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
                return;
            }
            if (obj instanceof JSONObject) {
                a2 = (JSONObject) obj;
            } else {
                a2 = obj instanceof String ? com.alibaba.triver.triver_shop.newShop.ext.d.a((String) obj) : null;
                if (a2 == null) {
                    return;
                }
            }
            String string = a2.getString("sellerId");
            String string2 = a2.getString("name");
            if (!q.a((Object) string, (Object) this.f4142a.U()) || !q.a((Object) string2, (Object) "authSuccess")) {
                return;
            }
            this.b.n();
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements rir {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.alibaba.triver.triver_shop.newShop.data.d f4143a;
        public final /* synthetic */ f b;

        public b(com.alibaba.triver.triver_shop.newShop.data.d dVar, f fVar) {
            this.f4143a = dVar;
            this.b = fVar;
        }

        @Override // tb.rir
        public final void a(Object obj) {
            JSONObject a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
                return;
            }
            if (obj instanceof JSONObject) {
                a2 = (JSONObject) obj;
            } else {
                a2 = obj instanceof String ? com.alibaba.triver.triver_shop.newShop.ext.d.a((String) obj) : null;
                if (a2 == null) {
                    return;
                }
            }
            if (!q.a((Object) a2.getString("sellerId"), (Object) this.f4143a.U())) {
                return;
            }
            this.b.n();
        }
    }

    static {
        kge.a(-254295365);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ShopComponentModel shopComponentModel) {
        super(shopComponentModel);
        q.d(shopComponentModel, "shopComponentModel");
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
        com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a.a(this, l().getDXJSONConfig(), shopData.bc().a(l().getData()), false, 4, null);
        final ris risVar = new ris(context, "member_auth_poplayer", new a(shopData, this));
        final ris risVar2 = new ris(context, "exit_member_success", new b(shopData, this));
        Context am = shopData.am();
        if (am != null && (am instanceof FragmentActivity)) {
            ((FragmentActivity) am).getLifecycle().addObserver(new LifecycleObserver() { // from class: com.alibaba.triver.triver_shop.shop2023.template.Shop2023HeaderRelationTemplate$init$1$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                public final void onDestroyed() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("bf354a81", new Object[]{this});
                        return;
                    }
                    ris.this.b();
                    risVar2.b();
                }
            });
        }
        rit.a(shopData.am());
    }

    @Override // com.alibaba.triver.triver_shop.shop2023.template.a, com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
            return;
        }
        q.d(view, "view");
        c().c().a((DXRootView) view, new com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.c(b(), this));
        super.b(view);
    }
}
