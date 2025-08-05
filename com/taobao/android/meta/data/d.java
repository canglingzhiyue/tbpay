package com.taobao.android.meta.data;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.rul;

/* loaded from: classes6.dex */
public final class d<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f14272a;
    private final HashSet<Runnable> b;
    private T c;

    /* loaded from: classes6.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ rul b;

        public a(rul rulVar) {
            this.b = rulVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.b.mo2421invoke(d.a(d.this));
            }
        }
    }

    static {
        kge.a(-823216536);
    }

    public d(T t) {
        this.f14272a = true;
        this.b = new HashSet<>();
        this.c = t;
    }

    public static final /* synthetic */ Object a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ed4e4fd1", new Object[]{dVar}) : dVar.c;
    }

    public d(T t, boolean z) {
        this(t);
        this.f14272a = z;
    }

    public final void a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, t});
            return;
        }
        b(t);
        T t2 = this.c;
        this.c = t;
        if (!(!q.a(t2, t))) {
            return;
        }
        Iterator<Runnable> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public final void a(rul<? super T, t> consumer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc03baf", new Object[]{this, consumer});
            return;
        }
        q.c(consumer, "consumer");
        a(true, consumer);
    }

    public final void a(boolean z, rul<? super T, t> consumer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5305eb3", new Object[]{this, new Boolean(z), consumer});
            return;
        }
        q.c(consumer, "consumer");
        if (z) {
            this.b.add(new a(consumer));
        }
        consumer.mo2421invoke((T) this.c);
    }

    public final T a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("bd3407ca", new Object[]{this}) : this.c;
    }

    private final void b(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, t});
        } else if (!this.f14272a && t == null) {
            throw new IllegalArgumentException("value can not be null");
        }
    }
}
