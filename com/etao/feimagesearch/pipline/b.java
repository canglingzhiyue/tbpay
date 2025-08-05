package com.etao.feimagesearch.pipline;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.q;
import tb.crl;
import tb.kge;

/* loaded from: classes3.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f6931a;
    private final ConcurrentLinkedQueue<crl> b = new ConcurrentLinkedQueue<>();
    private final Handler c = new Handler(Looper.getMainLooper());

    /* loaded from: classes3.dex */
    public interface a {
        void a(crl crlVar);
    }

    /* renamed from: com.etao.feimagesearch.pipline.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class RunnableC0244b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ crl b;

        public RunnableC0244b(crl crlVar) {
            this.b = crlVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            a a2 = b.a(b.this);
            if (a2 == null) {
                return;
            }
            a2.a(this.b);
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ crl b;

        public c(crl crlVar) {
            this.b = crlVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            a a2 = b.a(b.this);
            if (a2 == null) {
                return;
            }
            a2.a(this.b);
        }
    }

    static {
        kge.a(-961654964);
    }

    public static final /* synthetic */ a a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("cdfb4711", new Object[]{bVar}) : bVar.f6931a;
    }

    public final void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a7c6a8b", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.f6931a = aVar;
            crl poll = this.b.poll();
            while (poll != null) {
                a aVar2 = this.f6931a;
                if (aVar2 == null) {
                    q.a();
                }
                aVar2.a(poll);
                poll = this.b.poll();
            }
        }
    }

    public final void a(crl crlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3fd43db", new Object[]{this, crlVar});
        } else if (crlVar == null) {
        } else {
            if (this.f6931a == null) {
                this.b.add(crlVar);
            } else {
                this.c.post(new RunnableC0244b(crlVar));
            }
        }
    }

    public final void a(crl crlVar, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("328661a", new Object[]{this, crlVar, l});
        } else if (crlVar == null) {
        } else {
            long j = 0;
            long longValue = l != null ? l.longValue() : 0L;
            if (longValue >= 0) {
                j = longValue;
            }
            if (this.f6931a == null) {
                this.b.add(crlVar);
            } else {
                this.c.postDelayed(new c(crlVar), j);
            }
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b.clear();
        this.c.removeCallbacksAndMessages(null);
        this.f6931a = null;
    }
}
