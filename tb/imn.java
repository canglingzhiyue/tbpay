package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.chitu.a;
import com.taobao.android.searchbaseframe.chitu.d;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.b;
import com.taobao.android.searchbaseframe.util.h;
import com.taobao.android.searchbaseframe.util.k;
import de.greenrobot.event.c;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes6.dex */
public class imn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private iml b;
    private final isd c;
    private k d;
    private final b h;
    private final isj i;
    private final itb<BaseCellBean> j;
    private final itp<irq, BaseTypedBean> k;
    private a m;
    private d n;
    private com.taobao.android.searchbaseframe.chitu.lib.a o;

    /* renamed from: a  reason: collision with root package name */
    private final Set<Object> f29155a = new HashSet();
    private final com.taobao.android.searchbaseframe.util.d e = new com.taobao.android.searchbaseframe.util.d();
    private final isg f = new isg();
    private final itz g = new itz();
    private final h l = new h();
    private final isb p = new isb();
    private final c q = com.taobao.android.searchbaseframe.util.c.a();

    static {
        kge.a(-328038300);
    }

    public imn(iml imlVar) {
        this.b = imlVar;
        this.g.a(this);
        this.j = new itb<>(this);
        this.h = new b(this);
        this.k = new itp<>(this);
        this.i = new isj(this);
        this.c = new isd(this);
    }

    public void a(isc iscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee4457bf", new Object[]{this, iscVar});
            return;
        }
        Iterator<Object> it = this.f29155a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public iml a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iml) ipChange.ipc$dispatch("f060656", new Object[]{this}) : this.b;
    }

    public k b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("b0718cce", new Object[]{this});
        }
        if (this.d == null) {
            this.d = new k();
        }
        return this.d;
    }

    public isd c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (isd) ipChange.ipc$dispatch("1e6966a2", new Object[]{this}) : this.c;
    }

    public com.taobao.android.searchbaseframe.util.d d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.searchbaseframe.util.d) ipChange.ipc$dispatch("9b65d877", new Object[]{this}) : this.e;
    }

    public itz e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (itz) ipChange.ipc$dispatch("2dccb7cb", new Object[]{this}) : this.g;
    }

    public b f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("3fac9df6", new Object[]{this}) : this.h;
    }

    public isj g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (isj) ipChange.ipc$dispatch("3d2ffcd8", new Object[]{this}) : this.i;
    }

    public itb<BaseCellBean> h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (itb) ipChange.ipc$dispatch("44e1a500", new Object[]{this}) : this.j;
    }

    public itp<irq, BaseTypedBean> i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (itp) ipChange.ipc$dispatch("4c934c11", new Object[]{this}) : this.k;
    }

    public h j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("5c42be79", new Object[]{this}) : this.l;
    }

    public a k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("9dcf80aa", new Object[]{this});
        }
        if (this.m == null) {
            this.m = new a(this);
        }
        return this.m;
    }

    public d l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("d79a22e6", new Object[]{this});
        }
        if (this.n == null) {
            this.n = new d(this);
        }
        return this.n;
    }

    public isb m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (isb) ipChange.ipc$dispatch("6b59dc1a", new Object[]{this}) : this.p;
    }

    public com.taobao.android.searchbaseframe.chitu.lib.a n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.searchbaseframe.chitu.lib.a) ipChange.ipc$dispatch("d26fbb91", new Object[]{this});
        }
        if (this.o == null) {
            this.o = new com.taobao.android.searchbaseframe.chitu.lib.a();
        }
        return this.o;
    }

    public c o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("768aa173", new Object[]{this}) : this.q;
    }

    public isg p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (isg) ipChange.ipc$dispatch("826eccd2", new Object[]{this}) : this.f;
    }
}
