package com.alibaba.android.aura;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import tb.arc;
import tb.kge;

/* loaded from: classes2.dex */
public class x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ boolean f2220a;
    private static final x c;
    private final ConcurrentHashMap<String, Queue<k>> b = new ConcurrentHashMap<>();

    static {
        kge.a(809102567);
        f2220a = !x.class.desiredAssertionStatus();
        c = new x();
    }

    private x() {
    }

    public static x a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (x) ipChange.ipc$dispatch("3c3eacf0", new Object[0]) : c;
    }

    private k b(Context context, w wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("3d47e323", new Object[]{this, context, wVar});
        }
        wVar.a(true);
        k a2 = k.a(new q(context, wVar.b()));
        IAURAPluginCenter[] c2 = wVar.c();
        if (c2 != null) {
            a2.a(c2);
        }
        IAURAInputField<Object> d = wVar.d();
        if (d != null) {
            a2.a(d);
        }
        String e = wVar.e();
        if (!TextUtils.isEmpty(e)) {
            if (!f2220a && e == null) {
                throw new AssertionError();
            }
            a2.a(e);
        }
        return a2;
    }

    public void a(Context context, w wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7fe7143", new Object[]{this, context, wVar});
            return;
        }
        String a2 = wVar.a();
        if (a(a2, wVar)) {
            return;
        }
        if (this.b.size() > 2) {
            d("preLoadAURAInstance failed, pool is overflow");
        }
        Queue<k> c2 = c(a2);
        if (c2.size() > 0) {
            d("instanceReadyQueue size >= 1,stop pre init");
            return;
        }
        k b = b(context, wVar);
        Collection<String> f = wVar.f();
        if (f != null && !f.isEmpty()) {
            b.a(f);
        }
        c2.add(b);
        d("aura 实例preInit成功");
    }

    private Queue<k> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Queue) ipChange.ipc$dispatch("821d0e54", new Object[]{this, str});
        }
        Queue<k> queue = this.b.get(str);
        if (queue != null) {
            return queue;
        }
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        this.b.put(str, concurrentLinkedQueue);
        return concurrentLinkedQueue;
    }

    private boolean a(String str, w wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c404a19", new Object[]{this, str, wVar})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            d("preLoadAURAInstance failed, bizName is null");
            return true;
        } else if (!TextUtils.isEmpty(wVar.e())) {
            return false;
        } else {
            d("preLoadAURAInstance failed, configAssetFileName is null");
            return true;
        }
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            arc.a().a(str, arc.a.a().a("AURA/preInit").b());
        }
    }

    public k a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("4cc13d53", new Object[]{this, str});
        }
        Queue<k> queue = this.b.get(str);
        if (queue == null || queue.isEmpty()) {
            return null;
        }
        k poll = queue.poll();
        if (queue.isEmpty()) {
            this.b.remove(str);
        }
        return poll;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (this.b.get(str) == null) {
            arc.a().b("instance already release");
        } else {
            this.b.remove(str);
        }
    }
}
