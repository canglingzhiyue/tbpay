package com.taobao.downloader.manager;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downloader.manager.NetworkManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import tb.kli;
import tb.klo;
import tb.kmf;
import tb.kmg;
import tb.kmh;
import tb.kmi;
import tb.kmj;
import tb.kml;
import tb.kmp;
import tb.kmr;
import tb.kmt;
import tb.kmv;
import tb.knb;
import tb.knd;

/* loaded from: classes7.dex */
public class PriorityTaskManager implements NetworkManager.NetChangeListener, kli {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PriTaskManager";
    private com.taobao.downloader.manager.a downloadManager;
    private b taskDispatchThread;
    private final List<kmr> curDownloadingList = new ArrayList();
    private kmg dataSource = new kmg();
    private kmi taskExecutor = new kmi();
    private kmj taskSelector = new kmj();
    private kmh taskRanker = new kmh(this.dataSource);
    private NetworkManager networkManager = NetworkManager.a(com.taobao.downloader.a.c);

    public static /* synthetic */ kmg access$100(PriorityTaskManager priorityTaskManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kmg) ipChange.ipc$dispatch("9209dcf3", new Object[]{priorityTaskManager}) : priorityTaskManager.dataSource;
    }

    public static /* synthetic */ List access$200(PriorityTaskManager priorityTaskManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d253c45a", new Object[]{priorityTaskManager}) : priorityTaskManager.curDownloadingList;
    }

    public static /* synthetic */ com.taobao.downloader.manager.a access$300(PriorityTaskManager priorityTaskManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.downloader.manager.a) ipChange.ipc$dispatch("9b7f81c5", new Object[]{priorityTaskManager}) : priorityTaskManager.downloadManager;
    }

    public static /* synthetic */ void access$400(PriorityTaskManager priorityTaskManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbd10ba9", new Object[]{priorityTaskManager, new Boolean(z)});
        } else {
            priorityTaskManager.dispatchTask(z);
        }
    }

    public static /* synthetic */ NetworkManager access$500(PriorityTaskManager priorityTaskManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NetworkManager) ipChange.ipc$dispatch("c9abb8f3", new Object[]{priorityTaskManager}) : priorityTaskManager.networkManager;
    }

    public static /* synthetic */ kmh access$600(PriorityTaskManager priorityTaskManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kmh) ipChange.ipc$dispatch("16c73517", new Object[]{priorityTaskManager}) : priorityTaskManager.taskRanker;
    }

    public static /* synthetic */ kmj access$700(PriorityTaskManager priorityTaskManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kmj) ipChange.ipc$dispatch("6486ad56", new Object[]{priorityTaskManager}) : priorityTaskManager.taskSelector;
    }

    public PriorityTaskManager() {
        this.networkManager.a(this);
        this.taskDispatchThread = new b();
        this.downloadManager = new com.taobao.downloader.manager.a();
    }

    @Override // tb.kli
    public void addTask(List<kmr> list, kmt kmtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f872021c", new Object[]{this, list, kmtVar});
            return;
        }
        kmv.a(TAG, "addTask", "item size", Integer.valueOf(list.size()), "param", kmtVar);
        this.taskRanker.f.removeAll(list);
        synchronized (this.curDownloadingList) {
            this.dataSource.a(list, kmtVar);
        }
        if (kmtVar.e == null) {
            kmtVar.e = new ArrayList();
            for (kmr kmrVar : list) {
                kmtVar.e.add(kmrVar.e);
            }
        }
        dispatchTask(true);
    }

    public void modifyTask(int i, kmp kmpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8ee00bf", new Object[]{this, new Integer(i), kmpVar});
            return;
        }
        this.dataSource.a(i, kmpVar);
        dispatchTask(true);
    }

    @Override // tb.kli
    public void modifyTask(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edbd5146", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.dataSource.a(i, i2);
        dispatchTask(true);
    }

    private void dispatchTask(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6398796e", new Object[]{this, new Boolean(z)});
        } else if (z && this.networkManager.a().f17081a == 0) {
        } else {
            this.taskExecutor.a(this.taskDispatchThread);
        }
    }

    @Override // com.taobao.downloader.manager.NetworkManager.NetChangeListener
    public void onChange(NetworkManager.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d9496a0", new Object[]{this, aVar});
            return;
        }
        kmv.b(TAG, "onChange network", "status", Integer.valueOf(aVar.f17081a));
        if (aVar.f17081a == 0) {
            return;
        }
        this.taskRanker.f.clear();
        dispatchTask(false);
    }

    /* loaded from: classes7.dex */
    public class a implements klo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private kmr b;

        public a(kmr kmrVar) {
            this.b = kmrVar;
        }

        @Override // tb.klo
        public void a(long j, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2d8a2226", new Object[]{this, new Long(j), str});
                return;
            }
            List<kmt> list = PriorityTaskManager.access$100(PriorityTaskManager.this).f30159a.get(this.b);
            if (list == null) {
                return;
            }
            for (kmt kmtVar : list) {
                kmtVar.d.a(j, str);
            }
        }

        @Override // tb.klo
        public void a(kmr kmrVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1604d88", new Object[]{this, kmrVar});
                return;
            }
            kmv.b(PriorityTaskManager.TAG, "onResult", "task", kmrVar);
            if (!kmrVar.f30170a && kmrVar.k != null) {
                knb.a(kmrVar.k, "stat");
            }
            if (kmrVar.f30170a || !kmrVar.j.a()) {
                knb.a(kmrVar.k, "stat");
            }
            synchronized (PriorityTaskManager.access$200(PriorityTaskManager.this)) {
                PriorityTaskManager.access$200(PriorityTaskManager.this).remove(kmrVar);
                if (PriorityTaskManager.access$300(PriorityTaskManager.this) != null) {
                    PriorityTaskManager.access$300(PriorityTaskManager.this).c(kmrVar);
                }
                PriorityTaskManager.access$400(PriorityTaskManager.this, false);
            }
        }
    }

    /* loaded from: classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Runnable b;

        private b() {
        }

        public static /* synthetic */ Runnable a(b bVar, Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Runnable) ipChange.ipc$dispatch("7e2a1dd6", new Object[]{bVar, runnable});
            }
            bVar.b = runnable;
            return runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            synchronized (PriorityTaskManager.access$200(PriorityTaskManager.this)) {
                PriorityTaskManager.access$600(PriorityTaskManager.this).a(PriorityTaskManager.access$500(PriorityTaskManager.this).a());
                kmv.a(PriorityTaskManager.TAG, "dispatch", "all tasks ready to download", Integer.valueOf(PriorityTaskManager.access$600(PriorityTaskManager.this).f30160a.size()));
                a();
                PriorityTaskManager.access$700(PriorityTaskManager.this);
                List<kmr> a2 = kmj.a(PriorityTaskManager.access$600(PriorityTaskManager.this).f30160a);
                kmv.a(PriorityTaskManager.TAG, "dispatch", "tasks start to download", Integer.valueOf(a2.size()));
                a(a2);
                b(a2);
                b();
                c();
                PriorityTaskManager.access$200(PriorityTaskManager.this).clear();
                PriorityTaskManager.access$200(PriorityTaskManager.this).addAll(a2);
            }
        }

        private void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            for (kmr kmrVar : PriorityTaskManager.access$600(PriorityTaskManager.this).b) {
                List<kmt> list = PriorityTaskManager.access$100(PriorityTaskManager.this).f30159a.get(kmrVar);
                if (list != null) {
                    for (kmt kmtVar : list) {
                        kmtVar.d.a(kmrVar);
                    }
                }
                PriorityTaskManager.access$100(PriorityTaskManager.this).f30159a.remove(kmrVar);
            }
        }

        private void a(List<kmr> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
                return;
            }
            for (kmr kmrVar : list) {
                if (!PriorityTaskManager.access$200(PriorityTaskManager.this).contains(kmrVar)) {
                    PriorityTaskManager.access$300(PriorityTaskManager.this).a(kmrVar, new a(kmrVar));
                    kmv.b(PriorityTaskManager.TAG, "start download", kmrVar.e);
                } else {
                    kmv.b(PriorityTaskManager.TAG, "task is already running, no need to start again", kmrVar.e);
                }
                List<kmt> list2 = PriorityTaskManager.access$100(PriorityTaskManager.this).f30159a.get(kmrVar);
                if (list2 != null) {
                    for (kmt kmtVar : list2) {
                        if (kmtVar.d != null) {
                            kmtVar.d.a(kmrVar.e.f30167a, true);
                        }
                    }
                }
            }
        }

        private void b(List<kmr> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
                return;
            }
            HashSet<kmt> hashSet = new HashSet();
            for (kmf kmfVar : PriorityTaskManager.access$600(PriorityTaskManager.this).e) {
                if (PriorityTaskManager.access$200(PriorityTaskManager.this).contains(kmfVar.f30158a)) {
                    PriorityTaskManager.access$300(PriorityTaskManager.this).a(kmfVar.f30158a);
                    kmfVar.b.d.a(kmfVar.f30158a.e.f30167a, false);
                    kmv.b(PriorityTaskManager.TAG, "stopDownload as in current downloading list", "network limit item", kmfVar.f30158a.e);
                } else {
                    if (kmfVar.b.c.g) {
                        hashSet.add(kmfVar.b);
                    }
                    kmv.b(PriorityTaskManager.TAG, "stopDownload but not is in current downloading list", "network limit item", kmfVar.f30158a.e);
                }
            }
            for (kmr kmrVar : PriorityTaskManager.access$200(PriorityTaskManager.this)) {
                if (!list.contains(kmrVar) && kmrVar != null && !kmrVar.f30170a) {
                    PriorityTaskManager.access$300(PriorityTaskManager.this).a(kmrVar, false);
                    kmv.b(PriorityTaskManager.TAG, "stopDownload as not in start download list", "current downloading item", kmrVar.e);
                }
            }
            for (kmt kmtVar : hashSet) {
                kmv.a(PriorityTaskManager.TAG, "stopDownload ask if can change network", "taskParam", kmtVar);
                kmtVar.d.a(PriorityTaskManager.access$500(PriorityTaskManager.this).a().f17081a, kmtVar.c, new kml.a() { // from class: com.taobao.downloader.manager.PriorityTaskManager.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.kml.a
                    public void a(boolean z) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                        } else if (!z) {
                        } else {
                            PriorityTaskManager.access$400(PriorityTaskManager.this, true);
                        }
                    }
                });
            }
        }

        private void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            for (kmf kmfVar : PriorityTaskManager.access$600(PriorityTaskManager.this).d) {
                if (PriorityTaskManager.access$200(PriorityTaskManager.this).contains(kmfVar.f30158a)) {
                    PriorityTaskManager.access$200(PriorityTaskManager.this).remove(kmfVar.f30158a);
                    PriorityTaskManager.access$300(PriorityTaskManager.this).b(kmfVar.f30158a);
                    kmv.b(PriorityTaskManager.TAG, "cancelDownload as in current downloading list", "cancel item", kmfVar.f30158a.e);
                } else {
                    kmv.b(PriorityTaskManager.TAG, "cancelDownload but not is in current downloading list callback only", "cancel item", kmfVar.f30158a.e);
                }
                kmr kmrVar = new kmr();
                kmrVar.b = -16;
                kmrVar.f30170a = false;
                kmrVar.e = kmfVar.f30158a.e;
                kmrVar.f = kmfVar.b.c;
                kmfVar.b.d.a(kmrVar);
                PriorityTaskManager.access$100(PriorityTaskManager.this).a(kmfVar.f30158a, kmfVar.b);
            }
        }

        private void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            for (kmr kmrVar : PriorityTaskManager.access$600(PriorityTaskManager.this).c) {
                if (kmrVar.b == -20) {
                    kmrVar.a(true);
                } else if (kmrVar.j.a()) {
                    kmrVar.a(false);
                    d();
                } else {
                    List<kmt> list = PriorityTaskManager.access$100(PriorityTaskManager.this).f30159a.get(kmrVar);
                    if (list != null) {
                        Iterator<kmt> it = list.iterator();
                        while (it.hasNext()) {
                            kmt next = it.next();
                            int i = next.c.e;
                            if (i == 0) {
                                next.d.a(kmrVar);
                                if (PriorityTaskManager.access$100(PriorityTaskManager.this).f30159a.containsKey(kmrVar)) {
                                    it.remove();
                                    if (list.isEmpty()) {
                                        PriorityTaskManager.access$100(PriorityTaskManager.this).f30159a.remove(kmrVar);
                                    }
                                }
                                PriorityTaskManager.access$100(PriorityTaskManager.this).a(next.b, 2);
                            }
                            if (1 == i) {
                                next.d.a(kmrVar);
                                if (PriorityTaskManager.access$100(PriorityTaskManager.this).f30159a.containsKey(kmrVar)) {
                                    it.remove();
                                    if (list.isEmpty()) {
                                        PriorityTaskManager.access$100(PriorityTaskManager.this).f30159a.remove(kmrVar);
                                    }
                                }
                            } else if (2 == i) {
                                PriorityTaskManager.access$600(PriorityTaskManager.this).f.add(kmrVar.b());
                            }
                        }
                    }
                }
            }
        }

        private void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            } else if (this.b != null) {
            } else {
                this.b = new Runnable() { // from class: com.taobao.downloader.manager.PriorityTaskManager.b.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        PriorityTaskManager.access$400(PriorityTaskManager.this, true);
                        b.a(b.this, null);
                    }
                };
                knd.a(this.b, com.taobao.downloader.a.b * 1000);
            }
        }
    }
}
