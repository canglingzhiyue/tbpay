package com.alibaba.triver.triver_shop.preload;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.support.v4.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wangxin.utils.WXConstantsOut;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.ceg;
import tb.cen;
import tb.kge;

/* loaded from: classes3.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final e INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f4028a;
    private static boolean b;
    private static a c;

    static {
        kge.a(1475316667);
        INSTANCE = new e();
    }

    private e() {
    }

    public static final /* synthetic */ void a(e eVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebfddaca", new Object[]{eVar, str});
        } else {
            eVar.a(str);
        }
    }

    public static final /* synthetic */ void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            f4028a = z;
        }
    }

    public static final /* synthetic */ void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{new Boolean(z)});
        } else {
            b = z;
        }
    }

    public final a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("acd1c0a", new Object[]{this}) : c;
    }

    public final void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbb11f84", new Object[]{this, aVar});
        } else {
            c = aVar;
        }
    }

    public final void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        q.d(context, "context");
        LocalBroadcastManager.getInstance(context.getApplicationContext()).registerReceiver(new BroadcastReceiver() { // from class: com.alibaba.triver.triver_shop.preload.ShopRouterMiniDataPreload$registerShopStartRouteBroadcastReceiver$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                String stringExtra;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                } else if (intent == null || (stringExtra = intent.getStringExtra("shopRouteUrl")) == null) {
                } else {
                    e.a(e.INSTANCE, stringExtra);
                    com.alibaba.triver.triver_shop.newShop.ext.b.a("updateEnableMiniDataPreloadSwitch", ShopRouterMiniDataPreload$registerShopStartRouteBroadcastReceiver$1$onReceive$1.INSTANCE);
                }
            }
        }, new IntentFilter("SHOP_START_ROUTE"));
        LocalBroadcastManager.getInstance(context.getApplicationContext()).registerReceiver(new BroadcastReceiver() { // from class: com.alibaba.triver.triver_shop.preload.ShopRouterMiniDataPreload$registerShopStartRouteBroadcastReceiver$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    return;
                }
                ceg.Companion.b("SHOP_ROUTE_HIT");
                if (!cen.Companion.an() || context2 == null) {
                    return;
                }
                b.INSTANCE.a(context2);
            }
        }, new IntentFilter("SHOP_ROUTE_HIT"));
    }

    private final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!f4028a || !b(str)) {
        } else {
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("shopId");
            if (queryParameter == null && (queryParameter = parse.getQueryParameter(WXConstantsOut.SHOPID)) == null) {
                queryParameter = parse.getQueryParameter("shop_id");
            }
            String queryParameter2 = parse.getQueryParameter("sellerId");
            if (queryParameter2 == null && (queryParameter2 = parse.getQueryParameter("seller_id")) == null) {
                queryParameter2 = parse.getQueryParameter("user_id");
            }
            String queryParameter3 = parse.getQueryParameter("inShopPageId");
            if (queryParameter3 == null) {
                queryParameter3 = "0";
            }
            if (queryParameter == null || queryParameter2 == null) {
                ceg.a aVar = ceg.Companion;
                aVar.b("stop miniData shopId : " + ((Object) queryParameter) + " , sellerId : " + ((Object) queryParameter2));
            } else if (b) {
            } else {
                b = true;
                String uri = Uri.parse(cen.Companion.ae() ? "https://alisite.wapa.taobao.com/minidata/shop/index/downgrade.htm?pathInfo=shop/index2" : "https://alisitecdn.m.taobao.com/minidata/shop/index/downgrade.htm?pathInfo=shop/index2").buildUpon().appendQueryParameter("shopId", queryParameter).appendQueryParameter("userId", queryParameter2).appendQueryParameter("pageId", queryParameter3).build().toString();
                q.b(uri, "parse(baseUrl).buildUpon()\n                .appendQueryParameter(\"shopId\", shopId)\n                .appendQueryParameter(\"userId\", sellerId)\n                .appendQueryParameter(\"pageId\", inShopPageId)\n                .build().toString()");
                com.alibaba.triver.triver_shop.newShop.ext.b.a("shopRouteMiniDataPrefetch", new ShopRouterMiniDataPreload$startShopMiniDataPreload$1(uri, queryParameter));
            }
        }
    }

    private final boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        if (n.b((CharSequence) str, (CharSequence) "isDX=true", false, 2, (Object) null) || com.alibaba.triver.triver_shop.newShop.ext.h.a(str).a()) {
            return true;
        }
        ceg.a aVar = ceg.Companion;
        aVar.b("route url is " + str + " , not matched mini data preload");
        return false;
    }
}
