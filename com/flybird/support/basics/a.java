package com.flybird.support.basics;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import tb.cum;
import tb.cun;
import tb.ieb;

/* loaded from: classes4.dex */
public final class a<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final int b;
    public final cum<T, Void, Throwable> c;
    public final int d;

    /* renamed from: a */
    public final ConcurrentLinkedQueue<T> f7229a = new ConcurrentLinkedQueue<>();
    public boolean e = false;
    public final Runnable f = new Runnable() { // from class: com.flybird.support.basics.-$$Lambda$a$nAT95qyZvNfn4tna-XQ2XDysKz8
        {
            a.this = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.m655lambda$nAT95qyZvNfn4tnaXQ2XDysKz8(a.this);
        }
    };

    public a(int i, int i2, cum<T, Void, Throwable> cumVar) {
        this.b = i;
        this.d = i2;
        this.c = cumVar;
    }

    public /* synthetic */ void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.e = false;
        cun.b("BatchRunner", "scheduled flushing");
        a();
    }

    /* renamed from: lambda$nAT95qyZvNfn4tna-XQ2XDysKz8 */
    public static /* synthetic */ void m655lambda$nAT95qyZvNfn4tnaXQ2XDysKz8(a aVar) {
        aVar.b();
    }

    public void a(T t) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, t});
            return;
        }
        try {
            this.f7229a.add(t);
            if (this.f7229a.size() >= this.b) {
                a();
            } else if (this.e || (i = this.d) <= 0) {
            } else {
                this.e = true;
                ieb.d.schedule(this.f, i, TimeUnit.SECONDS);
            }
        } catch (Throwable th) {
            cun.a("BatchRunner", "caught error, dropping", th);
            try {
                this.f7229a.clear();
            } catch (Throwable unused) {
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            final ArrayList arrayList = new ArrayList(this.b + 16);
            while (true) {
                T poll = this.f7229a.poll();
                if (poll != null) {
                    arrayList.add(poll);
                } else {
                    cun.b("BatchRunner", "flushing " + arrayList.size() + " items");
                    ieb.d.submit(new Runnable() { // from class: com.flybird.support.basics.a.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        {
                            a.this = this;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    a.this.c.apply(it.next());
                                }
                            } catch (Throwable th) {
                                cun.a("BatchRunner", "consume error", th);
                            }
                        }
                    });
                    return;
                }
            }
        } catch (Throwable th) {
            cun.a("BatchRunner", "caught error, dropping", th);
            try {
                this.f7229a.clear();
            } catch (Throwable unused) {
            }
        }
    }
}
