package com.taobao.android.publisher.service.export.ayscpublish.core;

import android.os.Environment;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.icp;
import tb.icq;

/* loaded from: classes6.dex */
public abstract class APublishTask<T extends Serializable> implements b<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "APublishTask";

    /* renamed from: a  reason: collision with root package name */
    public static String f14710a = "";
    public final List<a> b;
    public volatile int c;
    public String d;
    public long e;
    public int f;
    public int g;
    public PublishError h;
    public T i;
    public volatile boolean j;
    private StoreData<T> k;
    private boolean l;
    private volatile boolean m;
    private int n;
    private a o;
    private c p;

    /* loaded from: classes6.dex */
    public static class StoreData<T> implements Serializable {
        private static final long serialVersionUID = -177145889678111999L;
        public int mCurrStepIndex;
        public PublishError mError;
        public int mExecuteCount;
        public T mPublishData;
        public String mTID;
        public Class<? extends APublishTask> mTaskClazz;
        public long mTimestamp;
        public int mVersion;
    }

    /* loaded from: classes6.dex */
    public static abstract class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public abstract boolean a();

        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
            }
            return false;
        }
    }

    public abstract void d();

    public String w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f74eee2", new Object[]{this}) : "DEFAULT";
    }

    public int x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6b088f2", new Object[]{this})).intValue();
        }
        return 0;
    }

    static {
        if (icp.a().b().d().getExternalCacheDir() != null) {
            f14710a = icp.a().b().d().getExternalCacheDir().getAbsolutePath() + "/publish_tasks";
            return;
        }
        f14710a = Environment.getExternalStorageDirectory().getAbsolutePath() + "/publish_tasks";
    }

    public APublishTask(T t) {
        this(t, -1);
    }

    public APublishTask(T t, int i) {
        this.b = new ArrayList();
        this.c = 0;
        this.j = false;
        this.f = 0;
        this.g = 0;
        this.h = new PublishError();
        this.k = new StoreData<>();
        this.l = true;
        this.m = false;
        this.n = -1;
        this.p = new icq() { // from class: com.taobao.android.publisher.service.export.ayscpublish.core.APublishTask.1
        };
        this.d = String.format("%d_%s", Long.valueOf(System.currentTimeMillis()), icp.a().b().a());
        this.e = System.currentTimeMillis();
        this.i = t;
        this.n = i;
        d();
        this.n = a();
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.n;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b.size();
    }

    public float c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5a", new Object[]{this})).floatValue();
        }
        if (this.b.size() != 0) {
            return this.c / this.b.size();
        }
        return 0.0f;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76625f1c", new Object[]{this, aVar});
        } else {
            this.b.add(aVar);
        }
    }

    @Deprecated
    public T e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("193d54fe", new Object[]{this}) : this.i;
    }

    public T f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("1b16a81d", new Object[]{this}) : this.i;
    }

    public PublishError g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PublishError) ipChange.ipc$dispatch("794f959", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.h.errorCode) && TextUtils.isEmpty(this.h.errorMsg)) {
            return null;
        }
        return this.h;
    }

    public a h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("4b562aa3", new Object[]{this}) : this.o;
    }

    public void a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dbad4d8", new Object[]{this, str, str2, new Boolean(z)});
        } else {
            this.h.setError(str, str2, z);
        }
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.b
    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.d;
    }

    public long j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe5", new Object[]{this})).longValue() : this.e;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.e
    public void k() {
        /*
            r12 = this;
            java.lang.String r0 = "APublishTask"
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.android.publisher.service.export.ayscpublish.core.APublishTask.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L14
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r3] = r12
            java.lang.String r2 = "5f95772"
            r1.ipc$dispatch(r2, r0)
            return
        L14:
            boolean r1 = r12.l
            if (r1 == 0) goto Ldc
            boolean r1 = r12.u()
            if (r1 == 0) goto L20
            goto Ldc
        L20:
            long r1 = java.lang.System.currentTimeMillis()
            com.taobao.android.publisher.service.export.ayscpublish.core.APublishTask$StoreData<T extends java.io.Serializable> r5 = r12.k
            java.lang.String r6 = r12.d
            r5.mTID = r6
            long r6 = r12.e
            r5.mTimestamp = r6
            int r6 = r12.c
            r5.mCurrStepIndex = r6
            com.taobao.android.publisher.service.export.ayscpublish.core.APublishTask$StoreData<T extends java.io.Serializable> r5 = r12.k
            int r6 = r12.g
            r5.mExecuteCount = r6
            java.io.Serializable r6 = r12.e()
            r5.mPublishData = r6
            com.taobao.android.publisher.service.export.ayscpublish.core.APublishTask$StoreData<T extends java.io.Serializable> r5 = r12.k
            com.taobao.android.publisher.service.export.ayscpublish.core.PublishError r6 = r12.h
            r5.mError = r6
            java.lang.Class r6 = r12.getClass()
            r5.mTaskClazz = r6
            com.taobao.android.publisher.service.export.ayscpublish.core.APublishTask$StoreData<T extends java.io.Serializable> r5 = r12.k
            int r6 = r12.x()
            r5.mVersion = r6
            java.io.File r5 = new java.io.File
            java.lang.String r6 = com.taobao.android.publisher.service.export.ayscpublish.core.APublishTask.f14710a
            r5.<init>(r6)
            boolean r6 = r5.exists()
            if (r6 != 0) goto L62
            r5.mkdir()
        L62:
            java.lang.String r5 = r12.d
            java.lang.String r5 = r12.a(r5)
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lb0
            r7.<init>(r5)     // Catch: java.lang.Throwable -> Lb0
            java.io.ObjectOutputStream r5 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> La8
            r5.<init>(r7)     // Catch: java.lang.Throwable -> La8
            com.taobao.android.publisher.service.export.ayscpublish.core.APublishTask$StoreData<T extends java.io.Serializable> r6 = r12.k     // Catch: java.lang.Throwable -> La3
            r5.writeObject(r6)     // Catch: java.lang.Throwable -> La3
            r5.flush()     // Catch: java.lang.Throwable -> La3
            tb.icp r6 = tb.icp.a()     // Catch: java.lang.Throwable -> La3
            com.taobao.android.publisher.service.export.ayscpublish.core.a r6 = r6.b()     // Catch: java.lang.Throwable -> La3
            java.lang.String r8 = "task store, cost %d ms"
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> La3
            long r10 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La3
            long r10 = r10 - r1
            java.lang.Long r1 = java.lang.Long.valueOf(r10)     // Catch: java.lang.Throwable -> La3
            r9[r3] = r1     // Catch: java.lang.Throwable -> La3
            java.lang.String r1 = java.lang.String.format(r8, r9)     // Catch: java.lang.Throwable -> La3
            r6.a(r0, r1)     // Catch: java.lang.Throwable -> La3
            com.taobao.android.publisher.service.export.ayscpublish.core.f.a(r7)
            com.taobao.android.publisher.service.export.ayscpublish.core.f.a(r5)
            return
        La1:
            r0 = move-exception
            goto Ld5
        La3:
            r1 = move-exception
            goto Laa
        La5:
            r0 = move-exception
            r5 = r6
            goto Ld5
        La8:
            r1 = move-exception
            r5 = r6
        Laa:
            r6 = r7
            goto Lb2
        Lac:
            r0 = move-exception
            r5 = r6
            r7 = r5
            goto Ld5
        Lb0:
            r1 = move-exception
            r5 = r6
        Lb2:
            tb.icp r2 = tb.icp.a()     // Catch: java.lang.Throwable -> Ld3
            com.taobao.android.publisher.service.export.ayscpublish.core.a r2 = r2.b()     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r7 = "task store failed, exception=%s"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Ld3
            r4[r3] = r1     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r1 = java.lang.String.format(r7, r4)     // Catch: java.lang.Throwable -> Ld3
            r2.b(r0, r1)     // Catch: java.lang.Throwable -> Ld3
            com.taobao.android.publisher.service.export.ayscpublish.core.f.a(r6)
            com.taobao.android.publisher.service.export.ayscpublish.core.f.a(r5)
            return
        Ld3:
            r0 = move-exception
            r7 = r6
        Ld5:
            com.taobao.android.publisher.service.export.ayscpublish.core.f.a(r7)
            com.taobao.android.publisher.service.export.ayscpublish.core.f.a(r5)
            throw r0
        Ldc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.publisher.service.export.ayscpublish.core.APublishTask.k():void");
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        return f14710a + "/" + str;
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.e
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        try {
            if (this.l && !u()) {
                long currentTimeMillis = System.currentTimeMillis();
                f.a(a(this.d));
                icp.a().b().a(TAG, String.format("task unstore, cost %d ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
            }
        } catch (Throwable th) {
            icp.a().b().b(TAG, String.format("task unstore failed, exception=%s", th.toString()));
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            m();
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else if (this.b.size() <= 0 || v()) {
            icp.a().b().b(TAG, "empty task, start failed");
        } else {
            this.m = true;
            this.g++;
            n();
            z();
            this.m = false;
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        icp.a().b().a(TAG, String.format("%s started, execute count=%d", "Lifecycle：", Integer.valueOf(this.g)));
        y().c(this);
        y().a((c) this, this.c / this.b.size());
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            icp.a().b().a(TAG, String.format("%s finished, result=success", "Lifecycle："));
            y().d(this);
            r();
        } else {
            icp.a().b().b(TAG, String.format("%s onFinished, result=failed, errorCode=%s, errorMsg=%s", "Lifecycle：", this.h.errorCode, this.h.errorMsg));
            y().a((c) this, this.h);
        }
    }

    private boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        if (this.g < icp.a().b().c()) {
            return false;
        }
        a(PublishError.CODE_EXCEED_RETRY_COUNT, str, true);
        B();
        y().a((c) this, this.h);
        r();
        return true;
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        icp.a().b().c(TAG, String.format("%s canceled", "Lifecycle："));
        y().f(this);
        r();
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        icp.a().b().c(TAG, String.format("%s retry", "Lifecycle："));
        y().e(this);
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.b
    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue();
        }
        if (this.j || v()) {
            icp.a().b().b(TAG, String.format("cancel failed!", new Object[0]));
            return false;
        }
        this.j = true;
        a aVar = this.o;
        if (aVar != null) {
            aVar.b();
        }
        A();
        return true;
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        icp.a().b().c(TAG, String.format("%s destoryed", "Lifecycle："));
        y().b(this);
    }

    private void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
            return;
        }
        this.o = this.b.get(this.c);
        String simpleName = this.o.getClass().getSimpleName();
        C();
        if (this.j) {
            o();
            return;
        }
        y().a((c) this, this.o);
        icp.a().b().a(TAG, String.format("execute step %d(%s), total %d steps!", Integer.valueOf(this.c + 1), simpleName, Integer.valueOf(this.b.size())));
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.o.a()) {
            icp.a().b().b(TAG, String.format("step %d(%s) execute failed! total %d steps, retry count = %d", Integer.valueOf(this.c + 1), simpleName, Integer.valueOf(this.b.size()), Integer.valueOf(this.f)));
            c(simpleName);
        } else if (this.j) {
            o();
        } else {
            icp.a().b().a(TAG, String.format("step %d(%s) execute success!,cost=%d ms, total %d steps!", Integer.valueOf(this.c + 1), simpleName, Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(this.b.size())));
            this.c++;
            k();
            y().a((c) this, c());
            if (v()) {
                a(true);
            } else {
                z();
            }
        }
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (this.j) {
            o();
        } else if (this.h.isFatalError()) {
            B();
            y().a((c) this, this.h);
            r();
        } else if (this.f >= icp.a().b().b()) {
            icp.a().b().b(TAG, String.format("retry count(%d) >= max count(%d), stop retry", Integer.valueOf(this.f), Integer.valueOf(icp.a().b().b())));
            if (this.h.isNetworkError()) {
                this.g--;
            }
            k();
            if (b(str + "--" + this.h.errorMsg)) {
                return;
            }
            a(false);
        } else {
            icp.a().b().c(TAG, String.format("retry step %d! total %d steps", Integer.valueOf(this.c + 1), Integer.valueOf(this.b.size())));
            k();
            this.f++;
            p();
            z();
        }
    }

    public synchronized void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        this.n = -1;
        if (this.m) {
            y().a(this);
            y().c(this);
            y().a((c) this, c());
            notify();
            return;
        }
        PublishError g = g();
        if (g == null) {
            return;
        }
        y().a(this);
        y().c(this);
        y().a((c) this, c());
        y().a((c) this, g);
        if (g.isFatalError()) {
            B();
            y().b(this);
        }
    }

    private synchronized void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
            return;
        }
        this.n = -1;
        if (!this.m) {
            return;
        }
        notify();
    }

    private void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
        } else {
            if (u()) {
            }
        }
    }

    public synchronized int t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6782aee", new Object[]{this})).intValue();
        }
        return this.n;
    }

    private synchronized void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
        } else if (t() < 0 || t() != this.c) {
        } else {
            try {
                String simpleName = this.o.getClass().getSimpleName();
                icp.a().b().a(TAG, String.format("encounter barrier, wait at step %d(%s), total %d steps!", Integer.valueOf(this.c + 1), simpleName, Integer.valueOf(this.b.size())));
                wait();
                icp.a().b().a(TAG, String.format("barrier removed, continue execute step %d(%s), total %d steps!", Integer.valueOf(this.c + 1), simpleName, Integer.valueOf(this.b.size())));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6864280", new Object[]{this})).booleanValue();
        }
        return this.n != -1;
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[]{this})).booleanValue() : this.c >= this.b.size();
    }

    public c y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("986882ef", new Object[]{this});
        }
        if (u()) {
            return this.p;
        }
        return d.b();
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj instanceof b) {
            return i().equals(((b) obj).i());
        }
        return false;
    }
}
