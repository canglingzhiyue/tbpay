package com.taobao.monitor.procedure;

import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.ProcedureGlobal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import tb.ept;
import tb.mpi;
import tb.mpk;
import tb.mqj;
import tb.mqk;

/* loaded from: classes.dex */
public class ProcedureImpl implements i, k {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile long b = System.currentTimeMillis();
    private static final Set<String> k;

    /* renamed from: a  reason: collision with root package name */
    private String f18218a;
    private final String c;
    private final g d;
    private final u e;
    private Status f = Status.INIT;
    private final List<g> g = new LinkedList();
    private a h;
    private final boolean i;
    private final Map<String, Long> j;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public enum Status {
        INIT,
        RUNNING,
        STOPPED
    }

    /* loaded from: classes.dex */
    public interface a {
        void a(u uVar);
    }

    @Override // com.taobao.monitor.procedure.g
    public g a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("5ccf4590", new Object[]{this, str}) : this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g a(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("dd49e059", new Object[]{this, str, str2, map}) : this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g e(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("d9b98e93", new Object[]{this, str, map}) : this;
    }

    public static /* synthetic */ g a(ProcedureImpl procedureImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("f4b8a3ba", new Object[]{procedureImpl}) : procedureImpl.d;
    }

    static {
        HashSet hashSet = new HashSet();
        k = hashSet;
        hashSet.add("name");
        k.add("start");
        k.add("end");
    }

    public ProcedureImpl(String str, g gVar, String str2, boolean z, boolean z2) {
        this.f18218a = str;
        this.d = gVar;
        this.i = z;
        this.e = new u(str, z, z2);
        if (gVar != null) {
            this.e.a("parentSession", gVar.a());
        }
        if (StringUtils.isEmpty(str2)) {
            long j = b;
            b = 1 + j;
            this.c = String.valueOf(j);
        } else {
            this.c = str2;
        }
        this.e.a(MspGlobalDefine.SESSION, this.c);
        this.e.a(this.c);
        this.j = new HashMap();
    }

    @Override // com.taobao.monitor.procedure.g
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.c;
    }

    @Override // com.taobao.monitor.procedure.g
    public g b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("c8b1d6f9", new Object[]{this});
        }
        if (this.f == Status.INIT) {
            this.f = Status.RUNNING;
            g gVar = this.d;
            if (gVar instanceof i) {
                ((i) gVar).b(this);
            }
        }
        return this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("1473508f", new Object[]{this, str, map});
        }
        if (str != null && c()) {
            this.e.a(new mqj(str, map));
        }
        return this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("56cd4cf0", new Object[]{this, str, new Long(j)});
        }
        if (str != null && c()) {
            this.e.a(new mqk(str, j));
        }
        return this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g b(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("8021a231", new Object[]{this, str, new Long(j)});
        }
        if (str != null && c()) {
            mqk mqkVar = new mqk(str, j);
            if (this.e.i().contains(mqkVar)) {
                return this;
            }
            this.e.a(mqkVar);
        }
        return this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g b(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("5c4e010", new Object[]{this, str, map});
        }
        if (str != null && c()) {
            this.e.a(str, map);
        }
        return this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g c(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("f7166f91", new Object[]{this, str, map});
        }
        if (str != null && c()) {
            this.e.b(str, map);
        }
        return this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g d(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("e867ff12", new Object[]{this, str, map});
        }
        if (str != null && c()) {
            this.e.c(str, map);
        }
        return this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("5d552b4", new Object[]{this, str, obj});
        }
        if (c()) {
            this.e.a(str, obj);
        }
        return this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g c(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("a6abc72", new Object[]{this, str, obj});
        }
        if (c() && !this.e.l().containsKey(str)) {
            this.e.a(str, obj);
        }
        return this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g b(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("88200793", new Object[]{this, str, obj});
        }
        if (c()) {
            this.e.b(str, obj);
        }
        return this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g a(String str, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("9c903190", new Object[]{this, str, new Long(j), new Long(j2)});
        }
        c(str, j);
        a(str, j2, (Map<String, Object>) null);
        return this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g c(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("a975f772", new Object[]{this, str, new Long(j)});
        }
        if (!StringUtils.isEmpty(str)) {
            this.j.put(str, Long.valueOf(j));
        }
        return this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g a(String str, long j, Map<String, Object> map) {
        Long l;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("b2799d2f", new Object[]{this, str, new Long(j), map});
        }
        if (!StringUtils.isEmpty(str) && (l = this.j.get(str)) != null && this.g != null && c()) {
            HashMap hashMap = new HashMap();
            hashMap.put("name", str);
            hashMap.put("start", l);
            hashMap.put("end", Long.valueOf(j));
            if (map != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    if (k.contains(entry.getKey())) {
                        if (mpk.a()) {
                            throw new RuntimeException("The " + entry.getKey() + " field cannot be added to the Apm subTask.");
                        }
                    } else {
                        hashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                obj = map.get("tag");
            } else {
                obj = null;
            }
            float nextFloat = new Random(System.currentTimeMillis()).nextFloat();
            Object obj2 = this.e.l().get("pageName");
            boolean z = nextFloat < ProcedureGlobal.a().a(obj2 == null ? null : obj2.toString());
            if (ept.PAGELOAD.equals(obj) || z) {
                this.e.a(hashMap);
            }
            this.j.remove(str);
            mpi.c("ProcedureImpl", MspGlobalDefine.SESSION, this.c, "subTaskName", str, "startTime", l, "endTime", Long.valueOf(j), "properties", map);
        }
        return this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g a(String str, long j, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("655244f9", new Object[]{this, str, new Long(j), str2, map});
        }
        if (map == null) {
            map = new HashMap<>();
        }
        if (StringUtils.isEmpty(str2)) {
            str2 = "UNKNOWN";
        }
        map.put("errorType", str2);
        a(str, j, map);
        return this;
    }

    @Override // com.taobao.monitor.procedure.g
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : Status.STOPPED != this.f;
    }

    @Override // com.taobao.monitor.procedure.g
    public g d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("b13047b7", new Object[]{this}) : a(false);
    }

    @Override // com.taobao.monitor.procedure.g
    public g a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("25915716", new Object[]{this, new Boolean(z)});
        }
        if (this.f == Status.RUNNING) {
            synchronized (this.g) {
                for (g gVar : this.g) {
                    if (gVar instanceof t) {
                        g e = ((t) gVar).e();
                        if (e instanceof ProcedureImpl) {
                            ProcedureImpl procedureImpl = (ProcedureImpl) e;
                            if (procedureImpl.c()) {
                                this.e.a(procedureImpl.e());
                            }
                            if (!procedureImpl.i || z) {
                                e.a(z);
                            }
                        } else {
                            e.a(z);
                        }
                    } else {
                        gVar.a(z);
                    }
                }
            }
            if (this.d instanceof i) {
                ProcedureGlobal.a().c().post(new Runnable() { // from class: com.taobao.monitor.procedure.ProcedureImpl.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            ((i) ProcedureImpl.a(ProcedureImpl.this)).a(ProcedureImpl.this);
                        }
                    }
                });
            }
            g gVar2 = this.d;
            if (gVar2 instanceof k) {
                ((k) gVar2).a(e());
            }
            a aVar = this.h;
            if (aVar != null) {
                aVar.a(this.e);
            }
            this.f = Status.STOPPED;
        }
        return this;
    }

    public u e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (u) ipChange.ipc$dispatch("256f81c8", new Object[]{this}) : this.e.c();
    }

    @Override // com.taobao.monitor.procedure.i
    public void b(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72b195d5", new Object[]{this, gVar});
        } else if (gVar == null || !c()) {
        } else {
            synchronized (this.g) {
                this.g.add(gVar);
            }
        }
    }

    @Override // com.taobao.monitor.procedure.i
    public void a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f09c254", new Object[]{this, gVar});
        } else if (gVar == null) {
        } else {
            synchronized (this.g) {
                this.g.remove(gVar);
            }
        }
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        super.finalize();
        if (this.f != Status.RUNNING) {
            return;
        }
        mpk.a(new RuntimeException("Please call end function first!"));
    }

    public u f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (u) ipChange.ipc$dispatch("99aeba27", new Object[]{this}) : this.e;
    }

    public ProcedureImpl a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProcedureImpl) ipChange.ipc$dispatch("3ed9a72b", new Object[]{this, aVar});
        }
        this.h = aVar;
        return this;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : this.f18218a;
    }

    @Override // com.taobao.monitor.procedure.k
    public void a(u uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f101f86", new Object[]{this, uVar});
        } else if (!c()) {
        } else {
            this.e.a(uVar);
        }
    }
}
