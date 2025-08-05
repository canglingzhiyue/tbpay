package com.taobao.android.cachecleaner.autoclear.biz;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.CacheCleaner;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizTaskData;
import com.taobao.android.cachecleaner.monitor.info.CacheOverviewInfo;
import com.taobao.application.common.a;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.duz;
import tb.dva;
import tb.dvp;
import tb.dvq;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: com.taobao.android.cachecleaner.autoclear.biz.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0359a {
        @JSONField(name = "id")

        /* renamed from: a  reason: collision with root package name */
        public String f9277a;
        @JSONField(name = "bs")
        public long b;
        @JSONField(name = "as")
        public long c;
        @JSONField(name = "r")
        public boolean d;
        @JSONField(name = "f")
        public boolean e;

        static {
            kge.a(-194434839);
        }
    }

    static {
        kge.a(-474766496);
    }

    public static /* synthetic */ void b(Context context, List list, Map map, CacheOverviewInfo cacheOverviewInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e1afde9", new Object[]{context, list, map, cacheOverviewInfo, str});
        } else {
            d(context, list, map, cacheOverviewInfo, str);
        }
    }

    public static /* synthetic */ void c(Context context, List list, Map map, CacheOverviewInfo cacheOverviewInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ad1582a", new Object[]{context, list, map, cacheOverviewInfo, str});
        } else {
            e(context, list, map, cacheOverviewInfo, str);
        }
    }

    public static void a(final Context context, List<BizTaskData> list, final Map<String, Long> map, final CacheOverviewInfo cacheOverviewInfo, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("164a3a8", new Object[]{context, list, map, cacheOverviewInfo, str});
        } else if (list == null || list.isEmpty()) {
            TLog.loge(CacheCleaner.MODULE, "BizAutoClear", "clearBizCache: quota data is empty.");
        } else {
            ArrayList arrayList = new ArrayList();
            final ArrayList arrayList2 = new ArrayList();
            for (BizTaskData bizTaskData : list) {
                String str2 = bizTaskData.triggerTime;
                char c = 65535;
                int hashCode = str2.hashCode();
                if (hashCode != -1332194002) {
                    if (hashCode != -1109843021) {
                        if (hashCode == -1081415738 && str2.equals(BizTaskData.MANUAL_TIME)) {
                            c = 2;
                        }
                    } else if (str2.equals("launch")) {
                        c = 1;
                    }
                } else if (str2.equals("background")) {
                    c = 0;
                }
                if (c == 0) {
                    arrayList2.add(new dva(context, bizTaskData, str));
                } else if (c == 1 || c == 2) {
                    arrayList.add(new dva(context, bizTaskData, str));
                } else {
                    TLog.loge(CacheCleaner.MODULE, "BizAutoClear", "clearBizCache: unknown trigger time " + bizTaskData.triggerTime);
                }
            }
            if (!arrayList.isEmpty()) {
                e(context, arrayList, map, cacheOverviewInfo, "clean_type_front_" + str);
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            com.taobao.application.common.c.a(new a.b() { // from class: com.taobao.android.cachecleaner.autoclear.biz.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.application.common.IApmEventListener
                public void onEvent(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
                    } else if (i != 1) {
                    } else {
                        com.taobao.application.common.c.b(this);
                        Context context2 = context;
                        List list2 = arrayList2;
                        Map map2 = map;
                        CacheOverviewInfo cacheOverviewInfo2 = cacheOverviewInfo;
                        a.b(context2, list2, map2, cacheOverviewInfo2, "clean_type_back_" + str);
                    }
                }
            });
        }
    }

    private static void d(final Context context, final List<duz> list, final Map<String, Long> map, final CacheOverviewInfo cacheOverviewInfo, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a787b26b", new Object[]{context, list, map, cacheOverviewInfo, str});
        } else {
            com.taobao.android.cachecleaner.autoclear.c.a().a(new Runnable() { // from class: com.taobao.android.cachecleaner.autoclear.biz.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    a.c(context, list, map, cacheOverviewInfo, str);
                    com.taobao.android.cachecleaner.autoclear.c.a().b();
                }
            });
        }
    }

    private static void e(Context context, List<duz> list, Map<String, Long> map, CacheOverviewInfo cacheOverviewInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("343e0cac", new Object[]{context, list, map, cacheOverviewInfo, str});
        } else if (list.isEmpty()) {
            TLog.loge(CacheCleaner.MODULE, "BizAutoClear", "executeCustomTasks: empty task.");
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            dvp.a("clean_start", str, 0L);
            ArrayList arrayList = new ArrayList();
            for (duz duzVar : list) {
                duz.b a2 = duzVar.a(map);
                if (!duz.b.MSG_VERSION_CONDITION_MATCH_FAILED.equals(a2.c()) && !duz.b.MSG_CONDITION_MATCH_FAILED.equals(a2.c())) {
                    arrayList.add(a(context, duzVar, a2, map));
                }
            }
            dvp.a("clean_success", str, System.currentTimeMillis() - currentTimeMillis);
            a(arrayList, cacheOverviewInfo, str);
        }
    }

    private static C0359a a(Context context, duz duzVar, duz.b bVar, Map<String, Long> map) {
        long j;
        long j2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (C0359a) ipChange.ipc$dispatch("79f3901d", new Object[]{context, duzVar, bVar, map});
        }
        C0359a c0359a = new C0359a();
        Map<String, Long> b = duzVar.b();
        long j3 = 0;
        if (b != null) {
            j2 = 0;
            long j4 = 0;
            for (String str : b.keySet()) {
                Long l = map.get(str);
                if (l != null) {
                    j4 += l.longValue();
                }
                j2 += a(dvq.a(context, str), 0) >> 10;
                Long l2 = b.get(str);
                if (l2 != null) {
                    j3 += l2.longValue();
                }
            }
            j = j3;
            j3 = j4;
        } else {
            j = 0;
            j2 = 0;
        }
        c0359a.b = j3;
        c0359a.c = j2;
        if (j2 >= j) {
            z = false;
        }
        c0359a.e = z;
        c0359a.f9277a = duzVar.a();
        c0359a.d = bVar.a();
        return c0359a;
    }

    private static void a(List<C0359a> list, CacheOverviewInfo cacheOverviewInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b774ffad", new Object[]{list, cacheOverviewInfo, str});
            return;
        }
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("storage_monitor");
        uTCustomHitBuilder.setEventPage("biz_cache_clear");
        uTCustomHitBuilder.setProperty("executeDetail", JSON.toJSONString(list));
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
        long j = 0;
        for (C0359a c0359a : list) {
            if (c0359a.b - c0359a.c > 0) {
                j += c0359a.b - c0359a.c;
            }
        }
        if (j <= 0) {
            return;
        }
        cacheOverviewInfo.setTotalUsedSize(cacheOverviewInfo.getTotalUsedSize() - j);
        dvp.a(cacheOverviewInfo, str);
    }

    private static long a(File file, int i) {
        long length;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c85ccef8", new Object[]{file, new Integer(i)})).longValue();
        }
        long j = 0;
        if (file != null && i <= 10) {
            try {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        if (file2.isDirectory()) {
                            length = a(file2, i + 1);
                        } else {
                            length = file2.length();
                        }
                        j += length;
                    }
                }
            } catch (Throwable th) {
                TLog.loge(CacheCleaner.MODULE, "BizAutoClear", "calculateDirSize: with exception " + th);
            }
        }
        return j;
    }
}
