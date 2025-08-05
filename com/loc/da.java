package com.loc;

import android.os.SystemClock;
import com.loc.cz;
import java.util.List;

/* loaded from: classes4.dex */
public final class da {
    private static volatile da g;
    private static Object h = new Object();
    private long c;
    private ef d;
    private ef f = new ef();

    /* renamed from: a  reason: collision with root package name */
    private cz f7743a = new cz();
    private db b = new db();
    private cw e = new cw();

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public ef f7744a;
        public List<eg> b;
        public long c;
        public long d;
        public boolean e;
        public long f;
        public byte g;
        public String h;
        public List<dz> i;
        public boolean j;
    }

    private da() {
    }

    public static da a() {
        if (g == null) {
            synchronized (h) {
                if (g == null) {
                    g = new da();
                }
            }
        }
        return g;
    }

    public final dc a(a aVar) {
        dc dcVar = null;
        if (aVar == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.d == null || aVar.f7744a.a(this.d) >= 10.0d) {
            cz.a a2 = this.f7743a.a(aVar.f7744a, aVar.j, aVar.g, aVar.h, aVar.i);
            List<eg> a3 = this.b.a(aVar.f7744a, aVar.b, aVar.e, aVar.d, currentTimeMillis);
            if (a2 != null || a3 != null) {
                dx.a(this.f, aVar.f7744a, aVar.f, currentTimeMillis);
                dcVar = new dc(0, this.e.a(this.f, a2, aVar.c, a3));
            }
            this.d = aVar.f7744a;
            this.c = elapsedRealtime;
        }
        return dcVar;
    }
}
