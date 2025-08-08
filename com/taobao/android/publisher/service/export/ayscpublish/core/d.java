package com.taobao.android.publisher.service.export.ayscpublish.core;

import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.publisher.service.export.ayscpublish.core.APublishTask;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.icp;

/* loaded from: classes6.dex */
public final class d implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GROUP_DEFAULT_EXECUTOR = "DEFAULT";

    /* renamed from: a  reason: collision with root package name */
    private static d f14712a;
    private static final HashMap<String, ExecutorService> d = new HashMap<>();
    private final List<b> b = new ArrayList();
    private final Map<Class, List<c>> c = new HashMap();
    private final Handler e = new Handler(Looper.getMainLooper());
    private a f;

    /* loaded from: classes6.dex */
    public interface a {
        ThreadPoolExecutor a(String str);
    }

    public static /* synthetic */ List a(d dVar, Class cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("cd16504a", new Object[]{dVar, cls}) : dVar.a(cls);
    }

    public static /* synthetic */ Map a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("71b8e115", new Object[]{dVar}) : dVar.c;
    }

    private d() {
    }

    public List<b> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.b;
    }

    private ExecutorService b(String str) {
        ThreadPoolExecutor c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("8c1c0188", new Object[]{this, str});
        }
        if (d.containsKey(str)) {
            return d.get(str);
        }
        a aVar = this.f;
        if (aVar != null) {
            c = aVar.a(str);
        } else {
            c = c(str);
        }
        d.put(str, c);
        return c;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a731703", new Object[]{this, aVar});
        } else {
            this.f = aVar;
        }
    }

    private ThreadPoolExecutor c(final String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadPoolExecutor) ipChange.ipc$dispatch("a784d94", new Object[]{this, str}) : new ThreadPoolExecutor(0, 3, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.taobao.android.publisher.service.export.ayscpublish.core.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public int f14713a = 1;

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                Thread thread = new Thread(runnable);
                thread.setName("AyncPublishThread_" + str + "_" + this.f14713a);
                this.f14713a = this.f14713a + 1;
                return thread;
            }
        });
    }

    public static d b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("8a86d685", new Object[0]);
        }
        if (f14712a == null) {
            synchronized (d.class) {
                if (f14712a == null) {
                    f14712a = new d();
                }
            }
        }
        return f14712a;
    }

    public synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            a(true);
        }
    }

    public synchronized void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        for (b bVar : this.b) {
            bVar.l();
            bVar.q();
        }
        this.b.clear();
    }

    public synchronized boolean g(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c840cb2c", new Object[]{this, bVar})).booleanValue();
        } else if (bVar == null) {
            return false;
        } else {
            bVar.l();
            this.b.remove(bVar);
            return bVar.q();
        }
    }

    public b a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("57ac28de", new Object[]{this, str});
        }
        for (b bVar : this.b) {
            if (str.equals(bVar.i())) {
                return bVar;
            }
        }
        List<APublishTask> f = f();
        if (f != null && f.size() > 0) {
            for (APublishTask aPublishTask : f) {
                if (str.equals(aPublishTask.i())) {
                    return aPublishTask;
                }
            }
        }
        return null;
    }

    public void e() {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        String a2 = icp.a().b().a();
        if (StringUtils.isEmpty(a2)) {
            icp.a().b().c("PublishServiceImp", String.format("getIdleTasks, no session", new Object[0]));
            return;
        }
        File file = new File(APublishTask.f14710a);
        if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length <= 0) {
            return;
        }
        for (File file2 : listFiles) {
            if (file2.getName().contains(a2)) {
                file2.delete();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0116 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<com.taobao.android.publisher.service.export.ayscpublish.core.APublishTask> f() {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.publisher.service.export.ayscpublish.core.d.f():java.util.List");
    }

    public synchronized b h(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("918f2787", new Object[]{this, bVar});
        }
        this.b.add(0, bVar);
        a(bVar);
        b(((APublishTask) bVar).w()).execute(bVar);
        return bVar;
    }

    public synchronized boolean a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2057e285", new Object[]{this, cVar})).booleanValue();
        }
        return a((Class) null, cVar);
    }

    public <T extends b<?>> boolean a(final Class<T> cls, final c<T> cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a13d5f2", new Object[]{this, cls, cVar})).booleanValue();
        }
        if (cVar == null) {
            return false;
        }
        this.e.post(new Runnable() { // from class: com.taobao.android.publisher.service.export.ayscpublish.core.d.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                List list = (List) d.a(d.this).get(cls);
                if (list == null) {
                    list = new ArrayList();
                    d.a(d.this).put(cls, list);
                }
                if (list.contains(cVar)) {
                    icp.a().b().b("PublishServiceImp", "register failed, already exist.");
                } else {
                    list.add(cVar);
                }
            }
        });
        return true;
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        List<APublishTask> f = f();
        if (f == null || f.size() <= 0) {
            icp.a().b().c("PublishServiceImp", String.format("restore task, no task need restore", new Object[0]));
            return;
        }
        for (APublishTask aPublishTask : f) {
            if (z) {
                aPublishTask.g = 0;
            }
            this.b.add(0, aPublishTask);
            b(aPublishTask.w()).execute(aPublishTask);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    private com.taobao.android.publisher.service.export.ayscpublish.core.APublishTask.StoreData a(java.io.File r14) {
        /*
            r13 = this;
            java.lang.String r0 = "PublishServiceImp"
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.android.publisher.service.export.ayscpublish.core.d.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L1a
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r4] = r13
            r0[r3] = r14
            java.lang.String r14 = "caf1fa29"
            java.lang.Object r14 = r1.ipc$dispatch(r14, r0)
            com.taobao.android.publisher.service.export.ayscpublish.core.APublishTask$StoreData r14 = (com.taobao.android.publisher.service.export.ayscpublish.core.APublishTask.StoreData) r14
            return r14
        L1a:
            r1 = 0
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L61
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L61
            r2.<init>(r14)     // Catch: java.lang.Throwable -> L61
            java.io.ObjectInputStream r14 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L5a
            r14.<init>(r2)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r7 = r14.readObject()     // Catch: java.lang.Throwable -> L55
            com.taobao.android.publisher.service.export.ayscpublish.core.APublishTask$StoreData r7 = (com.taobao.android.publisher.service.export.ayscpublish.core.APublishTask.StoreData) r7     // Catch: java.lang.Throwable -> L55
            tb.icp r8 = tb.icp.a()     // Catch: java.lang.Throwable -> L55
            com.taobao.android.publisher.service.export.ayscpublish.core.a r8 = r8.b()     // Catch: java.lang.Throwable -> L55
            java.lang.String r9 = "task restore, cost %d ms"
            java.lang.Object[] r10 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L55
            long r11 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L55
            long r11 = r11 - r5
            java.lang.Long r5 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L55
            r10[r4] = r5     // Catch: java.lang.Throwable -> L55
            java.lang.String r5 = java.lang.String.format(r9, r10)     // Catch: java.lang.Throwable -> L55
            r8.a(r0, r5)     // Catch: java.lang.Throwable -> L55
            com.taobao.android.publisher.service.export.ayscpublish.core.f.a(r2)
            com.taobao.android.publisher.service.export.ayscpublish.core.f.a(r14)
            return r7
        L55:
            r5 = move-exception
            goto L64
        L57:
            r0 = move-exception
            r14 = r1
            goto L86
        L5a:
            r5 = move-exception
            r14 = r1
            goto L64
        L5d:
            r0 = move-exception
            r14 = r1
            r2 = r14
            goto L86
        L61:
            r5 = move-exception
            r14 = r1
            r2 = r14
        L64:
            tb.icp r6 = tb.icp.a()     // Catch: java.lang.Throwable -> L85
            com.taobao.android.publisher.service.export.ayscpublish.core.a r6 = r6.b()     // Catch: java.lang.Throwable -> L85
            java.lang.String r7 = "task restore failed, exception=%s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L85
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L85
            r3[r4] = r5     // Catch: java.lang.Throwable -> L85
            java.lang.String r3 = java.lang.String.format(r7, r3)     // Catch: java.lang.Throwable -> L85
            r6.b(r0, r3)     // Catch: java.lang.Throwable -> L85
            com.taobao.android.publisher.service.export.ayscpublish.core.f.a(r2)
            com.taobao.android.publisher.service.export.ayscpublish.core.f.a(r14)
            return r1
        L85:
            r0 = move-exception
        L86:
            com.taobao.android.publisher.service.export.ayscpublish.core.f.a(r2)
            com.taobao.android.publisher.service.export.ayscpublish.core.f.a(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.publisher.service.export.ayscpublish.core.d.a(java.io.File):com.taobao.android.publisher.service.export.ayscpublish.core.APublishTask$StoreData");
    }

    private List<c> a(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ef3245d2", new Object[]{this, cls});
        }
        List<c> list = this.c.get(null);
        if (list == null) {
            list = new ArrayList<>();
            this.c.put(null, list);
        }
        List<c> list2 = this.c.get(cls);
        if (list2 == null) {
            list2 = new ArrayList<>();
            this.c.put(cls, list2);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(list2);
        return arrayList;
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.c
    public void a(final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20576e22", new Object[]{this, bVar});
        } else if ((bVar instanceof APublishTask) && ((APublishTask) bVar).u()) {
        } else {
            icp.a().b().a("PublishServiceImp", String.format("task[%s] onTaskCreate!", bVar.toString()));
            bVar.k();
            this.e.post(new Runnable() { // from class: com.taobao.android.publisher.service.export.ayscpublish.core.d.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    for (c cVar : d.a(d.this, bVar.getClass())) {
                        cVar.a(bVar);
                    }
                }
            });
        }
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.c
    public void b(final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11a8fda3", new Object[]{this, bVar});
            return;
        }
        icp.a().b().a("PublishServiceImp", String.format("task[%s] onTaskDestory!", bVar.toString()));
        bVar.l();
        this.e.post(new Runnable() { // from class: com.taobao.android.publisher.service.export.ayscpublish.core.d.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                for (c cVar : d.a(d.this, bVar.getClass())) {
                    cVar.b(bVar);
                }
            }
        });
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.c
    public synchronized void c(final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fa8d24", new Object[]{this, bVar});
            return;
        }
        icp.a().b().a("PublishServiceImp", String.format("task[%s] onPublishStart!", bVar.toString()));
        this.e.post(new Runnable() { // from class: com.taobao.android.publisher.service.export.ayscpublish.core.d.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                for (c cVar : d.a(d.this, bVar.getClass())) {
                    cVar.c(bVar);
                }
            }
        });
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.c
    public void a(final b bVar, final float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea96bdde", new Object[]{this, bVar, new Float(f)});
            return;
        }
        icp.a().b().a("PublishServiceImp", String.format("task[%s] onPublishProgress, progress=%f", bVar.toString(), Float.valueOf(f)));
        this.e.post(new Runnable() { // from class: com.taobao.android.publisher.service.export.ayscpublish.core.d.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                for (c cVar : d.a(d.this, bVar.getClass())) {
                    cVar.a((c) bVar, f);
                }
            }
        });
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.c
    public void a(final b bVar, final APublishTask.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b59e4ba2", new Object[]{this, bVar, aVar});
            return;
        }
        icp.a().b().a("PublishServiceImp", String.format("task[%s] onPublishStepChanged,", bVar.toString()));
        this.e.post(new Runnable() { // from class: com.taobao.android.publisher.service.export.ayscpublish.core.d.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                for (c cVar : d.a(d.this, bVar.getClass())) {
                    cVar.a((c) bVar, aVar);
                }
            }
        });
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.c
    public synchronized void d(final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f44c1ca5", new Object[]{this, bVar});
            return;
        }
        icp.a().b().a("PublishServiceImp", String.format("task[%s] onPublishSuccess!", bVar.toString()));
        this.b.remove(bVar);
        this.e.post(new Runnable() { // from class: com.taobao.android.publisher.service.export.ayscpublish.core.d.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                for (c cVar : d.a(d.this, bVar.getClass())) {
                    cVar.d(bVar);
                }
            }
        });
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.c
    public synchronized void a(final b bVar, final PublishError publishError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7150f59", new Object[]{this, bVar, publishError});
            return;
        }
        icp.a().b().b("PublishServiceImp", String.format("task[%s] onPublishFailed errorCode=%s, errorMsg=%s!", bVar.toString(), publishError.errorCode, publishError.errorMsg));
        this.b.remove(bVar);
        this.e.post(new Runnable() { // from class: com.taobao.android.publisher.service.export.ayscpublish.core.d.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                for (c cVar : d.a(d.this, bVar.getClass())) {
                    cVar.a((c) bVar, publishError);
                }
            }
        });
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.c
    public synchronized void e(final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e59dac26", new Object[]{this, bVar});
            return;
        }
        icp.a().b().c("PublishServiceImp", String.format("task[%s] onRetry", bVar.toString()));
        this.e.post(new Runnable() { // from class: com.taobao.android.publisher.service.export.ayscpublish.core.d.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                for (c cVar : d.a(d.this, bVar.getClass())) {
                    cVar.e(bVar);
                }
            }
        });
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.c
    public synchronized void f(final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6ef3ba7", new Object[]{this, bVar});
            return;
        }
        icp.a().b().b("PublishServiceImp", String.format("task[%s] onCancel", bVar.toString()));
        this.e.post(new Runnable() { // from class: com.taobao.android.publisher.service.export.ayscpublish.core.d.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                for (c cVar : d.a(d.this, bVar.getClass())) {
                    cVar.f(bVar);
                }
            }
        });
    }
}
