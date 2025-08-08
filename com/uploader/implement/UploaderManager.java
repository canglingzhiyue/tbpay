package com.uploader.implement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.export.f;
import com.uploader.export.g;
import com.uploader.export.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import tb.rnx;
import tb.roa;
import tb.roc;
import tb.rof;
import tb.ror;
import tb.rot;
import tb.rov;
import tb.rox;
import tb.roy;
import tb.roz;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* loaded from: classes9.dex */
public class UploaderManager implements g, rnx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static AtomicInteger t = new AtomicInteger(0);

    /* renamed from: a  reason: collision with root package name */
    private int f24062a;
    private ArrayList<roc> b;
    private ArrayList<roc> c;
    private ArrayList<Pair<Integer, String>> d;
    private SparseArray<ArrayList<Pair<roc, rox>>> e;
    private ArrayList<Pair<roc, rox>> f;
    private rof g;
    private BroadcastReceiver h;
    private volatile Handler i;
    private volatile boolean j;
    private Runnable k;
    private boolean l;
    private String m;
    private final int n;
    private d o;
    private final byte[] p;
    private final int q;
    private rot r;
    private ror s;

    /* loaded from: classes9.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final UploaderManager f24063a;
        public final int b;
        public final Object[] c;

        public a(int i, UploaderManager uploaderManager, Object... objArr) {
            this.b = i;
            this.f24063a = uploaderManager;
            this.c = objArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            switch (this.b) {
                case 1:
                    UploaderManager uploaderManager = this.f24063a;
                    Object[] objArr = this.c;
                    uploaderManager.a((i) objArr[0], (com.uploader.export.d) objArr[1], (Handler) objArr[2], ((Boolean) objArr[3]).booleanValue());
                    return;
                case 2:
                    UploaderManager uploaderManager2 = this.f24063a;
                    Object[] objArr2 = this.c;
                    uploaderManager2.a((i) objArr2[0], ((Integer) objArr2[1]).intValue());
                    return;
                case 3:
                    this.f24063a.a();
                    return;
                case 4:
                    this.f24063a.b((roa) this.c[0]);
                    return;
                case 5:
                    UploaderManager.a(this.f24063a);
                    return;
                case 6:
                    UploaderManager uploaderManager3 = this.f24063a;
                    Object[] objArr3 = this.c;
                    uploaderManager3.a((String) objArr3[0], (com.uploader.export.c) objArr3[1], (Handler) objArr3[2]);
                    return;
                case 7:
                    UploaderManager.a(this.f24063a, (i) this.c[0]);
                    return;
                case 8:
                    UploaderManager.b(this.f24063a, (i) this.c[0]);
                    return;
                default:
                    return;
            }
        }
    }

    /* loaded from: classes9.dex */
    public static class b extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<UploaderManager> f24064a;

        public b(UploaderManager uploaderManager) {
            this.f24064a = new WeakReference<>(uploaderManager);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            if (context != null && intent != null) {
                try {
                    intent.getBooleanExtra("noConnectivity", false);
                    intent.getStringExtra("extraInfo");
                    UploaderManager uploaderManager = this.f24064a.get();
                    if (uploaderManager == null) {
                        return;
                    }
                    UploaderManager.b(uploaderManager);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static /* synthetic */ void a(UploaderManager uploaderManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c66214d7", new Object[]{uploaderManager});
        } else {
            uploaderManager.d();
        }
    }

    public static /* synthetic */ void a(UploaderManager uploaderManager, i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eabfe69", new Object[]{uploaderManager, iVar});
        } else {
            uploaderManager.a(iVar);
        }
    }

    public static /* synthetic */ void b(UploaderManager uploaderManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6102d758", new Object[]{uploaderManager});
        } else {
            uploaderManager.e();
        }
    }

    public static /* synthetic */ void b(UploaderManager uploaderManager, i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb19fac8", new Object[]{uploaderManager, iVar});
        } else {
            uploaderManager.b(iVar);
        }
    }

    public UploaderManager() {
        this(0);
    }

    public UploaderManager(int i) {
        this.f24062a = 0;
        this.j = false;
        this.p = new byte[0];
        this.e = new SparseArray<>(2);
        this.f = new ArrayList<>();
        this.d = new ArrayList<>();
        this.b = new ArrayList<>();
        this.c = new ArrayList<>();
        this.n = hashCode();
        this.q = i;
    }

    @Override // com.uploader.export.g
    public boolean isInitialized() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("18d112d5", new Object[]{this})).booleanValue() : this.j;
    }

    @Override // com.uploader.export.g
    public boolean initialize(Context context, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("396ec956", new Object[]{this, context, fVar})).booleanValue();
        }
        if (context == null) {
            if (com.uploader.implement.a.a(16)) {
                com.uploader.implement.a.a(16, "UploaderManager", this.n + " initialize fail, context null");
            }
            return false;
        } else if (this.j) {
            if (com.uploader.implement.a.a(4)) {
                com.uploader.implement.a.a(4, "UploaderManager", this.n + " initialize, is initialized !");
            }
            return false;
        } else {
            synchronized (this.p) {
                if (this.j) {
                    if (com.uploader.implement.a.a(4)) {
                        com.uploader.implement.a.a(4, "UploaderManager", this.n + " initialize, is initialized !");
                    }
                    return false;
                } else if (this.q != fVar.c().getInstanceType()) {
                    if (com.uploader.implement.a.a(16)) {
                        com.uploader.implement.a.a(16, "UploaderManager", this.n + " initialize, FAILED! environment not equals instance in instanceType");
                    }
                    return false;
                } else {
                    this.o = new d(context, fVar);
                    try {
                        this.r = rot.a();
                        this.r.a(context, this.o);
                        this.r.c();
                        this.s = ror.a();
                        this.s.a(context, this.o);
                    } catch (Exception e) {
                        if (com.uploader.implement.a.a(16)) {
                            com.uploader.implement.a.a(16, "UploaderManager", this.n + " initialize taskDbManager, FAILED!", e);
                        }
                    }
                    this.j = true;
                    if (com.uploader.implement.a.a(4)) {
                        com.uploader.implement.a.a(4, "UploaderManager", this.n + " initialize !!!");
                    }
                    return true;
                }
            }
        }
    }

    @Override // com.uploader.export.g
    public boolean uploadAsync(i iVar, com.uploader.export.d dVar, Handler handler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c453045b", new Object[]{this, iVar, dVar, handler})).booleanValue() : uploadAsync(iVar, dVar, handler, false);
    }

    @Override // com.uploader.export.g
    public boolean uploadAsync(i iVar, com.uploader.export.d dVar, Handler handler, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c60e3961", new Object[]{this, iVar, dVar, handler, new Boolean(z)})).booleanValue();
        }
        if (iVar == null) {
            if (com.uploader.implement.a.a(8)) {
                com.uploader.implement.a.a(8, "UploaderManager", this.n + " uploadAsync fail,task null");
            }
            return false;
        }
        synchronized (this.p) {
            if (!this.j) {
                return false;
            }
            return c().post(new a(1, this, iVar, dVar, handler, Boolean.valueOf(z)));
        }
    }

    private Handler c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("a819f71c", new Object[]{this});
        }
        Handler handler = this.i;
        if (handler != null) {
            return handler;
        }
        if (com.uploader.implement.a.a(2)) {
            com.uploader.implement.a.a(2, "UploaderManager", this.n + " doRetrieve and register");
        }
        HandlerThread handlerThread = new HandlerThread("[aus]");
        handlerThread.start();
        Handler handler2 = new Handler(handlerThread.getLooper());
        this.i = handler2;
        return handler2;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Handler handler = this.i;
        if (handler == null) {
            return;
        }
        Context applicationContext = this.o.c.getApplicationContext();
        BroadcastReceiver broadcastReceiver = this.h;
        if (broadcastReceiver != null) {
            try {
                try {
                    applicationContext.unregisterReceiver(broadcastReceiver);
                } catch (Exception e) {
                    if (com.uploader.implement.a.a(16)) {
                        com.uploader.implement.a.a(16, "UploaderManager", "doClean unregisterReceiver", e);
                    }
                }
            } finally {
                this.h = null;
            }
        }
        handler.removeCallbacksAndMessages(null);
        handler.getLooper().quit();
        this.k = null;
        this.i = null;
        this.e = new SparseArray<>(2);
        this.f.trimToSize();
        this.d.trimToSize();
        this.b.trimToSize();
        rof rofVar = this.g;
        if (rofVar != null) {
            rofVar.a();
            this.g = null;
        }
        if (!com.uploader.implement.a.a(2)) {
            return;
        }
        com.uploader.implement.a.a(2, "UploaderManager", this.n + " doClean and release");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.uploader.export.i r17, com.uploader.export.d r18, android.os.Handler r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uploader.implement.UploaderManager.a(com.uploader.export.i, com.uploader.export.d, android.os.Handler, boolean):void");
    }

    private void a(roc rocVar, ArrayList<Pair<roc, rox>> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("296f2998", new Object[]{this, rocVar, arrayList});
            return;
        }
        int g = rocVar.g();
        if (this.g == null) {
            this.g = new rof(this.o, this.i.getLooper());
        }
        roy royVar = new roy(this.o, this.g, this.i.getLooper());
        if (arrayList == null) {
            arrayList = new ArrayList<>(2);
            this.e.append(g, arrayList);
        }
        Pair<roc, rox> create = Pair.create(rocVar, royVar);
        arrayList.add(create);
        this.f.add(create);
        t.incrementAndGet();
        rocVar.a(this);
        rocVar.b(royVar);
        if (!com.uploader.implement.a.a(4)) {
            return;
        }
        com.uploader.implement.a.a(4, "UploaderManager", this.n + " startAction task:" + rocVar.f().hashCode());
    }

    @Override // com.uploader.export.g
    public boolean cancelAsync(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c849035b", new Object[]{this, iVar})).booleanValue() : cancelAsync(iVar, 0);
    }

    @Override // com.uploader.export.g
    public boolean cancelAsync(i iVar, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40d7da90", new Object[]{this, iVar, new Integer(i)})).booleanValue();
        }
        if (iVar == null) {
            if (com.uploader.implement.a.a(8)) {
                com.uploader.implement.a.a(8, "UploaderManager", this.n + " cancelAsync fail,task null");
            }
            return false;
        } else if (!this.j) {
            return false;
        } else {
            synchronized (this.p) {
                if (!this.j) {
                    return false;
                }
                Handler handler = this.i;
                if (handler == null || !handler.post(new a(2, this, iVar, Integer.valueOf(i)))) {
                    z = false;
                }
                return z;
            }
        }
    }

    private int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        if (str == null) {
            str = "";
        }
        int size = this.d.size() - 1;
        while (true) {
            if (size < 0) {
                size = -1;
                break;
            } else if (((String) this.d.get(size).second).equals(str)) {
                break;
            } else {
                size--;
            }
        }
        if (size < 0) {
            ArrayList<Pair<Integer, String>> arrayList = this.d;
            int i = this.f24062a + 1;
            this.f24062a = i;
            arrayList.add(new Pair<>(Integer.valueOf(i), str));
            size = this.d.size() - 1;
        }
        return ((Integer) this.d.get(size).first).intValue();
    }

    public void a(i iVar, int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4165364b", new Object[]{this, iVar, new Integer(i)});
            return;
        }
        int a2 = a(iVar.getBizType());
        rov rovVar = i != 0 ? new rov("200", String.valueOf(i), null, false) : null;
        int size = this.b.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            } else if (this.b.get(size).f().equals(iVar)) {
                this.b.remove(size).b((rox) null, rovVar);
                z = true;
                break;
            } else {
                size--;
            }
        }
        if (z) {
            if (!com.uploader.implement.a.a(4)) {
                return;
            }
            com.uploader.implement.a.a(4, "UploaderManager", this.n + " doCancel cancel waiting task:" + iVar);
            return;
        }
        int size2 = this.c.size() - 1;
        while (true) {
            if (size2 < 0) {
                break;
            } else if (this.c.get(size2).f().equals(iVar)) {
                this.c.remove(size2).b((rox) null, rovVar);
                break;
            } else {
                size2--;
            }
        }
        if (z) {
            if (!com.uploader.implement.a.a(4)) {
                return;
            }
            com.uploader.implement.a.a(4, "UploaderManager", this.n + " doCancel cancel pausing task:" + iVar);
            return;
        }
        ArrayList<Pair<roc, rox>> arrayList = this.e.get(a2);
        if (arrayList == null) {
            return;
        }
        for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
            if (((roc) arrayList.get(size3).first).f().equals(iVar)) {
                Pair<roc, rox> pair = arrayList.get(size3);
                ((roc) pair.first).b((rox) pair.second, rovVar);
                if (!com.uploader.implement.a.a(4)) {
                    return;
                }
                com.uploader.implement.a.a(4, "UploaderManager", this.n + " doCancel cancel concurrent task:" + iVar);
                return;
            }
        }
    }

    @Override // tb.rnx
    public void a(roa roaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd66ae94", new Object[]{this, roaVar});
            return;
        }
        synchronized (this.p) {
            Handler handler = this.i;
            if (handler == null) {
                return;
            }
            handler.post(new a(4, this, roaVar));
        }
    }

    public void b(roa roaVar) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebe9b515", new Object[]{this, roaVar});
            return;
        }
        roc rocVar = (roc) roaVar;
        int g = rocVar.g();
        ArrayList<Pair<roc, rox>> arrayList = this.e.get(g);
        if (arrayList == null) {
            if (!com.uploader.implement.a.a(8)) {
                return;
            }
            com.uploader.implement.a.a(8, "UploaderManager", this.n + " doFinish no concurrent");
            return;
        }
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                z = false;
                break;
            } else if (((roc) arrayList.get(size).first).equals(rocVar)) {
                z = this.f.remove(arrayList.remove(size));
                break;
            } else {
                size--;
            }
        }
        if (!z) {
            if (!com.uploader.implement.a.a(8)) {
                return;
            }
            com.uploader.implement.a.a(8, "UploaderManager", this.n + " doFinish !removed");
            return;
        }
        t.decrementAndGet();
        if (arrayList.size() == 0) {
            this.e.remove(g);
            if (com.uploader.implement.a.a(4)) {
                com.uploader.implement.a.a(4, "UploaderManager", this.n + " onFinish remove concurrent task:" + rocVar.f().hashCode());
            }
        }
        if (!roz.a(this.o.c.getApplicationContext())) {
            if (!com.uploader.implement.a.a(8)) {
                return;
            }
            com.uploader.implement.a.a(8, "UploaderManager", this.n + " doFinish no network");
            return;
        }
        f();
        if (this.e.size() != 0 || this.b.size() != 0) {
            if (!com.uploader.implement.a.a(8)) {
                return;
            }
            com.uploader.implement.a.a(8, "UploaderManager", this.n + " doFinish has more data");
            return;
        }
        synchronized (this.p) {
            Handler handler = this.i;
            if (com.uploader.implement.a.a(8)) {
                com.uploader.implement.a.a(8, "UploaderManager", this.n + " start count down:" + TaobaoMediaPlayer.FFP_PROP_FLOAT_AUDIO_GAIN_VALUE);
            }
            if (handler == null) {
                return;
            }
            this.k = new a(3, this, new Object[0]);
            handler.postDelayed(this.k, 90000L);
        }
    }

    private void d() {
        String str;
        boolean z;
        boolean equals;
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        NetworkInfo b2 = roz.b(this.o.c.getApplicationContext());
        if (b2 != null) {
            z = b2.isConnected();
            str = b2.getExtraInfo();
        } else {
            str = null;
            z = false;
        }
        boolean z3 = this.l;
        String str2 = this.m;
        if (z3 == z) {
            if (str2 != null) {
                equals = str2.equals(str);
            } else if (str != null) {
                equals = str.equals(str2);
            } else {
                z2 = false;
            }
            z2 = true ^ equals;
        }
        if (com.uploader.implement.a.a(8)) {
            com.uploader.implement.a.a(8, "UploaderManager", this.n + " doNetworkChanged, extraInfo(new|old):" + str + "|" + str2 + " isConnected(new|old):" + z + "|" + z3 + " changed:" + z2);
        }
        if (!z2) {
            return;
        }
        this.l = z;
        this.m = str;
        if (!z) {
            rof rofVar = this.g;
            if (rofVar == null) {
                return;
            }
            rofVar.a();
            return;
        }
        int size = this.f.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Pair<roc, rox> pair = this.f.get(i2);
            ((roc) pair.first).b((rox) pair.second);
            i++;
        }
        int f = f();
        if (com.uploader.implement.a.a(2)) {
            com.uploader.implement.a.a(2, "UploaderManager", this.n + " restartedCount:" + i + " suppliedCount:" + f);
        }
        this.s.b();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        synchronized (this.p) {
            Handler handler = this.i;
            if (handler == null) {
                return;
            }
            handler.post(new a(5, this, new Object[0]));
        }
    }

    private int f() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue();
        }
        for (int size = this.b.size() - 1; size >= 0; size--) {
            roc rocVar = this.b.get(size);
            ArrayList<Pair<roc, rox>> arrayList = this.e.get(rocVar.g());
            if (arrayList == null) {
                if (this.e.size() < 2) {
                    this.b.remove(size);
                    a(rocVar, arrayList);
                    i++;
                }
            } else if (arrayList.size() < 2) {
                this.b.remove(size);
                a(rocVar, arrayList);
                i++;
            }
        }
        if (com.uploader.implement.a.a(2)) {
            com.uploader.implement.a.a(2, "UploaderManager", this.n + " suppliedCount:" + i);
        }
        return i;
    }

    @Override // com.uploader.export.g
    public boolean getUnfinishedTasksAsync(String str, com.uploader.export.c cVar, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd21095a", new Object[]{this, str, cVar, handler})).booleanValue();
        }
        if (str == null || cVar == null) {
            if (com.uploader.implement.a.a(8)) {
                com.uploader.implement.a.a(8, "UploaderManager", this.n + " getUnfinishedTasksAsync fail, bizType or listener null");
            }
            return false;
        } else if (!this.j) {
            return false;
        } else {
            synchronized (this.p) {
                if (!this.j) {
                    return false;
                }
                return c().post(new a(6, this, str, cVar, handler));
            }
        }
    }

    public void a(String str, com.uploader.export.c cVar, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f1fa3a4", new Object[]{this, str, cVar, handler});
            return;
        }
        if (com.uploader.implement.a.a(4)) {
            com.uploader.implement.a.a(4, "UploaderManager", this.n + " query unfinished tasks. bizType:" + str);
        }
        this.r.a(str, cVar, handler, true);
    }

    @Override // com.uploader.export.g
    public boolean pauseAsync(i iVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("870a0ad7", new Object[]{this, iVar})).booleanValue();
        }
        if (iVar == null) {
            if (com.uploader.implement.a.a(8)) {
                com.uploader.implement.a.a(8, "UploaderManager", this.n + " pauseAsync fail,task null");
            }
            return false;
        } else if (!this.j) {
            return false;
        } else {
            synchronized (this.p) {
                if (!this.j) {
                    return false;
                }
                Handler handler = this.i;
                if (handler == null || !handler.post(new a(7, this, iVar))) {
                    z = false;
                }
                return z;
            }
        }
    }

    @Override // com.uploader.export.g
    public boolean continueAsync(i iVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb740d88", new Object[]{this, iVar})).booleanValue();
        }
        if (iVar == null) {
            if (com.uploader.implement.a.a(8)) {
                com.uploader.implement.a.a(8, "UploaderManager", this.n + " continueAsync fail,task null");
            }
            return false;
        } else if (!this.j) {
            return false;
        } else {
            synchronized (this.p) {
                if (!this.j) {
                    return false;
                }
                Handler handler = this.i;
                if (handler == null || !handler.post(new a(8, this, iVar))) {
                    z = false;
                }
                return z;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8d1b3b8", new Object[]{this, iVar});
            return;
        }
        int a2 = a(iVar.getBizType());
        int size = this.b.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            } else if (this.b.get(size).f().equals(iVar)) {
                this.c.add(0, this.b.get(size));
                this.b.remove(size).c((rox) null);
                break;
            } else {
                size--;
            }
        }
        ArrayList<Pair<roc, rox>> arrayList = this.e.get(a2);
        if (arrayList == null) {
            return;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            if (((roc) arrayList.get(size2).first).f().equals(iVar)) {
                Pair<roc, rox> pair = arrayList.get(size2);
                if (((roc) pair.first).c() == 4 || ((roc) pair.first).c() == 5) {
                    return;
                }
                ((roc) pair.first).c((rox) pair.second);
                this.c.add(0, pair.first);
                this.f.remove(arrayList.remove(size2));
                t.decrementAndGet();
                if (arrayList.size() == 0) {
                    this.e.remove(a2);
                }
                f();
                return;
            }
        }
    }

    private void b(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9a2bb17", new Object[]{this, iVar});
            return;
        }
        roc rocVar = null;
        int size = this.c.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            } else if (this.c.get(size).f().equals(iVar)) {
                rocVar = this.c.remove(size);
                break;
            } else {
                size--;
            }
        }
        if (rocVar == null || rocVar.c() == 1 || rocVar.c() == 2) {
            return;
        }
        ArrayList<roc> arrayList = this.b;
        arrayList.add(arrayList.size(), rocVar);
        rocVar.d();
        f();
    }

    private boolean c(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba73c27a", new Object[]{this, iVar})).booleanValue();
        }
        if (!(iVar instanceof com.uploader.export.a)) {
            return false;
        }
        String str = ((com.uploader.export.a) iVar).f24056a.g;
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        for (int i = 0; i < this.f.size(); i++) {
            if (str.equalsIgnoreCase(((roc) this.f.get(i).first).h())) {
                if (com.uploader.implement.a.a(4)) {
                    com.uploader.implement.a.a(4, "UploaderManager", this.n + " breakpoint task fileId not valid, fileId=" + str);
                }
                return false;
            }
        }
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            if (str.equalsIgnoreCase(this.b.get(i2).h())) {
                if (com.uploader.implement.a.a(4)) {
                    com.uploader.implement.a.a(4, "UploaderManager", this.n + " breakpoint task fileId not valid, fileId=" + str);
                }
                return false;
            }
        }
        for (int i3 = 0; i3 < this.c.size(); i3++) {
            if (str.equalsIgnoreCase(this.c.get(i3).h())) {
                if (com.uploader.implement.a.a(4)) {
                    com.uploader.implement.a.a(4, "UploaderManager", this.n + " breakpoint task fileId not valid, fileId=" + str);
                }
                return false;
            }
        }
        return true;
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue() : t.get();
    }
}
