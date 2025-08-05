package com.taobao.taobaoavsdk.Tracer;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.analysis.v3.f;
import com.taobao.analysis.v3.p;
import com.taobao.analysis.v3.r;
import com.taobao.analysis.v3.v;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public abstract class BaseAnalysis implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f21314a;
    private boolean c;
    private f d;
    private final Map<String, p> e = new HashMap();
    private a f = new a();
    private final r b = FalcoGlobalTracer.get();

    /* loaded from: classes8.dex */
    public enum Stage {
        INIT_PLAYER,
        PREPARE,
        PLAYING,
        PAUSE,
        RELEASE,
        SEEK,
        MUTE,
        FIRST_FRAME,
        VIDEO_STALL,
        VIDEO_ERROR
    }

    static {
        kge.a(827432100);
        kge.a(152610286);
        f21314a = false;
    }

    public BaseAnalysis() {
        if (this.b == null) {
            return;
        }
        this.c = true;
        if (f21314a) {
            return;
        }
        v.b().d();
        f21314a = true;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (c()) {
            this.d = this.b.a(c.MODULE_SDK_PAGE, c.SCENE_PREFIX + g()).a();
            for (String str : h()) {
                this.e.put(str, this.d.c(str));
            }
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!b()) {
        } else {
            this.d.b(str);
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        p e = e(str);
        if (e == null) {
            return;
        }
        e.a(null);
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        p e = e(str);
        if (e == null) {
            return;
        }
        e.b(null);
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        p e = e(str);
        if (e == null) {
            return;
        }
        this.d.b("failed");
        e.a(null, str2);
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else if (!b()) {
        } else {
            this.d.a(str, str2);
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else if (!b()) {
        } else {
            this.d.a(str);
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : c() && this.d != null;
    }

    public p e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p) ipChange.ipc$dispatch("d545af1", new Object[]{this, str});
        }
        if (!c() || this.e.isEmpty()) {
            return null;
        }
        return this.e.get(str);
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : f() && this.c;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bd7c30f", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.f.f21315a = aVar.f21315a;
            this.f.b = aVar.b;
            this.f.c = aVar.c;
            this.f.d = aVar.d;
            this.f.e = aVar.e;
            this.f.f = aVar.f;
            this.f.g = aVar.g;
            this.f.h = aVar.h;
            this.f.i = aVar.i;
            this.f.j = aVar.j;
            this.f.k = aVar.k;
            this.f.l = aVar.l;
            this.f.m = aVar.m;
            this.f.n = aVar.n;
            this.f.o = aVar.o;
            this.f.p = aVar.p;
        }
    }

    public a d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("47d1ef52", new Object[]{this}) : this.f;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.f = new a();
        }
    }
}
