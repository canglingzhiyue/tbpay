package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.l;
import com.taobao.android.home.component.utils.e;
import com.taobao.statistic.TBS;
import com.taobao.tao.TrackBuried;
import com.taobao.tao.flexbox.layoutmanager.view.b;
import com.taobao.tao.homepage.launcher.g;
import com.taobao.tao.util.Constants;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class las {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-239071506);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            TBS.Ext.commitEvent("Page_UT", 1012, "Background", "Initiative", (Object) null);
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            TBS.Ext.commitEvent("Page_UT", 1012, b.PULL_INIT, "Initiative", (Object) null);
        }
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            a(context, "Page_Home");
        }
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
            return;
        }
        try {
            e.e("PathTracker", "pageName : " + str);
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(context, str);
        } catch (Exception unused) {
        }
    }

    public static void a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258fda74", new Object[]{context, new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("isLowNetwork", String.valueOf(z ? 1 : 0));
        kss.a(context, hashMap);
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
            return;
        }
        HashMap hashMap = new HashMap();
        if (context != null && context.getResources() != null && context.getResources().getConfiguration() != null) {
            hashMap.put("fontSize", String.valueOf(context.getResources().getConfiguration().fontScale));
        }
        lau.a().a(hashMap);
        kss.a(context, hashMap);
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else {
            TBS.Ext.commitEvent("Page_Home", 30001, "Show", (Object) null, (Object) null);
        }
    }

    public static void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{obj});
            return;
        }
        try {
            e.b("PathTracker", "pageAppear````````````````````");
            UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(obj);
        } catch (Exception unused) {
        }
    }

    public static void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{obj});
            return;
        }
        try {
            e.b("PathTracker", "pageDisAppear````````````````````");
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(obj);
        } catch (Exception unused) {
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
            return;
        }
        TBS.Adv.putKvs("ad_word_show", null);
        TBS.Adv.unKeepKvs("com.taobao.search.SearchListActivity", "ad_word_show");
        TBS.Adv.unKeepKvs("com.taobao.tao.RecommandShopActivity", "ad_word_show");
        TBS.Adv.unKeepKvs("com.taobao.tao.detail.DetailActivity", "ad_word_show");
        TBS.Adv.putKvs(Constants.KEY_SEARCH_KEYWORD, null);
        TBS.Adv.unKeepKvs("com.taobao.search.SearchListActivity", Constants.KEY_SEARCH_KEYWORD);
        TBS.Adv.unKeepKvs("com.taobao.tao.RecommandShopActivity", Constants.KEY_SEARCH_KEYWORD);
        TBS.Adv.unKeepKvs("com.taobao.tao.detail.DetailActivity", Constants.KEY_SEARCH_KEYWORD);
        TBS.Adv.putKvs("seller_id", null);
        TBS.Adv.unKeepKvs("com.taobao.tao.detail.DetailActivity", "seller_id");
        TBS.Adv.putKvs("shop_id", null);
        TBS.Adv.unKeepKvs("com.taobao.tao.detail.DetailActivity", "shop_id");
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
            return;
        }
        TrackBuried.list_Param = "";
        TrackBuried.list_Type = "";
        TrackBuried.list_CurPage = "Page_Home";
        TrackBuried.list_refer = "Page_Home";
        TrackBuried.carrier = "";
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
            return;
        }
        TrackBuried.list_refer = "Page_Home";
        TrackBuried.list_CurPage = "Page_Home";
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[0]);
            return;
        }
        try {
            UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty("x_region_info", l.b(g.a()).editionCode);
        } catch (Exception unused) {
        }
    }

    public static void a(String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc66733", new Object[]{str, map, map2, map3});
            return;
        }
        try {
            UTAnalytics.getInstance().getUTSceneTracker().beginScene(str, map, map2, map3);
        } catch (Exception e) {
            e.a("PathTracker", "beginScene error", e);
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        try {
            UTAnalytics.getInstance().getUTSceneTracker().endScene(str);
        } catch (Exception e) {
            e.a("PathTracker", "endScene error", e);
        }
    }
}
