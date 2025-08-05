package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.meta.uikit.MetaLayout;
import com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a;
import com.taobao.android.searchbaseframe.meta.uikit.header.behavior.b;
import com.taobao.android.searchbaseframe.meta.uikit.header.behavior.c;
import com.taobao.android.searchbaseframe.meta.uikit.header.behavior.d;
import com.taobao.android.searchbaseframe.meta.uikit.header.behavior.e;

/* loaded from: classes6.dex */
public class ite implements itk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public iuk f29306a;
    public a b;
    private boolean c;
    private int d;
    private boolean e;
    private boolean f;
    private boolean g;
    private htc h;
    private boolean i;

    static {
        kge.a(-1569274194);
        kge.a(-1925021278);
        kge.a(903233860);
    }

    public ite(iuk iukVar) {
        this(iukVar, null);
    }

    public ite(iuk iukVar, htc htcVar) {
        this.e = true;
        this.f = false;
        this.g = false;
        this.i = false;
        this.f29306a = iukVar;
        this.h = htcVar;
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else {
            this.i = true;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public void a(String str) {
        a h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        iuk iukVar = this.f29306a;
        if ((iukVar instanceof itl) && (h = ((itl) iukVar).h()) != null) {
            this.b = h;
            h.a(this);
            return;
        }
        this.b = a(this.f29306a, str);
        a aVar = this.b;
        if (aVar == null) {
            throw new IllegalArgumentException("未知的 header 类型");
        }
        aVar.a(this);
    }

    public a a(iuk iukVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("c5b39f97", new Object[]{this, iukVar, str}) : a(str, iukVar.getView(), this.c);
    }

    @Override // tb.itj
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.b.a(i);
        }
    }

    @Override // tb.itj
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.b.b(i);
        }
    }

    @Override // tb.itj
    public int a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2619792e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        int a2 = this.b.a(i, i2, i3);
        float h = this.b.h();
        iuk iukVar = this.f29306a;
        if (iukVar instanceof itl) {
            ((itl) iukVar).a(f(), h);
        }
        if (a(h, 0.0f)) {
            l();
        } else {
            m();
        }
        return a2;
    }

    public static boolean a(float f, float f2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0fea6c", new Object[]{new Float(f), new Float(f2)})).booleanValue() : Math.abs(f - f2) <= 1.0E-5f;
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        this.e = false;
        n();
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        this.e = true;
        n();
    }

    @Override // tb.itj
    public d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("8db2ad19", new Object[]{this}) : this.b.a();
    }

    @Override // tb.itk
    public View d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f7f4866d", new Object[]{this}) : this.b.d();
    }

    @Override // tb.itk
    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.b.e();
    }

    @Override // tb.itk
    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.b.f();
    }

    @Override // tb.itj
    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b.b();
    }

    @Override // tb.itk
    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.b.g();
    }

    @Override // tb.itk
    public boolean bw_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("10839e35", new Object[]{this})).booleanValue() : this.i;
    }

    @Override // tb.itj
    public void a(MetaLayout metaLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b8809f", new Object[]{this, metaLayout});
        } else {
            this.b.a(metaLayout);
        }
    }

    @Override // tb.itj
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.b.c();
    }

    public a a(String str, View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("240933c8", new Object[]{this, str, view, new Boolean(z)});
        }
        htc htcVar = this.h;
        a a2 = htcVar != null ? htcVar.a(str, view, z, this.d) : null;
        if (a2 != null) {
            return a2;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -892259863:
                if (str.equals("sticky")) {
                    c = 0;
                    break;
                }
                break;
            case -424367108:
                if (str.equals(itk.TYPE_HALF_STICKY)) {
                    c = 1;
                    break;
                }
                break;
            case 3148801:
                if (str.equals(itk.TYPE_FOLD)) {
                    c = 3;
                    break;
                }
                break;
            case 3322014:
                if (str.equals("list")) {
                    c = 2;
                    break;
                }
                break;
        }
        if (c == 0) {
            return new e(view, z, this.d);
        }
        if (c == 1) {
            return new b(view, z, this.d);
        }
        if (c != 2 && c != 3) {
            return null;
        }
        return new c(view, z, this.d);
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        this.f = true;
        n();
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        this.f = false;
        n();
    }

    private void n() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        if (this.e && this.f) {
            z = true;
        }
        if (z == this.g) {
            return;
        }
        this.g = z;
        iuk iukVar = this.f29306a;
        if (!(iukVar instanceof itl)) {
            return;
        }
        if (z) {
            ((itl) iukVar).aG_();
        } else {
            ((itl) iukVar).aH_();
        }
    }
}
