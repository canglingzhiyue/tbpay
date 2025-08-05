package com.uc.crashsdk.a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.alibaba.ariver.kernel.RVStartParams;
import com.uc.crashsdk.JNIBridge;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.lang.reflect.Field;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class g {
    private static Context b;

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f23749a = !g.class.desiredAssertionStatus();
    private static String c = null;
    private static String d = null;
    private static String e = null;
    private static String f = null;
    private static String g = null;
    private static boolean h = false;
    private static final Object i = new Object();
    private static final char[] j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static Context a() {
        return b;
    }

    public static String a(File file, int i2, boolean z) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Throwable th) {
            th = th;
            fileInputStream = null;
        }
        try {
            byte[] bArr = new byte[i2];
            int read = fileInputStream.read(bArr);
            if (read > 0) {
                return new String(bArr, 0, read);
            }
        } catch (Throwable th2) {
            th = th2;
            if (z) {
                try {
                    a(th, false);
                } finally {
                    a(fileInputStream);
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (r2.toLowerCase().startsWith("http") != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r2, java.lang.String r3, boolean r4) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            boolean r0 = r0.exists()
            r1 = 0
            if (r0 == 0) goto L2b
            java.lang.String r2 = com.uc.crashsdk.a.b.a(r2)
            boolean r0 = a(r2)
            if (r0 == 0) goto L17
            goto L2b
        L17:
            if (r4 == 0) goto L2a
            java.lang.String r2 = r2.trim()
            java.lang.String r4 = r2.toLowerCase()
            java.lang.String r0 = "http"
            boolean r4 = r4.startsWith(r0)
            if (r4 == 0) goto L2b
        L2a:
            r1 = r2
        L2b:
            if (r1 != 0) goto L2e
            goto L2f
        L2e:
            r3 = r1
        L2f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.a.g.a(java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    private static java.lang.String a(java.lang.String[] r5) {
        /*
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L41
            java.lang.Process r5 = r1.exec(r5)     // Catch: java.lang.Throwable -> L41
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L41
            java.io.InputStream r5 = r5.getInputStream()     // Catch: java.lang.Throwable -> L41
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L41
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3b
            r2 = 512(0x200, float:7.175E-43)
            r5.<init>(r1, r2)     // Catch: java.lang.Throwable -> L3b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37
            r2.<init>()     // Catch: java.lang.Throwable -> L37
        L1e:
            java.lang.String r3 = r5.readLine()     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L28
            r2.append(r3)     // Catch: java.lang.Throwable -> L37
            goto L1e
        L28:
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = r2.trim()     // Catch: java.lang.Throwable -> L37
            a(r5)
            a(r1)
            return r0
        L37:
            r2 = move-exception
            goto L44
        L39:
            r5 = move-exception
            goto L53
        L3b:
            r2 = move-exception
            r5 = r0
            goto L44
        L3e:
            r5 = move-exception
            r1 = r0
            goto L53
        L41:
            r2 = move-exception
            r5 = r0
            r1 = r5
        L44:
            r3 = 0
            a(r2, r3)     // Catch: java.lang.Throwable -> L4f
            a(r5)
            a(r1)
            return r0
        L4f:
            r0 = move-exception
            r4 = r0
            r0 = r5
            r5 = r4
        L53:
            a(r0)
            a(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.a.g.a(java.lang.String[]):java.lang.String");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public static java.util.ArrayList<java.lang.String> a(java.io.File r5, int r6) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L34
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L34
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L2d
            r4 = 512(0x200, float:7.175E-43)
            r5.<init>(r3, r4)     // Catch: java.lang.Throwable -> L2d
            r2 = 0
        L14:
            java.lang.String r4 = r5.readLine()     // Catch: java.lang.Throwable -> L29
            if (r4 == 0) goto L23
            r0.add(r4)     // Catch: java.lang.Throwable -> L29
            int r2 = r2 + 1
            if (r6 <= 0) goto L14
            if (r2 < r6) goto L14
        L23:
            a(r3)
            goto L3c
        L27:
            r6 = move-exception
            goto L42
        L29:
            r6 = move-exception
            goto L2f
        L2b:
            r6 = move-exception
            goto L43
        L2d:
            r6 = move-exception
            r5 = r2
        L2f:
            r2 = r3
            goto L36
        L31:
            r6 = move-exception
            r3 = r2
            goto L43
        L34:
            r6 = move-exception
            r5 = r2
        L36:
            a(r6, r1)     // Catch: java.lang.Throwable -> L40
            a(r2)
        L3c:
            a(r5)
            return r0
        L40:
            r6 = move-exception
            r3 = r2
        L42:
            r2 = r5
        L43:
            a(r3)
            a(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.a.g.a(java.io.File, int):java.util.ArrayList");
    }

    public static void a(int i2) {
        if (i2 == 800) {
            l();
        } else if (!f23749a) {
            throw new AssertionError();
        }
    }

    public static void a(Context context) {
        if (b != null) {
            a.b("mContext is existed");
        }
        b = context;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        c = applicationInfo.dataDir;
        d = applicationInfo.sourceDir;
        try {
            Field declaredField = ApplicationInfo.class.getDeclaredField("primaryCpuAbi");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(applicationInfo);
            if (obj == null || !(obj instanceof String)) {
                return;
            }
            e = (String) obj;
        } catch (Throwable th) {
            a(th, false);
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                a(th, true);
            }
        }
    }

    public static void a(File file, File file2) {
        FileInputStream fileInputStream;
        byte[] bArr = new byte[524288];
        File parentFile = file2.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        if (file2.isDirectory()) {
            file2 = new File(file2, file.getName());
        }
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                while (true) {
                    try {
                        int read = fileInputStream.read(bArr);
                        if (read == -1) {
                            a(fileInputStream);
                            a(fileOutputStream2);
                            return;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        a(fileInputStream);
                        a(fileOutputStream);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
    }

    public static void a(Throwable th) {
        a(th, false);
    }

    private static void a(Throwable th, boolean z) {
        if (!z) {
            try {
                if (!com.uc.crashsdk.g.M()) {
                    return;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        th.printStackTrace();
    }

    public static boolean a(File file) {
        String[] list;
        if (file.isDirectory() && (list = file.list()) != null) {
            for (String str : list) {
                if (!a(new File(file, str))) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    public static boolean a(File file, String str) {
        FileWriter fileWriter = null;
        try {
            FileWriter fileWriter2 = new FileWriter(file);
            try {
                fileWriter2.write(str, 0, str.length());
                a(fileWriter2);
                return true;
            } catch (Throwable th) {
                th = th;
                fileWriter = fileWriter2;
                try {
                    a(th, false);
                    return false;
                } finally {
                    a(fileWriter);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean a(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                a(fileOutputStream2);
                return true;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                try {
                    a(th, false);
                    return false;
                } finally {
                    a(fileOutputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean a(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static boolean a(StringBuffer stringBuffer) {
        return stringBuffer == null || stringBuffer.length() == 0;
    }

    public static String b() {
        return c;
    }

    public static void b(File file) {
        a(file, "");
    }

    public static void b(Throwable th) {
        a(th, true);
    }

    public static boolean b(String str) {
        return !a(str);
    }

    public static long c(String str) {
        if (!a(str)) {
            try {
                long parseLong = Long.parseLong(str.trim());
                if (parseLong >= 0) {
                    return parseLong;
                }
                return 0L;
            } catch (NumberFormatException unused) {
                return 0L;
            }
        }
        return 0L;
    }

    public static String c() {
        return d;
    }

    public static String c(File file) {
        FileInputStream fileInputStream;
        String str = "";
        if (!file.exists()) {
            return str;
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[256];
            StringBuilder sb = new StringBuilder();
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                sb.append(new String(bArr, 0, read));
            }
            str = sb.toString();
            a(fileInputStream);
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            try {
                a(th, false);
                a(fileInputStream2);
                return str;
            } catch (Throwable th3) {
                a(fileInputStream2);
                throw th3;
            }
        }
        return str;
    }

    public static String d() {
        String str = e;
        return str != null ? str : "";
    }

    public static String d(File file) {
        return a(file, 64, true);
    }

    public static String d(String str) {
        try {
            byte[] bytes = str.getBytes("utf-8");
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bytes);
            byte[] digest = messageDigest.digest();
            int length = digest.length;
            StringBuilder sb = new StringBuilder(length << 1);
            int i2 = length + 0;
            for (int i3 = 0; i3 < i2; i3++) {
                byte b2 = digest[i3];
                char c2 = j[(b2 & 240) >> 4];
                char c3 = j[b2 & 15];
                sb.append(c2);
                sb.append(c3);
            }
            return sb.toString();
        } catch (Exception e2) {
            a.a("crashsdk", "getMD5: ", e2);
            return null;
        }
    }

    public static boolean e() {
        if (g()) {
            return true;
        }
        return f();
    }

    public static byte[] e(File file) {
        FileInputStream fileInputStream;
        byte[] bArr;
        if (!file.exists()) {
            return null;
        }
        try {
            bArr = new byte[(int) file.length()];
            fileInputStream = new FileInputStream(file);
        } catch (Throwable th) {
            th = th;
            fileInputStream = null;
        }
        try {
            fileInputStream.read(bArr);
            a(fileInputStream);
            return bArr;
        } catch (Throwable th2) {
            th = th2;
            try {
                a(th, false);
                a(fileInputStream);
                return null;
            } catch (Throwable th3) {
                a(fileInputStream);
                throw th3;
            }
        }
    }

    public static boolean f() {
        return Build.TAGS != null && Build.TAGS.contains("test-keys");
    }

    public static boolean g() {
        int indexOf;
        String i2 = i();
        if (!a(i2) && (indexOf = i2.indexOf(" root ")) > 0) {
            String substring = i2.substring(0, indexOf);
            if (substring.contains("x") || substring.contains("s")) {
                return true;
            }
        }
        return false;
    }

    public static String h() {
        l();
        return a(f) ? "" : f;
    }

    public static String i() {
        l();
        return a(g) ? "" : g;
    }

    public static void j() {
        f.a(0, new e(800), 15000L);
    }

    public static void k() {
        if (!com.uc.crashsdk.b.d || !h) {
            return;
        }
        JNIBridge.set(123, f);
        JNIBridge.set(124, g);
    }

    private static void l() {
        String trim;
        int indexOf;
        int indexOf2;
        if (h) {
            return;
        }
        synchronized (i) {
            if (h) {
                return;
            }
            String a2 = a(new String[]{"sh", "-c", "type su"});
            if (!a(a2) && (indexOf = (trim = a2.trim()).indexOf(32)) > 0 && trim.contains("/su") && (indexOf2 = trim.indexOf(47, indexOf + 1)) > 0) {
                f = trim.substring(indexOf2);
                String a3 = a(new String[]{RVStartParams.KEY_LANDSCAPE_SHORT, "-l", f});
                if (!a(a3)) {
                    g = a3.trim();
                }
            }
            h = true;
            k();
        }
    }
}
