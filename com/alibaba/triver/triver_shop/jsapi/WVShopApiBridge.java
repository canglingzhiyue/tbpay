package com.alibaba.triver.triver_shop.jsapi;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.webview.IWVWebView;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.d;
import com.alibaba.triver.triver_shop.newShop.data.h;
import com.alibaba.triver.triver_shop.newShop.ext.b;
import com.alibaba.triver.triver_shop.newShop.ext.m;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.alibaba.triver.triver_shop.newShop.view.extend.c;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.RateNode;
import com.taobao.monitor.procedure.s;
import com.ut.mini.UTAnalytics;
import kotlin.Pair;
import kotlin.j;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.n;
import tb.ceg;
import tb.kge;
import tb.ruk;
import tb.rul;

/* loaded from: classes3.dex */
public final class WVShopApiBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f3782a;

        public a(View view) {
            this.f3782a = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                o.j(this.f3782a);
            }
        }
    }

    static {
        kge.a(903447432);
    }

    public static /* synthetic */ Object ipc$super(WVShopApiBridge wVShopApiBridge, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -2144925060:
                    if (str.equals("shopLoftMarkPerformance")) {
                        shopLoftMarkPerformance(str2, wVCallBackContext);
                        break;
                    }
                    break;
                case -1931746041:
                    if (str.equals("currentPageStartScroll")) {
                        currentPageStartScroll(wVCallBackContext);
                        break;
                    }
                    break;
                case -1851982861:
                    if (str.equals("getHeadCollapsedStatus")) {
                        getHeadCollapsedStatus(wVCallBackContext, str2);
                        break;
                    }
                    break;
                case -1762387277:
                    if (str.equals("shopLoftVideoSkip")) {
                        shopLoftVideoSkip(wVCallBackContext);
                        break;
                    }
                    break;
                case -1489259446:
                    if (str.equals("shopLoftVideoAutoPlayNext")) {
                        shopLoftVideoAutoPlayNext(wVCallBackContext, str2);
                        break;
                    }
                    break;
                case -1442720953:
                    if (str.equals("shopLoftVideoSeekTo")) {
                        shopLoftVideoSeekTo(wVCallBackContext, str2);
                        break;
                    }
                    break;
                case -1293849918:
                    if (str.equals("notifyCurrentPageLoadFailed")) {
                        currentPageLoadFailed(wVCallBackContext, str2);
                        break;
                    }
                    break;
                case -1169818678:
                    if (str.equals("allItemCategoryTips")) {
                        allItemCategoryTips(wVCallBackContext, str2);
                        break;
                    }
                    break;
                case -1097746105:
                    if (str.equals("getShopCurrentPageName")) {
                        getShopCurrentPageName(wVCallBackContext, str2);
                        break;
                    }
                    break;
                case -908605110:
                    if (str.equals("checkBigCardVisible")) {
                        checkBigCardVisible(wVCallBackContext);
                        break;
                    }
                    break;
                case -851576320:
                    if (str.equals("contentContainerBrowser")) {
                        contentContainerBrowser(wVCallBackContext, str2);
                        break;
                    }
                    break;
                case -693635759:
                    if (str.equals("showAllItemCountIcon")) {
                        showAllItemCountIcon(wVCallBackContext, str2);
                        break;
                    }
                    break;
                case -520037090:
                    if (str.equals("updateShopLoftWebDialogStatus")) {
                        updateShopLoftWebDialogStatus(wVCallBackContext, str2);
                        break;
                    }
                    break;
                case -516356350:
                    if (str.equals("setCrossStoreHeaderStatus")) {
                        setCrossStoreHeaderStatus(wVCallBackContext, str2);
                        break;
                    }
                    break;
                case -11622369:
                    if (str.equals("updateBigCardModuleIndex")) {
                        updateBigCardModuleIndex(str2, wVCallBackContext);
                        break;
                    }
                    break;
                case 238207214:
                    if (str.equals("updateShopLoftWebLayerSafeAreaHeight")) {
                        updateShopLoftWebLayerSafeAreaHeight(wVCallBackContext, str2);
                        break;
                    }
                    break;
                case 835233028:
                    if (str.equals("getCurrentShopLoftCardData")) {
                        getCurrentShopLoftCardData(wVCallBackContext);
                        break;
                    }
                    break;
                case 912705488:
                    if (str.equals("getBigCardModuleData")) {
                        getBigCardModuleData(wVCallBackContext);
                        break;
                    }
                    break;
                case 914745419:
                    if (str.equals("getShopPIParams")) {
                        getShopPIParams(str2, wVCallBackContext);
                        break;
                    }
                    break;
                case 1127476023:
                    if (str.equals("currentPageStopScroll")) {
                        currentPageStopScroll(wVCallBackContext);
                        break;
                    }
                    break;
                case 1152682910:
                    if (str.equals(m.UPDATE_NEXT_PAGE_PROPERTIES)) {
                        updateNextPageProperties(wVCallBackContext, str2);
                        break;
                    }
                    break;
                case 1280509214:
                    if (str.equals("remoteLog")) {
                        remoteLog(str2, wVCallBackContext);
                        break;
                    }
                    break;
                case 1346068259:
                    if (str.equals("markPerformance")) {
                        markPerformance(str2, wVCallBackContext);
                        break;
                    }
                    break;
                case 1702038888:
                    if (str.equals("shopLoftVideoPlayRate")) {
                        shopLoftVideoPlayRate(wVCallBackContext, str2);
                        break;
                    }
                    break;
                case 1881645212:
                    if (str.equals("getShopLoftVideoCardVideoPlayerInfo")) {
                        getShopLoftVideoCardVideoPlayerInfo(wVCallBackContext);
                        break;
                    }
                    break;
                case 1887343007:
                    if (str.equals("foldIndexBigCard")) {
                        foldBigCard(wVCallBackContext);
                        break;
                    }
                    break;
                case 2051042914:
                    if (str.equals("removeRelationWebLoadingPic")) {
                        removeRelationWebLoadingPic(wVCallBackContext);
                        break;
                    }
                    break;
                case 2118644252:
                    if (str.equals(h.actionSwitchTabTo)) {
                        switchTabTo(wVCallBackContext, str2);
                        break;
                    }
                    break;
            }
        }
        return true;
    }

    private final void getHeadCollapsedStatus(WVCallBackContext wVCallBackContext, String str) {
        d.C0135d G;
        ruk<Boolean> o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d89f741", new Object[]{this, wVCallBackContext, str});
            return;
        }
        d shopData = getShopData(wVCallBackContext);
        Boolean bool = null;
        if (shopData != null && (G = shopData.G()) != null && (o = G.o()) != null) {
            bool = o.mo2427invoke();
        }
        if (wVCallBackContext == null) {
            return;
        }
        wVCallBackContext.success(com.alibaba.triver.triver_shop.newShop.ext.d.a(j.a("isCollapsed", bool)).toJSONString());
    }

    private final void shopLoftVideoSkip(WVCallBackContext wVCallBackContext) {
        ShopWrapWebView shopWrapWebView;
        com.alibaba.triver.triver_shop.newShop.view.extend.a shopLoftWebViewBizAdapter;
        ruk<t> k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75eebf7", new Object[]{this, wVCallBackContext});
            return;
        }
        if (wVCallBackContext != null && (shopWrapWebView = getShopWrapWebView(wVCallBackContext)) != null && (shopLoftWebViewBizAdapter = shopWrapWebView.getShopLoftWebViewBizAdapter()) != null && (k = shopLoftWebViewBizAdapter.k()) != null) {
            k.mo2427invoke();
        }
        if (wVCallBackContext == null) {
            return;
        }
        wVCallBackContext.success();
    }

    private final void shopLoftVideoAutoPlayNext(WVCallBackContext wVCallBackContext, String str) {
        String string;
        ShopWrapWebView shopWrapWebView;
        com.alibaba.triver.triver_shop.newShop.view.extend.a shopLoftWebViewBizAdapter;
        rul<Boolean, t> j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49336d8", new Object[]{this, wVCallBackContext, str});
            return;
        }
        JSONObject a2 = com.alibaba.triver.triver_shop.newShop.ext.d.a(str);
        if (a2 == null || (string = a2.getString("autoPlayNext")) == null) {
            if (wVCallBackContext == null) {
                return;
            }
            wVCallBackContext.error();
            return;
        }
        if (wVCallBackContext != null && (shopWrapWebView = getShopWrapWebView(wVCallBackContext)) != null && (shopLoftWebViewBizAdapter = shopWrapWebView.getShopLoftWebViewBizAdapter()) != null && (j = shopLoftWebViewBizAdapter.j()) != null) {
            j.mo2421invoke(Boolean.valueOf(q.a((Object) string, (Object) "true")));
        }
        if (wVCallBackContext == null) {
            return;
        }
        wVCallBackContext.success();
    }

    private final void shopLoftVideoPlayRate(WVCallBackContext wVCallBackContext, String str) {
        String string;
        Float b;
        ShopWrapWebView shopWrapWebView;
        com.alibaba.triver.triver_shop.newShop.view.extend.a shopLoftWebViewBizAdapter;
        rul<Float, t> i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d505276", new Object[]{this, wVCallBackContext, str});
            return;
        }
        JSONObject a2 = com.alibaba.triver.triver_shop.newShop.ext.d.a(str);
        if (a2 == null || (string = a2.getString(RateNode.TAG)) == null || (b = n.b(string)) == null) {
            if (wVCallBackContext == null) {
                return;
            }
            wVCallBackContext.error();
            return;
        }
        float floatValue = b.floatValue();
        if (wVCallBackContext != null && (shopWrapWebView = getShopWrapWebView(wVCallBackContext)) != null && (shopLoftWebViewBizAdapter = shopWrapWebView.getShopLoftWebViewBizAdapter()) != null && (i = shopLoftWebViewBizAdapter.i()) != null) {
            i.mo2421invoke(Float.valueOf(floatValue));
        }
        if (wVCallBackContext == null) {
            return;
        }
        wVCallBackContext.success();
    }

    private final void switchTabTo(WVCallBackContext wVCallBackContext, String str) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ae462a", new Object[]{this, wVCallBackContext, str});
            return;
        }
        d shopData = getShopData(wVCallBackContext);
        if (shopData == null || (a2 = com.alibaba.triver.triver_shop.newShop.ext.d.a(str)) == null) {
            return;
        }
        b.b(new WVShopApiBridge$switchTabTo$1$1$1(a2.getString("direction"), shopData, a2.getString("tabName")));
    }

    private final void contentContainerBrowser(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af6da10e", new Object[]{this, wVCallBackContext, str});
        } else if (str != null) {
            b.b(new WVShopApiBridge$contentContainerBrowser$1$1(this, wVCallBackContext, str));
        } else if (wVCallBackContext == null) {
        } else {
            wVCallBackContext.error(com.alibaba.triver.triver_shop.newShop.ext.d.a(j.a("success", false)).toString());
        }
    }

    private final void allItemCategoryTips(WVCallBackContext wVCallBackContext, String str) {
        String string;
        d shopData;
        rul<Boolean, Boolean> m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("280e1e58", new Object[]{this, wVCallBackContext, str});
            return;
        }
        JSONObject a2 = com.alibaba.triver.triver_shop.newShop.ext.d.a(str);
        if (a2 != null && (string = a2.getString("visible")) != null && (shopData = getShopData(wVCallBackContext)) != null && (m = shopData.G().m()) != null) {
            b.b(new WVShopApiBridge$allItemCategoryTips$1$1$1$1$1(m, string, wVCallBackContext));
        } else if (wVCallBackContext == null) {
        } else {
            wVCallBackContext.error(com.alibaba.triver.triver_shop.newShop.ext.d.a(j.a("success", false)).toString());
        }
    }

    private final void showAllItemCountIcon(WVCallBackContext wVCallBackContext, String str) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f9d631f", new Object[]{this, wVCallBackContext, str});
        } else if (wVCallBackContext == null || str == null || (a2 = com.alibaba.triver.triver_shop.newShop.ext.d.a(str)) == null) {
        } else {
            String string = a2.getString("iconBottomPadding");
            Float f = null;
            Float b = string == null ? null : n.b(string);
            if (b == null) {
                return;
            }
            float floatValue = b.floatValue();
            String string2 = a2.getString("iconRightPadding");
            if (string2 != null) {
                f = n.b(string2);
            }
            if (f == null) {
                return;
            }
            float floatValue2 = f.floatValue();
            String string3 = a2.getString("visible");
            if (string3 == null) {
                return;
            }
            b.b(new WVShopApiBridge$showAllItemCountIcon$1$1$1(this, wVCallBackContext, string3, floatValue, floatValue2));
        }
    }

    private final void currentPageStartScroll(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ff3aa4b", new Object[]{this, wVCallBackContext});
        } else {
            b.b(new WVShopApiBridge$currentPageStartScroll$1(wVCallBackContext, this));
        }
    }

    private final void currentPageStopScroll(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9243607b", new Object[]{this, wVCallBackContext});
        } else {
            b.b(new WVShopApiBridge$currentPageStopScroll$1(wVCallBackContext, this));
        }
    }

    private final void setCrossStoreHeaderStatus(WVCallBackContext wVCallBackContext, String str) {
        JSONObject a2;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d30c390", new Object[]{this, wVCallBackContext, str});
            return;
        }
        ceg.Companion.a(q.a("ggg WVShopApiBridge setCrossStoreHeaderStatus ", (Object) str));
        d shopData = getShopData(wVCallBackContext);
        if (shopData == null || (a2 = com.alibaba.triver.triver_shop.newShop.ext.d.a(str)) == null || (string = a2.getString("showCrossStoreHeader")) == null) {
            return;
        }
        b.b(new WVShopApiBridge$setCrossStoreHeaderStatus$1(shopData, q.a((Object) string, (Object) "true"), wVCallBackContext));
    }

    private final void removeRelationWebLoadingPic(WVCallBackContext wVCallBackContext) {
        ShopWrapWebView shopWrapWebView;
        c shopFrameworkBizAdapter;
        View a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45c866a6", new Object[]{this, wVCallBackContext});
        } else if (wVCallBackContext == null || (shopWrapWebView = getShopWrapWebView(wVCallBackContext)) == null || (shopFrameworkBizAdapter = shopWrapWebView.getShopFrameworkBizAdapter()) == null || (a2 = shopFrameworkBizAdapter.a()) == null) {
        } else {
            a2.post(new a(a2));
        }
    }

    private final void getShopCurrentPageName(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84347b95", new Object[]{this, wVCallBackContext, str});
        } else if (wVCallBackContext == null) {
        } else {
            d shopData = getShopData(wVCallBackContext);
            if (shopData != null) {
                wVCallBackContext.success(com.alibaba.triver.triver_shop.newShop.ext.d.a(j.a("name", shopData.K())).toJSONString());
            } else {
                wVCallBackContext.error();
            }
        }
    }

    private final void currentPageLoadFailed(WVCallBackContext wVCallBackContext, String str) {
        ShopWrapWebView shopWrapWebView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebc9f7d9", new Object[]{this, wVCallBackContext, str});
            return;
        }
        JSONObject a2 = com.alibaba.triver.triver_shop.newShop.ext.d.a(str);
        if (a2 != null) {
            String string = a2.getString("errorMsg");
            String string2 = a2.getString("area");
            ceg.a aVar = ceg.Companion;
            aVar.b("currentPageLoadFailed " + ((Object) string2) + " , " + ((Object) string));
        }
        if (wVCallBackContext != null) {
            wVCallBackContext.success();
        }
        Runnable runnable = null;
        if (wVCallBackContext != null && (shopWrapWebView = getShopWrapWebView(wVCallBackContext)) != null) {
            runnable = shopWrapWebView.getLoadFailedProcessor();
        }
        b.a(runnable);
    }

    private final void updateNextPageProperties(WVCallBackContext wVCallBackContext, String str) {
        JSONObject a2;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a719552c", new Object[]{this, wVCallBackContext, str});
        } else if (str == null || (a2 = com.alibaba.triver.triver_shop.newShop.ext.d.a(str)) == null || (jSONObject = a2.getJSONObject("nextPageProperty")) == null) {
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(b.c(jSONObject));
            if (wVCallBackContext == null) {
                return;
            }
            wVCallBackContext.success();
        }
    }

    private final void shopLoftVideoSeekTo(WVCallBackContext wVCallBackContext, String str) {
        ShopWrapWebView shopWrapWebView;
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13fc1595", new Object[]{this, wVCallBackContext, str});
        } else if (wVCallBackContext == null || str == null || (shopWrapWebView = getShopWrapWebView(wVCallBackContext)) == null || (a2 = com.alibaba.triver.triver_shop.newShop.ext.d.a(str)) == null) {
        } else {
            String string = a2.getString("position");
            Integer d = string == null ? null : n.d(string);
            if (d == null) {
                ceg.Companion.b("shopLoftVideoSeekTo position is null");
                return;
            }
            rul<Integer, t> h = shopWrapWebView.getShopLoftWebViewBizAdapter().h();
            if (h == null) {
                return;
            }
            h.mo2421invoke(d);
        }
    }

    private final void getShopLoftVideoCardVideoPlayerInfo(WVCallBackContext wVCallBackContext) {
        com.alibaba.triver.triver_shop.newShop.view.extend.a shopLoftWebViewBizAdapter;
        ruk<JSONObject> g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7fba2e0", new Object[]{this, wVCallBackContext});
        } else if (wVCallBackContext == null) {
        } else {
            ShopWrapWebView shopWrapWebView = getShopWrapWebView(wVCallBackContext);
            JSONObject jSONObject = null;
            if (shopWrapWebView != null && (shopLoftWebViewBizAdapter = shopWrapWebView.getShopLoftWebViewBizAdapter()) != null && (g = shopLoftWebViewBizAdapter.g()) != null) {
                jSONObject = g.mo2427invoke();
            }
            if (jSONObject != null) {
                wVCallBackContext.success(jSONObject.toString());
            } else {
                wVCallBackContext.error("can not get player info");
            }
        }
    }

    private final void updateShopLoftWebDialogStatus(WVCallBackContext wVCallBackContext, String str) {
        ShopWrapWebView shopWrapWebView;
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e701c6ac", new Object[]{this, wVCallBackContext, str});
        } else if (wVCallBackContext == null || (shopWrapWebView = getShopWrapWebView(wVCallBackContext)) == null || (a2 = com.alibaba.triver.triver_shop.newShop.ext.d.a(str)) == null) {
        } else {
            boolean a3 = q.a((Object) a2.getString("isWebDialogOpen"), (Object) "true");
            ceg.Companion.b(q.a("updateShopLoftWebDialogStatus : ", (Object) Boolean.valueOf(a3)));
            b.b(new WVShopApiBridge$updateShopLoftWebDialogStatus$1(shopWrapWebView, a3));
        }
    }

    private final void updateShopLoftWebLayerSafeAreaHeight(WVCallBackContext wVCallBackContext, String str) {
        ShopWrapWebView shopWrapWebView;
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("705ea67c", new Object[]{this, wVCallBackContext, str});
        } else if (wVCallBackContext == null || (shopWrapWebView = getShopWrapWebView(wVCallBackContext)) == null || (a2 = com.alibaba.triver.triver_shop.newShop.ext.d.a(str)) == null) {
        } else {
            String string = a2.getString("safeAreaHeight");
            Integer d = string == null ? null : n.d(string);
            if (d == null) {
                return;
            }
            int c = o.c(Integer.valueOf(d.intValue()));
            shopWrapWebView.getShopLoftWebViewBizAdapter().a(c);
            ceg.Companion.b(q.a("updateShopLoftWebLayerSafeAreaHeight : ", (Object) Integer.valueOf(c)));
        }
    }

    private final void getCurrentShopLoftCardData(WVCallBackContext wVCallBackContext) {
        ShopWrapWebView shopWrapWebView;
        com.alibaba.triver.triver_shop.newShop.view.extend.a shopLoftWebViewBizAdapter;
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6e44f48", new Object[]{this, wVCallBackContext});
        } else if (wVCallBackContext != null && (shopWrapWebView = getShopWrapWebView(wVCallBackContext)) != null && (shopLoftWebViewBizAdapter = shopWrapWebView.getShopLoftWebViewBizAdapter()) != null && (a2 = shopLoftWebViewBizAdapter.a()) != null) {
            wVCallBackContext.success(a2.toString());
        } else if (wVCallBackContext == null) {
        } else {
            wVCallBackContext.error("shopLoftDataError", com.taobao.vessel.utils.c.LOAD_DATA_NULL);
        }
    }

    private final void checkBigCardVisible(WVCallBackContext wVCallBackContext) {
        ruk<Boolean> g;
        Boolean mo2427invoke;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdb1e98e", new Object[]{this, wVCallBackContext});
        } else if (wVCallBackContext == null) {
        } else {
            ShopWrapWebView shopWrapWebView = getShopWrapWebView(wVCallBackContext);
            com.alibaba.triver.triver_shop.newShop.view.embed.c swipeBigCardComponent = shopWrapWebView == null ? null : shopWrapWebView.getSwipeBigCardComponent();
            Pair[] pairArr = new Pair[1];
            pairArr[0] = j.a("visible", (swipeBigCardComponent != null && (g = swipeBigCardComponent.g()) != null && (mo2427invoke = g.mo2427invoke()) != null) ? mo2427invoke.booleanValue() : false ? "1" : "0");
            wVCallBackContext.success(com.alibaba.triver.triver_shop.newShop.ext.d.a(pairArr).toString());
        }
    }

    private final void foldBigCard(WVCallBackContext wVCallBackContext) {
        ShopWrapWebView shopWrapWebView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46961233", new Object[]{this, wVCallBackContext});
            return;
        }
        com.alibaba.triver.triver_shop.newShop.view.embed.c cVar = null;
        if (wVCallBackContext != null && (shopWrapWebView = getShopWrapWebView(wVCallBackContext)) != null) {
            cVar = shopWrapWebView.getSwipeBigCardComponent();
        }
        if (cVar == null) {
            return;
        }
        b.b(new WVShopApiBridge$foldBigCard$1(cVar));
    }

    private final void updateBigCardModuleIndex(String str, WVCallBackContext wVCallBackContext) {
        JSONObject a2;
        ShopWrapWebView shopWrapWebView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db400ad", new Object[]{this, str, wVCallBackContext});
        } else if (str == null || (a2 = com.alibaba.triver.triver_shop.newShop.ext.d.a(str)) == null) {
        } else {
            String string = a2.getString("index");
            q.b(string, "data.getString(\"index\")");
            Integer d = n.d(string);
            if (d == null) {
                return;
            }
            int intValue = d.intValue();
            com.alibaba.triver.triver_shop.newShop.view.embed.c cVar = null;
            if (wVCallBackContext != null && (shopWrapWebView = getShopWrapWebView(wVCallBackContext)) != null) {
                cVar = shopWrapWebView.getSwipeBigCardComponent();
            }
            b.b(new WVShopApiBridge$updateBigCardModuleIndex$1(cVar, intValue));
            ceg.Companion.b(q.a("updateBigCardModuleIndex : ", (Object) Integer.valueOf(intValue)));
        }
    }

    private final void getBigCardModuleData(WVCallBackContext wVCallBackContext) {
        d shopData;
        d shopData2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4ab9e14", new Object[]{this, wVCallBackContext});
        } else if (wVCallBackContext == null) {
        } else {
            ShopWrapWebView shopWrapWebView = getShopWrapWebView(wVCallBackContext);
            JSONObject jSONObject = null;
            JSONObject aS = (shopWrapWebView == null || (shopData = shopWrapWebView.getShopData()) == null) ? null : shopData.aS();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = jSONObject2;
            jSONObject3.put((JSONObject) "shopCarouselCardVO", (String) aS);
            ShopWrapWebView shopWrapWebView2 = getShopWrapWebView(wVCallBackContext);
            if (shopWrapWebView2 != null && (shopData2 = shopWrapWebView2.getShopData()) != null) {
                jSONObject = shopData2.i();
            }
            jSONObject3.put((JSONObject) "prefetchBizData", (String) jSONObject);
            wVCallBackContext.success(jSONObject2.toJSONString());
        }
    }

    private final void getShopPIParams(String str, WVCallBackContext wVCallBackContext) {
        ShopWrapWebView shopWrapWebView;
        d shopData;
        JSONObject m;
        String c;
        d shopData2;
        d shopData3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20ca99d9", new Object[]{this, str, wVCallBackContext});
        } else if (wVCallBackContext == null || (shopWrapWebView = getShopWrapWebView(wVCallBackContext)) == null || (shopData = shopWrapWebView.getShopData()) == null || (m = shopData.m()) == null) {
            if (wVCallBackContext == null) {
                return;
            }
            wVCallBackContext.error();
        } else {
            com.alibaba.triver.triver_shop.preload.a a2 = com.alibaba.triver.triver_shop.preload.e.INSTANCE.a();
            if (a2 != null) {
                if (System.currentTimeMillis() - a2.b() >= 10000) {
                    ceg.Companion.b("shop route mini data cache expire");
                } else {
                    ShopWrapWebView shopWrapWebView2 = getShopWrapWebView(wVCallBackContext);
                    String str2 = null;
                    if (shopWrapWebView2 != null && (shopData3 = shopWrapWebView2.getShopData()) != null) {
                        str2 = shopData3.T();
                    }
                    if (q.a((Object) str2, (Object) a2.a()) && (c = a2.c()) != null) {
                        m.put((JSONObject) "minidata", c);
                        ceg.Companion.b("shop route mini data cache hit");
                        ShopWrapWebView shopWrapWebView3 = getShopWrapWebView(wVCallBackContext);
                        if (shopWrapWebView3 != null && (shopData2 = shopWrapWebView3.getShopData()) != null) {
                            shopData2.b("miniDataCacheHit", "true");
                        }
                    }
                }
            }
            wVCallBackContext.success(m.toJSONString());
        }
    }

    private final void remoteLog(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d791f2ec", new Object[]{this, str, wVCallBackContext});
        } else {
            ceg.Companion.b(str);
        }
    }

    private final void markPerformance(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16e8a2b1", new Object[]{this, str, wVCallBackContext});
            return;
        }
        ShopWrapWebView shopWrapWebView = wVCallBackContext == null ? null : getShopWrapWebView(wVCallBackContext);
        d shopData = getShopData(wVCallBackContext);
        if (shopData == null) {
            if (wVCallBackContext == null) {
                return;
            }
            wVCallBackContext.error();
            return;
        }
        JSONObject a2 = com.alibaba.triver.triver_shop.newShop.ext.d.a(str);
        if (a2 != null) {
            JSONArray jSONArray = new JSONArray();
            Object obj = a2.get("data");
            if (!(obj instanceof JSONArray)) {
                obj = jSONArray;
            }
            for (Object obj2 : (JSONArray) obj) {
                if (obj2 instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj2;
                    String name = jSONObject.getString("name");
                    String string = jSONObject.getString("time");
                    q.b(string, "apiParam.getString(\"time\")");
                    Long e = n.e(string);
                    long currentTimeMillis = e == null ? System.currentTimeMillis() : e.longValue();
                    if (q.a((Object) name, (Object) "shopModuleRenderEnd")) {
                        s.f18233a.d().a("moduleRenderCompleteTime", b.a(currentTimeMillis));
                    }
                    if (q.a((Object) name, (Object) "shopIndexRenderEnd")) {
                        shopData.b(q.a(shopWrapWebView == null ? null : shopWrapWebView.getCurrentPageName(), (Object) "_appEnd"), Long.valueOf(currentTimeMillis));
                        updateStageData(shopWrapWebView, shopData, "uc_t2_time", Long.valueOf(currentTimeMillis));
                    }
                    q.b(name, "name");
                    updateStageData(shopWrapWebView, shopData, name, Long.valueOf(currentTimeMillis));
                }
            }
        }
        if (wVCallBackContext == null) {
            return;
        }
        wVCallBackContext.success();
    }

    private final void updateStageData(ShopWrapWebView shopWrapWebView, d dVar, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9171de5f", new Object[]{this, shopWrapWebView, dVar, str, obj});
            return;
        }
        if ((shopWrapWebView == null ? null : shopWrapWebView.getCurrentPageName()) != null) {
            dVar.c("js_" + ((Object) shopWrapWebView.getCurrentPageName()) + '_' + str, obj);
            return;
        }
        dVar.c(q.a("js_", (Object) str), obj);
    }

    private final void shopLoftMarkPerformance(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("132f6aca", new Object[]{this, str, wVCallBackContext});
            return;
        }
        ShopWrapWebView shopWrapWebView = wVCallBackContext == null ? null : getShopWrapWebView(wVCallBackContext);
        if (shopWrapWebView == null) {
            return;
        }
        JSONObject a2 = com.alibaba.triver.triver_shop.newShop.ext.d.a(str);
        if (a2 != null) {
            JSONArray jSONArray = new JSONArray();
            Object obj = a2.get("data");
            if (!(obj instanceof JSONArray)) {
                obj = jSONArray;
            }
            for (Object obj2 : (JSONArray) obj) {
                if (obj2 instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj2;
                    shopWrapWebView.getShopLoftWebViewBizAdapter().b().put((JSONObject) jSONObject.getString("name"), (String) jSONObject.get("time"));
                }
            }
        }
        wVCallBackContext.success();
    }

    private final ShopWrapWebView getShopWrapWebView(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopWrapWebView) ipChange.ipc$dispatch("144aeab1", new Object[]{this, wVCallBackContext});
        }
        IWVWebView webview = wVCallBackContext.getWebview();
        if (webview != null && (webview instanceof ShopWrapWebView)) {
            return (ShopWrapWebView) webview;
        }
        return null;
    }

    private final d getShopData(WVCallBackContext wVCallBackContext) {
        IWVWebView webview;
        Context context;
        ShopWrapWebView shopWrapWebView;
        d shopData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("9a8eee0b", new Object[]{this, wVCallBackContext});
        }
        if (wVCallBackContext != null && (shopWrapWebView = getShopWrapWebView(wVCallBackContext)) != null && (shopData = shopWrapWebView.getShopData()) != null) {
            return shopData;
        }
        if (wVCallBackContext != null && (webview = wVCallBackContext.getWebview()) != null && (context = webview.getContext()) != null && (context instanceof com.alibaba.triver.triver_shop.newShop.data.c)) {
            return ((com.alibaba.triver.triver_shop.newShop.data.c) context).r_();
        }
        return null;
    }
}
