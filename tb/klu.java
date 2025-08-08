package tb;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import anet.channel.util.HttpConstant;
import anetwork.channel.util.RequestConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.downloader.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import mtopsdk.network.impl.ResponseProtocolType;
import tb.klw;
import tb.knb;

/* loaded from: classes7.dex */
public class klu implements kln {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ST_CANCELED = 2;
    public static final int ST_PAUSED = 1;
    private static File b;
    private static AtomicInteger c = new AtomicInteger(1);
    private klv d;
    private klw e;
    private klx f;
    private int g;
    private RandomAccessFile h;
    private RandomAccessFile[] i;
    private AtomicLong j = new AtomicLong(0);
    private AtomicLong k = new AtomicLong(0);
    private AtomicBoolean l = new AtomicBoolean(false);
    private AtomicBoolean m = new AtomicBoolean(false);
    private AtomicBoolean n = new AtomicBoolean(false);
    private AtomicInteger o = new AtomicInteger(0);
    private AtomicBoolean p = new AtomicBoolean(false);

    /* renamed from: a  reason: collision with root package name */
    public kmb f30144a = new kmb() { // from class: tb.klu.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.kmb
        public boolean a(final int i, Map<String, List<String>> map, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d6525fea", new Object[]{this, new Integer(i), map, obj})).booleanValue();
            }
            kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + klu.a(klu.this) + ", doBoostNetworkDownload  onResponseCode " + i + ", url = " + klu.b(klu.this).b.e.f30167a, new Object[0]);
            knb.a aVar = klu.c(klu.this).f;
            aVar.f = aVar.f + (System.currentTimeMillis() - klu.d(klu.this).get());
            if (!klu.b(klu.this).a(0L, i)) {
                klu.e(klu.this).set(true);
                if (klu.f(klu.this) != null) {
                    klu.f(klu.this).a();
                }
                knd.a(new Runnable() { // from class: tb.klu.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + klu.a(klu.this) + ", doBoostNetworkDownload  onResponseCode code invalid " + i, new Object[0]);
                        klu.c(klu.this).e.a(-12, i, "http code invalid").c = true;
                        klu.c(klu.this).a(klu.b(klu.this));
                    }
                }, false);
            }
            klu.a(klu.this, map);
            klu.c(klu.this).c.set(kmy.a(klu.b(klu.this).f, klu.a(klu.this)));
            return false;
        }

        @Override // tb.kmb
        public void a(final kmc kmcVar, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2eb8fc13", new Object[]{this, kmcVar, obj});
            } else if (klu.e(klu.this).get()) {
                if (klu.f(klu.this) != null) {
                    klu.f(klu.this).a();
                }
                kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + klu.a(klu.this) + ", onDataReceived 提前中断", new Object[0]);
            } else if (kmcVar == null) {
                kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + klu.a(klu.this) + ", doBoostNetworkDownload  onDataReceived progressEvent is null ", new Object[0]);
            } else {
                if (klu.g(klu.this).get() == 0) {
                    klu.g(klu.this).set(System.currentTimeMillis());
                    kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + klu.a(klu.this) + ", onDataReceived 首次收到数据", new Object[0]);
                }
                klu kluVar = klu.this;
                int a2 = klu.a(kluVar, klu.h(kluVar).get());
                if (a2 > 0) {
                    klu.e(klu.this).set(true);
                    klu.c(klu.this).e.a(-20, a2, "");
                    kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + klu.a(klu.this) + ", onDataReceived 任务被暂停 提前中断", new Object[0]);
                    kmu.a(new Runnable() { // from class: tb.klu.1.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                klu.c(klu.this).a(klu.b(klu.this));
                            }
                        }
                    });
                } else if (!klu.i(klu.this).get() && klu.j(klu.this) != null) {
                    kmu.a(new Runnable() { // from class: tb.klu.1.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (klu.e(klu.this).get()) {
                                kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + klu.a(klu.this) + ", doBoostNetworkDownload  onDataReceived interrupt", new Object[0]);
                            } else {
                                int a3 = klu.a(klu.this, klu.h(klu.this).get());
                                if (a3 > 0) {
                                    kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + klu.a(klu.this) + ", doBoostNetworkDownload  onDataReceived stopped", new Object[0]);
                                    klu.e(klu.this).set(true);
                                    klu.c(klu.this).e.a(-20, a3, "");
                                    klu.c(klu.this).a(klu.b(klu.this));
                                    return;
                                }
                                int i = kmcVar.e;
                                if (klu.j(klu.this) == null || klu.j(klu.this).length <= i) {
                                    kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + klu.a(klu.this) + ", doBoostNetworkDownload  partRandomAccessFiles error", new Object[0]);
                                    return;
                                }
                                if (klu.j(klu.this)[i] == null) {
                                    try {
                                        klu.j(klu.this)[i] = klu.b(klu.this).a(klu.b(klu.this).f[i]);
                                    } catch (FileNotFoundException e) {
                                        kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + klu.a(klu.this) + ", doBoostNetworkDownload  partRandomAccessFile error: " + e, new Object[0]);
                                    }
                                }
                                klu.a(klu.this, kmcVar, klu.j(klu.this)[i]);
                            }
                        }
                    });
                } else {
                    if (!klu.i(klu.this).get()) {
                        kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + klu.a(klu.this) + ", doBoostNetworkDownload  onDataReceived degrade !!!!!!!", new Object[0]);
                        klu.i(klu.this).set(true);
                    }
                    kmu.a(new Runnable() { // from class: tb.klu.1.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            if (klu.k(klu.this) == null) {
                                try {
                                    klu.a(klu.this, klu.b(klu.this).a(klu.b(klu.this).d));
                                } catch (FileNotFoundException e) {
                                    e.printStackTrace();
                                }
                                if (klu.k(klu.this) == null) {
                                    kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + klu.a(klu.this) + ", doBoostNetworkDownload  getTempRandomAccessFile error", new Object[0]);
                                    return;
                                }
                            }
                            klu.a(klu.this, kmcVar, klu.k(klu.this));
                        }
                    });
                }
            }
        }

        @Override // tb.kmb
        public void a(final int i, final String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            } else if (klu.e(klu.this).get()) {
                kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + klu.a(klu.this) + ", onFinished 提前中断", new Object[0]);
            } else {
                kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + klu.a(klu.this) + ", doBoostNetworkDownload  onFinished" + i + ", " + str + ", alltime = " + (System.currentTimeMillis() - klu.d(klu.this).get()) + ", url = " + klu.b(klu.this).b.e.f30167a, new Object[0]);
                knb.a aVar = klu.c(klu.this).f;
                aVar.g = aVar.g + (System.currentTimeMillis() - klu.g(klu.this).get());
                kmu.a(new Runnable() { // from class: tb.klu.1.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        if (klu.i(klu.this).get()) {
                            kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + klu.a(klu.this) + ", onFinished 降级" + i + ", " + str, new Object[0]);
                            klu.b(klu.this, i);
                        } else {
                            kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + klu.a(klu.this) + ", onFinished 正常结束" + i + ", " + str, new Object[0]);
                            klu.c(klu.this, i);
                        }
                        klu.c(klu.this).a(klu.b(klu.this));
                    }
                });
            }
        }
    };
    private int q = c.getAndAdd(1);

    public static /* synthetic */ int a(klu kluVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1539317", new Object[]{kluVar})).intValue() : kluVar.q;
    }

    public static /* synthetic */ int a(klu kluVar, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("391f4452", new Object[]{kluVar, new Integer(i)})).intValue() : kluVar.a(i);
    }

    public static /* synthetic */ RandomAccessFile a(klu kluVar, RandomAccessFile randomAccessFile) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RandomAccessFile) ipChange.ipc$dispatch("cb05b9b2", new Object[]{kluVar, randomAccessFile});
        }
        kluVar.h = randomAccessFile;
        return randomAccessFile;
    }

    public static /* synthetic */ void a(klu kluVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91891be1", new Object[]{kluVar, map});
        } else {
            kluVar.a(map);
        }
    }

    public static /* synthetic */ void a(klu kluVar, kmc kmcVar, RandomAccessFile randomAccessFile) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f2e67e3", new Object[]{kluVar, kmcVar, randomAccessFile});
        } else {
            kluVar.a(kmcVar, randomAccessFile);
        }
    }

    public static /* synthetic */ klv b(klu kluVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (klv) ipChange.ipc$dispatch("dee7d0ac", new Object[]{kluVar}) : kluVar.d;
    }

    public static /* synthetic */ void b(klu kluVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afd0dfe", new Object[]{kluVar, new Integer(i)});
        } else {
            kluVar.c(i);
        }
    }

    public static /* synthetic */ klw c(klu kluVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (klw) ipChange.ipc$dispatch("c689a72a", new Object[]{kluVar}) : kluVar.e;
    }

    public static /* synthetic */ void c(klu kluVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcdad79d", new Object[]{kluVar, new Integer(i)});
        } else {
            kluVar.b(i);
        }
    }

    public static /* synthetic */ AtomicLong d(klu kluVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicLong) ipChange.ipc$dispatch("da259fab", new Object[]{kluVar}) : kluVar.j;
    }

    public static /* synthetic */ AtomicBoolean e(klu kluVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("1ce83068", new Object[]{kluVar}) : kluVar.l;
    }

    public static /* synthetic */ klx f(klu kluVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (klx) ipChange.ipc$dispatch("7d6f2a66", new Object[]{kluVar}) : kluVar.f;
    }

    public static /* synthetic */ AtomicLong g(klu kluVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicLong) ipChange.ipc$dispatch("63af6ec8", new Object[]{kluVar}) : kluVar.k;
    }

    public static /* synthetic */ AtomicInteger h(klu kluVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("434dbdd5", new Object[]{kluVar}) : kluVar.o;
    }

    public static /* synthetic */ AtomicBoolean i(klu kluVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("c239856c", new Object[]{kluVar}) : kluVar.m;
    }

    public static /* synthetic */ RandomAccessFile[] j(klu kluVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RandomAccessFile[]) ipChange.ipc$dispatch("6c8073e2", new Object[]{kluVar}) : kluVar.i;
    }

    public static /* synthetic */ RandomAccessFile k(klu kluVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RandomAccessFile) ipChange.ipc$dispatch("ded9efd8", new Object[]{kluVar}) : kluVar.h;
    }

    @Override // tb.kln
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.g |= 2;
        this.o.set(this.g);
    }

    @Override // tb.kln
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.g |= 1;
        this.o.set(this.g);
    }

    @Override // tb.kln
    public void a(kmr kmrVar, klo kloVar) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8619a0a", new Object[]{this, kmrVar, kloVar});
            return;
        }
        this.d = new klv(kmrVar);
        this.e = new klw(kloVar);
        try {
            int a2 = a(this.o.get());
            if (a2 > 0) {
                this.e.e.a(-20, a2, "");
                kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", download status changed1 status = " + a2, new Object[0]);
                if (z) {
                    return;
                }
                return;
            }
            this.d.a();
            if (this.d.b()) {
                kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", download hitFileCache", new Object[0]);
                this.e.f30152a = 11;
                if (this.n.get()) {
                    return;
                }
                this.e.a(this.d);
            } else if (this.d.c()) {
                if (kmx.a(this.d.d, this.d.e)) {
                    this.e.f30152a = 11;
                } else {
                    this.e.e.a(-11, this.d.e.getParentFile().canWrite() ? 104 : 105, "rename tmp file error").e = true;
                }
                kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", download hitTmpCache", new Object[0]);
                if (this.n.get()) {
                    return;
                }
                this.e.a(this.d);
            } else if (!a(kmrVar.e.b)) {
                this.e.e.f30153a = false;
                this.e.e.f = -21;
                this.d.b.f.r = 0;
                this.d.b.f.e = 0;
                if (this.n.get()) {
                    return;
                }
                this.e.a(this.d);
            } else {
                if (f()) {
                    this.n.set(true);
                    kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", supportBoostNetwork 开始走分包请求 url " + this.d.b.e.f30167a, new Object[0]);
                    g();
                } else {
                    kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", 同步请求 url = " + this.d.b.e.f30167a, new Object[0]);
                    c();
                }
                if (this.n.get()) {
                    return;
                }
                this.e.a(this.d);
            }
        } catch (Throwable th) {
            try {
                kmv.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", do download exception", th, new Object[0]);
                this.e.e.a(-19, 301, a(th));
                if (this.n.get()) {
                    return;
                }
                this.e.a(this.d);
            } finally {
                if (!this.n.get()) {
                    this.e.a(this.d);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v4, types: [long] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [tb.kma] */
    /* JADX WARN: Type inference failed for: r9v9, types: [tb.kma] */
    private boolean c() {
        kma kmaVar;
        klz klzVar;
        Throwable th;
        RandomAccessFile randomAccessFile;
        klz klzVar2;
        klz klzVar3;
        Pair<Boolean, String> d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        RandomAccessFile randomAccessFile2 = null;
        try {
            ?? currentTimeMillis = System.currentTimeMillis();
            klz d2 = d();
            try {
                this.e.f.f += System.currentTimeMillis() - currentTimeMillis;
                try {
                    if (d2 == null) {
                        if (d2 != null) {
                            try {
                                d2.f();
                            } catch (Throwable th2) {
                                kmv.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", on exception", th2, new Object[0]);
                            }
                        }
                        return false;
                    }
                    try {
                        currentTimeMillis = d2.c();
                        if (currentTimeMillis == 0) {
                            klzVar2 = d2;
                            try {
                                throw new IOException("inputstream is null");
                            } catch (IOException e) {
                                e = e;
                                kmv.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", conn.getinputstream exception", e, new Object[0]);
                                this.e.e.a(-12, 205, klzVar2.e()).c = true;
                                if (currentTimeMillis != 0) {
                                    try {
                                        currentTimeMillis.a();
                                    } catch (Throwable th3) {
                                        kmv.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", on exception", th3, new Object[0]);
                                    }
                                }
                                if (klzVar2 != null) {
                                    try {
                                        klzVar2.f();
                                    } catch (Throwable th4) {
                                        kmv.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", on exception", th4, new Object[0]);
                                    }
                                }
                                return false;
                            }
                        }
                        try {
                            try {
                                randomAccessFile2 = this.d.f();
                                if (randomAccessFile2 == null) {
                                    klzVar3 = d2;
                                    try {
                                        throw new FileNotFoundException("outputStream is null");
                                    } catch (FileNotFoundException e2) {
                                        e = e2;
                                        kmv.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", getRandomAccessFile", e, new Object[0]);
                                        this.e.e.a(-11, 103, klzVar3.e()).e = true;
                                        if (randomAccessFile2 != null) {
                                            try {
                                                randomAccessFile2.close();
                                            } catch (IOException e3) {
                                                kmv.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", on exception", e3, new Object[0]);
                                            }
                                        }
                                        if (currentTimeMillis != 0) {
                                            try {
                                                currentTimeMillis.a();
                                            } catch (Throwable th5) {
                                                kmv.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", on exception", th5, new Object[0]);
                                            }
                                        }
                                        if (klzVar3 != null) {
                                            try {
                                                klzVar3.f();
                                            } catch (Throwable th6) {
                                                kmv.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", on exception", th6, new Object[0]);
                                            }
                                        }
                                        return false;
                                    }
                                }
                                long currentTimeMillis2 = System.currentTimeMillis();
                                boolean a2 = a(d2, (kma) currentTimeMillis, randomAccessFile2);
                                this.e.f.g += System.currentTimeMillis() - currentTimeMillis2;
                                if (!a2) {
                                    if (randomAccessFile2 != null) {
                                        try {
                                            randomAccessFile2.close();
                                        } catch (IOException e4) {
                                            kmv.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", on exception", e4, new Object[0]);
                                        }
                                    }
                                    if (currentTimeMillis != 0) {
                                        try {
                                            currentTimeMillis.a();
                                        } catch (Throwable th7) {
                                            kmv.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", on exception", th7, new Object[0]);
                                        }
                                    }
                                    if (d2 != null) {
                                        try {
                                            d2.f();
                                        } catch (Throwable th8) {
                                            kmv.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", on exception", th8, new Object[0]);
                                        }
                                    }
                                    return false;
                                }
                                kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", doNetworkDownload checkTmpCacheValidity start", new Object[0]);
                                long currentTimeMillis3 = System.currentTimeMillis();
                                if (!((Boolean) this.d.d().first).booleanValue()) {
                                    this.e.f.n = this.d.b.e.c + "," + ((String) d.second);
                                    kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", doNetworkDownload =checkTmpCacheValidity error delete file  url = " + this.d.b.e.f30167a + " size =" + this.d.b.e.b + ", md5 = " + this.e.f.n, new Object[0]);
                                    this.d.d.delete();
                                    this.e.e.a(this.d.g(), 106, "download invalid");
                                    if (randomAccessFile2 != null) {
                                        try {
                                            randomAccessFile2.close();
                                        } catch (IOException e5) {
                                            kmv.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", on exception", e5, new Object[0]);
                                        }
                                    }
                                    if (currentTimeMillis != 0) {
                                        try {
                                            currentTimeMillis.a();
                                        } catch (Throwable th9) {
                                            kmv.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", on exception", th9, new Object[0]);
                                        }
                                    }
                                    if (d2 != null) {
                                        try {
                                            d2.f();
                                        } catch (Throwable th10) {
                                            kmv.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", on exception", th10, new Object[0]);
                                        }
                                    }
                                    return false;
                                }
                                this.e.f.k = System.currentTimeMillis() - currentTimeMillis3;
                                kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", doNetworkDownload moveFile start", new Object[0]);
                                if (kmx.a(this.d.d, this.d.e)) {
                                    kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", doNetworkDownload moveFile end", new Object[0]);
                                    this.e.f30152a = 10;
                                    if (randomAccessFile2 != null) {
                                        try {
                                            randomAccessFile2.close();
                                        } catch (IOException e6) {
                                            kmv.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", on exception", e6, new Object[0]);
                                        }
                                    }
                                    if (currentTimeMillis != 0) {
                                        try {
                                            currentTimeMillis.a();
                                        } catch (Throwable th11) {
                                            kmv.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", on exception", th11, new Object[0]);
                                        }
                                    }
                                    if (d2 != null) {
                                        try {
                                            d2.f();
                                        } catch (Throwable th12) {
                                            kmv.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", on exception", th12, new Object[0]);
                                        }
                                    }
                                    return true;
                                }
                                kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", doNetworkDownload moveFile error", new Object[0]);
                                this.e.e.a(-11, this.d.e.getParentFile().canWrite() ? 104 : 105, "rename tmp file error").e = true;
                                if (randomAccessFile2 != null) {
                                    try {
                                        randomAccessFile2.close();
                                    } catch (IOException e7) {
                                        kmv.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", on exception", e7, new Object[0]);
                                    }
                                }
                                if (currentTimeMillis != 0) {
                                    try {
                                        currentTimeMillis.a();
                                    } catch (Throwable th13) {
                                        kmv.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", on exception", th13, new Object[0]);
                                    }
                                }
                                if (d2 != null) {
                                    try {
                                        d2.f();
                                    } catch (Throwable th14) {
                                        kmv.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", on exception", th14, new Object[0]);
                                    }
                                }
                                return false;
                            } catch (Throwable th15) {
                                th = th15;
                                klzVar = d2;
                                th = th;
                                randomAccessFile = null;
                                kmaVar = currentTimeMillis;
                                if (randomAccessFile != null) {
                                    try {
                                        randomAccessFile.close();
                                    } catch (IOException e8) {
                                        kmv.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", on exception", e8, new Object[0]);
                                    }
                                }
                                if (kmaVar != null) {
                                    try {
                                        kmaVar.a();
                                    } catch (Throwable th16) {
                                        kmv.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", on exception", th16, new Object[0]);
                                    }
                                }
                                if (klzVar != null) {
                                    try {
                                        klzVar.f();
                                    } catch (Throwable th17) {
                                        kmv.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", on exception", th17, new Object[0]);
                                    }
                                }
                                throw th;
                            }
                        } catch (FileNotFoundException e9) {
                            e = e9;
                            klzVar3 = d2;
                        }
                    } catch (IOException e10) {
                        e = e10;
                        klzVar2 = d2;
                        currentTimeMillis = 0;
                    }
                } catch (Throwable th18) {
                    th = th18;
                }
            } catch (Throwable th19) {
                klzVar = d2;
                kmaVar = null;
                th = th19;
                randomAccessFile = null;
            }
        } catch (Throwable th20) {
            kmaVar = null;
            klzVar = null;
            th = th20;
            randomAccessFile = null;
        }
    }

    private klz d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (klz) ipChange.ipc$dispatch("261bdd22", new Object[]{this});
        }
        klz a2 = knc.a(this.d.b.e, this.d.f30151a);
        try {
            a2.a(this.d.c, this.d.f30151a);
            String a3 = a(this.d.b.f.f30169a, this.d.b.f.c);
            a2.a("f-refer", "download_" + this.d.b.f.f30169a);
            a2.a("prefetch", this.d.b.f.b ? "true" : "false");
            a2.a(RequestConstant.KEY_BIZ_SCENE, this.d.b.f.o);
            a2.a(RequestConstant.KEY_PRIORITY_LEVEL, a3);
            a2.a(RequestConstant.KEY_QOS_ASYC_OPT, a.v ? "async" : "");
            this.e.f.p = this.d.b.f.o;
            this.e.f.q = a3;
            long e = this.d.e();
            if (0 != e) {
                String str = HttpConstant.RANGE_PRE + e + "-";
                kmv.b(DXMonitorConstant.DX_MONITOR_DOWNLOADER, "getConnection", "add request property range", str);
                a2.a(HttpConstant.RANGE, str);
                this.e.f.d = true;
            } else {
                this.e.f.d = false;
            }
            try {
                a2.a();
                try {
                    int b2 = a2.b();
                    if (this.d.a(a2.d(), b2)) {
                        return a2;
                    }
                    if (b2 == 416) {
                        this.d.d.delete();
                    }
                    this.e.e.a(-12, b2, a2.e()).c = true;
                    kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", conn.isHttpStatusCodeOk error " + b2, new Object[0]);
                    return null;
                } catch (Exception e2) {
                    kmv.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", conn.getstatuscode exception", e2, new Object[0]);
                    this.e.e.a(-12, 204, a2.e()).c = true;
                    return null;
                }
            } catch (IOException e3) {
                kmv.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", conn.conn exception", e3, new Object[0]);
                this.e.e.a(-12, 203, a2.e()).c = true;
                return null;
            }
        } catch (IOException e4) {
            kmv.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", conn.open exception", e4, new Object[0]);
            this.e.e.a(-12, 202, a2.e()).c = true;
            return null;
        }
    }

    private boolean a(klz klzVar, kma kmaVar, RandomAccessFile randomAccessFile) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14721fc4", new Object[]{this, klzVar, kmaVar, randomAccessFile})).booleanValue();
        }
        if (kmaVar == null || randomAccessFile == null) {
            klw.a aVar = this.e.e;
            StringBuilder sb = new StringBuilder();
            sb.append("savedataParam:");
            sb.append(kmaVar == null);
            sb.append("|");
            if (randomAccessFile != null) {
                z = false;
            }
            sb.append(z);
            aVar.a(-19, 0, sb.toString());
            return false;
        }
        this.e.c.set(this.d.d.length());
        FileChannel channel = randomAccessFile.getChannel();
        try {
            channel.position(randomAccessFile.length());
            byte[] bArr = new byte[knc.b()];
            while (true) {
                int a2 = a(this.o.get());
                if (a2 > 0) {
                    kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", saveData read task stop status=" + a2, new Object[0]);
                    this.e.e.a(-20, a2, "");
                    return false;
                }
                try {
                    int a3 = kmaVar.a(bArr);
                    if (-1 == a3) {
                        kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", input.read file finished", new Object[0]);
                        if (klzVar != null) {
                            try {
                                if (klzVar.b() != 200 && klzVar.b() != 206) {
                                    kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", connection exception code", Integer.valueOf(klzVar.b()));
                                    this.e.e.a(-12, klzVar.b(), "" + klzVar.b());
                                    return false;
                                }
                            } catch (Exception e) {
                                this.e.e.a(-12, 302, a(e)).c = true;
                                kmv.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", connection exception", e, new Object[0]);
                                return false;
                            }
                        }
                        return true;
                    }
                    this.e.d = true;
                    try {
                        int a4 = a(this.o.get());
                        if (a4 > 0) {
                            kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", saveData write task stop status=" + a4, new Object[0]);
                            this.e.e.a(-20, a4, "");
                            return false;
                        }
                        channel.write(ByteBuffer.wrap(bArr, 0, a3));
                        long j = a3;
                        this.e.c.getAndAdd(j);
                        this.e.f.r += j;
                        this.e.a(this.d.b.e.f30167a);
                    } catch (IOException e2) {
                        kmv.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", fc.write exception", e2, new Object[0]);
                        this.e.e.a(-11, 102, a(e2)).e = true;
                        return false;
                    }
                } catch (Exception e3) {
                    kmv.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", input.read exception", e3, new Object[0]);
                    this.e.e.a(-12, 201, a(e3)).d = true;
                    return false;
                }
            }
        } catch (IOException e4) {
            kmv.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", fc.position exception", e4, new Object[0]);
            this.e.e.a(-11, 101, a(e4)).e = true;
            return false;
        }
    }

    private String a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1003a7b3", new Object[]{this, th});
        }
        if ((th instanceof RuntimeException) && th.getMessage() != null && th.getMessage().length() < 20) {
            return th.getClass().getSimpleName() + ":" + th.getMessage();
        }
        return th.getClass().getSimpleName();
    }

    private int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i > 0) {
            if ((i & 1) == 1) {
                return 1;
            }
            if ((i & 2) == 2) {
                if (this.d.d.exists()) {
                    this.d.d.delete();
                }
                e();
                return 2;
            }
        }
        return 0;
    }

    private void e() {
        File[] fileArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.d.f != null && this.d.f.length > 0) {
            for (File file : this.d.f) {
                if (file.exists()) {
                    file.delete();
                }
            }
        }
    }

    private boolean a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8219760", new Object[]{this, new Long(j)})).booleanValue();
        }
        try {
            if (b == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    b = a.c.getExternalCacheDir();
                } else {
                    b = Environment.getExternalStorageDirectory();
                }
            }
            return b.getFreeSpace() >= j;
        } catch (Throwable unused) {
            return true;
        }
    }

    private boolean f() {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        try {
            if (a.o != null && (a.v || this.d.b.e.b >= a.t)) {
                if (!a.u) {
                    kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", supportBoostNetwork Orange开关" + a.u, new Object[0]);
                    return false;
                } else if (this.d.b.e.b >= a.t && this.d.e() > 0) {
                    kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", supportBoostNetwork 临时文件存在，不再分包", new Object[0]);
                    return false;
                } else {
                    this.f = knc.a();
                    if (this.f == null) {
                        kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", supportBoostNetwork  AnetCallImpl init error", new Object[0]);
                        return false;
                    }
                    if (((Integer) kmw.b(a.c, "degrade_" + this.d.b.e.f30167a, 0)).intValue() >= 2) {
                        kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", supportBoostNetwork  check md5 invalid more than 2 times degraded!!!", new Object[0]);
                        return false;
                    } else if (this.d.b.f.n) {
                        return true;
                    } else {
                        String str = a.r;
                        if (!StringUtils.isEmpty(str) && (split = str.split(",")) != null && split.length > 0) {
                            for (String str2 : split) {
                                if (StringUtils.equals(str2, this.d.b.f.f30169a)) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                }
            }
            kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", supportBoostNetwork  init error or itemSize: " + this.d.b.e.b + ", boostFileSize" + a.t + ", url " + this.d.b.e.f30167a, new Object[0]);
            return false;
        } catch (Throwable th) {
            kmv.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", supportBoostNetwork", th, new Object[0]);
            return false;
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        try {
            String a2 = a(this.d.b.f.f30169a, this.d.b.f.c);
            this.f.a(this.d.c, this.d.f30151a);
            klx klxVar = this.f;
            klxVar.a("f-refer", "download_" + this.d.b.f.f30169a);
            this.f.b("prefetch", this.d.b.f.b ? "true" : "false");
            this.f.b(RequestConstant.KEY_BIZ_SCENE, this.d.b.f.o);
            this.f.b(RequestConstant.KEY_PRIORITY_LEVEL, a2);
            this.f.b(RequestConstant.KEY_QOS_ASYC_OPT, a.v ? "async" : "");
            this.e.f.p = this.d.b.f.o;
            this.e.f.q = a2;
            String a3 = kmy.a(this.d, this.d.b.e.f30167a);
            long j = this.d.b.e.b;
            if (StringUtils.isEmpty(a3)) {
                this.e.f.d = false;
            } else {
                this.f.b(HttpConstant.RANGE, a3);
                this.e.f.d = true;
                kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", doBoostNetworkDownload", "add request property range", a3);
            }
            this.f.b(RequestConstant.KEY_FILE_LENGTH, String.valueOf(j));
            this.f.b(RequestConstant.KEY_OPEN_RANGE_BOOST, "enable");
            Context context = a.c;
            if (((Integer) kmw.b(context, "degrade_" + this.d.b.e.f30167a, 0)).intValue() == 1 || h()) {
                this.f.b("f-calculate-md5", "enable");
            }
            if (a(j, false)) {
                kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", doBoostNetworkDownload temp file valid merge part file success", new Object[0]);
                this.e.a(this.d);
                kmy.a(this.d.b.e.f30167a);
                return;
            }
            this.j.set(System.currentTimeMillis());
            kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", supportBoostNetwork 开始走分包请求 enqueue request url " + this.d.b.e.f30167a, new Object[0]);
            this.f.a(this.f30144a);
        } catch (Throwable th) {
            kmv.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", doBoostNetworkDownload", th, new Object[0]);
            this.e.e.a(-12, 303, "boost network error").c = true;
            this.e.a(this.d);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00cf A[Catch: IOException -> 0x01ff, TryCatch #0 {IOException -> 0x01ff, blocks: (B:8:0x003f, B:10:0x0090, B:15:0x009a, B:17:0x00cf, B:19:0x0106, B:20:0x012b, B:24:0x0162, B:26:0x016c, B:29:0x01dd), top: B:35:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x016c A[Catch: IOException -> 0x01ff, TryCatch #0 {IOException -> 0x01ff, blocks: (B:8:0x003f, B:10:0x0090, B:15:0x009a, B:17:0x00cf, B:19:0x0106, B:20:0x012b, B:24:0x0162, B:26:0x016c, B:29:0x01dd), top: B:35:0x003f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(long r10, boolean r12) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.klu.a(long, boolean):boolean");
    }

    private void a(kmc kmcVar, RandomAccessFile randomAccessFile) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4963f027", new Object[]{this, kmcVar, randomAccessFile});
            return;
        }
        try {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(randomAccessFile.length());
            channel.write(ByteBuffer.wrap(kmcVar.c, 0, kmcVar.f30155a));
            this.e.c.getAndAdd(kmcVar.c.length);
            this.e.f.r += kmcVar.c.length;
            this.e.a(this.d.b.e.f30167a);
        } catch (IOException e) {
            kmv.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", saveDataAndCallbackProgress  ", e, new Object[0]);
        }
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (!a(this.d.b.e.b, true)) {
            kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", doFinishTask file check invalid url = " + this.d.b.e.f30167a + " size =" + this.d.b.e.b + ", md5 = " + this.e.f.n, new Object[0]);
            this.d.d.delete();
            if (!this.d.a(0L, i)) {
                klw.a aVar = this.e.e;
                aVar.a(-12, i, "" + i);
                return;
            }
            kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", doFinishTask file check invalid 删除分片文件 url = " + this.d.b.e.f30167a, new Object[0]);
            e();
            this.e.e.a(this.d.g(), 106, "download invalid");
        } else {
            kmy.a(this.d.b.e.f30167a);
        }
    }

    private void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        this.e.f.l = true;
        long currentTimeMillis = System.currentTimeMillis();
        Pair<Boolean, String> d = this.d.d();
        if (((Boolean) d.first).booleanValue()) {
            this.e.f.k = System.currentTimeMillis() - currentTimeMillis;
            if (kmx.a(this.d.d, this.d.e)) {
                this.e.f30152a = 10;
                kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", handleBoostDegraded  checkTmpCacheValidity move file success", new Object[0]);
                return;
            }
            this.e.e.a(-11, this.d.e.getParentFile().canWrite() ? 104 : 105, "rename tmp file error").e = true;
            kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", handleBoostDegraded  checkTmpCacheValidity move file error", new Object[0]);
            return;
        }
        kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", handleBoostDegraded file check invalid url = " + this.d.b.e.f30167a + " size =" + this.d.b.e.b, new Object[0]);
        if (!this.d.a(0L, i)) {
            klw.a aVar = this.e.e;
            aVar.a(-12, i, "" + i);
            return;
        }
        kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", handleBoostDegraded  降级删除临时文件", new Object[0]);
        this.d.d.delete();
        this.e.e.a(this.d.g(), 106, "download invalid");
        knb.a aVar2 = this.e.f;
        aVar2.n = this.d.b.e.c + "," + ((String) d.second);
        kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, ResponseProtocolType.ID + this.q + ", handleBoostDegraded  checkTmpCacheValidity url = " + this.d.b.e.f30167a + " size =" + this.d.b.e.b + ", md5 = " + this.e.f.n, new Object[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3 A[Catch: Throwable -> 0x0238, TryCatch #0 {Throwable -> 0x0238, blocks: (B:12:0x0032, B:14:0x0038, B:19:0x004d, B:21:0x0053, B:24:0x005c, B:26:0x00a3, B:28:0x00b3, B:30:0x00f2, B:32:0x00f8, B:41:0x0161, B:42:0x0191, B:44:0x01c5, B:49:0x01f3, B:51:0x01f7, B:53:0x01fc, B:46:0x01cc, B:48:0x01d5, B:33:0x00fa, B:35:0x0125, B:37:0x012b, B:39:0x012e, B:55:0x0201, B:17:0x0045), top: B:60:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0125 A[Catch: Throwable -> 0x0238, TryCatch #0 {Throwable -> 0x0238, blocks: (B:12:0x0032, B:14:0x0038, B:19:0x004d, B:21:0x0053, B:24:0x005c, B:26:0x00a3, B:28:0x00b3, B:30:0x00f2, B:32:0x00f8, B:41:0x0161, B:42:0x0191, B:44:0x01c5, B:49:0x01f3, B:51:0x01f7, B:53:0x01fc, B:46:0x01cc, B:48:0x01d5, B:33:0x00fa, B:35:0x0125, B:37:0x012b, B:39:0x012e, B:55:0x0201, B:17:0x0045), top: B:60:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0161 A[Catch: Throwable -> 0x0238, TryCatch #0 {Throwable -> 0x0238, blocks: (B:12:0x0032, B:14:0x0038, B:19:0x004d, B:21:0x0053, B:24:0x005c, B:26:0x00a3, B:28:0x00b3, B:30:0x00f2, B:32:0x00f8, B:41:0x0161, B:42:0x0191, B:44:0x01c5, B:49:0x01f3, B:51:0x01f7, B:53:0x01fc, B:46:0x01cc, B:48:0x01d5, B:33:0x00fa, B:35:0x0125, B:37:0x012b, B:39:0x012e, B:55:0x0201, B:17:0x0045), top: B:60:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0191 A[Catch: Throwable -> 0x0238, TryCatch #0 {Throwable -> 0x0238, blocks: (B:12:0x0032, B:14:0x0038, B:19:0x004d, B:21:0x0053, B:24:0x005c, B:26:0x00a3, B:28:0x00b3, B:30:0x00f2, B:32:0x00f8, B:41:0x0161, B:42:0x0191, B:44:0x01c5, B:49:0x01f3, B:51:0x01f7, B:53:0x01fc, B:46:0x01cc, B:48:0x01d5, B:33:0x00fa, B:35:0x0125, B:37:0x012b, B:39:0x012e, B:55:0x0201, B:17:0x0045), top: B:60:0x0032 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.klu.a(java.util.Map):void");
    }

    private boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : (a.c.getApplicationInfo().flags & 2) != 0;
    }

    private String a(String str, int i) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75f5ebaf", new Object[]{this, str, new Integer(i)});
        }
        if (StringUtils.isEmpty(str)) {
            return "mid";
        }
        if (i == 41) {
            return "high";
        }
        String str2 = a.s;
        if (StringUtils.isEmpty(str2) || (split = str2.split(",")) == null || split.length <= 0) {
            return "mid";
        }
        for (String str3 : split) {
            if (StringUtils.equals(str3, str)) {
                return "low";
            }
        }
        return "mid";
    }
}
