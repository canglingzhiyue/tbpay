package com.taobao.android.detail.core.performance.preload.core.task;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.l;
import com.taobao.android.detail.core.performance.preload.core.task.PreloadTaskEntity;
import com.taobao.android.detail.core.performance.preload.h;
import com.taobao.android.detail.core.performance.preload.k;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.datamodel.node.DetailOptNode;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.ein;
import tb.eiw;
import tb.eix;
import tb.eiy;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private AtomicBoolean f9793a = new AtomicBoolean(false);
    private PreloadTaskEntity b;
    private f c;

    static {
        kge.a(862393863);
        kge.a(-300299959);
    }

    public static /* synthetic */ a a(e eVar, d dVar, eiw eiwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("ae7889c6", new Object[]{eVar, dVar, eiwVar}) : eVar.a(dVar, eiwVar);
    }

    public e(PreloadTaskEntity preloadTaskEntity, f fVar) {
        this.b = preloadTaskEntity;
        this.c = fVar;
        emu.a("com.taobao.android.detail.core.performance.preload.core.task.RealTask");
    }

    public static e a(PreloadTaskEntity preloadTaskEntity, f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("9b9f08cd", new Object[]{preloadTaskEntity, fVar}) : new e(preloadTaskEntity, fVar);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f9793a.get();
    }

    public synchronized void a(final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5622efd7", new Object[]{this, dVar});
        } else if (a()) {
            i.a(l.a("RealTask"), "isExecuted");
        } else {
            final eiw a2 = eiy.a(this.b.bizName);
            if (a2 == null) {
                i.a(l.a("RealTask"), "taskExecutor is null");
                return;
            }
            Iterator<PreloadTaskEntity.a> it = this.b.items.iterator();
            while (it.hasNext()) {
                PreloadTaskEntity.a next = it.next();
                h b = k.a().b(next.e);
                if (b == null || b.a() || !b.c()) {
                    if (!a2.a(next)) {
                        dVar.a(next);
                    }
                }
            }
            a a3 = a(dVar, a2);
            if (a3 == null) {
                i.c(l.a("RealTask"), "准备队列中没有可执行的任务");
                return;
            }
            a2.a(new eix.a() { // from class: com.taobao.android.detail.core.performance.preload.core.task.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.eix.a
                public a a() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (a) ipChange2.ipc$dispatch("e8d34480", new Object[]{this}) : e.a(e.this, dVar, a2);
                }
            });
            a2.a(a3);
            this.f9793a.set(true);
        }
    }

    private a a(d dVar, eiw eiwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("8baa6554", new Object[]{this, dVar, eiwVar});
        }
        PreloadTaskEntity a2 = dVar.a(a(this.b.sourceFrom), b(this.b.sourceFrom), eiwVar);
        if (a2 == null) {
            i.c(l.a("RealTask"), "buildPreloadTask newEntity is null");
            return null;
        }
        return new a(this.c, eiwVar, a2);
    }

    private int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        DetailOptNode c = ein.a().c(str);
        if (c != null && c.batchSize != 0) {
            return c.batchSize;
        }
        return 5;
    }

    private int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{this, str})).intValue();
        }
        DetailOptNode c = ein.a().c(str);
        if (c != null && c.expandSize != 0) {
            return c.expandSize;
        }
        return 2;
    }
}
