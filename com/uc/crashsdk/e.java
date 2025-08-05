package com.uc.crashsdk;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Debug;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StatFs;
import android.os.StrictMode;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.alipay.mobile.common.transport.utils.TransportConstants;
import com.huawei.hms.utils.FileUtil;
import com.taobao.tao.shop.common.ShopConstants;
import com.uc.crashsdk.a.h;
import com.uc.crashsdk.export.LogType;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import mtopsdk.common.util.SymbolExpUtil;
import mtopsdk.mtop.intf.MtopParamType;
import org.ifaa.android.manager.face.IFAAFaceManager;
import tb.bgy;
import tb.jfv;

/* loaded from: classes.dex */
public class e implements Thread.UncaughtExceptionHandler {
    private static long b;
    private static String j;
    private final List<FileInputStream> f = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f23755a = !e.class.desiredAssertionStatus();
    private static final AtomicBoolean c = new AtomicBoolean(false);
    private static boolean d = false;
    private static final Random e = new Random();
    private static long g = 0;
    private static long h = -1;
    private static boolean i = true;
    private static String k = "";
    private static String l = null;
    private static String m = null;
    private static String n = null;
    private static final Object o = new Object();
    private static final ConditionVariable p = new ConditionVariable();
    private static final Object q = new Object();
    private static final Object r = new Object();
    private static final Object s = new Object();
    private static final ArrayList<String> t = new ArrayList<>();
    private static int u = 0;
    private static String v = null;
    private static boolean w = false;
    private static String x = null;
    private static String y = null;
    private static final Object z = new Object();
    private static final Object A = new Object();
    private static Map<String, Integer> B = null;
    private static String C = null;
    private static int D = -1;
    private static int E = -1;
    private static int F = -1;
    private static int G = -1;
    private static int H = -1;
    private static int I = -1;
    private static int J = -1;
    private static String K = "?";
    private static boolean L = false;
    private static boolean M = false;
    private static int N = 0;
    private static int O = 0;
    private static boolean P = false;
    private static com.uc.crashsdk.a.e Q = new com.uc.crashsdk.a.e(405);
    private static c R = new c((byte) 0);
    private static boolean S = false;
    private static final com.uc.crashsdk.a.e T = new com.uc.crashsdk.a.e(IFAAFaceManager.STATUS_FACE_OFFSET_TOP);
    private static Thread.UncaughtExceptionHandler U = null;
    private static Throwable V = null;
    private static boolean W = false;
    private static boolean X = false;
    private static Runnable Y = null;
    private static final Object Z = new Object();
    private static int aa = 101;
    private static Runnable ab = new com.uc.crashsdk.a.e(407);
    private static final Object ac = new Object();
    private static volatile boolean ad = false;
    private static Object ae = new Object();
    private static ParcelFileDescriptor af = null;
    private static boolean ag = false;
    private static boolean ah = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public static class a extends OutputStream {

        /* renamed from: a  reason: collision with root package name */
        private final long f23756a;
        private final OutputStream b;
        private int c = 0;
        private int d = 0;
        private boolean e = false;

        a(long j, OutputStream outputStream) {
            this.f23756a = j;
            this.b = outputStream;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private int a(byte[] r7, int r8, int r9) {
            /*
                r6 = this;
                int r0 = r6.d
                int r0 = r0 + r9
                r6.d = r0
                boolean r0 = r6.e
                if (r0 == 0) goto Lb
                r7 = 0
                return r7
            Lb:
                int r0 = com.uc.crashsdk.g.y()
                if (r0 <= 0) goto L19
                int r1 = r6.c
                int r2 = r1 + r9
                if (r2 <= r0) goto L19
                int r0 = r0 - r1
                goto L1a
            L19:
                r0 = r9
            L1a:
                int r1 = r6.c
                int r1 = r1 + r0
                r6.c = r1
                long r1 = r6.f23756a
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 == 0) goto L30
                java.lang.String r1 = new java.lang.String
                r1.<init>(r7, r8, r0)
                r6.b(r1)
                goto L35
            L30:
                java.io.OutputStream r1 = r6.b
                r1.write(r7, r8, r0)
            L35:
                if (r0 >= r9) goto L3a
                r7 = 1
                r6.e = r7
            L3a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.a.a(byte[], int, int):int");
        }

        private void b(String str) {
            if (com.uc.crashsdk.b.d) {
                JNIBridge.nativeClientWriteData(this.f23756a, str);
            }
        }

        final void a() {
            try {
                if (this.d - this.c > 0) {
                    a("\n");
                    a("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n");
                }
                a(String.format(Locale.US, "Full: %d bytes, write: %d bytes, limit: %d bytes, reject: %d bytes.\n", Integer.valueOf(this.d), Integer.valueOf(this.c), Integer.valueOf(g.y()), Integer.valueOf(this.d - this.c)));
            } catch (Throwable th) {
                com.uc.crashsdk.a.g.a(th);
            }
        }

        final void a(String str) {
            if (e.i && e.N()) {
                com.uc.crashsdk.a.a.d("DEBUG", str);
            }
            if (this.f23756a != 0) {
                b(str);
            } else {
                this.b.write(str.getBytes("UTF-8"));
            }
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
            if (e.i && e.N()) {
                com.uc.crashsdk.a.a.d("DEBUG", String.format(Locale.US, "%c", Integer.valueOf(i)));
            }
            if (this.f23756a != 0) {
                b(String.format(Locale.US, "%c", Integer.valueOf(i)));
            } else {
                this.b.write(i);
            }
            this.c++;
            this.d++;
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) {
            if (e.i && e.N() && (bArr.length != 1 || bArr[0] != 10)) {
                try {
                    com.uc.crashsdk.a.a.d("DEBUG", new String(bArr));
                } catch (Throwable unused) {
                }
            }
            a(bArr, 0, bArr.length);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) {
            if (e.i && e.N()) {
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArr, i, bArr2, 0, i2);
                if (i2 != 1 || bArr2[0] != 10) {
                    try {
                        com.uc.crashsdk.a.a.d("DEBUG", new String(bArr2));
                    } catch (Throwable unused) {
                    }
                }
            }
            a(bArr, i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public static class b implements Comparator<File> {
        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(File file, File file2) {
            File file3 = file;
            File file4 = file2;
            if (file3.lastModified() > file4.lastModified()) {
                return 1;
            }
            return file3.lastModified() < file4.lastModified() ? -1 : 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends BroadcastReceiver {
        private c() {
        }

        /* synthetic */ c(byte b) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (!"android.intent.action.BATTERY_CHANGED".equals(action)) {
                if ("android.intent.action.BATTERY_LOW".equals(action) || "android.intent.action.BATTERY_OKAY".equals(action)) {
                    boolean unused = e.L = "android.intent.action.BATTERY_LOW".equals(action);
                    e.K();
                    return;
                } else if (!"android.intent.action.ANR".equals(action)) {
                    return;
                } else {
                    try {
                        e.d(context);
                        return;
                    } catch (Throwable th) {
                        com.uc.crashsdk.a.g.a(th);
                        return;
                    }
                }
            }
            int unused2 = e.D = intent.getIntExtra("level", -1);
            int unused3 = e.E = intent.getIntExtra("scale", -1);
            int unused4 = e.F = intent.getIntExtra("voltage", -1);
            int unused5 = e.G = intent.getIntExtra("health", -1);
            int unused6 = e.H = intent.getIntExtra("plugged", -1);
            int unused7 = e.I = intent.getIntExtra("status", -1);
            int unused8 = e.J = intent.getIntExtra("temperature", -1);
            String unused9 = e.K = intent.getStringExtra("technology");
            if (e.J() < 2) {
                return;
            }
            e.K();
            int unused10 = e.N = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        long f23757a;
        long b;
        int c;
        int d;
        boolean e;
        boolean f;
        boolean g;

        private d() {
            this.f23757a = 0L;
            this.b = 0L;
            this.c = 0;
            this.d = 0;
            this.e = false;
            this.f = false;
            this.g = false;
        }

        /* synthetic */ d(byte b) {
            this();
        }
    }

    public e() {
        try {
            M();
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
    }

    public static void A() {
        if (!g.q()) {
            return;
        }
        com.uc.crashsdk.a.f.a(0, new com.uc.crashsdk.a.e(403), 10000L);
    }

    public static void B() {
        if (!ad && !com.uc.crashsdk.b.M()) {
            com.uc.crashsdk.a.f.a(1, new com.uc.crashsdk.a.e(408), 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void C() {
        com.uc.crashsdk.a.f.a(1, new com.uc.crashsdk.a.e(IFAAFaceManager.STATUS_FACE_MOUTH_OCCLUSION), 7000L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
        if ((java.lang.System.currentTimeMillis() % 3) == 0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r0 == 1) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
        r3 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void D() {
        /*
            int r0 = com.uc.crashsdk.g.L()
            r1 = 4
            r2 = 3
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L13
            if (r0 == r2) goto L13
            if (r0 != r1) goto Lf
            goto L13
        Lf:
            if (r0 != r3) goto L47
        L11:
            r3 = 0
            goto L47
        L13:
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 21
            if (r5 < r6) goto L47
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 25
            if (r5 > r6) goto L47
            if (r0 != 0) goto L23
            r5 = 0
            goto L24
        L23:
            r5 = 1
        L24:
            r6 = 0
            if (r0 != r2) goto L37
            long r8 = java.lang.System.currentTimeMillis()
            r10 = 10
            long r8 = r8 % r10
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 != 0) goto L35
            r2 = 1
            goto L38
        L35:
            r2 = 0
            goto L38
        L37:
            r2 = r5
        L38:
            if (r0 != r1) goto L46
            long r0 = java.lang.System.currentTimeMillis()
            r8 = 3
            long r0 = r0 % r8
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 != 0) goto L11
            goto L47
        L46:
            r3 = r2
        L47:
            if (r3 != 0) goto L50
            java.lang.String r0 = "crashsdk"
            java.lang.String r1 = "SIG 3 is disabled by settings"
            com.uc.crashsdk.a.a.a(r0, r1)
        L50:
            boolean r0 = com.uc.crashsdk.b.M()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r1 == r2) goto L6c
            if (r3 == 0) goto L6c
            r1 = 2
            com.uc.crashsdk.a.e r2 = new com.uc.crashsdk.a.e
            r3 = 413(0x19d, float:5.79E-43)
            r2.<init>(r3)
            com.uc.crashsdk.a.f.a(r1, r2)
            r3 = 0
        L6c:
            r1 = 7
            long r4 = (long) r0
            r0 = 0
            com.uc.crashsdk.JNIBridge.nativeCmd(r1, r4, r0, r0)
            if (r3 == 0) goto L79
            r0 = 8
            com.uc.crashsdk.JNIBridge.cmd(r0)
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.D():void");
    }

    public static ParcelFileDescriptor E() {
        if (!com.uc.crashsdk.b.d) {
            com.uc.crashsdk.a.a.d("crashsdk", "Crash so is not loaded!");
            return null;
        }
        synchronized (ae) {
            if (af != null) {
                return af;
            }
            int cmd = (int) JNIBridge.cmd(14);
            if (cmd == -1) {
                return null;
            }
            af = ParcelFileDescriptor.adoptFd(cmd);
            ag = true;
            return af;
        }
    }

    public static boolean F() {
        return ah;
    }

    public static void G() {
        String W2 = g.W();
        File file = new File(W2);
        if (!file.exists() || !file.isDirectory()) {
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            com.uc.crashsdk.a.a.b("Ucebu can not list folder: " + W2);
            return;
        }
        for (File file2 : listFiles) {
            if (file2.isFile() && file2.getName().contains("ucebu")) {
                a(false, false);
                return;
            }
        }
    }

    static /* synthetic */ int J() {
        int i2 = N + 1;
        N = i2;
        return i2;
    }

    static /* synthetic */ void K() {
        StringBuilder X2;
        if (com.uc.crashsdk.b.d && (X2 = X()) != null) {
            JNIBridge.set(125, X2.toString());
        }
        M = true;
        Y();
    }

    private void M() {
        int G2 = g.G();
        for (int i2 = 0; i2 < G2; i2++) {
            try {
                this.f.add(new FileInputStream("/dev/null"));
            } catch (Exception e2) {
                com.uc.crashsdk.a.g.a(e2);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean N() {
        if (g.N()) {
            return true;
        }
        return a();
    }

    private static String O() {
        return g.e() + "_";
    }

    private static String P() {
        return com.uc.crashsdk.b.C() ? "fg" : "bg";
    }

    private static byte[] Q() {
        byte[] bArr = null;
        int i2 = 1024;
        while (bArr == null && i2 > 0) {
            try {
                bArr = new byte[i2];
            } catch (Throwable unused) {
                i2 /= 2;
                if (i2 < 16) {
                    break;
                }
            }
        }
        return bArr;
    }

    private static String R() {
        return (!com.uc.crashsdk.b.G() || d) ? "java" : "ucebujava";
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    private static void S() {
        /*
            java.lang.String r0 = "-"
            java.lang.String r1 = android.os.Build.HARDWARE     // Catch: java.lang.Throwable -> L5
            goto La
        L5:
            r1 = move-exception
            com.uc.crashsdk.a.g.a(r1)
            r1 = r0
        La:
            r2 = 0
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L69
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L69
            java.lang.String r5 = "/proc/cpuinfo"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L69
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L69
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L60
            r5 = 512(0x200, float:7.175E-43)
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L60
            r2 = 0
        L1f:
            java.lang.String r5 = r4.readLine()     // Catch: java.lang.Throwable -> L5b
            if (r5 == 0) goto L70
            java.lang.String r6 = "Hardware"
            boolean r6 = r5.startsWith(r6)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r7 = ":"
            if (r6 == 0) goto L40
            int r6 = r5.indexOf(r7)     // Catch: java.lang.Throwable -> L5b
            int r6 = r6 + 1
            java.lang.String r5 = r5.substring(r6)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r1 = r5.trim()     // Catch: java.lang.Throwable -> L5b
        L3d:
            int r2 = r2 + 1
            goto L57
        L40:
            java.lang.String r6 = "Processor"
            boolean r6 = r5.startsWith(r6)     // Catch: java.lang.Throwable -> L5b
            if (r6 == 0) goto L57
            int r6 = r5.indexOf(r7)     // Catch: java.lang.Throwable -> L5b
            int r6 = r6 + 1
            java.lang.String r5 = r5.substring(r6)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r0 = r5.trim()     // Catch: java.lang.Throwable -> L5b
            goto L3d
        L57:
            r5 = 2
            if (r2 < r5) goto L1f
            goto L70
        L5b:
            r2 = move-exception
            goto L6d
        L5d:
            r0 = move-exception
            r4 = r2
            goto L7c
        L60:
            r4 = move-exception
            r8 = r4
            r4 = r2
            r2 = r8
            goto L6d
        L65:
            r0 = move-exception
            r3 = r2
            r4 = r3
            goto L7c
        L69:
            r3 = move-exception
            r4 = r2
            r2 = r3
            r3 = r4
        L6d:
            com.uc.crashsdk.a.g.a(r2)     // Catch: java.lang.Throwable -> L7b
        L70:
            com.uc.crashsdk.a.g.a(r3)
            com.uc.crashsdk.a.g.a(r4)
            com.uc.crashsdk.e.l = r1
            com.uc.crashsdk.e.m = r0
            return
        L7b:
            r0 = move-exception
        L7c:
            com.uc.crashsdk.a.g.a(r3)
            com.uc.crashsdk.a.g.a(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.S():void");
    }

    private static String T() {
        return g.V() + "bytes";
    }

    private static boolean U() {
        return Build.VERSION.SDK_INT < 29;
    }

    private static void V() {
        if (!P) {
            JNIBridge.cmd(18);
        }
    }

    private static void W() {
        com.uc.crashsdk.a.f.a(3, new com.uc.crashsdk.a.e(IFAAFaceManager.STATUS_FACE_CAPTURE), 1000L);
    }

    private static StringBuilder X() {
        String str;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("level: ");
            sb.append(D);
            sb.append("\n");
            sb.append("scale: ");
            sb.append(E);
            sb.append("\n");
            String str2 = " (Unknown)";
            switch (G) {
                case 1:
                    str = str2;
                    break;
                case 2:
                    str = " (Good)";
                    break;
                case 3:
                    str = " (Overheat)";
                    break;
                case 4:
                    str = " (Dead)";
                    break;
                case 5:
                    str = " (Over voltage)";
                    break;
                case 6:
                    str = " (Unspecified failure)";
                    break;
                case 7:
                    str = " (Cold)";
                    break;
                default:
                    str = " (?)";
                    break;
            }
            sb.append("health: ");
            sb.append(G);
            sb.append(str);
            sb.append("\n");
            int i2 = H;
            String str3 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 4 ? " (?)" : " (Wireless)" : " (USB port)" : " (AC charger)" : " (None)";
            sb.append("pluged: ");
            sb.append(H);
            sb.append(str3);
            sb.append("\n");
            int i3 = I;
            if (i3 != 1) {
                str2 = i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? " (?)" : " (Full)" : " (Not charging)" : " (Discharging)" : " (Charging)";
            }
            sb.append("status: ");
            sb.append(I);
            sb.append(str2);
            sb.append("\n");
            sb.append("voltage: ");
            sb.append(F);
            sb.append("\n");
            sb.append("temperature: ");
            sb.append(J);
            sb.append("\n");
            sb.append("technology: ");
            sb.append(K);
            sb.append("\n");
            sb.append("battery low: ");
            sb.append(L);
            sb.append("\n");
            return sb;
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
            return null;
        }
    }

    private static void Y() {
        if (!com.uc.crashsdk.b.c || !M || !com.uc.crashsdk.a.c) {
            return;
        }
        M = false;
        if (com.uc.crashsdk.a.f.b(Q)) {
            return;
        }
        com.uc.crashsdk.a.f.a(0, Q, 2000L);
    }

    private static boolean Z() {
        return com.uc.crashsdk.b.d && JNIBridge.nativeIsCrashing();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(OutputStream outputStream, String str, int i2) {
        Throwable th;
        int i3;
        if (str == null) {
            a(outputStream);
            return 0;
        }
        try {
            String a2 = com.uc.crashsdk.a.b.a(str);
            if (a2 == null) {
                a2 = "file: '" + str + "' not found or decode failed!";
            }
            i3 = a2.length();
            if (i3 > i2 + 32) {
                i3 = i2;
            }
            if (i3 > 0) {
                try {
                    outputStream.write(a2.getBytes("UTF-8"), 0, i3);
                    outputStream.write("\n".getBytes("UTF-8"));
                } catch (Throwable th2) {
                    th = th2;
                    a(th, outputStream);
                    a(outputStream);
                    return i3;
                }
            }
            if (i3 < a2.length()) {
                outputStream.write(String.format(Locale.US, "(truncated %d bytes)\n", Integer.valueOf(a2.length() - i3)).getBytes("UTF-8"));
            }
        } catch (Throwable th3) {
            th = th3;
            i3 = 0;
        }
        a(outputStream);
        return i3;
    }

    private static long a(StatFs statFs, String str, String str2) {
        try {
            if (Build.VERSION.SDK_INT >= 18) {
                Method declaredMethod = StatFs.class.getDeclaredMethod(str, new Class[0]);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(statFs, new Object[0]);
                if (invoke != null && (invoke instanceof Long)) {
                    return ((Long) invoke).longValue();
                }
            }
        } catch (Throwable unused) {
        }
        try {
            Method declaredMethod2 = StatFs.class.getDeclaredMethod(str2, new Class[0]);
            declaredMethod2.setAccessible(true);
            Object invoke2 = declaredMethod2.invoke(statFs, new Object[0]);
            if (invoke2 != null && (invoke2 instanceof Integer)) {
                return ((Integer) invoke2).intValue();
            }
            return 0L;
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
            return 0L;
        }
    }

    private static BufferedReader a(InputStreamReader inputStreamReader) {
        BufferedReader bufferedReader = null;
        int i2 = 8192;
        while (bufferedReader == null && i2 > 0) {
            try {
                bufferedReader = new BufferedReader(inputStreamReader, i2);
            } catch (Throwable unused) {
                i2 /= 2;
                if (i2 < 512) {
                    break;
                }
            }
        }
        return bufferedReader;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(int i2) {
        try {
            String a2 = com.uc.crashsdk.a.g.a(new File(String.format(Locale.US, "/proc/%d/cmdline", Integer.valueOf(i2))), 128, false);
            return com.uc.crashsdk.a.g.b(a2) ? l(a2) : "unknown";
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
            return "unknown";
        }
    }

    private static String a(File file) {
        String str;
        try {
            str = file.getCanonicalPath();
        } catch (Throwable unused) {
            str = null;
        }
        return com.uc.crashsdk.a.g.a(str) ? file.getPath() : str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str) {
        int lastIndexOf;
        int indexOf;
        int i2;
        int indexOf2;
        File file;
        byte[] e2;
        if (g.x() && (lastIndexOf = str.lastIndexOf(47)) > 0 && (indexOf = str.indexOf(95, lastIndexOf)) > lastIndexOf && (indexOf2 = str.indexOf(95, (i2 = indexOf + 1))) > indexOf) {
            String d2 = com.uc.crashsdk.a.g.d(jfv.a._MAGIC + str.substring(lastIndexOf + 1, indexOf) + str.substring(i2, indexOf2));
            if (d2 == null || (e2 = com.uc.crashsdk.a.g.e((file = new File(str)))) == null || e2.length <= 0) {
                return str;
            }
            byte[] bArr = null;
            try {
                bArr = com.uc.crashsdk.a.c.b(e2, d2.substring(0, 16).getBytes());
            } catch (Throwable th) {
                com.uc.crashsdk.a.g.a(th);
            }
            if (bArr == null) {
                return str;
            }
            String str2 = str + ".ec";
            File file2 = new File(str2 + ".tmp");
            if (!com.uc.crashsdk.a.g.a(file2, bArr)) {
                return str;
            }
            if (!file2.renameTo(new File(str2))) {
                file2.delete();
                return str;
            }
            file.delete();
            return str2;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
        r3.write(r4.getBytes("UTF-8"));
        r3.write("\n".getBytes("UTF-8"));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r8, java.lang.String r9) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L7a
            r1 = 26
            java.lang.String r2 = "ps"
            if (r0 < r1) goto L10
            java.lang.String r0 = "-ef"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0}     // Catch: java.lang.Throwable -> L7a
            goto L14
        L10:
            java.lang.String[] r0 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L7a
        L14:
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L7a
            java.lang.Process r0 = r1.exec(r0)     // Catch: java.lang.Throwable -> L7a
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L7a
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L7a
            java.io.InputStream r0 = r0.getInputStream()     // Catch: java.lang.Throwable -> L7a
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L7a
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L7a
            boolean r0 = com.uc.crashsdk.a.g.b(r8)     // Catch: java.lang.Throwable -> L7a
            boolean r2 = com.uc.crashsdk.a.g.b(r9)     // Catch: java.lang.Throwable -> L7a
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L7a
            r3.<init>()     // Catch: java.lang.Throwable -> L7a
        L37:
            java.lang.String r4 = r1.readLine()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r5 = "UTF-8"
            if (r4 == 0) goto L75
            r6 = 1
            if (r0 == 0) goto L48
            boolean r7 = r4.contains(r8)     // Catch: java.lang.Throwable -> L7a
            if (r7 != 0) goto L62
        L48:
            if (r2 == 0) goto L51
            boolean r7 = r4.contains(r9)     // Catch: java.lang.Throwable -> L7a
            if (r7 == 0) goto L51
            goto L62
        L51:
            r7 = 47
            int r7 = r4.indexOf(r7)     // Catch: java.lang.Throwable -> L7a
            if (r7 >= 0) goto L61
            r7 = 46
            int r7 = r4.indexOf(r7)     // Catch: java.lang.Throwable -> L7a
            if (r7 > 0) goto L62
        L61:
            r6 = 0
        L62:
            if (r6 == 0) goto L37
            byte[] r4 = r4.getBytes(r5)     // Catch: java.lang.Throwable -> L7a
            r3.write(r4)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = "\n"
            byte[] r4 = r4.getBytes(r5)     // Catch: java.lang.Throwable -> L7a
            r3.write(r4)     // Catch: java.lang.Throwable -> L7a
            goto L37
        L75:
            java.lang.String r8 = r3.toString(r5)     // Catch: java.lang.Throwable -> L7a
            return r8
        L7a:
            r8 = move-exception
            com.uc.crashsdk.a.g.a(r8)
            java.lang.String r8 = "exception exists."
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.a(java.lang.String, java.lang.String):java.lang.String");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    private static java.lang.String a(java.lang.Throwable r18, java.lang.String r19, long r20, boolean r22) {
        /*
            Method dump skipped, instructions count: 920
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.a(java.lang.Throwable, java.lang.String, long, boolean):java.lang.String");
    }

    private static String a(Date date) {
        return String.format(Locale.US, "%d%02d%02d%02d%02d%02d", Integer.valueOf(date.getYear() + 1900), Integer.valueOf(date.getMonth() + 1), Integer.valueOf(date.getDate()), Integer.valueOf(date.getHours()), Integer.valueOf(date.getMinutes()), Integer.valueOf(date.getSeconds()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static StringBuilder a(StackTraceElement[] stackTraceElementArr, String str) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            boolean z2 = str == null;
            int i3 = 0;
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                i3++;
                sb.append("  at ");
                sb.append(stackTraceElement.toString());
                sb.append("\n");
                if (!z2 && stackTraceElement.getMethodName().contains(str)) {
                    sb.delete(0, sb.length());
                    i3 = 0;
                    z2 = true;
                }
            }
            i2 = i3;
        }
        if (i2 == 0) {
            sb.append("  (no java stack)\n");
        }
        return sb;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void a(int i2, Object[] objArr) {
        int i3;
        switch (i2) {
            case 401:
                JNIBridge.nativeCmd(10, com.uc.crashsdk.b.J() == 5 ? 1L : 0L, null, null);
                com.uc.crashsdk.a.c = true;
                com.uc.crashsdk.a.a(false);
                M = true;
                Y();
                y();
                return;
            case 402:
                synchronized (Z) {
                    if (Y == null) {
                        return;
                    }
                    X = true;
                    if (com.uc.crashsdk.b.q()) {
                        return;
                    }
                    if (!com.uc.crashsdk.a.d.e()) {
                        com.uc.crashsdk.a.a.c("DEBUG", com.uc.crashsdk.a.d.b());
                        return;
                    } else if (!d(LogType.UNEXP_TYPE)) {
                        com.uc.crashsdk.a.a.d("DEBUG", "unexp sample miss");
                        return;
                    } else {
                        int nativeGenerateUnexpLog = JNIBridge.nativeGenerateUnexpLog(g.o(), g.p());
                        if (nativeGenerateUnexpLog != 0) {
                            f.a(11);
                            if ((nativeGenerateUnexpLog & LogType.UNEXP_KILL_PROCESS) != 0) {
                                aa = 105;
                                i3 = 30;
                            } else if ((nativeGenerateUnexpLog & 8448) != 0) {
                                aa = 104;
                                i3 = 31;
                            } else if ((nativeGenerateUnexpLog & LogType.UNEXP_RESTART) != 0) {
                                aa = 106;
                                i3 = 32;
                            } else {
                                if ((nativeGenerateUnexpLog & 1280) != 0) {
                                    aa = 103;
                                    f.a(10);
                                } else if ((nativeGenerateUnexpLog & 2304) != 0) {
                                    aa = 107;
                                    f.a(29);
                                } else {
                                    aa = 102;
                                }
                                a(true);
                            }
                            f.a(i3);
                            a(true);
                        }
                        synchronized (Z) {
                            Y = null;
                        }
                        return;
                    }
                }
            case 403:
                aa();
                return;
            case 404:
            default:
                if (!f23755a) {
                    throw new AssertionError();
                }
                return;
            case 405:
                M = false;
                StringBuilder X2 = X();
                String g2 = com.uc.crashsdk.b.g();
                if (X2 == null) {
                    return;
                }
                com.uc.crashsdk.a.g.a(new File(g2), X2.toString());
                return;
            case 406:
                if (!f23755a && objArr == null) {
                    throw new AssertionError();
                }
                a((String) objArr[0], ((Boolean) objArr[1]).booleanValue(), ((Boolean) objArr[2]).booleanValue());
                return;
            case 407:
                try {
                    com.uc.crashsdk.a.d();
                    return;
                } catch (Throwable th) {
                    com.uc.crashsdk.a.g.a(th);
                    return;
                }
            case 408:
                synchronized (ac) {
                    if (!ad && g.O() && com.uc.crashsdk.b.A()) {
                        com.uc.crashsdk.b.t();
                        h.f();
                        f.c();
                        if (com.uc.crashsdk.b.G()) {
                            C();
                        }
                        if (g.O()) {
                            a(Calendar.getInstance());
                        }
                        ad = true;
                        return;
                    }
                    return;
                }
            case IFAAFaceManager.STATUS_FACE_MOUTH_OCCLUSION /* 409 */:
                d(false);
                return;
            case IFAAFaceManager.STATUS_FACE_OFFSET_LEFT /* 410 */:
                a(false, true);
                return;
            case IFAAFaceManager.STATUS_FACE_OFFSET_RIGHT /* 411 */:
                if (!com.uc.crashsdk.b.d) {
                    return;
                }
                JNIBridge.set(28, d(LogType.NATIVE_TYPE));
                JNIBridge.set(29, d("anr"));
                return;
            case IFAAFaceManager.STATUS_FACE_OFFSET_TOP /* 412 */:
                if (!S && com.uc.crashsdk.b.C() && g.K()) {
                    b(com.uc.crashsdk.a.g.a());
                    return;
                } else if (!S) {
                    return;
                } else {
                    if (com.uc.crashsdk.b.C() && g.K()) {
                        return;
                    }
                    try {
                        com.uc.crashsdk.a.g.a().unregisterReceiver(R);
                        S = false;
                        return;
                    } catch (Throwable th2) {
                        com.uc.crashsdk.a.g.a(th2);
                        return;
                    }
                }
            case IFAAFaceManager.STATUS_FACE_OFFSET_BOTTOM /* 413 */:
                JNIBridge.cmd(8);
                return;
            case IFAAFaceManager.STATUS_FACE_CAPTURE /* 414 */:
                try {
                    if (d(com.uc.crashsdk.a.g.a())) {
                        return;
                    }
                    int i4 = O + 1;
                    O = i4;
                    if (i4 < 22) {
                        W();
                        return;
                    } else if (!com.uc.crashsdk.b.d) {
                        return;
                    } else {
                        JNIBridge.set(130, "(get failed)");
                        return;
                    }
                } catch (Throwable th3) {
                    com.uc.crashsdk.a.g.a(th3);
                    return;
                }
            case IFAAFaceManager.STATUS_FACE_NO_FACE /* 415 */:
                if (!f23755a && objArr == null) {
                    throw new AssertionError();
                }
                long longValue = ((Long) objArr[0]).longValue();
                Calendar calendar = Calendar.getInstance();
                if (calendar.getTimeInMillis() >= longValue) {
                    h.g();
                    f.a(100);
                    d(true);
                    f.a(true);
                    h.b();
                } else {
                    h.h();
                    h.i();
                    h.c();
                }
                a(calendar);
                break;
            case 416:
                break;
        }
        V();
    }

    public static void a(Context context) {
        try {
            if (!U()) {
                return;
            }
            context.registerReceiver(new c((byte) 0), new IntentFilter("android.intent.action.ANR"), null, com.uc.crashsdk.a.f.a(3));
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
    }

    private static void a(a aVar) {
        try {
            aVar.a(String.format(Locale.US, "log end: %s\n", n()));
        } catch (Throwable th) {
            a(th, aVar);
        }
    }

    private static void a(a aVar, String str, long j2) {
        String nativeDumpThreads;
        String str2 = null;
        if (com.uc.crashsdk.b.d) {
            try {
                aVar.flush();
            } catch (Throwable th) {
                com.uc.crashsdk.a.g.a(th);
            }
            nativeDumpThreads = JNIBridge.nativeDumpThreads(str, j2);
            if (ah || nativeDumpThreads == null || nativeDumpThreads.length() >= 512 || !nativeDumpThreads.startsWith("/") || nativeDumpThreads.indexOf(10) >= 0) {
                str2 = nativeDumpThreads;
            } else {
                if (!new File(nativeDumpThreads).exists()) {
                    str2 = "Can not found " + nativeDumpThreads;
                }
                String str3 = str2;
                str2 = nativeDumpThreads;
                nativeDumpThreads = str3;
            }
        } else {
            nativeDumpThreads = "Native not initialized, skip dump!";
        }
        if (nativeDumpThreads != null) {
            try {
                aVar.write(nativeDumpThreads.getBytes("UTF-8"));
                aVar.write("\n".getBytes("UTF-8"));
            } catch (Throwable th2) {
                com.uc.crashsdk.a.g.a(th2);
            }
            a((OutputStream) aVar);
        } else if (str2 != null && !ah) {
            b(aVar, str2, 1048576);
            File file = new File(str2);
            if (file.exists()) {
                file.delete();
            }
        }
        try {
            aVar.flush();
        } catch (Throwable th3) {
            com.uc.crashsdk.a.g.a(th3);
        }
    }

    private static void a(OutputStream outputStream) {
        try {
            outputStream.write("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n".getBytes("UTF-8"));
        } catch (Throwable th) {
            a(th, outputStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(OutputStream outputStream, String str, String str2) {
        i = false;
        try {
            outputStream.write(String.format(Locale.US, "$^%s`%s^$", str, str2).getBytes("UTF-8"));
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
        i = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(OutputStream outputStream, String str, String str2, int i2, boolean z2, boolean z3) {
        int i3 = 0;
        i = false;
        try {
            Locale locale = Locale.US;
            Object[] objArr = new Object[5];
            objArr[0] = str;
            objArr[1] = str2;
            objArr[2] = Integer.valueOf(i2);
            objArr[3] = Integer.valueOf(z2 ? 1 : 0);
            if (z3) {
                i3 = 1;
            }
            objArr[4] = Integer.valueOf(i3);
            outputStream.write(String.format(locale, "$^%s`%s`%d`%d,%d^$", objArr).getBytes("UTF-8"));
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
        i = true;
        a(outputStream);
    }

    private static void a(OutputStream outputStream, String str, Set<String> set) {
        if (com.uc.crashsdk.a.g.a(str) || set.contains(str) || str.equals("/storage/emulated")) {
            return;
        }
        set.add(str);
        try {
            StatFs statFs = new StatFs(str);
            long a2 = a(statFs, "getBlockCountLong", "getBlockCount");
            long a3 = a(statFs, "getBlockSizeLong", "getBlockSize");
            if ((a2 / 1024) * a3 < FileUtil.LOCAL_REPORT_FILE_MAX_SIZE) {
                return;
            }
            long a4 = a(statFs, "getAvailableBlocksLong", "getAvailableBlocks");
            long a5 = a(statFs, "getFreeBlocksLong", "getFreeBlocks");
            try {
                outputStream.write(String.format(Locale.US, "%s:\n", str).getBytes("UTF-8"));
                double d2 = a3;
                outputStream.write(String.format(Locale.US, "  total:      %d kB\n", Long.valueOf((long) (((a2 * 1.0d) * d2) / 1024.0d))).getBytes("UTF-8"));
                outputStream.write(String.format(Locale.US, "  available:  %d kB\n", Long.valueOf((long) (((a4 * 1.0d) * d2) / 1024.0d))).getBytes("UTF-8"));
                outputStream.write(String.format(Locale.US, "  free:       %d kB\n", Long.valueOf((long) (((a5 * 1.0d) * d2) / 1024.0d))).getBytes("UTF-8"));
                outputStream.write(String.format(Locale.US, "  block size: %d B\n\n", Long.valueOf(a3)).getBytes("UTF-8"));
            } catch (Throwable th) {
                a(th, outputStream);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02fc A[Catch: Throwable -> 0x0438, TryCatch #3 {, blocks: (B:179:0x0430, B:180:0x0432, B:188:0x0441, B:4:0x000a, B:6:0x0010, B:8:0x001f, B:9:0x002f, B:10:0x0034, B:12:0x003a, B:13:0x004d, B:15:0x005d, B:17:0x0067, B:150:0x03c1, B:19:0x006d, B:21:0x007b, B:23:0x008d, B:26:0x00ae, B:28:0x00be, B:32:0x00cc, B:43:0x00f8, B:39:0x00ea, B:62:0x01c6, B:64:0x01da, B:66:0x01de, B:67:0x01e0, B:69:0x01e5, B:70:0x01e7, B:71:0x01ec, B:81:0x020f, B:82:0x0226, B:84:0x022c, B:86:0x0235, B:88:0x0243, B:90:0x0262, B:91:0x0275, B:93:0x0287, B:95:0x0296, B:96:0x02a7, B:110:0x02ea, B:116:0x02fc, B:119:0x0305, B:122:0x0311, B:124:0x031f, B:126:0x032c, B:129:0x0333, B:133:0x0340, B:135:0x034c, B:137:0x0366, B:138:0x036b, B:140:0x037a, B:142:0x0387, B:148:0x03b3, B:153:0x03d5, B:155:0x03dc, B:157:0x03e3, B:159:0x03ea, B:161:0x03f1, B:163:0x03f8, B:169:0x040a, B:171:0x0411, B:173:0x0418, B:175:0x041f, B:167:0x0403, B:141:0x0381, B:143:0x03a5, B:145:0x03ab, B:98:0x02ae, B:100:0x02b4, B:103:0x02bc, B:105:0x02c0, B:107:0x02d4, B:109:0x02d8, B:75:0x01f6, B:77:0x0204, B:79:0x020a, B:61:0x01c2), top: B:196:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x034c A[Catch: Throwable -> 0x0438, TryCatch #3 {, blocks: (B:179:0x0430, B:180:0x0432, B:188:0x0441, B:4:0x000a, B:6:0x0010, B:8:0x001f, B:9:0x002f, B:10:0x0034, B:12:0x003a, B:13:0x004d, B:15:0x005d, B:17:0x0067, B:150:0x03c1, B:19:0x006d, B:21:0x007b, B:23:0x008d, B:26:0x00ae, B:28:0x00be, B:32:0x00cc, B:43:0x00f8, B:39:0x00ea, B:62:0x01c6, B:64:0x01da, B:66:0x01de, B:67:0x01e0, B:69:0x01e5, B:70:0x01e7, B:71:0x01ec, B:81:0x020f, B:82:0x0226, B:84:0x022c, B:86:0x0235, B:88:0x0243, B:90:0x0262, B:91:0x0275, B:93:0x0287, B:95:0x0296, B:96:0x02a7, B:110:0x02ea, B:116:0x02fc, B:119:0x0305, B:122:0x0311, B:124:0x031f, B:126:0x032c, B:129:0x0333, B:133:0x0340, B:135:0x034c, B:137:0x0366, B:138:0x036b, B:140:0x037a, B:142:0x0387, B:148:0x03b3, B:153:0x03d5, B:155:0x03dc, B:157:0x03e3, B:159:0x03ea, B:161:0x03f1, B:163:0x03f8, B:169:0x040a, B:171:0x0411, B:173:0x0418, B:175:0x041f, B:167:0x0403, B:141:0x0381, B:143:0x03a5, B:145:0x03ab, B:98:0x02ae, B:100:0x02b4, B:103:0x02bc, B:105:0x02c0, B:107:0x02d4, B:109:0x02d8, B:75:0x01f6, B:77:0x0204, B:79:0x020a, B:61:0x01c2), top: B:196:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03a5 A[Catch: Throwable -> 0x0438, TryCatch #3 {, blocks: (B:179:0x0430, B:180:0x0432, B:188:0x0441, B:4:0x000a, B:6:0x0010, B:8:0x001f, B:9:0x002f, B:10:0x0034, B:12:0x003a, B:13:0x004d, B:15:0x005d, B:17:0x0067, B:150:0x03c1, B:19:0x006d, B:21:0x007b, B:23:0x008d, B:26:0x00ae, B:28:0x00be, B:32:0x00cc, B:43:0x00f8, B:39:0x00ea, B:62:0x01c6, B:64:0x01da, B:66:0x01de, B:67:0x01e0, B:69:0x01e5, B:70:0x01e7, B:71:0x01ec, B:81:0x020f, B:82:0x0226, B:84:0x022c, B:86:0x0235, B:88:0x0243, B:90:0x0262, B:91:0x0275, B:93:0x0287, B:95:0x0296, B:96:0x02a7, B:110:0x02ea, B:116:0x02fc, B:119:0x0305, B:122:0x0311, B:124:0x031f, B:126:0x032c, B:129:0x0333, B:133:0x0340, B:135:0x034c, B:137:0x0366, B:138:0x036b, B:140:0x037a, B:142:0x0387, B:148:0x03b3, B:153:0x03d5, B:155:0x03dc, B:157:0x03e3, B:159:0x03ea, B:161:0x03f1, B:163:0x03f8, B:169:0x040a, B:171:0x0411, B:173:0x0418, B:175:0x041f, B:167:0x0403, B:141:0x0381, B:143:0x03a5, B:145:0x03ab, B:98:0x02ae, B:100:0x02b4, B:103:0x02bc, B:105:0x02c0, B:107:0x02d4, B:109:0x02d8, B:75:0x01f6, B:77:0x0204, B:79:0x020a, B:61:0x01c2), top: B:196:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0430 A[Catch: all -> 0x044b, TRY_ENTER, TryCatch #3 {, blocks: (B:179:0x0430, B:180:0x0432, B:188:0x0441, B:4:0x000a, B:6:0x0010, B:8:0x001f, B:9:0x002f, B:10:0x0034, B:12:0x003a, B:13:0x004d, B:15:0x005d, B:17:0x0067, B:150:0x03c1, B:19:0x006d, B:21:0x007b, B:23:0x008d, B:26:0x00ae, B:28:0x00be, B:32:0x00cc, B:43:0x00f8, B:39:0x00ea, B:62:0x01c6, B:64:0x01da, B:66:0x01de, B:67:0x01e0, B:69:0x01e5, B:70:0x01e7, B:71:0x01ec, B:81:0x020f, B:82:0x0226, B:84:0x022c, B:86:0x0235, B:88:0x0243, B:90:0x0262, B:91:0x0275, B:93:0x0287, B:95:0x0296, B:96:0x02a7, B:110:0x02ea, B:116:0x02fc, B:119:0x0305, B:122:0x0311, B:124:0x031f, B:126:0x032c, B:129:0x0333, B:133:0x0340, B:135:0x034c, B:137:0x0366, B:138:0x036b, B:140:0x037a, B:142:0x0387, B:148:0x03b3, B:153:0x03d5, B:155:0x03dc, B:157:0x03e3, B:159:0x03ea, B:161:0x03f1, B:163:0x03f8, B:169:0x040a, B:171:0x0411, B:173:0x0418, B:175:0x041f, B:167:0x0403, B:141:0x0381, B:143:0x03a5, B:145:0x03ab, B:98:0x02ae, B:100:0x02b4, B:103:0x02bc, B:105:0x02c0, B:107:0x02d4, B:109:0x02d8, B:75:0x01f6, B:77:0x0204, B:79:0x020a, B:61:0x01c2), top: B:196:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01da A[Catch: Throwable -> 0x0438, TryCatch #3 {, blocks: (B:179:0x0430, B:180:0x0432, B:188:0x0441, B:4:0x000a, B:6:0x0010, B:8:0x001f, B:9:0x002f, B:10:0x0034, B:12:0x003a, B:13:0x004d, B:15:0x005d, B:17:0x0067, B:150:0x03c1, B:19:0x006d, B:21:0x007b, B:23:0x008d, B:26:0x00ae, B:28:0x00be, B:32:0x00cc, B:43:0x00f8, B:39:0x00ea, B:62:0x01c6, B:64:0x01da, B:66:0x01de, B:67:0x01e0, B:69:0x01e5, B:70:0x01e7, B:71:0x01ec, B:81:0x020f, B:82:0x0226, B:84:0x022c, B:86:0x0235, B:88:0x0243, B:90:0x0262, B:91:0x0275, B:93:0x0287, B:95:0x0296, B:96:0x02a7, B:110:0x02ea, B:116:0x02fc, B:119:0x0305, B:122:0x0311, B:124:0x031f, B:126:0x032c, B:129:0x0333, B:133:0x0340, B:135:0x034c, B:137:0x0366, B:138:0x036b, B:140:0x037a, B:142:0x0387, B:148:0x03b3, B:153:0x03d5, B:155:0x03dc, B:157:0x03e3, B:159:0x03ea, B:161:0x03f1, B:163:0x03f8, B:169:0x040a, B:171:0x0411, B:173:0x0418, B:175:0x041f, B:167:0x0403, B:141:0x0381, B:143:0x03a5, B:145:0x03ab, B:98:0x02ae, B:100:0x02b4, B:103:0x02bc, B:105:0x02c0, B:107:0x02d4, B:109:0x02d8, B:75:0x01f6, B:77:0x0204, B:79:0x020a, B:61:0x01c2), top: B:196:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x020f A[Catch: Throwable -> 0x0438, TryCatch #3 {, blocks: (B:179:0x0430, B:180:0x0432, B:188:0x0441, B:4:0x000a, B:6:0x0010, B:8:0x001f, B:9:0x002f, B:10:0x0034, B:12:0x003a, B:13:0x004d, B:15:0x005d, B:17:0x0067, B:150:0x03c1, B:19:0x006d, B:21:0x007b, B:23:0x008d, B:26:0x00ae, B:28:0x00be, B:32:0x00cc, B:43:0x00f8, B:39:0x00ea, B:62:0x01c6, B:64:0x01da, B:66:0x01de, B:67:0x01e0, B:69:0x01e5, B:70:0x01e7, B:71:0x01ec, B:81:0x020f, B:82:0x0226, B:84:0x022c, B:86:0x0235, B:88:0x0243, B:90:0x0262, B:91:0x0275, B:93:0x0287, B:95:0x0296, B:96:0x02a7, B:110:0x02ea, B:116:0x02fc, B:119:0x0305, B:122:0x0311, B:124:0x031f, B:126:0x032c, B:129:0x0333, B:133:0x0340, B:135:0x034c, B:137:0x0366, B:138:0x036b, B:140:0x037a, B:142:0x0387, B:148:0x03b3, B:153:0x03d5, B:155:0x03dc, B:157:0x03e3, B:159:0x03ea, B:161:0x03f1, B:163:0x03f8, B:169:0x040a, B:171:0x0411, B:173:0x0418, B:175:0x041f, B:167:0x0403, B:141:0x0381, B:143:0x03a5, B:145:0x03ab, B:98:0x02ae, B:100:0x02b4, B:103:0x02bc, B:105:0x02c0, B:107:0x02d4, B:109:0x02d8, B:75:0x01f6, B:77:0x0204, B:79:0x020a, B:61:0x01c2), top: B:196:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0226 A[Catch: Throwable -> 0x0438, TryCatch #3 {, blocks: (B:179:0x0430, B:180:0x0432, B:188:0x0441, B:4:0x000a, B:6:0x0010, B:8:0x001f, B:9:0x002f, B:10:0x0034, B:12:0x003a, B:13:0x004d, B:15:0x005d, B:17:0x0067, B:150:0x03c1, B:19:0x006d, B:21:0x007b, B:23:0x008d, B:26:0x00ae, B:28:0x00be, B:32:0x00cc, B:43:0x00f8, B:39:0x00ea, B:62:0x01c6, B:64:0x01da, B:66:0x01de, B:67:0x01e0, B:69:0x01e5, B:70:0x01e7, B:71:0x01ec, B:81:0x020f, B:82:0x0226, B:84:0x022c, B:86:0x0235, B:88:0x0243, B:90:0x0262, B:91:0x0275, B:93:0x0287, B:95:0x0296, B:96:0x02a7, B:110:0x02ea, B:116:0x02fc, B:119:0x0305, B:122:0x0311, B:124:0x031f, B:126:0x032c, B:129:0x0333, B:133:0x0340, B:135:0x034c, B:137:0x0366, B:138:0x036b, B:140:0x037a, B:142:0x0387, B:148:0x03b3, B:153:0x03d5, B:155:0x03dc, B:157:0x03e3, B:159:0x03ea, B:161:0x03f1, B:163:0x03f8, B:169:0x040a, B:171:0x0411, B:173:0x0418, B:175:0x041f, B:167:0x0403, B:141:0x0381, B:143:0x03a5, B:145:0x03ab, B:98:0x02ae, B:100:0x02b4, B:103:0x02bc, B:105:0x02c0, B:107:0x02d4, B:109:0x02d8, B:75:0x01f6, B:77:0x0204, B:79:0x020a, B:61:0x01c2), top: B:196:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(java.lang.String r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 1102
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.a(java.lang.String, boolean, boolean):void");
    }

    private static void a(Throwable th) {
        try {
            com.uc.crashsdk.a.a.d("DEBUG", a(th.getStackTrace(), (String) null).toString());
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Throwable th, OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.write("[DEBUG] CrashHandler occurred new exception:\n".getBytes("UTF-8"));
                th.printStackTrace(new PrintStream(outputStream));
                outputStream.write("\n\n".getBytes("UTF-8"));
            } catch (Throwable th2) {
                com.uc.crashsdk.a.g.a(th2);
            }
        }
        com.uc.crashsdk.a.g.a(th);
    }

    private static void a(Calendar calendar) {
        if (!g.R()) {
            return;
        }
        long timeInMillis = calendar.getTimeInMillis();
        calendar.add(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        long timeInMillis2 = calendar.getTimeInMillis();
        long j2 = timeInMillis2 - timeInMillis;
        long j3 = 3600000;
        if (j2 <= 3600000) {
            j3 = 1000 + j2;
        }
        com.uc.crashsdk.a.f.a(0, new com.uc.crashsdk.a.e(IFAAFaceManager.STATUS_FACE_NO_FACE, new Object[]{Long.valueOf(timeInMillis2)}), j3 + (e.nextInt(ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT) * 1000));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(boolean z2) {
        File[] listFiles;
        try {
            if (!com.uc.crashsdk.b.z() || (listFiles = new File(g.W()).listFiles()) == null) {
                return;
            }
            int l2 = g.l();
            int m2 = g.m();
            if (listFiles.length < Math.min(l2, m2)) {
                return;
            }
            int i2 = 0;
            int i3 = 0;
            for (File file : listFiles) {
                if (b(file)) {
                    i2++;
                } else {
                    i3++;
                }
            }
            int i4 = (!z2 || i2 < l2) ? 0 : (i2 - l2) + 1;
            int i5 = (z2 || i3 < m2) ? 0 : (i3 - m2) + 1;
            if (i4 == 0 && i5 == 0) {
                return;
            }
            Arrays.sort(listFiles, new b((byte) 0));
            int i6 = i5;
            int i7 = i4;
            for (File file2 : listFiles) {
                boolean b2 = b(file2);
                if (b2 && i7 > 0) {
                    com.uc.crashsdk.a.a.a("crashsdk", "Delete oldest crash log: " + file2.getPath());
                    file2.delete();
                    i7 += -1;
                } else if (!b2 && i6 > 0) {
                    com.uc.crashsdk.a.a.a("crashsdk", "Delete oldest custom log: " + file2.getPath());
                    file2.delete();
                    i6 += -1;
                }
                if (i7 == 0 && i6 == 0) {
                    break;
                }
            }
            f.a(16, i4 + i5);
            if (i4 > 0) {
                f.a(22, i4);
            }
            if (i5 <= 0) {
                return;
            }
            f.a(23, i5);
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
    }

    public static boolean a() {
        if (g == 0) {
            g = 2L;
            if (h(com.uc.crashsdk.b.c("logs")) == 1) {
                g = 1L;
            }
        }
        return g == 1;
    }

    public static boolean a(ParcelFileDescriptor parcelFileDescriptor) {
        String str;
        if (ag) {
            str = "Can not call setHostFd and getHostFd in the same process!";
        } else if (com.uc.crashsdk.b.d) {
            if (af != null) {
                com.uc.crashsdk.a.a.c("crashsdk", "Has already set host fd!");
            }
            af = parcelFileDescriptor;
            int fd = parcelFileDescriptor.getFd();
            int nativeCmd = (int) JNIBridge.nativeCmd(13, fd, null, null);
            ah = nativeCmd != -1;
            return fd == -1 || nativeCmd != -1;
        } else {
            str = "Crash so is not loaded!";
        }
        com.uc.crashsdk.a.a.d("crashsdk", str);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0043 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean a(java.lang.String r18, long r19, java.lang.StringBuffer r21, java.lang.String r22, long r23, java.util.ArrayList<java.lang.String> r25, java.util.ArrayList<java.lang.String> r26, java.util.ArrayList<java.lang.String> r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.a(java.lang.String, long, java.lang.StringBuffer, java.lang.String, long, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.lang.String):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    private static boolean a(String str, com.uc.crashsdk.a.e eVar) {
        boolean z2;
        FileChannel fileChannel;
        Exception e2;
        synchronized (q) {
            ?? file = new File(str);
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (Exception e3) {
                    com.uc.crashsdk.a.g.a(e3);
                }
            }
            FileLock fileLock = null;
            z2 = false;
            try {
            } catch (Throwable th) {
                th = th;
                file = 0;
            }
            try {
                try {
                    fileChannel = new RandomAccessFile((File) file, "rw").getChannel();
                } catch (Exception e4) {
                    try {
                        com.uc.crashsdk.a.g.a(e4);
                        fileChannel = null;
                    } catch (Exception e5) {
                        fileChannel = null;
                        e2 = e5;
                        com.uc.crashsdk.a.g.a(e2);
                        com.uc.crashsdk.a.g.a(fileChannel);
                        return z2;
                    }
                }
                if (fileChannel != null) {
                    try {
                        fileLock = fileChannel.lock();
                    } catch (Exception e6) {
                        try {
                            com.uc.crashsdk.a.g.a(e6);
                        } catch (Exception e7) {
                            e2 = e7;
                            com.uc.crashsdk.a.g.a(e2);
                            com.uc.crashsdk.a.g.a(fileChannel);
                            return z2;
                        }
                    }
                }
                try {
                    z2 = eVar.a();
                    com.uc.crashsdk.a.g.a(fileChannel);
                } finally {
                    if (fileLock != null) {
                        try {
                            fileLock.release();
                        } catch (Exception e8) {
                            com.uc.crashsdk.a.g.a(e8);
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                com.uc.crashsdk.a.g.a((Closeable) file);
                throw th;
            }
        }
        return z2;
    }

    private static boolean a(String str, d dVar) {
        String a2 = com.uc.crashsdk.a.g.a(new File(str), 64, false);
        if (a2 == null) {
            return false;
        }
        try {
            Matcher matcher = Pattern.compile("(\\d+)\\s+(\\d+)\\s+(\\d+)\\s+(\\d+)").matcher(a2);
            if (matcher.find()) {
                long parseLong = Long.parseLong(matcher.group(1));
                if (System.currentTimeMillis() - parseLong < 86400000) {
                    dVar.b = Long.parseLong(matcher.group(2));
                    dVar.c = Integer.parseInt(matcher.group(3));
                    dVar.d = Integer.parseInt(matcher.group(4));
                    dVar.f23757a = parseLong;
                }
            }
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(String str, String str2, boolean z2) {
        if (o(str2)) {
            h.a(str, str2, true, z2);
            com.uc.crashsdk.a.a.b(String.format(Locale.US, "Custom log '%s' has reach max count!", str2));
            return true;
        }
        return false;
    }

    public static boolean a(StringBuffer stringBuffer, String str, long j2, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, String str2) {
        long j3;
        boolean z2;
        boolean a2;
        long j4;
        if (c.get()) {
            com.uc.crashsdk.a.a.b("Processing java crash, skip generate custom log: " + str);
            return false;
        }
        boolean z3 = ah || com.uc.crashsdk.b.M();
        if (!z3 && !com.uc.crashsdk.a.d.e()) {
            com.uc.crashsdk.a.a.c("DEBUG", com.uc.crashsdk.a.d.b());
            return false;
        } else if (!d(str)) {
            com.uc.crashsdk.a.a.d("DEBUG", "custom log sample miss: " + str);
            return false;
        } else if (Z()) {
            com.uc.crashsdk.a.a.b("Processing native crash, skip generate custom log: " + str);
            return false;
        } else if (stringBuffer == null || str == null) {
            return false;
        } else {
            String str3 = g.W() + k(str);
            boolean z4 = (j2 & 32) != 0;
            if (z3) {
                if (com.uc.crashsdk.b.d) {
                    int i2 = z4 ? 1 : 0;
                    int i3 = z4 ? 1 : 0;
                    j4 = JNIBridge.nativeClientCreateConnection(str3, "custom", str, i2);
                } else {
                    j4 = 0;
                }
                if (j4 == 0) {
                    com.uc.crashsdk.a.a.d("DEBUG", "skip custom log: " + str);
                    return false;
                }
                j3 = j4;
            } else if (a(h(), str, z4)) {
                return false;
            } else {
                g.a();
                a(false);
                j3 = 0;
            }
            synchronized (r) {
                long j5 = j3;
                boolean z5 = z4 ? 1 : 0;
                byte b2 = z4 ? 1 : 0;
                z2 = z5;
                a2 = a(str3, j5, stringBuffer, str, j2, arrayList, arrayList2, arrayList3, str2);
            }
            if (a2 && !z3) {
                b(h(), str, z2);
            }
            if (j3 != 0) {
                JNIBridge.nativeClientCloseConnection(j3);
            }
            if (!a2) {
                return false;
            }
            if (!z3) {
                r(str3);
            }
            if (!z3) {
                str3 = a(m(str3));
            }
            b(str3, str);
            if (!z2 || z3) {
                return true;
            }
            try {
                a(true, false);
                return true;
            } catch (Throwable th) {
                com.uc.crashsdk.a.g.a(th);
                return true;
            }
        }
    }

    public static boolean a(boolean z2, boolean z3) {
        if (!d) {
            if (com.uc.crashsdk.b.d) {
                JNIBridge.set(1, true);
            }
            d = true;
        }
        try {
            String k2 = k();
            if (com.uc.crashsdk.a.g.a(k2)) {
                com.uc.crashsdk.a.a.a("crashsdk", "CrashHandler url is empty!");
                return false;
            }
            if (com.uc.crashsdk.a.f.a(z2 ? 1 : 0, new com.uc.crashsdk.a.e(406, new Object[]{k2, Boolean.valueOf(z3), Boolean.valueOf(z2)})) && z2) {
                p.close();
                if (!p.block(3000L)) {
                    com.uc.crashsdk.a.a.a("crashsdk", "timeout to wait for uploading");
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
            return false;
        }
    }

    private static void aa() {
        String X2 = g.X();
        File file = new File(X2);
        if (!file.isDirectory()) {
            return;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length <= 150) {
                return;
            }
            Arrays.sort(listFiles, new b((byte) 0));
            int length = listFiles.length - 150;
            int i2 = length < 0 ? 0 : length;
            long currentTimeMillis = System.currentTimeMillis();
            int i3 = 0;
            int i4 = 0;
            while (i3 < listFiles.length) {
                File file2 = listFiles[i3];
                boolean z2 = i3 < i2;
                if (!z2 && currentTimeMillis - file2.lastModified() >= 432000000) {
                    z2 = true;
                }
                if (!z2) {
                    break;
                }
                file2.delete();
                i4++;
                if (0 >= 3) {
                    break;
                }
                i3++;
            }
            com.uc.crashsdk.a.a.a("Removed " + i4 + " logs in " + X2);
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(OutputStream outputStream, String str, int i2) {
        int i3;
        DataInputStream dataInputStream;
        int i4;
        DataInputStream dataInputStream2 = null;
        try {
            File file = new File(str);
            if (file.exists()) {
                byte[] Q2 = Q();
                if (Q2 == null) {
                    outputStream.write("(alloc buffer failed!)\n".getBytes("UTF-8"));
                    return 0;
                }
                dataInputStream = new DataInputStream(new FileInputStream(file));
                i4 = 0;
                i3 = 0;
                loop0: while (true) {
                    boolean z2 = false;
                    while (true) {
                        try {
                            int read = dataInputStream.read(Q2);
                            if (read == -1) {
                                break loop0;
                            }
                            i4 += read;
                            int i5 = i2 - i3;
                            if (read <= i5 + 32) {
                                i5 = read;
                            }
                            if (i5 > 0 && !z2) {
                                outputStream.write(Q2, 0, i5);
                                i3 += i5;
                            }
                            if (!z2) {
                                if (i5 < read || i3 >= i2) {
                                    z2 = true;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            dataInputStream2 = dataInputStream;
                            try {
                                a(th, outputStream);
                                a(outputStream);
                                return i3;
                            } finally {
                                com.uc.crashsdk.a.g.a(dataInputStream2);
                            }
                        }
                    }
                }
            } else {
                outputStream.write(("file: '" + str + "' not exists!\n").getBytes("UTF-8"));
                dataInputStream = null;
                i4 = 0;
                i3 = 0;
            }
            if (i3 > 0) {
                outputStream.write("\n".getBytes("UTF-8"));
            }
            if (i3 < i4) {
                outputStream.write(String.format(Locale.US, "(truncated %d bytes)\n", Integer.valueOf(i4 - i3)).getBytes("UTF-8"));
            }
            com.uc.crashsdk.a.g.a(dataInputStream);
        } catch (Throwable th2) {
            th = th2;
            i3 = 0;
        }
        a(outputStream);
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long b() {
        if (h == -1) {
            h = h(com.uc.crashsdk.b.c("local"));
        }
        return h;
    }

    private static String b(String str, boolean z2, boolean z3) {
        if (z2) {
            try {
                str = m(str);
            } catch (Throwable th) {
                com.uc.crashsdk.a.g.a(th);
            }
        }
        if (z3) {
            try {
                return a(str);
            } catch (Throwable th2) {
                com.uc.crashsdk.a.g.a(th2);
                return str;
            }
        }
        return str;
    }

    public static void b(int i2) {
        com.uc.crashsdk.a.f.a(0, new com.uc.crashsdk.a.e(IFAAFaceManager.STATUS_FACE_OFFSET_LEFT), i2 * 1000);
    }

    public static void b(Context context) {
        if (!g.K()) {
            return;
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            intentFilter.addAction("android.intent.action.BATTERY_LOW");
            intentFilter.addAction("android.intent.action.BATTERY_OKAY");
            context.registerReceiver(R, intentFilter, null, com.uc.crashsdk.a.f.a(1));
            S = true;
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
    }

    private static void b(a aVar) {
        i = false;
        try {
            aVar.write((s("LOG_END") + "\n").getBytes("UTF-8"));
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
        i = true;
    }

    private static void b(OutputStream outputStream) {
        BufferedReader bufferedReader = null;
        try {
            outputStream.write("logcat:\n".getBytes("UTF-8"));
        } finally {
            try {
                com.uc.crashsdk.a.g.a(bufferedReader);
                a(outputStream);
            } finally {
            }
        }
        if (g.n() <= 0) {
            outputStream.write("[DEBUG] custom java logcat lines count is 0!\n".getBytes("UTF-8"));
            a(outputStream);
            return;
        }
        int n2 = g.n();
        bufferedReader = a(new InputStreamReader(Runtime.getRuntime().exec(new String[]{LogCategory.CATEGORY_LOGCAT, "-d", "-b", "events", "-b", "main", "-v", "threadtime", "-t", String.valueOf(n2)}).getInputStream()));
        if (bufferedReader == null) {
            outputStream.write("[DEBUG] alloc buffer failed!\n".getBytes("UTF-8"));
            a(outputStream);
            return;
        }
        i = false;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            i2++;
            if (i3 < n2 && !readLine.contains(" I auditd ") && !readLine.contains(" I liblog ")) {
                outputStream.write(readLine.getBytes("UTF-8"));
                outputStream.write("\n".getBytes("UTF-8"));
                i3++;
            }
        }
        outputStream.write(String.format(Locale.US, "[DEBUG] Read %d lines, wrote %d lines.\n", Integer.valueOf(i2), Integer.valueOf(i3)).getBytes("UTF-8"));
        i = true;
        com.uc.crashsdk.a.g.a(bufferedReader);
        a(outputStream);
    }

    private static void b(OutputStream outputStream, String str, String str2) {
        String str3;
        try {
            outputStream.write("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***\n".getBytes("UTF-8"));
        } catch (Throwable th) {
            a(th, outputStream);
        }
        try {
            outputStream.write(String.format(Locale.US, "Basic Information: 'pid: %d/tid: %d/time: %s'\n", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()), n()).getBytes("UTF-8"));
            Locale locale = Locale.US;
            Object[] objArr = new Object[3];
            objArr[0] = e();
            if (com.uc.crashsdk.a.g.a(m)) {
                S();
            }
            objArr[1] = m;
            objArr[2] = f();
            outputStream.write(String.format(locale, "Cpu Information: 'abi: %s/processor: %s/hardware: %s'\n", objArr).getBytes("UTF-8"));
        } catch (Throwable th2) {
            a(th2, outputStream);
        }
        try {
            outputStream.write(String.format(Locale.US, "Mobile Information: 'model: %s/version: %s/sdk: %d'\n", Build.MODEL, Build.VERSION.RELEASE, Integer.valueOf(Build.VERSION.SDK_INT)).getBytes("UTF-8"));
            outputStream.write(("Build fingerprint: '" + Build.FINGERPRINT + "'\n").getBytes("UTF-8"));
            Locale locale2 = Locale.US;
            Object[] objArr2 = new Object[4];
            objArr2[0] = a(new Date(b));
            objArr2[1] = Long.valueOf(Runtime.getRuntime().maxMemory());
            objArr2[2] = com.uc.crashsdk.a.g.d();
            objArr2[3] = com.uc.crashsdk.b.C() ? "fg" : "bg";
            outputStream.write(String.format(locale2, "Runtime Information: 'start: %s/maxheap: %s/primaryabi: %s/ground: %s'\n", objArr2).getBytes("UTF-8"));
        } catch (Throwable th3) {
            a(th3, outputStream);
        }
        try {
            outputStream.write(String.format(Locale.US, "Application Information: 'version: %s/subversion: %s/buildseq: %s/versioncode: %d'\n", g.S(), g.T(), g.U(), Integer.valueOf(com.uc.crashsdk.a.c())).getBytes("UTF-8"));
            String str4 = "0";
            String str5 = "";
            if (com.uc.crashsdk.b.d) {
                String nativeGet = JNIBridge.nativeGet(1, 0L, null);
                str3 = JNIBridge.nativeGet(2, 0L, null);
                str4 = nativeGet;
            } else {
                str3 = str5;
            }
            outputStream.write(String.format(Locale.US, "CrashSDK Information: 'version: %s/nativeseq: %s/javaseq: %s/arch: %s/target: %s'\n", "3.5.2.1", str4, "230821205034", str3, "release").getBytes("UTF-8"));
            if (str != null) {
                str5 = str;
            }
            outputStream.write(("Report Name: " + str5.substring(str5.lastIndexOf(47) + 1) + "\n").getBytes("UTF-8"));
        } catch (Throwable th4) {
            a(th4, outputStream);
        }
        try {
            outputStream.write(String.format("UUID: %s\n", ah ? s(TransportConstants.KEY_UUID) : C).getBytes("UTF-8"));
            outputStream.write(("Log Type: " + str2 + "\n").getBytes("UTF-8"));
        } catch (Throwable th5) {
            a(th5, outputStream);
        }
        try {
            String F2 = com.uc.crashsdk.b.F();
            if (com.uc.crashsdk.a.g.a(F2)) {
                F2 = "(none)";
            }
            outputStream.write(("Activity: " + F2 + "\n").getBytes("UTF-8"));
        } catch (Throwable th6) {
            a(th6, outputStream);
        }
        a(outputStream);
        try {
            com.uc.crashsdk.a.a(outputStream, "UTF-8");
            if (ah) {
                i = false;
                outputStream.write(s(MtopParamType.HEADER).getBytes("UTF-8"));
                i = true;
            }
        } catch (Throwable th7) {
            a(th7, outputStream);
        }
        a(outputStream);
    }

    public static void b(String str) {
        synchronized (z) {
            y = str;
            com.uc.crashsdk.a.b.a(com.uc.crashsdk.b.i(), str + "\n");
        }
    }

    private static void b(String str, String str2) {
        try {
            com.uc.crashsdk.d.a(str, h(), str2);
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(String str, String str2, boolean z2) {
        h.a(str, str2, false, z2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(boolean z2) {
        try {
            boolean z3 = g.r() && com.uc.crashsdk.b.G() && !d;
            if (!z3) {
                z3 = g.s();
            }
            if (!z3) {
                return;
            }
            if (!z2) {
                a(true, false);
                return;
            }
            String k2 = k();
            if (com.uc.crashsdk.a.g.a(k2)) {
                return;
            }
            j();
            a(k2, false, false);
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
    }

    public static boolean b(int i2, Object[] objArr) {
        if (i2 == 451) {
            if (!f23755a && objArr == null) {
                throw new AssertionError();
            }
            return a((String) objArr[0], (d) objArr[1]);
        } else if (i2 != 452) {
            if (!f23755a) {
                throw new AssertionError();
            }
            return false;
        } else if (!f23755a && objArr == null) {
            throw new AssertionError();
        } else {
            d dVar = (d) objArr[1];
            return com.uc.crashsdk.a.g.a(new File((String) objArr[0]), String.format(Locale.US, "%d %d %d %d", Long.valueOf(dVar.f23757a), Long.valueOf(dVar.b), Integer.valueOf(dVar.c), Integer.valueOf(dVar.d)).getBytes());
        }
    }

    private static boolean b(File file) {
        int indexOf;
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(95);
        if (lastIndexOf > 0 && (indexOf = name.indexOf(46, lastIndexOf)) > 0) {
            String substring = name.substring(lastIndexOf + 1, indexOf);
            return "java".equals(substring) || "ucebujava".equals(substring) || LogType.NATIVE_TYPE.equals(substring) || "ucebujni".equals(substring) || LogType.UNEXP_TYPE.equals(substring) || "anr".equals(substring);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c() {
        j = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006e A[Catch: Throwable -> 0x0080, TryCatch #1 {Throwable -> 0x0080, blocks: (B:24:0x004d, B:26:0x0065, B:28:0x006b, B:30:0x006e, B:32:0x0076), top: B:40:0x004d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(java.io.OutputStream r7) {
        /*
            java.lang.String r0 = "UTF-8"
            java.lang.String r1 = "disk info:\n"
            byte[] r1 = r1.getBytes(r0)     // Catch: java.lang.Throwable -> Lc
            r7.write(r1)     // Catch: java.lang.Throwable -> Lc
            goto L10
        Lc:
            r1 = move-exception
            a(r1, r7)
        L10:
            boolean r1 = com.uc.crashsdk.e.ah
            r2 = 0
            if (r1 == 0) goto L2d
            com.uc.crashsdk.e.i = r2
            java.lang.String r1 = "FSSTAT"
            java.lang.String r1 = s(r1)     // Catch: java.lang.Throwable -> L25
            byte[] r0 = r1.getBytes(r0)     // Catch: java.lang.Throwable -> L25
            r7.write(r0)     // Catch: java.lang.Throwable -> L25
            goto L29
        L25:
            r0 = move-exception
            a(r0, r7)
        L29:
            r0 = 1
            com.uc.crashsdk.e.i = r0
            goto L84
        L2d:
            r0 = 0
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> L46
            r1.<init>()     // Catch: java.lang.Throwable -> L46
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = com.uc.crashsdk.a.g.b()     // Catch: java.lang.Throwable -> L44
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L44
            java.lang.String r0 = a(r0)     // Catch: java.lang.Throwable -> L44
            a(r7, r0, r1)     // Catch: java.lang.Throwable -> L44
            goto L4d
        L44:
            r0 = move-exception
            goto L4a
        L46:
            r1 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
        L4a:
            a(r0, r7)
        L4d:
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Throwable -> L80
            java.lang.String r0 = a(r0)     // Catch: java.lang.Throwable -> L80
            a(r7, r0, r1)     // Catch: java.lang.Throwable -> L80
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L80
            java.lang.String r3 = "/storage"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L80
            boolean r3 = r0.exists()     // Catch: java.lang.Throwable -> L80
            if (r3 == 0) goto L84
            java.io.File[] r0 = r0.listFiles()     // Catch: java.lang.Throwable -> L80
            if (r0 == 0) goto L84
            int r3 = r0.length     // Catch: java.lang.Throwable -> L80
        L6c:
            if (r2 >= r3) goto L84
            r4 = r0[r2]     // Catch: java.lang.Throwable -> L80
            boolean r5 = r4.isDirectory()     // Catch: java.lang.Throwable -> L80
            if (r5 == 0) goto L7d
            java.lang.String r4 = a(r4)     // Catch: java.lang.Throwable -> L80
            a(r7, r4, r1)     // Catch: java.lang.Throwable -> L80
        L7d:
            int r2 = r2 + 1
            goto L6c
        L80:
            r0 = move-exception
            a(r0, r7)
        L84:
            a(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.c(java.io.OutputStream):void");
    }

    public static void c(String str) {
        synchronized (A) {
            String l2 = com.uc.crashsdk.b.l();
            com.uc.crashsdk.a.b.a(l2, str + "\n");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(boolean z2) {
        boolean z3 = true;
        if (!S ? !z2 || !g.K() : z2 && g.K()) {
            z3 = false;
        }
        if (z3) {
            if (com.uc.crashsdk.a.f.b(T)) {
                com.uc.crashsdk.a.f.a(T);
            }
            com.uc.crashsdk.a.f.a(0, T, 3000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String d() {
        String str = j;
        if (str != null) {
            return str;
        }
        String j2 = j(null);
        j = j2;
        return j2;
    }

    private static void d(OutputStream outputStream) {
        if (com.uc.crashsdk.b.d) {
            String o2 = com.uc.crashsdk.b.o();
            i = false;
            if (1 == JNIBridge.cmd(17, o2)) {
                File file = new File(o2);
                try {
                    byte[] e2 = com.uc.crashsdk.a.g.e(file);
                    if (e2 != null) {
                        outputStream.write(e2);
                    }
                } catch (Throwable th) {
                    a(th, outputStream);
                }
                try {
                    file.delete();
                } catch (Throwable th2) {
                    a(th2, outputStream);
                }
                i = true;
                a(outputStream);
            }
            i = true;
            return;
        }
        File[] fileArr = null;
        int i2 = 900;
        try {
            i2 = g.H();
            fileArr = new File("/proc/self/fd").listFiles();
            if (fileArr != null) {
                outputStream.write(String.format(Locale.US, "opened file count: %d, write limit: %d.\n", Integer.valueOf(fileArr.length), Integer.valueOf(i2)).getBytes("UTF-8"));
            } else {
                outputStream.write("[DEBUG] listFiles failed!\n".getBytes("UTF-8"));
            }
        } catch (Throwable th3) {
            a(th3, outputStream);
        }
        if (fileArr != null) {
            try {
                if (fileArr.length >= i2) {
                    outputStream.write("opened files:\n".getBytes("UTF-8"));
                    StringBuilder sb = new StringBuilder();
                    for (File file2 : fileArr) {
                        sb.append(file2.getName());
                        sb.append(" -> ");
                        sb.append(file2.getCanonicalPath());
                        sb.append("\n");
                    }
                    outputStream.write(sb.toString().getBytes("UTF-8"));
                }
            } catch (Throwable th4) {
                a(th4, outputStream);
            }
        }
        a(outputStream);
    }

    public static void d(boolean z2) {
        f.d(false);
        if (z2) {
            f.a(com.uc.crashsdk.b.c(), false);
        } else {
            f.a();
        }
        h.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(Context context) {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        boolean z2 = false;
        if (activityManager == null || (processesInErrorState = activityManager.getProcessesInErrorState()) == null) {
            return false;
        }
        int myPid = Process.myPid();
        Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ActivityManager.ProcessErrorStateInfo next = it.next();
            if (next.pid == myPid) {
                P = true;
                if (N()) {
                    com.uc.crashsdk.a.a.d("crashsdk", "ANR occurred in process: " + next.processName);
                }
                if (com.uc.crashsdk.b.d) {
                    JNIBridge.set(130, next.longMsg);
                }
                z2 = true;
            }
        }
        if (!z2 && com.uc.crashsdk.b.d) {
            V();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(String str) {
        if (ah) {
            return true;
        }
        try {
            return p(str);
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
            return true;
        }
    }

    public static int e(boolean z2) {
        return f.a(z2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:30|(2:31|32)|33|34|35|(1:39)|40|(1:44)|46|47) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0144, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0145, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae A[Catch: Throwable -> 0x00d4, TRY_LEAVE, TryCatch #3 {Throwable -> 0x00d4, blocks: (B:35:0x0094, B:37:0x00ae), top: B:70:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e1 A[Catch: Throwable -> 0x0144, TryCatch #2 {Throwable -> 0x0144, blocks: (B:47:0x00db, B:49:0x00e1, B:51:0x00e9, B:52:0x010f, B:54:0x0115, B:56:0x011d), top: B:68:0x00db }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0115 A[Catch: Throwable -> 0x0144, TryCatch #2 {Throwable -> 0x0144, blocks: (B:47:0x00db, B:49:0x00e1, B:51:0x00e9, B:52:0x010f, B:54:0x0115, B:56:0x011d), top: B:68:0x00db }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String e() {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.e():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(java.io.OutputStream r12) {
        /*
            java.lang.String r0 = "UTF-8"
            r1 = 0
            r2 = 0
            int r3 = com.uc.crashsdk.g.I()     // Catch: java.lang.Throwable -> L1c
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L1a
            java.lang.String r5 = "/proc/self/task"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L1a
            java.io.File[] r2 = r4.listFiles()     // Catch: java.lang.Throwable -> L1a
            if (r2 != 0) goto L16
            return
        L16:
            int r4 = r2.length     // Catch: java.lang.Throwable -> L1a
            if (r4 >= r3) goto L23
            return
        L1a:
            r4 = move-exception
            goto L1f
        L1c:
            r4 = move-exception
            r3 = 300(0x12c, float:4.2E-43)
        L1f:
            com.uc.crashsdk.a.g.a(r4)
            r4 = 0
        L23:
            if (r2 != 0) goto L26
            return
        L26:
            java.lang.String r5 = "threads info:\n"
            byte[] r5 = r5.getBytes(r0)     // Catch: java.lang.Throwable -> L90
            r12.write(r5)     // Catch: java.lang.Throwable -> L90
            java.util.Locale r5 = java.util.Locale.US     // Catch: java.lang.Throwable -> L90
            java.lang.String r6 = "threads count: %d, dump limit: %d.\n"
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L90
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L90
            r8[r1] = r4     // Catch: java.lang.Throwable -> L90
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L90
            r4 = 1
            r8[r4] = r3     // Catch: java.lang.Throwable -> L90
            java.lang.String r3 = java.lang.String.format(r5, r6, r8)     // Catch: java.lang.Throwable -> L90
            byte[] r3 = r3.getBytes(r0)     // Catch: java.lang.Throwable -> L90
            r12.write(r3)     // Catch: java.lang.Throwable -> L90
            java.lang.String r3 = " tid     name\n"
            byte[] r3 = r3.getBytes(r0)     // Catch: java.lang.Throwable -> L90
            r12.write(r3)     // Catch: java.lang.Throwable -> L90
            int r3 = r2.length     // Catch: java.lang.Throwable -> L90
            r5 = 0
        L5b:
            if (r5 >= r3) goto L94
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L90
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> L90
            java.lang.String r9 = r6.getPath()     // Catch: java.lang.Throwable -> L90
            java.lang.String r10 = "comm"
            r8.<init>(r9, r10)     // Catch: java.lang.Throwable -> L90
            r9 = 128(0x80, float:1.794E-43)
            java.lang.String r8 = com.uc.crashsdk.a.g.a(r8, r9, r1)     // Catch: java.lang.Throwable -> L90
            java.lang.String r8 = l(r8)     // Catch: java.lang.Throwable -> L90
            java.util.Locale r9 = java.util.Locale.US     // Catch: java.lang.Throwable -> L90
            java.lang.String r10 = "%5s %s\n"
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L90
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L90
            r11[r1] = r6     // Catch: java.lang.Throwable -> L90
            r11[r4] = r8     // Catch: java.lang.Throwable -> L90
            java.lang.String r6 = java.lang.String.format(r9, r10, r11)     // Catch: java.lang.Throwable -> L90
            byte[] r6 = r6.getBytes(r0)     // Catch: java.lang.Throwable -> L90
            r12.write(r6)     // Catch: java.lang.Throwable -> L90
            int r5 = r5 + 1
            goto L5b
        L90:
            r0 = move-exception
            a(r0, r12)
        L94:
            a(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.e(java.io.OutputStream):void");
    }

    public static boolean e(String str) {
        try {
            if (!com.uc.crashsdk.a.g.b(str) || !str.startsWith("lib") || !str.endsWith(bgy.SO_EXTENSION)) {
                return false;
            }
            System.loadLibrary(str.substring(3, str.length() - 3));
            return true;
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
            return false;
        }
    }

    public static int f(boolean z2) {
        int b2 = z2 ? f.a(com.uc.crashsdk.b.c()) ? 1 : 0 : f.b();
        int b3 = f.b(z2);
        return b3 > b2 ? b3 : b2;
    }

    public static String f() {
        if (com.uc.crashsdk.a.g.a(l)) {
            S();
        }
        return l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static StringBuilder f(String str) {
        return a(Thread.currentThread().getStackTrace(), str);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    private static void f(java.io.OutputStream r11) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.f(java.io.OutputStream):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String g() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("JavaMax:    ");
            sb.append(Runtime.getRuntime().maxMemory() / 1024);
            sb.append(" kB\n");
            sb.append("JavaTotal:  ");
            sb.append(Runtime.getRuntime().totalMemory() / 1024);
            sb.append(" kB\n");
            sb.append("JavaFree:   ");
            sb.append(Runtime.getRuntime().freeMemory() / 1024);
            sb.append(" kB\n");
            sb.append("NativeHeap: ");
            sb.append(Debug.getNativeHeapSize() / 1024);
            sb.append(" kB\n");
            sb.append("NativeAllocated: ");
            sb.append(Debug.getNativeHeapAllocatedSize() / 1024);
            sb.append(" kB\n");
            sb.append("NativeFree: ");
            sb.append(Debug.getNativeHeapFreeSize() / 1024);
            sb.append(" kB\n");
            ActivityManager activityManager = (ActivityManager) com.uc.crashsdk.a.g.a().getSystemService("activity");
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                sb.append("availMem:   ");
                sb.append(memoryInfo.availMem / 1024);
                sb.append(" kB\n");
                sb.append("threshold:  ");
                sb.append(memoryInfo.threshold / 1024);
                sb.append(" kB\n");
                sb.append("lowMemory:  ");
                sb.append(memoryInfo.lowMemory);
                sb.append("\n");
            }
            return sb.toString();
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
            return "";
        }
    }

    private static void g(OutputStream outputStream) {
        try {
            outputStream.write("recent status:\n".getBytes("UTF-8"));
        } catch (Throwable th) {
            a(th, outputStream);
        }
        try {
            outputStream.write(String.format(Locale.US, "last version: '%s'\n", ah ? s("LASTVER") : com.uc.crashsdk.a.m()).getBytes("UTF-8"));
        } catch (Throwable th2) {
            a(th2, outputStream);
        }
        try {
            synchronized (t) {
                if (v != null) {
                    outputStream.write(String.format(Locale.US, "generating log: %s\n", v).getBytes("UTF-8"));
                }
                if (u > 0 || t.size() > 0) {
                    outputStream.write(String.format(Locale.US, "generated %d logs, recent are:\n", Integer.valueOf(u)).getBytes("UTF-8"));
                    Iterator<String> it = t.iterator();
                    while (it.hasNext()) {
                        outputStream.write(String.format(Locale.US, "* %s\n", it.next()).getBytes("UTF-8"));
                    }
                }
            }
            outputStream.write(String.format(Locale.US, "dumping all threads: %s\n", Boolean.valueOf(w)).getBytes("UTF-8"));
            if (x != null) {
                outputStream.write(String.format(Locale.US, "dumping threads: %s\n", x).getBytes("UTF-8"));
            }
        } catch (Throwable th3) {
            a(th3, outputStream);
        }
        a(outputStream);
    }

    private static long h(String str) {
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("getLong", String.class, Long.TYPE);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                return ((Long) declaredMethod.invoke(null, str, 0L)).longValue();
            }
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
        return 0L;
    }

    public static String h() {
        String str = n;
        if (str != null) {
            return str;
        }
        String a2 = a(Process.myPid());
        n = a2;
        return a2;
    }

    private static String i(String str) {
        try {
            return str.replaceAll("[^0-9a-zA-Z-.]", "-");
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean i() {
        return d;
    }

    private static String j(String str) {
        if (str == null) {
            str = String.valueOf(System.currentTimeMillis()) + new Random().nextInt(65536);
        }
        return String.format(Locale.US, "%s%s_%s_%s_%s_%s_", O(), g.S(), g.U(), i(Build.MODEL), i(Build.VERSION.RELEASE), str);
    }

    public static void j() {
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(StrictMode.getThreadPolicy()).permitNetwork().build());
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
    }

    public static String k() {
        String str = y;
        if (com.uc.crashsdk.a.g.a(str)) {
            synchronized (z) {
                str = com.uc.crashsdk.a.g.a(com.uc.crashsdk.b.i(), g.Q() == 1 ? "https://px.wpk.quark.cn/upload" : g.P() ? "https://up4-intl.ucweb.com/upload" : "https://up4.ucweb.com/upload", true);
                y = str;
            }
        }
        return str;
    }

    private static String k(String str) {
        return String.format(Locale.US, "%s%s_%s_%s.log", d(), n(), P(), str);
    }

    private static String l(String str) {
        if (com.uc.crashsdk.a.g.b(str)) {
            int indexOf = str.indexOf(0);
            if (indexOf >= 0) {
                str = str.substring(0, indexOf);
            }
            return str.trim();
        }
        return "";
    }

    public static void l() {
        synchronized (z) {
            y = null;
        }
    }

    private static String m(String str) {
        String a2 = com.uc.crashsdk.a.b.a(str, g.w(), g.v());
        if (!str.equals(a2)) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        }
        return a2;
    }

    public static void m() {
        if (ah) {
            return;
        }
        com.uc.crashsdk.a.f.a(1, new com.uc.crashsdk.a.e(IFAAFaceManager.STATUS_FACE_OFFSET_RIGHT), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String n() {
        return a(new Date());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
        if (r7.endsWith(r3) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
        if (r7.indexOf(".log", r7.lastIndexOf(95)) != r7.lastIndexOf(".log")) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean[] n(java.lang.String r7) {
        /*
            boolean r0 = com.uc.crashsdk.g.v()
            boolean r1 = com.uc.crashsdk.g.x()
            r2 = 0
            if (r0 != 0) goto Ld
            if (r1 == 0) goto L6d
        Ld:
            java.lang.String r3 = ".tmp"
            boolean r3 = r7.endsWith(r3)
            if (r3 != 0) goto L6b
            java.lang.String r3 = ".ec"
            boolean r3 = r7.contains(r3)
            if (r3 == 0) goto L1e
            goto L6b
        L1e:
            char r3 = java.io.File.separatorChar
            int r3 = r7.lastIndexOf(r3)
            if (r3 >= 0) goto L27
            r3 = 0
        L27:
            r4 = 0
        L28:
            r5 = 95
            int r3 = r7.indexOf(r5, r3)
            if (r3 < 0) goto L34
            int r4 = r4 + 1
            int r3 = r3 + 1
        L34:
            if (r3 >= 0) goto L28
            r3 = 8
            if (r4 == r3) goto L3b
            goto L6b
        L3b:
            java.lang.String r3 = com.uc.crashsdk.g.w()
            java.lang.String r4 = ".log"
            boolean r6 = r7.endsWith(r4)
            if (r6 != 0) goto L54
            boolean r0 = com.uc.crashsdk.a.g.a(r3)
            if (r0 != 0) goto L6b
            boolean r7 = r7.endsWith(r3)
            if (r7 != 0) goto L5a
            goto L6b
        L54:
            boolean r3 = com.uc.crashsdk.a.g.a(r3)
            if (r3 == 0) goto L5c
        L5a:
            r0 = 0
            goto L6d
        L5c:
            int r3 = r7.lastIndexOf(r5)
            int r3 = r7.indexOf(r4, r3)
            int r7 = r7.lastIndexOf(r4)
            if (r3 == r7) goto L6d
            goto L5a
        L6b:
            r0 = 0
            r1 = 0
        L6d:
            r7 = 2
            boolean[] r7 = new boolean[r7]
            r7[r2] = r0
            r0 = 1
            r7[r0] = r1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.n(java.lang.String):boolean[]");
    }

    public static void o() {
        b = System.currentTimeMillis();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:3|4|(3:6|(3:9|(1:11)(17:12|13|14|(13:48|49|18|(1:47)(1:21)|22|(1:24)|25|26|27|29|30|31|32)(1:16)|17|18|(0)|47|22|(0)|25|26|27|29|30|31|32)|7)|53)|54|(0)|25|26|27|29|30|31|32) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:(3:6|(3:9|(1:11)(17:12|13|14|(13:48|49|18|(1:47)(1:21)|22|(1:24)|25|26|27|29|30|31|32)(1:16)|17|18|(0)|47|22|(0)|25|26|27|29|30|31|32)|7)|53)|26|27|29|30|31|32) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d9, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00da, code lost:
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dc, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00dd, code lost:
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e1, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e2, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e5, code lost:
        com.uc.crashsdk.a.g.a(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ea, code lost:
        com.uc.crashsdk.a.g.a(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ed, code lost:
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae A[Catch: all -> 0x00ee, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0005, B:6:0x0033, B:7:0x0041, B:9:0x0047, B:11:0x0051, B:12:0x0056, B:15:0x0068, B:21:0x0078, B:26:0x0083, B:29:0x00ae, B:33:0x00d5, B:44:0x00e8, B:46:0x00ea, B:47:0x00ed, B:43:0x00e5, B:18:0x0072), top: B:51:0x0005, inners: #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean o(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.o(java.lang.String):boolean");
    }

    public static void p() {
        if (!com.uc.crashsdk.a.g.a(C)) {
            return;
        }
        String str = null;
        try {
            File file = new File(g.V() + "unique");
            if (file.exists()) {
                String a2 = com.uc.crashsdk.a.g.a(file, 48, false);
                if (a2 != null) {
                    try {
                        try {
                            if (a2.length() == 36) {
                                str = a2.replaceAll("[^0-9a-zA-Z-]", "-");
                            }
                        } catch (Exception e2) {
                            com.uc.crashsdk.a.g.a(e2);
                        }
                    } catch (Throwable th) {
                        th = th;
                        str = a2;
                        com.uc.crashsdk.a.g.a(th);
                        C = str;
                    }
                }
                str = a2;
            }
            if (com.uc.crashsdk.a.g.a(str)) {
                com.uc.crashsdk.b.H();
                str = UUID.randomUUID().toString();
                if (!com.uc.crashsdk.a.g.a(str)) {
                    com.uc.crashsdk.a.g.a(file, str.getBytes());
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
        C = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6 A[Catch: all -> 0x010e, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0008, B:7:0x0018, B:9:0x0023, B:10:0x002d, B:38:0x00b6, B:49:0x00db, B:56:0x00f6, B:52:0x00e6, B:67:0x010c, B:63:0x0101, B:11:0x0033, B:13:0x003b, B:14:0x0044, B:16:0x004d, B:18:0x0056, B:20:0x005e, B:26:0x006d, B:28:0x0077, B:30:0x0084, B:32:0x008f, B:33:0x009b, B:35:0x00a6), top: B:72:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6 A[Catch: all -> 0x010e, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0008, B:7:0x0018, B:9:0x0023, B:10:0x002d, B:38:0x00b6, B:49:0x00db, B:56:0x00f6, B:52:0x00e6, B:67:0x010c, B:63:0x0101, B:11:0x0033, B:13:0x003b, B:14:0x0044, B:16:0x004d, B:18:0x0056, B:20:0x005e, B:26:0x006d, B:28:0x0077, B:30:0x0084, B:32:0x008f, B:33:0x009b, B:35:0x00a6), top: B:72:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean p(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.p(java.lang.String):boolean");
    }

    public static String q() {
        return C;
    }

    private static Map<String, Integer> q(String str) {
        HashMap hashMap = new HashMap();
        for (String str2 : str.split(SymbolExpUtil.SYMBOL_VERTICALBAR, 30)) {
            String[] split = str2.split(":", 3);
            if (split.length == 2) {
                String trim = split[0].trim();
                if (!com.uc.crashsdk.a.g.a(trim)) {
                    int i2 = 1;
                    try {
                        i2 = Integer.parseInt(split[1].trim(), 10);
                    } catch (Throwable th) {
                        com.uc.crashsdk.a.g.a(th);
                    }
                    hashMap.put(trim, Integer.valueOf(i2));
                }
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void r() {
        P = false;
        if (!com.uc.crashsdk.b.C()) {
            com.uc.crashsdk.a.f.a(3, new com.uc.crashsdk.a.e(416), 23000L);
        }
        if (U()) {
            return;
        }
        O = 0;
        W();
    }

    private static void r(String str) {
        if (!g.q()) {
            return;
        }
        try {
            aa();
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
        if (str == null || "".equals(str)) {
            return;
        }
        try {
            File file = new File(g.X());
            if (!file.exists()) {
                file.mkdirs();
            }
            com.uc.crashsdk.a.a.a("crashsdk", "copy log to: " + file);
            com.uc.crashsdk.a.g.a(new File(str), file);
        } catch (Throwable th2) {
            com.uc.crashsdk.a.g.a(th2);
        }
    }

    private static String s(String str) {
        return String.format("$^%s^$", str);
    }

    public static void s() {
        U = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new e());
    }

    public static void t() {
        Thread.setDefaultUncaughtExceptionHandler(U);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean u() {
        return c.get() || Z();
    }

    public static Throwable v() {
        return V;
    }

    public static int w() {
        if (com.uc.crashsdk.b.J() == 5) {
            return aa;
        }
        return 100;
    }

    public static void x() {
        long o2 = g.o();
        if (o2 < 0) {
            return;
        }
        boolean z2 = com.uc.crashsdk.b.J() == 5;
        com.uc.crashsdk.a.f.a(0, new com.uc.crashsdk.a.e(401));
        if (!z2) {
            return;
        }
        Y = new com.uc.crashsdk.a.e(402);
        com.uc.crashsdk.a.f.a(0, Y, o2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void y() {
        if (!com.uc.crashsdk.b.c || !com.uc.crashsdk.a.c || com.uc.crashsdk.a.f.b(ab)) {
            return;
        }
        com.uc.crashsdk.a.f.a(0, ab, 1000L);
    }

    public static boolean z() {
        synchronized (Z) {
            if (Y == null || X) {
                return false;
            }
            com.uc.crashsdk.a.f.a(Y);
            Y = null;
            return true;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:(1:371)|(3:403|404|(16:407|408|409|410|(1:376)|377|378|379|380|(1:382)|383|(1:387)|388|(1:391)|393|(2:395|396)(1:397)))|373|(1:376)|377|378|379|380|(0)|383|(2:385|387)|388|(1:391)|393|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:145|(3:177|178|(16:181|182|183|184|(1:150)|151|152|153|154|(1:156)|157|(1:161)|162|(1:165)|167|(2:169|170)(1:171)))|147|(1:150)|151|152|153|154|(0)|157|(2:159|161)|162|(1:165)|167|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:194|(3:226|227|(16:230|231|232|233|(1:199)|200|201|202|203|(1:205)|206|(1:210)|211|(1:214)|216|(2:218|219)(1:220)))|196|(1:199)|200|201|202|203|(0)|206|(2:208|210)|211|(1:214)|216|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:71|(3:103|104|(15:107|108|109|(1:76)|77|78|80|81|(1:83)|84|(1:88)|89|(1:92)|94|(2:96|97)(1:98)))|73|(1:76)|77|78|80|81|(0)|84|(2:86|88)|89|(1:92)|94|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:316|(1:320)|(3:352|353|(16:356|357|358|359|(1:325)|326|327|328|329|(1:331)|332|(1:336)|337|(1:340)|342|(2:344|345)(1:346)))|322|(1:325)|326|327|328|329|(0)|332|(2:334|336)|337|(1:340)|342|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(18:11|(5:14|15|16|(1:18)|12)|66|19|(3:52|53|(15:56|57|58|(1:24)|25|26|28|29|(1:31)|32|(1:36)|37|(1:40)|42|(2:44|45)(1:47)))|21|(1:24)|25|26|28|29|(0)|32|(2:34|36)|37|(1:40)|42|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(20:478|479|480|(1:484)|(3:516|517|(18:520|521|522|523|(0)|515|490|491|492|493|(0)|496|(2:498|500)|501|(1:504)|506|(0)|509))|486|(0)|515|490|491|492|493|(0)|496|(0)|501|(0)|506|(0)|509) */
    /* JADX WARN: Can't wrap try/catch for region: R(21:420|421|422|(1:424)|426|(1:430)|(3:463|464|(17:467|468|469|470|(0)|462|436|437|438|439|(0)|442|(2:444|446)|447|(1:450)|452|(0)(0)))|432|(0)|462|436|437|438|439|(0)|442|(0)|447|(0)|452|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0139, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x013a, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x022d, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x022e, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0267, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0268, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x02ad, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x02ae, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x02e7, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x02e8, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0351, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0352, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x038b, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x038c, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x03d0, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x03d1, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x040a, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x040b, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0592, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0593, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x05cc, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x05cd, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007d, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x0619, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x061a, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0653, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x0654, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b6, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b7, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00ff, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0100, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01d7 A[Catch: Throwable -> 0x01ee, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Throwable -> 0x0527, blocks: (B:148:0x0205, B:188:0x027c, B:190:0x0282, B:232:0x0302, B:233:0x0308, B:235:0x030c, B:143:0x01f2, B:132:0x01d7, B:139:0x01ea), top: B:498:0x01d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0224 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x024e A[Catch: Throwable -> 0x0267, TryCatch #7 {Throwable -> 0x0267, blocks: (B:169:0x0232, B:172:0x023d, B:174:0x024e, B:176:0x0252, B:177:0x0257, B:180:0x025f), top: B:496:0x0232 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x025d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02ce A[Catch: Throwable -> 0x02e7, TryCatch #6 {Throwable -> 0x02e7, blocks: (B:211:0x02b2, B:214:0x02bd, B:216:0x02ce, B:218:0x02d2, B:219:0x02d7, B:222:0x02df), top: B:494:0x02b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02dd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0348 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0372 A[Catch: Throwable -> 0x038b, TryCatch #11 {Throwable -> 0x038b, blocks: (B:265:0x0356, B:268:0x0361, B:270:0x0372, B:272:0x0376, B:273:0x037b, B:276:0x0383), top: B:504:0x0356 }] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0381 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x03c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x03f1 A[Catch: Throwable -> 0x040a, TryCatch #12 {Throwable -> 0x040a, blocks: (B:309:0x03d5, B:312:0x03e0, B:314:0x03f1, B:316:0x03f5, B:317:0x03fa, B:320:0x0402), top: B:506:0x03d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0400 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0450 A[Catch: Throwable -> 0x0525, TryCatch #44 {Throwable -> 0x0525, blocks: (B:328:0x041f, B:331:0x0432, B:333:0x0438, B:335:0x0450, B:336:0x0453, B:342:0x0483, B:240:0x031a, B:337:0x047a), top: B:498:0x01d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x04ca A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x04f7 A[Catch: Throwable -> 0x0510, TryCatch #16 {Throwable -> 0x0510, blocks: (B:369:0x04db, B:372:0x04e6, B:374:0x04f7, B:376:0x04fb, B:377:0x0500, B:380:0x0508), top: B:514:0x04db }] */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0506 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0586 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:428:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x05b3 A[Catch: Throwable -> 0x05cc, TryCatch #13 {Throwable -> 0x05cc, blocks: (B:426:0x0597, B:429:0x05a2, B:431:0x05b3, B:433:0x05b7, B:434:0x05bc, B:437:0x05c4), top: B:508:0x0597 }] */
    /* JADX WARN: Removed duplicated region for block: B:436:0x05c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:443:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x060d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x063a A[Catch: Throwable -> 0x0653, TryCatch #17 {Throwable -> 0x0653, blocks: (B:473:0x061e, B:476:0x0629, B:478:0x063a, B:480:0x063e, B:481:0x0643, B:484:0x064b), top: B:516:0x061e }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0649 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d A[Catch: Throwable -> 0x00b6, TryCatch #46 {Throwable -> 0x00b6, blocks: (B:45:0x0081, B:48:0x008c, B:50:0x009d, B:52:0x00a1, B:53:0x00a6, B:56:0x00ae), top: B:563:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:548:0x04af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:578:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:579:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:580:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:581:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:582:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:583:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:584:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:585:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0120 A[Catch: Throwable -> 0x0139, TryCatch #47 {Throwable -> 0x0139, blocks: (B:88:0x0104, B:91:0x010f, B:93:0x0120, B:95:0x0124, B:96:0x0129, B:99:0x0131), top: B:565:0x0104 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012f A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Thread r22, java.lang.Throwable r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 1640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.a(java.lang.Thread, java.lang.Throwable, boolean):void");
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        a(thread, th, false);
    }
}
