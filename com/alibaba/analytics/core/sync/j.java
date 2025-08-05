package com.alibaba.analytics.core.sync;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.aob;
import tb.aor;
import tb.apb;
import tb.apf;
import tb.apr;
import tb.kge;

/* loaded from: classes.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static j f2103a;
    private boolean b = false;
    private h c = null;
    private h d = null;
    private boolean e = false;
    private e f = null;
    private int g = 0;

    static {
        kge.a(1521327085);
    }

    public static synchronized j a() {
        synchronized (j.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (j) ipChange.ipc$dispatch("165ef9bd", new Object[0]);
            }
            if (f2103a == null) {
                f2103a = new j();
            }
            return f2103a;
        }
    }

    private j() {
    }

    public h b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("df5ff0c0", new Object[]{this});
        }
        if (this.c == null) {
            this.c = c();
        }
        return this.c;
    }

    public h c() {
        h e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("a860e801", new Object[]{this});
        }
        this.e = true;
        this.d = this.c;
        this.f = apb.a().c();
        this.g = apb.a().d();
        e eVar = this.f;
        if (eVar != null && (e = eVar.e()) != null) {
            this.b = true;
            this.c = e;
            return this.c;
        }
        if (this.b && o.b().d() < 50) {
            o.b().e();
            this.b = false;
        }
        h e2 = aor.a().e();
        if (e2 != null) {
            this.c = e2;
            return this.c;
        }
        this.c = i.a().e();
        return this.c;
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("617dc0c5", new Object[]{this, bVar});
        } else if (bVar == null || aob.a().d() || this.c == null) {
        } else {
            b(bVar);
            if (this.c.c() == 2) {
                e eVar = this.f;
                if (eVar == null) {
                    return;
                }
                eVar.a(bVar);
            } else if (this.c.c() == 1) {
                aor.a().a(bVar);
            } else {
                i.a().a(bVar);
            }
        }
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.g;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue();
        }
        h hVar = this.c;
        if (hVar == null || hVar.c() != 2 || this.c.c() != 2) {
            return 0;
        }
        return this.c.d();
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue();
        }
        h hVar = this.d;
        if (hVar == null || this.c == null || !this.e) {
            return 0;
        }
        this.e = false;
        apr.b("TnetHostPortMgrCenter", "LastTnetHostPort type", Integer.valueOf(hVar.c()), "TnetHostPort type", Integer.valueOf(this.c.c()));
        return (this.d.c() != 2 || this.c.c() == 2) ? 0 : 1;
    }

    public void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b89bb1a4", new Object[]{this, bVar});
        } else if (!bVar.f || !g.a().b() || !com.alibaba.analytics.core.config.q.a().a(19997, "_ut_nw")) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(com.taobao.tao.content.business.b.CT, "" + bVar.b);
            hashMap.put("rt", "" + bVar.c);
            hashMap.put("rs", "" + bVar.d);
            hashMap.put("success", "" + (bVar.a() ? 1 : 0));
            int d = d();
            if (d == 2) {
                int e = apb.a().e();
                if (e <= 0) {
                    e = 0;
                }
                hashMap.put("sip", "" + e);
            }
            apf.a().a(new com.alibaba.analytics.core.model.a("UT", "19997", "_ut_nw", "" + e(), "" + d, hashMap));
        }
    }
}
