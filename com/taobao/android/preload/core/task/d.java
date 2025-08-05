package com.taobao.android.preload.core.task;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.preload.core.task.PreloadTaskEntity;
import com.taobao.android.preload.f;
import com.taobao.android.preload.g;
import com.taobao.android.preload.j;
import com.taobao.android.preload.k;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.icj;
import tb.icl;
import tb.icm;
import tb.jqm;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private AtomicBoolean f14681a = new AtomicBoolean(false);
    private PreloadTaskEntity b;
    private e c;
    private int d;
    private int e;

    public static /* synthetic */ a a(d dVar, c cVar, icl iclVar, icj icjVar, com.taobao.android.preload.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("97d7f9ad", new Object[]{dVar, cVar, iclVar, icjVar, aVar}) : dVar.b(cVar, iclVar, icjVar, aVar);
    }

    private d(PreloadTaskEntity preloadTaskEntity, e eVar, int i, int i2) {
        this.b = preloadTaskEntity;
        this.c = eVar;
        this.d = i == 0 ? 5 : i;
        this.e = i2 == 0 ? 2 : i2;
    }

    public static d a(PreloadTaskEntity preloadTaskEntity, e eVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("f8171f7e", new Object[]{preloadTaskEntity, eVar, new Integer(i), new Integer(i2)}) : new d(preloadTaskEntity, eVar, i, i2);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f14681a.get();
    }

    public synchronized void a(final c cVar, final icl iclVar, final icj icjVar, final com.taobao.android.preload.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f63ebccc", new Object[]{this, cVar, iclVar, icjVar, aVar});
        } else if (a()) {
            f.a(com.taobao.android.preload.e.a("RealTask"), "isExecuted");
        } else if (iclVar == null) {
            f.a(com.taobao.android.preload.e.a("RealTask"), "taskExecutor is null");
        } else {
            j a2 = k.a(this.b.bizName);
            if (a2 == null) {
                f.a(com.taobao.android.preload.e.a("RealTask"), "preloadTaskStore is null");
                return;
            }
            if (jqm.a()) {
                b();
                a2.a();
            }
            Iterator<PreloadTaskEntity.a> it = this.b.items.iterator();
            while (it.hasNext()) {
                PreloadTaskEntity.a next = it.next();
                g a3 = a2.a(next.e);
                if (a3 != null && !a3.a()) {
                    if (jqm.a()) {
                        String a4 = com.taobao.android.preload.e.a("RealTask");
                        f.b(a4, next.e + "在缓存中已有，过滤掉不再发起请求");
                    }
                } else if (!iclVar.a(next)) {
                    cVar.a(next);
                }
            }
            a b = b(cVar, iclVar, icjVar, aVar);
            if (b == null) {
                f.b(com.taobao.android.preload.e.a("RealTask"), "准备队列中没有可执行的任务");
                return;
            }
            iclVar.a(new icm.a() { // from class: com.taobao.android.preload.core.task.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.icm.a
                public a a() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (a) ipChange2.ipc$dispatch("6cf8b9cf", new Object[]{this}) : d.a(d.this, cVar, iclVar, icjVar, aVar);
                }
            });
            iclVar.a(b);
            this.f14681a.set(true);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("发起预请求原始列表: ");
        Iterator<PreloadTaskEntity.a> it = this.b.items.iterator();
        while (it.hasNext()) {
            sb.append(it.next().e);
            sb.append(",");
        }
        f.b(com.taobao.android.preload.e.a("RealTask"), sb.toString());
    }

    private a b(c cVar, icl iclVar, icj icjVar, com.taobao.android.preload.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("afd910a", new Object[]{this, cVar, iclVar, icjVar, aVar});
        }
        PreloadTaskEntity a2 = cVar.a(this.d, this.e, iclVar);
        if (a2 == null) {
            f.b(com.taobao.android.preload.e.a("RealTask"), "buildPreloadTask newEntity is null");
            return null;
        }
        return new a(this.c, iclVar, a2, icjVar, aVar);
    }
}
