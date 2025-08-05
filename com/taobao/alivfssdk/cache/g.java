package com.taobao.alivfssdk.cache;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes.dex */
public class g<K, V> implements j<K, V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f8494a;
    private int b;
    private int c;
    private int d;
    private int e;
    private final HashMap<K, k<K, V>> f;
    private k<K, V> g;
    private k<K, V> h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;

    static {
        kge.a(1132848859);
        kge.a(2116812525);
    }

    public int a(V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6251237", new Object[]{this, v})).intValue();
        }
        return 1;
    }

    public g(int i, float f) {
        a(i, f);
        this.f = new HashMap<>();
    }

    public void a(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c114785", new Object[]{this, new Integer(i), new Float(f)});
        } else if (i < 2 || f < 0.0f || f >= 1.0f) {
            throw new RuntimeException("HotEndLruCache size parameters error");
        } else {
            synchronized (this) {
                this.f8494a = i;
                this.b = (int) (i * f);
                if (this.b <= 0) {
                    this.b = 1;
                } else if (i - this.b <= 0) {
                    this.b = i - 1;
                }
            }
            a(this.f8494a);
        }
    }

    private void a(k<K, V> kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32c53946", new Object[]{this, kVar});
        } else if (kVar == null) {
        } else {
            this.d -= kVar.c;
            if (kVar.g) {
                return;
            }
            this.e -= kVar.c;
        }
    }

    private void b(k<K, V> kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("999df907", new Object[]{this, kVar});
        } else if (kVar == null) {
        } else {
            this.d += kVar.c;
        }
    }

    private void a(boolean z, k<K, V> kVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7015aca", new Object[]{this, new Boolean(z), kVar, new Boolean(z2)});
        } else {
            b(false, kVar, z2);
        }
    }

    private void b(boolean z, k<K, V> kVar, boolean z2) {
        IpChange ipChange = $ipChange;
        boolean z3 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa92e4b", new Object[]{this, new Boolean(z), kVar, new Boolean(z2)});
            return;
        }
        synchronized (this) {
            if (z == kVar.i) {
                z3 = false;
            }
            if (z3) {
                kVar.i = z;
                if (z) {
                    this.i += kVar.c;
                } else {
                    this.i -= kVar.c;
                }
            }
        }
    }

    private void c(k<K, V> kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b8c8", new Object[]{this, kVar});
            return;
        }
        if (kVar.f == kVar) {
            f(null);
            g(null);
        } else {
            kVar.f.e = kVar.e;
            kVar.e.f = kVar.f;
            if (this.g == kVar) {
                f(kVar.f);
            }
            if (this.h == kVar) {
                g(kVar.f);
            }
        }
        a((k) kVar);
    }

    public V a(K k, boolean z) {
        k<K, V> remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("71867022", new Object[]{this, k, new Boolean(z)});
        }
        synchronized (this) {
            remove = this.f.remove(k);
            if (remove != null) {
                remove.d = -1;
                if (remove.e != null) {
                    c((k) remove);
                }
            }
        }
        if (remove == null) {
            return null;
        }
        a(false, (k) remove, z);
        return remove.b;
    }

    @Override // com.taobao.alivfssdk.cache.j
    public final V b(K k) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (V) ipChange.ipc$dispatch("eeb6464d", new Object[]{this, k}) : a((g<K, V>) k, true);
    }

    @Override // com.taobao.alivfssdk.cache.j
    public synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
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

    @Override // com.taobao.alivfssdk.cache.j
    public V c(K k) {
        k<K, V> kVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("45d4372c", new Object[]{this, k});
        }
        synchronized (this) {
            kVar = this.f.get(k);
            if (kVar != null) {
                kVar.d = kVar.d < 0 ? 1 : kVar.d + 1;
            }
        }
        if (kVar != null) {
            b(false, kVar, true);
            this.j++;
            return kVar.b;
        }
        this.k++;
        return null;
    }

    private void d(k<K, V> kVar) {
        k<K, V> kVar2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("674f7889", new Object[]{this, kVar});
            return;
        }
        k<K, V> kVar3 = this.g;
        if (kVar3 != null) {
            kVar.a(kVar3);
        } else {
            kVar.e = kVar;
            kVar.f = kVar;
        }
        if (this.h == this.g) {
            z = true;
        }
        a((k) kVar, true);
        if (this.e <= this.b || (kVar2 = this.h) == null) {
            return;
        }
        if (z) {
            k<K, V> kVar4 = kVar2.e;
            k<K, V> kVar5 = this.h;
            if (kVar4 != kVar5) {
                this.e -= kVar5.c;
                this.h.g = true;
            }
        }
        g(this.h.e);
    }

    private void e(k<K, V> kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce28384a", new Object[]{this, kVar});
            return;
        }
        k<K, V> kVar2 = this.h;
        if (kVar2 != null) {
            kVar.a(kVar2);
        }
        b(kVar, true);
    }

    private void f(k<K, V> kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3500f80b", new Object[]{this, kVar});
        } else {
            a((k) kVar, false);
        }
    }

    private void a(k<K, V> kVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25e2a24e", new Object[]{this, kVar, new Boolean(z)});
            return;
        }
        if (kVar != null) {
            if (z || kVar.g) {
                this.e += kVar.c;
            }
            kVar.g = false;
        }
        this.g = kVar;
    }

    private boolean g(k<K, V> kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9bd9b7d0", new Object[]{this, kVar})).booleanValue() : b(kVar, false);
    }

    private boolean b(k<K, V> kVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a21dab1", new Object[]{this, kVar, new Boolean(z)})).booleanValue();
        }
        this.h = kVar;
        if (kVar == null || this.g == kVar) {
            return false;
        }
        if (!z && !kVar.g) {
            this.e -= kVar.c;
        }
        kVar.g = true;
        return true;
    }

    @Override // com.taobao.alivfssdk.cache.j
    public boolean a(K k, V v) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("184a7924", new Object[]{this, k, v})).booleanValue() : a(17, (int) k, (K) v);
    }

    public boolean a(int i, K k, V v) {
        k<K, V> put;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c02742d7", new Object[]{this, new Integer(i), k, v})).booleanValue();
        }
        if (k == null || v == null) {
            return false;
        }
        k<K, V> kVar = new k<>(k, v, a((g<K, V>) v));
        if (i == 34) {
            kVar.d = 2;
        }
        if (kVar.c > this.f8494a) {
            return false;
        }
        synchronized (this) {
            put = this.f.put(k, kVar);
            if (put != null) {
                int i2 = put.d;
                c((k) put);
                kVar.d = i2 + 1;
            }
        }
        if (put != null) {
            a(true, (k) put, true);
        }
        boolean a2 = a(this.f8494a - kVar.c);
        synchronized (this) {
            if (this.g != null && this.h != null && a2) {
                e(kVar);
                b((k) kVar);
            }
            d(kVar);
            b((k) kVar);
            if (this.h == null && this.d > this.b) {
                g(this.g.e);
            }
        }
        a(a2);
        return true;
    }

    public final boolean a(int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        k<K, V> kVar = null;
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
                kVar = this.g.e;
                this.f.remove(kVar.f8496a);
                c((k) kVar);
                this.l++;
            }
            a(false, (k) kVar, true);
        }
        if (kVar != null) {
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
            k<K, V> kVar = this.g.e;
            k<K, V> kVar2 = kVar;
            while (this.i < this.c) {
                if (kVar2.d < 2) {
                    b(true, kVar2, true);
                }
                kVar2 = kVar2.e;
                if (kVar2 == kVar) {
                    break;
                }
            }
            this.m = this.d;
        }
    }
}
