package com.alibaba.triver.triver_shop.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.alibaba.evo.EVO;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.ShopLoftActivity;
import com.alibaba.triver.triver_shop.newShop.NativeShopActivity;
import com.alibaba.triver.triver_shop.newShop.ShopActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.common.ShopUrlFilter;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.collections.p;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.ceg;
import tb.cen;
import tb.kge;

/* loaded from: classes3.dex */
public final class ShopNavAdapter implements com.taobao.android.nav.e, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static boolean enableNewRouteLogic;
    private static final ArrayList<String> shop2022IndustryShopList;
    private static final ArrayList<String> shop2023IndustryShopList;
    private static JSONArray shopRouteSpmBlackList;
    private static JSONArray shopRouteSpmWhiteList;
    private final ShopUrlFilter shopUrlFilter = new ShopUrlFilter();

    @JvmStatic
    public static final boolean canJumpToNativeShop(Context context, Uri uri, Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6687974d", new Object[]{context, uri, intent})).booleanValue() : Companion.a(context, uri, intent);
    }

    @JvmStatic
    public static final boolean isShopFullScreenPage(Context context, Uri uri, Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7ca178f1", new Object[]{context, uri, intent})).booleanValue() : Companion.b(context, uri, intent);
    }

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "ShopNavAdapter";
    }

    @Override // com.taobao.android.nav.e
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static final /* synthetic */ ArrayList access$getShop2022IndustryShopList$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("7cc3a1f6", new Object[0]) : shop2022IndustryShopList;
    }

    public static final /* synthetic */ ArrayList access$getShop2023IndustryShopList$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("3fb00b55", new Object[0]) : shop2023IndustryShopList;
    }

    public static final /* synthetic */ void access$setEnableNewRouteLogic$cp(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede9f94c", new Object[]{new Boolean(z)});
        } else {
            enableNewRouteLogic = z;
        }
    }

    public static final /* synthetic */ void access$setShopRouteSpmBlackList$cp(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e084d02", new Object[]{jSONArray});
        } else {
            shopRouteSpmBlackList = jSONArray;
        }
    }

    public static final /* synthetic */ void access$setShopRouteSpmWhiteList$cp(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c49dda98", new Object[]{jSONArray});
        } else {
            shopRouteSpmWhiteList = jSONArray;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(208600786);
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        private a() {
        }

        public static final /* synthetic */ void a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48f559b2", new Object[]{aVar});
            } else {
                aVar.c();
            }
        }

        private final void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            ShopNavAdapter.access$setEnableNewRouteLogic$cp(cen.Companion.r());
            ShopNavAdapter.access$setShopRouteSpmWhiteList$cp(cen.Companion.p());
            ShopNavAdapter.access$setShopRouteSpmBlackList$cp(cen.Companion.q());
        }

        public final ArrayList<String> a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("ab0d0c42", new Object[]{this}) : ShopNavAdapter.access$getShop2022IndustryShopList$cp();
        }

        public final ArrayList<String> b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("2f3d5943", new Object[]{this}) : ShopNavAdapter.access$getShop2023IndustryShopList$cp();
        }

        @JvmStatic
        public final boolean b(Context context, Uri uri, Intent oldIntent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8cfa32e9", new Object[]{this, context, uri, oldIntent})).booleanValue();
            }
            q.d(context, "context");
            q.d(oldIntent, "oldIntent");
            if (uri == null || !q.a((Object) "m.taobao.com", (Object) uri.getHost())) {
                return false;
            }
            boolean a2 = q.a((Object) "/app/shop-conainer/videofullpage.html", (Object) uri.getPath());
            if (!q.a((Object) "/app/shop-conainer/contentlistpage.html", (Object) uri.getPath()) && !a2) {
                return false;
            }
            Intent intent = new Intent();
            intent.setData(uri);
            intent.setFlags(65536);
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            Bundle extras = oldIntent.getExtras();
            if (extras != null) {
                intent.putExtras(extras);
            }
            intent.setClass(context, ShopLoftActivity.class);
            context.startActivity(intent);
            return true;
        }

        @JvmStatic
        public final boolean a(Context context, Uri uri, Intent intent) {
            Bundle extras;
            Bundle extras2;
            Bundle extras3;
            String string;
            Bundle extras4;
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a9ce7fa8", new Object[]{this, context, uri, intent})).booleanValue();
            }
            q.d(context, "context");
            if (!(uri != null && com.alibaba.triver.triver_shop.newShop.ext.h.a(uri)) || !q.a((Object) "true", (Object) uri.getQueryParameter("isDX"))) {
                return false;
            }
            String queryParameter = uri.getQueryParameter("spm");
            if (queryParameter != null) {
                Uri.Builder builder = uri.buildUpon();
                builder.appendQueryParameter("containerFixSpm", "true");
                builder.appendQueryParameter("containerSpm", queryParameter);
                q.b(builder, "builder");
                com.alibaba.triver.triver_shop.newShop.ext.b.a(builder, "spm");
                uri = builder.build();
            }
            if (intent != null && (extras4 = intent.getExtras()) != null) {
                z = extras4.getBoolean("targetUrlReplaced", false);
            }
            Intent intent2 = new Intent();
            intent2.setData(uri);
            if (z && intent != null && (extras3 = intent.getExtras()) != null && (string = extras3.getString("originalTargetUrl")) != null) {
                intent2.setData(Uri.parse(string));
            }
            String queryParameter2 = uri.getQueryParameter("industryShop");
            boolean a2 = q.a((Object) uri.getQueryParameter("disableShopOpenAnimation"), (Object) "true");
            if (!a().contains(queryParameter2) && !p.a((Iterable<? extends String>) b(), queryParameter2)) {
                intent2.setClass(context, NativeShopActivity.class);
            } else {
                intent2.setClass(context, ShopActivity.class);
            }
            if (queryParameter != null) {
                intent2.putExtra("spm", queryParameter);
            }
            Serializable serializable = null;
            if (intent != null && (extras2 = intent.getExtras()) != null) {
                serializable = extras2.getSerializable("routeConfig");
            }
            ceg.Companion.b(q.a("shop route config : ", (Object) serializable));
            boolean a3 = serializable instanceof JSONObject ? q.a((Object) ((JSONObject) serializable).getString("shopPrefetchEnable"), (Object) "true") : true;
            intent2.putExtra(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_ENABLE_NEW_START_AC_LOGIC, a3);
            if (a3) {
                long hashCode = uri.hashCode() + System.currentTimeMillis();
                intent2.putExtra("shopBundleId", hashCode);
                ShopNavAdapter$Companion$canJumpToNativeShop$startAction$1 shopNavAdapter$Companion$canJumpToNativeShop$startAction$1 = new ShopNavAdapter$Companion$canJumpToNativeShop$startAction$1(intent, context, intent2, a2, hashCode);
                if (com.alibaba.triver.triver_shop.newShop.ext.b.b()) {
                    shopNavAdapter$Companion$canJumpToNativeShop$startAction$1.mo2427invoke();
                } else {
                    com.alibaba.triver.triver_shop.newShop.ext.b.b(shopNavAdapter$Companion$canJumpToNativeShop$startAction$1);
                }
            } else {
                if (intent != null && (extras = intent.getExtras()) != null) {
                    intent2.putExtras(extras);
                }
                if (!(context instanceof Activity)) {
                    intent2.setFlags(268435456);
                }
                context.startActivity(intent2);
            }
            return true;
        }
    }

    static {
        kge.a(1320032266);
        kge.a(-719787762);
        kge.a(1028243835);
        Companion = new a(null);
        enableNewRouteLogic = cen.Companion.r();
        shopRouteSpmWhiteList = cen.Companion.p();
        shopRouteSpmBlackList = cen.Companion.q();
        shop2022IndustryShopList = p.d(com.alibaba.triver.triver_shop.newShop.manager.e.FLAG_SHIP_SHOP, com.alibaba.triver.triver_shop.newShop.manager.e.FLAG_SHIP_SHOP_V2, com.alibaba.triver.triver_shop.newShop.manager.e.C_BRAND_CLOTH_SHOP, com.alibaba.triver.triver_shop.newShop.manager.e.VIDEO_SHOP_2, com.alibaba.triver.triver_shop.newShop.manager.e.DEFAULT_SHOP, com.alibaba.triver.triver_shop.newShop.manager.e.DEFAULT_SHOP_V2);
        shop2023IndustryShopList = p.d(com.alibaba.triver.triver_shop.newShop.manager.e.DEFAULT_2023, com.alibaba.triver.triver_shop.newShop.manager.e.XSD_SHOP, com.alibaba.triver.triver_shop.newShop.manager.e.OVERSEA_SHOP, "farmshop_c", "farmshop_x", "farmshop_z", "farmShop2024");
    }

    @Override // com.taobao.android.nav.e
    public boolean process(Intent intent, com.taobao.android.nav.d dVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        if (intent != null && dVar != null) {
            Uri data = intent.getData();
            String str = null;
            String uri = data == null ? null : data.toString();
            Uri data2 = intent.getData();
            if (q.a((Object) (data2 == null ? null : data2.getQueryParameter("shopNavIgnore")), (Object) "true")) {
                return true;
            }
            if (uri != null) {
                Uri data3 = intent.getData();
                boolean a2 = q.a((Object) (data3 == null ? null : data3.getQueryParameter("shopFrameworkType")), (Object) "native");
                h a3 = com.alibaba.triver.triver_shop.newShop.ext.h.a(uri);
                if (cen.Companion.ao() && a2) {
                    ceg.Companion.b("match shopFrameworkType=native");
                    Context a4 = dVar.a();
                    q.b(a4, "navContext.context");
                    if (!a3.a() || a3.b()) {
                        z = false;
                    }
                    com.alibaba.triver.triver_shop.newShop.ext.h.a(a4, uri, z);
                    return false;
                }
                Uri data4 = intent.getData();
                if (data4 != null) {
                    str = data4.getQueryParameter("spm");
                }
                boolean checkSpmIsValid = checkSpmIsValid(str);
                if (a3.a() && checkSpmIsValid) {
                    if (cen.Companion.ao() && a3.a() && !a3.b()) {
                        boolean isSwitchOpened = EVO.isSwitchOpened(dVar.a(), "openShop3RulesOpt");
                        ceg.Companion.b(q.a("openShop3RulesOpt=", (Object) Boolean.valueOf(isSwitchOpened)));
                        if (isSwitchOpened) {
                            Context a5 = dVar.a();
                            q.b(a5, "navContext.context");
                            com.alibaba.triver.triver_shop.newShop.ext.h.a(a5, uri, true);
                            return false;
                        }
                    }
                    if (this.shopUrlFilter.a(Uri.parse(uri).buildUpon().appendQueryParameter("matchAbsolutelyShopRule", String.valueOf(a3.a() && !a3.b())).toString(), dVar.a())) {
                        ceg.a aVar = ceg.Companion;
                        aVar.b("shop url : " + ((Object) uri) + " match absolutelyShopRule");
                        return false;
                    }
                }
            }
            a aVar2 = Companion;
            Context a6 = dVar.a();
            q.b(a6, "navContext.context");
            if (aVar2.b(a6, intent.getData(), intent)) {
                return false;
            }
            a aVar3 = Companion;
            Context a7 = dVar.a();
            q.b(a7, "navContext.context");
            if (aVar3.a(a7, intent.getData(), intent)) {
                return false;
            }
        }
        return true;
    }

    private final boolean checkSpmIsValid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1810ef5f", new Object[]{this, str})).booleanValue();
        }
        a.a(Companion);
        if (!enableNewRouteLogic || shopRouteSpmBlackList.contains(str)) {
            return false;
        }
        return shopRouteSpmWhiteList.contains("*") || shopRouteSpmWhiteList.contains(str);
    }
}
