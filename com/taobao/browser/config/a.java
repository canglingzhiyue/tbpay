package com.taobao.browser.config;

import android.taobao.windvane.util.m;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.utils.f;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;
import tb.riy;

/* loaded from: classes6.dex */
public class a implements android.taobao.windvane.config.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ORANGE_GROUP_NAME = "group_common_browser";

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f16770a;
    public static final b commonConfig;
    private final AtomicBoolean b = new AtomicBoolean(false);

    static {
        kge.a(1775724194);
        kge.a(638153698);
        commonConfig = new b();
        f16770a = null;
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("be19454b", new Object[0]);
        }
        if (f16770a == null) {
            synchronized (a.class) {
                if (f16770a == null) {
                    f16770a = new a();
                }
            }
        }
        return f16770a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.b.compareAndSet(false, true)) {
        } else {
            b(android.taobao.windvane.util.b.b("browser_main_config", "common—wv-data"));
        }
    }

    private int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{this, str})).intValue();
        }
        if (StringUtils.isEmpty(str)) {
            return 0;
        }
        JSONObject jSONObject = null;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
        }
        if (jSONObject == null) {
            return 0;
        }
        b bVar = commonConfig;
        bVar.f16771a = jSONObject.optBoolean("fixAfcBug", bVar.f16771a);
        b bVar2 = commonConfig;
        bVar2.b = jSONObject.optBoolean("fixAfcBug2", bVar2.b);
        b bVar3 = commonConfig;
        bVar3.c = jSONObject.optBoolean("fixAfcBugForAll", bVar3.c);
        b bVar4 = commonConfig;
        bVar4.d = jSONObject.optBoolean("fixAfcBugForAll2", bVar4.d);
        b bVar5 = commonConfig;
        bVar5.g = jSONObject.optString("browserFragmentRegex", bVar5.g);
        b bVar6 = commonConfig;
        bVar6.h = jSONObject.optBoolean("enableOldNav", bVar6.h);
        b bVar7 = commonConfig;
        bVar7.e = jSONObject.optBoolean("fixAfcBug3", bVar7.e);
        b bVar8 = commonConfig;
        bVar8.f = jSONObject.optBoolean("fixAfcBug4", bVar8.f);
        b bVar9 = commonConfig;
        bVar9.i = jSONObject.optBoolean("fixCheckToBrowser", bVar9.i);
        b bVar10 = commonConfig;
        bVar10.j = jSONObject.optBoolean("fixMultiPictureChooser", bVar10.j);
        b bVar11 = commonConfig;
        bVar11.k = jSONObject.optBoolean("newShopUrlFilter2", bVar11.k);
        b bVar12 = commonConfig;
        bVar12.l = jSONObject.optBoolean("useACCSService", bVar12.l);
        b bVar13 = commonConfig;
        bVar13.m = jSONObject.optBoolean("__enable_switch_check_mainactivity__", bVar13.m);
        b bVar14 = commonConfig;
        bVar14.n = jSONObject.optBoolean("isFixWeakConnectionRefresh", bVar14.n);
        b bVar15 = commonConfig;
        bVar15.o = jSONObject.optBoolean("enableFeatureMonitor", bVar15.o);
        b bVar16 = commonConfig;
        bVar16.p = jSONObject.optBoolean("enableWebViewInitAsync", bVar16.p);
        b bVar17 = commonConfig;
        bVar17.q = jSONObject.optBoolean("enableDevTools", bVar17.q);
        b bVar18 = commonConfig;
        bVar18.r = jSONObject.optBoolean("__disable_hardware_accelerated_browser__", bVar18.r);
        b bVar19 = commonConfig;
        bVar19.s = jSONObject.optBoolean("__disable_fragment_restore__", bVar19.r);
        b bVar20 = commonConfig;
        bVar20.t = jSONObject.optBoolean("enable_input_file_capture2", bVar20.t);
        b bVar21 = commonConfig;
        bVar21.u = jSONObject.optBoolean("enableNavWithShopUrlFilter", bVar21.u);
        b bVar22 = commonConfig;
        bVar22.v = jSONObject.optBoolean("enableUseSysWebView", bVar22.v);
        b bVar23 = commonConfig;
        bVar23.w = jSONObject.optBoolean("enableFixLoadUrlTwice", bVar23.w);
        b bVar24 = commonConfig;
        bVar24.x = jSONObject.optBoolean("enableAddBrowserCreateTime", bVar24.x);
        b bVar25 = commonConfig;
        bVar25.y = jSONObject.optBoolean("enableSkipVideoFilter", bVar25.y);
        b bVar26 = commonConfig;
        bVar26.z = jSONObject.optBoolean("enableDetachWebViewBeforeDestroy", bVar26.z);
        b bVar27 = commonConfig;
        bVar27.A = jSONObject.optBoolean("enableSkipSplashFragment", bVar27.A);
        return jSONObject.length();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        Map<String, String> a2 = f.a("group_common_browser");
        m.e("BrowserCommonConfig", "group_common_browser map=" + a2);
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : a2.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            jSONObject.put("appVersion", android.taobao.windvane.config.a.a().i());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        BrowserConfigManager.a().a("group_common_browser", jSONObject.toString());
        m.c("WVConfig", "receive name=[group_common_browser]; config=[" + jSONObject.toString() + riy.ARRAY_END_STR);
    }

    @Override // android.taobao.windvane.config.b
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        b(str);
        android.taobao.windvane.util.b.a("browser_main_config", "common—wv-data", str);
    }
}
