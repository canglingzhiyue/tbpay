package tb;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.evo.EVOExperiment;
import com.alibaba.evo.internal.bucketing.model.ExperimentGroupV5;
import com.alibaba.evo.internal.bucketing.model.ExperimentV5;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.UTABMethod;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.VariationSet;
import com.alibaba.ut.abtest.d;
import com.alibaba.ut.abtest.event.EventType;
import com.alibaba.ut.abtest.internal.bucketing.DefaultVariationSet;
import com.alibaba.ut.abtest.internal.bucketing.ExperimentRoutingType;
import com.alibaba.ut.abtest.internal.bucketing.c;
import com.alibaba.ut.abtest.internal.bucketing.model.ExperimentCognation;
import com.alibaba.ut.abtest.internal.bucketing.model.ExperimentCognationType;
import com.alibaba.ut.abtest.internal.bucketing.model.ExperimentType;
import com.alibaba.ut.abtest.internal.bucketing.model.a;
import com.alibaba.ut.abtest.internal.util.b;
import com.alibaba.ut.abtest.internal.util.h;
import com.alibaba.ut.abtest.internal.util.hash.e;
import com.alibaba.ut.abtest.internal.util.n;
import com.alibaba.ut.abtest.internal.util.p;
import com.alibaba.ut.abtest.internal.util.s;
import com.alibaba.ut.abtest.pipeline.Response;
import com.alibaba.ut.abtest.track.f;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.cew;
import tb.mto;

/* loaded from: classes.dex */
public class ces implements cer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private AtomicBoolean f26251a = new AtomicBoolean(false);
    private Comparator<ExperimentV5> b = new Comparator<ExperimentV5>() { // from class: tb.ces.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        {
            ces.this = this;
        }

        @Override // java.util.Comparator
        public /* synthetic */ int compare(ExperimentV5 experimentV5, ExperimentV5 experimentV52) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, experimentV5, experimentV52})).intValue() : a(experimentV5, experimentV52);
        }

        public int a(ExperimentV5 experimentV5, ExperimentV5 experimentV52) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5fed015b", new Object[]{this, experimentV5, experimentV52})).intValue();
            }
            if (experimentV5.getId() == experimentV52.getId()) {
                long j = 0;
                long id = (experimentV5.getGroups() == null || experimentV5.getGroups().isEmpty()) ? 0L : experimentV5.getGroups().get(0).getId();
                if (experimentV52.getGroups() != null && !experimentV52.getGroups().isEmpty()) {
                    j = experimentV52.getGroups().get(0).getId();
                }
                return (int) (id - j);
            }
            return (int) (experimentV5.getId() - experimentV52.getId());
        }
    };
    private volatile long c = 0;
    private String d;

    static {
        kge.a(886194218);
        kge.a(670363370);
    }

    public static /* synthetic */ void lambda$9xLNuidUWUWYFeFinO9IhwGhC7k(a aVar) {
        d(aVar);
    }

    /* renamed from: lambda$EUGJz9dnQ56GpMCuJ4Bh5NgU-ok */
    public static /* synthetic */ void m2436lambda$EUGJz9dnQ56GpMCuJ4Bh5NgUok(ces cesVar, String str) {
        cesVar.g(str);
    }

    public static /* synthetic */ void lambda$GxmtT7RWuWYV8xRjzt6ZtuLmBJg(a aVar) {
        c(aVar);
    }

    /* renamed from: lambda$HGsD915cFbwHqQLWE_Pr-hg5o-o */
    public static /* synthetic */ void m2437lambda$HGsD915cFbwHqQLWE_Prhg5oo(a aVar) {
        a(aVar);
    }

    /* renamed from: lambda$uvtuBm-BH57siIb6G0dELFeYtt8 */
    public static /* synthetic */ void m2438lambda$uvtuBmBH57siIb6G0dELFeYtt8(a aVar) {
        b(aVar);
    }

    public static /* synthetic */ long a(ces cesVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e34940db", new Object[]{cesVar})).longValue() : cesVar.i();
    }

    public static /* synthetic */ long a(ces cesVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85df52b1", new Object[]{cesVar, new Long(j)})).longValue();
        }
        cesVar.c = j;
        return j;
    }

    public static /* synthetic */ void a(ces cesVar, long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58fe2747", new Object[]{cesVar, new Long(j), str});
        } else {
            cesVar.a(j, str);
        }
    }

    public static /* synthetic */ void a(ces cesVar, String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2fc9ef1", new Object[]{cesVar, str});
        } else {
            cesVar.e(str);
        }
    }

    public static /* synthetic */ AtomicBoolean b(ces cesVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("294ffaa8", new Object[]{cesVar}) : cesVar.f26251a;
    }

    @Override // tb.cer
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        h.a("DecisionServiceImpl", "initialize");
        try {
            c.a().c();
        } catch (Throwable th) {
            b.a("DecisionService.initialize", th);
        }
    }

    @Override // tb.cer
    public void a(final boolean z, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("【实验数据】");
        sb.append(z ? "立即开始更新数据" : "延时开始更新数据");
        h.a("DecisionServiceImpl", sb.toString());
        if (!cex.a().j().c()) {
            h.c("DecisionServiceImpl", "【实验数据】一休已禁止使用。");
        } else if (this.f26251a.compareAndSet(false, true)) {
            p.a(new Runnable() { // from class: tb.ces.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    ces.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    ces cesVar;
                    String str2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        ces.a(ces.this, System.currentTimeMillis());
                        if (cex.a().f() == UTABMethod.Pull) {
                            if (z) {
                                p.a(1002);
                                cesVar = ces.this;
                                str2 = str;
                            } else if (p.b(1002)) {
                                h.b("DecisionServiceImpl", "【实验数据】更新运行中，取消本次更新。");
                                return;
                            } else {
                                long a2 = ces.a(ces.this);
                                if (a2 <= 0) {
                                    cesVar = ces.this;
                                    str2 = str;
                                } else {
                                    h.b("DecisionServiceImpl", "【实验数据】" + a2 + "毫秒后开始更新实验数据。");
                                    ces.a(ces.this, a2, str);
                                }
                            }
                            ces.a(cesVar, str2);
                        } else {
                            cex.a().m().a(false, str);
                        }
                    } catch (Throwable th) {
                        try {
                            b.a("DecisionService.syncExperiments", th);
                        } finally {
                            ces.b(ces.this).set(false);
                        }
                    }
                }
            });
        } else {
            h.b("DecisionServiceImpl", "【实验数据】更新运行中，取消本次更新。");
        }
    }

    @Override // tb.cer
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        h.f("DecisionServiceImpl", "【实验数据】取消更新实验数据。");
        p.a(1002);
    }

    @Override // tb.cer
    public void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (!this.f26251a.compareAndSet(false, true)) {
            h.f("DecisionServiceImpl", "【实验数据】更新运行中，取消本次强制PULL更新。");
        }
        p.a(new Runnable() { // from class: tb.-$$Lambda$ces$EUGJz9dnQ56GpMCuJ4Bh5NgU-ok
            @Override // java.lang.Runnable
            public final void run() {
                ces.m2436lambda$EUGJz9dnQ56GpMCuJ4Bh5NgUok(ces.this, str);
            }
        });
    }

    public /* synthetic */ void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
            return;
        }
        this.c = System.currentTimeMillis();
        p.a(1002);
        try {
            e(str);
        } catch (Exception e) {
            b.a("DecisionService.forcePullSyncExperiments", e);
        } finally {
            this.f26251a.set(false);
        }
    }

    private long i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dd2864", new Object[]{this})).longValue();
        }
        long h = cex.a().j().h();
        if (cex.a().i().c() != 0 && h != 0) {
            return s.a((int) h);
        }
        return 0L;
    }

    private void a(long j, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d8a2226", new Object[]{this, new Long(j), str});
        } else {
            p.a(1002, new Runnable() { // from class: tb.ces.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    ces.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        ces.a(ces.this, str);
                    } catch (Throwable th) {
                        b.a("DecisionService.delaySyncExperiments", th);
                    }
                }
            }, j);
        }
    }

    private void e(String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            f(str);
        }
    }

    private void f(String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
            return;
        }
        h.f("DecisionServiceImpl", "【实验数据】开始更新实验数据。");
        com.alibaba.ut.abtest.pipeline.c a2 = cfe.a();
        Response a3 = cex.a().l().a(a2);
        if (cex.a().d()) {
            h.f("DecisionServiceImpl", "【实验数据】请求参数：" + a2);
        }
        if (a3 == null) {
            h.f("DecisionServiceImpl", "【实验数据】更新失败");
        } else if (!a3.isSuccess()) {
            h.f("DecisionServiceImpl", "【实验数据】更新失败，错误码：" + a3.getCode() + "，错误消息：" + a3.getMessage() + "，请求响应码：" + a3.getHttpResponseCode());
        } else if (a3.getDataJsonObject() == null || a3.getData() == null) {
            h.f("DecisionServiceImpl", "【实验数据】更新失败，内容为空或解析错误。");
        } else {
            bwt bwtVar = (bwt) a3.getData();
            String str2 = n.a(cex.a().r()) + bwtVar.d;
            if (TextUtils.equals(str2, this.d)) {
                h.f("DecisionServiceImpl", "【实验数据】检查更新完成，数据未发生变化。");
                return;
            }
            this.d = str2;
            h.f("DecisionServiceImpl", "【实验数据】检查更新完成，数据发生变化。签名：" + bwtVar.d);
            if (cex.a().d()) {
                h.e("DecisionServiceImpl", "【实验数据】检查更新响应结果：" + new String(a3.getByteData(), "UTF-8"));
            }
            if (bwtVar.f26152a != null) {
                cex.a().o().a(new com.alibaba.ut.abtest.event.a(EventType.ExperimentV5Data, bwtVar.f26152a, "pull_v5_" + str));
            }
            if (bwtVar.b != null) {
                cex.a().o().a(new com.alibaba.ut.abtest.event.a(EventType.BetaExperimentV5Data, bwtVar.b, "pull_v5_beta_" + str));
            }
            if (bwtVar.c == null) {
                h.f("DecisionServiceImpl", "【白名单数据】数据内容为空，停止处理！");
            } else {
                cex.a().n().a(bwtVar.c.groupIds);
            }
        }
    }

    @Override // tb.cer
    public void a(String str, String str2, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c4e002e", new Object[]{this, str, str2, dVar});
        } else {
            c.a().a(str, str2, dVar);
        }
    }

    @Override // tb.cer
    public void b(String str, String str2, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67d884d", new Object[]{this, str, str2, dVar});
        } else {
            c.a().b(str, str2, dVar);
        }
    }

    @Override // tb.cer
    public long c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue() : c.a().i();
    }

    @Override // tb.cer
    @Deprecated
    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : c.a().j();
    }

    @Override // tb.cer
    public void a(List<ExperimentV5> list, Set<Long> set, long j, String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57919d88", new Object[]{this, list, set, new Long(j), str});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("【实验数据V5】保存数据。签名：");
        sb.append(str);
        sb.append(", 版本：");
        sb.append(j);
        sb.append(", 实验数量：");
        if (list != null) {
            i = list.size();
        }
        sb.append(i);
        h.b("DecisionServiceImpl", sb.toString());
        try {
            c.a().a(list, set, j, str);
        } catch (Throwable th) {
            b.a("DecisionService.saveExperimentsV5", th);
        }
    }

    @Override // tb.cer
    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : c.a().f();
    }

    @Override // tb.cer
    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : c.a().h();
    }

    @Override // tb.cer
    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : c.a().g();
    }

    @Override // tb.cer
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            c.a().d(str);
        } else {
            c a2 = c.a();
            a2.d(n.a(cex.a().r()) + str);
        }
    }

    @Override // tb.cer
    public VariationSet a(String str, String str2, final Map<String, Object> map, boolean z, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VariationSet) ipChange.ipc$dispatch("552a0562", new Object[]{this, str, str2, map, new Boolean(z), obj});
        }
        final ceq ceqVar = new ceq();
        final a a2 = a(str, str2, map, ceqVar);
        if (a2 == null) {
            return null;
        }
        if (!a2.d() && (a2.a() == null || a2.a().isEmpty())) {
            return null;
        }
        if (z) {
            p.b(new Runnable() { // from class: tb.ces.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    ces.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    cex.a().k().a(a2, obj);
                    cex.a().k().a(a2, map, ceqVar);
                }
            });
            p.a(new Runnable() { // from class: tb.-$$Lambda$ces$9xLNuidUWUWYFeFinO9IhwGhC7k
                @Override // java.lang.Runnable
                public final void run() {
                    ces.lambda$9xLNuidUWUWYFeFinO9IhwGhC7k(a.this);
                }
            });
        }
        return new DefaultVariationSet(a2);
    }

    public static /* synthetic */ void d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fa0615b", new Object[]{aVar});
        } else {
            cex.a().k().a(aVar);
        }
    }

    @Override // tb.cer
    public VariationSet a(String str, String str2, final Map<String, Object> map, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VariationSet) ipChange.ipc$dispatch("927b304", new Object[]{this, str, str2, map, obj});
        }
        final ceq ceqVar = new ceq();
        final a a2 = a(str, str2, map, ceqVar);
        if (a2 == null) {
            return null;
        }
        if (!a2.d() && (a2.a() == null || a2.a().isEmpty())) {
            return null;
        }
        p.b(new Runnable() { // from class: tb.ces.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                ces.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                cex.a().k().b(a2, obj);
                cex.a().k().a(a2, map, ceqVar);
            }
        });
        p.a(new Runnable() { // from class: tb.-$$Lambda$ces$GxmtT7RWuWYV8xRjzt6ZtuLmBJg
            @Override // java.lang.Runnable
            public final void run() {
                ces.lambda$GxmtT7RWuWYV8xRjzt6ZtuLmBJg(a.this);
            }
        });
        return new DefaultVariationSet(a2);
    }

    public static /* synthetic */ void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("264c0c1a", new Object[]{aVar});
        } else {
            cex.a().k().a(aVar);
        }
    }

    @Override // tb.cer
    public VariationSet c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VariationSet) ipChange.ipc$dispatch("13b29815", new Object[]{this, str});
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        Object a2 = cex.a().n().a(str);
        if (a2 != null) {
            h.f("DecisionServiceImpl", "命中本地Mock开关：" + str + "=" + a2);
            HashMap hashMap = new HashMap();
            hashMap.put(str, a2.toString());
            a aVar = new a();
            aVar.a(hashMap);
            return new DefaultVariationSet(aVar);
        }
        com.alibaba.ut.abtest.internal.bucketing.model.b b = c.a().b(str);
        if (b != null && !b.n()) {
            h.f("DecisionServiceImpl", "高优先级开关: " + str + " 预分流结果: 没有命中实验分桶");
            return null;
        } else if (b != null) {
            h.f("DecisionServiceImpl", "命中高优先级开关：" + str + "=" + b.c(str));
            a(b);
            return new DefaultVariationSet(b);
        } else {
            List<String> c = c.a().c(str);
            int size = c == null ? 0 : c.size();
            h.e("DecisionServiceImpl", "开关 " + str + "，实验个数=" + size + "，查找索引耗时：" + (SystemClock.uptimeMillis() - uptimeMillis));
            if (size == 0) {
                h.b("DecisionServiceImpl", "开关 " + str + " 未查找到索引（ExperimentKey）");
                return null;
            }
            for (String str2 : c) {
                long uptimeMillis2 = SystemClock.uptimeMillis();
                final ceq ceqVar = new ceq();
                String[] a3 = com.alibaba.ut.abtest.internal.util.a.a(str2);
                if (a3 != null && a3.length == 2) {
                    final a a4 = a(a3[0], a3[1], (Map<String, Object>) null, ceqVar);
                    h.a("DecisionServiceImpl", "开关 " + str + " 分流耗时：" + (SystemClock.uptimeMillis() - uptimeMillis2));
                    if (a4 != null && (a4.d() || (a4.a() != null && !a4.a().isEmpty()))) {
                        p.b(new Runnable() { // from class: tb.ces.6
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            {
                                ces.this = this;
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                cex.a().k().a(a4, (Object) null);
                                cex.a().k().a(a4, (Map<String, Object>) null, ceqVar);
                            }
                        });
                        p.a(new Runnable() { // from class: tb.-$$Lambda$ces$uvtuBm-BH57siIb6G0dELFeYtt8
                            @Override // java.lang.Runnable
                            public final void run() {
                                ces.m2438lambda$uvtuBmBH57siIb6G0dELFeYtt8(a.this);
                            }
                        });
                        return new DefaultVariationSet(a4);
                    }
                }
            }
            return null;
        }
    }

    public static /* synthetic */ void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcf7b6d9", new Object[]{aVar});
        } else {
            cex.a().k().a(aVar);
        }
    }

    private void a(final com.alibaba.ut.abtest.internal.bucketing.model.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3a3d5f7", new Object[]{this, bVar});
            return;
        }
        final a aVar = new a(bVar);
        p.b(new Runnable() { // from class: tb.ces.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                ces.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                cex.a().k().a(bVar);
                cex.a().k().a(aVar, (Map<String, Object>) null, new ceq());
            }
        });
        p.a(new Runnable() { // from class: tb.-$$Lambda$ces$HGsD915cFbwHqQLWE_Pr-hg5o-o
            @Override // java.lang.Runnable
            public final void run() {
                ces.m2437lambda$HGsD915cFbwHqQLWE_Prhg5oo(a.this);
            }
        });
    }

    public static /* synthetic */ void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3a36198", new Object[]{aVar});
        } else {
            cex.a().k().a(aVar);
        }
    }

    public a a(String str, String str2, Map<String, Object> map, ceq ceqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("69c2437c", new Object[]{this, str, str2, map, ceqVar});
        }
        if (TextUtils.equals(UTABTest.COMPONENT_URI, str)) {
            return b(str, str2, map, ceqVar);
        }
        return c(str, str2, map, ceqVar);
    }

    private a b(String str, String str2, Map<String, Object> map, ceq ceqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("1d3b557d", new Object[]{this, str, str2, map, ceqVar});
        }
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        Uri b = f.b(str2);
        if (b == null) {
            return null;
        }
        List<ExperimentV5> a2 = c.a().a(b);
        if (a2 == null) {
            h.f("DecisionServiceImpl", "【运行实验】未查找到实验。来源URL：" + str2);
            return null;
        }
        h.f("DecisionServiceImpl", "【运行实验】查找到" + a2.size() + "个实验。来源URL：" + str2);
        hashMap.putAll(f.a(b));
        ceqVar.a("attributes", hashMap);
        return a(str2, b, a(str, a2, (Map<String, Object>) hashMap, ceqVar, false));
    }

    private a a(String str, Uri uri, List<ExperimentV5> list) {
        String str2;
        String uri2;
        String[] split;
        Uri b;
        Uri uri3 = uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("42707600", new Object[]{this, str, uri3, list});
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        a aVar = new a();
        String a2 = s.a(uri);
        LinkedHashMap<String, String> a3 = f.a(uri);
        Map<String, String> a4 = f.a(str);
        boolean z = false;
        Uri uri4 = null;
        for (ExperimentV5 experimentV5 : list) {
            if (experimentV5.getGroups() != null && !experimentV5.getGroups().isEmpty()) {
                a aVar2 = aVar;
                if (cex.a().j().a(experimentV5.getId())) {
                    h.f("DecisionServiceImpl", "实验 " + experimentV5.getId() + " 不需要 decode url 参数");
                    z = true;
                }
                ExperimentGroupV5 experimentGroupV5 = experimentV5.getGroups().get(0);
                if (experimentGroupV5.getVariations() != null) {
                    String str3 = experimentGroupV5.getVariations().get("bucket");
                    if (!TextUtils.isEmpty(str3) && (b = f.b(str3)) != null) {
                        if (TextUtils.indexOf(str3, "UTABTEST-ANY") >= 0) {
                            if (!TextUtils.equals(s.a(experimentV5.getUri()), s.a(b))) {
                                if (uri4 != null) {
                                    h.d("DecisionServiceImpl", "【运行实验】URL只允许重定向一次，忽略处理实验分组：" + experimentGroupV5.getId());
                                } else {
                                    Uri a5 = s.a(experimentV5.getUri(), b, uri3);
                                    if (a5 != null) {
                                        uri4 = a5;
                                    }
                                }
                            }
                            LinkedHashMap<String, String> a6 = f.a(a3, b);
                            a4.putAll(f.a(str3));
                            aVar = aVar2;
                            aVar.a(experimentV5);
                            a3 = a6;
                        } else {
                            if (!TextUtils.equals(a2, s.a(b))) {
                                if (uri4 == null) {
                                    uri4 = b;
                                } else {
                                    h.d("DecisionServiceImpl", "【运行实验】URL只允许重定向一次，忽略处理实验分组：" + experimentGroupV5.getId());
                                }
                            }
                            LinkedHashMap<String, String> a62 = f.a(a3, b);
                            a4.putAll(f.a(str3));
                            aVar = aVar2;
                            aVar.a(experimentV5);
                            a3 = a62;
                        }
                    }
                }
                aVar = aVar2;
            }
        }
        Iterator<Map.Entry<String, String>> it = a3.entrySet().iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().getValue(), "UTABTEST-DELETE")) {
                it.remove();
            }
        }
        Iterator<Map.Entry<String, String>> it2 = a4.entrySet().iterator();
        while (it2.hasNext()) {
            if (TextUtils.equals(it2.next().getValue(), "UTABTEST-DELETE")) {
                it2.remove();
            }
        }
        if (z) {
            str2 = a4.get(cew.a.URI_PARAMNAME_ABTEST);
        } else {
            str2 = a3.get(cew.a.URI_PARAMNAME_ABTEST);
        }
        if (!TextUtils.isEmpty(str2) && (split = TextUtils.split(str2, "\\.")) != null) {
            for (String str4 : split) {
                if (!TextUtils.isEmpty(str4)) {
                    aVar.a(str4);
                }
            }
        }
        String a7 = aVar.b() != null ? s.a(aVar.b(), ".") : null;
        if (!TextUtils.isEmpty(a7)) {
            a3.put(cew.a.URI_PARAMNAME_ABTEST, a7);
            a4.put(cew.a.URI_PARAMNAME_ABTEST, a7);
        }
        if (uri4 != null) {
            uri3 = uri4;
        }
        ArrayList arrayList = new ArrayList();
        try {
            if (aVar.c() != null) {
                for (ExperimentV5 experimentV52 : aVar.c()) {
                    if (experimentV52 != null) {
                        arrayList.add(Long.valueOf(experimentV52.getId()));
                    }
                }
            }
            if (z) {
                uri2 = f.b(uri3.getScheme(), uri3.getHost(), uri3.getPort(), uri3.getPath(), f.a(a4), uri3.getFragment());
            } else {
                uri2 = f.a(uri3.getScheme(), uri3.getHost(), uri3.getPort(), uri3.getPath(), f.a(a3, "UTF-8"), uri3.getFragment()).toString();
            }
            String str5 = uri2;
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(str5)) {
                hashMap.put("bucket", str5);
            }
            aVar.a(hashMap);
            a(arrayList, str, str5, a4, f.a(str5));
        } catch (Exception e) {
            b.a("DecisionServiceImpl.processActivatedUriExp2Group", e);
            h.c("DecisionServiceImpl", e.getMessage(), e);
        }
        return aVar;
    }

    private a c(String str, String str2, Map<String, Object> map, ceq ceqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("d0b4677e", new Object[]{this, str, str2, map, ceqVar});
        }
        ExperimentV5 a2 = c.a().a(com.alibaba.ut.abtest.internal.util.a.a(str, str2));
        if (a2 == null) {
            h.f("DecisionServiceImpl", "【运行实验】未查找到实验。命名空间：" + str + "，实验标识：" + str2);
            return null;
        }
        h.f("DecisionServiceImpl", "【运行实验】查找到 1 个实验。命名空间：" + str + "，实验标识：" + str2);
        return a(a2, map, ceqVar, false);
    }

    @Override // tb.cer
    public a a(ExperimentV5 experimentV5, Map<String, Object> map, ceq ceqVar, boolean z) {
        List<ExperimentV5> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("37a531f8", new Object[]{this, experimentV5, map, ceqVar, new Boolean(z)});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(experimentV5);
        HashMap hashMap = map != null ? new HashMap(map) : null;
        ceqVar.a("attributes", hashMap);
        String[] a3 = com.alibaba.ut.abtest.internal.util.a.a(experimentV5.getKey());
        if (a3 == null || (a2 = a(a3[0], arrayList, hashMap, ceqVar, z)) == null || a2.isEmpty()) {
            return null;
        }
        a aVar = new a();
        ExperimentV5 experimentV52 = a2.get(0);
        if (experimentV52.getGroups() != null && !experimentV52.getGroups().isEmpty()) {
            aVar.a(experimentV52);
            if (cex.a().j().r() && experimentV52.isRetain()) {
                aVar.a(true);
            } else {
                HashMap hashMap2 = new HashMap();
                for (ExperimentCognation cognation = experimentV52.getCognation(); cognation != null; cognation = cognation.getChild()) {
                    if ((cognation.getType() == ExperimentCognationType.RootDomain || cognation.getType() == ExperimentCognationType.Domain) && cognation.getVariations() != null && !cognation.getVariations().isEmpty()) {
                        hashMap2.putAll(cognation.getVariations());
                    }
                }
                if (experimentV52.getVariations() != null) {
                    hashMap2.putAll(experimentV52.getVariations());
                }
                hashMap2.putAll(experimentV52.getGroups().get(0).getVariations());
                aVar.a(hashMap2);
            }
        }
        return aVar;
    }

    public List<ExperimentV5> a(String str, List<ExperimentV5> list, Map<String, Object> map, ceq ceqVar, boolean z) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Iterator<ExperimentV5> it;
        String str7;
        boolean z2 = z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a30c4b6", new Object[]{this, str, list, map, ceqVar, new Boolean(z2)});
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator<ExperimentV5> it2 = list.iterator();
        while (true) {
            str2 = "，计算结果：当前不在实验时间周期内。";
            str3 = "【运行实验】实验周期计算。实验ID：";
            str4 = "DecisionServiceImpl";
            if (!it2.hasNext()) {
                break;
            }
            ExperimentV5 next = it2.next();
            if (next != null && !hashSet.contains(Long.valueOf(next.getId()))) {
                if (com.alibaba.ut.abtest.internal.util.d.a(next)) {
                    Iterator<ExperimentGroupV5> it3 = next.getGroups().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        ExperimentGroupV5 next2 = it3.next();
                        if (cex.a().n().a(next2.getId())) {
                            h.f(str4, "【运行实验】实验分组白名单计算。分组ID：" + next2.getId() + "，计算结果：白名单实验分组。");
                            ceqVar.a("whitelist=true");
                            hashSet.add(Long.valueOf(next.getId()));
                            ExperimentV5 copyBasicInfo = next.copyBasicInfo();
                            copyBasicInfo.setGroups(new ArrayList(3));
                            copyBasicInfo.getGroups().add(next2);
                            arrayList.add(copyBasicInfo);
                            break;
                        }
                    }
                } else {
                    h.f(str4, str3 + next.getId() + str2);
                }
            }
        }
        Iterator<ExperimentV5> it4 = list.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            ExperimentV5 next3 = it4.next();
            if (next3 != null && !hashSet.contains(Long.valueOf(next3.getId()))) {
                if (!com.alibaba.ut.abtest.internal.util.d.a(next3)) {
                    h.f(str4, str3 + next3.getId() + str2);
                } else {
                    if (z2 || !(next3.getType() == ExperimentType.AbComponent || next3.getType() == ExperimentType.AbUri)) {
                        str5 = str4;
                        str6 = str2;
                        it = it4;
                        str7 = str3;
                    } else {
                        str5 = str4;
                        str6 = str2;
                        it = it4;
                        str7 = str3;
                        if (!cex.a().h().a(next3.getConditionExpression(), map, next3.getId(), 0L)) {
                            h.f(str5, str7 + next3.getId() + "，条件匹配失败，" + next3.getCondition());
                            str4 = str5;
                            str3 = str7;
                            str2 = str6;
                            it4 = it;
                        }
                    }
                    ExperimentGroupV5 a2 = a(next3, map, ceqVar);
                    if (a2 != null) {
                        hashSet.add(Long.valueOf(next3.getId()));
                        ExperimentV5 copyBasicInfo2 = next3.copyBasicInfo();
                        copyBasicInfo2.setGroups(new ArrayList(3));
                        copyBasicInfo2.getGroups().add(a2);
                        arrayList.add(copyBasicInfo2);
                        break;
                    }
                    str4 = str5;
                    str3 = str7;
                    str2 = str6;
                    it4 = it;
                }
            }
            z2 = z;
        }
        if (cex.a().j().r() && arrayList.isEmpty() && !TextUtils.equals(UTABTest.COMPONENT_URI, str)) {
            if (list.size() > 0) {
                for (ExperimentV5 experimentV5 : list) {
                    List<Long> allLayerIds = experimentV5.getAllLayerIds();
                    if (allLayerIds != null) {
                        for (Long l : allLayerIds) {
                            ExperimentV5 a3 = a(c.a().a(l), map, ceqVar);
                            if (a3 != null) {
                                ExperimentV5 copyBasicInfo3 = experimentV5.copyBasicInfo();
                                copyBasicInfo3.setGroups(a3.getGroups());
                                copyBasicInfo3.setRetain(true);
                                arrayList.add(copyBasicInfo3);
                                break;
                            }
                        }
                    }
                }
            }
        } else {
            Collections.sort(arrayList, this.b);
        }
        return arrayList;
    }

    private ExperimentV5 a(List<ExperimentV5> list, Map<String, Object> map, ceq ceqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentV5) ipChange.ipc$dispatch("9f93ee5", new Object[]{this, list, map, ceqVar});
        }
        if (list != null && !list.isEmpty()) {
            h.b("DecisionServiceImpl", "【运行实验】全局空桶实验命中计算。全局空桶实验数量：" + list.size());
            for (ExperimentV5 experimentV5 : list) {
                if (!com.alibaba.ut.abtest.internal.util.d.a(experimentV5)) {
                    h.f("DecisionServiceImpl", "【运行实验】全局空桶实验周期计算。实验ID：" + experimentV5.getId() + "，计算结果：当前不在实验时间周期内。");
                } else {
                    ExperimentGroupV5 a2 = a(experimentV5, map, ceqVar);
                    if (a2 != null) {
                        ExperimentV5 copyBasicInfo = experimentV5.copyBasicInfo();
                        copyBasicInfo.setGroups(new ArrayList(3));
                        copyBasicInfo.getGroups().add(a2);
                        h.f("DecisionServiceImpl", "【运行实验】全局空桶实验已命中。实验ID：" + experimentV5.getId());
                        return copyBasicInfo;
                    }
                }
            }
        }
        return null;
    }

    private void a(List<Long> list, String str, String str2, Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9719ee8d", new Object[]{this, list, str, str2, map, map2});
        } else if (cex.a().j().t()) {
            try {
                for (Map.Entry<String, String> entry : map2.entrySet()) {
                    if (!TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue()) && !TextUtils.isEmpty(map.get(entry.getKey())) && !entry.getValue().equals(map.get(entry.getKey()))) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("sourceUrl", (Object) str);
                        jSONObject.put("targetUrl", (Object) str2);
                        b.a(b.PARAM_HANDLE_ERROR, jSONObject.toJSONString(), s.a(list, "."), "");
                        return;
                    }
                }
            } catch (Throwable th) {
                b.a("DecisionServiceImpl.paramsCheck", th);
            }
        }
    }

    public ExperimentGroupV5 a(ExperimentV5 experimentV5, Map<String, Object> map, ceq ceqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentGroupV5) ipChange.ipc$dispatch("465d43db", new Object[]{this, experimentV5, map, ceqVar});
        }
        if (experimentV5.getGroups() == null) {
            return null;
        }
        int a2 = a(experimentV5.getId(), experimentV5.getCognation(), ceqVar);
        for (ExperimentGroupV5 experimentGroupV5 : experimentV5.getGroups()) {
            ceqVar.a("groupId=" + experimentGroupV5.getId() + ", groupRoutingRange=" + Arrays.deepToString(experimentGroupV5.getRatioRange()));
            if (com.alibaba.ut.abtest.internal.util.d.a(a2, experimentGroupV5) && (experimentV5.getType() != ExperimentType.Redirect || cex.a().h().a(experimentGroupV5.getConditionExpression(), map, experimentV5.getId(), experimentGroupV5.getId()))) {
                return experimentGroupV5;
            }
        }
        return null;
    }

    public int a(long j, ExperimentCognation experimentCognation, ceq ceqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8804ecfc", new Object[]{this, new Long(j), experimentCognation, ceqVar})).intValue();
        }
        if (experimentCognation == null) {
            return -1;
        }
        if (experimentCognation.getType() == ExperimentCognationType.RootDomain) {
            ceqVar.a("rootDomain=" + experimentCognation.getCode());
            return a(j, experimentCognation.getChild(), ceqVar);
        } else if (experimentCognation.getType() == ExperimentCognationType.Domain) {
            if (experimentCognation.getParent() != null && experimentCognation.getParent().getType() == ExperimentCognationType.Layer) {
                ceqVar.a("domainId=" + experimentCognation.getId());
                if (com.alibaba.ut.abtest.internal.util.d.a(a(experimentCognation.getParent(), j, ceqVar), experimentCognation.getRatioRange())) {
                    return a(j, experimentCognation.getChild(), ceqVar);
                }
            }
            return -1;
        } else if (experimentCognation.getType() == ExperimentCognationType.Layer) {
            if (experimentCognation.getChild() == null) {
                ceqVar.a("layerId=" + experimentCognation.getId());
                ceqVar.a("layerRoutingType=" + experimentCognation.getRoutingType().name());
                ceqVar.a("layerRoutingFactor=" + experimentCognation.getRoutingFactor());
                return a(experimentCognation, j, ceqVar);
            }
            return a(j, experimentCognation.getChild(), ceqVar);
        } else if (experimentCognation.getType() != ExperimentCognationType.LaunchLayer) {
            return -1;
        } else {
            return a(experimentCognation, j, ceqVar);
        }
    }

    private int a(ExperimentCognation experimentCognation, long j, ceq ceqVar) {
        int abs;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1f3274a4", new Object[]{this, experimentCognation, new Long(j), ceqVar})).intValue();
        }
        ExperimentRoutingType routingType = experimentCognation.getRoutingType();
        String routingAlg = experimentCognation.getRoutingAlg();
        int bucketNum = experimentCognation.getBucketNum();
        String a2 = com.alibaba.ut.abtest.internal.util.a.a(routingType, experimentCognation.getRoutingFactor(), routingAlg);
        if (TextUtils.isEmpty(a2)) {
            return -1;
        }
        if ("motu_md5".equals(routingAlg)) {
            String a3 = com.alibaba.ut.abtest.internal.util.d.a(a2);
            if (TextUtils.isEmpty(a3)) {
                b.a(b.SERVICE_ALARM, "DecisionService.routingMd5", a3, "");
                return -1;
            }
            abs = Math.abs(a3.hashCode() % experimentCognation.getBucketNum());
        } else if ("murmur32".equals(routingAlg) || TextUtils.isEmpty(routingAlg)) {
            abs = Math.abs(e.a().hashString(a2, cew.a.DEFAULT_CHARSET).asInt()) % experimentCognation.getBucketNum();
        } else if (!TextUtils.isEmpty(routingAlg) && routingAlg.startsWith("trade_md5")) {
            String b = com.alibaba.ut.abtest.internal.util.d.b(a2);
            double c = com.alibaba.ut.abtest.internal.util.d.c(routingAlg);
            if (TextUtils.isEmpty(b)) {
                b.a(b.SERVICE_ALARM, "DecisionService.routingMd5", b, "");
                return -1;
            } else if (c <= mto.a.GEO_NOT_SUPPORT) {
                b.a(b.SERVICE_ALARM, "DecisionService.externalBucketNum", String.valueOf(c), "");
                return -1;
            } else {
                abs = (int) ((Math.abs(b.hashCode()) % c) * (bucketNum / c));
            }
        } else {
            b.a(b.SERVICE_ALARM, "DecisionService.unknownRouting", "", "");
            return -1;
        }
        if (ceqVar != null) {
            ceqVar.a("routingSeed=" + a2);
            ceqVar.a("routingValue=" + abs);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("【运行实验】实验分组流量计算。实验ID：");
        sb.append(j);
        sb.append("，分流算法：");
        if (TextUtils.isEmpty(routingAlg)) {
            routingAlg = "默认";
        }
        sb.append(routingAlg);
        sb.append("，ratio：");
        sb.append(abs);
        h.b("DecisionServiceImpl", sb.toString());
        return abs;
    }

    @Override // tb.cer
    public long h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e3", new Object[]{this})).longValue() : this.c;
    }

    @Override // tb.cer
    public List<EVOExperiment> a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f3bb44d4", new Object[]{this, str, map});
        }
        List<ExperimentV5> e = c.a().e(str);
        if (e == null || e.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ExperimentV5 experimentV5 : e) {
            if (!com.alibaba.ut.abtest.internal.util.d.a(experimentV5)) {
                h.d("DecisionServiceImpl", "【查找实验】实验周期计算。实验ID：" + experimentV5.getId() + "，计算结果：不在实验时间周期内。");
            } else if (!cex.a().h().a(experimentV5.getConditionExpression(), map, experimentV5.getId(), 0L)) {
                h.b("DecisionServiceImpl", "【运行实验】实验条件计算。实验ID：" + experimentV5.getId() + "，计算结果：不符合条件。");
            } else {
                EVOExperiment a2 = com.alibaba.ut.abtest.internal.bucketing.a.a(experimentV5);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
        }
        return arrayList;
    }

    @Override // tb.cer
    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }
}
