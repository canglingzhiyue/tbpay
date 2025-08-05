package com.uc.crashsdk;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.taobao.mulitenv.EnvironmentSwitcher;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.uc.crashsdk.a.h;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class b {
    static final /* synthetic */ boolean i = !b.class.desiredAssertionStatus();
    private static String j = null;
    private static String k = null;
    private static String l = null;
    private static String m = null;
    private static String n = null;
    private static String o = null;
    private static String p = null;
    private static String q = null;
    private static String r = null;
    private static String s = null;
    private static String t = null;
    private static String u = null;
    private static String v = null;
    private static String w = null;
    private static String x = null;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f23752a = false;
    public static boolean b = false;
    public static boolean c = false;
    public static boolean d = false;
    public static final Object e = new Object();
    public static volatile boolean f = false;
    public static boolean g = true;
    public static boolean h = false;
    private static boolean y = false;
    private static boolean z = false;
    private static volatile boolean A = false;
    private static boolean B = false;
    private static boolean C = false;
    private static boolean D = false;
    private static boolean E = false;
    private static boolean F = false;
    private static boolean G = false;
    private static final Object H = new Object();
    private static String I = null;
    private static int J = 0;
    private static String K = null;
    private static boolean L = false;
    private static boolean M = false;
    private static boolean N = true;
    private static RandomAccessFile O = null;
    private static boolean P = false;
    private static final Object Q = new Object();
    private static String R = null;
    private static boolean S = false;
    private static volatile Object[] T = null;
    private static Runnable U = new com.uc.crashsdk.a.e(101);
    private static boolean V = false;
    private static long W = 0;
    private static final Object X = new Object();
    private static long Y = 0;
    private static boolean Z = false;
    private static boolean aa = false;
    private static boolean ab = false;
    private static long ac = 0;
    private static final WeakHashMap<Activity, Integer> ad = new WeakHashMap<>();
    private static boolean ae = false;
    private static String af = null;
    private static boolean ag = false;
    private static boolean ah = false;
    private static boolean ai = false;
    private static boolean aj = false;
    private static boolean ak = false;
    private static final Object al = new Object();
    private static PendingIntent am = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean A() {
        return Z || !ag();
    }

    public static boolean B() {
        return aa || !ag();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean C() {
        return aa && !y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void D() {
        com.uc.crashsdk.a.f.a(2, new com.uc.crashsdk.a.e(100));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void E() {
        String str;
        if (!d || (str = af) == null) {
            return;
        }
        JNIBridge.set(129, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String F() {
        String str = af;
        return str == null ? "" : str;
    }

    public static boolean G() {
        if (!ag) {
            if (!com.uc.crashsdk.a.g.a(a.f23743a) && a.f23743a.equals(e.h())) {
                ah = true;
                if (d) {
                    JNIBridge.set(2, true);
                }
            }
            ag = true;
        }
        return ah;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void H() {
        ai = true;
        if (d) {
            JNIBridge.set(34, true);
        }
    }

    public static boolean I() {
        return ai;
    }

    public static int J() {
        boolean X2 = X();
        return u() ? X2 ? 3 : 6 : t() ? X2 ? 2 : 5 : X2 ? 4 : 1;
    }

    public static int K() {
        boolean Y2 = Y();
        boolean Z2 = Z();
        boolean aa2 = aa();
        if (u()) {
            if (Y2) {
                return 12;
            }
            if (Z2) {
                return 14;
            }
            return aa2 ? 16 : 98;
        } else if (!t()) {
            return 1;
        } else {
            if (Y2) {
                return 11;
            }
            if (Z2) {
                return 13;
            }
            return aa2 ? 15 : 97;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void L() {
        if (d) {
            JNIBridge.nativeSet(27, J, "12", null);
            JNIBridge.set(30, N);
        }
    }

    public static boolean M() {
        if (!ak) {
            synchronized (al) {
                if (!ak) {
                    aj = ah();
                    ak = true;
                }
            }
        }
        return aj;
    }

    public static void N() {
        if (e.F() || M() || am != null || g.h() < 0) {
            return;
        }
        try {
            Context a2 = com.uc.crashsdk.a.g.a();
            Intent launchIntentForPackage = a2.getPackageManager().getLaunchIntentForPackage(a2.getPackageName());
            launchIntentForPackage.addFlags(335544320);
            am = com.android.taobao.aop.a.a(a2, 0, launchIntentForPackage, 0);
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean O() {
        if (am == null) {
            com.uc.crashsdk.a.a.b("Restart intent is null!");
            return false;
        }
        try {
            com.uc.crashsdk.a.a.a("crashsdk", "restarting ...");
            ((AlarmManager) com.uc.crashsdk.a.g.a().getSystemService("alarm")).set(1, System.currentTimeMillis() + 200, am);
            return true;
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
            return false;
        }
    }

    private static String R() {
        if (j == null) {
            j = e(EnvironmentSwitcher.SPKEY_SS);
        }
        return j;
    }

    private static String S() {
        if (l == null) {
            l = e("ctn");
        }
        return l;
    }

    private static String T() {
        if (m == null) {
            m = e("cta");
        }
        return m;
    }

    private static String U() {
        if (o == null) {
            o = e("exitextrainfo");
        }
        return o;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    private static void V() {
        /*
            java.io.File r0 = new java.io.File
            java.lang.String r1 = U()
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L10
            return
        L10:
            r1 = 0
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L5d
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L5d
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L53
            r3 = 512(0x200, float:7.175E-43)
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L53
            r1 = 0
        L1e:
            java.lang.String r3 = r0.readLine()     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L45
            java.lang.String r4 = "native_crash_lib_name:"
            boolean r4 = r3.startsWith(r4)     // Catch: java.lang.Throwable -> L4c
            if (r4 == 0) goto L41
            java.lang.String r4 = ":"
            int r4 = r3.indexOf(r4)     // Catch: java.lang.Throwable -> L4c
            int r4 = r4 + 1
            java.lang.String r3 = r3.substring(r4)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L4c
            com.uc.crashsdk.b.K = r3     // Catch: java.lang.Throwable -> L4c
            int r1 = r1 + 1
        L41:
            r3 = 100
            if (r1 < r3) goto L1e
        L45:
            com.uc.crashsdk.a.g.a(r2)
            com.uc.crashsdk.a.g.a(r0)
            return
        L4c:
            r1 = move-exception
            goto L61
        L4e:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L6c
        L53:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L61
        L58:
            r0 = move-exception
            r2 = r1
            r1 = r0
            r0 = r2
            goto L6c
        L5d:
            r0 = move-exception
            r2 = r1
            r1 = r0
            r0 = r2
        L61:
            com.uc.crashsdk.a.g.a(r1)     // Catch: java.lang.Throwable -> L6b
            com.uc.crashsdk.a.g.a(r2)
            com.uc.crashsdk.a.g.a(r0)
            return
        L6b:
            r1 = move-exception
        L6c:
            com.uc.crashsdk.a.g.a(r2)
            com.uc.crashsdk.a.g.a(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.b.V():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0077 A[Catch: Throwable -> 0x007b, TRY_LEAVE, TryCatch #1 {, blocks: (B:9:0x000d, B:11:0x0011, B:13:0x0013, B:15:0x0055, B:20:0x005d, B:22:0x0061, B:24:0x0065, B:26:0x0069, B:33:0x007f, B:34:0x0081, B:27:0x0071, B:29:0x0077), top: B:40:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void W() {
        /*
            boolean r0 = com.uc.crashsdk.b.A
            if (r0 != 0) goto L86
            boolean r0 = com.uc.crashsdk.b.z
            if (r0 == 0) goto La
            goto L86
        La:
            java.lang.Object r0 = com.uc.crashsdk.b.H
            monitor-enter(r0)
            boolean r1 = com.uc.crashsdk.b.A     // Catch: java.lang.Throwable -> L83
            if (r1 == 0) goto L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L83
            return
        L13:
            java.lang.String r1 = com.uc.crashsdk.g.V()     // Catch: java.lang.Throwable -> L83
            g(r1)     // Catch: java.lang.Throwable -> L83
            java.lang.String r1 = p()     // Catch: java.lang.Throwable -> L83
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L83
            java.lang.String r3 = b()     // Catch: java.lang.Throwable -> L83
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L83
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L83
            java.lang.String r4 = S()     // Catch: java.lang.Throwable -> L83
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L83
            java.lang.String r4 = "f"
            boolean r4 = r4.equals(r1)     // Catch: java.lang.Throwable -> L83
            com.uc.crashsdk.b.B = r4     // Catch: java.lang.Throwable -> L83
            java.lang.String r4 = "b"
            boolean r1 = r4.equals(r1)     // Catch: java.lang.Throwable -> L83
            com.uc.crashsdk.b.C = r1     // Catch: java.lang.Throwable -> L83
            boolean r1 = r2.exists()     // Catch: java.lang.Throwable -> L83
            com.uc.crashsdk.b.E = r1     // Catch: java.lang.Throwable -> L83
            boolean r1 = r3.exists()     // Catch: java.lang.Throwable -> L83
            com.uc.crashsdk.b.F = r1     // Catch: java.lang.Throwable -> L83
            V()     // Catch: java.lang.Throwable -> L83
            boolean r1 = com.uc.crashsdk.b.E     // Catch: java.lang.Throwable -> L83
            r2 = 1
            if (r1 != 0) goto L5c
            boolean r1 = com.uc.crashsdk.b.F     // Catch: java.lang.Throwable -> L83
            if (r1 == 0) goto L5a
            goto L5c
        L5a:
            r1 = 0
            goto L5d
        L5c:
            r1 = 1
        L5d:
            com.uc.crashsdk.b.D = r1     // Catch: java.lang.Throwable -> L83
            if (r1 != 0) goto L71
            boolean r1 = com.uc.crashsdk.b.B     // Catch: java.lang.Throwable -> L83
            if (r1 != 0) goto L69
            boolean r1 = com.uc.crashsdk.b.C     // Catch: java.lang.Throwable -> L83
            if (r1 == 0) goto L71
        L69:
            boolean r1 = s()     // Catch: java.lang.Throwable -> L83
            com.uc.crashsdk.b.G = r1     // Catch: java.lang.Throwable -> L83
            com.uc.crashsdk.b.D = r1     // Catch: java.lang.Throwable -> L83
        L71:
            boolean r1 = A()     // Catch: java.lang.Throwable -> L7b
            if (r1 == 0) goto L7f
            ac()     // Catch: java.lang.Throwable -> L7b
            goto L7f
        L7b:
            r1 = move-exception
            com.uc.crashsdk.a.g.a(r1)     // Catch: java.lang.Throwable -> L83
        L7f:
            com.uc.crashsdk.b.A = r2     // Catch: java.lang.Throwable -> L83
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L83
            return
        L83:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L83
            throw r1
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.b.W():void");
    }

    private static boolean X() {
        W();
        return D;
    }

    private static boolean Y() {
        W();
        return E;
    }

    private static boolean Z() {
        W();
        return F;
    }

    private static Object a(Object obj, Class<?> cls, String str) {
        if (obj == null) {
            return null;
        }
        if (cls == null) {
            cls = obj.getClass();
        }
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a() {
        int i2;
        String sb;
        char c2;
        String str = I;
        if (str != null) {
            return str;
        }
        String h2 = e.h();
        if (com.uc.crashsdk.a.g.a(h2)) {
            sb = "LLUN";
        } else {
            if (h2.length() > 48) {
                i2 = h2.length() - 48;
                h2 = h2.substring(0, 48);
            } else {
                i2 = 0;
            }
            StringBuilder sb2 = new StringBuilder();
            byte[] bytes = h2.getBytes();
            for (int length = bytes.length - 1; length >= 0; length--) {
                int i3 = bytes[length];
                if (i3 == 46) {
                    sb2.append('0');
                } else {
                    if (i3 == 58) {
                        c2 = '1';
                    } else {
                        if (i3 >= 97 && i3 <= 122) {
                            i3 = (i3 + 65) - 97;
                        } else if ((i3 < 65 || i3 > 90) && (i3 < 48 || i3 > 57)) {
                            c2 = '2';
                        }
                        c2 = (char) i3;
                    }
                    sb2.append(c2);
                }
            }
            if (i2 > 0) {
                sb2.append(String.valueOf(i2));
            }
            sb = sb2.toString();
        }
        I = sb;
        return I;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str) {
        if (str == null || str.length() <= 0 || !str.endsWith(".st")) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(".st");
        if (!i && lastIndexOf < 0) {
            throw new AssertionError();
        }
        String substring = str.substring(0, lastIndexOf);
        if (substring.length() <= 0) {
            return null;
        }
        return substring + ".stcb";
    }

    public static void a(int i2) {
        Object a2;
        Activity activity;
        int i3;
        boolean z2 = false;
        boolean z3 = true;
        switch (i2) {
            case 100:
                Object af2 = af();
                if (af2 == null || (a2 = a(af2, (Class<?>) null, "mActivities")) == null) {
                    return;
                }
                try {
                    boolean z4 = false;
                    for (Map.Entry entry : ((Map) a2).entrySet()) {
                        Object value = entry.getValue();
                        if (value != null && (activity = (Activity) a(value, (Class<?>) null, "activity")) != null) {
                            boolean booleanValue = ((Boolean) a(value, (Class<?>) null, "paused")).booleanValue();
                            boolean booleanValue2 = ((Boolean) a(value, (Class<?>) null, DXRecyclerLayout.LOAD_MORE_STOPED)).booleanValue();
                            synchronized (ad) {
                                if (booleanValue || booleanValue2) {
                                    i3 = 2;
                                } else {
                                    i3 = 1;
                                    z4 = true;
                                }
                                ad.put(activity, Integer.valueOf(i3));
                            }
                        }
                        z2 = true;
                    }
                    if (!z2) {
                        return;
                    }
                    b(z4);
                    return;
                } catch (Throwable th) {
                    com.uc.crashsdk.a.g.a(th);
                    return;
                }
            case 101:
                try {
                    if (new File(R()).exists()) {
                        z3 = false;
                    }
                    P = z3;
                    if (!z3 && !S) {
                        return;
                    }
                    a(ae());
                    S = false;
                    return;
                } catch (Throwable th2) {
                    com.uc.crashsdk.a.g.a(th2);
                    return;
                }
            case 102:
                com.uc.crashsdk.a.f.a(1, new com.uc.crashsdk.a.e(103));
                return;
            case 103:
                try {
                    com.uc.crashsdk.a.g.a(new File(T()));
                    return;
                } catch (Throwable th3) {
                    com.uc.crashsdk.a.g.a(th3);
                    return;
                }
            case 104:
                h.d();
                f.a(102);
                if (!G()) {
                    return;
                }
                e.C();
                return;
            case 105:
                if (!A()) {
                    com.uc.crashsdk.a.f.a(1, new com.uc.crashsdk.a.e(105), 3000L);
                    return;
                }
                W();
                ac();
                return;
            default:
                if (!i) {
                    throw new AssertionError();
                }
                return;
        }
    }

    public static void a(boolean z2) {
        N = z2;
        if (d) {
            JNIBridge.set(30, N);
        }
    }

    private static void a(Object[] objArr) {
        T = objArr;
        synchronized (Q) {
            String str = (String) objArr[0];
            long longValue = ((Long) objArr[1]).longValue();
            if (longValue < W) {
                com.uc.crashsdk.a.a.c("crashsdk", String.format(Locale.US, "Update state generation %d, last is: %d", Long.valueOf(longValue), Long.valueOf(W)));
                return;
            }
            W = longValue;
            String R2 = R();
            if (d) {
                if (O != null) {
                    com.uc.crashsdk.a.g.a(O);
                    O = null;
                }
                boolean nativeChangeState = JNIBridge.nativeChangeState(R2, str, P);
                P = false;
                if (!nativeChangeState) {
                    com.uc.crashsdk.a.a.b("write state failed: " + str);
                }
            } else {
                if (O == null || P) {
                    if (O != null) {
                        com.uc.crashsdk.a.g.a(O);
                        O = null;
                    }
                    try {
                        RandomAccessFile randomAccessFile = new RandomAccessFile(R2, "rw");
                        O = randomAccessFile;
                        randomAccessFile.seek(0L);
                        P = false;
                    } catch (Exception e2) {
                        com.uc.crashsdk.a.g.a(e2);
                    }
                }
                try {
                    O.write(str.getBytes());
                    O.seek(0L);
                } catch (Exception e3) {
                    com.uc.crashsdk.a.g.a(e3);
                }
            }
            R = str;
            T = null;
        }
    }

    public static boolean a(Context context) {
        try {
            ((Application) context).registerActivityLifecycleCallbacks(new c());
            if (!g.J()) {
                return true;
            }
            D();
            return true;
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
            return false;
        }
    }

    public static boolean a(Object obj, String str, com.uc.crashsdk.a.e eVar) {
        Throwable th;
        FileChannel fileChannel;
        synchronized (obj) {
            FileChannel fileChannel2 = null;
            r1 = null;
            FileLock fileLock = null;
            fileChannel2 = null;
            boolean z2 = false;
            if (d) {
                int nativeOpenFile = JNIBridge.nativeOpenFile(str);
                if (nativeOpenFile < 0) {
                    com.uc.crashsdk.a.a.a("crashsdk", "Can not open file: " + str, null);
                    return false;
                }
                boolean nativeLockFile = JNIBridge.nativeLockFile(nativeOpenFile, true);
                try {
                    boolean a2 = eVar.a();
                    JNIBridge.nativeCloseFile(nativeOpenFile);
                    z2 = a2;
                } finally {
                    if (nativeLockFile) {
                        JNIBridge.nativeLockFile(nativeOpenFile, false);
                    }
                }
            } else {
                File file = new File(str);
                if (!file.exists()) {
                    try {
                        file.createNewFile();
                    } catch (Exception e2) {
                        com.uc.crashsdk.a.g.a(e2);
                    }
                }
                try {
                    try {
                        fileChannel = new RandomAccessFile(file, "rw").getChannel();
                    } catch (Throwable th2) {
                        th = th2;
                        fileChannel = fileChannel2;
                        com.uc.crashsdk.a.g.a(fileChannel);
                        throw th;
                    }
                } catch (Exception e3) {
                    try {
                        com.uc.crashsdk.a.g.a(e3);
                        fileChannel = null;
                    } catch (Exception e4) {
                        e = e4;
                        com.uc.crashsdk.a.g.a(e);
                        com.uc.crashsdk.a.g.a(fileChannel2);
                        return z2;
                    }
                }
                if (fileChannel != null) {
                    try {
                        try {
                            fileLock = fileChannel.lock();
                        } catch (Throwable th3) {
                            th = th3;
                            com.uc.crashsdk.a.g.a(fileChannel);
                            throw th;
                        }
                    } catch (Exception e5) {
                        try {
                            com.uc.crashsdk.a.g.a(e5);
                        } catch (Exception e6) {
                            e = e6;
                            fileChannel2 = fileChannel;
                            com.uc.crashsdk.a.g.a(e);
                            com.uc.crashsdk.a.g.a(fileChannel2);
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
                        } catch (Exception e7) {
                            com.uc.crashsdk.a.g.a(e7);
                        }
                    }
                }
            }
            return z2;
        }
    }

    private static boolean aa() {
        W();
        return G;
    }

    private static void ab() {
        if (d) {
            JNIBridge.set(26, y);
        }
    }

    private static void ac() {
        if (!V) {
            V = true;
            try {
                new File(b()).delete();
            } catch (Throwable th) {
                com.uc.crashsdk.a.g.a(th);
            }
            try {
                new File(S()).delete();
            } catch (Throwable th2) {
                com.uc.crashsdk.a.g.a(th2);
            }
            try {
                if (d) {
                    JNIBridge.cmd(16);
                } else {
                    new File(T()).delete();
                }
            } catch (Throwable th3) {
                com.uc.crashsdk.a.g.a(th3);
            }
            try {
                new File(U()).delete();
            } catch (Throwable th4) {
                com.uc.crashsdk.a.g.a(th4);
            }
        }
        Object[] ae2 = ae();
        if (!ae2[0].equals(R) && T == null) {
            a(ae2);
            return;
        }
        S = true;
        ad();
    }

    private static void ad() {
        if (!com.uc.crashsdk.a.f.b(U)) {
            com.uc.crashsdk.a.f.a(1, U);
            return;
        }
        Object[] objArr = T;
        if (objArr != null && ae()[0].equals(objArr[0])) {
            return;
        }
        com.uc.crashsdk.a.f.a(U);
        com.uc.crashsdk.a.f.a(1, U);
    }

    private static Object[] ae() {
        synchronized (X) {
            Y++;
            if (y) {
                return new Object[]{"e", Long.valueOf(Y)};
            } else if (C()) {
                return new Object[]{"f", Long.valueOf(Y)};
            } else {
                return new Object[]{TplMsg.VALUE_T_NATIVE_RETURN, Long.valueOf(Y)};
            }
        }
    }

    private static Object af() {
        Method declaredMethod;
        Object a2;
        Object a3 = a((Application) com.uc.crashsdk.a.g.a(), Application.class, "mLoadedApk");
        if (a3 == null || (a2 = a(a3, (Class<?>) null, "mActivityThread")) == null) {
            try {
                Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
                if (cls != null && (declaredMethod = cls.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0])) != null) {
                    declaredMethod.setAccessible(true);
                    return declaredMethod.invoke(null, new Object[0]);
                }
            } catch (Throwable th) {
                com.uc.crashsdk.a.g.a(th);
            }
            return null;
        }
        return a2;
    }

    private static boolean ag() {
        String a2 = com.uc.crashsdk.a.g.a(new File("/proc/self/cgroup"), 512, false);
        if (com.uc.crashsdk.a.g.a(a2)) {
            return false;
        }
        return a2.contains("/bg_non_interactive") || a2.contains("/background");
    }

    private static boolean ah() {
        try {
            Method declaredMethod = Process.class.getDeclaredMethod("isIsolated", new Class[0]);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, new Object[0]);
                if (invoke != null && (invoke instanceof Boolean)) {
                    return ((Boolean) invoke).booleanValue();
                }
            }
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
        int myUid = Process.myUid() % 100000;
        return myUid >= 99000 && myUid <= 99999;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b() {
        if (k == null) {
            k = e("ctj");
        }
        return k;
    }

    public static String b(String str) {
        W();
        if (str != null && str.equals("nativeCrashLibName")) {
            return K;
        }
        return null;
    }

    public static void b(int i2) {
        J = i2;
        L();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Context context) {
        com.uc.crashsdk.a.a.a("Restart APP");
        if (context == null) {
            return;
        }
        if (q == null) {
            q = e("rt");
        }
        File file = new File(q);
        long j2 = -1;
        try {
            j2 = Long.parseLong(com.uc.crashsdk.a.g.d(file));
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
        boolean z2 = false;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (g.h() >= 0 && (j2 <= 0 || currentTimeMillis - j2 > g.h())) {
            g(g.V());
            com.uc.crashsdk.a.g.a(file, String.valueOf(currentTimeMillis));
            z2 = true;
        }
        com.uc.crashsdk.a.a.a("lastTime: " + j2 + ", currentTime: " + currentTimeMillis + ", needRestart: " + z2);
        if (!z2) {
            return;
        }
        try {
            d.a(true);
        } catch (Throwable th2) {
            com.uc.crashsdk.a.g.a(th2);
        }
        O();
    }

    public static void b(boolean z2) {
        if (e.u()) {
            return;
        }
        if (z2 && y) {
            if (g.M()) {
                com.uc.crashsdk.a.a.a(0, "crashsdk", "setForeground, reset sExited to false!!!", null);
            }
            y = false;
            ab();
        }
        boolean z3 = e.F() || M();
        long currentTimeMillis = System.currentTimeMillis();
        if (Z && !aa && z2) {
            long j2 = ac;
            if (j2 != 0 && !z3 && currentTimeMillis - j2 > android.taobao.windvane.util.b.DEFAULT_SMALL_MAX_AGE) {
                com.uc.crashsdk.a.f.a(1, new com.uc.crashsdk.a.e(104), 1000L);
            }
        }
        ac = currentTimeMillis;
        aa = z2;
        if (z2) {
            Z = true;
        }
        if (d) {
            JNIBridge.nativeSetForeground(z2);
        }
        if (y || z3) {
            return;
        }
        W();
        ac();
        if (z2) {
            a.a(false);
            if (!ab) {
                e.B();
                ab = true;
            }
        }
        if (!P) {
            ad();
        }
        e.c(z2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c() {
        if (n == null) {
            n = e("st");
        }
        return n;
    }

    public static String c(String str) {
        return "debug.crs." + str;
    }

    public static boolean c(int i2) {
        return (i2 & J) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File[] d() {
        return f(".st");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String e() {
        if (p == null) {
            p = e("stcb");
        }
        return p;
    }

    private static String e(String str) {
        return g.V() + a() + "." + str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File[] f() {
        return f(".stcb");
    }

    private static File[] f(String str) {
        if (i || str.length() > 0) {
            File[] listFiles = new File(g.V()).listFiles();
            if (listFiles == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (File file : listFiles) {
                if (file.getPath().endsWith(str)) {
                    arrayList.add(file);
                }
            }
            return (File[]) arrayList.toArray(new File[arrayList.size()]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String g() {
        if (w == null) {
            w = e("bati");
        }
        return w;
    }

    private static boolean g(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (file.isDirectory()) {
            return true;
        }
        com.uc.crashsdk.a.a.a("crashsdk", "Crash log directory was placed by a file!", null);
        if (!file.delete()) {
            return false;
        }
        file.mkdirs();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String h() {
        if (x == null) {
            x = e("hdr");
        }
        return x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String i() {
        if (r == null) {
            r = g.V() + "up";
        }
        return r;
    }

    public static String j() {
        if (s == null) {
            s = g.V() + "authu";
        }
        return s;
    }

    public static String k() {
        if (t == null) {
            t = g.V() + "statu";
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String l() {
        if (u == null) {
            u = g.V() + "poli";
        }
        return u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String m() {
        if (v == null) {
            v = g.V() + MspDBHelper.RecordEntry.COLUMN_NAME_VERSION;
        }
        return v;
    }

    public static String n() {
        return g.V() + "bvu";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String o() {
        return g.V() + "fds";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String p() {
        return com.uc.crashsdk.a.g.a(new File(R()), 8, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean q() {
        return z;
    }

    public static void r() {
        com.uc.crashsdk.a.f.a(1, new com.uc.crashsdk.a.e(105));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean s() {
        if (!L) {
            M = d ? JNIBridge.cmd(15) == 1 : new File(T()).exists();
            L = true;
        }
        return M;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean t() {
        W();
        return B;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean u() {
        W();
        return C;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean v() {
        return y;
    }

    public static void w() {
        boolean z2;
        g(g.V());
        z = true;
        B = false;
        C = false;
        D = false;
        E = false;
        F = false;
        G = false;
        String[] strArr = {".st", ".wa", ".callback", ".ctn", ".ctj", ".cta", ".signal"};
        String[] strArr2 = {"up", "authu", "statu", "poli"};
        File[] listFiles = new File(g.V()).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                String name = file.getName();
                int i2 = 0;
                while (true) {
                    if (i2 >= 7) {
                        z2 = false;
                        break;
                    } else if (name.endsWith(strArr[i2])) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!z2) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= 4) {
                            break;
                        } else if (name.equals(strArr2[i3])) {
                            z2 = true;
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                if (z2) {
                    com.uc.crashsdk.a.a.a("crashsdk", "delete file: " + file.getPath());
                    com.uc.crashsdk.a.g.a(file);
                }
            }
        }
        ac();
    }

    public static void x() {
        if (y) {
            return;
        }
        y = true;
        if (M() || e.u()) {
            return;
        }
        g(g.V());
        ab();
        ac();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean y() {
        return g(g.V());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean z() {
        return g(g.W());
    }
}
