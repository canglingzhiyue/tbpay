package com.alibaba.android.umbrella.performance;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class UmbrellaPerformanceTracker {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void add(String str, String str2, String str3, long j, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("140830c7", new Object[]{str, str2, str3, new Long(j), map});
        }
    }

    public static void addArgs(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("134b512c", new Object[]{str, str2, map});
        }
    }

    public static void commit(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b212a852", new Object[]{str, str2});
        }
    }

    public static void end(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eac5ec40", new Object[]{str, str2, str3});
        }
    }

    public static void end(String str, String str2, String str3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6df81284", new Object[]{str, str2, str3, new Long(j)});
        }
    }

    public static void end(String str, String str2, String str3, long j, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac29f081", new Object[]{str, str2, str3, new Long(j), map});
        }
    }

    @Deprecated
    public static void register(String str, String str2, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b45822af", new Object[]{str, str2, list});
        }
    }

    public static void start(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba1e6107", new Object[]{str, str2, str3});
        }
    }

    public static void start(String str, String str2, String str3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89ae369d", new Object[]{str, str2, str3, new Long(j)});
        }
    }

    public static void start(String str, String str2, String str3, long j, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7825f748", new Object[]{str, str2, str3, new Long(j), map});
        }
    }

    public static void commitPerformancePoint(String str, String str2, String str3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62be4348", new Object[]{str, str2, str3, new Long(j)});
        } else {
            commitPerformancePoint(str, str2, str3, j, null);
        }
    }

    public static void commitPerformancePoint(String str, String str2, String str3, long j, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfeb9f3d", new Object[]{str, str2, str3, new Long(j), map});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(str3, new Long(j));
        commitPerformancePoint(str, str2, hashMap, map);
    }

    public static void commitPerformancePoint(String str, String str2, Map<String, Long> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77481392", new Object[]{str, str2, map, map2});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || map == null || map.size() <= 0 || com.alibaba.android.umbrella.trace.b.e()) {
        } else {
            if ((!com.alibaba.android.umbrella.trace.b.c() || !com.alibaba.android.umbrella.trace.b.d()) && !com.alibaba.android.umbrella.trace.b.a(str, str2)) {
                return;
            }
            PerformanceEngine.commitPerformancePoint(com.alibaba.android.umbrella.trace.c.a(str, str2, map, map2));
        }
    }
}
