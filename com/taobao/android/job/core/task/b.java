package com.taobao.android.job.core.task;

import com.android.alibaba.ip.runtime.IpChange;
import tb.riy;

/* loaded from: classes.dex */
public final class b<T, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final T f13003a;
    private final R b;
    private int c;
    private final String d;
    private final d e;

    private b(T t, R r, int i, String str, d dVar) {
        this.c = 2;
        this.f13003a = t;
        this.b = r;
        this.c = i;
        this.d = str;
        this.e = dVar;
    }

    public static <T, R> b<T, R> a(T t, R r, long j, long j2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("ee276b02", new Object[]{t, r, new Long(j), new Long(j2)}) : new b<>(t, r, 2, "", d.a(j, j2));
    }

    public static <T, R> b<T, R> a(T t, R r, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("3abc0578", new Object[]{t, r, str}) : new b<>(t, r, 0, str, d.a(-1L, -1L));
    }

    public T a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("bd3407ca", new Object[]{this}) : this.f13003a;
    }

    public d b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("dd214457", new Object[]{this}) : this.e;
    }

    public R c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (R) ipChange.ipc$dispatch("ca3f7d08", new Object[]{this}) : this.b;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.c;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : 2 == this.c;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.c == 0;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        T t = this.f13003a;
        if (t != null) {
            i = t.hashCode();
        }
        return 31 + i;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        T t = this.f13003a;
        if (t == null) {
            if (bVar.f13003a != null) {
                return false;
            }
        } else if (!t.equals(bVar.f13003a)) {
            return false;
        }
        return true;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ExecutionResult [id=" + this.f13003a + ", result=" + this.b + ", status=" + this.c + ", message=" + this.d + riy.ARRAY_END_STR;
    }
}
