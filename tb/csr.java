package tb;

import android.os.Message;
import android.support.v4.util.Pools;
import android.text.TextUtils;
import com.alibaba.android.split.a;
import com.alibaba.android.split.k;
import com.alibaba.android.split.m;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.concurrent.ArrayBlockingQueue;

/* loaded from: classes2.dex */
public class csr extends Thread {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final csr f26497a;
    private bgu b = (bgu) a.b(bgu.class, "InstantiatorThread");
    private ArrayBlockingQueue<bnk> c = new ArrayBlockingQueue<>(10);
    private Pools.SynchronizedPool<bnk> d = new Pools.SynchronizedPool<>(10);

    static {
        kge.a(582945568);
        csr csrVar = new csr();
        f26497a = csrVar;
        csrVar.start();
    }

    public static csr a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (csr) ipChange.ipc$dispatch("f03635c", new Object[0]) : f26497a;
    }

    public void b() {
        try {
            bnk take = this.c.take();
            try {
                if (take.g != null && take.g.length > 0) {
                    take.e = Class.forName(take.d).getDeclaredConstructor(take.g).newInstance(take.f26000a);
                } else {
                    take.e = Class.forName(take.d).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                }
                if (take.i != null && take.i.get() != null && !TextUtils.isEmpty(take.h)) {
                    ((com.alibaba.android.split.manager.a) k.a()).c().a(take.i.get(), take.h);
                    ((com.alibaba.android.split.manager.a) k.a()).c().a(take.i.get(), Collections.singletonList(m.a().a(take.h)));
                }
            } catch (Exception unused) {
                this.b.d("Failed to Instance %s in the background!", take.d);
            }
            Message.obtain(take.f.c, 0, take).sendToTarget();
        } catch (InterruptedException unused2) {
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        while (true) {
            b();
        }
    }

    public bnk c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bnk) ipChange.ipc$dispatch("1e66261d", new Object[]{this});
        }
        bnk acquire = this.d.acquire();
        return acquire == null ? new bnk() : acquire;
    }

    public void a(bnk bnkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e20f98d9", new Object[]{this, bnkVar});
            return;
        }
        bnkVar.b = null;
        bnkVar.c = null;
        bnkVar.f = null;
        bnkVar.f26000a = null;
        bnkVar.d = null;
        bnkVar.g = null;
        this.d.release(bnkVar);
    }

    public void b(bnk bnkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0929f5a", new Object[]{this, bnkVar});
            return;
        }
        try {
            this.c.put(bnkVar);
        } catch (InterruptedException e) {
            throw new RuntimeException("Failed to enqueue async instantiator request", e);
        }
    }
}
