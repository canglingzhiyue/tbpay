package com.taobao.android.livehome.plugin.atype.flexalocal.utils;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.mfm;
import tb.pbt;
import tb.pcw;
import tb.tip;

/* loaded from: classes6.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f14221a;

    static {
        kge.a(1596470322);
        f14221a = g.class.getSimpleName();
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            a(str, new HashMap());
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            a(str, tip.a(str2));
        }
    }

    public static void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{str, map});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            UTHitBuilders.UTControlHitBuilder uTControlHitBuilder = new UTHitBuilders.UTControlHitBuilder("Page_TaobaoLive", "Button-" + str);
            if (map != null && !map.isEmpty()) {
                uTControlHitBuilder.setProperties(map);
            }
            UTAnalytics.getInstance().getDefaultTracker().send(uTControlHitBuilder.build());
            if (!mfm.k()) {
                return;
            }
            pcw pcwVar = pbt.a().f32558a;
            pcwVar.a("HomePage", "Page_TaobaoLive", "Button-" + str, map);
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            b(str, new HashMap());
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            b(str, tip.a(str2));
        }
    }

    public static void b(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819a01b2", new Object[]{str, map});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            map.put("deviceLevel", "" + q.a());
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_TaobaoLive", 2201, str, "", "0", map).build());
            if (!mfm.k()) {
                return;
            }
            pbt.a().f32558a.b("HomePage", "Page_TaobaoLive", str, map);
        }
    }

    public static void c(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2ec9e51", new Object[]{str, map});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            if (map == null) {
                map = new HashMap<>();
            }
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_TaobaoLive", 19999, str, "", "0", map).build());
        }
    }
}
