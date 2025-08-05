package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.ut.abtest.UTABEnvironment;
import com.alibaba.ut.abtest.UTABMethod;
import com.alibaba.ut.abtest.bucketing.expression.e;
import com.alibaba.ut.abtest.bucketing.expression.f;
import com.alibaba.ut.abtest.bucketing.feature.a;
import com.alibaba.ut.abtest.event.c;
import com.alibaba.ut.abtest.internal.util.h;
import com.alibaba.ut.abtest.internal.util.k;
import com.alibaba.ut.abtest.internal.util.n;
import com.alibaba.ut.abtest.internal.util.s;
import com.alibaba.ut.abtest.push.d;
import com.alibaba.ut.abtest.track.b;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public final class cex {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static cex f26260a;
    private volatile Context b;
    private UTABEnvironment c;
    private boolean d;
    private volatile Boolean e;
    private volatile UTABMethod f;
    private boolean g = true;
    private e h;
    private cer i;
    private a j;
    private cet k;
    private b l;
    private com.alibaba.ut.abtest.pipeline.a m;
    private d n;
    private com.alibaba.ut.abtest.internal.debug.b o;
    private volatile c p;
    private cfa q;
    private String r;
    private String s;

    static {
        kge.a(-1521714423);
    }

    private cex() {
    }

    public static synchronized cex a() {
        synchronized (cex.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (cex) ipChange.ipc$dispatch("f032f88", new Object[0]);
            }
            if (f26260a == null) {
                f26260a = new cex();
            }
            return f26260a;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.r = k.b().a("uid", (String) null);
        this.s = k.b().a("un", (String) null);
        h.a("ABContext", "获取本地存储用户信息. userId=" + this.r + ", userNick=" + this.s);
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            this.b = context;
        }
    }

    public Context c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("c833dc62", new Object[]{this});
        }
        if (this.b == null) {
            return s.a();
        }
        return this.b;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.d;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        if (this.e == null) {
            try {
                if (this.b == null) {
                    return false;
                }
                if ((this.b.getApplicationInfo().flags & 2) == 0) {
                    z = false;
                }
                this.e = Boolean.valueOf(z);
            } catch (Throwable th) {
                Log.e("EVO.ABContext", "Debug 包判断失败", th);
                this.e = false;
            }
        }
        return this.e.booleanValue();
    }

    public UTABMethod f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UTABMethod) ipChange.ipc$dispatch("bf244dea", new Object[]{this}) : this.f;
    }

    public void a(UTABMethod uTABMethod) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10d3a209", new Object[]{this, uTABMethod});
            return;
        }
        h.a("ABContext", "setCurrentApiMethod, apiMethod=" + uTABMethod + ", currentApiMethod=" + this.f);
        if (this.f != null && this.f == uTABMethod) {
            return;
        }
        this.f = uTABMethod;
        if (this.f != UTABMethod.Pull) {
            return;
        }
        m().b();
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.g;
    }

    public e h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("b6a25904", new Object[]{this});
        }
        if (this.h == null) {
            synchronized (this) {
                if (this.h == null) {
                    this.h = new f();
                }
            }
        }
        return this.h;
    }

    public cer i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cer) ipChange.ipc$dispatch("4c9059c6", new Object[]{this});
        }
        if (this.i == null) {
            synchronized (this) {
                if (this.i == null) {
                    this.i = new ces();
                }
            }
        }
        return this.i;
    }

    public cet j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cet) ipChange.ipc$dispatch("5441ff63", new Object[]{this});
        }
        if (this.k == null) {
            synchronized (this) {
                if (this.k == null) {
                    this.k = new ceu();
                }
            }
        }
        return this.k;
    }

    public b k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("f48bba92", new Object[]{this});
        }
        if (this.l == null) {
            synchronized (this) {
                if (this.l == null) {
                    this.l = new com.alibaba.ut.abtest.track.c();
                }
            }
        }
        return this.l;
    }

    public com.alibaba.ut.abtest.pipeline.a l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.ut.abtest.pipeline.a) ipChange.ipc$dispatch("9ff053d1", new Object[]{this});
        }
        if (this.m == null) {
            synchronized (this) {
                if (this.m == null) {
                    this.m = new com.alibaba.ut.abtest.pipeline.b();
                }
            }
        }
        return this.m;
    }

    public d m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("73c55d5", new Object[]{this});
        }
        if (this.n == null) {
            synchronized (this) {
                if (this.n == null) {
                    this.n = new com.alibaba.ut.abtest.push.e();
                }
            }
        }
        return this.n;
    }

    public com.alibaba.ut.abtest.internal.debug.b n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.ut.abtest.internal.debug.b) ipChange.ipc$dispatch("50cb10ef", new Object[]{this});
        }
        if (this.o == null) {
            synchronized (this) {
                if (this.o == null) {
                    this.o = new com.alibaba.ut.abtest.internal.debug.c();
                }
            }
        }
        return this.o;
    }

    public c o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("54c88206", new Object[]{this});
        }
        if (this.p == null) {
            synchronized (this) {
                if (this.p == null) {
                    this.p = new com.alibaba.ut.abtest.event.d();
                }
            }
        }
        return this.p;
    }

    public a p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("344f6564", new Object[]{this});
        }
        if (this.j == null) {
            synchronized (this) {
                if (this.j == null) {
                    this.j = new com.alibaba.ut.abtest.bucketing.feature.b();
                }
            }
        }
        return this.j;
    }

    public cfa q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cfa) ipChange.ipc$dispatch("8a1d8670", new Object[]{this});
        }
        if (this.q == null) {
            synchronized (this) {
                if (this.q == null) {
                    this.q = new cfb();
                }
            }
        }
        return this.q;
    }

    public String r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9ed849c7", new Object[]{this}) : this.r;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.r = n.b(str);
        k.b().c("uid", this.r);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        k.b().c("luid", this.r);
    }

    public String s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("255e0466", new Object[]{this}) : this.s;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        this.s = n.b(str);
        k.b().c("un", this.s);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        k.b().c("lun", this.s);
    }

    public UTABEnvironment t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UTABEnvironment) ipChange.ipc$dispatch("eb7922a6", new Object[]{this}) : this.c;
    }

    public void a(UTABEnvironment uTABEnvironment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1f5553", new Object[]{this, uTABEnvironment});
        } else {
            this.c = uTABEnvironment;
        }
    }
}
