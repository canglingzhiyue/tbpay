package com.alibaba.android.ultron.vfw.dataloader;

import com.alibaba.android.spindle.stage.StageType;
import com.alibaba.android.ultron.vfw.dataloader.m;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.bpd;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_DATA_PARSER_RESULT = "DataParseResult";

    /* renamed from: a  reason: collision with root package name */
    public com.alibaba.android.ultron.vfw.instance.d f2687a;
    public Map<String, n> b = new HashMap();
    public Map<String, o> c = new HashMap();
    public Map<l, m> d = new ConcurrentHashMap();

    static {
        kge.a(-1982128755);
    }

    public static /* synthetic */ void a(a aVar, d dVar, f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c89ec6ae", new Object[]{aVar, dVar, fVar, new Boolean(z)});
        } else {
            aVar.b(dVar, fVar, z);
        }
    }

    public a(com.alibaba.android.ultron.vfw.instance.d dVar) {
        this.f2687a = dVar;
    }

    public void a(String str, o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd0a16b0", new Object[]{this, str, oVar});
        } else {
            this.c.put(str, oVar);
        }
    }

    public void a(d dVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0878446", new Object[]{this, dVar, fVar});
        } else {
            a(dVar, fVar, false);
        }
    }

    public void b(d dVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8cdc487", new Object[]{this, dVar, fVar});
        } else {
            a(dVar, fVar, true);
        }
    }

    private void a(d dVar, f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6069b74e", new Object[]{this, dVar, fVar, new Boolean(z)});
            return;
        }
        UnifyLog.a(this.f2687a.g(), "DataLoadManager", "renderWithContext step1", new String[0]);
        if (dVar == null) {
            b();
            return;
        }
        c u = this.f2687a.u();
        if (u == null) {
            UnifyLog.a(this.f2687a.g(), "DataLoadManager", "DataLoaderConfig is null", new String[0]);
            b();
            return;
        }
        String c = u.c();
        if (c == null) {
            UnifyLog.a(this.f2687a.g(), "DataLoadManager", "dataParseType is null", new String[0]);
            b();
            return;
        }
        o oVar = this.c.get(c);
        if (oVar == null) {
            oVar = b(c);
            if (oVar == null) {
                String g = this.f2687a.g();
                UnifyLog.a(g, "DataLoadManager", "dataLoaderParser is null, type: " + c, new String[0]);
                b();
                return;
            }
            this.c.put(c, oVar);
        } else {
            b();
        }
        C0098a c0098a = new C0098a(fVar, dVar, z);
        l a2 = l.a(dVar, oVar, c0098a);
        c0098a.a(a2);
        UnifyLog.a(this.f2687a.g(), "DataLoadManager", "dataLoaderParser task start step2", new String[0]);
        if (z) {
            a2.a(new m.a() { // from class: com.alibaba.android.ultron.vfw.dataloader.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.android.ultron.vfw.dataloader.m.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        UnifyLog.a(a.this.f2687a.g(), "DataLoadManager", "dataloader finished and refresh finished step6", new String[0]);
                    }
                }
            });
            return;
        }
        m mVar = new m(a2);
        mVar.a();
        this.d.put(a2, mVar);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        com.alibaba.android.ultron.vfw.instance.a f = this.f2687a.y().f();
        if (f == null) {
            return;
        }
        f.a("Page_Ultron", com.taobao.analysis.v3.a.PRE_PROCESS, StageType.STAGE_END);
    }

    /* renamed from: com.alibaba.android.ultron.vfw.dataloader.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0098a implements i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public l f2690a;
        public f b;
        public d c;
        public boolean d;

        static {
            kge.a(-582028329);
            kge.a(515691582);
        }

        public C0098a(f fVar, d dVar, boolean z) {
            this.b = fVar;
            this.c = dVar;
            this.d = z;
        }

        public void a(l lVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5ee791d", new Object[]{this, lVar});
            } else {
                this.f2690a = lVar;
            }
        }

        @Override // com.alibaba.android.ultron.vfw.dataloader.i
        public j a(j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (j) ipChange.ipc$dispatch("bead3816", new Object[]{this, jVar});
            }
            UnifyLog.a(a.this.f2687a.g(), "DataLoadManager", "dataLoaderParser task finished step3", new String[0]);
            if (bpd.c()) {
                if (a.this.d.containsKey(this.f2690a)) {
                    a.this.d.remove(this.f2690a);
                }
                if (!a.this.d.isEmpty()) {
                    UnifyLog.a(a.this.f2687a.g(), "DataLoadManager", "当前已有新的DataParse Task", new String[0]);
                    return jVar;
                }
            }
            j a2 = this.b.a(jVar);
            this.c.a(a.KEY_DATA_PARSER_RESULT, a2);
            a.a(a.this, this.c, this.b, this.d);
            return a2;
        }
    }

    private void b(d dVar, f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40eb7f2d", new Object[]{this, dVar, fVar, new Boolean(z)});
            return;
        }
        String b = this.f2687a.u().b();
        if (b == null) {
            UnifyLog.a(this.f2687a.g(), "DataLoadManager", "dataLoaderType is null", new String[0]);
            return;
        }
        n nVar = this.b.get(b);
        if (nVar == null) {
            nVar = a(b);
            if (nVar == null) {
                String g = this.f2687a.g();
                UnifyLog.a(g, "DataLoadManager", "dataloader is null, type: " + b, new String[0]);
                return;
            }
            this.b.put(b, nVar);
        }
        g a2 = g.a(dVar, nVar, fVar, this.f2687a);
        m.a aVar = new m.a() { // from class: com.alibaba.android.ultron.vfw.dataloader.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.vfw.dataloader.m.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    UnifyLog.a(a.this.f2687a.g(), "DataLoadManager", "dataloader finished and refresh finished step6", new String[0]);
                }
            }
        };
        UnifyLog.a(this.f2687a.g(), "DataLoadManager", "dataloader task start step4", new String[0]);
        if (z) {
            a2.a(true);
            a2.a(aVar);
            return;
        }
        new m(a2, aVar).a();
    }

    private n a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("f8f9c3e5", new Object[]{this, str});
        }
        if (!c.DATA_LOADER_TYPE_CLIENT.equals(str)) {
            return null;
        }
        return new e(this.f2687a);
    }

    private o b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o) ipChange.ipc$dispatch("d4bb3fc5", new Object[]{this, str});
        }
        if (!c.DATA_PARSER_TYPE_SCRIPT.equals(str)) {
            return null;
        }
        return new k(this.f2687a);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        m.b();
        this.d.clear();
    }
}
