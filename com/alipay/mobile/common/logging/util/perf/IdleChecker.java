package com.alipay.mobile.common.logging.util.perf;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class IdleChecker implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static IdleChecker f5475a;
    private Context b;
    private Handler c;
    private boolean d;
    private boolean e;
    private long f;
    private int g = 0;
    private final List<CPUInfo> h = new ArrayList();

    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: classes3.dex */
    public static class CPUInfo {
        public long appCpuTime;
        public long elapsedRealTime;
        public long idle;
        public long ioWait;
        public long nice;
        public long system;
        public long total;
        public long user;

        private CPUInfo() {
            this.user = -1L;
            this.nice = -1L;
            this.system = -1L;
            this.idle = -1L;
            this.ioWait = -1L;
            this.total = -1L;
            this.appCpuTime = -1L;
            this.elapsedRealTime = SystemClock.elapsedRealtime();
        }
    }

    public static IdleChecker getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IdleChecker) ipChange.ipc$dispatch("d6b4e725", new Object[]{context});
        }
        if (f5475a == null) {
            synchronized (IdleChecker.class) {
                if (f5475a == null) {
                    f5475a = new IdleChecker(context);
                }
            }
        }
        return f5475a;
    }

    private IdleChecker(Context context) {
        this.b = context.getApplicationContext();
        if (this.b == null) {
            this.b = context;
        }
        this.c = new Handler(Looper.getMainLooper());
        this.d = false;
        this.e = false;
        this.f = 0L;
    }

    public synchronized void triggerTimeout(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266e7c44", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!this.d) {
            this.d = true;
            this.f = SystemClock.elapsedRealtime();
            new StringBuilder("trigger timeout time: ").append(this.f);
            this.c.post(this);
        }
        if (z && !this.e) {
            this.e = true;
            this.f = SystemClock.elapsedRealtime();
            new StringBuilder("trigger idle check time: ").append(this.f);
        }
    }

    private synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        new StringBuilder("enterIdle time: ").append(SystemClock.elapsedRealtime());
        this.c.removeCallbacks(this);
        EventTrigger.getInstance(this.b).event(Constants.EVENT_ENTER_IDLE, null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    @Override // java.lang.Runnable
    public synchronized void run() {
        /*
            r10 = this;
            monitor-enter(r10)
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.mobile.common.logging.util.perf.IdleChecker.$ipChange     // Catch: java.lang.Throwable -> La8
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange     // Catch: java.lang.Throwable -> La8
            r2 = 1
            if (r1 == 0) goto L14
            java.lang.String r1 = "5c510192"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> La8
            r3 = 0
            r2[r3] = r10     // Catch: java.lang.Throwable -> La8
            r0.ipc$dispatch(r1, r2)     // Catch: java.lang.Throwable -> La8
            monitor-exit(r10)
            return
        L14:
            java.lang.String r0 = ""
            java.lang.String r1 = ""
            r3 = 0
            int r4 = r10.g     // Catch: java.lang.Throwable -> L85
            if (r4 != 0) goto L23
            int r4 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L85
            r10.g = r4     // Catch: java.lang.Throwable -> L85
        L23:
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L85
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L85
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L85
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85
            java.lang.String r8 = "/proc/"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L85
            int r8 = r10.g     // Catch: java.lang.Throwable -> L85
            r7.append(r8)     // Catch: java.lang.Throwable -> L85
            java.lang.String r8 = "/stat"
            r7.append(r8)     // Catch: java.lang.Throwable -> L85
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L85
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L85
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L85
            r6 = 1000(0x3e8, float:1.401E-42)
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L85
            java.lang.String r1 = r4.readLine()     // Catch: java.lang.Throwable -> L86
            if (r1 != 0) goto L51
            java.lang.String r1 = ""
        L51:
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L86
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L86
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L86
            java.lang.String r9 = "/proc/stat"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L86
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L86
            r5.<init>(r7, r6)     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = r5.readLine()     // Catch: java.lang.Throwable -> L74
            if (r0 != 0) goto L6a
            java.lang.String r0 = ""
        L6a:
            r5.close()     // Catch: java.lang.Throwable -> L8e
        L6d:
            r4.close()     // Catch: java.lang.Throwable -> L8e
            goto L8e
        L71:
            r0 = move-exception
            r3 = r5
            goto L7a
        L74:
            r3 = r5
            goto L86
        L76:
            r0 = move-exception
            goto L7a
        L78:
            r0 = move-exception
            r4 = r3
        L7a:
            if (r3 == 0) goto L7f
            r3.close()     // Catch: java.lang.Throwable -> L84
        L7f:
            if (r4 == 0) goto L84
            r4.close()     // Catch: java.lang.Throwable -> L84
        L84:
            throw r0     // Catch: java.lang.Throwable -> La8
        L85:
            r4 = r3
        L86:
            if (r3 == 0) goto L8b
            r3.close()     // Catch: java.lang.Throwable -> L8e
        L8b:
            if (r4 == 0) goto L8e
            goto L6d
        L8e:
            boolean r2 = r10.a(r0, r1)     // Catch: java.lang.Throwable -> L92
        L92:
            if (r2 == 0) goto L99
            r10.a()     // Catch: java.lang.Throwable -> La8
            monitor-exit(r10)
            return
        L99:
            android.os.Handler r0 = r10.c     // Catch: java.lang.Throwable -> La8
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> La8
            r2 = 1
            long r1 = r1.toMillis(r2)     // Catch: java.lang.Throwable -> La8
            r0.postDelayed(r10, r1)     // Catch: java.lang.Throwable -> La8
            monitor-exit(r10)
            return
        La8:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.util.perf.IdleChecker.run():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x018e A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(java.lang.String r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.util.perf.IdleChecker.a(java.lang.String, java.lang.String):boolean");
    }
}
