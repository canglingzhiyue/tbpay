package com.taobao.trtc.utils;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.model.NameSpaceDO;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;
import tb.kan;
import tb.kge;
import tb.riy;

/* loaded from: classes9.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MTP = "mtp";
    public static final String MTP_PERF = "perf";
    public static final String POINT_INFO = "ArtcInfo";

    /* renamed from: a  reason: collision with root package name */
    private static c f23192a;

    static {
        kge.a(279169977);
        f23192a = new c();
    }

    public static void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("413be803", new Object[]{cVar});
        } else {
            f23192a = cVar;
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            c("api", a(f23192a.f, str));
        }
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        a(hashMap);
        hashMap.put("channelId", str2);
        hashMap.put(MTP, "api");
        hashMap.put("prm", str);
        a("api", hashMap);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        b(str2);
        TrtcLog.d(str + "-ut", str2);
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
            return;
        }
        b(str2);
        TrtcLog.a(str, str2);
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        c("api", a(f23192a.f, NameSpaceDO.TYPE_CUSTOM, "trace", riy.BLOCK_START_STR + str + riy.BLOCK_END_STR));
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        a(hashMap);
        hashMap.put(MTP, str);
        hashMap.put("prm", str2);
        a(str, hashMap);
    }

    public static void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{str, map});
            return;
        }
        kan.a("ArtcInfo", JSON.toJSONString(map));
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_ARTC", 2101, str, "", "", map).build());
    }

    private static void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
            return;
        }
        map.put("currentTime", String.valueOf(System.currentTimeMillis()));
        c cVar = f23192a;
        if (cVar == null) {
            return;
        }
        map.put("userId", cVar.b);
        map.put("deviceId", f23192a.c);
        map.put("bizId", f23192a.f23186a);
        map.put("appKey", f23192a.d);
        map.put("sdkVersion", f23192a.e);
        map.put("utType", "grtn");
    }

    public static String a(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2583e9f7", new Object[]{objArr});
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < objArr.length; i++) {
            sb.append(objArr[i]);
            if (i != objArr.length - 1) {
                sb.append("^^^");
            }
        }
        return sb.toString();
    }
}
