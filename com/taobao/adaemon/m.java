package com.taobao.adaemon;

import android.content.Context;
import android.content.pm.PackageManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import mtopsdk.network.impl.ResponseProtocolType;
import tb.kav;
import tb.kge;

/* loaded from: classes.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static m f8376a;

    static {
        kge.a(-569844116);
    }

    public static /* synthetic */ void lambda$CBDDWZKZUMIdQlNITsDnLvqEySI(m mVar, Context context, kav kavVar) {
        mVar.b(context, kavVar);
    }

    /* renamed from: lambda$iZmRZ9hrCmnngtVT5-SRaJRof2w */
    public static /* synthetic */ void m821lambda$iZmRZ9hrCmnngtVT5SRaJRof2w(m mVar, Context context, String str, String str2) {
        mVar.b(context, str, str2);
    }

    private m() {
    }

    public static m a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("90874e6d", new Object[0]);
        }
        if (f8376a == null) {
            synchronized (m.class) {
                if (f8376a == null) {
                    f8376a = new m();
                }
            }
        }
        return f8376a;
    }

    public void a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258f9aa3", new Object[]{this, context, new Integer(i)});
            return;
        }
        e.b("LaunchPredictor", ResponseProtocolType.EVENT + i, new Object[0]);
        if (i != 2) {
            return;
        }
        a(context, "link_launch", System.currentTimeMillis() + "");
    }

    public void a(final Context context, final kav<Boolean> kavVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82ce84f0", new Object[]{this, context, kavVar});
        } else if (kavVar == null) {
        } else {
            c.e().execute(new Runnable() { // from class: com.taobao.adaemon.-$$Lambda$m$CBDDWZKZUMIdQlNITsDnLvqEySI
                @Override // java.lang.Runnable
                public final void run() {
                    m.lambda$CBDDWZKZUMIdQlNITsDnLvqEySI(m.this, context, kavVar);
                }
            });
        }
    }

    public /* synthetic */ void b(Context context, kav kavVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e421218f", new Object[]{this, context, kavVar});
            return;
        }
        try {
            if (!c(context) || !d(context) || !b(context)) {
                kavVar.accept(false);
                return;
            }
        } catch (Throwable th) {
            e.a("LaunchPredictor", "predict err", th, new Object[0]);
        }
        kavVar.accept(true);
        l.f(context).edit().putLong("launch_predict_time", System.currentTimeMillis()).apply();
    }

    public boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{this, context})).booleanValue();
        }
        if (!j.a().D()) {
            return true;
        }
        try {
            long j = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
            if (j > 0) {
                Object[] objArr = new Object[2];
                objArr[0] = "result";
                int i = ((System.currentTimeMillis() - j) > 86400000L ? 1 : ((System.currentTimeMillis() - j) == 86400000L ? 0 : -1));
                objArr[1] = Boolean.valueOf(i >= 0);
                e.b("LaunchPredictor", "checkInstall", objArr);
                return i >= 0;
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean d(android.content.Context r13) {
        /*
            r12 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.adaemon.m.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1c
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r4] = r12
            r1[r3] = r13
            java.lang.String r13 = "a0236741"
            java.lang.Object r13 = r0.ipc$dispatch(r13, r1)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            return r13
        L1c:
            com.taobao.adaemon.j r0 = com.taobao.adaemon.j.a()
            boolean r0 = r0.z()
            if (r0 != 0) goto L27
            return r3
        L27:
            r0 = 0
            java.lang.String r5 = "link_launch"
            java.lang.String r13 = r12.a(r13, r5)     // Catch: java.lang.Throwable -> L3b
            boolean r5 = android.text.StringUtils.isEmpty(r13)     // Catch: java.lang.Throwable -> L3b
            if (r5 != 0) goto L3b
            long r5 = java.lang.Long.parseLong(r13)     // Catch: java.lang.Throwable -> L3b
            goto L3c
        L3b:
            r5 = r0
        L3c:
            java.lang.String r13 = "LaunchPredictor"
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 != 0) goto L4a
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r1 = "checkLinkLaunch, linkLaunchTimeInMill <= 0"
            com.taobao.adaemon.e.b(r13, r1, r0)
            return r4
        L4a:
            long r0 = java.lang.System.currentTimeMillis()
            com.taobao.adaemon.j r7 = com.taobao.adaemon.j.a()
            int r7 = r7.I()
            int r8 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r8 < 0) goto L6a
            long r0 = r0 - r5
            int r8 = r7 * 24
            long r8 = (long) r8
            r10 = 3600000(0x36ee80, double:1.7786363E-317)
            long r8 = r8 * r10
            int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r10 >= 0) goto L68
            goto L6a
        L68:
            r0 = 0
            goto L6b
        L6a:
            r0 = 1
        L6b:
            if (r0 != 0) goto L8b
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r8 = "daysApart"
            r1[r4] = r8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r1[r3] = r4
            java.lang.String r3 = "linkLaunchTimeInMill"
            r1[r2] = r3
            r2 = 3
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r1[r2] = r3
            java.lang.String r2 = "checkLinkLaunch block"
            com.taobao.adaemon.e.b(r13, r2, r1)
        L8b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.adaemon.m.d(android.content.Context):boolean");
    }

    private boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{this, context})).booleanValue();
        }
        int n = j.a().n();
        if (n <= 0) {
            return true;
        }
        long j = l.f(context).getLong("launch_predict_time", 0L);
        long currentTimeMillis = System.currentTimeMillis() - j;
        boolean z = j > 0 && currentTimeMillis > 0 && currentTimeMillis < ((long) n) * 1000;
        if (z) {
            e.b("LaunchPredictor", "checkInterval blocked", new Object[0]);
        }
        return !z;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    private java.lang.String a(android.content.Context r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.String r0 = "LaunchPredictor"
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.adaemon.m.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 2
            r4 = 1
            r5 = 3
            r6 = 0
            if (r2 == 0) goto L1d
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r6] = r11
            r0[r4] = r12
            r0[r3] = r13
            java.lang.String r12 = "cfe597b6"
            java.lang.Object r12 = r1.ipc$dispatch(r12, r0)
            java.lang.String r12 = (java.lang.String) r12
            return r12
        L1d:
            r1 = 0
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L5d
            java.io.File r12 = r11.b(r12, r13)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r7 = "rw"
            r2.<init>(r12, r7)     // Catch: java.lang.Throwable -> L5d
            java.nio.channels.FileChannel r12 = r2.getChannel()     // Catch: java.lang.Throwable -> L56
            java.nio.channels.FileLock r12 = r12.lock()     // Catch: java.lang.Throwable -> L56
            java.lang.String r7 = r2.readLine()     // Catch: java.lang.Throwable -> L51
            java.lang.String r8 = "readFromLocal"
            r9 = 4
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L51
            java.lang.String r10 = "name"
            r9[r6] = r10     // Catch: java.lang.Throwable -> L51
            r9[r4] = r13     // Catch: java.lang.Throwable -> L51
            java.lang.String r13 = "line"
            r9[r3] = r13     // Catch: java.lang.Throwable -> L51
            r9[r5] = r7     // Catch: java.lang.Throwable -> L51
            com.taobao.adaemon.e.b(r0, r8, r9)     // Catch: java.lang.Throwable -> L51
            r11.a(r12, r2)
            return r7
        L51:
            r13 = move-exception
            goto L60
        L53:
            r13 = move-exception
            r12 = r1
            goto L6d
        L56:
            r13 = move-exception
            r12 = r1
            goto L60
        L59:
            r13 = move-exception
            r12 = r1
            r2 = r12
            goto L6d
        L5d:
            r13 = move-exception
            r12 = r1
            r2 = r12
        L60:
            java.lang.String r3 = "readFromLocal err"
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L6c
            com.taobao.adaemon.e.a(r0, r3, r13, r4)     // Catch: java.lang.Throwable -> L6c
            r11.a(r12, r2)
            return r1
        L6c:
            r13 = move-exception
        L6d:
            r11.a(r12, r2)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.adaemon.m.a(android.content.Context, java.lang.String):java.lang.String");
    }

    private void a(final Context context, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{this, context, str, str2});
        } else {
            c.e().execute(new Runnable() { // from class: com.taobao.adaemon.-$$Lambda$m$iZmRZ9hrCmnngtVT5-SRaJRof2w
                {
                    m.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    m.m821lambda$iZmRZ9hrCmnngtVT5SRaJRof2w(m.this, context, str, str2);
                }
            });
        }
    }

    public /* synthetic */ void b(Context context, String str, String str2) {
        RandomAccessFile randomAccessFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbd7193", new Object[]{this, context, str, str2});
            return;
        }
        FileLock fileLock = null;
        try {
            randomAccessFile = new RandomAccessFile(b(context, str), "rw");
            try {
                fileLock = randomAccessFile.getChannel().lock();
                String readLine = randomAccessFile.readLine();
                if (readLine == null) {
                    readLine = "";
                }
                e.b("LaunchPredictor", "writeToLocal", "name", str, "line", readLine, "value", str2);
                randomAccessFile.setLength(0L);
                randomAccessFile.write(str2.getBytes());
            } catch (Throwable th) {
                th = th;
                try {
                    e.a("LaunchPredictor", "writeToLocal err", th, new Object[0]);
                } finally {
                    a(fileLock, randomAccessFile);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    private File b(Context context, String str) throws FileNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("4a8e03a4", new Object[]{this, context, str});
        }
        File file = new File(context.getFilesDir(), "adaemon");
        if (!file.exists()) {
            file.mkdir();
        }
        return new File(file, str + ".lk");
    }

    private void a(FileLock fileLock, RandomAccessFile randomAccessFile) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b79e82a9", new Object[]{this, fileLock, randomAccessFile});
            return;
        }
        if (fileLock != null) {
            try {
                fileLock.release();
            } catch (IOException unused) {
            }
        }
        if (randomAccessFile == null) {
            return;
        }
        try {
            randomAccessFile.close();
        } catch (IOException unused2) {
        }
    }
}
