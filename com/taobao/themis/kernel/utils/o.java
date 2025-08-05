package com.taobao.themis.kernel.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.TMSContainerType;
import com.taobao.themis.kernel.adapter.IAccountAdapter;
import com.taobao.themis.kernel.adapter.INavigatorAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.metaInfo.manifest.TabBar;
import com.taobao.themis.kernel.metaInfo.manifest.TabBarItem;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ai;
import kotlin.collections.p;
import tb.kge;
import tb.qpt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0004\u001a\n\u0010\u0007\u001a\u00020\u0003*\u00020\u0004\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0004\u001a\f\u0010\t\u001a\u0004\u0018\u00010\u0004*\u00020\n\u001a\f\u0010\u000b\u001a\u0004\u0018\u00010\u0001*\u00020\u0004\u001a\u0014\u0010\f\u001a\u0004\u0018\u00010\r*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0001\u001a\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u0001*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0001\u001a\f\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u00020\u0004\u001a\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0001\u001a \u0010\u0013\u001a\u0004\u0018\u00010\u0014*\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u001a\n\u0010\u0016\u001a\u00020\u0001*\u00020\u0004\u001a\f\u0010\u0017\u001a\u0004\u0018\u00010\u0001*\u00020\u0004\u001a\n\u0010\u0018\u001a\u00020\u0006*\u00020\u0004\u001a\n\u0010\u0019\u001a\u00020\u0006*\u00020\u0004\u001a\n\u0010\u001a\u001a\u00020\u0006*\u00020\u0004\u001a\n\u0010\u001b\u001a\u00020\u0006*\u00020\u0004\u001a\n\u0010\u001c\u001a\u00020\u0006*\u00020\u0004\u001a\n\u0010\u001d\u001a\u00020\u0006*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {RPCDataItems.SWITCH_TAG_LOG, "", "autoReload", "", "Lcom/taobao/themis/kernel/TMSInstance;", "canAuth", "", "downgradeUniApp", "getBizId", "getInstance", "Landroid/content/Context;", "getNativePlugins", "getPageModelFromPages", "Lcom/taobao/themis/kernel/container/PageModel;", "pageId", "getQueryWithTabBar", "getSceneId", "getTabItemFromTabBar", "Lcom/taobao/themis/kernel/metaInfo/manifest/TabBarItem;", "getTargetPageWindow", "Lcom/taobao/themis/kernel/container/Window;", com.taobao.android.weex_framework.util.a.ATOM_EXT_window, "getThemisUserAgent", "getWidgetSellerId", "isMiniGame", "isTinyApp", "isUseMnn", "isUseWasm", "isWidget", "supportAuthPage", "themis_kernel_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-585311915);
    }

    public static final boolean d(com.taobao.themis.kernel.f canAuth) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a52be34", new Object[]{canAuth})).booleanValue();
        }
        kotlin.jvm.internal.q.d(canAuth, "$this$canAuth");
        return true;
    }

    public static final boolean a(com.taobao.themis.kernel.f supportAuthPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0cb8a31", new Object[]{supportAuthPage})).booleanValue();
        }
        kotlin.jvm.internal.q.d(supportAuthPage, "$this$supportAuthPage");
        return !b(supportAuthPage);
    }

    public static final boolean b(com.taobao.themis.kernel.f isWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ea34632", new Object[]{isWidget})).booleanValue();
        }
        kotlin.jvm.internal.q.d(isWidget, "$this$isWidget");
        return kotlin.jvm.internal.q.a((Object) com.taobao.themis.utils.o.a(isWidget.g(), com.taobao.themis.kernel.i.IS_WIDGET), (Object) "true");
    }

    public static final boolean l(com.taobao.themis.kernel.f isMiniGame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59109e3c", new Object[]{isMiniGame})).booleanValue();
        }
        kotlin.jvm.internal.q.d(isMiniGame, "$this$isMiniGame");
        return isMiniGame.j() == TMSSolutionType.MINIGAME;
    }

    public static final String c(com.taobao.themis.kernel.f getSceneId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bcabb651", new Object[]{getSceneId});
        }
        kotlin.jvm.internal.q.d(getSceneId, "$this$getSceneId");
        return getSceneId.q().getExtraData().getString("sceneId");
    }

    public static final String h(com.taobao.themis.kernel.f getWidgetSellerId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("74fbf4ec", new Object[]{getWidgetSellerId});
        }
        kotlin.jvm.internal.q.d(getWidgetSellerId, "$this$getWidgetSellerId");
        return getWidgetSellerId.q().getExtraData().getString("sellerId");
    }

    public static final String i(com.taobao.themis.kernel.f getNativePlugins) {
        JSONObject m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66a59b0b", new Object[]{getNativePlugins});
        }
        kotlin.jvm.internal.q.d(getNativePlugins, "$this$getNativePlugins");
        TMSMetaInfoWrapper v = getNativePlugins.v();
        if (v != null && (m = v.m()) != null) {
            return m.getString("nativePlugins");
        }
        return null;
    }

    public static final boolean j(com.taobao.themis.kernel.f isUseMnn) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d61263a", new Object[]{isUseMnn})).booleanValue();
        }
        kotlin.jvm.internal.q.d(isUseMnn, "$this$isUseMnn");
        String i = i(isUseMnn);
        return i != null && kotlin.text.n.b((CharSequence) i, (CharSequence) "mnn", false, 2, (Object) null);
    }

    public static final boolean k(com.taobao.themis.kernel.f isUseWasm) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db38e23b", new Object[]{isUseWasm})).booleanValue();
        }
        kotlin.jvm.internal.q.d(isUseWasm, "$this$isUseWasm");
        String i = i(isUseWasm);
        return i != null && kotlin.text.n.b((CharSequence) i, (CharSequence) "wasm", false, 2, (Object) null);
    }

    public static final String e(com.taobao.themis.kernel.f getBizId) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9fff028f", new Object[]{getBizId});
        }
        kotlin.jvm.internal.q.d(getBizId, "$this$getBizId");
        IAccountAdapter iAccountAdapter = (IAccountAdapter) qpt.b(IAccountAdapter.class);
        String userId = iAccountAdapter != null ? iAccountAdapter.getUserId(getBizId) : null;
        String str = userId;
        if (!(str == null || str.length() == 0)) {
            String h = getBizId.h();
            if (!(h == null || h.length() == 0)) {
                String a2 = com.taobao.themis.utils.io.b.a(getBizId.h() + userId);
                String str2 = a2;
                if (str2 == null || str2.length() == 0) {
                    z = true;
                }
                if (!z) {
                    return a2;
                }
                TMSLogger.d("TMSInstanceExt", "generateBizId:bizId is empty");
                return "";
            }
        }
        TMSLogger.d("TMSInstanceExt", "generateBizId:userId or appId is null");
        return "";
    }

    public static final com.taobao.themis.kernel.f a(Context getInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.themis.kernel.f) ipChange.ipc$dispatch("c4bf373b", new Object[]{getInstance});
        }
        kotlin.jvm.internal.q.d(getInstance, "$this$getInstance");
        com.taobao.themis.kernel.g gVar = null;
        if (getInstance instanceof MutableContextWrapper) {
            try {
                Context baseContext = ((MutableContextWrapper) getInstance).getBaseContext();
                if (baseContext == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.taobao.themis.kernel.TMSInstanceBinder");
                }
                gVar = (com.taobao.themis.kernel.g) baseContext;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (getInstance instanceof com.taobao.themis.kernel.g) {
            gVar = (com.taobao.themis.kernel.g) getInstance;
        }
        if (gVar == null) {
            return null;
        }
        return gVar.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    public static final Window a(com.taobao.themis.kernel.f getTargetPageWindow, String str, Window window) {
        Window window2;
        ?? r4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Window) ipChange.ipc$dispatch("bc3908e7", new Object[]{getTargetPageWindow, str, window});
        }
        kotlin.jvm.internal.q.d(getTargetPageWindow, "$this$getTargetPageWindow");
        com.taobao.themis.kernel.container.a x = getTargetPageWindow.x();
        com.taobao.themis.kernel.container.b bVar = null;
        if (x == null) {
            return null;
        }
        kotlin.jvm.internal.q.b(x, "containerModel ?: return null");
        if (str != null) {
            List<com.taobao.themis.kernel.container.b> a2 = x.a();
            if (a2 != null) {
                Iterator it = a2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        r4 = 0;
                        break;
                    }
                    r4 = it.next();
                    if (kotlin.jvm.internal.q.a((Object) ((com.taobao.themis.kernel.container.b) r4).a(), (Object) str)) {
                        break;
                    }
                }
                com.taobao.themis.kernel.container.b bVar2 = r4;
                if (bVar2 != null) {
                    bVar = bVar2;
                }
            }
            Iterator it2 = x.e().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ?? next = it2.next();
                if (kotlin.jvm.internal.q.a((Object) ((com.taobao.themis.kernel.container.b) next).a(), (Object) str)) {
                    bVar = next;
                    break;
                }
            }
            bVar = bVar;
        }
        Window.b bVar3 = Window.Companion;
        Window b = x.b();
        if (b == null) {
            b = new Window(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
        }
        if (bVar == null || (window2 = bVar.c()) == null) {
            window2 = new Window(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
        }
        return bVar3.a(bVar3.a(b, window2), window == null ? new Window(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null) : window);
    }

    public static final boolean f(com.taobao.themis.kernel.f isTinyApp) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66023636", new Object[]{isTinyApp})).booleanValue();
        }
        kotlin.jvm.internal.q.d(isTinyApp, "$this$isTinyApp");
        TMSMetaInfoWrapper v = isTinyApp.v();
        return kotlin.jvm.internal.q.a((Object) (v != null ? v.x() : null), (Object) "TinyApp");
    }

    public static final String g(com.taobao.themis.kernel.f getThemisUserAgent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("83524ecd", new Object[]{getThemisUserAgent});
        }
        kotlin.jvm.internal.q.d(getThemisUserAgent, "$this$getThemisUserAgent");
        boolean f = f(getThemisUserAgent);
        ArrayList arrayList = new ArrayList();
        if (f) {
            arrayList.add("TinyApp");
        }
        if (!(!arrayList.isEmpty())) {
            return "Themis/1.6.77";
        }
        return "Themis/1.6.77 (" + p.a(arrayList, ";", null, null, 0, null, null, 62, null) + ')';
    }

    public static final TabBarItem a(com.taobao.themis.kernel.f getTabItemFromTabBar, String pageId) {
        TabBar d;
        List<TabBarItem> items;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabBarItem) ipChange.ipc$dispatch("540bb6d7", new Object[]{getTabItemFromTabBar, pageId});
        }
        kotlin.jvm.internal.q.d(getTabItemFromTabBar, "$this$getTabItemFromTabBar");
        kotlin.jvm.internal.q.d(pageId, "pageId");
        com.taobao.themis.kernel.container.a x = getTabItemFromTabBar.x();
        Object obj = null;
        if (x == null || (d = x.d()) == null || (items = d.getItems()) == null) {
            return null;
        }
        Iterator<T> it = items.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (kotlin.jvm.internal.q.a((Object) ((TabBarItem) next).getPageId(), (Object) pageId)) {
                obj = next;
                break;
            }
        }
        return (TabBarItem) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    public static final com.taobao.themis.kernel.container.b b(com.taobao.themis.kernel.f getPageModelFromPages, String pageId) {
        com.taobao.themis.kernel.container.b bVar;
        ?? r2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.themis.kernel.container.b) ipChange.ipc$dispatch("2223a75", new Object[]{getPageModelFromPages, pageId});
        }
        kotlin.jvm.internal.q.d(getPageModelFromPages, "$this$getPageModelFromPages");
        kotlin.jvm.internal.q.d(pageId, "pageId");
        com.taobao.themis.kernel.container.b bVar2 = null;
        com.taobao.themis.kernel.container.b bVar3 = null;
        com.taobao.themis.kernel.container.a x = getPageModelFromPages.x();
        if (x == null) {
            return bVar3;
        }
        List<com.taobao.themis.kernel.container.b> a2 = x.a();
        if (a2 != null) {
            Iterator it = a2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    r2 = 0;
                    break;
                }
                r2 = it.next();
                if (kotlin.jvm.internal.q.a((Object) ((com.taobao.themis.kernel.container.b) r2).a(), (Object) pageId)) {
                    break;
                }
            }
            bVar = r2;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        Iterator it2 = x.e().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            ?? next = it2.next();
            if (kotlin.jvm.internal.q.a((Object) ((com.taobao.themis.kernel.container.b) next).a(), (Object) pageId)) {
                bVar2 = next;
                break;
            }
        }
        return bVar2;
    }

    public static final void m(com.taobao.themis.kernel.f downgradeUniApp) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6e85a39", new Object[]{downgradeUniApp});
            return;
        }
        kotlin.jvm.internal.q.d(downgradeUniApp, "$this$downgradeUniApp");
        if (!n.bG() || downgradeUniApp.i() != TMSContainerType.GENERIC) {
            return;
        }
        INavigatorAdapter iNavigatorAdapter = (INavigatorAdapter) qpt.b(INavigatorAdapter.class);
        if (iNavigatorAdapter != null) {
            Activity o = downgradeUniApp.o();
            kotlin.jvm.internal.q.b(o, "this.activity");
            Activity activity = o;
            String uri = com.taobao.themis.utils.o.b(downgradeUniApp.g()).buildUpon().appendQueryParameter("tms_force_h5", "true").build().toString();
            kotlin.jvm.internal.q.b(uri, "TMSUrlUtils.parseUrl(thi…true\").build().toString()");
            Activity o2 = downgradeUniApp.o();
            kotlin.jvm.internal.q.b(o2, "this.activity");
            Intent intent = o2.getIntent();
            kotlin.jvm.internal.q.b(intent, "this.activity.intent");
            iNavigatorAdapter.openURL(activity, uri, intent.getExtras(), null, ai.a(kotlin.j.a("skipAllProcessor", true), kotlin.j.a("className", downgradeUniApp.o().getClass().getName()), kotlin.j.a("disableTransition", true)));
        }
        downgradeUniApp.o().finish();
    }

    public static final void n(com.taobao.themis.kernel.f autoReload) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54c0163a", new Object[]{autoReload});
            return;
        }
        kotlin.jvm.internal.q.d(autoReload, "$this$autoReload");
        if (kotlin.jvm.internal.q.a((Object) com.taobao.themis.utils.o.a(autoReload.g(), "tms_auto_reload"), (Object) "true")) {
            TMSLogger.d("TMSInstanceExt", "has auto-reloaded once, skip");
        } else {
            a.a(new TMSInstanceExtKt$autoReload$1(autoReload));
        }
    }
}
