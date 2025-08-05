package com.taobao.tab2interact.core.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import tb.kge;

/* loaded from: classes8.dex */
public class g<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final List<T> f19773a = new ArrayList();
    private boolean b = false;
    private final Queue<Runnable> c = new LinkedList();

    /* loaded from: classes8.dex */
    public interface a<T> {
        boolean a(T t);
    }

    static {
        kge.a(292694160);
    }

    public static /* synthetic */ void lambda$JHMluGv_YKi59bkFnnDN1YJvxOU(g gVar, Object obj) {
        gVar.c(obj);
    }

    public static /* synthetic */ List a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("66b96672", new Object[]{gVar}) : gVar.f19773a;
    }

    public synchronized void a(final T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, t});
        } else if (this.b) {
            this.c.offer(new Runnable() { // from class: com.taobao.tab2interact.core.utils.-$$Lambda$g$JHMluGv_YKi59bkFnnDN1YJvxOU
                {
                    g.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    g.lambda$JHMluGv_YKi59bkFnnDN1YJvxOU(g.this, t);
                }
            });
        } else {
            if (!this.f19773a.contains(t)) {
                this.f19773a.add(t);
            }
        }
    }

    public /* synthetic */ void c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a8844c6", new Object[]{this, obj});
        } else if (this.f19773a.contains(obj)) {
        } else {
            this.f19773a.add(obj);
        }
    }

    public synchronized void b(final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, obj});
        } else if (this.b) {
            this.c.offer(new Runnable() { // from class: com.taobao.tab2interact.core.utils.g.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    g.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        g.a(g.this).remove(obj);
                    }
                }
            });
        } else {
            this.f19773a.remove(obj);
        }
    }

    public synchronized void a(a<? super T> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eacfa18", new Object[]{this, aVar});
            return;
        }
        this.b = true;
        Iterator<T> it = this.f19773a.iterator();
        while (it.hasNext() && aVar.a((T) it.next())) {
        }
        this.b = false;
        a();
    }

    private synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        while (!this.c.isEmpty()) {
            this.c.poll().run();
        }
    }
}
