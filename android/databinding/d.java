package android.databinding;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class d<C, T, A> implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private List<C> f1047a = new ArrayList();
    private long b = 0;
    private long[] c;
    private int d;
    private final a<C, T, A> e;

    /* loaded from: classes2.dex */
    public static abstract class a<C, T, A> {
        public abstract void a(C c, T t, int i, A a2);
    }

    public d(a<C, T, A> aVar) {
        this.e = aVar;
    }

    private void a(int i, long j) {
        long j2 = Long.MIN_VALUE;
        for (int i2 = (i + 64) - 1; i2 >= i; i2--) {
            if ((j & j2) != 0) {
                this.f1047a.remove(i2);
            }
            j2 >>>= 1;
        }
    }

    private void a(T t, int i, A a2, int i2) {
        if (i2 < 0) {
            b(t, i, a2);
            return;
        }
        long j = this.c[i2];
        int i3 = (i2 + 1) << 6;
        int min = Math.min(this.f1047a.size(), i3 + 64);
        a(t, i, a2, i2 - 1);
        a(t, i, a2, i3, min, j);
    }

    private void a(T t, int i, A a2, int i2, int i3, long j) {
        long j2 = 1;
        while (i2 < i3) {
            if ((j & j2) == 0) {
                this.e.a(this.f1047a.get(i2), t, i, a2);
            }
            j2 <<= 1;
            i2++;
        }
    }

    private boolean a(int i) {
        int i2;
        if (i < 64) {
            return ((1 << i) & this.b) != 0;
        }
        long[] jArr = this.c;
        if (jArr == null || (i2 = (i / 64) - 1) >= jArr.length) {
            return false;
        }
        return ((1 << (i % 64)) & jArr[i2]) != 0;
    }

    private void b(int i) {
        if (i < 64) {
            this.b = (1 << i) | this.b;
            return;
        }
        int i2 = (i / 64) - 1;
        long[] jArr = this.c;
        if (jArr == null) {
            this.c = new long[this.f1047a.size() / 64];
        } else if (jArr.length < i2) {
            long[] jArr2 = new long[this.f1047a.size() / 64];
            long[] jArr3 = this.c;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.c = jArr2;
        }
        long j = 1 << (i % 64);
        long[] jArr4 = this.c;
        jArr4[i2] = j | jArr4[i2];
    }

    private void b(T t, int i, A a2) {
        a(t, i, a2, 0, Math.min(64, this.f1047a.size()), this.b);
    }

    private void c(T t, int i, A a2) {
        int size = this.f1047a.size();
        long[] jArr = this.c;
        int length = jArr == null ? -1 : jArr.length - 1;
        a(t, i, a2, length);
        a(t, i, a2, (length + 2) << 6, size, 0L);
    }

    /* renamed from: a */
    public synchronized d<C, T, A> clone() {
        d<C, T, A> dVar;
        CloneNotSupportedException e;
        try {
            dVar = (d) super.clone();
        } catch (CloneNotSupportedException e2) {
            dVar = null;
            e = e2;
        }
        try {
            dVar.b = 0L;
            dVar.c = null;
            dVar.d = 0;
            dVar.f1047a = new ArrayList();
            int size = this.f1047a.size();
            for (int i = 0; i < size; i++) {
                if (!a(i)) {
                    dVar.f1047a.add(this.f1047a.get(i));
                }
            }
        } catch (CloneNotSupportedException e3) {
            e = e3;
            e.printStackTrace();
            return dVar;
        }
        return dVar;
    }

    public synchronized void a(C c) {
        int lastIndexOf = this.f1047a.lastIndexOf(c);
        if (lastIndexOf < 0 || a(lastIndexOf)) {
            this.f1047a.add(c);
        }
    }

    public synchronized void a(T t, int i, A a2) {
        this.d++;
        c(t, i, a2);
        this.d--;
        if (this.d == 0) {
            if (this.c != null) {
                for (int length = this.c.length - 1; length >= 0; length--) {
                    long j = this.c[length];
                    if (j != 0) {
                        a((length + 1) << 6, j);
                        this.c[length] = 0;
                    }
                }
            }
            if (this.b != 0) {
                a(0, this.b);
                this.b = 0L;
            }
        }
    }

    public synchronized void b(C c) {
        if (this.d == 0) {
            this.f1047a.remove(c);
            return;
        }
        int lastIndexOf = this.f1047a.lastIndexOf(c);
        if (lastIndexOf >= 0) {
            b(lastIndexOf);
        }
    }
}
