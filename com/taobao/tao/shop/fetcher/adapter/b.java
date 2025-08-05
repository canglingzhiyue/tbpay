package com.taobao.tao.shop.fetcher.adapter;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.accessibility.AccessibilityManager;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.g;
import com.taobao.tao.shop.e;
import com.taobao.tao.shop.rule.f;
import java.util.Arrays;
import java.util.List;
import tb.kge;
import tb.ouu;
import tv.danmaku.ijk.media.player.MonitorMediaPlayer;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final b f21081a;

    static {
        kge.a(-2126733281);
        f21081a = new b();
    }

    private b() {
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("71bf8918", new Object[0]) : f21081a;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : a(MonitorMediaPlayer.ABTEST_USE_CACHE_ENABLE, true);
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : a("memoryCacheEnabled", true);
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : a("md5", "");
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : a("cdnUrl", "");
    }

    public long f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e1", new Object[]{this})).longValue() : a("localCacheValidMinute", 60L);
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[]{this})).booleanValue() : a("enablePostRequest", true);
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : a("enableUTParamDelete", true);
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : a("accessibility_SWITCH", true);
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : a("delete_we_app_switch", true);
    }

    public long j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe5", new Object[]{this})).longValue() : a("localCacheValidMinute_mini_app", 60L);
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : a("useHandlerThreadWorker", true);
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : a("enableShopDomainKeyIntercept", true);
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : a("enableNotRemoveShopNav", true);
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue();
        }
        if (h() && a((Context) e.b)) {
            return true;
        }
        return a("miniappDowngrade", false);
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : a("enableABTest", false);
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : a("enableRouteCycleFix", true);
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue() : a("enableNewTaoKeApi", true);
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue() : a("enableAsyncWriteCache", true);
    }

    public List<String> s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("abd71b8d", new Object[]{this});
        }
        String a2 = a("private_window_whitelist", "");
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        String[] split = a2.split(",");
        if (split.length <= 0) {
            return null;
        }
        return Arrays.asList(split);
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue() : a("private_window_enabled", true);
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[]{this})).booleanValue() : a("parallel_render_enabled", true);
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[]{this})).booleanValue() : a("local_js_enabled", true);
    }

    private long a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{this, str, new Long(j)})).longValue();
        }
        String a2 = a(str, String.valueOf(j));
        try {
            return Long.parseLong(a2);
        } catch (Throwable unused) {
            ouu.b("orange key=" + str + " might be number but it is " + a2);
            return j;
        }
    }

    private boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, str, new Boolean(z)})).booleanValue() : Boolean.valueOf(a(str, Boolean.toString(z))).booleanValue();
    }

    private String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2}) : OrangeConfig.getInstance().getConfig("shop_router", str, str2);
    }

    public JSONArray w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("d98df900", new Object[]{this}) : a("shopRouterDomainBlackList");
    }

    private JSONArray a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("e47bc7cc", new Object[]{this, str});
        }
        JSONArray jSONArray = new JSONArray();
        String a2 = a(str, (String) null);
        if (TextUtils.isEmpty(a2)) {
            return jSONArray;
        }
        try {
            JSONArray parseArray = JSONArray.parseArray(a2);
            return parseArray == null ? jSONArray : parseArray;
        } catch (Exception e) {
            e.printStackTrace();
            return jSONArray;
        }
    }

    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
            return;
        }
        final String packageName = application == null ? "" : application.getPackageName();
        OrangeConfig.getInstance().registerListener(new String[]{"shop_router"}, new g() { // from class: com.taobao.tao.shop.fetcher.adapter.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.g
            public void onConfigUpdate(String str, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
                    return;
                }
                Log.e("ShopRouterInit", "orange change : " + str + ", pkgName = " + packageName);
                if (!"shop_router".equals(str) || !packageName.contains("com.taobao.taobao")) {
                    return;
                }
                f.a().b();
            }
        });
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        try {
            return b(context);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean b(Context context) throws RuntimeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }
}
