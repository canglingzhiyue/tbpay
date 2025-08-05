package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.ace.b;
import com.taobao.android.searchbaseframe.datasource.a;
import com.taobao.android.searchbaseframe.datasource.c;
import com.taobao.android.searchbaseframe.datasource.result.SearchResult;
import com.taobao.android.searchbaseframe.net.NetError;
import com.taobao.android.searchbaseframe.net.ResultError;
import com.taobao.android.searchbaseframe.net.ResultException;
import com.taobao.android.searchbaseframe.net.a;
import com.taobao.android.searchbaseframe.net.e;
import com.taobao.android.searchbaseframe.net.f;
import com.taobao.android.searchbaseframe.track.d;
import java.util.Map;
import tb.itt;

/* loaded from: classes6.dex */
public abstract class isk<RESULT extends SearchResult> implements ism<RESULT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public imn f29279a;
    public ioy b;

    static {
        kge.a(-1990854370);
        kge.a(-743264252);
    }

    public abstract void a(e eVar, RESULT result, c.a aVar);

    public abstract void a(e eVar, RESULT result, com.taobao.android.searchbaseframe.net.c cVar, c.a aVar, boolean z, Runnable runnable, d dVar);

    public abstract void a(e eVar, RESULT result, f fVar, c.a aVar);

    public void a(e eVar, ResultError resultError, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44e57e2f", new Object[]{this, eVar, resultError, map});
        }
    }

    public void a(e eVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a901d53", new Object[]{this, eVar, map});
        }
    }

    public abstract void a(Object obj, RESULT result);

    public boolean a(RESULT result, e eVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4ef2a1", new Object[]{this, result, eVar, map})).booleanValue();
        }
        return false;
    }

    public boolean a(com.taobao.android.searchbaseframe.net.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("828ba797", new Object[]{this, dVar})).booleanValue();
        }
        return false;
    }

    public abstract a b(Map<String, String> map);

    public abstract com.taobao.android.searchbaseframe.net.d b(Map<String, String> map, com.taobao.android.searchbaseframe.net.d dVar);

    public abstract com.taobao.android.searchbaseframe.net.d c(Map<String, String> map, a.C0571a c0571a);

    public isk(imn imnVar, ioy ioyVar) {
        this.f29279a = imnVar;
        this.b = ioyVar;
    }

    @Override // tb.ism
    public void a(Map<String, String> map, a.C0571a c0571a, final isl<RESULT> islVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b7b5d30", new Object[]{this, map, c0571a, islVar});
            return;
        }
        final f<?, ?> b = this.f29279a.d().b();
        if (b == null) {
            RESULT a2 = islVar.a();
            a2.setResultError(new ResultError(6, ""));
            islVar.b(a2);
            return;
        }
        b.a(c(map, c0571a), new f.a() { // from class: tb.isk.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.taobao.android.searchbaseframe.net.f.a
            public void a(e eVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("828c1bf2", new Object[]{this, eVar});
                    return;
                }
                SearchResult a3 = islVar.a();
                isk.this.a(eVar, a3, b, null);
                islVar.a(a3);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.taobao.android.searchbaseframe.net.f.a
            public void b(e eVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f8064233", new Object[]{this, eVar});
                    return;
                }
                SearchResult a3 = islVar.a();
                NetError c = eVar.c();
                if (c != null) {
                    a3.setResultError(new ResultError(c.getCode(), c.getMsg()));
                } else {
                    a3.setResultError(new ResultError(0, ""));
                }
                islVar.b(a3);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.taobao.android.searchbaseframe.net.f.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                SearchResult a3 = islVar.a();
                a3.setSseFinished(true);
                islVar.c(a3);
            }

            @Override // com.taobao.android.searchbaseframe.net.f.a
            public boolean b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : islVar.b();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.taobao.android.searchbaseframe.net.f.a
            public void c() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5889b6a", new Object[]{this});
                    return;
                }
                SearchResult a3 = islVar.a();
                a3.setSseFinished(true);
                islVar.c(a3);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [com.taobao.android.searchbaseframe.net.e] */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.taobao.android.searchbaseframe.net.e] */
    @Override // tb.ism
    public boolean a(RESULT result, Map<String, String> map, d dVar, c.a aVar, a.C0571a c0571a, boolean z, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bae9f010", new Object[]{this, result, map, dVar, aVar, c0571a, new Boolean(z), runnable})).booleanValue();
        }
        com.taobao.android.searchbaseframe.net.c<?, ?> a2 = this.f29279a.d().a();
        com.taobao.android.searchbaseframe.net.c<?, ?> c = this.f29279a.d().c();
        com.taobao.android.searchbaseframe.net.c<com.taobao.android.searchbaseframe.net.a, e> d = this.f29279a.d().d();
        if (a2 == null) {
            result.setResultError(new ResultError(0, "no apiAdapter"));
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        com.taobao.android.searchbaseframe.net.d c2 = c(map, c0571a);
        if (a(c2) && c != null) {
            com.taobao.android.searchbaseframe.net.d b = b(map, c2);
            ?? a3 = c.a((com.taobao.android.searchbaseframe.net.c<?, ?>) b);
            dVar.h = System.currentTimeMillis() - currentTimeMillis;
            long currentTimeMillis2 = System.currentTimeMillis();
            a((e) a3, result, aVar);
            dVar.i = System.currentTimeMillis() - currentTimeMillis2;
            dVar.q = a3.d();
            dVar.p = a3.f();
            itt ittVar = (itt) c2;
            if (b instanceof com.taobao.android.searchbaseframe.net.a) {
                b.a(this.f29279a, ((itt.a) ittVar.b).c, (com.taobao.android.searchbaseframe.net.a) b, (e) a3);
            }
            return false;
        }
        ?? a4 = a2.a(c2, this.b);
        dVar.h = System.currentTimeMillis() - currentTimeMillis;
        dVar.z = its.b;
        if (a4.b() && a((isk<RESULT>) result, (e) a4, map) && d != null) {
            if (a(d, result, map, dVar, currentTimeMillis)) {
                a((e) a4, map);
                return false;
            }
            ResultError error = result.getError();
            if (error == null) {
                error = new ResultError(0, "fallback unknown error");
            }
            a((e) a4, error, map);
        }
        dVar.w = System.currentTimeMillis();
        a((e) a4, result, a2, aVar, z, runnable, dVar);
        dVar.i = dVar.x - dVar.w;
        dVar.q = a4.d();
        dVar.p = a4.f();
        return z;
    }

    private boolean a(com.taobao.android.searchbaseframe.net.c cVar, RESULT result, Map<String, String> map, d dVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a12f8c98", new Object[]{this, cVar, result, map, dVar, new Long(j)})).booleanValue();
        }
        com.taobao.android.searchbaseframe.net.a b = b(map);
        if (b == null) {
            return false;
        }
        e a2 = cVar.a((com.taobao.android.searchbaseframe.net.c) b);
        if (a2.b()) {
            result.setResultError(new ResultError(a2.c()));
            return false;
        }
        dVar.h = System.currentTimeMillis() - j;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            a((Object) e.a(a2), (JSONObject) result);
            if (result.isFailed()) {
                return false;
            }
            dVar.i = System.currentTimeMillis() - currentTimeMillis;
            dVar.q = a2.d();
            dVar.p = "";
            return true;
        } catch (ResultException e) {
            result.setResultError(e.getError());
            return false;
        }
    }

    @Override // tb.ism
    public void a(RESULT result, Object obj, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8a48637", new Object[]{this, result, obj, dVar});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        a(obj, result);
        dVar.i = System.currentTimeMillis() - currentTimeMillis;
    }

    public final imn a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (imn) ipChange.ipc$dispatch("f060694", new Object[]{this}) : this.f29279a;
    }
}
