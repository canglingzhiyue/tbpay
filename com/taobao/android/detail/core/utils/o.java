package com.taobao.android.detail.core.utils;

import android.text.TextUtils;
import anetwork.channel.statist.StatisticData;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.mtop.util.MtopStatistics;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, a> f9941a;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f9942a;
        public MtopStatistics b;
        public long c;
        public long d;
        public long e;

        static {
            kge.a(487470077);
        }
    }

    static {
        kge.a(582642557);
        f9941a = new ConcurrentHashMap();
        emu.a("com.taobao.android.detail.core.utils.MtopStatsUtils");
    }

    public static long f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("669e4a6b", new Object[]{str})).longValue();
        }
        a e = e(str);
        if (e == null) {
            i.a("MtopStatsUtils", "mtopInfo is null.");
            return 0L;
        }
        return e.e;
    }

    public static void d(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75285d6f", new Object[]{str, new Long(j)});
        } else if (TextUtils.isEmpty(str)) {
            i.a("MtopStatsUtils", "intentFlag为空");
        } else {
            a aVar = f9941a.get(str);
            if (aVar == null) {
                aVar = new a();
            }
            aVar.e = j;
            f9941a.put(str, aVar);
        }
    }

    public static void c(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7926ce90", new Object[]{str, new Long(j)});
        } else if (TextUtils.isEmpty(str)) {
            i.a("MtopStatsUtils", "intentFlag为空");
        } else {
            a aVar = f9941a.get(str);
            if (aVar == null) {
                aVar = new a();
            }
            aVar.d = j;
            f9941a.put(str, aVar);
        }
    }

    public static long a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c26", new Object[]{str})).longValue();
        }
        a e = e(str);
        if (e == null) {
            i.a("MtopStatsUtils", "mtopInfo is null.");
            return 0L;
        }
        return e.f9942a;
    }

    public static void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{str, new Long(j)});
        } else if (TextUtils.isEmpty(str)) {
            i.a("MtopStatsUtils", "intentFlag为空");
        } else {
            a aVar = f9941a.get(str);
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f9942a = j;
            f9941a.put(str, aVar);
        }
    }

    public static void b(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d253fb1", new Object[]{str, new Long(j)});
        } else if (TextUtils.isEmpty(str)) {
            i.a("MtopStatsUtils", "intentFlag为空");
        } else {
            a aVar = f9941a.get(str);
            if (aVar == null) {
                aVar = new a();
            }
            aVar.c = j;
            f9941a.put(str, aVar);
        }
    }

    public static a e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("1fc98086", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            i.a("MtopStatsUtils", "intentFlag为空");
            return null;
        }
        return f9941a.get(str);
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            f9941a.remove(str);
        }
    }

    public static void a(String str, MtopStatistics mtopStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea322bd3", new Object[]{str, mtopStatistics});
        } else if (TextUtils.isEmpty(str)) {
            i.a("MtopStatsUtils", "intentFlag为空");
        } else {
            a aVar = f9941a.get(str);
            if (aVar == null) {
                aVar = new a();
            }
            aVar.b = mtopStatistics;
            f9941a.put(str, aVar);
        }
    }

    public static MtopStatistics c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopStatistics) ipChange.ipc$dispatch("f5b4e283", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        a aVar = f9941a.get(str);
        if (aVar == null) {
            i.a("MtopStatsUtils", "mtopInfo is null.");
            return null;
        }
        return aVar.b;
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            a aVar = f9941a.get(str);
            if (aVar == null) {
                i.a("MtopStatsUtils", "mtopInfo is null.");
                return;
            }
            aVar.b = null;
            f9941a.put(str, aVar);
        }
    }

    public static Map<String, String> a(MtopStatistics mtopStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d3222cfe", new Object[]{mtopStatistics});
        }
        HashMap hashMap = new HashMap();
        if (mtopStatistics == null) {
            return hashMap;
        }
        hashMap.put("mtopAllTime", String.valueOf(mtopStatistics.allTime));
        hashMap.put("mtopRequestPocTime", String.valueOf(mtopStatistics.requestPocTime));
        hashMap.put("mtopCallbackPocTime", String.valueOf(mtopStatistics.callbackPocTime));
        hashMap.put("networkTotalTime", String.valueOf(mtopStatistics.netTotalTime));
        StatisticData netStat = mtopStatistics.getNetStat();
        if (netStat != null) {
            hashMap.put("network_rtt", String.valueOf(netStat.oneWayTime_ANet));
            hashMap.put("serverRT", String.valueOf(netStat.serverRT));
        }
        return hashMap;
    }
}
