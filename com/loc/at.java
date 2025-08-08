package com.loc;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.RejectedExecutionException;
import tb.riy;

/* loaded from: classes4.dex */
public final class at {

    /* renamed from: a  reason: collision with root package name */
    public static final String f7665a = "/a/";
    static final String b = "b";
    static final String c = "c";
    static final String d = "d";
    public static String e = "s";
    public static final String f = "g";
    public static final String g = "h";
    public static final String h = "e";
    public static final String i = "f";
    public static final String j = "j";
    public static final String k = "k";
    private static long l;
    private static Vector<w> m = new Vector<>();

    public static String a(Context context, String str) {
        return context.getSharedPreferences("AMSKLG_CFG", 0).getString(str, "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<w> a() {
        Vector<w> vector;
        try {
            synchronized (Looper.getMainLooper()) {
                vector = m;
            }
            return vector;
        } catch (Throwable th) {
            th.printStackTrace();
            return m;
        }
    }

    public static void a(final Context context) {
        try {
            if (System.currentTimeMillis() - l < 60000) {
                return;
            }
            l = System.currentTimeMillis();
            cr.a().b(new cs() { // from class: com.loc.at.1
                @Override // com.loc.cs
                public final void a() {
                    try {
                        aw.b(context);
                        aw.d(context);
                        aw.c(context);
                        ca.a(context);
                        by.a(context);
                    } catch (RejectedExecutionException unused) {
                    } catch (Throwable th) {
                        av.b(th, "Lg", "proL");
                    }
                }
            });
        } catch (Throwable th) {
            av.b(th, "Lg", "proL");
        }
    }

    public static void a(Context context, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("AMSKLG_CFG", 0).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public static void a(w wVar) {
        try {
            synchronized (Looper.getMainLooper()) {
                if (wVar == null) {
                    return;
                }
                if (m.contains(wVar)) {
                    return;
                }
                m.add(wVar);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
        r1 = r7.length;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
        if (r2 >= r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
        if (b(r6, r7[r2].trim()) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0047, code lost:
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(java.lang.String[] r6, java.lang.String r7) {
        /*
            r0 = 0
            if (r6 == 0) goto L4e
            if (r7 != 0) goto L6
            goto L4e
        L6:
            java.lang.String r1 = "\n"
            java.lang.String[] r7 = r7.split(r1)     // Catch: java.lang.Throwable -> L4a
            int r1 = r7.length     // Catch: java.lang.Throwable -> L4a
            r2 = 0
        Le:
            r3 = 1
            if (r2 >= r1) goto L36
            r4 = r7[r2]     // Catch: java.lang.Throwable -> L4a
            java.lang.String r4 = r4.trim()     // Catch: java.lang.Throwable -> L4a
            boolean r5 = android.text.StringUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L4a
            if (r5 != 0) goto L2f
            java.lang.String r5 = "at "
            boolean r5 = r4.startsWith(r5)     // Catch: java.lang.Throwable -> L4a
            if (r5 == 0) goto L2f
            java.lang.String r5 = "uncaughtException"
            boolean r4 = r4.contains(r5)     // Catch: java.lang.Throwable -> L4a
            if (r4 == 0) goto L2f
            goto L30
        L2f:
            r3 = 0
        L30:
            if (r3 == 0) goto L33
            return r0
        L33:
            int r2 = r2 + 1
            goto Le
        L36:
            int r1 = r7.length     // Catch: java.lang.Throwable -> L4a
            r2 = 0
        L38:
            if (r2 >= r1) goto L4e
            r4 = r7[r2]     // Catch: java.lang.Throwable -> L4a
            java.lang.String r4 = r4.trim()     // Catch: java.lang.Throwable -> L4a
            boolean r4 = b(r6, r4)     // Catch: java.lang.Throwable -> L4a
            if (r4 == 0) goto L47
            return r3
        L47:
            int r2 = r2 + 1
            goto L38
        L4a:
            r6 = move-exception
            r6.printStackTrace()
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.at.a(java.lang.String[], java.lang.String):boolean");
    }

    public static void b(Context context, String str) {
        SharedPreferences.Editor edit = context.getSharedPreferences("AMSKLG_CFG", 0).edit();
        edit.remove(str);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(String[] strArr, String str) {
        if (strArr != null && str != null) {
            try {
                String str2 = str;
                for (String str3 : strArr) {
                    str2 = str2.trim();
                    if (str2.startsWith("at ")) {
                        if (str2.contains(str3 + ".") && str2.endsWith(riy.BRACKET_END_STR) && !str2.contains("uncaughtException")) {
                            return true;
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    public static String c(Context context, String str) {
        return context.getFilesDir().getAbsolutePath() + f7665a + str;
    }
}
