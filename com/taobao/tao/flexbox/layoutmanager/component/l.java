package com.taobao.tao.flexbox.layoutmanager.component;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaConstants;
import com.facebook.yoga.YogaFlexDirection;
import com.taobao.tao.flexbox.layoutmanager.core.ad;
import com.taobao.tao.flexbox.layoutmanager.core.af;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.ogg;
import tb.ogh;
import tb.ohd;

/* loaded from: classes8.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TNodeLayout";

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.tao.flexbox.layoutmanager.core.aa f20138a;
    private boolean b = oeb.aQ();
    private c c;
    private a d;
    private d e;

    /* loaded from: classes8.dex */
    public interface d {
        void a();
    }

    static {
        kge.a(-122145482);
    }

    public static boolean b(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aca84e15", new Object[]{aaVar})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ d a(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("7fb3f0ae", new Object[]{lVar}) : lVar.e;
    }

    public static /* synthetic */ void a(l lVar, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfb1044", new Object[]{lVar, runnable});
        } else {
            lVar.a(runnable);
        }
    }

    /* loaded from: classes8.dex */
    public static class c implements MessageQueue.IdleHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Runnable f20142a;

        static {
            kge.a(-813856962);
            kge.a(1508499111);
        }

        public c(Runnable runnable) {
            this.f20142a = runnable;
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
            }
            this.f20142a.run();
            return false;
        }
    }

    public l(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        this.f20138a = aaVar;
    }

    private static float a(m mVar, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("de38f565", new Object[]{mVar, aaVar, aaVar2})).floatValue();
        }
        float f = Float.NaN;
        int k = ad.k(aaVar);
        if (k > 0) {
            f = k;
        }
        if (!YogaConstants.isUndefined(f)) {
            return f;
        }
        return (oec.b(aaVar.e("flex"), 0) == 1.0f || oec.b(aaVar2.e("flex"), 0) == 1.0f) ? mVar.m() - ad.a(aaVar2, false) : f;
    }

    private static float b(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a5a9229", new Object[]{aaVar, aaVar2})).floatValue();
        }
        int m = ad.m(aaVar);
        if (m <= 0) {
            return Float.NaN;
        }
        return m;
    }

    private com.taobao.tao.flexbox.layoutmanager.core.r d(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.r) ipChange.ipc$dispatch("f494ed19", new Object[]{this, aaVar});
        }
        if (aaVar == null || aaVar.b(0) == null || !aaVar.b(0).n()) {
            return null;
        }
        com.taobao.tao.flexbox.layoutmanager.core.aa b2 = aaVar.b(0);
        b2.c(a((m) this.f20138a.I(), aaVar, b2), b(aaVar, b2));
        return b2.G();
    }

    public void a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2, d dVar) {
        int i;
        int i2;
        boolean z;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20e12a56", new Object[]{this, aaVar, aaVar2, dVar});
            return;
        }
        ogh.a("ListOnLayout");
        this.e = dVar;
        boolean z2 = this.f20138a.I().getViewParams().av == YogaFlexDirection.COLUMN;
        com.taobao.tao.flexbox.layoutmanager.core.r d2 = d(aaVar);
        if (d2 != null) {
            i = (z2 ? d2.b : d2.f20361a) + 0;
        } else {
            i = 0;
        }
        if (this.b) {
            ogh.b();
            return;
        }
        if (oeb.U() == 0 || oeb.z()) {
            if (aaVar2 == null || aaVar2.d.isEmpty()) {
                i2 = 0;
                z = false;
            } else {
                int e = z2 ? ohd.e(this.f20138a.N()) : ohd.b(this.f20138a.N());
                int i4 = i;
                i2 = 0;
                z = false;
                while (i2 < aaVar2.d.size()) {
                    com.taobao.tao.flexbox.layoutmanager.core.aa aaVar3 = aaVar2.d.get(i2);
                    boolean a2 = a(this, aaVar3);
                    com.taobao.tao.flexbox.layoutmanager.core.aa e2 = e(aaVar3);
                    com.taobao.tao.flexbox.layoutmanager.core.r rVar = null;
                    if (e2 != null) {
                        rVar = e2.G();
                    }
                    if (rVar != null) {
                        i3 = z2 ? rVar.b : rVar.f20361a;
                    } else {
                        i3 = 0;
                    }
                    if (a2) {
                        i4 += i3;
                        z = i4 >= e;
                        if (z) {
                            break;
                        }
                    }
                    i2++;
                }
            }
            if (z) {
                a(new b(this, aaVar2, i2 + 1, false));
            }
        }
        ogh.b();
    }

    public void a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96a0fc81", new Object[]{this, aaVar, new Integer(i), new Boolean(z)});
        } else if (z || !this.b) {
        } else {
            f(aaVar);
        }
    }

    private com.taobao.tao.flexbox.layoutmanager.core.aa e(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("7e8a42ea", new Object[]{this, aaVar});
        }
        if (!aaVar.d.isEmpty()) {
            return aaVar.d.get(0);
        }
        return null;
    }

    public static boolean a(l lVar, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb991432", new Object[]{lVar, aaVar})).booleanValue();
        }
        if (aaVar.r == 2) {
            return false;
        }
        synchronized (aaVar) {
            if (aaVar.r == 2) {
                return false;
            }
            ogg.c(TAG, "cell做layout, thread:" + Thread.currentThread().getName());
            aaVar.r = 1;
            b(lVar, a(aaVar, true, false));
            aaVar.r = 2;
            return true;
        }
    }

    public void a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, int i) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba894cb3", new Object[]{this, aaVar, new Integer(i)});
        } else if (!this.b || (aVar = this.d) == null) {
        } else {
            aVar.a(aaVar);
        }
    }

    public void a() {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.b || (aVar = this.d) == null) {
        } else {
            aVar.a();
        }
    }

    /* loaded from: classes8.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private LinkedList<com.taobao.tao.flexbox.layoutmanager.core.aa> f20139a;
        private C0842a b;
        private boolean c;
        private l d;

        static {
            kge.a(-2062326286);
        }

        public static /* synthetic */ LinkedList a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (LinkedList) ipChange.ipc$dispatch("2ea31465", new Object[]{aVar}) : aVar.f20139a;
        }

        public static /* synthetic */ l b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("1ea9730a", new Object[]{aVar}) : aVar.d;
        }

        /* renamed from: com.taobao.tao.flexbox.layoutmanager.component.l$a$a  reason: collision with other inner class name */
        /* loaded from: classes8.dex */
        public class C0842a implements MessageQueue.IdleHandler {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            static {
                kge.a(-1239683836);
                kge.a(1508499111);
            }

            private C0842a() {
            }

            @Override // android.os.MessageQueue.IdleHandler
            public boolean queueIdle() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
                }
                if (a.a(a.this).size() > 0) {
                    l.a(a.b(a.this), (com.taobao.tao.flexbox.layoutmanager.core.aa) a.a(a.this).pop());
                    if (a.a(a.this).size() > 0) {
                        a.this.removeMessages(0);
                        a.this.sendEmptyMessage(0);
                    }
                }
                return true;
            }
        }

        public a(l lVar, Looper looper) {
            super(looper);
            this.f20139a = new LinkedList<>();
            this.b = new C0842a();
            this.c = false;
            this.d = lVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
            if (r0.d.get(0).w() == false) goto L34;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void handleMessage(android.os.Message r6) {
            /*
                r5 = this;
                com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.flexbox.layoutmanager.component.l.a.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L15
                java.lang.Object[] r1 = new java.lang.Object[r2]
                r1[r3] = r5
                r1[r4] = r6
                java.lang.String r6 = "282a8c19"
                r0.ipc$dispatch(r6, r1)
                return
            L15:
                int r0 = r6.what
                if (r0 == r4) goto L4d
                if (r0 == r2) goto L3c
                r1 = 3
                if (r0 == r1) goto L20
                goto L9e
            L20:
                java.lang.Object r6 = r6.obj
                com.taobao.tao.flexbox.layoutmanager.core.aa r6 = (com.taobao.tao.flexbox.layoutmanager.core.aa) r6
                java.util.LinkedList<com.taobao.tao.flexbox.layoutmanager.core.aa> r0 = r5.f20139a
                java.util.Iterator r0 = r0.iterator()
            L2a:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L9e
                java.lang.Object r1 = r0.next()
                com.taobao.tao.flexbox.layoutmanager.core.aa r1 = (com.taobao.tao.flexbox.layoutmanager.core.aa) r1
                if (r1 != r6) goto L2a
                r0.remove()
                return
            L3c:
                java.util.LinkedList<com.taobao.tao.flexbox.layoutmanager.core.aa> r6 = r5.f20139a
                r6.clear()
                android.os.MessageQueue r6 = android.os.Looper.myQueue()
                com.taobao.tao.flexbox.layoutmanager.component.l$a$a r0 = r5.b
                r6.removeIdleHandler(r0)
                r5.c = r3
                return
            L4d:
                java.lang.Object r6 = r6.obj
                com.taobao.tao.flexbox.layoutmanager.core.aa r6 = (com.taobao.tao.flexbox.layoutmanager.core.aa) r6
                int r0 = r6.r
                if (r0 != 0) goto L9e
                com.taobao.tao.flexbox.layoutmanager.core.aa r0 = r6.J()     // Catch: java.lang.Throwable -> L81
                java.util.List<com.taobao.tao.flexbox.layoutmanager.core.aa> r0 = r0.d     // Catch: java.lang.Throwable -> L81
                int r0 = r0.indexOf(r6)     // Catch: java.lang.Throwable -> L81
                int r0 = r0 - r2
                if (r0 < 0) goto L81
                com.taobao.tao.flexbox.layoutmanager.core.aa r1 = r6.J()     // Catch: java.lang.Throwable -> L81
                com.taobao.tao.flexbox.layoutmanager.core.aa r0 = r1.b(r0)     // Catch: java.lang.Throwable -> L81
                java.util.List<com.taobao.tao.flexbox.layoutmanager.core.aa> r1 = r0.d     // Catch: java.lang.Throwable -> L81
                boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L81
                if (r1 != 0) goto L82
                java.util.List<com.taobao.tao.flexbox.layoutmanager.core.aa> r0 = r0.d     // Catch: java.lang.Throwable -> L81
                java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L81
                com.taobao.tao.flexbox.layoutmanager.core.aa r0 = (com.taobao.tao.flexbox.layoutmanager.core.aa) r0     // Catch: java.lang.Throwable -> L81
                boolean r0 = r0.w()     // Catch: java.lang.Throwable -> L81
                if (r0 != 0) goto L81
                goto L82
            L81:
                r3 = 1
            L82:
                if (r3 == 0) goto L8a
                com.taobao.tao.flexbox.layoutmanager.component.l r0 = r5.d
                com.taobao.tao.flexbox.layoutmanager.component.l.a(r0, r6)
                goto L9e
            L8a:
                java.util.LinkedList<com.taobao.tao.flexbox.layoutmanager.core.aa> r0 = r5.f20139a
                r0.add(r6)
                boolean r6 = r5.c
                if (r6 != 0) goto L9e
                android.os.MessageQueue r6 = android.os.Looper.myQueue()
                com.taobao.tao.flexbox.layoutmanager.component.l$a$a r0 = r5.b
                r6.addIdleHandler(r0)
                r5.c = r4
            L9e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.l.a.handleMessage(android.os.Message):void");
        }

        public void a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("691d3050", new Object[]{this, aaVar});
                return;
            }
            removeMessages(1, aaVar);
            sendMessage(Message.obtain(this, 3, aaVar));
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            removeMessages(1);
            sendEmptyMessage(2);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.d != null) {
        } else {
            this.d = new a(this, com.taobao.tao.flexbox.layoutmanager.core.ac.a().e().getLooper());
        }
    }

    private void f(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bad4c515", new Object[]{this, aaVar});
            return;
        }
        b();
        Message.obtain(this.d, 1, aaVar).sendToTarget();
    }

    private void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
            return;
        }
        if (this.c != null) {
            Looper.myQueue().removeIdleHandler(this.c);
            this.c = null;
        }
        c cVar = new c(runnable);
        Looper.myQueue().addIdleHandler(cVar);
        this.c = cVar;
    }

    /* loaded from: classes8.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public l f20141a;
        private com.taobao.tao.flexbox.layoutmanager.core.aa b;
        private int c;
        private boolean d;

        static {
            kge.a(-205866711);
            kge.a(-1390502639);
        }

        public b(l lVar, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, int i, boolean z) {
            this.f20141a = lVar;
            this.b = aaVar;
            this.c = i;
            this.d = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.b.k().i()) {
            } else {
                ogh.a("LayoutChildTask " + this.c);
                if (this.c < this.b.d.size()) {
                    l.a(this.f20141a, this.b.d.get(this.c));
                }
                if (this.d) {
                    if (this.c + 1 < this.b.d.size()) {
                        l.a(this.f20141a, new b(this.f20141a, this.b, this.c + 1, this.d));
                    } else if (l.a(this.f20141a) != null) {
                        l.a(this.f20141a).a();
                    }
                } else {
                    if (this.c + 1 < this.b.d.size()) {
                        l.a(this.f20141a, this.b.d.get(this.c + 1));
                    }
                    if (this.c + 2 < this.b.d.size()) {
                        l.a(this.f20141a, new b(this.f20141a, this.b, this.c + 2, this.d));
                    } else if (l.a(this.f20141a) != null) {
                        l.a(this.f20141a).a();
                    }
                }
                ogh.b();
            }
        }
    }

    public static com.taobao.tao.flexbox.layoutmanager.core.aa a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("24c02cee", new Object[]{aaVar, new Boolean(z), new Boolean(z2)});
        }
        if (aaVar == null) {
            return null;
        }
        if (aaVar.d().f().equals("cell")) {
            if (z2 && aaVar.r != 2) {
                if (!z) {
                    return aaVar;
                }
                return null;
            }
            h(aaVar);
            if (!aaVar.d.isEmpty()) {
                return aaVar.d.get(0);
            }
            if (!z) {
                return aaVar;
            }
            return null;
        } else if (!aaVar.K().equals("header")) {
            return aaVar;
        } else {
            if (aaVar.d.isEmpty()) {
                return null;
            }
            return aaVar.d.get(0);
        }
    }

    private static com.taobao.tao.flexbox.layoutmanager.core.r b(l lVar, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.r) ipChange.ipc$dispatch("5e270935", new Object[]{lVar, aaVar});
        }
        if (aaVar == null) {
            return null;
        }
        if (aaVar.n()) {
            aaVar.b(a(aaVar, (m) lVar.f20138a.I()), Float.NaN);
        }
        return aaVar.G();
    }

    private static float a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("175b2fd", new Object[]{aaVar, mVar})).floatValue();
        }
        int k = ad.k(aaVar);
        float f = Float.NaN;
        if (k >= 0 && k < mVar.l()) {
            f = mVar.l();
        }
        if (mVar.getViewParams().f20158a == 1 && YogaConstants.isUndefined(f) && mVar.getViewParams().av == YogaFlexDirection.COLUMN) {
            f = mVar.m() - ad.a(aaVar, false);
        }
        if (!YogaConstants.isUndefined(f)) {
            return f;
        }
        if (aaVar.J().K().equals("header")) {
            return a(mVar, aaVar.J(), aaVar);
        }
        return oec.b(aaVar.e("flex"), 0) == 1.0f ? mVar.m() - ad.a(aaVar, false) : f;
    }

    private static void h(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41eb0097", new Object[]{aaVar});
        } else if (aaVar.d.isEmpty()) {
            try {
                com.taobao.tao.flexbox.layoutmanager.core.af d2 = aaVar.d();
                if (d2.s || !d2.c().isEmpty()) {
                    return;
                }
                d2.s = true;
                List<af.c> c2 = d2.c(com.taobao.tao.flexbox.layoutmanager.core.af.CELL_DIFF_NAME);
                d2.s = false;
                if (c2.isEmpty()) {
                    return;
                }
                ArrayList<com.taobao.tao.flexbox.layoutmanager.core.aa> arrayList = new ArrayList();
                for (af.c cVar : c2) {
                    com.taobao.tao.flexbox.layoutmanager.core.aa g = cVar.f20343a.g();
                    if (g != null) {
                        com.taobao.tao.flexbox.layoutmanager.core.j.a(g, cVar.b, false, false);
                        arrayList.add(g);
                    }
                }
                for (com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2 : arrayList) {
                    if (aaVar2.I() != null) {
                        aaVar2.I().onPatchCompleted();
                    }
                }
            } catch (Exception e) {
                ogg.b("vnodeDiffForCell:" + e.getMessage());
            }
        }
    }

    public static l c(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("b2b690a2", new Object[]{aaVar});
        }
        l lVar = (l) aaVar.a(100);
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(aaVar);
        aaVar.a(100, lVar2);
        return lVar2;
    }
}
