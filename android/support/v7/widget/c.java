package android.support.v7.widget;

import android.support.v4.util.Pools;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.t;
import java.util.ArrayList;
import java.util.List;
import tb.riy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c implements t.a {

    /* renamed from: a  reason: collision with root package name */
    final ArrayList<b> f1478a;
    final ArrayList<b> b;
    final a c;
    Runnable d;
    final boolean e;
    final t f;
    private Pools.Pool<b> g;
    private int h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        RecyclerView.ViewHolder a(int i);

        void a(int i, int i2);

        void a(int i, int i2, Object obj);

        void a(b bVar);

        void b(int i, int i2);

        void b(b bVar);

        void c(int i, int i2);

        void d(int i, int i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        int f1479a;
        int b;
        Object c;
        int d;

        b(int i, int i2, int i3, Object obj) {
            this.f1479a = i;
            this.b = i2;
            this.d = i3;
            this.c = obj;
        }

        String a() {
            int i = this.f1479a;
            return i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i = this.f1479a;
            if (i != bVar.f1479a) {
                return false;
            }
            if (i == 8 && Math.abs(this.d - this.b) == 1 && this.d == bVar.b && this.b == bVar.d) {
                return true;
            }
            if (this.d != bVar.d || this.b != bVar.b) {
                return false;
            }
            Object obj2 = this.c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.c)) {
                    return false;
                }
            } else if (bVar.c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f1479a * 31) + this.b) * 31) + this.d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + riy.ARRAY_START_STR + a() + ",s:" + this.b + "c:" + this.d + ",p:" + this.c + riy.ARRAY_END_STR;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(a aVar) {
        this(aVar, false);
    }

    c(a aVar, boolean z) {
        this.g = new Pools.SimplePool(30);
        this.f1478a = new ArrayList<>();
        this.b = new ArrayList<>();
        this.h = 0;
        this.c = aVar;
        this.e = z;
        this.f = new t(this);
    }

    private void b(b bVar) {
        g(bVar);
    }

    private void c(b bVar) {
        boolean z;
        char c;
        int i = bVar.b;
        int i2 = bVar.b + bVar.d;
        int i3 = bVar.b;
        int i4 = 0;
        char c2 = 65535;
        while (i3 < i2) {
            if (this.c.a(i3) != null || d(i3)) {
                if (c2 == 0) {
                    e(a(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 1;
            } else {
                if (c2 == 1) {
                    g(a(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            c2 = c;
        }
        if (i4 != bVar.d) {
            a(bVar);
            bVar = a(2, i, i4, null);
        }
        if (c2 == 0) {
            e(bVar);
        } else {
            g(bVar);
        }
    }

    private int d(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        for (int size = this.b.size() - 1; size >= 0; size--) {
            b bVar = this.b.get(size);
            if (bVar.f1479a == 8) {
                if (bVar.b < bVar.d) {
                    i4 = bVar.b;
                    i5 = bVar.d;
                } else {
                    i4 = bVar.d;
                    i5 = bVar.b;
                }
                if (i < i4 || i > i5) {
                    if (i < bVar.b) {
                        if (i2 == 1) {
                            bVar.b++;
                            i6 = bVar.d + 1;
                        } else if (i2 == 2) {
                            bVar.b--;
                            i6 = bVar.d - 1;
                        }
                        bVar.d = i6;
                    }
                } else if (i4 == bVar.b) {
                    if (i2 == 1) {
                        i8 = bVar.d + 1;
                    } else {
                        if (i2 == 2) {
                            i8 = bVar.d - 1;
                        }
                        i++;
                    }
                    bVar.d = i8;
                    i++;
                } else {
                    if (i2 == 1) {
                        i7 = bVar.b + 1;
                    } else {
                        if (i2 == 2) {
                            i7 = bVar.b - 1;
                        }
                        i--;
                    }
                    bVar.b = i7;
                    i--;
                }
            } else if (bVar.b > i) {
                if (i2 == 1) {
                    i3 = bVar.b + 1;
                } else if (i2 == 2) {
                    i3 = bVar.b - 1;
                }
                bVar.b = i3;
            } else if (bVar.f1479a == 1) {
                i -= bVar.d;
            } else if (bVar.f1479a == 2) {
                i += bVar.d;
            }
        }
        for (int size2 = this.b.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.b.get(size2);
            if (bVar2.f1479a == 8) {
                if (bVar2.d != bVar2.b && bVar2.d >= 0) {
                }
                this.b.remove(size2);
                a(bVar2);
            } else {
                if (bVar2.d > 0) {
                }
                this.b.remove(size2);
                a(bVar2);
            }
        }
        return i;
    }

    private void d(b bVar) {
        int i = bVar.b;
        int i2 = bVar.b + bVar.d;
        int i3 = i;
        int i4 = 0;
        char c = 65535;
        for (int i5 = bVar.b; i5 < i2; i5++) {
            if (this.c.a(i5) != null || d(i5)) {
                if (c == 0) {
                    e(a(4, i3, i4, bVar.c));
                    i3 = i5;
                    i4 = 0;
                }
                c = 1;
            } else {
                if (c == 1) {
                    g(a(4, i3, i4, bVar.c));
                    i3 = i5;
                    i4 = 0;
                }
                c = 0;
            }
            i4++;
        }
        if (i4 != bVar.d) {
            Object obj = bVar.c;
            a(bVar);
            bVar = a(4, i3, i4, obj);
        }
        if (c == 0) {
            e(bVar);
        } else {
            g(bVar);
        }
    }

    private boolean d(int i) {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.b.get(i2);
            if (bVar.f1479a == 8) {
                if (a(bVar.d, i2 + 1) == i) {
                    return true;
                }
            } else if (bVar.f1479a == 1) {
                int i3 = bVar.b + bVar.d;
                for (int i4 = bVar.b; i4 < i3; i4++) {
                    if (a(i4, i2 + 1) == i) {
                        return true;
                    }
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    private void e(b bVar) {
        int i;
        if (bVar.f1479a == 1 || bVar.f1479a == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int d = d(bVar.b, bVar.f1479a);
        int i2 = bVar.b;
        int i3 = bVar.f1479a;
        if (i3 == 2) {
            i = 0;
        } else if (i3 != 4) {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        } else {
            i = 1;
        }
        int i4 = d;
        int i5 = i2;
        int i6 = 1;
        for (int i7 = 1; i7 < bVar.d; i7++) {
            int d2 = d(bVar.b + (i * i7), bVar.f1479a);
            int i8 = bVar.f1479a;
            if (i8 == 2 ? d2 == i4 : i8 == 4 && d2 == i4 + 1) {
                i6++;
            } else {
                b a2 = a(bVar.f1479a, i4, i6, bVar.c);
                a(a2, i5);
                a(a2);
                if (bVar.f1479a == 4) {
                    i5 += i6;
                }
                i4 = d2;
                i6 = 1;
            }
        }
        Object obj = bVar.c;
        a(bVar);
        if (i6 <= 0) {
            return;
        }
        b a3 = a(bVar.f1479a, i4, i6, obj);
        a(a3, i5);
        a(a3);
    }

    private void f(b bVar) {
        g(bVar);
    }

    private void g(b bVar) {
        this.b.add(bVar);
        int i = bVar.f1479a;
        if (i == 1) {
            this.c.c(bVar.b, bVar.d);
        } else if (i == 2) {
            this.c.b(bVar.b, bVar.d);
        } else if (i == 4) {
            this.c.a(bVar.b, bVar.d, bVar.c);
        } else if (i == 8) {
            this.c.d(bVar.b, bVar.d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    int a(int i, int i2) {
        int size = this.b.size();
        while (i2 < size) {
            b bVar = this.b.get(i2);
            if (bVar.f1479a == 8) {
                if (bVar.b == i) {
                    i = bVar.d;
                } else {
                    if (bVar.b < i) {
                        i--;
                    }
                    if (bVar.d <= i) {
                        i++;
                    }
                }
            } else if (bVar.b > i) {
                continue;
            } else if (bVar.f1479a == 2) {
                if (i < bVar.b + bVar.d) {
                    return -1;
                }
                i -= bVar.d;
            } else if (bVar.f1479a == 1) {
                i += bVar.d;
            }
            i2++;
        }
        return i;
    }

    @Override // android.support.v7.widget.t.a
    public b a(int i, int i2, int i3, Object obj) {
        b acquire = this.g.acquire();
        if (acquire == null) {
            return new b(i, i2, i3, obj);
        }
        acquire.f1479a = i;
        acquire.b = i2;
        acquire.d = i3;
        acquire.c = obj;
        return acquire;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        a(this.f1478a);
        a(this.b);
        this.h = 0;
    }

    @Override // android.support.v7.widget.t.a
    public void a(b bVar) {
        if (!this.e) {
            bVar.c = null;
            this.g.release(bVar);
        }
    }

    void a(b bVar, int i) {
        this.c.a(bVar);
        int i2 = bVar.f1479a;
        if (i2 == 2) {
            this.c.a(i, bVar.d);
        } else if (i2 != 4) {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        } else {
            this.c.a(i, bVar.d, bVar.c);
        }
    }

    void a(List<b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a(list.get(i));
        }
        list.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(int i) {
        return (i & this.h) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f1478a.add(a(8, i, i2, null));
        this.h |= 8;
        return this.f1478a.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(int i, int i2, Object obj) {
        if (i2 <= 0) {
            return false;
        }
        this.f1478a.add(a(4, i, i2, obj));
        this.h |= 4;
        return this.f1478a.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(int i) {
        return a(i, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        this.f.a(this.f1478a);
        int size = this.f1478a.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.f1478a.get(i);
            int i2 = bVar.f1479a;
            if (i2 == 1) {
                f(bVar);
            } else if (i2 == 2) {
                c(bVar);
            } else if (i2 == 4) {
                d(bVar);
            } else if (i2 == 8) {
                b(bVar);
            }
            Runnable runnable = this.d;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f1478a.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(int i, int i2) {
        if (i2 <= 0) {
            return false;
        }
        this.f1478a.add(a(1, i, i2, null));
        this.h |= 1;
        return this.f1478a.size() == 1;
    }

    public int c(int i) {
        int size = this.f1478a.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f1478a.get(i2);
            int i3 = bVar.f1479a;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 8) {
                        if (bVar.b == i) {
                            i = bVar.d;
                        } else {
                            if (bVar.b < i) {
                                i--;
                            }
                            if (bVar.d <= i) {
                                i++;
                            }
                        }
                    }
                } else if (bVar.b > i) {
                    continue;
                } else if (bVar.b + bVar.d > i) {
                    return -1;
                } else {
                    i -= bVar.d;
                }
            } else if (bVar.b <= i) {
                i += bVar.d;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            this.c.b(this.b.get(i));
        }
        a(this.b);
        this.h = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(int i, int i2) {
        if (i2 <= 0) {
            return false;
        }
        this.f1478a.add(a(2, i, i2, null));
        this.h |= 2;
        return this.f1478a.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return this.f1478a.size() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        c();
        int size = this.f1478a.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.f1478a.get(i);
            int i2 = bVar.f1479a;
            if (i2 == 1) {
                this.c.b(bVar);
                this.c.c(bVar.b, bVar.d);
            } else if (i2 == 2) {
                this.c.b(bVar);
                this.c.a(bVar.b, bVar.d);
            } else if (i2 == 4) {
                this.c.b(bVar);
                this.c.a(bVar.b, bVar.d, bVar.c);
            } else if (i2 == 8) {
                this.c.b(bVar);
                this.c.d(bVar.b, bVar.d);
            }
            Runnable runnable = this.d;
            if (runnable != null) {
                runnable.run();
            }
        }
        a(this.f1478a);
        this.h = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        return !this.b.isEmpty() && !this.f1478a.isEmpty();
    }
}
