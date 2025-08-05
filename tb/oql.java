package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.navigation.d;
import com.taobao.tao.navigation.e;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public class oql {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private opx f32296a;
    private Set<oqk> b;
    private oqy c;
    private qzl d;
    private suf e;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static oql f32298a;

        static {
            kge.a(1283679275);
            f32298a = new oql();
        }

        public static /* synthetic */ oql a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (oql) ipChange.ipc$dispatch("f08cf94", new Object[0]) : f32298a;
        }
    }

    static {
        kge.a(667531981);
    }

    private oql() {
        this.b = new CopyOnWriteArraySet();
        l();
    }

    public static oql a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (oql) ipChange.ipc$dispatch("f08cf94", new Object[0]) : a.a();
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        this.c = new oqy();
        e.a(new d() { // from class: tb.oql.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.navigation.d
            public void onTabChanged(int i, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("91f35fc8", new Object[]{this, new Integer(i), str});
                } else {
                    oql.this.a(i, str);
                }
            }
        });
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        for (oqk oqkVar : this.b) {
            oqkVar.a(context);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.c.a();
        for (oqk oqkVar : this.b) {
            oqkVar.bP_();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.c.b();
        for (oqk oqkVar : this.b) {
            oqkVar.du_();
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        for (oqk oqkVar : this.b) {
            oqkVar.g();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        for (oqk oqkVar : this.b) {
            oqkVar.dw_();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        for (oqk oqkVar : this.b) {
            oqkVar.dS_();
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        for (oqk oqkVar : this.b) {
            oqkVar.h();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        for (oqk oqkVar : this.b) {
            oqkVar.dO_();
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.c.c();
        for (oqk oqkVar : this.b) {
            oqkVar.d();
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        Iterator<oqk> it = this.b.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        for (oqk oqkVar : this.b) {
            oqkVar.e();
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        for (oqk oqkVar : this.b) {
            oqkVar.a(i);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        for (oqk oqkVar : this.b) {
            oqkVar.k_(str);
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        for (oqk oqkVar : this.b) {
            oqkVar.a(z);
        }
    }

    public void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            return;
        }
        for (oqk oqkVar : this.b) {
            oqkVar.a(i, str);
        }
    }

    public void a(oqk oqkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f868df6f", new Object[]{this, oqkVar});
        } else {
            this.b.add(oqkVar);
        }
    }

    public void b(oqk oqkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6ebe5f0", new Object[]{this, oqkVar});
        } else {
            this.b.remove(oqkVar);
        }
    }

    public opx k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (opx) ipChange.ipc$dispatch("5bf942fd", new Object[]{this});
        }
        if (this.f32296a == null) {
            this.f32296a = new opx();
        }
        return this.f32296a;
    }

    public qzl o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qzl) ipChange.ipc$dispatch("7ac0e54d", new Object[]{this});
        }
        if (this.d == null) {
            this.d = new qzl();
        }
        return this.d;
    }

    public suf i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (suf) ipChange.ipc$dispatch("4c97da52", new Object[]{this});
        }
        if (this.e == null) {
            this.e = new suf();
        }
        return this.e;
    }
}
