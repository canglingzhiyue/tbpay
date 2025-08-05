package tb;

import anetwork.channel.Request;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.net.e;
import com.taobao.search.common.util.c;
import com.taobao.search.common.util.j;
import com.taobao.search.common.util.r;
import com.taobao.search.common.util.u;
import com.taobao.search.common.util.z;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes7.dex */
public final class nng extends ioy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f31587a;
    private nnf b;
    private nnh c;
    private String d;
    private z e;
    private boolean f;
    private nul g;

    static {
        kge.a(-2127128800);
    }

    public nng() {
        this(null, 1, null);
    }

    public /* synthetic */ nng(nul nulVar, int i, o oVar) {
        this((i & 1) != 0 ? null : nulVar);
    }

    public nng(nul nulVar) {
        boolean aq;
        this.g = nulVar;
        if (c.a()) {
            aq = j.INSTANCE.c(imo.b());
            if (!aq) {
                aq = r.aq();
            }
        } else {
            aq = r.aq();
        }
        this.f31587a = aq;
        this.f = r.bq();
    }

    @Override // tb.ioy
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (!this.f31587a) {
        } else {
            nnf nnfVar = this.b;
            if (nnfVar != null && !nnfVar.a()) {
                nnfVar.c();
            }
            this.b = new nnf(z);
            nnh nnhVar = this.c;
            if (nnhVar != null && !nnhVar.a()) {
                nnhVar.g();
            }
            this.c = new nnh(this.d, z);
            if (!this.f || this.e != null) {
                return;
            }
            this.e = new z();
        }
    }

    @Override // tb.ioy
    public void a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65cbb30e", new Object[]{this, obj, str});
            return;
        }
        String str2 = this.d;
        if (str2 != null && str2.length() != 0) {
            z = false;
        }
        if (!z) {
            return;
        }
        this.d = nnh.Companion.a(obj);
        nnh nnhVar = this.c;
        if (nnhVar == null) {
            return;
        }
        nnhVar.a(this.d);
    }

    @Override // tb.ioy
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.f31587a) {
        } else {
            nnf nnfVar = this.b;
            if (nnfVar != null) {
                nnfVar.a(null);
            }
            nnh nnhVar = this.c;
            if (nnhVar == null) {
                return;
            }
            nnhVar.b();
        }
    }

    @Override // tb.ioy
    public void b(MtopBusiness mtopBusiness, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45932d5e", new Object[]{this, mtopBusiness, map});
            return;
        }
        z zVar = this.e;
        if (zVar != null) {
            z.a(zVar, "mtop-request", 0L, 2, null);
        }
        if (!this.f31587a) {
            return;
        }
        nnf nnfVar = this.b;
        if (nnfVar != null) {
            nnfVar.b(null);
            Map<String, String> b = nnfVar.b();
            if (b != null && mtopBusiness != null) {
                mtopBusiness.mo1317setOpenTracingContext(b);
            }
        }
        nnh nnhVar = this.c;
        if (nnhVar == null) {
            return;
        }
        nnhVar.c();
    }

    @Override // tb.ioy
    public void c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{this, map});
            return;
        }
        z zVar = this.e;
        if (zVar != null) {
            zVar.a("mtop-request");
        }
        nul.Companion.a(this.g, "Request", map);
        nnh nnhVar = this.c;
        if (nnhVar == null) {
            return;
        }
        nnhVar.a((Map<String, String>) null);
    }

    @Override // tb.ioy
    public void d(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1127953a", new Object[]{this, map});
            return;
        }
        z zVar = this.e;
        if (zVar != null) {
            zVar.a(z.FALLBACK, "true");
        }
        nul.Companion.a(this.g, "DataConvert", map);
    }

    @Override // tb.ioy
    public void e(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8c96b99", new Object[]{this, map});
            return;
        }
        nul.Companion.b(this.g, "Request", map);
        nnh nnhVar = this.c;
        if (nnhVar == null) {
            return;
        }
        nnhVar.b(map);
    }

    @Override // tb.ioy
    public void b(Request request) {
        nnf nnfVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b4cf7", new Object[]{this, request});
        } else if (!this.f31587a || (nnfVar = this.b) == null) {
        } else {
            nnfVar.b(null);
            Map<String, String> b = nnfVar.b();
            if (b == null || request == null) {
                return;
            }
            request.setTraceContext(b);
        }
    }

    @Override // tb.ioy
    public void a(e eVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a901d53", new Object[]{this, eVar, map});
            return;
        }
        z zVar = this.e;
        if (zVar != null) {
            z.a(zVar, z.PARSE_DATA, 0L, 2, null);
        }
        if (!this.f31587a) {
            return;
        }
        nnf nnfVar = this.b;
        if (nnfVar != null) {
            nnfVar.c(null);
        }
        nnh nnhVar = this.c;
        if (nnhVar == null) {
            return;
        }
        nnhVar.d();
    }

    @Override // tb.ioy
    public void f(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e06b41f8", new Object[]{this, map});
            return;
        }
        z zVar = this.e;
        if (zVar != null) {
            zVar.a(z.PARSE_DATA);
        }
        nul.Companion.a(this.g, "DataConvert", map);
        nnh nnhVar = this.c;
        if (nnhVar == null) {
            return;
        }
        nnhVar.c(null);
    }

    @Override // tb.ioy
    public void g(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80d1857", new Object[]{this, map});
            return;
        }
        nnh nnhVar = this.c;
        if (nnhVar == null) {
            return;
        }
        nnhVar.e();
    }

    @Override // tb.ioy
    public void h(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afaeeeb6", new Object[]{this, map});
            return;
        }
        nnh nnhVar = this.c;
        if (nnhVar == null) {
            return;
        }
        nnhVar.d(null);
    }

    @Override // tb.ioy
    public void a(long j, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("445b20a9", new Object[]{this, new Long(j), map});
            return;
        }
        z zVar = this.e;
        if (zVar == null) {
            return;
        }
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                zVar.a(entry.getKey(), entry.getValue());
            }
        }
        zVar.a(z.TEMPLATE_REQUEST, j);
    }

    @Override // tb.ioy
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        z zVar = this.e;
        if (zVar != null) {
            zVar.b();
        }
        if (!this.f31587a) {
            return;
        }
        nnf nnfVar = this.b;
        if (nnfVar != null) {
            nnfVar.d();
        }
        nnh nnhVar = this.c;
        if (nnhVar == null) {
            return;
        }
        nnhVar.h();
    }

    @Override // tb.ioy
    public void i(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9750c515", new Object[]{this, map});
            return;
        }
        z zVar = this.e;
        if (zVar != null) {
            zVar.a();
        }
        nul.Companion.b(this.g, "Unknown", map);
        if (!this.f31587a) {
            return;
        }
        nnf nnfVar = this.b;
        if (nnfVar != null) {
            nnfVar.e();
        }
        nnh nnhVar = this.c;
        if (nnhVar == null) {
            return;
        }
        nnhVar.f(map);
    }

    @Override // tb.ioy
    public void b(boolean z) {
        z zVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (!u.f() || (zVar = this.e) == null) {
        } else {
            zVar.a(z.DIMEN_XSEARCH_TYPE, z ? "metasearch" : QueryParamsManager.CartFeedFlowType.search);
        }
    }

    @Override // tb.ioy
    public void a(String name, Object value) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, name, value});
            return;
        }
        q.c(name, "name");
        q.c(value, "value");
        nnh nnhVar = this.c;
        if (nnhVar == null) {
            return;
        }
        nnhVar.a(name, value);
    }

    @Override // tb.ioy
    public void b(String biz, Map<String, Object> tagParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819a01b2", new Object[]{this, biz, tagParams});
            return;
        }
        q.c(biz, "biz");
        q.c(tagParams, "tagParams");
        nnh nnhVar = this.c;
        if (nnhVar == null) {
            return;
        }
        nnhVar.b(biz, tagParams);
    }

    @Override // tb.ioy
    public void a(String taskName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, taskName});
            return;
        }
        q.c(taskName, "taskName");
        nnh nnhVar = this.c;
        if (nnhVar == null) {
            return;
        }
        nnhVar.b(taskName);
    }

    @Override // tb.ioy
    public void a(String taskName, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, taskName, map});
            return;
        }
        q.c(taskName, "taskName");
        nnh nnhVar = this.c;
        if (nnhVar == null) {
            return;
        }
        nnhVar.a(taskName, map);
    }
}
