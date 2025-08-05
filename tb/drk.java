package tb;

import android.os.SystemClock;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.support.basics.e;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class drk<V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f26923a;
    public V b;
    public String c;
    public drx d;
    public Callable<V> e;
    public final Object f = new Object();

    public Pair<Boolean, V> a(e eVar) {
        boolean a2;
        boolean z;
        Pair<Boolean, V> pair;
        V v;
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("7ef6daf5", new Object[]{this, eVar});
        }
        V v2 = null;
        if (drm.f26925a) {
            boolean a3 = a();
            if (a3) {
                v = this.b;
                z2 = true;
            } else {
                try {
                    v = this.e.call();
                    z2 = true;
                } catch (Throwable th) {
                    th.printStackTrace();
                    v = null;
                }
                if (z2) {
                    a((drk<V>) v);
                } else {
                    v = null;
                }
            }
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            StringBuilder sb = new StringBuilder();
            sb.append("refreshed: ");
            sb.append(!a3);
            sb.append(" for ");
            sb.append(this);
            e.a(eVar, timeUnit, "Cache", sb.toString());
            Boolean valueOf = Boolean.valueOf(z2);
            if (z2) {
                v2 = v;
            }
            return new Pair<>(valueOf, v2);
        }
        synchronized (this.f) {
            if (!a()) {
                V call = this.e.call();
                z = true;
                if (1 != 0) {
                    a((drk<V>) call);
                }
            } else {
                z = true;
            }
            e.a(eVar, TimeUnit.MICROSECONDS, "Cache", "refreshed: " + (true ^ a2) + " for " + this);
            Boolean valueOf2 = Boolean.valueOf(z);
            if (z) {
                v2 = this.b;
            }
            pair = new Pair<>(valueOf2, v2);
        }
        return pair;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        drx drxVar = this.d;
        if ((drxVar instanceof dyv) || (drxVar instanceof hiv) || !(drxVar instanceof dvy)) {
            return;
        }
        dvy dvyVar = (dvy) drxVar;
        dvz dvzVar = new dvz(dvyVar, this);
        dvyVar.b = dvzVar;
        dvyVar.f27026a.registerComponentCallbacks(dvzVar);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "CacheItem{entryKey='" + this.c + "', isValid=" + this.f26923a + ", invalidPolicy=" + ied.a(this.d) + ", value=" + ied.a(this.b) + '}';
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        drx drxVar = this.d;
        if (!(drxVar instanceof dyv) && (drxVar instanceof hiv)) {
            hiv hivVar = (hiv) drxVar;
            if (hivVar.c != Long.MIN_VALUE && SystemClock.elapsedRealtime() - hivVar.c < hivVar.f28696a.toMillis(hivVar.b)) {
                z = true;
            }
            this.f26923a = z;
        }
        return this.f26923a;
    }

    public void a(V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, v});
        } else if (drm.f26925a) {
            this.b = v;
            drx drxVar = this.d;
            if (!(drxVar instanceof dyv) && (drxVar instanceof hiv)) {
                hiv hivVar = (hiv) drxVar;
                hivVar.getClass();
                hivVar.c = SystemClock.elapsedRealtime();
            }
            this.f26923a = true;
        } else {
            synchronized (this.f) {
                drx drxVar2 = this.d;
                if (!(drxVar2 instanceof dyv) && (drxVar2 instanceof hiv)) {
                    hiv hivVar2 = (hiv) drxVar2;
                    hivVar2.getClass();
                    hivVar2.c = SystemClock.elapsedRealtime();
                }
                this.f26923a = true;
                this.b = v;
            }
        }
    }

    public static <V> drk<V> a(drl<V> drlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (drk) ipChange.ipc$dispatch("63cd4acf", new Object[]{drlVar});
        }
        drk<V> drkVar = new drk<>();
        drkVar.f26923a = false;
        drkVar.b = null;
        drkVar.c = drlVar.f26924a;
        drkVar.d = drlVar.b;
        drkVar.e = drlVar.c;
        return drkVar;
    }
}
