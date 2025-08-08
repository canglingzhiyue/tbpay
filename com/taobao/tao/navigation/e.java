package com.taobao.tao.navigation;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabWidget;
import com.alibaba.fastjson.JSONObject;
import com.alipay.birdnest.util.UiUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.TBFragmentTabHost;
import com.taobao.tao.navigation.g;
import com.taobao.tao.navigation.model.NavigationStatus;
import com.taobao.tao.navigation.model.NavigationTabConstraints;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.lyt;
import tb.omj;
import tb.omk;
import tb.omm;
import tb.omn;
import tb.omr;
import tb.see;

/* loaded from: classes.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static CopyOnWriteArrayList<FragmentManager.FragmentLifecycleCallbacks> f;
    public static CopyOnWriteArrayList<com.taobao.tao.navigation.d> g;
    private static HashMap<String, Integer> i;
    private static omm q;
    private static f s;

    /* renamed from: a  reason: collision with root package name */
    public static ArrayList<g> f20801a = new ArrayList<>();
    public static ArrayList<g> b = new ArrayList<>();
    public static boolean c = false;
    public static ArrayList<String> d = new ArrayList<>();
    private static boolean h = false;
    public static TBFragmentTabHost e = null;
    private static Map<Integer, Object> j = new HashMap();
    private static j k = null;
    private static Map<Integer, InterfaceC0873e> l = new HashMap();
    private static omk m = null;
    private static final List<omj> n = new CopyOnWriteArrayList();
    private static final List<see> r = new CopyOnWriteArrayList();
    private static List<d> o = new ArrayList();
    private static b p = null;

    /* loaded from: classes.dex */
    public interface b {
        void a();

        void a(int i, g gVar);
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();
    }

    /* renamed from: com.taobao.tao.navigation.e$e  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public interface InterfaceC0873e {
    }

    /* loaded from: classes8.dex */
    public interface f {
        void a(NavigationStatus.a aVar);
    }

    public static /* synthetic */ boolean a(int i2, View view, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("114fcc61", new Object[]{new Integer(i2), view, new Boolean(z)})).booleanValue() : b(i2, view, z);
    }

    public static /* synthetic */ boolean a(int i2, NavigationTabMsgMode navigationTabMsgMode, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cba22c44", new Object[]{new Integer(i2), navigationTabMsgMode, str, str2})).booleanValue() : b(i2, navigationTabMsgMode, str, str2);
    }

    public static /* synthetic */ boolean b(int i2, NavigationTabMsgMode navigationTabMsgMode, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6d1c88d9", new Object[]{new Integer(i2), navigationTabMsgMode, str})).booleanValue() : e(i2, navigationTabMsgMode, str);
    }

    public static /* synthetic */ List k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("6ec86895", new Object[0]) : n;
    }

    public static /* synthetic */ void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[0]);
        } else {
            o();
        }
    }

    public static /* synthetic */ HashMap m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("38cf86d7", new Object[0]) : i;
    }

    static {
        b.clear();
        for (int i2 = 0; i2 < 5; i2++) {
            g.a aVar = new g.a();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            if (i2 == 0) {
                hashMap.put("spm-url", "a2141.1.tabbar.homepage");
                hashMap2.put("pageName", "Page_TabVC");
                hashMap2.put("controlName", "Button-Home");
                aVar.a(new Pair<>(Integer.valueOf(R.drawable.uik_nav_home_normal), Integer.valueOf(R.drawable.uik_nav_home_selected))).a(NavigationTabIconSourceType.DRAWABLE).c(false).a("首页").b("http://m.taobao.com/index.htm").c("0").a(NavigationTabMsgMode.NONE).d("com.taobao.tao.homepage.MainActivity3").e("com.taobao.tao.homepage.HomepageFragment").f("com.taobao.taobao.home").a(false).b(true).a(hashMap).b(hashMap2).d(false).a(0).g(NavigationTabConstraints.TAB_BIZ_HOMEPAGE);
            } else if (i2 == 1) {
                hashMap.put("spm-url", "a2141.1.tabbar.guangguang");
                hashMap2.put("pageName", "Page_TabVC");
                hashMap2.put("controlName", "Button-guangguang");
                aVar.a(new Pair<>(Integer.valueOf(R.drawable.uik_nav_guangguang_normal), Integer.valueOf(R.drawable.uik_nav_guangguang_selected))).a(NavigationTabIconSourceType.DRAWABLE).c(false).a("逛逛").b("https://h5.m.taobao.com/guangguang/index.htm").c("0").a(NavigationTabMsgMode.RED_POINT_INDICATOR).d("com.taobao.wetao.home.WeTaoMainActivity").e("com.taobao.wetao.home.GuangGuangTnodeMainFragment").f("com.taobao.allspark").a(true).b(true).a(hashMap).b(hashMap2).d(false).a(1).g("tab2");
            } else if (i2 == 2) {
                hashMap.put("spm-url", "a2141.1.tabbar.ocean");
                hashMap2.put("pageName", "Page_TabVC");
                hashMap2.put("controlName", "Button-Message");
                aVar.a(new Pair<>(Integer.valueOf(R.drawable.uik_nav_message_normal), Integer.valueOf(R.drawable.uik_nav_message_selected))).a(NavigationTabIconSourceType.DRAWABLE).c(false).a("消息").b("taobao://message/root").c("0").a(NavigationTabMsgMode.RED_POINT_INDICATOR).d("com.taobao.message.category.MsgCenterCategoryTabActivity").e("com.taobao.message.conversation.MessageTabFragment").f("com.taobao.wangxin").a(true).b(true).a(hashMap).b(hashMap2).d(true).a(2).g("message");
            } else if (i2 == 3) {
                hashMap.put("spm-url", "a2141.1.tabbar.shoppingcart");
                hashMap2.put("pageName", "Page_TabVC");
                hashMap2.put("controlName", "Button-ShoppingCart");
                aVar.a(new Pair<>(Integer.valueOf(R.drawable.uik_nav_cart_normal), Integer.valueOf(R.drawable.uik_nav_cart_selected))).a(NavigationTabIconSourceType.DRAWABLE).c(false).a("购物车").b("http://h5.m.taobao.com/awp/base/newcart.htm").c("0").a(NavigationTabMsgMode.NONE).d("com.taobao.android.trade.cart.CartTabActivity").e("com.taobao.android.icart.UltronICartFragment").f("com.taobao.android.newtrade").a(true).b(true).a(hashMap).b(hashMap2).d(true).a(3).g("cart");
            } else if (i2 == 4) {
                hashMap.put("spm-url", "a2141.1.tabbar.mytaobao");
                hashMap2.put("pageName", "Page_TabVC");
                hashMap2.put("controlName", "Button-MyTaoBao");
                aVar.a(new Pair<>(Integer.valueOf(R.drawable.uik_nav_my_normal), Integer.valueOf(R.drawable.uik_nav_my_selected))).a(NavigationTabIconSourceType.DRAWABLE).c(false).a("我的淘宝").b("http://h5.m.taobao.com/awp/mtb/mtb.htm").c("0").a(NavigationTabMsgMode.NONE).d("com.taobao.tao.mytaobao.MyTaoBaoActivity").e("com.taobao.mytaobao.homepage.MyTaobaoFragment").f("com.taobao.mytaobao").a(true).b(true).a(hashMap).b(hashMap2).d(true).a(4).g("mytaobao");
            }
            if (aVar.a() != null) {
                b.add(aVar.a());
            }
        }
    }

    public static void a(int i2, InterfaceC0873e interfaceC0873e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f259c3b", new Object[]{new Integer(i2), interfaceC0873e});
        } else {
            l.put(Integer.valueOf(i2), interfaceC0873e);
        }
    }

    public static void a(omk omkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f830816b", new Object[]{omkVar});
        } else if (com.taobao.tao.navigation.f.b()) {
        } else {
            m = omkVar;
        }
    }

    public static void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d218cb1", new Object[]{bVar});
        } else if (com.taobao.tao.navigation.f.b()) {
        } else {
            p = bVar;
        }
    }

    private static void n() {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[0]);
        } else if (com.taobao.tao.navigation.f.b() || (bVar = p) == null) {
        } else {
            bVar.a();
        }
    }

    public static void a() {
        omk omkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (com.taobao.tao.navigation.f.b() || (omkVar = m) == null) {
        } else {
            omkVar.a();
            TLog.loge(com.taobao.tao.navigation.a.a(), "Navigation", "notify Style Update Called");
        }
    }

    public static void a(omj omjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8300d0c", new Object[]{omjVar});
        } else if (omjVar == null) {
        } else {
            n.add(omjVar);
        }
    }

    private static void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[0]);
        } else {
            Coordinator.execute(new Runnable() { // from class: com.taobao.tao.navigation.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        for (omj omjVar : e.k()) {
                            omjVar.a();
                        }
                    } catch (Exception e2) {
                        String a2 = com.taobao.tao.navigation.a.a();
                        TLog.loge(a2, "Navigation", "notifyNavigationExposured failed. " + e2.toString());
                    }
                }
            });
        }
    }

    public static void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d22756f", new Object[]{dVar});
        } else {
            o.add(dVar);
        }
    }

    public static void a(TBFragmentTabHost tBFragmentTabHost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24735ff5", new Object[]{tBFragmentTabHost});
        } else if (tBFragmentTabHost == null) {
            omr.a("update_error", "host is null");
        } else {
            e = tBFragmentTabHost;
            tBFragmentTabHost.setExposureCallback(new TBFragmentTabHost.a() { // from class: com.taobao.tao.navigation.e.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.navigation.TBFragmentTabHost.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        e.l();
                    }
                }
            });
            if (!(e.getContext() instanceof FragmentActivity)) {
                TLog.loge(com.taobao.tao.navigation.a.a(), "Navigation", "registerFragmentLifecycleCallbacks failed. context is not instanceof FragmentActivity");
                return;
            }
            FragmentManager fragmentManager = e.getFragmentManager();
            if (fragmentManager == null) {
                TLog.loge(com.taobao.tao.navigation.a.a(), "Navigation", "registerFragmentLifecycleCallbacks failed. fragmentManager is null");
                return;
            }
            CopyOnWriteArrayList<FragmentManager.FragmentLifecycleCallbacks> copyOnWriteArrayList = f;
            if (copyOnWriteArrayList == null) {
                TLog.loge(com.taobao.tao.navigation.a.a(), "Navigation", "registerFragmentLifecycleCallbacks failed. sFragmentLifecycleCallbacks is null");
                return;
            }
            Iterator<FragmentManager.FragmentLifecycleCallbacks> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                fragmentManager.registerFragmentLifecycleCallbacks(it.next(), false);
            }
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        TBFragmentTabHost tBFragmentTabHost = e;
        if (tBFragmentTabHost == null) {
            return;
        }
        tBFragmentTabHost.unset();
        e.setExposureCallback(null);
        e = null;
        a((omm) null);
    }

    public static TBFragmentTabHost c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBFragmentTabHost) ipChange.ipc$dispatch("daccdbb7", new Object[0]) : e;
    }

    public static synchronized void d() {
        synchronized (e.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[0]);
                return;
            }
            if (!h) {
                a(b, f20801a);
                h = true;
            }
        }
    }

    public static ArrayList<g> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("bbce4046", new Object[0]);
        }
        d();
        return f20801a;
    }

    public static g b(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("8887093f", new Object[]{new Integer(i2)});
        }
        ArrayList<g> arrayList = f20801a;
        if (arrayList != null && arrayList.size() > 0 && i2 >= 0 && i2 < f20801a.size()) {
            return f20801a.get(i2);
        }
        return null;
    }

    public static g c(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("c5a6cd5e", new Object[]{new Integer(i2)});
        }
        g b2 = b(i2);
        if (b2 == null) {
            return null;
        }
        try {
            return (g) b2.clone();
        } catch (Exception unused) {
            TLog.loge(com.taobao.tao.navigation.a.a(), "Navigation", "generateNavigationTabInfo failed, can't clone");
            return null;
        }
    }

    private static boolean b(int i2, NavigationTabMsgMode navigationTabMsgMode, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3930763", new Object[]{new Integer(i2), navigationTabMsgMode, str, str2})).booleanValue();
        }
        g gVar = f20801a.get(i2);
        gVar.a(navigationTabMsgMode);
        gVar.e(str);
        if (str2 != null) {
            gVar.B = str2;
        }
        HashMap<String, Integer> hashMap = i;
        if (hashMap != null && hashMap.containsKey(String.valueOf(i2))) {
            gVar.a(i.get(String.valueOf(i2)));
        }
        TabWidget tabWidget = e.getTabWidget();
        if (tabWidget == null) {
            TLog.loge(com.taobao.tao.navigation.a.a(), "Navigation", "updateMessageView failed for tabWidget is null!");
            return false;
        }
        NavigationTabIndicatorView navigationTabIndicatorView = (NavigationTabIndicatorView) tabWidget.getChildTabViewAt(i2);
        if (navigationTabIndicatorView == null) {
            TLog.loge(com.taobao.tao.navigation.a.a(), "Navigation", "updateMessageView failed for indicatorView is null!");
            return false;
        }
        navigationTabIndicatorView.updateStyle(gVar, c, navigationTabIndicatorView.getSelected(), true);
        return true;
    }

    private static boolean d(int i2, NavigationTabMsgMode navigationTabMsgMode, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("71b1f297", new Object[]{new Integer(i2), navigationTabMsgMode, str})).booleanValue() : b(i2, navigationTabMsgMode, str, null);
    }

    private static boolean e(int i2, NavigationTabMsgMode navigationTabMsgMode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3fca776", new Object[]{new Integer(i2), navigationTabMsgMode, str})).booleanValue();
        }
        if (f20801a == null) {
            d();
        }
        ArrayList<g> arrayList = f20801a;
        if (arrayList == null || arrayList.size() <= 0) {
            Log.e("Navigation", "Update message count failed for initialization error");
        }
        if (i2 < 0 || i2 > f20801a.size()) {
            Log.e("Navigation", "Update message count failed for index out of range!");
            return false;
        }
        if (navigationTabMsgMode == NavigationTabMsgMode.USE_LAST) {
            navigationTabMsgMode = f20801a.get(i2).l();
        }
        if (!f20801a.get(i2).a(navigationTabMsgMode, str)) {
            Log.e("Navigation", "Update message count failed for message format error!");
            return false;
        } else if (e == null) {
            Log.e("Navigation", "Update message count failed for fragment tab host is null!");
            return false;
        } else {
            return d(i2, navigationTabMsgMode, str);
        }
    }

    public static synchronized void a(int i2, g gVar) {
        synchronized (e.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bbdbb25a", new Object[]{new Integer(i2), gVar});
                return;
            }
            if (f20801a == null || f20801a.size() <= 0) {
                d();
            }
            if (f20801a == null || f20801a.size() <= 0) {
                Log.e("Navigation", "Update message count failed for initialization error");
            }
            if (i2 >= 0 && i2 <= f20801a.size()) {
                if (!gVar.q()) {
                    Log.e("Navigation", "Update navigation tab failed!");
                    return;
                }
                f20801a.set(i2, gVar);
                d = null;
                p();
                return;
            }
            Log.e("Navigation", "Update message count failed for index out of range!");
        }
    }

    public static synchronized void b(int i2, g gVar) {
        synchronized (e.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("22b4721b", new Object[]{new Integer(i2), gVar});
                return;
            }
            if (f20801a == null || f20801a.size() <= 0) {
                d();
            }
            if (f20801a == null || f20801a.size() <= 0) {
                Log.e("Navigation", "Update message count failed for initialization error");
            }
            if (i2 >= 0 && i2 <= f20801a.size()) {
                if (!gVar.q()) {
                    Log.e("Navigation", "Update navigation tab failed!");
                    return;
                }
                f20801a.set(i2, gVar);
                d = null;
                p();
                return;
            }
            Log.e("Navigation", "Update message count failed for index out of range!");
        }
    }

    public static synchronized void a(ArrayList<g> arrayList, String str, int i2, boolean z) {
        synchronized (e.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a0a448bd", new Object[]{arrayList, str, new Integer(i2), new Boolean(z)});
                return;
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (!arrayList.get(i3).q()) {
                    Log.e("Navigation", "Update navigation tab failed for some reason");
                    return;
                }
            }
            a(arrayList, f20801a);
            d = null;
            i.b = str;
            i.f20806a = null;
            i.c = i2;
            c = z;
            p();
        }
    }

    public static synchronized void a(ArrayList<g> arrayList, Drawable drawable, int i2, boolean z) {
        synchronized (e.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5624717", new Object[]{arrayList, drawable, new Integer(i2), new Boolean(z)});
                return;
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (!arrayList.get(i3).q()) {
                    Log.e("Navigation", "Update navigation tab failed for some reason");
                    return;
                }
            }
            a(arrayList, f20801a);
            i.b = null;
            i.f20806a = drawable;
            i.c = i2;
            c = z;
            d = null;
            p();
        }
    }

    public static synchronized void f() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        synchronized (e.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
                return;
            }
            TLog.loge(com.taobao.tao.navigation.a.a(), "Navigation", "resetNavigation");
            i.f20806a = new ColorDrawable(-1);
            i.b = "";
            i.c = Color.parseColor("#e4e4e4");
            c = false;
            h = false;
            ArrayList arrayList4 = null;
            d = null;
            boolean z = (f20801a == null || b == null || b.size() != f20801a.size()) ? false : true;
            if (z) {
                arrayList4 = new ArrayList();
                arrayList = new ArrayList();
                arrayList2 = new ArrayList();
                arrayList3 = new ArrayList();
                Iterator<g> it = f20801a.iterator();
                while (it.hasNext()) {
                    g next = it.next();
                    arrayList4.add(next.l());
                    arrayList.add(next.m());
                    arrayList3.add(next.A);
                    arrayList2.add(next.B);
                }
            } else {
                arrayList = null;
                arrayList2 = null;
                arrayList3 = null;
            }
            d();
            if (z) {
                for (int i2 = 0; i2 < f20801a.size(); i2++) {
                    g gVar = f20801a.get(i2);
                    gVar.a((NavigationTabMsgMode) arrayList4.get(i2));
                    gVar.e((String) arrayList.get(i2));
                    gVar.A = (String) arrayList3.get(i2);
                    gVar.B = (String) arrayList2.get(i2);
                }
            }
            for (d dVar : o) {
                dVar.a();
            }
            q();
        }
    }

    public static void a(List<g> list, List<g> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78fe44a", new Object[]{list, list2});
        } else if (list != null && list.size() != 0 && list2 != null && !b(list, list2)) {
            list2.clear();
            for (g gVar : list) {
                try {
                    list2.add((g) gVar.clone());
                } catch (CloneNotSupportedException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    private static boolean b(List<g> list, List<g> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b37b7cf", new Object[]{list, list2})).booleanValue();
        }
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!list.get(i2).a(list2.get(i2))) {
                return false;
            }
        }
        return true;
    }

    private static void p() {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[0]);
            return;
        }
        TBFragmentTabHost tBFragmentTabHost = e;
        if (tBFragmentTabHost == null) {
            return;
        }
        tBFragmentTabHost.updateTabWidgetStyle();
        ArrayList arrayList = new ArrayList(f20801a.size());
        Iterator<g> it = f20801a.iterator();
        while (it.hasNext()) {
            g next = it.next();
            try {
                if (next.n() == NavigationTabIconSourceType.URL && next.d() != null && (next.d().first instanceof String) && (next.d().second instanceof String)) {
                    i2 += 2;
                    arrayList.add((g) next.clone());
                } else if (next.n() == NavigationTabIconSourceType.DRAWABLE2 && next.w() != null && next.x() != null) {
                    g();
                }
            } catch (CloneNotSupportedException e2) {
                e2.printStackTrace();
            }
        }
        if (arrayList.size() <= 0) {
            return;
        }
        j jVar = k;
        if (jVar != null) {
            jVar.cancel(true);
        }
        k = new j(i2);
        g[] gVarArr = new g[arrayList.size()];
        arrayList.toArray(gVarArr);
        k.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, gVarArr);
    }

    private static void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[0]);
            return;
        }
        TBFragmentTabHost tBFragmentTabHost = e;
        if (tBFragmentTabHost == null) {
            return;
        }
        tBFragmentTabHost.updateTabWidgetStyle();
        g();
    }

    public static void g() {
        NavigationTabIndicatorView navigationTabIndicatorView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[0]);
            return;
        }
        TBFragmentTabHost tBFragmentTabHost = e;
        if (tBFragmentTabHost == null) {
            omr.a("update_error", "sFragmentTabHost is null");
            return;
        }
        TabWidget tabWidget = tBFragmentTabHost.getTabWidget();
        if (tabWidget == null) {
            return;
        }
        n();
        for (int i2 = 0; i2 < f20801a.size(); i2++) {
            if (tabWidget.getChildTabViewAt(i2) != null && (navigationTabIndicatorView = (NavigationTabIndicatorView) tabWidget.getChildTabViewAt(i2)) != null) {
                navigationTabIndicatorView.updateStyle(f20801a.get(i2), c, navigationTabIndicatorView.getSelected(), true);
            }
        }
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        d();
        for (int i2 = 0; i2 < f20801a.size(); i2++) {
            if (f20801a.get(i2) != null) {
                String k2 = f20801a.get(i2).k();
                String j2 = b.get(i2).j();
                if ((!StringUtils.isEmpty(k2) && k2.equals(str)) || (!StringUtils.isEmpty(j2) && j2.equals(str))) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public static g b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("f6d2e2f8", new Object[]{str});
        }
        d();
        for (int i2 = 0; i2 < f20801a.size(); i2++) {
            g gVar = f20801a.get(i2);
            if (gVar != null) {
                String k2 = gVar.k();
                if (!StringUtils.isEmpty(k2) && k2.equals(str)) {
                    return gVar;
                }
            }
        }
        return null;
    }

    public static void a(FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ba69e5f", new Object[]{fragmentLifecycleCallbacks});
            return;
        }
        if (f == null) {
            f = new CopyOnWriteArrayList<>();
        }
        f.add(fragmentLifecycleCallbacks);
        TBFragmentTabHost tBFragmentTabHost = e;
        if (tBFragmentTabHost == null || !(tBFragmentTabHost.getContext() instanceof FragmentActivity)) {
            return;
        }
        FragmentManager fragmentManager = e.getFragmentManager();
        if (fragmentManager == null) {
            ((FragmentActivity) e.getContext()).getSupportFragmentManager().registerFragmentLifecycleCallbacks(fragmentLifecycleCallbacks, false);
        } else {
            fragmentManager.registerFragmentLifecycleCallbacks(fragmentLifecycleCallbacks, false);
        }
    }

    public static void b(FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdf1533e", new Object[]{fragmentLifecycleCallbacks});
            return;
        }
        CopyOnWriteArrayList<FragmentManager.FragmentLifecycleCallbacks> copyOnWriteArrayList = f;
        if (copyOnWriteArrayList == null) {
            return;
        }
        copyOnWriteArrayList.remove(fragmentLifecycleCallbacks);
        TBFragmentTabHost tBFragmentTabHost = e;
        if (tBFragmentTabHost == null || !(tBFragmentTabHost.getContext() instanceof FragmentActivity)) {
            return;
        }
        FragmentManager fragmentManager = e.getFragmentManager();
        if (fragmentManager == null) {
            ((FragmentActivity) e.getContext()).getSupportFragmentManager().unregisterFragmentLifecycleCallbacks(fragmentLifecycleCallbacks);
        } else {
            fragmentManager.unregisterFragmentLifecycleCallbacks(fragmentLifecycleCallbacks);
        }
    }

    public static void a(com.taobao.tao.navigation.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55e3eb90", new Object[]{dVar});
            return;
        }
        if (g == null) {
            g = new CopyOnWriteArrayList<>();
        }
        g.add(dVar);
    }

    public static void b(com.taobao.tao.navigation.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9303afaf", new Object[]{dVar});
            return;
        }
        CopyOnWriteArrayList<com.taobao.tao.navigation.d> copyOnWriteArrayList = g;
        if (copyOnWriteArrayList == null) {
            return;
        }
        copyOnWriteArrayList.remove(dVar);
    }

    @Deprecated
    public static void a(int i2, ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43208395", new Object[]{new Integer(i2), imageView});
        } else if (!com.taobao.tao.navigation.f.f()) {
        } else {
            omr.a("old_set_animation_view_called", omn.a(i2));
        }
    }

    private static boolean b(int i2, View view, boolean z) {
        NavigationTabIndicatorView tabViewAtIndex;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13291f80", new Object[]{new Integer(i2), view, new Boolean(z)})).booleanValue();
        }
        TBFragmentTabHost tBFragmentTabHost = e;
        if (tBFragmentTabHost == null || (tabViewAtIndex = tBFragmentTabHost.getTabViewAtIndex(i2)) == null) {
            return false;
        }
        tabViewAtIndex.setForegroundView(view, z);
        return true;
    }

    public static void a(int i2, h hVar) {
        NavigationTabIndicatorView tabViewAtIndex;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbdc26b9", new Object[]{new Integer(i2), hVar});
            return;
        }
        TBFragmentTabHost tBFragmentTabHost = e;
        if (tBFragmentTabHost == null || (tabViewAtIndex = tBFragmentTabHost.getTabViewAtIndex(i2)) == null) {
            return;
        }
        tabViewAtIndex.setNavigationTabListener(hVar);
    }

    public static ArrayList<String> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("485f2749", new Object[0]);
        }
        if (d == null) {
            d = new ArrayList<>();
        }
        if (d.size() <= 0 || d.size() != e().size()) {
            d.clear();
            Iterator<g> it = e().iterator();
            while (it.hasNext()) {
                d.add(it.next().k());
            }
        }
        return d;
    }

    public static void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[0]);
        } else {
            p();
        }
    }

    public static void c(int i2, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("898d31dc", new Object[]{new Integer(i2), gVar});
        } else if (com.taobao.tao.navigation.f.b()) {
        } else {
            b bVar = p;
            if (bVar == null) {
                TLog.loge(com.taobao.tao.navigation.a.a(), "Navigation", "update Item And Cache failed; styleUpdateCalledListener is null;");
            } else if (gVar == null) {
                TLog.loge(com.taobao.tao.navigation.a.a(), "Navigation", "update Item And Cache failed; tab is null;");
            } else {
                bVar.a(i2, gVar);
                String a2 = com.taobao.tao.navigation.a.a();
                TLog.loge(a2, "Navigation", "update Item And Cache index: " + i2 + " title:" + gVar.c());
            }
        }
    }

    public static void d(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{new Integer(i2)});
        } else if (com.taobao.tao.navigation.f.b()) {
        } else {
            b bVar = p;
            if (bVar == null) {
                TLog.loge(com.taobao.tao.navigation.a.a(), "Navigation", "update Item And Cache failed; styleUpdateCalledListener is null;");
                return;
            }
            bVar.a(i2, null);
            TLog.loge(com.taobao.tao.navigation.a.a(), "Navigation", "reset Item Cache");
        }
    }

    private static void e(int i2, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("573eb15e", new Object[]{new Integer(i2), gVar});
            return;
        }
        TBFragmentTabHost tBFragmentTabHost = e;
        if (tBFragmentTabHost == null) {
            TLog.loge(com.taobao.tao.navigation.a.a(), "Navigation", "update certain tab failed, sFragmentTabHost is null");
            return;
        }
        TabWidget tabWidget = tBFragmentTabHost.getTabWidget();
        if (tabWidget == null) {
            TLog.loge(com.taobao.tao.navigation.a.a(), "Navigation", "update certain tab failed, tabWidget is null");
            return;
        }
        NavigationTabIndicatorView navigationTabIndicatorView = (NavigationTabIndicatorView) tabWidget.getChildTabViewAt(i2);
        if (navigationTabIndicatorView == null) {
            TLog.loge(com.taobao.tao.navigation.a.a(), "Navigation", "update certain tab failed, indicatorView is null");
            return;
        }
        navigationTabIndicatorView.updateStyle(gVar, c, navigationTabIndicatorView.getSelected(), true);
        String a2 = com.taobao.tao.navigation.a.a();
        TLog.loge(a2, "Navigation", "update Certain Tab, index:" + i2);
    }

    public static synchronized void d(int i2, g gVar) {
        synchronized (e.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f065f19d", new Object[]{new Integer(i2), gVar});
                return;
            }
            if (f20801a == null || f20801a.size() <= 0) {
                d();
            }
            if (f20801a == null || f20801a.size() <= 0) {
                TLog.loge(com.taobao.tao.navigation.a.a(), "Navigation", "Update message count failed for initialization error");
            }
            if (i2 >= 0 && i2 <= f20801a.size()) {
                if (!gVar.q()) {
                    TLog.loge(com.taobao.tao.navigation.a.a(), "Navigation", "Update navigation tab failed!");
                    return;
                }
                f20801a.set(i2, gVar);
                d = null;
                e(i2, gVar);
                return;
            }
            TLog.loge(com.taobao.tao.navigation.a.a(), "Navigation", "Update message count failed for index out of range!");
        }
    }

    public static void a(Integer num, Integer num2, Integer num3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f01e86f", new Object[]{num, num2, num3});
            return;
        }
        TBFragmentTabHost tBFragmentTabHost = e;
        if (tBFragmentTabHost == null) {
            TLog.loge(com.taobao.tao.navigation.a.a(), "Navigation", "setTabsColorFilter failed, sFragmentTabHost is null");
        } else {
            tBFragmentTabHost.setTabsColorFilter(num, num2, num3);
        }
    }

    public static void a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdec50f", new Object[]{num});
            return;
        }
        if (i == null) {
            i = new HashMap<>(f20801a.size());
        }
        for (int i2 = 0; i2 < f20801a.size(); i2++) {
            i.put(String.valueOf(i2), num);
        }
    }

    public static boolean a(boolean z) {
        TBFragmentTabHost c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        if (!com.taobao.tao.navigation.f.c() || (c2 = c()) == null) {
            return false;
        }
        return c2.hideNavigationAnimate(z);
    }

    public static boolean b(boolean z) {
        TBFragmentTabHost c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d6ac0f", new Object[]{new Boolean(z)})).booleanValue();
        }
        if (!com.taobao.tao.navigation.f.c() || (c2 = c()) == null) {
            return false;
        }
        return c2.hideNavigation(z);
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue();
        }
        TBFragmentTabHost c2 = c();
        if (c2 != null) {
            return c2.isNavigationVisible();
        }
        return false;
    }

    public static void a(omm ommVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8316a29", new Object[]{ommVar});
        } else {
            q = ommVar;
        }
    }

    public static boolean a(String str, NavigationTabMsgMode navigationTabMsgMode, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5688ad1", new Object[]{str, navigationTabMsgMode, str2})).booleanValue();
        }
        omm ommVar = q;
        if (ommVar == null) {
            String a2 = com.taobao.tao.navigation.a.a();
            TLog.loge(a2, "Navigation", "onCommonMarkUpdated failed: tabHostStyleChangeListener is null. " + str + " " + navigationTabMsgMode + " " + str2);
            return false;
        }
        return ommVar.a(str, navigationTabMsgMode, str2);
    }

    public static boolean a(String str, String str2, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d49de1da", new Object[]{str, str2, view})).booleanValue();
        }
        omm ommVar = q;
        if (ommVar == null) {
            String a2 = com.taobao.tao.navigation.a.a();
            TLog.loge(a2, "Navigation", "onAlienEffectUpdated failed: tabHostStyleChangeListener is null" + str);
            return false;
        }
        return ommVar.a(str, str2, view, true);
    }

    public static boolean a(String str, String str2, View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf1f0bc2", new Object[]{str, str2, view, new Boolean(z)})).booleanValue();
        }
        omm ommVar = q;
        if (ommVar == null) {
            String a2 = com.taobao.tao.navigation.a.a();
            TLog.loge(a2, "Navigation", "onAlienEffectUpdated failed: tabHostStyleChangeListener is null" + str + " " + z);
            return false;
        }
        return ommVar.a(str, str2, view, z);
    }

    /* loaded from: classes8.dex */
    public static class c implements omm {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.omm
        public boolean a(String str, NavigationTabMsgMode navigationTabMsgMode, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f5688ad1", new Object[]{this, str, navigationTabMsgMode, str2})).booleanValue() : e.b(omn.a(str), navigationTabMsgMode, str2);
        }

        @Override // tb.omm
        public boolean a(String str, String str2, View view, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bf1f0bc2", new Object[]{this, str, str2, view, new Boolean(z)})).booleanValue();
            }
            int a2 = omn.a(str);
            if (a2 == -1) {
                String a3 = com.taobao.tao.navigation.a.a();
                TLog.loge(a3, "Navigation", "Update message count failed for index out of range!" + str);
                return false;
            }
            return e.a(a2, view, z);
        }
    }

    /* loaded from: classes8.dex */
    public static class a implements omm {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final lyt f20802a;

        public a(lyt lytVar) {
            this.f20802a = lytVar;
        }

        @Override // tb.omm
        public boolean a(String str, NavigationTabMsgMode navigationTabMsgMode, String str2) {
            boolean a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f5688ad1", new Object[]{this, str, navigationTabMsgMode, str2})).booleanValue();
            }
            if (e.e == null) {
                TLog.loge(com.taobao.tao.navigation.a.a(), "Navigation", "update certain tab common mark failed, sFragmentTabHost is null" + str + " " + navigationTabMsgMode + " " + str2);
                return false;
            }
            if (e.f20801a == null) {
                e.d();
            }
            if (e.f20801a == null) {
                TLog.loge(com.taobao.tao.navigation.a.a(), "Navigation", "Update message count failed for sNavigationTabs is null");
                return false;
            }
            int a3 = omn.a(str);
            if (a3 == -1 || a3 >= e.f20801a.size()) {
                TLog.loge(com.taobao.tao.navigation.a.a(), "Navigation", "Update message count failed for index out of range!" + str);
                return false;
            }
            if (navigationTabMsgMode == NavigationTabMsgMode.USE_LAST) {
                navigationTabMsgMode = e.f20801a.get(a3).l();
            }
            Pair<JSONObject, JSONObject> a4 = this.f20802a.a(str, navigationTabMsgMode, str2);
            if (a4 == null) {
                TLog.loge(com.taobao.tao.navigation.a.a(), "Navigation", "Update message count failed for message format error!" + str + " " + navigationTabMsgMode + " " + str2);
                return false;
            }
            JSONObject jSONObject = (JSONObject) a4.second;
            String str3 = null;
            if (jSONObject == null || jSONObject.isEmpty()) {
                jSONObject = null;
            }
            if (com.taobao.tao.navigation.f.h()) {
                NavigationTabIndicatorView tabViewAtIndex = e.e.getTabViewAtIndex(a3);
                if (tabViewAtIndex == null) {
                    TLog.loge(com.taobao.tao.navigation.a.a(), "Navigation", "Update message count failed for tabView is null");
                    return false;
                }
                if (e.m() != null && e.m().containsKey(String.valueOf(a3))) {
                    tabViewAtIndex.updateMessageViewColor((Integer) e.m().get(String.valueOf(a3)));
                }
                tabViewAtIndex.updateMessage(navigationTabMsgMode, str2, jSONObject == null ? null : jSONObject.toJSONString());
                a2 = true;
            } else {
                a2 = e.a(a3, navigationTabMsgMode, str2, jSONObject == null ? null : jSONObject.toJSONString());
            }
            if (a2 && navigationTabMsgMode != NavigationTabMsgMode.NONE && str2 != null && !"0".equals(str2)) {
                String str4 = (navigationTabMsgMode == NavigationTabMsgMode.DEFAULT || navigationTabMsgMode == NavigationTabMsgMode.GUARDIAN_NUM) ? UiUtil.INPUT_TYPE_VALUE_NUM : "text";
                if (jSONObject != null) {
                    str3 = jSONObject.getString("augeTrackInfo");
                }
                k.a(str, NavigationTabConstraints.MATERIAL_TYPE_COMMON_MARK, str4, str3);
            }
            return true;
        }

        @Override // tb.omm
        public boolean a(String str, String str2, View view, boolean z) {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bf1f0bc2", new Object[]{this, str, str2, view, new Boolean(z)})).booleanValue();
            }
            int a2 = omn.a(str);
            if (a2 == -1) {
                TLog.loge(com.taobao.tao.navigation.a.a(), "Navigation", "Update alien effect failed for index out of range!" + str);
                return false;
            } else if (e.e == null) {
                TLog.loge(com.taobao.tao.navigation.a.a(), "Navigation", "Update alien effect failed for sFragmentTabHost is null");
                return false;
            } else {
                String str3 = null;
                if (view != null && !"placeholder".equals(str2)) {
                    Pair<JSONObject, JSONObject> a3 = this.f20802a.a(str, NavigationTabConstraints.MATERIAL_TYPE_ALIEN_EFFECTIVE, str2);
                    if (a3 == null) {
                        TLog.loge(com.taobao.tao.navigation.a.a(), "Navigation", "Update alien effect failed for alienEffect is limited!" + str + " " + str2);
                        return false;
                    }
                    jSONObject = (JSONObject) a3.second;
                    k.a(str, NavigationTabConstraints.MATERIAL_TYPE_ALIEN_EFFECTIVE, str2, jSONObject.getString("augeTrackInfo"));
                } else {
                    if ("placeholder".equals(str2)) {
                        TLog.loge(com.taobao.tao.navigation.a.a(), "Navigation", "Update alien effect direct for alienEffect is placeholder!" + str);
                    }
                    jSONObject = null;
                }
                NavigationTabIndicatorView tabViewAtIndex = e.e.getTabViewAtIndex(a2);
                if (tabViewAtIndex == null) {
                    return false;
                }
                if (jSONObject == null || jSONObject.isEmpty()) {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    str3 = jSONObject.toJSONString();
                }
                tabViewAtIndex.setForegroundView(view, z, str3);
                return true;
            }
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
            return;
        }
        for (see seeVar : r) {
            StringUtils.equals(seeVar.a(), str);
        }
    }

    public static void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d235e2d", new Object[]{fVar});
        } else {
            s = fVar;
        }
    }

    public static void a(String str, int i2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed88149b", new Object[]{str, new Integer(i2), str2});
        } else if (s == null) {
        } else {
            NavigationStatus.a aVar = new NavigationStatus.a();
            aVar.b = str;
            aVar.f20814a = i2;
            aVar.c = NavigationTabConstraints.MATERIAL_TYPE_ALIEN_EFFECTIVE;
            aVar.d = str2;
            s.a(aVar);
        }
    }

    public static void b(String str, int i2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4ed49ba", new Object[]{str, new Integer(i2), str2});
        } else if (s == null) {
        } else {
            NavigationStatus.a aVar = new NavigationStatus.a();
            aVar.b = str;
            aVar.f20814a = i2;
            aVar.c = NavigationTabConstraints.MATERIAL_TYPE_COMMON_MARK;
            aVar.d = str2;
            s.a(aVar);
        }
    }
}
