package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: classes8.dex */
public class qcg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-242437167);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (!StringUtils.isEmpty(str)) {
            return new File(str).exists();
        }
        return false;
    }

    public static boolean a(File file) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8a979fe3", new Object[]{file})).booleanValue() : file != null && file.exists();
    }

    public static long a(File file, int i) {
        long length;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c85ccef8", new Object[]{file, new Integer(i)})).longValue();
        }
        long j = 0;
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return 0L;
        }
        for (int i2 = 0; i2 < listFiles.length; i2++) {
            if (listFiles[i2].isDirectory()) {
                length = a(listFiles[i2], i);
            } else {
                length = listFiles[i2].length();
            }
            j += length;
            if (j > i) {
                return j;
            }
        }
        return j;
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return true;
        }
        File file = new File(str);
        if (!file.exists()) {
            return true;
        }
        if (!file.isDirectory()) {
            return false;
        }
        File[] listFiles = file.listFiles();
        return listFiles == null || listFiles.length <= 0;
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue() : b(new File(str));
    }

    public static boolean b(File file) {
        String[] list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("584201a4", new Object[]{file})).booleanValue();
        }
        if (file.isDirectory() && (list = file.list()) != null && list.length > 0) {
            for (String str : list) {
                if (!b(new File(file, str))) {
                    return false;
                }
            }
        }
        try {
            return file.delete();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static boolean a(File file, File file2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3abf71a", new Object[]{file, file2})).booleanValue();
        }
        if (file == null || file2 == null) {
            return false;
        }
        try {
            String canonicalPath = file.getCanonicalPath();
            String canonicalPath2 = file2.getCanonicalPath();
            if (!canonicalPath2.endsWith("/")) {
                canonicalPath2 = canonicalPath2 + "/";
            }
            return canonicalPath.startsWith(canonicalPath2);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void a(String str, String str2) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            a(str, str2, Charset.forName("gbk"));
        }
    }

    public static void b(String str, String str2) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else {
            a(str, str2, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[Catch: all -> 0x00dd, TryCatch #2 {all -> 0x00dd, blocks: (B:12:0x0037, B:14:0x003d, B:16:0x0049, B:18:0x004f, B:19:0x0075, B:21:0x0099, B:23:0x00a3, B:24:0x00aa, B:32:0x00c4, B:37:0x00cd, B:38:0x00d0, B:39:0x00d1, B:40:0x00d8), top: B:53:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9 A[EDGE_INSN: B:57:0x00d9->B:41:0x00d9 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(java.lang.String r6, java.lang.String r7, java.nio.charset.Charset r8) throws java.lang.Throwable {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.qcg.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L18
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r6
            r1[r2] = r7
            r6 = 2
            r1[r6] = r8
            java.lang.String r6 = "71e9f8ca"
            r0.ipc$dispatch(r6, r1)
            return
        L18:
            r0 = 0
            if (r8 == 0) goto L2d
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Ldf
            r4 = 24
            if (r1 < r4) goto L2d
            java.util.zip.ZipInputStream r1 = new java.util.zip.ZipInputStream     // Catch: java.lang.Throwable -> Ldf
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Ldf
            r4.<init>(r6)     // Catch: java.lang.Throwable -> Ldf
            r1.<init>(r4, r8)     // Catch: java.lang.Throwable -> Ldf
            r8 = r1
            goto L37
        L2d:
            java.util.zip.ZipInputStream r8 = new java.util.zip.ZipInputStream     // Catch: java.lang.Throwable -> Ldf
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Ldf
            r1.<init>(r6)     // Catch: java.lang.Throwable -> Ldf
            r8.<init>(r1)     // Catch: java.lang.Throwable -> Ldf
        L37:
            java.util.zip.ZipEntry r6 = r8.getNextEntry()     // Catch: java.lang.Throwable -> Ldd
            if (r6 == 0) goto Ld9
            java.lang.String r1 = r6.getName()     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r4 = "../"
            boolean r4 = r1.contains(r4)     // Catch: java.lang.Throwable -> Ldd
            if (r4 != 0) goto Ld1
            boolean r6 = r6.isDirectory()     // Catch: java.lang.Throwable -> Ldd
            if (r6 == 0) goto L75
            int r6 = r1.length()     // Catch: java.lang.Throwable -> Ldd
            int r6 = r6 - r2
            java.lang.String r6 = r1.substring(r3, r6)     // Catch: java.lang.Throwable -> Ldd
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> Ldd
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldd
            r4.<init>()     // Catch: java.lang.Throwable -> Ldd
            r4.append(r7)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r5 = java.io.File.separator     // Catch: java.lang.Throwable -> Ldd
            r4.append(r5)     // Catch: java.lang.Throwable -> Ldd
            r4.append(r6)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> Ldd
            r1.<init>(r6)     // Catch: java.lang.Throwable -> Ldd
            r1.mkdirs()     // Catch: java.lang.Throwable -> Ldd
            goto L37
        L75:
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> Ldd
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldd
            r4.<init>()     // Catch: java.lang.Throwable -> Ldd
            r4.append(r7)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r5 = java.io.File.separator     // Catch: java.lang.Throwable -> Ldd
            r4.append(r5)     // Catch: java.lang.Throwable -> Ldd
            r4.append(r1)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> Ldd
            r6.<init>(r1)     // Catch: java.lang.Throwable -> Ldd
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> Ldd
            r1.<init>(r7)     // Catch: java.lang.Throwable -> Ldd
            boolean r1 = a(r6, r1)     // Catch: java.lang.Throwable -> Ldd
            if (r1 == 0) goto Ld9
            java.io.File r1 = r6.getParentFile()     // Catch: java.lang.Throwable -> Ldd
            boolean r1 = r1.exists()     // Catch: java.lang.Throwable -> Ldd
            if (r1 != 0) goto Laa
            java.io.File r1 = r6.getParentFile()     // Catch: java.lang.Throwable -> Ldd
            r1.mkdirs()     // Catch: java.lang.Throwable -> Ldd
        Laa:
            r6.createNewFile()     // Catch: java.lang.Throwable -> Ldd
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lcb
            r1.<init>(r6)     // Catch: java.lang.Throwable -> Lcb
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> Lc9
        Lb6:
            int r4 = r8.read(r6)     // Catch: java.lang.Throwable -> Lc9
            r5 = -1
            if (r4 == r5) goto Lc4
            r1.write(r6, r3, r4)     // Catch: java.lang.Throwable -> Lc9
            r1.flush()     // Catch: java.lang.Throwable -> Lc9
            goto Lb6
        Lc4:
            tb.qch.a(r1)     // Catch: java.lang.Throwable -> Ldd
            goto L37
        Lc9:
            r6 = move-exception
            goto Lcd
        Lcb:
            r6 = move-exception
            r1 = r0
        Lcd:
            tb.qch.a(r1)     // Catch: java.lang.Throwable -> Ldd
            throw r6     // Catch: java.lang.Throwable -> Ldd
        Ld1:
            java.lang.SecurityException r6 = new java.lang.SecurityException     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r7 = "Invalid zip entry found!"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Ldd
            throw r6     // Catch: java.lang.Throwable -> Ldd
        Ld9:
            tb.qch.a(r8)
            return
        Ldd:
            r6 = move-exception
            goto Le1
        Ldf:
            r6 = move-exception
            r8 = r0
        Le1:
            tb.qch.a(r8)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.qcg.a(java.lang.String, java.lang.String, java.nio.charset.Charset):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean c(String str, String str2) {
        IpChange ipChange = $ipChange;
        boolean z = ipChange instanceof IpChange;
        if (z) {
            return ((Boolean) ipChange.ipc$dispatch("f277e382", new Object[]{str, str2})).booleanValue();
        }
        File file = new File(str);
        File parentFile = file.getParentFile();
        FileOutputStream fileOutputStream = z;
        if (parentFile != null) {
            boolean exists = parentFile.exists();
            fileOutputStream = exists;
            if (!exists) {
                try {
                    fileOutputStream = exists;
                    if (!parentFile.mkdirs()) {
                        return false;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return false;
                }
            }
        }
        if (!file.exists()) {
            try {
                if (!file.createNewFile()) {
                    return false;
                }
            } catch (IOException e2) {
                e2.printStackTrace();
                return false;
            }
        }
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(fileOutputStream);
                    try {
                        bufferedOutputStream2.write(str2.getBytes());
                        try {
                            bufferedOutputStream2.close();
                            fileOutputStream.close();
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                        return true;
                    } catch (Exception e4) {
                        e = e4;
                        bufferedOutputStream = bufferedOutputStream2;
                        e.printStackTrace();
                        if (bufferedOutputStream != null) {
                            try {
                                bufferedOutputStream.close();
                            } catch (Exception e5) {
                                e5.printStackTrace();
                                return false;
                            }
                        }
                        if (fileOutputStream != 0) {
                            fileOutputStream.close();
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream = bufferedOutputStream2;
                        if (bufferedOutputStream != null) {
                            try {
                                bufferedOutputStream.close();
                            } catch (Exception e6) {
                                e6.printStackTrace();
                                throw th;
                            }
                        }
                        if (fileOutputStream != 0) {
                            fileOutputStream.close();
                        }
                        throw th;
                    }
                } catch (Exception e7) {
                    e = e7;
                }
            } catch (Exception e8) {
                e = e8;
                fileOutputStream = 0;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = 0;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static String d(String str) {
        FileInputStream fileInputStream;
        BufferedInputStream bufferedInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{str});
        }
        File file = new File(str);
        if (!file.exists() || file.isDirectory()) {
            return "";
        }
        int length = (int) file.length();
        byte[] bArr = new byte[length];
        BufferedInputStream bufferedInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        bufferedInputStream = new BufferedInputStream(fileInputStream);
                        try {
                        } catch (Exception e) {
                            e = e;
                            bufferedInputStream2 = bufferedInputStream;
                            e.printStackTrace();
                            if (bufferedInputStream2 != null) {
                                bufferedInputStream2.close();
                            }
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return new String(bArr);
                        } catch (Throwable th) {
                            th = th;
                            bufferedInputStream2 = bufferedInputStream;
                            if (bufferedInputStream2 != null) {
                                try {
                                    bufferedInputStream2.close();
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                    throw th;
                                }
                            }
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Exception e4) {
                e = e4;
                fileInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (bufferedInputStream.read(bArr, 0, length) >= length) {
            bufferedInputStream.close();
            fileInputStream.close();
            return new String(bArr);
        }
        try {
            bufferedInputStream.close();
            fileInputStream.close();
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        return "";
    }

    public static String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("666b162a", new Object[]{str});
        }
        try {
            if (str.contains("?")) {
                return str.substring(str.lastIndexOf("/") + 1, str.lastIndexOf("?"));
            }
            return str.substring(str.lastIndexOf("/") + 1);
        } catch (Exception unused) {
            return "";
        }
    }
}
