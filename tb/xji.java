package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* loaded from: classes5.dex */
public class xji {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile xji f34329a;
    private static boolean j;
    private double c;
    private int e;
    private int g;
    private float d = -1.0f;
    private int f = -1;
    private int h = -1;
    private int i = -1;
    private Context b = Globals.getApplication();

    static {
        kge.a(-1089611573);
        f34329a = null;
    }

    public static xji a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xji) ipChange.ipc$dispatch("f0ccc47", new Object[0]);
        }
        xji xjiVar = f34329a;
        f34329a = null;
        return xjiVar == null ? new xji() : xjiVar;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else if (!ipa.a(false, false, "guess")) {
            j = false;
        } else {
            j = true;
            xji xjiVar = new xji();
            xjiVar.i();
            f34329a = xjiVar;
            fjt.a(fjt.TAG_TIP, "preCacheNewDetailKernelContext Success。");
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : j;
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        j();
        h();
        g();
    }

    public xji() {
        k();
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.g;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.e;
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        this.f = this.e;
        this.d = this.g / this.f;
    }

    public float f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1dd", new Object[]{this})).floatValue();
        }
        if (this.d < 0.0f) {
            j();
        }
        return this.d;
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        this.g = fmt.b(this.b);
        this.e = fmt.a(this.b);
        this.c = this.g / 750.0d;
    }

    public int a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue() : (int) Math.ceil(i * this.c);
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue();
        }
        if (this.i < 0) {
            this.i = fjm.a(this.b);
        }
        return this.i;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue();
        }
        if (this.h < 0) {
            this.h = fjm.b(this.b);
        }
        return this.h;
    }
}
