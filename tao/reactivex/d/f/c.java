package tao.reactivex.d.f;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import tao.reactivex.d.h.j;
import tb.kge;
import tb.mup;

/* loaded from: classes9.dex */
public final class c<T> implements mup<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final int f25138a;
    private static final Object j;
    public int c;
    public long d;
    public final int e;
    public AtomicReferenceArray<Object> f;
    public final int g;
    public AtomicReferenceArray<Object> h;
    public final AtomicLong b = new AtomicLong();
    public final AtomicLong i = new AtomicLong();

    static {
        kge.a(-1471013134);
        kge.a(-1471016014);
        f25138a = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
        j = new Object();
    }

    public c(int i) {
        int a2 = j.a(Math.max(8, i));
        int i2 = a2 - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(a2 + 1);
        this.f = atomicReferenceArray;
        this.e = i2;
        a(a2);
        this.h = atomicReferenceArray;
        this.g = i2;
        this.d = i2 - 1;
        a(0L);
    }

    private static int a(long j2, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c11c71a", new Object[]{new Long(j2), new Integer(i)})).intValue() : b(((int) j2) & i);
    }

    private long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : this.b.get();
    }

    private T a(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("9dc66421", new Object[]{this, atomicReferenceArray, new Long(j2), new Integer(i)});
        }
        this.h = atomicReferenceArray;
        int a2 = a(j2, i);
        T t = (T) b(atomicReferenceArray, a2);
        if (t != null) {
            a(atomicReferenceArray, a2, (Object) null);
            b(j2 + 1);
        }
        return t;
    }

    private AtomicReferenceArray<Object> a(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicReferenceArray) ipChange.ipc$dispatch("e4a9212f", new Object[]{this, atomicReferenceArray, new Integer(i)});
        }
        int b = b(i);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) b(atomicReferenceArray, b);
        a(atomicReferenceArray, b, (Object) null);
        return atomicReferenceArray2;
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.c = Math.min(i / 4, f25138a);
        }
    }

    private void a(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j2)});
        } else {
            this.b.lazySet(j2);
        }
    }

    private static void a(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b0b3ed", new Object[]{atomicReferenceArray, new Integer(i), obj});
        } else {
            atomicReferenceArray.lazySet(i, obj);
        }
    }

    private void a(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i, T t, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23ea4f97", new Object[]{this, atomicReferenceArray, new Long(j2), new Integer(i), t, new Long(j3)});
            return;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f = atomicReferenceArray2;
        this.d = (j3 + j2) - 1;
        a(atomicReferenceArray2, i, t);
        a(atomicReferenceArray, atomicReferenceArray2);
        a(atomicReferenceArray, i, j);
        a(j2 + 1);
    }

    private void a(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827712fc", new Object[]{this, atomicReferenceArray, atomicReferenceArray2});
        } else {
            a(atomicReferenceArray, b(atomicReferenceArray.length() - 1), atomicReferenceArray2);
        }
    }

    private boolean a(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b30fcb91", new Object[]{this, atomicReferenceArray, t, new Long(j2), new Integer(i)})).booleanValue();
        }
        a(atomicReferenceArray, i, t);
        a(j2 + 1);
        return true;
    }

    private static int b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{new Integer(i)})).intValue() : i;
    }

    private long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.i.get();
    }

    private static <E> Object b(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("7354f402", new Object[]{atomicReferenceArray, new Integer(i)}) : atomicReferenceArray.get(i);
    }

    private void b(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j2)});
        } else {
            this.i.lazySet(j2);
        }
    }

    private long f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e1", new Object[]{this})).longValue() : this.b.get();
    }

    private long g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f962", new Object[]{this})).longValue() : this.i.get();
    }

    @Override // tb.muw
    public boolean a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, t})).booleanValue();
        }
        if (t == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray<Object> atomicReferenceArray = this.f;
        long f = f();
        int i = this.e;
        int a2 = a(f, i);
        if (f < this.d) {
            return a(atomicReferenceArray, t, f, a2);
        }
        long j2 = this.c + f;
        if (b(atomicReferenceArray, a(j2, i)) == null) {
            this.d = j2 - 1;
            return a(atomicReferenceArray, t, f, a2);
        } else if (b(atomicReferenceArray, a(1 + f, i)) == null) {
            return a(atomicReferenceArray, t, f, a2);
        } else {
            a(atomicReferenceArray, f, a2, t, i);
            return true;
        }
    }

    @Override // tb.mup, tb.muw
    public T c() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("ca3f7d08", new Object[]{this});
        }
        AtomicReferenceArray<Object> atomicReferenceArray = this.h;
        long g = g();
        int i = this.g;
        int a2 = a(g, i);
        T t = (T) b(atomicReferenceArray, a2);
        if (t == j) {
            z = true;
        }
        if (t == null || z) {
            if (!z) {
                return null;
            }
            return a(a(atomicReferenceArray, i + 1), g, i);
        }
        a(atomicReferenceArray, a2, (Object) null);
        b(g + 1);
        return t;
    }

    @Override // tb.muw
    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : a() == b();
    }

    @Override // tb.muw
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        while (true) {
            if (c() == null && d()) {
                return;
            }
        }
    }
}
