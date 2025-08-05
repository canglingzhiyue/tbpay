package com.taobao.artc.utils;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.utils.h;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kan;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static AtomicBoolean f16384a;
    private static String b;
    private static String c;
    private static String d;

    static {
        kge.a(-207864391);
        f16384a = new AtomicBoolean(true);
        b = null;
        c = null;
        d = null;
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        long time = new Date().getTime();
        String str3 = c;
        if (str3 != null) {
            hashMap.put("uid", str3);
        }
        String str4 = d;
        if (str4 != null) {
            hashMap.put(com.taobao.tao.messagekit.base.network.a.KEY_DID, str4);
        }
        String str5 = b;
        if (str5 != null) {
            hashMap.put("cid", str5);
        }
        hashMap.put(h.MTP, "api");
        hashMap.put("prm", str);
        hashMap.put("time", String.valueOf(time));
        kan.a("ArtcInfo", JSON.toJSONString(hashMap));
        if (!f16384a.get()) {
            return;
        }
        a("Page_ARTC", 2101, str2, hashMap);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            a(str, "api");
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
            return;
        }
        ArtcLog.i(str, str2, new Object[0]);
        a(str2, "api");
    }

    public static void a(String str, int i, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82709d8a", new Object[]{str, new Integer(i), str2, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, i, str2, "", "", map).build());
        }
    }
}
