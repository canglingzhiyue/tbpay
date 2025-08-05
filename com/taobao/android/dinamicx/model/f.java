package com.taobao.android.dinamicx.model;

import android.content.Context;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.bg;
import com.taobao.android.dinamicx.bv;
import com.taobao.android.dinamicx.u;
import java.util.Locale;
import tb.fqi;
import tb.fux;
import tb.gbg;
import tb.kge;

/* loaded from: classes5.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static int f11890a;
    private boolean b = false;
    private boolean c = false;
    private int d = -1;
    private bv e;

    static {
        kge.a(-213001861);
        f11890a = 0;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue();
        }
        i();
        return f11890a == 1;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue();
        }
        i();
        return f11890a == 3;
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue();
        }
        i();
        return f11890a == 2;
    }

    private static void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[0]);
        } else if (f11890a != 0) {
        } else {
            Context i = DinamicXEngine.i();
            bg f = u.f();
            if (f == null) {
                f11890a = 1;
            } else if (Build.VERSION.SDK_INT >= 19 && f.a(i)) {
                f11890a = 2;
            } else if (f.c(i)) {
                f11890a = 3;
            } else {
                f11890a = 1;
            }
        }
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue();
        }
        bg f = u.f();
        if (e() || f == null) {
            return true;
        }
        if (!g()) {
            return false;
        }
        if (fqi.ba()) {
            String lowerCase = f.d(DinamicXEngine.i()).toLowerCase(Locale.ROOT);
            fux.a("deviceScreenType=" + lowerCase);
            return "min,small".contains(lowerCase);
        }
        return gbg.c();
    }

    public static f a(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("6dc0481d", new Object[]{dinamicXEngine});
        }
        if (dinamicXEngine != null && dinamicXEngine.b() != null) {
            return dinamicXEngine.b().z();
        }
        return null;
    }

    public static boolean a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8561a4f0", new Object[]{fVar})).booleanValue();
        }
        bg f = u.f();
        if (e() || fVar == null || f == null) {
            return false;
        }
        if (gbg.c()) {
            return fVar.a();
        }
        return fVar.b();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.c;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.d;
    }

    public bv d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bv) ipChange.ipc$dispatch("c6f4b6b3", new Object[]{this}) : this.e;
    }

    public void a(bv bvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156e6250", new Object[]{this, bvVar});
        } else {
            this.e = bvVar;
        }
    }
}
