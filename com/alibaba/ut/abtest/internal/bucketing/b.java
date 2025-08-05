package com.alibaba.ut.abtest.internal.bucketing;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.evo.internal.bucketing.model.ExperimentGroupV5;
import com.alibaba.evo.internal.bucketing.model.ExperimentV5;
import com.alibaba.evo.internal.database.ExperimentDO;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.internal.bucketing.model.ExperimentCognation;
import com.alibaba.ut.abtest.internal.bucketing.model.ExperimentType;
import com.alibaba.ut.abtest.internal.database.f;
import com.alibaba.ut.abtest.internal.database.g;
import com.alibaba.ut.abtest.internal.util.h;
import com.alibaba.ut.abtest.internal.util.i;
import com.alibaba.ut.abtest.internal.util.k;
import com.alibaba.ut.abtest.internal.util.m;
import com.alibaba.ut.abtest.internal.util.p;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.cex;
import tb.cez;
import tb.kge;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private com.alibaba.evo.internal.database.b j;

    /* renamed from: a */
    private final i<String, ExperimentV5> f4181a = new i<>(800);
    private final Map<String, Object> b = new ConcurrentHashMap();
    private final Map<String, d> c = new HashMap();
    private final ConcurrentHashMap<Long, Long> d = new ConcurrentHashMap<>();
    @Deprecated
    private final Map<String, List<String>> e = new ConcurrentHashMap();
    private final Map<String, com.alibaba.ut.abtest.internal.bucketing.model.b> f = new HashMap();
    private final Object g = new Object();
    private final Object h = new Object();
    private final Object i = new Object();
    private boolean k = false;

    static {
        kge.a(1887699401);
    }

    public static /* synthetic */ boolean lambda$Z4tMabzdwx40pdDpZHmPbIGT26U(b bVar, boolean z, Set set, int i, Set set2, ExperimentV5 experimentV5) {
        return bVar.a(z, set, i, set2, experimentV5);
    }

    public b(com.alibaba.evo.internal.database.b bVar) {
        this.j = bVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        f(HighPriorityExperimentStorage.SP_NAME_RELEASE);
        f(HighPriorityExperimentStorage.SP_NAME_PULL_BETA_FILE);
        f(HighPriorityExperimentStorage.SP_NAME_BETA_SINGLE);
    }

    private void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
            return;
        }
        Map<String, ?> all = cex.a().c().getSharedPreferences(str, 0).getAll();
        if (all == null) {
            return;
        }
        long a2 = k.b().a("experimentDataVersionV5", 0L);
        Object obj = all.get("experimentDataVersionV5");
        Object obj2 = all.get(HighPriorityExperimentStorage.OPT_VERSION_KEY);
        if (!(obj instanceof Long) || a2 == 0 || a2 != ((Long) obj).longValue() || !(obj2 instanceof Integer) || obj2 != 1) {
            return;
        }
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (!"experimentDataVersionV5".equals(entry.getKey()) && !HighPriorityExperimentStorage.OPT_VERSION_KEY.equals(entry.getKey())) {
                com.alibaba.ut.abtest.internal.bucketing.model.b bVar = new com.alibaba.ut.abtest.internal.bucketing.model.b(entry.getValue() == null ? null : entry.getValue().toString());
                bVar.a(entry.getKey());
                this.f.put(entry.getKey(), bVar);
            }
        }
        try {
            com.taobao.monitor.adapter.b.a("abLazyExperimentVersion", Long.valueOf(a2));
        } catch (Throwable th) {
            th.printStackTrace();
            com.alibaba.ut.abtest.internal.util.b.a("ExperimentCache.parseToHighPriorityExpList", th);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            f();
        } catch (Throwable th) {
            com.alibaba.ut.abtest.internal.util.b.a("ExperimentCache.initialize", th);
        }
    }

    private void f() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        h.a("ExperimentCache", "initializeV5");
        g gVar = new g();
        gVar.a(new f("end_time>?", Long.valueOf(m.a())), new f[0]);
        g gVar2 = new g();
        gVar2.a(new f("type=?", Integer.valueOf(ExperimentType.AbUri.getValue())), new f("type=?", Integer.valueOf(ExperimentType.Redirect.getValue())), new f[0]);
        gVar.a(gVar2.b(), new f[0]);
        f b = gVar.b();
        ArrayList<T> a2 = this.j.a(null, "id ASC", 0, 0, b.a(), b.b());
        if (a2 == 0 || a2.isEmpty()) {
            z = false;
        } else {
            Iterator it = a2.iterator();
            while (it.hasNext()) {
                ExperimentV5 a3 = a.a((ExperimentDO) it.next());
                if (a3 != null) {
                    b(a3);
                }
            }
            z = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("加载页面实验缓存数据");
        sb.append(a2 == 0 ? 0 : a2.size());
        sb.append("条.");
        h.e("ExperimentCache", sb.toString());
        g gVar3 = new g();
        gVar3.a(new f("end_time>?", Long.valueOf(m.a())), new f[0]);
        gVar3.a(new f("type=?", Integer.valueOf(ExperimentType.AbComponent.getValue())), new f[0]);
        gVar3.a(new f("ext_int=?", 0), new f[0]);
        f b2 = gVar3.b();
        ArrayList<T> a4 = this.j.a(null, "hit_latest_time DESC, hit_count DESC", 0, 800, b2.a(), b2.b());
        if (a4 != 0 && !a4.isEmpty()) {
            Iterator it2 = a4.iterator();
            while (it2.hasNext()) {
                ExperimentV5 a5 = a.a((ExperimentDO) it2.next());
                if (a5 != null) {
                    b(a5);
                }
            }
            z = true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("加载变量实验缓存数据");
        sb2.append(a4 == 0 ? 0 : a4.size());
        sb2.append("条.");
        h.e("ExperimentCache", sb2.toString());
        if (cex.a().i().c() > 0) {
            if (z) {
                com.alibaba.ut.abtest.internal.util.b.a(com.alibaba.ut.abtest.internal.util.b.DATABASE_EXPERIMENT_GROUPS_V2_ALARM, "v5");
            } else {
                com.alibaba.ut.abtest.internal.util.b.a(com.alibaba.ut.abtest.internal.util.b.DATABASE_EXPERIMENT_GROUPS_V2_ALARM, "v5", "0", (String) null, false);
            }
        }
        this.k = true;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.f4181a.a();
        synchronized (this.h) {
            this.c.clear();
        }
    }

    public String a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d56608a1", new Object[]{this, uri});
        }
        String scheme = uri.getScheme();
        if (TextUtils.isEmpty(scheme) || scheme.startsWith("http")) {
            scheme = "http";
        }
        return scheme + ":" + uri.getAuthority();
    }

    public void a(ExperimentV5 experimentV5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3088aa00", new Object[]{this, experimentV5});
        } else if (experimentV5 == null) {
        } else {
            if (cex.a().j().u() && experimentV5.isColdWork()) {
                this.b.put(experimentV5.getKey(), Boolean.FALSE);
                return;
            }
            if (experimentV5.getSwitchSet().size() > 0) {
                this.f.remove(experimentV5.getKey());
            }
            b(experimentV5);
        }
    }

    public void b(ExperimentV5 experimentV5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("368c755f", new Object[]{this, experimentV5});
        } else if (experimentV5 != null) {
            if (!cex.a().j().u() && experimentV5.isColdWork()) {
                return;
            }
            if (!cex.a().j().x() && experimentV5.isBuildSwitchIndex()) {
                return;
            }
            if (experimentV5.getType() == ExperimentType.AbComponent) {
                synchronized (this.g) {
                    this.f4181a.a(experimentV5.getKey(), experimentV5);
                    this.b.remove(experimentV5.getKey());
                }
            } else if (experimentV5.getType() == ExperimentType.AbUri || experimentV5.getType() == ExperimentType.Redirect) {
                if (experimentV5.getUri() == null) {
                    experimentV5.setUri(com.alibaba.ut.abtest.track.f.b(experimentV5.getKey()));
                }
                if (experimentV5.getUri() != null) {
                    String a2 = a(experimentV5.getUri());
                    synchronized (this.h) {
                        d dVar = this.c.get(a2);
                        if (dVar == null) {
                            dVar = new d();
                            this.c.put(a2, dVar);
                        }
                        dVar.a(experimentV5.getUri(), experimentV5);
                    }
                }
            }
            for (String str : experimentV5.getSwitchSet()) {
                if (!TextUtils.isEmpty(str)) {
                    List<String> list = this.e.get(str);
                    if (list == null) {
                        list = new CopyOnWriteArrayList<>();
                        this.e.put(str, list);
                    }
                    list.add(experimentV5.getKey());
                }
            }
        }
    }

    public void a(cez<ExperimentV5> cezVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e34c6f80", new Object[]{this, cezVar});
            return;
        }
        synchronized (this.g) {
            this.f4181a.a(cezVar);
        }
        synchronized (this.h) {
            for (Map.Entry<String, d> entry : this.c.entrySet()) {
                if (entry != null && entry.getValue() != null) {
                    entry.getValue().a(cezVar);
                }
            }
        }
    }

    public void a(List<ExperimentV5> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a074ca", new Object[]{this, list, new Integer(i)});
        } else {
            a(list, new HashSet(), i, false);
        }
    }

    public void a(List<ExperimentV5> list, Set<Long> set, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72fc837d", new Object[]{this, list, set, new Integer(i)});
        } else {
            a(list, set, i, true);
        }
    }

    private void a(List<ExperimentV5> list, final Set<Long> set, final int i, final boolean z) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec949ef7", new Object[]{this, list, set, new Integer(i), new Boolean(z)});
            return;
        }
        final HashSet hashSet = new HashSet();
        a(new cez() { // from class: com.alibaba.ut.abtest.internal.bucketing.-$$Lambda$b$Z4tMabzdwx40pdDpZHmPbIGT26U
            @Override // tb.cez
            public final boolean test(Object obj) {
                return b.lambda$Z4tMabzdwx40pdDpZHmPbIGT26U(b.this, z, set, i, hashSet, (ExperimentV5) obj);
            }
        });
        ArrayList<ExperimentV5> arrayList = new ArrayList();
        for (ExperimentV5 experimentV5 : list) {
            if (!z || !com.alibaba.ut.abtest.internal.util.a.a(experimentV5, set)) {
                if (experimentV5.getType() == ExperimentType.AbUri || experimentV5.getType() == ExperimentType.Redirect || (experimentV5.getType() == ExperimentType.AbComponent && hashSet.contains(experimentV5.getKey()))) {
                    a(experimentV5);
                    i2++;
                } else {
                    arrayList.add(experimentV5);
                }
            }
        }
        for (ExperimentV5 experimentV52 : arrayList) {
            if (this.f4181a.b() >= 800) {
                break;
            }
            a(experimentV52);
            i2++;
        }
        h.a("ExperimentCache", "尝试添加实验缓存" + i2 + "条，publishType=" + i);
    }

    public /* synthetic */ boolean a(boolean z, Set set, int i, Set set2, ExperimentV5 experimentV5) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3661d5d", new Object[]{this, new Boolean(z), set, new Integer(i), set2, experimentV5})).booleanValue();
        }
        if (z && com.alibaba.ut.abtest.internal.util.a.a(experimentV5, set)) {
            return true;
        }
        if (experimentV5 == null || experimentV5.getExpPublishType() != i) {
            return false;
        }
        if (cex.a().j().u() && experimentV5.isColdWork()) {
            z2 = false;
        }
        if (z2 && experimentV5.getType() == ExperimentType.AbComponent) {
            set2.add(experimentV5.getKey());
        }
        if (z2) {
            this.b.remove(experimentV5.getKey());
        }
        return z2;
    }

    public ExperimentV5 a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentV5) ipChange.ipc$dispatch("24783834", new Object[]{this, new Long(j)});
        }
        synchronized (this.h) {
            for (d dVar : this.c.values()) {
                ExperimentV5 a2 = dVar.a(j);
                if (a2 != null) {
                    return a2;
                }
            }
            synchronized (this.g) {
                for (ExperimentV5 experimentV5 : this.f4181a.c().values()) {
                    List<ExperimentGroupV5> groups = experimentV5.getGroups();
                    if (groups != null) {
                        Iterator<ExperimentGroupV5> it = groups.iterator();
                        while (it.hasNext()) {
                            if (it.next().getId() == j) {
                                return experimentV5;
                            }
                        }
                        continue;
                    }
                }
                return null;
            }
        }
    }

    public List<ExperimentV5> b(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("30a0c609", new Object[]{this, uri});
        }
        if (uri == null) {
            return null;
        }
        String a2 = a(uri);
        synchronized (this.h) {
            d dVar = this.c.get(a2);
            if (dVar != null) {
                List<ExperimentV5> a3 = dVar.a(uri);
                if (a3 != null && !a3.isEmpty()) {
                    for (ExperimentV5 experimentV5 : a3) {
                        b(experimentV5.getId());
                    }
                }
                return a3;
            }
            if (!this.k) {
                h.e("ExperimentCache", "当前一休实验缓存还没加载完成");
            }
            return null;
        }
    }

    public ExperimentV5 a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentV5) ipChange.ipc$dispatch("fd6d308a", new Object[]{this, str});
        }
        synchronized (this.g) {
            ExperimentV5 a2 = this.f4181a.a((i<String, ExperimentV5>) str);
            if (a2 == null) {
                if (this.b.get(str) != null) {
                    return null;
                }
                if (cex.a().j().y()) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    k b = k.b();
                    String a3 = b.a("expKey_" + str, (String) null);
                    if (!TextUtils.isEmpty(a3)) {
                        ExperimentV5 experimentV5 = (ExperimentV5) JSONObject.parseObject(a3, ExperimentV5.class);
                        b(experimentV5);
                        b(experimentV5.getId());
                        h.a("ExperimentCache", "懒加载耗时：" + (SystemClock.uptimeMillis() - uptimeMillis));
                        return experimentV5;
                    }
                }
                p.b(new Runnable() { // from class: com.alibaba.ut.abtest.internal.bucketing.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        b.this = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            b.this.d(str);
                        }
                    }
                });
                if (!this.k) {
                    h.e("ExperimentCache", "当前一休实验缓存还没加载完成");
                }
            } else {
                b(a2.getId());
            }
            return a2;
        }
    }

    public com.alibaba.ut.abtest.internal.bucketing.model.b b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.ut.abtest.internal.bucketing.model.b) ipChange.ipc$dispatch("73c8da92", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (com.alibaba.ut.abtest.internal.bucketing.model.b bVar : this.f.values()) {
            if (bVar.b(str)) {
                if (bVar.m() && !com.alibaba.ut.abtest.internal.util.d.a(bVar)) {
                    h.f("ExperimentCache", "【运行实验】实验周期计算。实验ID：" + bVar.c() + "，计算结果：当前不在实验时间周期内。");
                } else if (cex.a().h().a(bVar.i(), null, bVar.c(), 0L)) {
                    return bVar;
                } else {
                    h.f("ExperimentCache", "【运行实验】实验周期计算。实验ID：" + bVar.c() + "，条件匹配失败，" + bVar.j());
                }
            }
        }
        return null;
    }

    public List<String> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("eb209513", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List<String> list = this.e.get(str);
        if (list != null && list.size() != 0) {
            return list;
        }
        k b = k.b();
        String a2 = b.a("switchName_" + str, (String) null);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(Arrays.asList(a2.split("###")));
        this.e.put(str, copyOnWriteArrayList);
        return copyOnWriteArrayList;
    }

    private void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
            return;
        }
        Long valueOf = Long.valueOf(j);
        Long l = this.d.get(valueOf);
        if (l == null) {
            this.d.put(valueOf, 1L);
        } else {
            this.d.put(valueOf, Long.valueOf(l.longValue() + 1));
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        try {
            g gVar = new g();
            gVar.a(new f("key=?", str), new f[0]);
            f b = gVar.b();
            List<ExperimentDO> a2 = this.j.a(null, null, 0, 0, b.a(), b.b());
            if (a2 != null && !a2.isEmpty()) {
                for (ExperimentDO experimentDO : a2) {
                    ExperimentV5 a3 = a.a(experimentDO);
                    if (a3 != null) {
                        if (a3.isColdWork()) {
                            this.b.put(str, Boolean.FALSE);
                        } else {
                            b(a3);
                            b(a3.getId());
                        }
                    }
                }
                return;
            }
            this.b.put(str, Boolean.TRUE);
        } catch (Throwable th) {
            com.alibaba.ut.abtest.internal.util.b.a("ExperimentCache.loadExperimentCacheV5", th);
        }
    }

    public List<ExperimentV5> e(String str) {
        ExperimentCognation b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("adc5ce51", new Object[]{this, str});
        }
        ArrayList arrayList = new ArrayList();
        try {
            g gVar = new g();
            gVar.a(new f("end_time>?", Long.valueOf(m.a())), new f[0]);
            gVar.a(new f("type=?", Integer.valueOf(ExperimentType.AbComponent.getValue())), new f[0]);
            f b2 = gVar.b();
            ArrayList<T> a2 = this.j.a(new String[]{"id", "release_id", "key", ExperimentDO.COLUMN_BEGIN_TIME, ExperimentDO.COLUMN_END_TIME, "condition", ExperimentDO.COLUMN_COGNATION}, null, 0, 0, b2.a(), b2.b());
            if (a2 != 0 && !a2.isEmpty()) {
                Iterator it = a2.iterator();
                while (it.hasNext()) {
                    ExperimentDO experimentDO = (ExperimentDO) it.next();
                    ExperimentV5 a3 = this.f4181a.a((i<String, ExperimentV5>) experimentDO.getKey());
                    if (a3 != null) {
                        b = a3.getCognation();
                    } else {
                        b = a.b(experimentDO);
                    }
                    if (b != null && b.hasDomain(str)) {
                        if (a3 == null) {
                            a3 = a.a(experimentDO);
                        }
                        if (a3 != null) {
                            arrayList.add(a3);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            com.alibaba.ut.abtest.internal.util.b.a("ExperimentCache.getExperimentOneGroupsByDomain", th);
        }
        return arrayList;
    }

    public ConcurrentHashMap<Long, Long> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("403f1a9b", new Object[]{this}) : this.d;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.d.clear();
        }
    }
}
