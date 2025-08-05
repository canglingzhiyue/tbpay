package com.taobao.phenix.cache;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Locale;
import tb.kge;
import tb.niw;
import tb.riy;

/* loaded from: classes.dex */
public class b<K, V> implements c<K, V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f18864a;
    private int b;
    private int c;
    private int d;
    private int e;
    private HashMap<K, d<K, V>> f;
    private d<K, V> g;
    private d<K, V> h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;

    static {
        kge.a(-712352806);
        kge.a(-1242570964);
    }

    public int a(V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6251237", new Object[]{this, v})).intValue();
        }
        return 1;
    }

    public void a(boolean z, K k, V v, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbec930", new Object[]{this, new Boolean(z), k, v, new Boolean(z2)});
        }
    }

    public b(int i, float f) {
        a(i, f);
        this.f = new HashMap<>();
    }

    @Override // com.taobao.phenix.cache.c
    public void a(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c114785", new Object[]{this, new Integer(i), new Float(f)});
            return;
        }
        niw.d("Phenix", "HotEndLruCache resize: maxSize = " + i + ", hotPercent = " + f, new Object[0]);
        if (i < 2 || f < 0.0f || f >= 1.0f) {
            throw new RuntimeException("HotEndLruCache size parameters error");
        }
        synchronized (this) {
            this.f18864a = i;
            this.b = (int) (i * f);
            if (this.b <= 0) {
                this.b = 1;
            } else if (i - this.b <= 0) {
                this.b = i - 1;
            }
        }
        h();
        c(this.f18864a);
    }

    public final synchronized int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        return this.f.size();
    }

    @Override // com.taobao.phenix.cache.c
    public final synchronized int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        return this.d;
    }

    @Override // com.taobao.phenix.cache.c
    public final synchronized int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        return this.f18864a;
    }

    public final synchronized int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        return this.c;
    }

    @Override // com.taobao.phenix.cache.c
    public final synchronized float e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5c", new Object[]{this})).floatValue();
        }
        return this.b / this.f18864a;
    }

    private void h() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        if (this.c < this.f18864a) {
            z = true;
        }
        com.taobao.tcommon.core.b.a(z, "MAX_PRE_EVICTED_SIZE(" + this.c + ") must lower than MAX_LIMIT_SIZE(" + this.f18864a + riy.BRACKET_END_STR);
    }

    public synchronized void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        this.c = i;
        h();
        a(true);
    }

    private void a(d<K, V> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72b67cae", new Object[]{this, dVar});
        } else if (dVar == null) {
        } else {
            this.d -= dVar.c;
            if (dVar.g) {
                return;
            }
            this.e -= dVar.c;
        }
    }

    private void b(d<K, V> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fae6bc8d", new Object[]{this, dVar});
        } else if (dVar == null) {
        } else {
            this.d += dVar.c;
        }
    }

    private void a(boolean z, d<K, V> dVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df7e44ea", new Object[]{this, new Boolean(z), dVar, new Boolean(z2)});
        } else {
            a((d) dVar, false, z2, true);
        }
    }

    private void a(d<K, V> dVar, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        boolean z4 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44ecc4e6", new Object[]{this, dVar, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        synchronized (this) {
            if (z == dVar.i) {
                z4 = false;
            }
            if (z4) {
                dVar.i = z;
                if (z) {
                    this.i += dVar.c;
                } else {
                    this.i -= dVar.c;
                }
            }
        }
        if (!z4 || !z2) {
            return;
        }
        a(z, (boolean) dVar.f18865a, (K) dVar.b, z3);
    }

    private void c(d<K, V> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8316fc6c", new Object[]{this, dVar});
            return;
        }
        if (dVar.f == dVar) {
            f(null);
            g(null);
        } else {
            dVar.f.e = dVar.e;
            dVar.e.f = dVar.f;
            if (this.g == dVar) {
                f(dVar.f);
            }
            if (this.h == dVar) {
                g(dVar.f);
            }
        }
        a((d) dVar);
    }

    public V a(K k, boolean z) {
        d<K, V> remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("71867022", new Object[]{this, k, new Boolean(z)});
        }
        synchronized (this) {
            remove = this.f.remove(k);
            if (remove != null) {
                remove.d = -1;
                if (remove.e != null) {
                    c((d) remove);
                }
            }
        }
        if (remove == null) {
            return null;
        }
        a(false, (d) remove, z);
        return remove.b;
    }

    @Override // com.taobao.phenix.cache.c
    public final V b(K k) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (V) ipChange.ipc$dispatch("eeb6464d", new Object[]{this, k}) : a((b<K, V>) k, true);
    }

    @Override // com.taobao.phenix.cache.c
    public synchronized void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.f.clear();
        f(null);
        g(null);
        this.d = 0;
        this.e = 0;
        this.i = 0;
        this.m = 0;
    }

    public final synchronized boolean c(K k) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a8844ca", new Object[]{this, k})).booleanValue();
        }
        return this.f.containsKey(k);
    }

    @Override // com.taobao.phenix.cache.c
    public V d(K k) {
        d<K, V> dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("9cf2280b", new Object[]{this, k});
        }
        synchronized (this) {
            dVar = this.f.get(k);
            if (dVar != null) {
                dVar.d = dVar.d < 0 ? 1 : dVar.d + 1;
            }
        }
        if (dVar != null) {
            a((d) dVar, false, true, false);
            this.j++;
            return dVar.b;
        }
        this.k++;
        return null;
    }

    private void d(d<K, V> dVar) {
        d<K, V> dVar2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b473c4b", new Object[]{this, dVar});
            return;
        }
        d<K, V> dVar3 = this.g;
        if (dVar3 != null) {
            dVar.a(dVar3);
        } else {
            dVar.e = dVar;
            dVar.f = dVar;
        }
        if (this.h == this.g) {
            z = true;
        }
        a((d) dVar, true);
        if (this.e <= this.b || (dVar2 = this.h) == null) {
            return;
        }
        if (z) {
            d<K, V> dVar4 = dVar2.e;
            d<K, V> dVar5 = this.h;
            if (dVar4 != dVar5) {
                this.e -= dVar5.c;
                this.h.g = true;
            }
        }
        g(this.h.e);
    }

    private void e(d<K, V> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93777c2a", new Object[]{this, dVar});
            return;
        }
        d<K, V> dVar2 = this.h;
        if (dVar2 != null) {
            dVar.a(dVar2);
        }
        b(dVar, true);
    }

    private void f(d<K, V> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ba7bc09", new Object[]{this, dVar});
        } else {
            a((d) dVar, false);
        }
    }

    private void a(d<K, V> dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e419cbe6", new Object[]{this, dVar, new Boolean(z)});
            return;
        }
        if (dVar != null) {
            if (z || dVar.g) {
                this.e += dVar.c;
            }
            dVar.g = false;
        }
        this.g = dVar;
    }

    private boolean g(d<K, V> dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a3d7fbec", new Object[]{this, dVar})).booleanValue() : b(dVar, false);
    }

    private boolean b(d<K, V> dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61f187eb", new Object[]{this, dVar, new Boolean(z)})).booleanValue();
        }
        this.h = dVar;
        if (dVar == null || this.g == dVar) {
            return false;
        }
        if (!z && !dVar.g) {
            this.e -= dVar.c;
        }
        dVar.g = true;
        return true;
    }

    @Override // com.taobao.phenix.cache.c
    public boolean a(int i, K k, V v) {
        d<K, V> put;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c02742d7", new Object[]{this, new Integer(i), k, v})).booleanValue();
        }
        if (k == null || v == null) {
            return false;
        }
        d<K, V> dVar = new d<>(k, v, a((b<K, V>) v));
        if (i == 34) {
            dVar.d = 2;
        }
        if (dVar.c > this.f18864a) {
            return false;
        }
        synchronized (this) {
            put = this.f.put(k, dVar);
            if (put != null) {
                int i2 = put.d;
                c((d) put);
                dVar.d = i2 + 1;
            }
        }
        if (put != null) {
            a(true, (d) put, true);
        }
        boolean c = c(this.f18864a - dVar.c);
        synchronized (this) {
            if (this.g != null && this.h != null && c) {
                e(dVar);
                b((d) dVar);
            }
            d((d) dVar);
            b((d) dVar);
            if (this.h == null && this.d > this.b) {
                g(this.g.e);
            }
        }
        a(c);
        return true;
    }

    @Override // com.taobao.phenix.cache.c
    public final boolean c(int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab8b44dd", new Object[]{this, new Integer(i)})).booleanValue();
        }
        d<K, V> dVar = null;
        while (true) {
            synchronized (this) {
                if (this.d <= i) {
                    break;
                }
                while (this.g.e.d >= 2) {
                    this.g.e.d = 1;
                    f(this.g.e);
                    while (this.b > 0 && this.e > this.b && g(this.h.e)) {
                    }
                }
                dVar = this.g.e;
                this.f.remove(dVar.f18865a);
                c((d) dVar);
                this.l++;
            }
            a(false, (d) dVar, true);
        }
        if (dVar != null) {
            z = true;
        }
        return z;
    }

    private synchronized void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.g != null && (z || this.d > this.m)) {
            d<K, V> dVar = this.g.e;
            d<K, V> dVar2 = dVar;
            while (this.i < this.c) {
                if (dVar2.d < 2) {
                    a((d) dVar2, true, true, false);
                }
                dVar2 = dVar2.e;
                if (dVar2 == dVar) {
                    break;
                }
            }
            this.m = this.d;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!niw.a(3)) {
        } else {
            int i = this.j;
            niw.a(str, "%K(%K)/%K, pre-evicted:%K/%K, rate:%.1f%%, count:%d, hits:%d, misses:%d, evicts:%d", Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f18864a), Integer.valueOf(this.i), Integer.valueOf(this.c), Float.valueOf((i * 100.0f) / (i + this.k)), Integer.valueOf(a()), Integer.valueOf(this.j), Integer.valueOf(this.k), Integer.valueOf(this.l));
        }
    }

    public synchronized String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
        }
        return String.format(Locale.getDefault(), "[HotEndLruCache] %d/%d, hotSize:%d, preEvicted:%d, count:%d, hits:%d, misses:%d, evicts:%d", Integer.valueOf(this.d), Integer.valueOf(this.f18864a), Integer.valueOf(this.e), Integer.valueOf(this.i), Integer.valueOf(a()), Integer.valueOf(this.j), Integer.valueOf(this.k), Integer.valueOf(this.l));
    }
}
