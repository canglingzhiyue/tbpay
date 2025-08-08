package com.etao.feimagesearch.util;

import android.content.Context;
import android.graphics.Bitmap;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.common.ShopConstants;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import tb.cot;
import tb.kge;

/* loaded from: classes4.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(753955102);
    }

    public static synchronized String a(Context context, Bitmap bitmap, int i) {
        synchronized (l.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("674524b", new Object[]{context, bitmap, new Integer(i)});
            }
            String a2 = a(context, bitmap, Bitmap.CompressFormat.JPEG, i, "imagesearch_tmp" + System.currentTimeMillis() + ".jpg");
            if (!StringUtils.isEmpty(a2)) {
                com.etao.feimagesearch.g.a().a(a2);
            }
            return a2;
        }
    }

    public static boolean a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a979fe3", new Object[]{file})).booleanValue();
        }
        String name = file.getName();
        if (StringUtils.isEmpty(name) || !name.startsWith("imagesearch_tmp")) {
            return false;
        }
        return i.a(file.getAbsolutePath());
    }

    public static void a(Context context) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        File b = b(context);
        if (!b.exists() || !b.isDirectory() || (listFiles = b.listFiles()) == null) {
            return;
        }
        for (File file : listFiles) {
            if (a(file)) {
                cot.c("MediaUtil", "delete " + file.getAbsolutePath());
                i.a(file);
            }
        }
    }

    private static synchronized String a(Context context, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i, String str) {
        synchronized (l.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9d126ec6", new Object[]{context, bitmap, compressFormat, new Integer(i), str});
            } else if (context == null) {
                Log.e("MediaUtil", "saveTmp(), context is null");
                return "";
            } else {
                File file = new File(b(context), str);
                if (file.exists() || !a(bitmap, file, compressFormat, i)) {
                    return "";
                }
                return file.getPath();
            }
        }
    }

    private static File b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("5755eb6e", new Object[]{context}) : a(context, "history");
    }

    private static File a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("90186323", new Object[]{context, str});
        }
        File file = new File(context.getCacheDir().getAbsolutePath() + File.separator + "image_search" + File.separator + str);
        if (!file.exists() || !file.isDirectory()) {
            file.mkdirs();
        }
        return file;
    }

    public static String b(Context context, Bitmap bitmap, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91488ea7", new Object[]{context, bitmap, str});
        }
        try {
            File file = new File(a(context, str), "imagesearch_tmp" + System.currentTimeMillis() + ".png");
            a(bitmap, file, Bitmap.CompressFormat.PNG, 100);
            return file.getPath();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String a(Context context, String str, String str2) {
        BufferedWriter bufferedWriter;
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc35a1ac", new Object[]{context, str, str2});
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            file = new File(a(context, str2), str2 + "_tmp" + System.currentTimeMillis() + ".txt");
            bufferedWriter = new BufferedWriter(new FileWriter(file));
        } catch (IOException unused) {
            bufferedWriter = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(str);
            String absolutePath = file.getAbsolutePath();
            com.etao.feimagesearch.mnn.utils.d.a(bufferedWriter);
            return absolutePath;
        } catch (IOException unused2) {
            if (bufferedWriter == null) {
                return "";
            }
            com.etao.feimagesearch.mnn.utils.d.a(bufferedWriter);
            return "";
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            if (bufferedWriter2 != null) {
                com.etao.feimagesearch.mnn.utils.d.a(bufferedWriter2);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b0 A[Catch: Throwable -> 0x00b4, TRY_ENTER, TRY_LEAVE, TryCatch #9 {IOException -> 0x00d1, blocks: (B:7:0x0045, B:37:0x00a1, B:9:0x004b, B:51:0x00bc, B:50:0x00b9, B:36:0x009e, B:46:0x00b0), top: B:76:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b9 A[Catch: Throwable -> 0x00bf, TryCatch #9 {IOException -> 0x00d1, blocks: (B:7:0x0045, B:37:0x00a1, B:9:0x004b, B:51:0x00bc, B:50:0x00b9, B:36:0x009e, B:46:0x00b0), top: B:76:0x0045 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.content.Context r12, java.lang.String[] r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etao.feimagesearch.util.l.a(android.content.Context, java.lang.String[], java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
        if (r1 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
        com.etao.feimagesearch.mnn.utils.d.a(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
        if (r1 == null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static synchronized boolean a(android.graphics.Bitmap r6, java.io.File r7, android.graphics.Bitmap.CompressFormat r8, int r9) {
        /*
            java.lang.Class<com.etao.feimagesearch.util.l> r0 = com.etao.feimagesearch.util.l.class
            monitor-enter(r0)
            com.android.alibaba.ip.runtime.IpChange r1 = com.etao.feimagesearch.util.l.$ipChange     // Catch: java.lang.Throwable -> L7a
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange     // Catch: java.lang.Throwable -> L7a
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L2b
            java.lang.String r2 = "98985845"
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L7a
            r5[r4] = r6     // Catch: java.lang.Throwable -> L7a
            r5[r3] = r7     // Catch: java.lang.Throwable -> L7a
            r6 = 2
            r5[r6] = r8     // Catch: java.lang.Throwable -> L7a
            r6 = 3
            java.lang.Integer r7 = new java.lang.Integer     // Catch: java.lang.Throwable -> L7a
            r7.<init>(r9)     // Catch: java.lang.Throwable -> L7a
            r5[r6] = r7     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r6 = r1.ipc$dispatch(r2, r5)     // Catch: java.lang.Throwable -> L7a
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L7a
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r0)
            return r6
        L2b:
            r1 = 0
            if (r6 == 0) goto L78
            boolean r2 = r6.isRecycled()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50 java.io.FileNotFoundException -> L62
            if (r2 == 0) goto L35
            goto L78
        L35:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50 java.io.FileNotFoundException -> L62
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50 java.io.FileNotFoundException -> L62
            r6.compress(r8, r9, r2)     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L48 java.io.FileNotFoundException -> L4b
            r2.flush()     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L48 java.io.FileNotFoundException -> L4b
            com.etao.feimagesearch.mnn.utils.d.a(r2)     // Catch: java.lang.Throwable -> L7a
            r4 = 1
            goto L70
        L45:
            r6 = move-exception
            r1 = r2
            goto L72
        L48:
            r6 = move-exception
            r1 = r2
            goto L51
        L4b:
            r6 = move-exception
            r1 = r2
            goto L63
        L4e:
            r6 = move-exception
            goto L72
        L50:
            r6 = move-exception
        L51:
            java.lang.String r7 = "MediaUtil"
            java.lang.String r8 = "writeBitmapStreamToFile(), "
            android.util.Log.e(r7, r8, r6)     // Catch: java.lang.Throwable -> L4e
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L70
        L5e:
            com.etao.feimagesearch.mnn.utils.d.a(r1)     // Catch: java.lang.Throwable -> L7a
            goto L70
        L62:
            r6 = move-exception
        L63:
            java.lang.String r7 = "MediaUtil"
            java.lang.String r8 = "file not found "
            android.util.Log.e(r7, r8, r6)     // Catch: java.lang.Throwable -> L4e
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L70
            goto L5e
        L70:
            monitor-exit(r0)
            return r4
        L72:
            if (r1 == 0) goto L77
            com.etao.feimagesearch.mnn.utils.d.a(r1)     // Catch: java.lang.Throwable -> L7a
        L77:
            throw r6     // Catch: java.lang.Throwable -> L7a
        L78:
            monitor-exit(r0)
            return r4
        L7a:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etao.feimagesearch.util.l.a(android.graphics.Bitmap, java.io.File, android.graphics.Bitmap$CompressFormat, int):boolean");
    }

    private static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        if (i < 10) {
            return "0" + i;
        }
        return String.valueOf(i);
    }

    public static String a(long j) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("780680c4", new Object[]{new Long(j)});
        }
        int i2 = (int) (j / 1000);
        int i3 = i2 / ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT;
        int i4 = (i2 - (i3 * ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT)) / 60;
        String str = a(i4) + ":" + a(i - (i4 * 60));
        if (i3 == 0) {
            return str;
        }
        return a(i3) + ":" + str;
    }
}
