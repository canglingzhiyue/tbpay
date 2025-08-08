package com.alibaba.ut.abtest.internal.bucketing;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.evo.internal.bucketing.model.ExperimentV5;
import com.alibaba.evo.internal.database.ExperimentDO;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.internal.database.f;
import com.alibaba.ut.abtest.internal.database.g;
import com.alibaba.ut.abtest.internal.util.h;
import com.alibaba.ut.abtest.internal.util.k;
import com.alibaba.ut.abtest.internal.util.m;
import com.alibaba.ut.abtest.internal.util.n;
import com.alibaba.ut.abtest.internal.util.p;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.bwn;
import tb.cex;
import tb.kge;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static c f4183a;
    private ConcurrentHashMap<String, Set<com.alibaba.ut.abtest.d>> f = new ConcurrentHashMap<>();
    @Deprecated
    private final List<ExperimentV5> g = new CopyOnWriteArrayList();
    private long h = System.currentTimeMillis();
    private final com.alibaba.evo.internal.database.b c = new com.alibaba.evo.internal.database.b();
    private final b b = new b(this.c);
    private final com.alibaba.evo.internal.database.a d = new com.alibaba.evo.internal.database.a();
    private final bwn e = new bwn(this.c);

    static {
        kge.a(1897983028);
    }

    public static /* synthetic */ long a(c cVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d2a2548", new Object[]{cVar, new Long(j)})).longValue();
        }
        cVar.h = j;
        return j;
    }

    public static /* synthetic */ b a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("d8cd260f", new Object[]{cVar}) : cVar.b;
    }

    public static /* synthetic */ com.alibaba.evo.internal.database.b b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.evo.internal.database.b) ipChange.ipc$dispatch("aa71b074", new Object[]{cVar}) : cVar.c;
    }

    private c() {
    }

    public static synchronized c a() {
        synchronized (c.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("dc618e36", new Object[0]);
            }
            if (f4183a == null) {
                f4183a = new c();
            }
            return f4183a;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!cex.a().j().F()) {
        } else {
            this.b.a();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            this.b.b();
        } catch (Throwable th) {
            com.alibaba.ut.abtest.internal.util.b.a("ExperimentManager.loadMemoryCache", th);
        }
        k();
        this.e.a();
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        try {
            g gVar = new g();
            gVar.a(new f("end_time>?", Long.valueOf(m.a())), new f[0]);
            f b = gVar.b();
            ArrayList<T> a2 = this.d.a(null, null, 0, 0, b.a(), b.b());
            if (a2 == 0 || a2.isEmpty()) {
                return;
            }
            Iterator it = a2.iterator();
            while (it.hasNext()) {
                ExperimentV5 a3 = a.a((ExperimentDO) it.next());
                if (a3 != null) {
                    this.b.b(a3);
                    this.g.add(a3);
                }
            }
            h.a("ExperimentManager", "加载Beta实验缓存" + a2.size() + "条");
        } catch (Throwable th) {
            com.alibaba.ut.abtest.internal.util.b.a("ExperimentManager.loadBetaExperimentCache", th);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.b.c();
        }
    }

    public ExperimentV5 a(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExperimentV5) ipChange.ipc$dispatch("24783834", new Object[]{this, new Long(j)}) : this.b.a(j);
    }

    public List<ExperimentV5> a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1cf8f288", new Object[]{this, uri});
        }
        List<ExperimentV5> b = this.b.b(uri);
        if (b != null) {
            a(false);
        }
        return b;
    }

    public ExperimentV5 a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentV5) ipChange.ipc$dispatch("fd6d308a", new Object[]{this, str});
        }
        ExperimentV5 a2 = this.b.a(str);
        if (a2 != null) {
            a(false);
        }
        return a2;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.b.d().isEmpty() || !cex.a().j().G()) {
        } else {
            if (!z && this.b.d().size() < 5 && this.h + 60000 >= System.currentTimeMillis()) {
                return;
            }
            p.a(new Runnable() { // from class: com.alibaba.ut.abtest.internal.bucketing.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        c.b(c.this).a(c.a(c.this).d());
                        c.a(c.this).e();
                        c.a(c.this, System.currentTimeMillis());
                    } catch (Throwable th) {
                        com.alibaba.ut.abtest.internal.util.b.a("ExperimentManager.recordExperimentHitCount", th);
                    }
                }
            });
        }
    }

    public com.alibaba.ut.abtest.internal.bucketing.model.b b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.ut.abtest.internal.bucketing.model.b) ipChange.ipc$dispatch("73c8da92", new Object[]{this, str});
        }
        if (!cex.a().j().F()) {
            return null;
        }
        return this.b.b(str);
    }

    public List<String> c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("eb209513", new Object[]{this, str}) : this.b.c(str);
    }

    public void a(List<ExperimentV5> list, Set<Long> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b962f846", new Object[]{this, list, set});
            return;
        }
        this.b.a(list, set, 1);
        this.e.a(list);
    }

    public Map<Long, ExperimentDO> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d6be2fa1", new Object[]{this});
        }
        Map<Long, ExperimentDO> map = null;
        if (!cex.a().j().G()) {
            return null;
        }
        try {
            map = this.c.b();
            return a(map, this.b.d());
        } catch (Throwable th) {
            com.alibaba.ut.abtest.internal.util.b.a("ExperimentManager.getHitCount", th);
            return map;
        }
    }

    public Map<Long, ExperimentDO> a(Map<Long, ExperimentDO> map, Map<Long, Long> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bc57ffd", new Object[]{this, map, map2});
        }
        if (map2 != null && !map2.isEmpty()) {
            if (map == null) {
                map = new HashMap<>();
            }
            for (Map.Entry<Long, Long> entry : map2.entrySet()) {
                ExperimentDO experimentDO = map.get(entry.getKey());
                if (experimentDO == null) {
                    ExperimentDO experimentDO2 = new ExperimentDO();
                    experimentDO2.setId(entry.getKey().longValue());
                    experimentDO2.setHitCount(entry.getValue().longValue());
                    experimentDO2.setHitLatestTime(System.currentTimeMillis());
                    map.put(Long.valueOf(experimentDO2.getId()), experimentDO2);
                } else {
                    experimentDO.setHitCount(experimentDO.getHitCount() + entry.getValue().longValue());
                    experimentDO.setHitLatestTime(System.currentTimeMillis());
                }
            }
        }
        return map;
    }

    public boolean b(List<ExperimentV5> list, Set<Long> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2da230a9", new Object[]{this, list, set})).booleanValue();
        }
        try {
            com.alibaba.evo.internal.database.b.b(this.c.c().c(), true);
            com.alibaba.evo.internal.database.b.a(this.c.c().c(), true);
        } catch (Throwable th) {
            com.alibaba.ut.abtest.internal.util.b.a("ExperimentManager.dropAndSaveExperimentsToDatabase", th);
        }
        return a(list, set, true);
    }

    public boolean a(List<ExperimentV5> list, Set<Long> set, boolean z) {
        long j;
        ExperimentDO experimentDO;
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72fcc352", new Object[]{this, list, set, new Boolean(z)})).booleanValue();
        }
        Map<Long, ExperimentDO> e = e();
        if (z) {
            g gVar = new g();
            gVar.a(new f("exp_publish_type=?", 2), new f[0]);
            if (set != null && set.size() > 0) {
                gVar.a(new f("release_id NOT IN " + n.a(set), new Object[0]), new f[0]);
            }
            f b = new g().a(new f("exp_publish_type=?", 1), gVar.a(), new f[0]).b();
            this.c.a(b.a(), b.b());
        }
        ArrayList arrayList = new ArrayList();
        for (ExperimentV5 experimentV5 : list) {
            if (!com.alibaba.ut.abtest.internal.util.a.a(experimentV5, set)) {
                long j2 = 0;
                if (e == null || (experimentDO = e.get(Long.valueOf(experimentV5.getId()))) == null) {
                    j = 0;
                } else {
                    j2 = experimentDO.getHitCount();
                    j = experimentDO.getHitLatestTime();
                }
                ExperimentDO a2 = a.a(experimentV5, j2, j);
                if (a2 != null) {
                    arrayList.add(a2);
                    if (arrayList.size() > 10) {
                        if (!a(arrayList)) {
                            z2 = false;
                        }
                        arrayList.clear();
                    }
                } else {
                    h.e("ExperimentManager", "实验对象转换数据存储对象失败，实验ID=" + experimentV5.getId());
                }
            }
        }
        if (!arrayList.isEmpty() && !a(arrayList)) {
            return false;
        }
        return z2;
    }

    public synchronized void a(List<ExperimentV5> list, Set<Long> set, long j, String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57919d88", new Object[]{this, list, set, new Long(j), str});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("待缓存实验数量：");
        sb.append(list == null ? 0 : list.size());
        sb.append(", dataVersion=");
        sb.append(j);
        sb.append(", dataSignature=");
        sb.append(str);
        h.a("ExperimentManager", sb.toString());
        if (list != null && !list.isEmpty()) {
            a(list, set);
            boolean a2 = a(list, set, true);
            z = (a2 || !cex.a().j().B()) ? a2 : b(list, set);
        } else {
            d();
        }
        if (z) {
            c(j);
            f(str);
            b(System.currentTimeMillis());
            this.h = System.currentTimeMillis();
            this.b.e();
        }
    }

    public boolean a(List<ExperimentDO> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c705295d", new Object[]{this, list})).booleanValue();
        }
        try {
            long[] a2 = this.c.a(list);
            if (a2 != null && a2.length != 0 && a2.length == list.size()) {
                if (com.alibaba.ut.abtest.internal.util.c.a(a2, -1L) == -1) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            com.alibaba.ut.abtest.internal.util.b.a("ExperimentManager.safeSaveExperimentToDatabase", e);
            return false;
        }
    }

    public boolean b(List<ExperimentDO> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d39e1ede", new Object[]{this, list})).booleanValue();
        }
        try {
            long[] a2 = this.d.a(list);
            if (a2 != null && a2.length != 0 && a2.length == list.size()) {
                if (com.alibaba.ut.abtest.internal.util.c.a(a2, -1L) == -1) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            com.alibaba.ut.abtest.internal.util.b.a("ExperimentManager.safeSaveBetaExperimentToDatabase", e);
            return false;
        }
    }

    public boolean a(List<ExperimentV5> list, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19a074ce", new Object[]{this, list, new Integer(i)})).booleanValue();
        }
        for (ExperimentV5 experimentV5 : this.g) {
            if (experimentV5 != null && experimentV5.getExpPublishType() == i) {
                this.g.remove(experimentV5);
            }
        }
        this.g.addAll(list);
        this.b.a(list, i);
        f fVar = new f("exp_publish_type=?", Integer.valueOf(i));
        this.d.a(fVar.a(), fVar.b());
        ArrayList arrayList = new ArrayList();
        for (ExperimentV5 experimentV52 : list) {
            arrayList.add(a.a(experimentV52, 0L, 0L));
            if (arrayList.size() > 10) {
                if (!b(arrayList)) {
                    z = false;
                }
                arrayList.clear();
            }
        }
        if (!arrayList.isEmpty() && !b(arrayList)) {
            z = false;
        }
        if (!z) {
            h.f("ExperimentManager", "beta 实验信息保存失败");
        }
        return z;
    }

    public int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.g.size();
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            k.b().b("betaExperimentDataFileMd5", str);
        }
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : k.b().a("betaExperimentDataFileMd5", (String) null);
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : k.b().a("betaExperimentDataSignature", (String) null);
    }

    public long i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2864", new Object[]{this})).longValue() : k.b().a("experimentDataVersionV5", 0L);
    }

    private void c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b489a", new Object[]{this, new Long(j)});
        } else if (j == 0) {
        } else {
            k.b().b("experimentDataVersionV5", j);
        }
    }

    public String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : k.b().a("experimentDataSignatureV5", (String) null);
    }

    @Deprecated
    private void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
        } else {
            k.b().b("experimentDataSignatureV5", str);
        }
    }

    public void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
        } else {
            k.b().c("protocolCompleteSaveTime", j);
        }
    }

    public void a(String str, String str2, com.alibaba.ut.abtest.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c4e002e", new Object[]{this, str, str2, dVar});
        } else if (StringUtils.equals(str, UTABTest.COMPONENT_URI)) {
        } else {
            String a2 = com.alibaba.ut.abtest.internal.util.a.a(str, str2);
            Set<com.alibaba.ut.abtest.d> set = this.f.get(a2);
            synchronized (this) {
                if (set == null) {
                    set = new HashSet<>();
                    this.f.put(a2, set);
                }
                set.add(dVar);
            }
        }
    }

    public void b(String str, String str2, com.alibaba.ut.abtest.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67d884d", new Object[]{this, str, str2, dVar});
        } else if (StringUtils.equals(str, UTABTest.COMPONENT_URI)) {
        } else {
            String a2 = com.alibaba.ut.abtest.internal.util.a.a(str, str2);
            if (dVar == null) {
                this.f.remove(a2);
                return;
            }
            Set<com.alibaba.ut.abtest.d> set = this.f.get(a2);
            if (set == null) {
                return;
            }
            synchronized (this) {
                set.remove(dVar);
            }
        }
    }

    public List<ExperimentV5> e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("adc5ce51", new Object[]{this, str}) : this.b.e(str);
    }

    public List<ExperimentV5> a(Long l) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("8cd43ac0", new Object[]{this, l}) : this.e.a(l);
    }
}
