package com.meizu.cloud.pushsdk.notification.g;

import mtopsdk.common.util.StringUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.taobao.android.litecreator.util.k;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: com.meizu.cloud.pushsdk.notification.g.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    class C0291a implements FileFilter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f8002a;

        C0291a(String str) {
            this.f8002a = str;
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            try {
                return Long.valueOf(this.f8002a).longValue() > Long.valueOf(file.getName().split("-")[1]).longValue();
            } catch (Exception e) {
                DebugLogger.e(k.TAG, "filters file error " + e.getMessage());
                return true;
            }
        }
    }

    public static void a(String str, String str2) {
        String[] list;
        try {
            new File(str2).mkdirs();
            for (String str3 : new File(str).list()) {
                String str4 = File.separator;
                File file = str.endsWith(str4) ? new File(str + str3) : new File(str + str4 + str3);
                if (file.isFile()) {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    FileOutputStream fileOutputStream = new FileOutputStream(str2 + "/" + file.getName());
                    byte[] bArr = new byte[5120];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    fileInputStream.close();
                } else if (file.isDirectory()) {
                    a(str + "/" + str3, str2 + "/" + str3);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean a(String str) {
        File[] listFiles;
        if (!StringUtils.isEmpty(str) && !str.contains("../")) {
            String str2 = File.separator;
            if (!str.endsWith(str2)) {
                str = str + str2;
            }
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                boolean z = true;
                for (File file2 : file.listFiles()) {
                    if (!file2.isFile()) {
                        z = a(file2.getAbsolutePath());
                        if (!z) {
                            break;
                        }
                    } else {
                        z = b(file2.getAbsolutePath());
                        if (!z) {
                            break;
                        }
                    }
                }
                if (z) {
                    return file.delete();
                }
                return false;
            }
        }
        return false;
    }

    public static boolean b(String str) {
        if (!StringUtils.isEmpty(str) && !str.contains("../")) {
            File file = new File(str);
            if (file.isFile() && file.exists()) {
                return file.delete();
            }
        }
        return false;
    }

    public static File[] b(String str, String str2) {
        File file = new File(str);
        return file.isDirectory() ? file.listFiles(new C0291a(str2)) : new File[0];
    }

    public static String c(String str) {
        BufferedReader bufferedReader;
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            bufferedReader = null;
        }
        if (bufferedReader == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                    }
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    throw th;
                }
            } catch (IOException e3) {
                e3.printStackTrace();
            }
            try {
                break;
            } catch (IOException e4) {
                e4.printStackTrace();
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(java.lang.String r3, java.lang.String r4) {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L10 java.io.IOException -> L2c
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L10 java.io.IOException -> L2c
            boolean r3 = r1.exists()     // Catch: java.lang.Throwable -> L10 java.io.IOException -> L2c
            if (r3 != 0) goto L12
            r1.createNewFile()     // Catch: java.lang.Throwable -> L10 java.io.IOException -> L2c
            goto L12
        L10:
            r3 = move-exception
            goto L40
        L12:
            java.io.BufferedWriter r3 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> L10 java.io.IOException -> L2c
            java.io.FileWriter r2 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L10 java.io.IOException -> L2c
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L10 java.io.IOException -> L2c
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L10 java.io.IOException -> L2c
            char[] r4 = r4.toCharArray()     // Catch: java.io.IOException -> L2a java.lang.Throwable -> L3d
            r3.write(r4)     // Catch: java.io.IOException -> L2a java.lang.Throwable -> L3d
            r3.flush()     // Catch: java.io.IOException -> L2a java.lang.Throwable -> L3d
            r3.close()     // Catch: java.io.IOException -> L38
            return
        L2a:
            r4 = move-exception
            goto L2f
        L2c:
            r3 = move-exception
            r4 = r3
            r3 = r0
        L2f:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L3d
            if (r3 == 0) goto L3c
            r3.close()     // Catch: java.io.IOException -> L38
            return
        L38:
            r3 = move-exception
            r3.printStackTrace()
        L3c:
            return
        L3d:
            r4 = move-exception
            r0 = r3
            r3 = r4
        L40:
            if (r0 == 0) goto L4a
            r0.close()     // Catch: java.io.IOException -> L46
            goto L4a
        L46:
            r4 = move-exception
            r4.printStackTrace()
        L4a:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.notification.g.a.c(java.lang.String, java.lang.String):void");
    }
}
