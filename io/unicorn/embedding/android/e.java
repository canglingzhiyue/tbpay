package io.unicorn.embedding.android;

import android.util.LongSparseArray;
import android.view.MotionEvent;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;
import tb.kge;

/* loaded from: classes9.dex */
public final class e {
    private static e c;

    /* renamed from: a  reason: collision with root package name */
    private final LongSparseArray<MotionEvent> f24818a = new LongSparseArray<>();
    private final PriorityQueue<Long> b = new PriorityQueue<>();

    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final AtomicLong f24819a;
        private final long b;

        static {
            kge.a(1671546599);
            f24819a = new AtomicLong(0L);
        }

        private a(long j) {
            this.b = j;
        }

        public static a a() {
            return a(f24819a.incrementAndGet());
        }

        public static a a(long j) {
            return new a(j);
        }

        public long b() {
            return this.b;
        }
    }

    static {
        kge.a(-2053231380);
    }

    private e() {
    }

    public static e a() {
        if (c == null) {
            c = new e();
        }
        return c;
    }

    public MotionEvent a(a aVar) {
        while (!this.b.isEmpty() && this.b.peek().longValue() < aVar.b) {
            this.f24818a.remove(this.b.poll().longValue());
        }
        if (!this.b.isEmpty() && this.b.peek().longValue() == aVar.b) {
            this.b.poll();
        }
        MotionEvent motionEvent = this.f24818a.get(aVar.b);
        this.f24818a.remove(aVar.b);
        return motionEvent;
    }

    public a a(MotionEvent motionEvent) {
        a a2 = a.a();
        this.f24818a.put(a2.b, MotionEvent.obtain(motionEvent));
        this.b.add(Long.valueOf(a2.b));
        return a2;
    }
}
