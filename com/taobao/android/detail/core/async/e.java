package com.taobao.android.detail.core.async;

import android.util.Log;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.async.a;
import com.taobao.android.detail.core.utils.i;
import com.taobao.tao.Globals;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import tb.ecg;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class e implements a.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<Integer, ConcurrentLinkedQueue<View>> f9380a = new ConcurrentHashMap<>();
    private ConcurrentHashMap<Integer, View> b = new ConcurrentHashMap<>();
    private a c = new a();
    private ArrayList<Integer> d;

    static {
        kge.a(-2105526931);
        kge.a(1435498403);
    }

    public e() {
        emu.a("com.taobao.android.detail.core.async.AsyncViewPreLoader");
    }

    public void a(ArrayList<Integer> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.c.a(arrayList, this);
        String a2 = com.taobao.android.detail.core.performance.a.a("AsyncViewPreLoader");
        i.d(a2, "asyncPreLoaderView end, cost=" + (System.currentTimeMillis() - currentTimeMillis));
    }

    public void b(ArrayList<Integer> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e188d161", new Object[]{this, arrayList});
            return;
        }
        this.d = arrayList;
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        Iterator<Integer> it = this.d.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            if (!this.b.containsKey(next)) {
                arrayList2.add(next);
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.c.a(arrayList2, true, this);
        String a2 = com.taobao.android.detail.core.performance.a.a("AsyncViewPreLoader");
        i.d(a2, "asyncPreLoaderStandbyView end, cost=" + (System.currentTimeMillis() - currentTimeMillis));
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            for (ConcurrentLinkedQueue<View> concurrentLinkedQueue : this.f9380a.values()) {
                if (concurrentLinkedQueue != null) {
                    Iterator<View> it = concurrentLinkedQueue.iterator();
                    while (it.hasNext()) {
                        View next = it.next();
                        if (next.getContext() instanceof f) {
                            ((f) next.getContext()).a(Globals.getApplication());
                        }
                    }
                }
            }
            for (View view : this.b.values()) {
                if (view.getContext() instanceof f) {
                    ((f) view.getContext()).a(Globals.getApplication());
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
            ecg.l(Globals.getApplication(), Log.getStackTraceString(th));
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f9380a.clear();
        }
    }

    @Override // com.taobao.android.detail.core.async.a.b
    public void a(View view, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c2ccb99", new Object[]{this, view, new Boolean(z), new Integer(i)});
            return;
        }
        try {
            if (!z) {
                if (this.f9380a == null || view == null) {
                    return;
                }
                ConcurrentLinkedQueue<View> concurrentLinkedQueue = this.f9380a.get(Integer.valueOf(i));
                if (concurrentLinkedQueue == null) {
                    concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
                    this.f9380a.put(Integer.valueOf(i), concurrentLinkedQueue);
                }
                if (concurrentLinkedQueue == null || concurrentLinkedQueue.contains(view)) {
                    return;
                }
                concurrentLinkedQueue.add(view);
            } else if (this.b == null || view == null) {
            } else {
                this.b.put(Integer.valueOf(i), view);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            ecg.l(Globals.getApplication(), Log.getStackTraceString(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007e A[Catch: Throwable -> 0x00d3, TryCatch #0 {Throwable -> 0x00d3, blocks: (B:7:0x0026, B:9:0x0034, B:11:0x003a, B:17:0x005d, B:19:0x0069, B:21:0x006d, B:23:0x0079, B:25:0x007e, B:26:0x00c1, B:28:0x00c9, B:13:0x0042, B:15:0x004e), top: B:33:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1 A[Catch: Throwable -> 0x00d3, TryCatch #0 {Throwable -> 0x00d3, blocks: (B:7:0x0026, B:9:0x0034, B:11:0x003a, B:17:0x005d, B:19:0x0069, B:21:0x006d, B:23:0x0079, B:25:0x007e, B:26:0x00c1, B:28:0x00c9, B:13:0x0042, B:15:0x004e), top: B:33:0x0026 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View a(android.content.Context r5, int r6, com.taobao.android.detail.core.async.d.a r7) {
        /*
            r4 = this;
            java.lang.String r0 = "AsyncViewPreLoader"
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.android.detail.core.async.e.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L25
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r4
            r2 = 1
            r0[r2] = r5
            r5 = 2
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r6)
            r0[r5] = r2
            r5 = 3
            r0[r5] = r7
            java.lang.String r5 = "ec8ac00b"
            java.lang.Object r5 = r1.ipc$dispatch(r5, r0)
            android.view.View r5 = (android.view.View) r5
            return r5
        L25:
            r1 = 0
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.util.concurrent.ConcurrentLinkedQueue<android.view.View>> r2 = r4.f9380a     // Catch: java.lang.Throwable -> Ld3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Ld3
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> Ld3
            java.util.concurrent.ConcurrentLinkedQueue r2 = (java.util.concurrent.ConcurrentLinkedQueue) r2     // Catch: java.lang.Throwable -> Ld3
            if (r2 == 0) goto L42
            int r3 = r2.size()     // Catch: java.lang.Throwable -> Ld3
            if (r3 <= 0) goto L42
            java.lang.Object r2 = r2.poll()     // Catch: java.lang.Throwable -> Ld3
            android.view.View r2 = (android.view.View) r2     // Catch: java.lang.Throwable -> Ld3
        L40:
            r1 = r2
            goto L5b
        L42:
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, android.view.View> r2 = r4.b     // Catch: java.lang.Throwable -> Ld3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Ld3
            boolean r2 = r2.containsKey(r3)     // Catch: java.lang.Throwable -> Ld3
            if (r2 == 0) goto L5b
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, android.view.View> r2 = r4.b     // Catch: java.lang.Throwable -> Ld3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Ld3
            java.lang.Object r2 = r2.remove(r3)     // Catch: java.lang.Throwable -> Ld3
            android.view.View r2 = (android.view.View) r2     // Catch: java.lang.Throwable -> Ld3
            goto L40
        L5b:
            if (r7 == 0) goto L7c
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, android.view.View> r2 = r4.b     // Catch: java.lang.Throwable -> Ld3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Ld3
            boolean r2 = r2.containsKey(r3)     // Catch: java.lang.Throwable -> Ld3
            if (r2 != 0) goto L7c
            java.util.ArrayList<java.lang.Integer> r2 = r4.d     // Catch: java.lang.Throwable -> Ld3
            if (r2 == 0) goto L7c
            java.util.ArrayList<java.lang.Integer> r2 = r4.d     // Catch: java.lang.Throwable -> Ld3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Ld3
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Throwable -> Ld3
            if (r2 == 0) goto L7c
            r7.a(r6)     // Catch: java.lang.Throwable -> Ld3
        L7c:
            if (r1 != 0) goto Lc1
            java.lang.String r5 = com.taobao.android.detail.core.performance.a.a(r0)     // Catch: java.lang.Throwable -> Ld3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld3
            r7.<init>()     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r2 = "getAsyncCacheView viewpools="
            r7.append(r2)     // Catch: java.lang.Throwable -> Ld3
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.util.concurrent.ConcurrentLinkedQueue<android.view.View>> r2 = r4.f9380a     // Catch: java.lang.Throwable -> Ld3
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Ld3
            r7.append(r2)     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Ld3
            com.taobao.android.detail.core.utils.i.d(r5, r7)     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r5 = com.taobao.android.detail.core.performance.a.a(r0)     // Catch: java.lang.Throwable -> Ld3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld3
            r7.<init>()     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r0 = "getAsyncCacheView null resId="
            r7.append(r0)     // Catch: java.lang.Throwable -> Ld3
            android.app.Application r0 = com.taobao.tao.Globals.getApplication()     // Catch: java.lang.Throwable -> Ld3
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r6 = r0.getResourceEntryName(r6)     // Catch: java.lang.Throwable -> Ld3
            r7.append(r6)     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Throwable -> Ld3
            com.taobao.android.detail.core.utils.i.d(r5, r6)     // Catch: java.lang.Throwable -> Ld3
            goto Le2
        Lc1:
            android.content.Context r6 = r1.getContext()     // Catch: java.lang.Throwable -> Ld3
            boolean r6 = r6 instanceof com.taobao.android.detail.core.async.f     // Catch: java.lang.Throwable -> Ld3
            if (r6 == 0) goto Le2
            android.content.Context r6 = r1.getContext()     // Catch: java.lang.Throwable -> Ld3
            com.taobao.android.detail.core.async.f r6 = (com.taobao.android.detail.core.async.f) r6     // Catch: java.lang.Throwable -> Ld3
            r6.a(r5)     // Catch: java.lang.Throwable -> Ld3
            goto Le2
        Ld3:
            r5 = move-exception
            r5.printStackTrace()
            android.app.Application r6 = com.taobao.tao.Globals.getApplication()
            java.lang.String r5 = android.util.Log.getStackTraceString(r5)
            tb.ecg.l(r6, r5)
        Le2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.core.async.e.a(android.content.Context, int, com.taobao.android.detail.core.async.d$a):android.view.View");
    }
}
