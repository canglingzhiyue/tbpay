package tb;

import android.text.TextUtils;
import com.alibaba.evo.internal.bucketing.model.ExperimentV5;
import com.alibaba.evo.internal.database.ExperimentDO;
import com.alibaba.evo.internal.database.b;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.internal.bucketing.a;
import com.alibaba.ut.abtest.internal.database.f;
import com.alibaba.ut.abtest.internal.database.g;
import com.alibaba.ut.abtest.internal.util.h;
import com.alibaba.ut.abtest.internal.util.k;
import com.alibaba.ut.abtest.internal.util.m;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class bwn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final b f26143a;
    private final Map<Long, List<ExperimentV5>> b = new HashMap();
    @Deprecated
    private final Map<Long, ExperimentV5> c = new HashMap();
    private final Map<Long, Object> d = new ConcurrentHashMap();

    static {
        kge.a(1081692124);
    }

    public bwn(b bVar) {
        this.f26143a = bVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!cex.a().j().r()) {
        } else {
            try {
                g gVar = new g();
                gVar.a(new f("ext_int=?", 1), new f[0]);
                gVar.a(new f("end_time>?", Long.valueOf(m.a())), new f[0]);
                f b = gVar.b();
                ArrayList<T> a2 = this.f26143a.a(null, null, 0, 0, b.a(), b.b());
                if (a2 != 0 && !a2.isEmpty()) {
                    Iterator it = a2.iterator();
                    while (it.hasNext()) {
                        ExperimentV5 a3 = a.a((ExperimentDO) it.next());
                        if (a3 != null) {
                            a(a3);
                        }
                    }
                }
                h.a("ExperimentRetainCache", "加载全局空桶实验缓存" + this.c.size() + "层。");
            } catch (Throwable th) {
                com.alibaba.ut.abtest.internal.util.b.a("ExperimentRetainCache.initialize", th);
            }
        }
    }

    public void a(List<ExperimentV5> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (cex.a().j().r()) {
            if (cex.a().j().s()) {
                if (cex.a().j().u()) {
                    c();
                    this.d.clear();
                } else {
                    b();
                }
            }
            if (list == null) {
                return;
            }
            for (ExperimentV5 experimentV5 : list) {
                if (!experimentV5.isColdWork()) {
                    a(experimentV5);
                } else if (cex.a().j().u() && !this.d.containsKey(Long.valueOf(experimentV5.getLayerId()))) {
                    this.d.put(Long.valueOf(experimentV5.getLayerId()), Boolean.TRUE);
                }
            }
        }
    }

    public synchronized List<ExperimentV5> a(Long l) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8cd43ac0", new Object[]{this, l});
        }
        List<ExperimentV5> list = this.b.get(l);
        if ((list == null || list.isEmpty()) && cex.a().j().y() && !this.d.containsKey(l)) {
            this.d.put(l, Boolean.TRUE);
            String string = cex.a().c().getSharedPreferences("ut-ab", 0).getString("layerId_" + l, "");
            if (!TextUtils.isEmpty(string)) {
                for (String str : string.split("###")) {
                    String a2 = k.b().a("expKey_" + str, (String) null);
                    if (!TextUtils.isEmpty(a2)) {
                        a((ExperimentV5) JSONObject.parseObject(a2, ExperimentV5.class));
                    }
                }
                return this.b.get(l);
            }
        }
        return list;
    }

    private synchronized void a(ExperimentV5 experimentV5) {
        List<ExperimentV5> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3088aa00", new Object[]{this, experimentV5});
        } else if (experimentV5 != null) {
            if (!cex.a().j().u() && experimentV5.isColdWork()) {
                return;
            }
            if (experimentV5.isRetain()) {
                ExperimentV5 put = this.c.put(Long.valueOf(experimentV5.getId()), experimentV5);
                if (put != null && (list = this.b.get(Long.valueOf(put.getLayerId()))) != null) {
                    for (ExperimentV5 experimentV52 : list) {
                        if (experimentV52.getId() == put.getId()) {
                            list.remove(experimentV52);
                        }
                    }
                }
                List<ExperimentV5> list2 = this.b.get(Long.valueOf(experimentV5.getLayerId()));
                if (list2 == null) {
                    list2 = new ArrayList<>();
                    this.b.put(Long.valueOf(experimentV5.getLayerId()), list2);
                }
                list2.add(experimentV5);
            }
        }
    }

    public synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.b.clear();
        this.c.clear();
    }

    public synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        for (Map.Entry<Long, List<ExperimentV5>> entry : this.b.entrySet()) {
            if (entry != null && entry.getValue() != null) {
                Iterator<ExperimentV5> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    if (!it.next().isColdWork()) {
                        it.remove();
                    }
                }
            }
        }
        Iterator<Map.Entry<Long, ExperimentV5>> it2 = this.c.entrySet().iterator();
        while (it2.hasNext()) {
            if (!it2.next().getValue().isColdWork()) {
                it2.remove();
            }
        }
    }
}
