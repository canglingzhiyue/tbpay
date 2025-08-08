package com.alibaba.security.realidentity;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* loaded from: classes3.dex */
public final class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f3394a = "FileUtils";
    public static final String b = "/realidentity";
    public static final int c = 8192;

    public static boolean a(String str, byte[] bArr, String str2) {
        ByteArrayInputStream byteArrayInputStream;
        FileOutputStream fileOutputStream;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8080da07", new Object[]{str, bArr, str2})).booleanValue();
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, str2);
            if (file2.exists()) {
                file2.delete();
            }
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                fileOutputStream = new FileOutputStream(file2);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            byteArrayInputStream = null;
        }
        try {
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = byteArrayInputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                fileOutputStream.write(bArr2, 0, read);
            }
            fileOutputStream.flush();
            try {
                byteArrayInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileOutputStream.close();
                return true;
            } catch (IOException e2) {
                e = e2;
                e.printStackTrace();
                return z;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            try {
                a.a(f3394a, "saveBytes2File got error " + th.getMessage(), th);
                if (byteArrayInputStream != null) {
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e4) {
                        e = e4;
                        z = false;
                        e.printStackTrace();
                        return z;
                    }
                }
                return false;
            } catch (Throwable th4) {
                if (byteArrayInputStream != null) {
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
                throw th4;
            }
        }
    }

    public static void b(File file, File file2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2183b317", new Object[]{file, file2});
            return;
        }
        if (!file2.exists()) {
            file2.mkdirs();
        }
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file));
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    return;
                }
                String name = nextEntry.getName();
                if (StringUtils.isEmpty(name) || !name.contains("../")) {
                    File file3 = new File(file2, name);
                    if (nextEntry.isDirectory()) {
                        file3.mkdirs();
                    } else {
                        file3.getParentFile().mkdirs();
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file3));
                        while (true) {
                            int read = zipInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            bufferedOutputStream.write(bArr, 0, read);
                        }
                        bufferedOutputStream.close();
                    }
                    zipInputStream.closeEntry();
                }
            }
        } finally {
            zipInputStream.close();
        }
    }

    public static long c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88097ea8", new Object[]{str})).longValue();
        }
        try {
            return d(new File(str));
        } catch (Exception e) {
            a.b(f3394a, e.getLocalizedMessage());
            return 0L;
        }
    }

    public static long d(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f396c516", new Object[]{file})).longValue();
        }
        long j = 0;
        if (file.exists()) {
            FileInputStream fileInputStream = null;
            try {
                try {
                    try {
                        FileInputStream fileInputStream2 = new FileInputStream(file);
                        try {
                            j = fileInputStream2.available();
                            fileInputStream2.close();
                        } catch (Exception e) {
                            e = e;
                            fileInputStream = fileInputStream2;
                            a.b(f3394a, e.getLocalizedMessage());
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return j;
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException e2) {
                                    a.a(f3394a, e2);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (IOException e4) {
                a.a(f3394a, e4);
            }
        }
        return j;
    }

    public static String c(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1d50a57", new Object[]{context, uri}) : a(context, uri, null, null);
    }

    public static boolean c(File file) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("25ec6365", new Object[]{file})).booleanValue() : file != null && (!file.exists() || (file.isFile() && file.delete()));
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{str})).booleanValue() : new File(str).exists();
    }

    public static String b(Context context, String str, String str2) {
        StringBuilder sb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3b17b6d", new Object[]{context, str, str2});
        }
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir != null) {
            sb = new StringBuilder();
            sb.append(externalCacheDir.getAbsolutePath());
            sb.append(File.separator);
        } else {
            File cacheDir = context.getCacheDir();
            if (cacheDir != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cacheDir.getAbsolutePath());
                sb2.append(File.separator);
                sb = sb2;
            } else {
                sb = null;
            }
        }
        if (sb == null) {
            return null;
        }
        if (!StringUtils.isEmpty(str)) {
            sb.append(str);
            sb.append(File.separator);
            sb.append(str2);
        }
        return sb.toString();
    }

    public static String b(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("83740678", new Object[]{context, uri});
        }
        if (DocumentsContract.isDocumentUri(context, uri)) {
            String documentId = DocumentsContract.getDocumentId(uri);
            if (b(uri)) {
                return a(context, MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_id=?", new String[]{documentId.split(":")[1]});
            }
            if (!a(uri)) {
                return null;
            }
            return a(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), null, null);
        } else if ("content".equalsIgnoreCase(uri.getScheme())) {
            return a(context, uri, null, null);
        } else {
            if (!"file".equals(uri.getScheme())) {
                return null;
            }
            return uri.getPath();
        }
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        return context.getFilesDir().getAbsolutePath() + b;
    }

    public static String a(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5130299", new Object[]{context, uri});
        }
        if (Build.VERSION.SDK_INT >= 19) {
            return b(context, uri);
        }
        return c(context, uri);
    }

    public static String a(Context context, Uri uri, String str, String[] strArr) {
        Cursor cursor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86eea7d2", new Object[]{context, uri, str, strArr});
        }
        String[] strArr2 = {"_data"};
        try {
            cursor = context.getContentResolver().query(uri, strArr2, str, strArr, null);
            if (cursor == null) {
                return null;
            }
            try {
                if (!cursor.moveToFirst()) {
                    return null;
                }
                return cursor.getString(cursor.getColumnIndexOrThrow(strArr2[0]));
            } catch (Exception unused) {
                if (cursor == null) {
                    return null;
                }
                cursor.close();
                return null;
            }
        } catch (Exception unused2) {
            cursor = null;
        }
    }

    public static boolean b(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("38284082", new Object[]{uri})).booleanValue() : "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            File file = new File(str);
            if (!file.exists()) {
                return;
            }
            try {
                file.delete();
            } catch (Exception unused) {
            }
        }
    }

    public static boolean a(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b1a285e3", new Object[]{uri})).booleanValue() : "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static synchronized boolean a(String str, byte[] bArr) {
        synchronized (f.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a35a7c7d", new Object[]{str, bArr})).booleanValue();
            }
            return a(new File(str), bArr);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0060, code lost:
        if (r2 != null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized boolean a(java.io.File r6, byte[] r7) {
        /*
            java.lang.Class<com.alibaba.security.realidentity.f> r0 = com.alibaba.security.realidentity.f.class
            monitor-enter(r0)
            com.android.alibaba.ip.runtime.IpChange r1 = com.alibaba.security.realidentity.f.$ipChange     // Catch: java.lang.Throwable -> L68
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange     // Catch: java.lang.Throwable -> L68
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L20
            java.lang.String r2 = "434598ea"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L68
            r5[r4] = r6     // Catch: java.lang.Throwable -> L68
            r5[r3] = r7     // Catch: java.lang.Throwable -> L68
            java.lang.Object r6 = r1.ipc$dispatch(r2, r5)     // Catch: java.lang.Throwable -> L68
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L68
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L68
            monitor-exit(r0)
            return r6
        L20:
            if (r6 == 0) goto L66
            if (r7 == 0) goto L66
            r6.mkdirs()     // Catch: java.lang.Throwable -> L68
            boolean r1 = r6.exists()     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L31
            r6.delete()     // Catch: java.lang.Throwable -> L68
            goto L3e
        L31:
            r6.createNewFile()     // Catch: java.lang.Throwable -> L35
            goto L3e
        L35:
            r1 = move-exception
            java.lang.String r2 = "FileUtils"
            com.alibaba.security.realidentity.a.a(r2, r1)     // Catch: java.lang.Throwable -> L68
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L68
        L3e:
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L58
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L58
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L56
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L56
            r6.write(r7)     // Catch: java.lang.Throwable -> L54
            r6.flush()     // Catch: java.lang.Throwable -> L54
            r6.close()     // Catch: java.io.IOException -> L52 java.lang.Throwable -> L68
        L52:
            r4 = 1
            goto L63
        L54:
            r1 = r6
            goto L59
        L56:
            goto L59
        L58:
            r2 = r1
        L59:
            if (r1 == 0) goto L60
            r1.close()     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L68
            goto L60
        L5f:
        L60:
            if (r2 != 0) goto L63
            goto L66
        L63:
            r2.close()     // Catch: java.io.IOException -> L66 java.lang.Throwable -> L68
        L66:
            monitor-exit(r0)
            return r4
        L68:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.security.realidentity.f.a(java.io.File, byte[]):boolean");
    }

    public static boolean b(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("584201a4", new Object[]{file})).booleanValue();
        }
        if (file == null) {
            return false;
        }
        if (!file.exists()) {
            return true;
        }
        if (!file.isDirectory()) {
            return false;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    if (!file2.delete()) {
                        return false;
                    }
                } else if (file2.isDirectory() && !b(file2)) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    public static boolean b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b80d80d", new Object[]{context, str})).booleanValue();
        }
        try {
            context.getAssets().open(str).close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r3 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (r3 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] a(android.content.Context r3, java.lang.String r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.security.realidentity.f.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L18
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            java.lang.String r3 = "d5108ff3"
            java.lang.Object r3 = r0.ipc$dispatch(r3, r1)
            byte[] r3 = (byte[]) r3
            return r3
        L18:
            r0 = 0
            android.content.res.AssetManager r3 = r3.getAssets()     // Catch: java.lang.Throwable -> L28
            java.io.InputStream r3 = r3.open(r4)     // Catch: java.lang.Throwable -> L28
            byte[] r0 = a(r3)     // Catch: java.lang.Throwable -> L29
            if (r3 == 0) goto L2f
            goto L2c
        L28:
            r3 = r0
        L29:
            if (r3 != 0) goto L2c
            goto L2f
        L2c:
            r3.close()     // Catch: java.io.IOException -> L2f
        L2f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.security.realidentity.f.a(android.content.Context, java.lang.String):byte[]");
    }

    public static final byte[] a(InputStream inputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("bfed3712", new Object[]{inputStream});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr, 0, 100);
            if (read > 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            }
        }
    }

    public static boolean a(String str) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : new File(str).createNewFile();
    }

    public static boolean a(File file, File file2) {
        Throwable th;
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3abf71a", new Object[]{file, file2})).booleanValue();
        }
        FileInputStream fileInputStream2 = null;
        r0 = null;
        FileOutputStream fileOutputStream2 = null;
        try {
            if (file.exists()) {
                if (!file2.getParentFile().exists()) {
                    file2.getParentFile().mkdirs();
                }
                if (!file2.exists()) {
                    file2.createNewFile();
                }
                fileInputStream = new FileInputStream(file);
                try {
                    fileOutputStream = new FileOutputStream(file2);
                } catch (Exception unused) {
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                }
                try {
                    byte[] bArr = new byte[2048];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    fileOutputStream.flush();
                    try {
                        fileInputStream.close();
                    } catch (IOException unused2) {
                    }
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                    }
                    return true;
                } catch (Exception unused4) {
                    fileOutputStream2 = fileOutputStream;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused5) {
                        }
                    }
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException unused6) {
                        }
                    }
                    return false;
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream2 = fileInputStream;
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused7) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused8) {
                        }
                    }
                    throw th;
                }
            }
        } catch (Exception unused9) {
            fileInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
        return false;
    }

    public static boolean a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a979fe3", new Object[]{file})).booleanValue();
        }
        if (file == null) {
            return false;
        }
        if (file.isDirectory()) {
            return b(file);
        }
        return c(file);
    }

    public static boolean a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d18de978", new Object[]{context, str, str2})).booleanValue();
        }
        byte[] a2 = a(context, str);
        if (a2 != null) {
            return a(str2, a2);
        }
        return false;
    }
}
