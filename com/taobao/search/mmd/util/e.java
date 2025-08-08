package com.taobao.search.mmd.util;

import android.support.v4.util.ArrayMap;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.r;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import com.ut.mini.l;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.noa;

/* loaded from: classes7.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1192090327);
    }

    @Deprecated
    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            a(str, (ArrayMap<String, String>) null, (String) null);
        }
    }

    @Deprecated
    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            a(str, (ArrayMap<String, String>) null, str2);
        }
    }

    @Deprecated
    public static void a(String str, ArrayMap<String, String> arrayMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("915eb462", new Object[]{str, arrayMap});
        } else {
            a(str, arrayMap, (String) null);
        }
    }

    @Deprecated
    public static void a(String str, ArrayMap<String, String> arrayMap, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("409849ac", new Object[]{str, arrayMap, str2});
        } else {
            a((String) null, str, arrayMap, str2);
        }
    }

    @Deprecated
    public static void a(String str, String str2, ArrayMap<String, String> arrayMap, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9b259f6", new Object[]{str, str2, arrayMap, str3});
            return;
        }
        if (arrayMap == null) {
            arrayMap = new ArrayMap<>();
        }
        if (!StringUtils.isEmpty(str3)) {
            arrayMap.put("spm", str3);
        }
        String c = com.taobao.search.rainbow.a.c();
        arrayMap.put("rainbow", c);
        arrayMap.put("encode_rainbow", r.c(c));
        StringBuilder sb = new StringBuilder();
        int size = arrayMap.size();
        for (int i = 0; i < size; i++) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(arrayMap.keyAt(i));
            sb.append("=");
            sb.append(arrayMap.valueAt(i));
        }
        if (StringUtils.isEmpty(str)) {
            TBS.Adv.ctrlClicked(CT.Button, str2, sb.toString());
        } else {
            TBS.Adv.ctrlClicked(str, CT.Button, str2, sb.toString());
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else {
            a(str, (Map<String, String>) null);
        }
    }

    public static void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{str, map});
            return;
        }
        String currentPageName = l.getInstance().getCurrentPageName();
        if (currentPageName == null) {
            currentPageName = "";
        }
        a(currentPageName, str, map);
    }

    public static void a(String str, String str2, Map<String, String> map) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{str, str2, map});
            return;
        }
        if (map instanceof HashMap) {
            hashMap = map;
        } else {
            HashMap hashMap2 = new HashMap();
            if (map != null) {
                hashMap2.putAll(map);
            }
            hashMap = hashMap2;
        }
        String c = com.taobao.search.rainbow.a.c();
        hashMap.put("rainbow", c);
        hashMap.put("encode_rainbow", r.c(c));
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2101, str + "_Button-" + str2, "", "", hashMap).build());
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
        } else {
            b(str, null);
        }
    }

    public static void b(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819a01b2", new Object[]{str, map});
        } else {
            b(l.getInstance().getCurrentPageName(), str, map);
        }
    }

    public static void b(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854c7968", new Object[]{str, str2, map});
            return;
        }
        HashMap hashMap = new HashMap();
        String c = com.taobao.search.rainbow.a.c();
        hashMap.put("rainbow", c);
        hashMap.put("encode_rainbow", r.c(c));
        if (map != null) {
            hashMap.putAll(map);
        }
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2201, str2, "", "", hashMap).build());
    }

    public static void a(String str, String str2, int i, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9077b79e", new Object[]{str, str2, new Integer(i), map});
            return;
        }
        HashMap hashMap = new HashMap();
        String c = com.taobao.search.rainbow.a.c();
        hashMap.put("rainbow", c);
        hashMap.put("encode_rainbow", r.c(c));
        if (map != null) {
            hashMap.putAll(map);
        }
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, i, str2, "", "", hashMap).build());
    }

    public static void c(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8682cc47", new Object[]{str, str2, map});
            return;
        }
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder(str2);
        uTCustomHitBuilder.setEventPage(str);
        HashMap hashMap = new HashMap();
        hashMap.put("sversion", noa.SERVER_VERSION_VALUE);
        if (map != null) {
            hashMap.putAll(map);
        }
        uTCustomHitBuilder.setProperties(hashMap);
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
    }
}
