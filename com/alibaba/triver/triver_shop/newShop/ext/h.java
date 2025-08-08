package com.alibaba.triver.triver_shop.newShop.ext;

import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.windvane.export.adapter.ILocalizationService;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.alibaba.ariver.app.api.App;
import com.alibaba.evo.EVO;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.ShopLoftActivity;
import com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftViewManager;
import com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftNewVideoView;
import com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftNewVideoViewWithDW;
import com.alibaba.triver.triver_shop.newShop.NativeShopActivity;
import com.alibaba.triver.triver_shop.newShop.ext.g;
import com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender;
import com.alibaba.triver.triver_shop.newShop.view.ShopStandardFragment;
import com.alibaba.triver.triver_shop.newShop.view.ShopView;
import com.alibaba.triver.triver_shop.shop2023.data.ShopComponentModel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.mobile.auth.gatewayauth.ResultCode;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.android.behavix.service.BUFS;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.android.nav.Nav;
import com.taobao.android.shop.activity.ShopRenderActivity;
import com.taobao.monitor.procedure.s;
import com.taobao.tao.Globals;
import com.taobao.tao.shop.common.ShopConstants;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.wangxin.utils.WXConstantsOut;
import com.tmall.android.dai.DAI;
import com.tmall.android.dai.DAICallback;
import com.tmall.android.dai.DAIError;
import com.ut.mini.UTAnalytics;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.ai;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.x;
import kotlin.t;
import kotlin.text.Regex;
import mtopsdk.mtop.util.ErrorConstant;
import tb.ceg;
import tb.ceh;
import tb.cei;
import tb.cel;
import tb.cen;
import tb.kge;
import tb.nmf;
import tb.noa;
import tb.nwr;
import tb.ruk;
import tb.rul;
import tb.ruw;

/* loaded from: classes3.dex */
public final class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes3.dex */
    public static final class a implements com.taobao.android.miniLive.ui.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.alibaba.triver.triver_shop.newShop.data.d f3855a;

        public a(com.alibaba.triver.triver_shop.newShop.data.d dVar) {
            this.f3855a = dVar;
        }

        @Override // com.taobao.android.miniLive.ui.d
        public final void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.f3855a.bi().b(z);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f3856a;

        public b(f fVar) {
            this.f3856a = fVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                this.f3856a.dismiss();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f3857a;

        public c(f fVar) {
            this.f3857a = fVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                this.f3857a.dismiss();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ruk<t> f3858a;
        public final /* synthetic */ f b;

        public d(ruk<t> rukVar, f fVar) {
            this.f3858a = rukVar;
            this.b = fVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ruk<t> rukVar = this.f3858a;
            if (rukVar != null) {
                rukVar.mo2427invoke();
            }
            this.b.dismiss();
        }
    }

    /* loaded from: classes3.dex */
    public static final class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ruk<t> f3859a;
        public final /* synthetic */ f b;

        public e(ruk<t> rukVar, f fVar) {
            this.f3859a = rukVar;
            this.b = fVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ruk<t> rukVar = this.f3859a;
            if (rukVar != null) {
                rukVar.mo2427invoke();
            }
            this.b.dismiss();
        }
    }

    /* loaded from: classes3.dex */
    public static final class f extends Dialog {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f3860a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Context context) {
            super(context);
            this.f3860a = context;
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            if (str.hashCode() == -641568046) {
                super.onCreate((Bundle) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            WindowManager.LayoutParams attributes;
            View decorView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
                return;
            }
            super.onCreate(bundle);
            Window window = getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            Window window2 = getWindow();
            if (window2 != null && (decorView = window2.getDecorView()) != null) {
                decorView.setPadding(0, 0, 0, 0);
            }
            Window window3 = getWindow();
            if (window3 == null || (attributes = window3.getAttributes()) == null) {
                return;
            }
            attributes.gravity = 81;
            attributes.height = o.a((Number) 300);
            attributes.width = -1;
        }
    }

    /* loaded from: classes3.dex */
    public static final class g implements com.taobao.android.miniLive.ui.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.alibaba.triver.triver_shop.newShop.data.d f3861a;

        public g(com.alibaba.triver.triver_shop.newShop.data.d dVar) {
            this.f3861a = dVar;
        }

        @Override // com.taobao.android.miniLive.ui.d
        public final void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.f3861a.bi().b(z);
            }
        }
    }

    static {
        kge.a(1884085253);
    }

    public static final /* synthetic */ void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{intent});
        } else {
            b(intent);
        }
    }

    public static final /* synthetic */ void a(String str, String str2, boolean z, boolean z2, String str3, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a80c4fce", new Object[]{str, str2, new Boolean(z), new Boolean(z2), str3, new Boolean(z3)});
        } else {
            b(str, str2, z, z2, str3, z3);
        }
    }

    public static final /* synthetic */ void d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f161bc7", new Object[]{context, str});
        } else {
            e(context, str);
        }
    }

    public static final com.alibaba.triver.triver_shop.adapter.h a(String routeUrl) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.triver.triver_shop.adapter.h) ipChange.ipc$dispatch("80a58553", new Object[]{routeUrl});
        }
        q.d(routeUrl, "routeUrl");
        if (kotlin.text.n.b((CharSequence) routeUrl, (CharSequence) "shop.m.taobao.com/shop/shop_index.htm", false, 2, (Object) null)) {
            if (c(routeUrl)) {
                return com.alibaba.triver.triver_shop.adapter.h.Companion.a();
            }
            return com.alibaba.triver.triver_shop.adapter.h.Companion.b();
        }
        String host = Uri.parse(routeUrl).getHost();
        if (host == null || kotlin.text.n.b((CharSequence) host, (CharSequence) "shop", false, 2, (Object) null)) {
            z = false;
        }
        if (z) {
            return com.alibaba.triver.triver_shop.adapter.h.Companion.c();
        }
        Regex[] a2 = com.alibaba.triver.triver_shop.newShop.ext.g.Companion.a();
        int length = a2.length;
        while (i < length) {
            Regex regex = a2[i];
            i++;
            if (host != null && regex.matches(host)) {
                return com.alibaba.triver.triver_shop.adapter.h.Companion.b();
            }
        }
        return com.alibaba.triver.triver_shop.adapter.h.Companion.c();
    }

    private static final boolean c(String str) {
        Uri c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue();
        }
        if (cen.Companion.au() && (c2 = com.alibaba.triver.triver_shop.newShop.ext.b.c(str)) != null) {
            String b2 = b(c2);
            String c3 = c(c2);
            if (kotlin.collections.p.a(g.b.INSTANCE.a(), b2) || kotlin.collections.p.a(g.b.INSTANCE.b(), c3)) {
                return true;
            }
        }
        return false;
    }

    private static final String b(Uri uri) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e66ffe2", new Object[]{uri});
        }
        String[] strArr = {"sellerId", "userId", "user_id", "userid", "seller_id", "sellerid"};
        int length = strArr.length;
        while (i < length) {
            String str = strArr[i];
            i++;
            String queryParameter = uri.getQueryParameter(str);
            if (queryParameter != null) {
                return queryParameter;
            }
        }
        return null;
    }

    private static final String c(Uri uri) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6767f723", new Object[]{uri});
        }
        String[] strArr = {"shopId", WXConstantsOut.SHOPID, "shop_id"};
        int length = strArr.length;
        while (i < length) {
            String str = strArr[i];
            i++;
            String queryParameter = uri.getQueryParameter(str);
            if (queryParameter != null) {
                return queryParameter;
            }
        }
        return null;
    }

    public static final void a(com.alibaba.triver.triver_shop.newShop.data.d dVar, Intent intent, Bundle bundle) {
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb68bd5e", new Object[]{dVar, intent, bundle});
            return;
        }
        q.d(dVar, "<this>");
        if (bundle == null) {
            bundle = intent == null ? null : intent.getExtras();
        }
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_APP_START)) {
            try {
                Result.a aVar = Result.Companion;
                dVar.b(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_APP_START, Long.valueOf(bundle.getLong(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_APP_START)));
                Result.m2371constructorimpl(t.INSTANCE);
            } catch (Throwable th) {
                Result.a aVar2 = Result.Companion;
                Result.m2371constructorimpl(kotlin.i.a(th));
            }
        }
        if (bundle.containsKey(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_ROUTER_START_TIME)) {
            try {
                Result.a aVar3 = Result.Companion;
                dVar.b(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_ROUTER_START_TIME, Long.valueOf(bundle.getLong(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_ROUTER_START_TIME)));
                Result.m2371constructorimpl(t.INSTANCE);
            } catch (Throwable th2) {
                Result.a aVar4 = Result.Companion;
                Result.m2371constructorimpl(kotlin.i.a(th2));
            }
        }
        if (bundle.containsKey(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_ROUTER_END_TIME)) {
            try {
                Result.a aVar5 = Result.Companion;
                dVar.b(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_ROUTER_END_TIME, Long.valueOf(bundle.getLong(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_ROUTER_END_TIME)));
                Result.m2371constructorimpl(t.INSTANCE);
            } catch (Throwable th3) {
                Result.a aVar6 = Result.Companion;
                Result.m2371constructorimpl(kotlin.i.a(th3));
            }
        }
        try {
            Result.a aVar7 = Result.Companion;
            dVar.b(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SHOP_LAUNCH_OPT, Boolean.valueOf(bundle.getBoolean(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SHOP_LAUNCH_OPT, false)));
            m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th4) {
            Result.a aVar8 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th4));
        }
        Result.m2370boximpl(m2371constructorimpl);
    }

    public static final Pair<Integer, Integer> a(String shpoNavi, JSONArray tabBarViewModelArray) {
        int size;
        JSONArray jSONArray;
        int size2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("7506c743", new Object[]{shpoNavi, tabBarViewModelArray});
        }
        q.d(shpoNavi, "shpoNavi");
        q.d(tabBarViewModelArray, "tabBarViewModelArray");
        Pair<Integer, Integer> pair = new Pair<>(0, 0);
        if (!StringUtils.isEmpty(shpoNavi) && tabBarViewModelArray.size() > 0 && (size = tabBarViewModelArray.size() - 1) >= 0) {
            while (true) {
                int i = size - 1;
                Object obj = tabBarViewModelArray.get(size);
                if ((obj instanceof JSONArray) && (size2 = (jSONArray = (JSONArray) obj).size()) > 0) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2 + 1;
                        Object obj2 = jSONArray.get(i2);
                        if ((obj2 instanceof JSONObject) && q.a((Object) shpoNavi, ((JSONObject) obj2).get("name"))) {
                            return new Pair<>(Integer.valueOf(size), Integer.valueOf(i2));
                        }
                        if (i3 >= size2) {
                            break;
                        }
                        i2 = i3;
                    }
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        return pair;
    }

    public static final Pair<Integer, Integer> a(String weexShopTab, String weexSubShopTab, com.alibaba.triver.triver_shop.newShop.data.d shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("f1fdd8ce", new Object[]{weexShopTab, weexSubShopTab, shopDataParser});
        }
        q.d(weexShopTab, "weexShopTab");
        q.d(weexSubShopTab, "weexSubShopTab");
        q.d(shopDataParser, "shopDataParser");
        JSONArray I = shopDataParser.I();
        int intValue = new ShopExtKt$parseBarIndexFromWeexTab$fountMainIndexBlock$1(shopDataParser.bl(), weexShopTab).mo2427invoke().intValue();
        return new Pair<>(Integer.valueOf(intValue), Integer.valueOf(new ShopExtKt$parseBarIndexFromWeexTab$foundSubIndexBlock$1(intValue, I, weexSubShopTab).mo2427invoke().intValue()));
    }

    public static final void a(Context context, String shopUrl, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51105da", new Object[]{context, shopUrl, new Long(j)});
            return;
        }
        q.d(context, "context");
        q.d(shopUrl, "shopUrl");
        Uri parse = Uri.parse(shopUrl);
        String queryParameter = parse.getQueryParameter("subBizInfo");
        String queryParameter2 = parse.getQueryParameter("sellerId");
        if (queryParameter2 == null) {
            queryParameter2 = parse.getQueryParameter("seller_id");
        }
        String queryParameter3 = parse.getQueryParameter("storeId");
        if (queryParameter2 == null || queryParameter3 == null) {
            com.alibaba.triver.triver_shop.newShop.ext.b.b(new ShopExtKt$sendXSDCategoryRequest$1(j));
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.a.a(context, "mtop.taobao.minishop.xsd.store.category", "1.0", ai.b(kotlin.j.a("inShopUrl", shopUrl), kotlin.j.a("sellerId", queryParameter2), kotlin.j.a("storeId", queryParameter3)), new ShopExtKt$sendXSDCategoryRequest$2(j), new ShopExtKt$sendXSDCategoryRequest$3(j), false, false, false, "POST", true, ai.a(kotlin.j.a(MtopModule.KEY_MTOP_HEADER_XBIZTYPE, "shop"), kotlin.j.a(MtopModule.KEY_MTOP_HEADER_XBIZINFO, q.a("subBizInfo=", (Object) queryParameter))), 448, null);
        }
    }

    public static final void a(Context context, String shopUrl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51141ea", new Object[]{context, shopUrl, new Boolean(z)});
            return;
        }
        q.d(context, "context");
        q.d(shopUrl, "shopUrl");
        long currentTimeMillis = System.currentTimeMillis();
        Uri uri = Uri.parse(shopUrl);
        boolean a2 = q.a((Object) "store", (Object) uri.getQueryParameter("shopBizType"));
        String queryParameter = uri.getQueryParameter(ShopRenderActivity.SHOP_NAVI);
        boolean a3 = q.a((Object) queryParameter, (Object) "allitems");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        long currentTimeMillis2 = System.currentTimeMillis();
        com.alibaba.triver.triver_shop.preload.f.INSTANCE.a(context, currentTimeMillis, shopUrl);
        String queryParameter2 = uri.getQueryParameter("subBizInfo");
        Map b2 = ai.b(kotlin.j.a("shopURL", shopUrl), kotlin.j.a("extParams", com.alibaba.triver.triver_shop.newShop.ext.d.a(kotlin.j.a("deviceLevel", Integer.valueOf(e())), kotlin.j.a("bxContext", d()), kotlin.j.a("newRoute", true)).toJSONString()), kotlin.j.a("matchedRuleSetName", ShopConstants.V_SHOP_RULESET_SHOP));
        com.alibaba.triver.triver_shop.newShop.ext.a.a(context, "mtop.taobao.wireless.shop.route.process", "1.0", b2, new ShopExtKt$sendShopRouteRequest$1(shopUrl, objectRef, z, a2, context, currentTimeMillis, currentTimeMillis2), new ShopExtKt$sendShopRouteRequest$2(a2, context, shopUrl, currentTimeMillis), true, false, false, "POST", true, ai.a(kotlin.j.a(MtopModule.KEY_MTOP_HEADER_XBIZTYPE, "shop"), kotlin.j.a(MtopModule.KEY_MTOP_HEADER_XBIZINFO, q.a("subBizInfo=", (Object) queryParameter2))), 256, null);
        if (!a2) {
            if ((a3 || queryParameter == null) && cen.Companion.aB()) {
                boolean isSwitchOpened = EVO.isSwitchOpened(context, "enableShopAllItemsPrefetch");
                if (isSwitchOpened) {
                    q.b(uri, "uri");
                    a(b2, uri);
                }
                ceg.Companion.b(q.a("enableShopAllItemsPrefetchAB : ", (Object) Boolean.valueOf(isSwitchOpened)));
            }
            if (cen.Companion.aq() && !a3) {
                cei ceiVar = new cei();
                com.alibaba.triver.triver_shop.preload.b.INSTANCE.a(context);
                ceg.Companion.b(q.a("route preload webview cost : ", (Object) Long.valueOf(ceiVar.a())));
            }
        }
        if (!a2) {
            return;
        }
        a(context, shopUrl, currentTimeMillis);
    }

    private static final void a(Map<String, String> map, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35060ca", new Object[]{map, uri});
            return;
        }
        String b2 = b(uri);
        if (b2 == null) {
            return;
        }
        HashMap f2 = com.alibaba.triver.triver_shop.newShop.ext.b.f(map);
        HashMap hashMap = f2;
        hashMap.put("preFetch", "true");
        hashMap.put("sellerId", b2);
        hashMap.put("shopURL", Uri.encode((String) f2.get("shopURL")));
        hashMap.put("nativeAllItemContainer", "true");
        hashMap.put(noa.KEY_IS_WEEX_SHOP, "true");
        hashMap.put("bxConfigInvokeId", "shop.request.allitem");
        hashMap.put("bxConfigBizId", "PageShop");
        hashMap.put("bxConfigCurScene", ShopConstants.PAGE_SHOP);
        hashMap.put("isNewStyle", "true");
        hashMap.put("tb2021", "true");
        com.alibaba.triver.triver_shop.preload.h.INSTANCE.a(nwr.Companion.a(hashMap));
        ceg.Companion.b("allItems prefetch");
    }

    private static final void b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15320a6", new Object[]{intent});
        } else if (cen.Companion.ar()) {
            com.alibaba.triver.triver_shop.newShop.ext.b.e(new ShopExtKt$notifyPrePushManagerRouteResult$1(intent));
        } else {
            com.alibaba.triver.triver_shop.preload.f.a(com.alibaba.triver.triver_shop.preload.f.INSTANCE, intent, false, 2, null);
        }
    }

    public static final boolean a(Context context, Intent sourceIntent) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c9cc21", new Object[]{context, sourceIntent})).booleanValue();
        }
        q.d(context, "context");
        q.d(sourceIntent, "sourceIntent");
        if (!cen.Companion.av() || !sourceIntent.getBooleanExtra("needDowngradeTo21", false)) {
            return false;
        }
        Intent intent = new Intent();
        intent.setData(sourceIntent.getData());
        Uri data = intent.getData();
        if (data != null) {
            i = data.hashCode();
        }
        long currentTimeMillis = i + System.currentTimeMillis();
        intent.putExtra("shopBundleId", currentTimeMillis);
        Bundle extras = sourceIntent.getExtras();
        if (extras != null) {
            com.alibaba.triver.triver_shop.newShop.data.e.INSTANCE.a(currentTimeMillis, extras);
        }
        intent.putExtra(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_ENABLE_NEW_START_AC_LOGIC, true);
        intent.setClass(context, NativeShopActivity.class);
        intent.addFlags(65536);
        context.startActivity(intent);
        return true;
    }

    public static final boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        if (str != null) {
            return q.a((Object) "store", (Object) Uri.parse(str).getQueryParameter("shopBizType"));
        }
        return false;
    }

    private static final void e(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48e0bda6", new Object[]{context, str});
            return;
        }
        String uri = Uri.parse(str).buildUpon().appendQueryParameter("shopNavIgnore", "true").build().toString();
        q.b(uri, "parse(shopUrl)\n        .buildUpon()\n        .appendQueryParameter(ShopConstants.SHOP_NAV_IGNORE, \"true\")\n        .build().toString()");
        Nav.from(context).toUri(uri);
    }

    public static final void a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dbad4d8", new Object[]{str, str2, new Boolean(z)});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            try {
                q.a((Object) str2);
                long parseLong = Long.parseLong(str2);
                String globalProperty = UTAnalytics.getInstance().getDefaultTracker().getGlobalProperty("_afc_id");
                HashMap hashMap = new HashMap();
                hashMap.put(com.taobao.flowcustoms.afc.utils.b.AFC_ID, globalProperty);
                if (com.taobao.tao.shop.fetcher.adapter.b.a().q()) {
                    AlimamaAdvertising.instance().commitTaokeInfo(str, parseLong, 0L, z, hashMap);
                } else {
                    AlimamaAdvertising.instance().commitTaokeInfo(str, parseLong, 0L, z);
                }
            } catch (Exception unused) {
            }
        }
    }

    private static final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[0]);
        }
        try {
            return BUFS.getFeature(new BUFS.QueryArgs(), "shop.request.fetch", "PageShop", ShopConstants.PAGE_SHOP);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static final int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[0])).intValue();
        }
        try {
            int a2 = com.taobao.application.common.c.a().a("deviceLevel", -1);
            if (a2 == 0) {
                return 3;
            }
            if (a2 == 1) {
                return 2;
            }
            return a2 != 2 ? 0 : 1;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public static final com.alibaba.triver.triver_shop.newShop.data.d a(Context context, Intent intent, ruw<? super String, ? super Integer, t> ruwVar) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.triver.triver_shop.newShop.data.d) ipChange.ipc$dispatch("1e17a0ca", new Object[]{context, intent, ruwVar});
        }
        q.d(context, "context");
        if (intent == null || intent.getExtras() == null) {
            if (ruwVar != null) {
                ruwVar.mo2423invoke("intent or extra is null", 0);
            }
            return null;
        }
        Uri data = intent.getData();
        boolean a2 = q.a((Object) (data == null ? null : data.getQueryParameter("industryShop")), (Object) com.alibaba.triver.triver_shop.newShop.manager.e.XSD_SHOP);
        boolean booleanExtra = intent.getBooleanExtra(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_ENABLE_NEW_START_AC_LOGIC, true);
        boolean booleanExtra2 = intent.getBooleanExtra(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_ENABLE_DIRECTLY_PUSH_AC, false);
        if (booleanExtra2 || booleanExtra2) {
            z = true;
        }
        Bundle extras = intent.getExtras();
        if (booleanExtra && !z) {
            extras = com.alibaba.triver.triver_shop.newShop.data.e.INSTANCE.a(intent.getLongExtra("shopBundleId", 0L));
        }
        if (extras == null) {
            return null;
        }
        Serializable serializable = extras.getSerializable(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_TEMPLATE_LIST);
        if (serializable instanceof ArrayList) {
            jSONArray = new JSONArray((List) serializable);
        } else if (serializable instanceof JSONArray) {
            jSONArray = (JSONArray) serializable;
        } else {
            jSONArray = null;
        }
        Serializable serializable2 = extras.getSerializable(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SHOP_FETCH);
        if (z) {
            if (serializable2 instanceof JSONObject) {
                jSONObject = (JSONObject) serializable2;
            } else {
                jSONObject = null;
            }
        } else if (!x.h(serializable2)) {
            jSONObject = null;
        } else if (serializable2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any>");
        } else {
            jSONObject = new JSONObject(x.i(serializable2));
        }
        if ((jSONObject == null || jSONArray == null) && !a2) {
            if (ruwVar != null) {
                ruwVar.mo2423invoke("shopFetch is null or template list is null", 1);
            }
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        com.alibaba.triver.triver_shop.newShop.data.d dVar = new com.alibaba.triver.triver_shop.newShop.data.d(jSONObject, intent.getData());
        dVar.a(booleanExtra);
        if (booleanExtra || z) {
            dVar.a(extras);
        }
        dVar.a(extras.getLong(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_APP_START, 0L));
        dVar.a(jSONArray);
        dVar.a(context);
        if (dVar.Z()) {
            return dVar;
        }
        if (ruwVar != null) {
            ruwVar.mo2423invoke("shopDataParse is valid", 2);
        }
        ceg.Companion.b("shopDataParse is valid");
        return null;
    }

    public static final void a(com.alibaba.triver.triver_shop.newShop.data.d dVar) {
        Uri Y;
        Object m2371constructorimpl;
        JSONObject l;
        String T;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d8442f9", new Object[]{dVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (dVar != null && (T = dVar.T()) != null) {
            jSONObject.put((JSONObject) "appId", q.a("N_", (Object) T));
        }
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "templateId", com.alibaba.triver.triver_shop.newShop.ext.g.TB_NATIVE_SHOP_COMMON_TEMPLATE_ID);
        String str = null;
        jSONObject2.put((JSONObject) "url", (dVar == null || (Y = dVar.Y()) == null) ? null : Y.toString());
        jSONObject2.put((JSONObject) "industryShop", dVar == null ? null : dVar.as());
        jSONObject2.put((JSONObject) "is2022Style", (String) Boolean.valueOf(dVar == null ? false : dVar.s()));
        if (dVar != null) {
            z = dVar.t();
        }
        jSONObject2.put((JSONObject) "is2023Style", (String) Boolean.valueOf(z));
        JSONObject jSONObject3 = new JSONObject();
        jSONObject2.put((JSONObject) "newStage", (String) (dVar == null ? null : dVar.l()));
        jSONObject2.put((JSONObject) "errorTemplate", (String) (dVar == null ? null : dVar.k()));
        ceh.a("Triver", "Launch", jSONObject, jSONObject3, dVar);
        try {
            Result.a aVar = Result.Companion;
            if (dVar != null && (l = dVar.l()) != null) {
                str = l.toJSONString();
            }
            ceg.Companion.b(str);
            if (str == null) {
                str = "";
            }
            Log.e(ShopView.SP_NAMESPACE, str);
            m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
        }
        Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
        if (m2374exceptionOrNullimpl == null) {
            return;
        }
        ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
    }

    private static final void b(String str, String str2, boolean z, boolean z2, String str3, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c4abf6d", new Object[]{str, str2, new Boolean(z), new Boolean(z2), str3, new Boolean(z3)});
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.b.a("monitorRouteData", new ShopExtKt$monitorRouteData$1(z3, z, str, str2, z2, str3));
        }
    }

    public static final void a(JSONObject performanceData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{performanceData});
            return;
        }
        q.d(performanceData, "performanceData");
        ceh.a("ShopLoft", "renderPerformance", performanceData, new JSONObject(), null);
        com.alibaba.triver.triver_shop.newShop.ext.b.a("shopLoftMonitor", new ShopExtKt$updateShopLoftMonitorData$1(performanceData));
    }

    public static final JSONObject b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7b75e747", new Object[]{jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = jSONObject2;
        String str = null;
        jSONObject3.put((JSONObject) "name", jSONObject == null ? null : jSONObject.getString("templateName"));
        jSONObject3.put((JSONObject) "version", jSONObject == null ? null : jSONObject.getString("templateVersion"));
        if (jSONObject != null) {
            str = jSONObject.getString("sourceUrl");
        }
        jSONObject3.put((JSONObject) "url", str);
        return jSONObject2;
    }

    public static final void a(com.alibaba.triver.triver_shop.newShop.data.d shopDataParser, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4304cefb", new Object[]{shopDataParser, new Boolean(z)});
            return;
        }
        q.d(shopDataParser, "shopDataParser");
        String str = shopDataParser.aB() ? nmf.TEXT_UNFOLLOW_DEFAULT : "订阅";
        if (z) {
            if (!shopDataParser.ah()) {
                return;
            }
            Uri.Builder buildUpon = Uri.parse(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SUBSCRIBE_SUCCESS_URL).buildUpon();
            buildUpon.appendQueryParameter("followedId", shopDataParser.U());
            buildUpon.appendQueryParameter("sourcePage", "0.0");
            if (shopDataParser.aB()) {
                buildUpon.appendQueryParameter("changeToFollow", "1");
            }
            Nav.from(shopDataParser.am()).toUri(buildUpon.build());
            return;
        }
        Context am = shopDataParser.am();
        Toast.makeText(am, ILocalizationService.CANCEL + str + ResultCode.MSG_SUCCESS, 0).show();
    }

    public static /* synthetic */ Uri a(com.alibaba.triver.triver_shop.newShop.data.d dVar, String str, JSONObject jSONObject, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("41ff4169", new Object[]{dVar, str, jSONObject, new Integer(i), obj});
        }
        if ((i & 4) != 0) {
            jSONObject = null;
        }
        return a(dVar, str, jSONObject);
    }

    public static final Uri a(com.alibaba.triver.triver_shop.newShop.data.d shopData, String str, JSONObject jSONObject) {
        JSONObject ax;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("a9d62604", new Object[]{shopData, str, jSONObject});
        }
        q.d(shopData, "shopData");
        if (shopData.t()) {
            ax = shopData.bc().n();
        } else {
            ax = shopData.ax();
        }
        Uri.Builder buildUpon = Uri.parse(ShopLoftActivity.KEY_SHARE_URL_BASE).buildUpon();
        buildUpon.appendQueryParameter("seller_id", shopData.U());
        buildUpon.appendQueryParameter("shop_id", shopData.T());
        String str2 = null;
        buildUpon.appendQueryParameter("first_media_scene", ax == null ? null : ax.getString("sceneId"));
        if (ax != null) {
            str2 = ax.getString("id");
        }
        buildUpon.appendQueryParameter("first_media_id", str2);
        buildUpon.appendQueryParameter("title", shopData.aj());
        buildUpon.appendQueryParameter("source", "shop");
        buildUpon.appendQueryParameter("spm", "a2141.b36769811.0.0");
        if (ax != null) {
            ax.put("playerViewToken", (Object) str);
        }
        if (ax != null) {
            ax.put("liveTransParams", (Object) jSONObject);
        }
        if (ax != null) {
            ax.put("livesource", "shop2F_bigcard_open");
        }
        if (!shopData.bw() && ax != null) {
            buildUpon.appendQueryParameter("loftData", ax.toJSONString());
        }
        Uri build = buildUpon.build();
        q.b(build, "builder.build()");
        return build;
    }

    public static final App a(Fragment fragment) {
        cel fragmentViewProvider;
        com.alibaba.triver.triver_shop.newShop.view.h g2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (App) ipChange.ipc$dispatch("ebe3a2a0", new Object[]{fragment});
        }
        ShopStandardFragment a2 = a(fragment, 0);
        if (a2 != null && (fragmentViewProvider = a2.getFragmentViewProvider()) != null && (fragmentViewProvider instanceof com.alibaba.triver.triver_shop.newShop.view.provider.a) && (g2 = ((com.alibaba.triver.triver_shop.newShop.view.provider.a) fragmentViewProvider).g()) != null && (g2 instanceof MiniAppShopContentRender)) {
            return ((MiniAppShopContentRender) g2).a();
        }
        return null;
    }

    public static final ShopStandardFragment a(Fragment fragment, int i) {
        cel fragmentViewProvider;
        Fragment b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopStandardFragment) ipChange.ipc$dispatch("b17e8e20", new Object[]{fragment, new Integer(i)});
        }
        if (!(fragment instanceof ShopStandardFragment) || (fragmentViewProvider = ((ShopStandardFragment) fragment).getFragmentViewProvider()) == null || !(fragmentViewProvider instanceof com.alibaba.triver.triver_shop.newShop.view.provider.b) || (b2 = ((com.alibaba.triver.triver_shop.newShop.view.provider.b) fragmentViewProvider).b(i)) == null || !(b2 instanceof ShopStandardFragment)) {
            return null;
        }
        return (ShopStandardFragment) b2;
    }

    public static final boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (context == null || !(context instanceof NativeShopActivity)) {
            return false;
        }
        return ((NativeShopActivity) context).b();
    }

    public static final void a(DinamicXEngine dinamicXEngine, View dxView, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95427d3f", new Object[]{dinamicXEngine, dxView, str, obj});
            return;
        }
        q.d(dinamicXEngine, "<this>");
        q.d(dxView, "dxView");
        if (!(dxView instanceof DXRootView)) {
            return;
        }
        DXRootView dXRootView = (DXRootView) dxView;
        if (!a(dXRootView, str, obj)) {
            return;
        }
        JSONObject a2 = a(dxView);
        a2.put((JSONObject) str, (String) obj);
        dinamicXEngine.a(dXRootView, a2);
    }

    public static final void a(DinamicXEngine dinamicXEngine, View dxView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ffd9777", new Object[]{dinamicXEngine, dxView, jSONObject});
            return;
        }
        q.d(dinamicXEngine, "<this>");
        q.d(dxView, "dxView");
        if (!(dxView instanceof DXRootView) || jSONObject == null) {
            return;
        }
        JSONObject a2 = a(dxView);
        a2.putAll(jSONObject);
        dinamicXEngine.a((DXRootView) dxView, a2);
    }

    private static final boolean a(DXRootView dXRootView, String str, Object obj) {
        JSONObject data;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8c0f1493", new Object[]{dXRootView, str, obj})).booleanValue() : (obj instanceof JSONObject) || (data = dXRootView.getData()) == null || !q.a(data.get(str), obj);
    }

    public static final JSONObject a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b048668a", new Object[]{view});
        }
        if (view instanceof DXRootView) {
            DXRootView dXRootView = (DXRootView) view;
            if (dXRootView.getData() == null) {
                return new JSONObject();
            }
            return (JSONObject) dXRootView.getData().clone();
        }
        return new JSONObject();
    }

    public static final void a(com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a... templateList) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7d1631a", new Object[]{templateList});
            return;
        }
        q.d(templateList, "templateList");
        int length = templateList.length;
        while (i < length) {
            com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a aVar = templateList[i];
            i++;
            if (aVar != null) {
                aVar.q();
            }
        }
    }

    public static final Uri a(JSONObject it, com.alibaba.triver.triver_shop.newShop.data.d shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("254b0710", new Object[]{it, shopDataParser});
        }
        q.d(it, "it");
        q.d(shopDataParser, "shopDataParser");
        Uri build = Uri.parse("poplayer://ShopIndexToFeedToast").buildUpon().appendQueryParameter("text", it.getString("text")).appendQueryParameter(com.etao.feimagesearch.model.d.KEY_PIC_URL, it.getString("leftIcon")).appendQueryParameter(WXConstantsOut.SHOPID, shopDataParser.T()).appendQueryParameter("sellerid", shopDataParser.U()).build();
        q.b(build, "parse(\"poplayer://ShopIndexToFeedToast\").buildUpon()\n        .appendQueryParameter(\"text\", text)\n        .appendQueryParameter(\"picurl\", leftIcon)\n        .appendQueryParameter(\"shopid\", shopDataParser.getShopId())\n        .appendQueryParameter(\"sellerid\", shopDataParser.getSellerId())\n        .build()");
        return build;
    }

    public static final void a(Context context, String str, com.alibaba.triver.triver_shop.newShop.data.d shopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ec204f7", new Object[]{context, str, shopData});
            return;
        }
        q.d(context, "context");
        q.d(shopData, "shopData");
        if (shopData.bv() || com.alibaba.triver.triver_shop.newShop.ext.b.c(context) || str == null) {
            return;
        }
        shopData.g(true);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) com.alibaba.triver.triver_shop.newShop.ext.g.KEY_APM_SHOP_URL, Uri.parse(str).buildUpon().appendQueryParameter("identityCode", shopData.ba()).toString());
        jSONObject2.put((JSONObject) "isFollowed", String.valueOf(shopData.ak()));
        jSONObject2.put((JSONObject) "shopName", shopData.aj());
        jSONObject2.put((JSONObject) "shopLogo", shopData.al());
        jSONObject2.put((JSONObject) "shopInfo", (String) shopData.W());
        if (cen.Companion.az()) {
            jSONObject2.put((JSONObject) "headerData", (String) shopData.V());
        }
        a(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_FLOAT_POP_URL, jSONObject, context);
    }

    public static final void a(Context context, boolean z, ruk<t> rukVar, com.alibaba.triver.triver_shop.newShop.data.d shopData, ruk<t> rukVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac1fd6d", new Object[]{context, new Boolean(z), rukVar, shopData, rukVar2});
            return;
        }
        q.d(context, "context");
        q.d(shopData, "shopData");
        View a2 = o.a(context, R.layout.dialog_shop_subscribe_manager);
        if (a2 == null) {
            return;
        }
        f fVar = new f(context);
        fVar.setContentView(a2);
        View findViewById = a2.findViewById(R.id.dialog_shop_subscribe_cancel_button);
        TUrlImageView tUrlImageView = (TUrlImageView) a2.findViewById(R.id.dialog_shop_subscribe_title_close_button);
        View findViewById2 = a2.findViewById(R.id.dialog_shop_subscribe_star);
        View findViewById3 = a2.findViewById(R.id.dialog_shop_subscribe_subscribe);
        ImageView imageView = (ImageView) a2.findViewById(R.id.dialog_shop_subscribe_star_img);
        TextView textView = (TextView) a2.findViewById(R.id.dialog_shop_subscribe_star_title);
        TextView starDetailText = (TextView) a2.findViewById(R.id.dialog_shop_subscribe_star_detail_text);
        TextView textView2 = (TextView) a2.findViewById(R.id.dialog_shop_subscribe_subscribe_title);
        TextView textView3 = (TextView) a2.findViewById(R.id.dialog_shop_subscribe_title_text);
        if (shopData.aB()) {
            textView3.setText("关注管理");
            textView2.setText("取消关注");
            textView.setText("特别关注");
            starDetailText.setText("关注频道优先展示TA的动态");
        }
        if (z) {
            imageView.setImageResource(R.drawable.shop_star_cancel_icon);
            if (shopData.aB()) {
                textView.setText("取消特别关注");
            } else {
                textView.setText("取消星标");
            }
            q.b(starDetailText, "starDetailText");
            o.e(starDetailText);
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.topMargin = 0;
                layoutParams2.k = 0;
                textView.setLayoutParams(layoutParams);
            }
        }
        tUrlImageView.setImageUrl(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_CLOSE_BUTTON_URL);
        findViewById.setOnClickListener(new b(fVar));
        tUrlImageView.setOnClickListener(new c(fVar));
        findViewById2.setOnClickListener(new d(rukVar, fVar));
        findViewById3.setOnClickListener(new e(rukVar2, fVar));
        fVar.show();
    }

    public static final com.alibaba.triver.triver_shop.web.a a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.triver.triver_shop.web.a) ipChange.ipc$dispatch("fdf35d", new Object[]{context, str});
        }
        if (context == null || !(context instanceof NativeShopActivity)) {
            return null;
        }
        return ((NativeShopActivity) context).c(str);
    }

    public static final void b(com.alibaba.triver.triver_shop.newShop.data.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b5cdd58", new Object[]{dVar});
        } else if (dVar == null) {
        } else {
            JSONArray c2 = com.alibaba.triver.triver_shop.newShop.ext.d.c(dVar.I(), 0);
            JSONObject b2 = c2 == null ? null : com.alibaba.triver.triver_shop.newShop.ext.d.b(c2, 0);
            if (b2 == null) {
                return;
            }
            com.alibaba.triver.triver_shop.newShop.data.g gVar = new com.alibaba.triver.triver_shop.newShop.data.g(b2, dVar, 0, 0);
            Uri parse = Uri.parse(gVar.h());
            q.b(parse, "parse(tabBarItemDataModel.getRenderUrl())");
            Map<String, String> a2 = com.alibaba.triver.triver_shop.newShop.ext.b.a(parse);
            Bundle a3 = com.alibaba.triver.triver_shop.newShop.ext.b.a(a2);
            if (a3 == null) {
                a3 = new Bundle();
            }
            Bundle bundle = a3;
            bundle.putString("ori_url", gVar.h());
            com.alibaba.triver.triver_shop.preload.c.a(dVar, dVar.X(), a2, bundle, new com.alibaba.triver.triver_shop.adapter.a(dVar), true);
        }
    }

    public static final void a(final com.alibaba.triver.triver_shop.newShop.data.d shopData, boolean z, final rul<? super Map<String, String>, t> rulVar) {
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79225b42", new Object[]{shopData, new Boolean(z), rulVar});
            return;
        }
        q.d(shopData, "shopData");
        if (!shopData.ai()) {
            return;
        }
        try {
            Result.a aVar = Result.Companion;
            Pair[] pairArr = new Pair[2];
            String U = shopData.U();
            pairArr[0] = kotlin.j.a("sellerId", U == null ? null : kotlin.text.n.e(U));
            pairArr[1] = kotlin.j.a("isSubscribe", Integer.valueOf(z ? 1 : 0));
            DAI.runCompute("inshop_subscribe_guide_cache", ai.c(pairArr), new DAICallback() { // from class: com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt$startShopSubScribeDAITask$1$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.tmall.android.dai.DAICallback
                public void onError(DAIError dAIError) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("326e086b", new Object[]{this, dAIError});
                    } else {
                        ceg.Companion.b(q.a("dai error : ", (Object) (dAIError == null ? null : Integer.valueOf(dAIError.errorCode))));
                    }
                }

                @Override // com.tmall.android.dai.DAICallback
                public void onSuccess(Object... p0) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f85dc9a6", new Object[]{this, p0});
                        return;
                    }
                    q.d(p0, "p0");
                    ceg.Companion.b(q.a("dai success : ", (Object) p0));
                }
            });
            m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
        }
        Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
        if (m2374exceptionOrNullimpl != null) {
            ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
        }
        final Context am = shopData.am();
        if (!(am instanceof FragmentActivity)) {
            return;
        }
        final BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt$startShopSubScribeDAITask$receiver$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                Object m2371constructorimpl2;
                String obj;
                Long e2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                q.d(context, "context");
                q.d(intent, "intent");
                ceg.Companion.b("dai broadcast received");
                intent.getBooleanExtra("com.tmall.android.dai.intent.extra.RESULT", false);
                String stringExtra = intent.getStringExtra("com.tmall.android.dai.intent.extra.MODEL_NAME");
                Serializable serializableExtra = intent.getSerializableExtra("com.tmall.android.dai.intent.extra.OUTPUT_DATA");
                if (!q.a((Object) "inshop_subscribe_guide", (Object) stringExtra)) {
                    ceg.a aVar3 = ceg.Companion;
                    aVar3.b("dai broadcast modelName = " + ((Object) stringExtra) + " , not matched");
                    return;
                }
                com.alibaba.triver.triver_shop.newShop.data.d dVar = com.alibaba.triver.triver_shop.newShop.data.d.this;
                rul<Map<String, String>, t> rulVar2 = rulVar;
                try {
                    Result.a aVar4 = Result.Companion;
                    if (serializableExtra instanceof HashMap) {
                        Object obj2 = ((Map) serializableExtra).get("hasBubble");
                        if (q.a((Object) "true", (Object) (obj2 == null ? null : obj2.toString()))) {
                            Object obj3 = ((Map) serializableExtra).get(HiAnalyticsConstant.HaKey.BI_KEY_WAITTIME);
                            long j = 0;
                            if (obj3 != null && (obj = obj3.toString()) != null && (e2 = kotlin.text.n.e(obj)) != null) {
                                j = e2.longValue();
                            }
                            Map<String, String> g2 = b.g((Map) serializableExtra);
                            g2.put("shopId", dVar.T());
                            b.a(new ShopExtKt$startShopSubScribeDAITask$receiver$1$onReceive$1$1(context, rulVar2, g2), j * 1000);
                        }
                    }
                    m2371constructorimpl2 = Result.m2371constructorimpl(t.INSTANCE);
                } catch (Throwable th2) {
                    Result.a aVar5 = Result.Companion;
                    m2371constructorimpl2 = Result.m2371constructorimpl(kotlin.i.a(th2));
                }
                Throwable m2374exceptionOrNullimpl2 = Result.m2374exceptionOrNullimpl(m2371constructorimpl2);
                if (m2374exceptionOrNullimpl2 == null) {
                    return;
                }
                ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl2);
            }
        };
        IntentFilter intentFilter = new IntentFilter(DAI.ACTION_COMPUTE_COMPLETE);
        intentFilter.addDataScheme("DAI_inshop_subscribe_guide");
        if (Build.VERSION.SDK_INT >= 19) {
            intentFilter.addDataSchemeSpecificPart("com.tmall.android.dai", 0);
        }
        FragmentActivity fragmentActivity = (FragmentActivity) am;
        fragmentActivity.registerReceiver(broadcastReceiver, intentFilter);
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        fragmentActivity.getLifecycle().addObserver(new LifecycleObserver() { // from class: com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt$startShopSubScribeDAITask$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
            public final void onPaused() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c47335f4", new Object[]{this});
                } else {
                    Ref.BooleanRef.this.element = true;
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void onDestroyed() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("bf354a81", new Object[]{this});
                    return;
                }
                ((FragmentActivity) am).getLifecycle().removeObserver(this);
                ((FragmentActivity) am).unregisterReceiver(broadcastReceiver);
            }
        });
        long j = 10000;
        try {
            Result.a aVar3 = Result.Companion;
            j = cen.Companion.N() * 1000;
            Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th2) {
            Result.a aVar4 = Result.Companion;
            Result.m2371constructorimpl(kotlin.i.a(th2));
        }
        com.alibaba.triver.triver_shop.newShop.ext.b.a(new ShopExtKt$startShopSubScribeDAITask$4(booleanRef, am, shopData, z), j);
    }

    public static final void a(Context context, Map<String, String> map, com.alibaba.triver.triver_shop.newShop.data.d shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aefb469c", new Object[]{context, map, shopDataParser});
            return;
        }
        q.d(context, "context");
        q.d(shopDataParser, "shopDataParser");
        Uri.Builder uriBuilder = Uri.parse("poplayer://ShopSubscriptionGuideToast?type=shopSubscriptionGuide").buildUpon();
        q.b(uriBuilder, "uriBuilder");
        com.alibaba.triver.triver_shop.newShop.ext.b.a(uriBuilder, map);
        if (shopDataParser.aB()) {
            uriBuilder.appendQueryParameter("changeToFollow", "1");
        }
        l.a(context, uriBuilder.build().toString());
    }

    public static final void a(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd717ce7", new Object[]{context, uri});
            return;
        }
        q.d(context, "context");
        if (uri == null || !q.a((Object) uri.getQueryParameter("benefitPop"), (Object) "true")) {
            return;
        }
        Uri.Builder buildUpon = Uri.parse("poplayer://shop2Floorcardpopforalimama").buildUpon();
        for (String str : uri.getQueryParameterNames()) {
            buildUpon.appendQueryParameter(str, uri.getQueryParameter(str));
        }
        l.a(context, buildUpon.toString());
    }

    public static final void a(com.alibaba.triver.triver_shop.newShop.data.d shopDataParser, ruk<t> showRedDotCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e647ce1", new Object[]{shopDataParser, showRedDotCallback});
            return;
        }
        q.d(shopDataParser, "shopDataParser");
        q.d(showRedDotCallback, "showRedDotCallback");
        Context am = shopDataParser.am();
        if (am == null || !cen.Companion.K()) {
            return;
        }
        com.alibaba.triver.triver_shop.newShop.ext.b.a("checkNeedShowRedDot", new ShopExtKt$needShowRedDot$1(shopDataParser, am, showRedDotCallback));
    }

    public static final void c(com.alibaba.triver.triver_shop.newShop.data.d shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c93577b7", new Object[]{shopDataParser});
            return;
        }
        q.d(shopDataParser, "shopDataParser");
        Context am = shopDataParser.am();
        if (am == null) {
            return;
        }
        com.alibaba.triver.triver_shop.newShop.ext.b.a("allItemRedDotClickedRefreshSpStatus", new ShopExtKt$allItemRedDotClickedRefreshSpStatus$1(shopDataParser, am));
    }

    public static final void a(Intent intent, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7efd343", new Object[]{intent, context});
            return;
        }
        q.d(intent, "intent");
        q.d(context, "context");
        String stringExtra = intent.getStringExtra("spm");
        if (stringExtra == null) {
            Uri data = intent.getData();
            String str = null;
            boolean z = (data == null ? null : data.getQueryParameter("item_id")) != null;
            Uri data2 = intent.getData();
            if (data2 != null) {
                str = data2.getQueryParameter("from");
            }
            boolean a2 = q.a((Object) str, (Object) "shopsearch");
            if (z) {
                m.a(context, ai.b(kotlin.j.a("spm-url", "a2141.7631564.shop-fix.0")));
                return;
            } else if (!a2) {
                return;
            } else {
                m.a(context, ai.b(kotlin.j.a("spm-url", "a2141.8187980.shop-fix.0")));
                return;
            }
        }
        m.a(context, ai.b(kotlin.j.a("spm-url", stringExtra)));
    }

    public static final View b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c13a4681", new Object[]{context});
        }
        q.d(context, "context");
        TBErrorView tBErrorView = new TBErrorView(context);
        tBErrorView.setTitle(ErrorConstant.MappingMsg.SERVICE_MAPPING_MSG);
        tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 8);
        tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
        return tBErrorView;
    }

    public static final boolean a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1a285e3", new Object[]{uri})).booleanValue();
        }
        q.d(uri, "<this>");
        return q.a((Object) uri.getQueryParameter("isShop"), (Object) "1");
    }

    public static final void f(com.alibaba.triver.triver_shop.newShop.data.d shopData) {
        String T;
        Context am;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52bf46d4", new Object[]{shopData});
            return;
        }
        q.d(shopData, "shopData");
        if (!cen.Companion.l() || (T = shopData.T()) == null) {
            return;
        }
        Context am2 = shopData.am();
        String b2 = am2 == null ? null : l.b(am2);
        if (b2 == null || (am = shopData.am()) == null) {
            return;
        }
        ShopZuoPinTabData b3 = b(am, b2);
        if (b3 == null) {
            b3 = new ShopZuoPinTabData();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - b3.getLastUpdateTime() >= 86400000) {
            b3.setLastUpdateTime(currentTimeMillis);
            b3.setADayCount(0);
            b3.getADayShopListCounts().clear();
        }
        b3.setADayCount(b3.getADayCount() + 1);
        b3.getADayShopListCounts().put(T, 1);
        com.alibaba.triver.triver_shop.newShop.ext.b.a(am, "shop_works_tab_red_dot_info", q.a("worksTabRedDotInfo_", (Object) b2), JSONObject.toJSONString(b3));
    }

    private static final ShopZuoPinTabData b(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShopZuoPinTabData) ipChange.ipc$dispatch("b67750e3", new Object[]{context, str}) : (ShopZuoPinTabData) JSONObject.parseObject(com.alibaba.triver.triver_shop.newShop.ext.b.a(context, "shop_works_tab_red_dot_info", q.a("worksTabRedDotInfo_", (Object) str)), ShopZuoPinTabData.class);
    }

    public static final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (cen.Companion.k()) {
            ShopLoftViewManager.registerShopLoftView(ShopLoftViewManager.TYPE_NEW_VIDEO, ShopLoftNewVideoViewWithDW.class);
        } else {
            ShopLoftViewManager.registerShopLoftView(ShopLoftViewManager.TYPE_NEW_VIDEO, ShopLoftNewVideoView.class);
        }
    }

    public static final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        Object b2 = com.taobao.global.setting.c.a(Globals.getApplication(), "shop").b().b("shop", "mute", true, null);
        q.b(b2, "getInstance(Globals.getApplication(), \"shop\")\n        .appSettingProvider\n        .getLifeCycleSettingCurrentState(\"shop\", \"mute\", true, null)");
        return ((Boolean) b2).booleanValue();
    }

    public static final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            com.taobao.global.setting.c.a(Globals.getApplication(), "shop").c().b("shop", "mute", Boolean.valueOf(z), null);
        }
    }

    public static final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        Object b2 = com.taobao.global.setting.c.a(Globals.getApplication(), "shop").b().b("shop", "liveMute", true, null);
        q.b(b2, "getInstance(Globals.getApplication(), \"shop\")\n        .appSettingProvider\n        .getLifeCycleSettingCurrentState(\"shop\", \"liveMute\", true, null)");
        return ((Boolean) b2).booleanValue();
    }

    public static final void a(Context context, ShopComponentModel shopComponentModel, rul<? super JSONObject, t> rulVar, ruk<t> rukVar) {
        Map<String, String> d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb28b3b", new Object[]{context, shopComponentModel, rulVar, rukVar});
            return;
        }
        q.d(context, "context");
        q.d(shopComponentModel, "shopComponentModel");
        if (!shopComponentModel.getSendMtop() || shopComponentModel.getMtopInfo() == null) {
            return;
        }
        JSONObject mtopInfo = shopComponentModel.getMtopInfo();
        String string = mtopInfo.getString("method");
        String str = (q.a((Object) string, (Object) "GET") || q.a((Object) string, (Object) "POST")) ? string : "GET";
        String string2 = mtopInfo.getString("api");
        String string3 = mtopInfo.getString("version");
        JSONObject jSONObject = mtopInfo.getJSONObject("params");
        Map map = null;
        if (jSONObject != null && (d2 = com.alibaba.triver.triver_shop.newShop.ext.b.d(jSONObject)) != null) {
            map = ai.c(d2);
        }
        com.alibaba.triver.triver_shop.newShop.ext.a.a(context, string2, string3, map, rulVar, new ShopExtKt$sendShop2023ComponentAsyncRequest$1(rukVar), false, false, false, str, false, null, 3520, null);
    }

    public static final void a(com.alibaba.triver.triver_shop.newShop.data.d shopData, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("661ffb17", new Object[]{shopData, jSONObject});
            return;
        }
        q.d(shopData, "shopData");
        JSONObject a2 = com.alibaba.triver.triver_shop.newShop.ext.d.a(kotlin.j.a("_msg_name", com.alibaba.triver.triver_shop.newShop.event.broadcast.c.UCP_TO_SHOP), kotlin.j.a("_msg_type", com.alibaba.triver.triver_shop.newShop.event.broadcast.c.UCP_TO_SHOP), kotlin.j.a("_msg_token", shopData.T()), kotlin.j.a("_msg_source", com.alibaba.triver.triver_shop.newShop.event.broadcast.c.MSG_SOURCE_PARENT), kotlin.j.a("_msg_target", "*"), kotlin.j.a("data", jSONObject));
        com.alibaba.triver.triver_shop.newShop.event.broadcast.d a3 = com.alibaba.triver.triver_shop.newShop.event.broadcast.d.a(shopData.am());
        if (a3 == null) {
            return;
        }
        a3.a(a2);
    }

    public static final JSONObject b(com.alibaba.triver.triver_shop.newShop.data.d shopData, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("defd3b9c", new Object[]{shopData, new Boolean(z)});
        }
        q.d(shopData, "shopData");
        String str = z ? "followed" : "unFollowed";
        Pair[] pairArr = new Pair[5];
        pairArr[0] = kotlin.j.a("_msg_name", com.alibaba.triver.triver_shop.newShop.event.broadcast.c.MSG_SHOP_FOLLOW_SETSTATUS);
        pairArr[1] = kotlin.j.a(com.alibaba.triver.triver_shop.newShop.event.broadcast.c.MSG_FOLLOW_ACTION, com.alibaba.triver.triver_shop.newShop.event.broadcast.c.MSG_FOLLOW_ACTION_REFRESH);
        pairArr[2] = kotlin.j.a("isFollowed", z ? "true" : "false");
        pairArr[3] = kotlin.j.a("status", str);
        pairArr[4] = kotlin.j.a("widgetNodeId", q.a("relationship_widget_root", (Object) shopData.U()));
        return com.alibaba.triver.triver_shop.newShop.ext.d.a(pairArr);
    }

    public static final void a(com.alibaba.triver.triver_shop.newShop.data.g gVar) {
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d85a016", new Object[]{gVar});
            return;
        }
        q.d(gVar, "<this>");
        if (!cen.Companion.d()) {
            return;
        }
        try {
            Result.a aVar = Result.Companion;
            JSONArray c2 = gVar.c();
            if (c2 != null) {
                Iterator<Object> it = c2.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof JSONObject) {
                        JSONObject jSONObject = (JSONObject) next;
                        com.alibaba.triver.triver_shop.newShop.data.d g2 = gVar.g();
                        b(jSONObject, g2 == null ? null : g2.am());
                    }
                }
            }
            gVar.a((JSONArray) null);
            m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
        }
        Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
        if (m2374exceptionOrNullimpl == null) {
            return;
        }
        ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
    }

    private static final void b(JSONObject jSONObject, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e28b9d81", new Object[]{jSONObject, context});
        } else if (context == null || jSONObject == null) {
        } else {
            String string = jSONObject.getString("api");
            String string2 = jSONObject.getString("version");
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            com.alibaba.triver.triver_shop.newShop.ext.a.a(context, string, string2, jSONObject2 == null ? null : com.alibaba.triver.triver_shop.newShop.ext.b.e(jSONObject2), null, null, q.a((Object) jSONObject.getString("needLogin"), (Object) "true"), q.a((Object) jSONObject.getString("needEncode"), (Object) "true"), true, null, false, null, 3584, null);
        }
    }

    public static final void a(ShopComponentModel shopComponentModel, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eed05f44", new Object[]{shopComponentModel, context});
            return;
        }
        q.d(shopComponentModel, "<this>");
        q.d(context, "context");
        if (!shopComponentModel.needPrefetchRequest()) {
            return;
        }
        b(shopComponentModel.getMtopInfo(), context);
    }

    public static /* synthetic */ void a(com.alibaba.triver.triver_shop.newShop.data.d dVar, Boolean bool, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22e553eb", new Object[]{dVar, bool, new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        a(dVar, bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final com.alibaba.triver.triver_shop.newShop.data.d r12, java.lang.Boolean r13) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.triver.triver_shop.newShop.ext.h.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r12
            r1[r4] = r13
            java.lang.String r12 = "10c9cfb4"
            r0.ipc$dispatch(r12, r1)
            return
        L15:
            java.lang.String r0 = "shopData"
            kotlin.jvm.internal.q.d(r12, r0)
            boolean r0 = r12.E()
            if (r0 != 0) goto L22
            return
        L22:
            kotlin.Result$a r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> Ld4
            boolean r0 = r12.bq()     // Catch: java.lang.Throwable -> Ld4
            if (r0 == 0) goto Lcd
            if (r13 != 0) goto L44
            com.alibaba.triver.triver_shop.newShop.data.d$f r13 = r12.bm()     // Catch: java.lang.Throwable -> Ld4
            boolean r13 = r13.d()     // Catch: java.lang.Throwable -> Ld4
            if (r13 == 0) goto L3f
            com.alibaba.triver.triver_shop.newShop.data.d$g r13 = r12.bi()     // Catch: java.lang.Throwable -> Ld4
            boolean r13 = r13.b()     // Catch: java.lang.Throwable -> Ld4
            goto L48
        L3f:
            boolean r13 = b()     // Catch: java.lang.Throwable -> Ld4
            goto L48
        L44:
            boolean r13 = r13.booleanValue()     // Catch: java.lang.Throwable -> Ld4
        L48:
            com.alibaba.triver.triver_shop.newShop.data.d$c r0 = r12.bc()     // Catch: java.lang.Throwable -> Ld4
            com.alibaba.fastjson.JSONObject r0 = r0.n()     // Catch: java.lang.Throwable -> Ld4
            r1 = 0
            java.lang.String r5 = "liveId"
            if (r0 != 0) goto L58
            r0 = r1
            goto L5c
        L58:
            java.lang.String r0 = r0.getString(r5)     // Catch: java.lang.Throwable -> Ld4
        L5c:
            if (r0 != 0) goto L6a
            com.alibaba.fastjson.JSONObject r0 = r12.W()     // Catch: java.lang.Throwable -> Ld4
            if (r0 != 0) goto L66
            r7 = r1
            goto L6b
        L66:
            java.lang.String r0 = r0.getString(r5)     // Catch: java.lang.Throwable -> Ld4
        L6a:
            r7 = r0
        L6b:
            com.taobao.android.miniLive.a r0 = com.taobao.android.miniLive.a.a()     // Catch: java.lang.Throwable -> Ld4
            android.content.Context r6 = r12.am()     // Catch: java.lang.Throwable -> Ld4
            r8 = 3
            kotlin.Pair[] r8 = new kotlin.Pair[r8]     // Catch: java.lang.Throwable -> Ld4
            kotlin.Pair r5 = kotlin.j.a(r5, r7)     // Catch: java.lang.Throwable -> Ld4
            r8[r2] = r5     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r2 = "bizCode"
            java.lang.String r5 = "shop"
            kotlin.Pair r2 = kotlin.j.a(r2, r5)     // Catch: java.lang.Throwable -> Ld4
            r8[r4] = r2     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r2 = "mute"
            if (r13 == 0) goto L8f
            java.lang.String r13 = "MUTE"
            goto L91
        L8f:
            java.lang.String r13 = "NONMUTE"
        L91:
            kotlin.Pair r13 = kotlin.j.a(r2, r13)     // Catch: java.lang.Throwable -> Ld4
            r8[r3] = r13     // Catch: java.lang.Throwable -> Ld4
            java.util.Map r8 = kotlin.collections.ai.b(r8)     // Catch: java.lang.Throwable -> Ld4
            com.alibaba.triver.triver_shop.newShop.data.d$d r13 = r12.G()     // Catch: java.lang.Throwable -> Ld4
            android.view.View$OnClickListener r9 = r13.d()     // Catch: java.lang.Throwable -> Ld4
            com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt$showMiniLiveWindow$1$1 r13 = new com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt$showMiniLiveWindow$1$1     // Catch: java.lang.Throwable -> Ld4
            r13.<init>()     // Catch: java.lang.Throwable -> Ld4
            r10 = r13
            com.taobao.android.miniLive.ui.a r10 = (com.taobao.android.miniLive.ui.a) r10     // Catch: java.lang.Throwable -> Ld4
            com.alibaba.triver.triver_shop.newShop.ext.h$a r13 = new com.alibaba.triver.triver_shop.newShop.ext.h$a     // Catch: java.lang.Throwable -> Ld4
            r13.<init>(r12)     // Catch: java.lang.Throwable -> Ld4
            r11 = r13
            com.taobao.android.miniLive.ui.d r11 = (com.taobao.android.miniLive.ui.d) r11     // Catch: java.lang.Throwable -> Ld4
            r5 = r0
            r5.a(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Ld4
            com.taobao.android.miniLive.a r13 = com.taobao.android.miniLive.a.a()     // Catch: java.lang.Throwable -> Ld4
            com.alibaba.triver.triver_shop.newShop.ext.h$g r0 = new com.alibaba.triver.triver_shop.newShop.ext.h$g     // Catch: java.lang.Throwable -> Ld4
            r0.<init>(r12)     // Catch: java.lang.Throwable -> Ld4
            com.taobao.android.miniLive.ui.d r0 = (com.taobao.android.miniLive.ui.d) r0     // Catch: java.lang.Throwable -> Ld4
            r13.a(r0)     // Catch: java.lang.Throwable -> Ld4
            r12.f(r4)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r13 = "Page_Shop_Live_FloatWindow"
            com.alibaba.triver.triver_shop.newShop.ext.m.a(r12, r13, r1)     // Catch: java.lang.Throwable -> Ld4
        Lcd:
            kotlin.t r12 = kotlin.t.INSTANCE     // Catch: java.lang.Throwable -> Ld4
            java.lang.Object r12 = kotlin.Result.m2371constructorimpl(r12)     // Catch: java.lang.Throwable -> Ld4
            goto Ldf
        Ld4:
            r12 = move-exception
            kotlin.Result$a r13 = kotlin.Result.Companion
            java.lang.Object r12 = kotlin.i.a(r12)
            java.lang.Object r12 = kotlin.Result.m2371constructorimpl(r12)
        Ldf:
            java.lang.Throwable r12 = kotlin.Result.m2374exceptionOrNullimpl(r12)
            if (r12 == 0) goto Lec
            tb.ceg$a r13 = tb.ceg.Companion
            java.lang.String r0 = "catching block has error"
            r13.a(r0, r12)
        Lec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.newShop.ext.h.a(com.alibaba.triver.triver_shop.newShop.data.d, java.lang.Boolean):void");
    }

    public static final void h(com.alibaba.triver.triver_shop.newShop.data.d dVar) {
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae707b92", new Object[]{dVar});
        } else if (dVar == null || !dVar.E()) {
        } else {
            try {
                Result.a aVar = Result.Companion;
                com.taobao.android.miniLive.a.a().i();
                m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
            } catch (Throwable th) {
                Result.a aVar2 = Result.Companion;
                m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
            }
            Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
            if (m2374exceptionOrNullimpl == null) {
                return;
            }
            ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
        }
    }

    public static final String c(com.alibaba.triver.triver_shop.newShop.data.d shopDataParser, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7f745c43", new Object[]{shopDataParser, new Boolean(z)});
        }
        q.d(shopDataParser, "shopDataParser");
        String builder = Uri.parse("https://shop" + ((Object) shopDataParser.T()) + ".m.taobao.com").buildUpon().appendQueryParameter("disableShopOpenAnimation", "true").appendQueryParameter("foldDeviceStyle", z ? "open" : "close").appendQueryParameter(ShopRenderActivity.SHOP_NAVI, shopDataParser.K()).toString();
        q.b(builder, "parse(baseUrl).buildUpon()\n        .appendQueryParameter(ShopConstants.SHOP_DISABLE_ACTIVITY_ANIMATION_URL_KEY, \"true\")\n        .appendQueryParameter(ShopConstants.SHOP_DEVICE_FOLD_STYLE_URL_KEY, if (isFoldDeviceOpen) \"open\" else \"close\")\n        .appendQueryParameter(\"shop_navi\", shopDataParser.getCurrentPageName())\n        .toString()");
        return builder;
    }

    public static final void g(com.alibaba.triver.triver_shop.newShop.data.d shopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8097e133", new Object[]{shopData});
            return;
        }
        q.d(shopData, "shopData");
        m.a(shopData, "Page_Shop_New_livecard", ai.b(kotlin.j.a("feed_id", shopData.bc().c()), kotlin.j.a("identityCode", shopData.ba()), kotlin.j.a("clicktype", "Sliding")), null, 8, null);
    }

    public static final void i(com.alibaba.triver.triver_shop.newShop.data.d shopData) {
        String string;
        Context am;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc4915f1", new Object[]{shopData});
            return;
        }
        q.d(shopData, "shopData");
        JSONObject jSONObject = shopData.X().getJSONObject("shopToastData");
        if (jSONObject == null || (string = jSONObject.getString("text")) == null || (am = shopData.am()) == null) {
            return;
        }
        com.alibaba.triver.triver_shop.newShop.ext.b.c(am, string);
    }

    private static final void a(String str, JSONObject jSONObject, Context context) {
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c4c88a", new Object[]{str, jSONObject, context});
            return;
        }
        try {
            Result.a aVar = Result.Companion;
            Intent intent = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
            intent.putExtra("event", str);
            intent.putExtra("param", jSONObject.toString());
            LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
            m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
        }
        Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
        if (m2374exceptionOrNullimpl == null) {
            return;
        }
        ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
    }

    public static final void d(com.alibaba.triver.triver_shop.newShop.data.d shopData) {
        Object m2371constructorimpl;
        s sVar;
        Context am;
        String obj;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f70e1216", new Object[]{shopData});
            return;
        }
        q.d(shopData, "shopData");
        try {
            Result.a aVar = Result.Companion;
            String[] strArr = {com.alibaba.triver.triver_shop.newShop.ext.g.KEY_ROUTER_START_TIME, com.alibaba.triver.triver_shop.newShop.ext.g.KEY_ROUTER_END_TIME, com.alibaba.triver.triver_shop.newShop.ext.g.KEY_APP_START, "containerStart", com.alibaba.triver.triver_shop.newShop.ext.g.KEY_CONTAINER_FINISH};
            int length = strArr.length;
            while (i < length) {
                String str = strArr[i];
                i++;
                Object obj2 = shopData.l().get(str);
                Long l = null;
                if (obj2 instanceof Long) {
                    l = (Long) obj2;
                } else if (obj2 != null && (obj = obj2.toString()) != null) {
                    l = kotlin.text.n.e(obj);
                }
                if (l != null) {
                    long longValue = l.longValue();
                    s.f18233a.d().a(q.a("shop_", (Object) str), com.alibaba.triver.triver_shop.newShop.ext.b.a(longValue));
                    s sVar2 = s.f18233a;
                    Context am2 = shopData.am();
                    if (am2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
                    }
                    sVar2.b((Activity) am2).a(q.a("shop_", (Object) str), com.alibaba.triver.triver_shop.newShop.ext.b.a(longValue));
                }
            }
            sVar = s.f18233a;
            am = shopData.am();
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
        }
        if (am != null) {
            sVar.b((Activity) am).a(ShopRenderActivity.SHOP_NAVI, shopData.l().get(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_TAB_KEY_NAME));
            s.f18233a.d().a(ShopRenderActivity.SHOP_NAVI, shopData.l().get(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_TAB_KEY_NAME));
            m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
            Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
            if (m2374exceptionOrNullimpl == null) {
                return;
            }
            ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
    }

    public static final void a(DXRootView dXRootView, JSONObject jSONObject) {
        Object m2371constructorimpl;
        DXWidgetNode expandWidgetNode;
        DXWidgetNode queryWidgetNodeByUserId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeb8c227", new Object[]{dXRootView, jSONObject});
            return;
        }
        try {
            Result.a aVar = Result.Companion;
            String string = jSONObject == null ? null : jSONObject.getString("widgetNodeId");
            if (dXRootView != null && (expandWidgetNode = dXRootView.getExpandWidgetNode()) != null && (queryWidgetNodeByUserId = expandWidgetNode.queryWidgetNodeByUserId(string)) != null) {
                DXEvent dXEvent = new DXEvent(18903999933159L);
                HashMap hashMap = new HashMap();
                hashMap.put("data", com.taobao.android.dinamicx.expression.expr_v2.f.a(jSONObject));
                t tVar = t.INSTANCE;
                dXEvent.setArgs(hashMap);
                t tVar2 = t.INSTANCE;
                queryWidgetNodeByUserId.postEvent(dXEvent);
            }
            m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
        }
        Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
        if (m2374exceptionOrNullimpl == null) {
            return;
        }
        ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
    }

    public static final String a(String str, Intent intent) {
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("56b4d291", new Object[]{str, intent});
        }
        if (str == null) {
            return null;
        }
        if (intent == null) {
            return str;
        }
        try {
            Result.a aVar = Result.Companion;
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            Uri data = intent.getData();
            if (data != null) {
                for (String str2 : data.getQueryParameterNames()) {
                    buildUpon.appendQueryParameter(str2, data.getQueryParameter(str2));
                }
                str = buildUpon.toString();
            }
            m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
        }
        Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
        if (m2374exceptionOrNullimpl != null) {
            ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
        }
        return str;
    }
}
