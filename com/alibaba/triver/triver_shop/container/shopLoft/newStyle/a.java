package com.alibaba.triver.triver_shop.container.shopLoft.newStyle;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.extension.dianmicX.a;
import com.alibaba.triver.triver_shop.newShop.ext.f;
import com.alibaba.triver.triver_shop.newShop.ext.g;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.HashMap;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ceg;
import tb.fvb;
import tb.fve;
import tb.kge;
import tb.ruk;
import tb.rul;
import tb.ruw;

/* loaded from: classes3.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Activity f3751a;
    private final DinamicXEngine b;
    private final c c;
    private final HashMap<Integer, ruw<DXTemplateItem, Boolean, t>> d;

    static {
        kge.a(-1931963927);
    }

    public a(Activity context) {
        q.d(context, "context");
        this.f3751a = context;
        this.c = new c();
        this.d = new HashMap<>();
        this.b = new DinamicXEngine(new DXEngineConfig.a("shopLoft").b(2).c(true).a());
        this.b.a(com.alibaba.triver.triver_shop.extension.dianmicX.a.DXSHOPAUTOSCROLLTEXTVIEW_SHOPAUTOSCROLLTEXTVIEW, new a.C0132a());
        this.b.a(new fve() { // from class: com.alibaba.triver.triver_shop.container.shopLoft.newStyle.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.fve
            public final void onNotificationListener(fvb fvbVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("73876f63", new Object[]{this, fvbVar});
                    return;
                }
                for (DXTemplateItem dXTemplateItem : fvbVar.f28139a) {
                    if (dXTemplateItem instanceof com.alibaba.triver.triver_shop.newShop.data.b) {
                        com.alibaba.triver.triver_shop.newShop.ext.b.b(new ShopLoftDXEngine$1$1(a.this, dXTemplateItem));
                    }
                }
                for (DXTemplateItem dXTemplateItem2 : fvbVar.b) {
                    if (dXTemplateItem2 instanceof com.alibaba.triver.triver_shop.newShop.data.b) {
                        com.alibaba.triver.triver_shop.newShop.ext.b.b(new ShopLoftDXEngine$1$2(a.this, dXTemplateItem2));
                    }
                }
            }
        });
        this.b.a(g.TB_SHOP_TAP_EVENT_CODE, new C0130a(this));
    }

    public final DinamicXEngine a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("4d3f629f", new Object[]{this}) : this.b;
    }

    public final c b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("2b9f6ce5", new Object[]{this}) : this.c;
    }

    private final void a(JSONObject jSONObject, int i, ruw<? super DXTemplateItem, ? super Boolean, t> ruwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9da9f4d7", new Object[]{this, jSONObject, new Integer(i), ruwVar});
            return;
        }
        com.alibaba.triver.triver_shop.newShop.data.b bVar = (com.alibaba.triver.triver_shop.newShop.data.b) f.a(jSONObject);
        bVar.a(i);
        this.d.put(Integer.valueOf(i), ruwVar);
        this.b.a(p.a(bVar));
    }

    public final void a(JSONObject dxJsonConfig, JSONObject data, int i, rul<? super View, t> createViewCallback, ruk<t> rukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a7bdcca", new Object[]{this, dxJsonConfig, data, new Integer(i), createViewCallback, rukVar});
            return;
        }
        q.d(dxJsonConfig, "dxJsonConfig");
        q.d(data, "data");
        q.d(createViewCallback, "createViewCallback");
        DXTemplateItem a2 = this.b.a(f.a(dxJsonConfig));
        if (a2 != null && StringUtils.equals(dxJsonConfig.getString("version"), String.valueOf(a2.b))) {
            createViewCallback.mo2421invoke(a(a2, data));
            ceg.Companion.b(q.a("dx template fetch success : ", (Object) a2.toString()));
            return;
        }
        a(dxJsonConfig, i, new ShopLoftDXEngine$fetchAndDownloadDxTemplate$1(createViewCallback, this, data, rukVar));
    }

    private final View a(DXTemplateItem dXTemplateItem, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93565181", new Object[]{this, dXTemplateItem, jSONObject});
        }
        DXResult<DXRootView> b = this.b.b(this.f3751a, this.b.a(dXTemplateItem));
        this.b.a(b.f11780a, jSONObject);
        DXRootView dXRootView = b.f11780a;
        q.b(dXRootView, "viewResult.result");
        o.g(dXRootView);
        DXRootView dXRootView2 = b.f11780a;
        q.b(dXRootView2, "viewResult.result");
        return dXRootView2;
    }

    /* renamed from: com.alibaba.triver.triver_shop.container.shopLoft.newStyle.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public final class C0130a extends h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f3753a;

        static {
            kge.a(1684944226);
        }

        public C0130a(a this$0) {
            q.d(this$0, "this$0");
            this.f3753a = this$0;
        }

        @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
        public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
                return;
            }
            c b = this.f3753a.b();
            if (dXRuntimeContext == null) {
                return;
            }
            b.a(objArr, dXRuntimeContext);
        }
    }
}
