package com.taobao.android.tbuprofen.adapter.anr;

import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.os.health.HealthStats;
import android.os.health.SystemHealthManager;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.util.StackDumpUtils;
import com.taobao.android.tcrash.AnrUncaughtListener;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashType;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.jbg;
import tb.kge;
import tb.orq;
import tb.riy;
import tb.rlp;

/* loaded from: classes6.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f15469a;
    private static List<h> h;
    private final Context b;
    private final TBAnrConfig c;
    private a f;
    private final HandlerThread e = jbg.b("tbp-anr-info-thread");
    private final Queue<k> g = new ConcurrentLinkedQueue();
    private long k = 0;
    private long l = 0;
    private final List<String> m = new ArrayList();

    static {
        kge.a(1079004587);
    }

    public static /* synthetic */ String a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a8ce376d", new Object[]{gVar}) : gVar.d();
    }

    public static /* synthetic */ String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        f15469a = str;
        return str;
    }

    public static /* synthetic */ TBAnrConfig b(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBAnrConfig) ipChange.ipc$dispatch("238fa71b", new Object[]{gVar}) : gVar.c;
    }

    public static /* synthetic */ a c(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("824c8c6f", new Object[]{gVar}) : gVar.f;
    }

    public static /* synthetic */ void d(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18be0396", new Object[]{gVar});
        } else {
            gVar.c();
        }
    }

    public static /* synthetic */ void e(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18479d97", new Object[]{gVar});
        } else {
            gVar.b();
        }
    }

    public static /* synthetic */ String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[0]) : f15469a;
    }

    public static /* synthetic */ void f(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17d13798", new Object[]{gVar});
        } else {
            gVar.e();
        }
    }

    public static /* synthetic */ String g(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("25eb6827", new Object[]{gVar}) : gVar.g();
    }

    public g(Context context, com.taobao.android.tbuprofen.adapter.a aVar) {
        this.b = context;
        this.c = aVar.i;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.e.start();
        this.f = new a(this.e.getLooper(), this);
        this.f.a();
        TCrashSDK.instance().getCrashCaughtHeaderByType(UncaughtCrashType.ANR_ONLY).addHeaderInfo("TBP_RUNNING_INFO_ENABLE", com.taobao.android.tbuprofen.common.a.a(System.currentTimeMillis()));
        TCrashSDK.instance().addAnrUncaughtListener(new AnrUncaughtListener() { // from class: com.taobao.android.tbuprofen.adapter.anr.g.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.tcrash.AnrUncaughtListener
            public Map<String, Object> onAnrUncaught() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Map) ipChange2.ipc$dispatch("5dc54bb7", new Object[]{this});
                }
                HashMap hashMap = new HashMap();
                try {
                    hashMap.put("TBP_RUNNING_INFO", g.a(g.this));
                    if (g.b(g.this).dumpAnrTrace) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        CountDownLatch countDownLatch = new CountDownLatch(1);
                        Message obtain = Message.obtain();
                        obtain.what = 4;
                        obtain.obj = countDownLatch;
                        g.c(g.this).sendMessage(obtain);
                        try {
                            boolean await = countDownLatch.await(2000L, TimeUnit.MILLISECONDS);
                            if (await && g.f() != null) {
                                hashMap.put("TBP_MAIN_THREAD_TRACE", "\n--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\nTBP anr main trace:\n" + g.f() + "\n");
                            }
                            j.a(await, SystemClock.uptimeMillis() - uptimeMillis);
                            g.a((String) null);
                        } catch (InterruptedException e) {
                            j.a(false, SystemClock.uptimeMillis() - uptimeMillis);
                            com.taobao.android.tbuprofen.log.c.a("TBANRInfoCollector", "dump main thread trace error", e);
                        }
                    }
                    j.a(true);
                    return hashMap;
                } catch (Throwable th) {
                    j.a(false);
                    Log.e("TBANRInfoCollector", "dump anr info error", th);
                    return null;
                }
            }
        });
    }

    private String g() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
        }
        long myTid = Process.myTid();
        StackDumpUtils.a(myTid, new StackDumpUtils.a() { // from class: com.taobao.android.tbuprofen.adapter.anr.g.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.tbuprofen.util.StackDumpUtils.a
            public void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                } else {
                    com.taobao.android.tbuprofen.log.c.a("TBANRInfoCollector", "dump main thread trace error", new Object[0]);
                }
            }
        });
        Thread thread = Looper.getMainLooper().getThread();
        if (this.c.ddmDumpSdkVersion == Build.VERSION.SDK_INT) {
            z = true;
        }
        Object[] dumpRawStackTraceSafely = StackDumpUtils.dumpRawStackTraceSafely(thread, z);
        StackDumpUtils.b(myTid);
        if (dumpRawStackTraceSafely != null) {
            return StackDumpUtils.a(StackDumpUtils.a(Looper.getMainLooper().getThread().getName(), dumpRawStackTraceSafely));
        }
        return null;
    }

    private String d() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\n--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---");
        sb.append("\n");
        sb.append("TBP ANR Running Info Start");
        sb.append("\n");
        sb.append("\n[Recent runtime info]");
        sb.append("\n");
        sb.append("[time][cupKernelTime][cpuUserTime][usedHeap][nativeHeap][gcCount][gcTime][blockGcCount][blockGcTime][totalAllocate][gcFreed]");
        sb.append("\n");
        for (k kVar : this.g) {
            sb.append(kVar.toString());
            sb.append("\n");
        }
        sb.append("\n[App Freeze info]\n");
        for (String str : this.m) {
            sb.append(str);
            sb.append("\n");
        }
        sb.append("\n[Extra info]\n");
        List<h> list = h;
        if (list != null && !list.isEmpty()) {
            for (h hVar : h) {
                if (hVar != null) {
                    sb.append("info[");
                    i++;
                    sb.append(i);
                    sb.append("]: ");
                    for (Map.Entry<String, Object> entry : hVar.a().entrySet()) {
                        sb.append(riy.ARRAY_START_STR);
                        sb.append(entry.getKey());
                        sb.append("]: ");
                        sb.append(entry.getValue());
                        sb.append("\n");
                    }
                }
            }
        }
        sb.append("TBP ANR Running Info End");
        sb.append("\n");
        return sb.toString();
    }

    private void b() {
        File[] listFiles;
        int length;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        File externalFilesDir = this.b.getExternalFilesDir("anrinfo");
        if (externalFilesDir == null || !externalFilesDir.exists() || (listFiles = externalFilesDir.listFiles()) == null || (length = listFiles.length) < this.c.maxAnrFileNum) {
            return;
        }
        Arrays.sort(listFiles, $$Lambda$g$DVddG7Wom4kJn0eJ3NgEDCvtKGM.INSTANCE);
        for (int i = 0; i < length - (this.c.maxAnrFileNum / 2); i++) {
            listFiles[i].delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(File file, File file2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a3abf709", new Object[]{file, file2})).intValue() : file.lastModified() < file2.lastModified() ? -1 : 1;
    }

    /* loaded from: classes6.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final g f15472a;

        static {
            kge.a(1568316313);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public a(Looper looper, g gVar) {
            super(looper);
            this.f15472a = gVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            int i = message.what;
            if (i == 1) {
                g.d(this.f15472a);
                b();
            } else if (i == 2) {
                g.e(this.f15472a);
            } else if (i == 3) {
                g.f(this.f15472a);
                c();
            } else if (i != 4) {
            } else {
                g.a(g.g(this.f15472a));
                if (message.obj == null) {
                    return;
                }
                ((CountDownLatch) message.obj).countDown();
            }
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            b();
            c();
            sendEmptyMessageDelayed(2, orq.FRAME_CHECK_TIMEOUT);
            com.taobao.android.tbuprofen.log.c.a("TBANRInfoCollector", "start collect running info.", new Object[0]);
        }

        private void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                sendEmptyMessageDelayed(1, g.b(this.f15472a).getRunningInfoInterval);
            }
        }

        private void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else {
                sendEmptyMessageDelayed(3, g.b(this.f15472a).checkTaskInterval);
            }
        }
    }

    private void c() {
        HealthStats healthStats;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        k kVar = new k();
        if (Build.VERSION.SDK_INT >= 24) {
            HealthStats takeMyUidSnapshot = ((SystemHealthManager) this.b.getSystemService("systemhealth")).takeMyUidSnapshot();
            if (takeMyUidSnapshot.hasStats(rlp.T_BORDER_WIDTH) && (healthStats = takeMyUidSnapshot.getStats(rlp.T_BORDER_WIDTH).get(this.b.getPackageName())) != null) {
                kVar.c = healthStats.getMeasurement(30001);
                kVar.b = healthStats.getMeasurement(30002);
            }
        }
        kVar.d = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        kVar.k = Debug.getNativeHeapSize();
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                Map<String, String> runtimeStats = Debug.getRuntimeStats();
                kVar.e = runtimeStats.get("art.gc.gc-count");
                kVar.f = runtimeStats.get("art.gc.gc-time");
                kVar.g = runtimeStats.get("art.gc.blocking-gc-count");
                kVar.h = runtimeStats.get("art.gc.blocking-gc-time");
                kVar.i = runtimeStats.get("art.gc.bytes-allocated");
                kVar.j = runtimeStats.get("art.gc.bytes-freed");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.g.add(kVar);
        if (this.g.size() <= this.c.monitorTimeScope / this.c.getRunningInfoInterval) {
            return;
        }
        this.g.poll();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.k > 0 && elapsedRealtime - this.l > this.c.checkTaskInterval * 2) {
            String format = String.format("Freeze between %s - %s", com.taobao.android.tbuprofen.common.a.a(this.k), com.taobao.android.tbuprofen.common.a.a(currentTimeMillis));
            this.m.add(format);
            com.taobao.android.tbuprofen.log.c.a("TBANRInfoCollector", format, new Object[0]);
        }
        this.k = currentTimeMillis;
        this.l = elapsedRealtime;
    }

    public static void a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a21a9f2", new Object[]{hVar});
            return;
        }
        if (h == null) {
            h = new ArrayList();
        }
        if (hVar == null || h.contains(hVar)) {
            return;
        }
        h.add(hVar);
    }
}
