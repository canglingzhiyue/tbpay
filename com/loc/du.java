package com.loc;

import android.os.SystemClock;
import android.util.LongSparseArray;
import java.util.List;

/* loaded from: classes4.dex */
public final class du {
    private static volatile du g;
    private static Object h = new Object();
    private Object e = new Object();
    private Object f = new Object();

    /* renamed from: a  reason: collision with root package name */
    private LongSparseArray<a> f7748a = new LongSparseArray<>();
    private LongSparseArray<a> b = new LongSparseArray<>();
    private LongSparseArray<a> c = new LongSparseArray<>();
    private LongSparseArray<a> d = new LongSparseArray<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f7749a;
        long b;
        boolean c;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    private du() {
    }

    public static du a() {
        if (g == null) {
            synchronized (h) {
                if (g == null) {
                    g = new du();
                }
            }
        }
        return g;
    }

    private static short a(LongSparseArray<a> longSparseArray, long j) {
        synchronized (longSparseArray) {
            a aVar = longSparseArray.get(j);
            if (aVar == null) {
                return (short) 0;
            }
            short max = (short) Math.max(1L, Math.min(32767L, (b() - aVar.b) / 1000));
            if (!aVar.c) {
                max = (short) (-max);
            }
            return max;
        }
    }

    private static void a(List<dt> list, LongSparseArray<a> longSparseArray, LongSparseArray<a> longSparseArray2) {
        long b = b();
        if (longSparseArray.size() == 0) {
            for (dt dtVar : list) {
                a aVar = new a((byte) 0);
                aVar.f7749a = dtVar.b();
                aVar.b = b;
                aVar.c = false;
                longSparseArray2.put(dtVar.a(), aVar);
            }
            return;
        }
        for (dt dtVar2 : list) {
            long a2 = dtVar2.a();
            a aVar2 = longSparseArray.get(a2);
            if (aVar2 == null) {
                aVar2 = new a((byte) 0);
            } else if (aVar2.f7749a == dtVar2.b()) {
                longSparseArray2.put(a2, aVar2);
            }
            aVar2.f7749a = dtVar2.b();
            aVar2.b = b;
            aVar2.c = true;
            longSparseArray2.put(a2, aVar2);
        }
    }

    private static long b() {
        return SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final short a(long j) {
        return a(this.f7748a, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(List<dt> list) {
        if (list.isEmpty()) {
            return;
        }
        synchronized (this.e) {
            a(list, this.f7748a, this.b);
            LongSparseArray<a> longSparseArray = this.f7748a;
            this.f7748a = this.b;
            this.b = longSparseArray;
            this.b.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final short b(long j) {
        return a(this.c, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(List<dt> list) {
        if (list.isEmpty()) {
            return;
        }
        synchronized (this.f) {
            a(list, this.c, this.d);
            LongSparseArray<a> longSparseArray = this.c;
            this.c = this.d;
            this.d = longSparseArray;
            this.d.clear();
        }
    }
}
