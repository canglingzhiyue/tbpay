package com.alipay.mobile.common.logging.util;

import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class FileUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean isCanUseSdCard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("851fcd4d", new Object[0])).booleanValue();
        }
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Throwable th) {
            new StringBuilder("isCanUseSdCard: ").append(th);
            return false;
        }
    }

    public static String getSDPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b7fb18d", new Object[0]);
        }
        if (!isCanUseSdCard()) {
            return null;
        }
        try {
            return Environment.getExternalStorageDirectory().getPath();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean isSDcardAvailableSpace(long j) {
        StatFs statFs;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27d378f9", new Object[]{new Long(j)})).booleanValue();
        }
        String sDPath = getSDPath();
        if (sDPath == null) {
            return false;
        }
        try {
            statFs = new StatFs(sDPath);
        } catch (Throwable unused) {
        }
        return j < (((long) statFs.getAvailableBlocks()) - 4) * ((long) statFs.getBlockSize());
    }

    public static boolean isAppAvailableSpace(long j) {
        StatFs statFs;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f64a536d", new Object[]{new Long(j)})).booleanValue();
        }
        File dataDirectory = Environment.getDataDirectory();
        if (dataDirectory == null) {
            return false;
        }
        try {
            statFs = new StatFs(dataDirectory.getPath());
        } catch (Throwable unused) {
        }
        return j < ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }

    public static void deleteFileNotDir(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("951dc8df", new Object[]{file});
        } else if (file == null) {
        } else {
            try {
                if (!file.exists() || !file.isFile()) {
                    return;
                }
                file.delete();
            } catch (Throwable unused) {
                new StringBuilder("deleteFileNotDir: ").append(file.getAbsolutePath());
            }
        }
    }

    public static void deleteFileByPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25587414", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            deleteFileNotDir(new File(str));
        }
    }

    public static String getTraceFile() {
        Object obj = null;
        try {
            obj = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, "dalvik.vm.stack-trace-file");
        } catch (Throwable unused) {
        }
        return obj == null ? "/data/anr/traces.txt" : obj.toString();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public static java.lang.String readAssetFile(android.content.Context r6, java.lang.String r7) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.mobile.common.logging.util.FileUtil.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L18
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r6
            r6 = 1
            r1[r6] = r7
            java.lang.String r6 = "fb49faeb"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.lang.String r6 = (java.lang.String) r6
            return r6
        L18:
            r0 = 0
            if (r6 == 0) goto L70
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 == 0) goto L22
            goto L70
        L22:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            android.content.res.Resources r6 = r6.getResources()     // Catch: java.lang.Throwable -> L6a
            if (r6 != 0) goto L2e
            return r0
        L2e:
            android.content.res.AssetManager r6 = r6.getAssets()     // Catch: java.lang.Throwable -> L6a
            java.io.InputStream r6 = r6.open(r7)     // Catch: java.lang.Throwable -> L6a
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L60
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L60
            r6 = 8192(0x2000, float:1.14794E-41)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L59
        L3f:
            int r3 = r7.read(r6)     // Catch: java.lang.Throwable -> L59
            r4 = -1
            if (r3 == r4) goto L4f
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L59
            r4.<init>(r6, r2, r3)     // Catch: java.lang.Throwable -> L59
            r1.append(r4)     // Catch: java.lang.Throwable -> L59
            goto L3f
        L4f:
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Throwable -> L59
            r7.close()     // Catch: java.lang.Throwable -> L56
        L56:
            return r6
        L57:
            r6 = move-exception
            goto L64
        L59:
            r6 = r7
            goto L6b
        L5b:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
            goto L64
        L60:
            goto L6b
        L62:
            r6 = move-exception
            r7 = r0
        L64:
            if (r7 == 0) goto L69
            r7.close()     // Catch: java.lang.Throwable -> L69
        L69:
            throw r6
        L6a:
            r6 = r0
        L6b:
            if (r6 == 0) goto L70
            r6.close()     // Catch: java.lang.Throwable -> L70
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.util.FileUtil.readAssetFile(android.content.Context, java.lang.String):java.lang.String");
    }

    public static String readFile(File file) {
        FileInputStream fileInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("856bcd30", new Object[]{file});
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            String str = new String(bArr, "UTF-8");
            try {
                fileInputStream.close();
            } catch (Throwable unused) {
            }
            return str;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            try {
                throw new IOException(th);
            } catch (Throwable th3) {
                FileInputStream fileInputStream3 = fileInputStream2;
                if (fileInputStream3 != null) {
                    try {
                        fileInputStream3.close();
                    } catch (Throwable unused2) {
                    }
                }
                throw th3;
            }
        }
    }

    public static byte[] toByteArray(File file) {
        BufferedInputStream bufferedInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("9624d129", new Object[]{file});
        }
        if (file == null || !file.exists()) {
            throw new IOException();
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) file.length());
        BufferedInputStream bufferedInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = bufferedInputStream.read(bArr, 0, 1024);
                if (-1 == read) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                bufferedInputStream.close();
            } catch (Throwable unused) {
            }
            try {
                byteArrayOutputStream.close();
            } catch (Throwable unused2) {
            }
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream2 = bufferedInputStream;
            try {
                throw th;
            } catch (Throwable th3) {
                if (bufferedInputStream2 != null) {
                    try {
                        bufferedInputStream2.close();
                    } catch (Throwable unused3) {
                    }
                }
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable unused4) {
                }
                throw th3;
            }
        }
    }

    public static String readFileStringFully(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a735aa9b", new Object[]{file});
        }
        byte[] readFileByteFully = readFileByteFully(file);
        if (readFileByteFully == null) {
            return null;
        }
        try {
            return new String(readFileByteFully);
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    public static byte[] readFileByteFully(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("9b52654f", new Object[]{file});
        }
        FileInputStream fileInputStream = null;
        if (file != null) {
            try {
                if (!file.isDirectory() && file.isFile() && file.exists()) {
                    if (file.length() == 0) {
                        return new byte[0];
                    }
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[fileInputStream2.available()];
                        int i = 0;
                        while (true) {
                            int read = fileInputStream2.read(bArr, i, bArr.length - i);
                            if (read > 0) {
                                i += read;
                                int available = fileInputStream2.available();
                                if (available > bArr.length - i) {
                                    byte[] bArr2 = new byte[available + i];
                                    System.arraycopy(bArr, 0, bArr2, 0, i);
                                    bArr = bArr2;
                                }
                            } else {
                                try {
                                    break;
                                } catch (Throwable unused) {
                                }
                            }
                        }
                        fileInputStream2.close();
                        return bArr;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        try {
                            throw new IOException(th);
                        } catch (Throwable th2) {
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Throwable unused2) {
                                }
                            }
                            throw th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return null;
    }

    public static void writeFile(File file, byte[] bArr, boolean z) {
        FileOutputStream fileOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d576154", new Object[]{file, bArr, new Boolean(z)});
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            fileOutputStream = new FileOutputStream(file, z);
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            try {
                throw new IOException(th);
            } catch (Throwable th3) {
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (Throwable unused2) {
                    }
                }
                throw th3;
            }
        }
    }

    public static void writeFile(File file, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a839eb1", new Object[]{file, str, new Boolean(z)});
            return;
        }
        try {
            writeFile(file, str.getBytes("UTF-8"), z);
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    public static void moveFile(File file, File file2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39171ba2", new Object[]{file, file2});
            return;
        }
        try {
            if (!file.renameTo(file2)) {
                copyFile(file, file2);
                file.delete();
            }
            if (!file.exists() && file2.exists()) {
                return;
            }
            throw new Exception("move file fail");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public static void copyFile(java.io.File r10, java.io.File r11) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.mobile.common.logging.util.FileUtil.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r10
            r10 = 1
            r1[r10] = r11
            java.lang.String r10 = "13188d46"
            r0.ipc$dispatch(r10, r1)
            return
        L15:
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L6e
            r1.<init>(r10)     // Catch: java.lang.Throwable -> L6e
            java.nio.channels.FileChannel r10 = r1.getChannel()     // Catch: java.lang.Throwable -> L63
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5c
            r8.<init>(r11)     // Catch: java.lang.Throwable -> L5c
            java.nio.channels.FileChannel r0 = r8.getChannel()     // Catch: java.lang.Throwable -> L54
            r3 = 0
            long r5 = r10.size()     // Catch: java.lang.Throwable -> L54
            r2 = r10
            r7 = r0
            r2.transferTo(r3, r5, r7)     // Catch: java.lang.Throwable -> L54
            boolean r11 = r11.exists()     // Catch: java.lang.Throwable -> L54
            if (r11 == 0) goto L4a
            r1.close()     // Catch: java.lang.Throwable -> L3c
        L3c:
            if (r10 == 0) goto L41
            r10.close()     // Catch: java.lang.Throwable -> L41
        L41:
            r8.close()     // Catch: java.lang.Throwable -> L44
        L44:
            if (r0 == 0) goto L49
            r0.close()     // Catch: java.lang.Throwable -> L49
        L49:
            return
        L4a:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L54
            java.lang.String r2 = "copy file fail"
            r11.<init>(r2)     // Catch: java.lang.Throwable -> L54
            throw r11     // Catch: java.lang.Throwable -> L54
        L52:
            r11 = move-exception
            goto L7c
        L54:
            r11 = move-exception
            r9 = r1
            r1 = r0
            r0 = r9
            goto L72
        L59:
            r11 = move-exception
            r8 = r0
            goto L7c
        L5c:
            r11 = move-exception
            r8 = r0
            goto L66
        L5f:
            r11 = move-exception
            r10 = r0
            r8 = r10
            goto L7c
        L63:
            r11 = move-exception
            r10 = r0
            r8 = r10
        L66:
            r0 = r1
            r1 = r8
            goto L72
        L69:
            r11 = move-exception
            r10 = r0
            r1 = r10
            r8 = r1
            goto L7c
        L6e:
            r11 = move-exception
            r10 = r0
            r1 = r10
            r8 = r1
        L72:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L78
            r2.<init>(r11)     // Catch: java.lang.Throwable -> L78
            throw r2     // Catch: java.lang.Throwable -> L78
        L78:
            r11 = move-exception
            r9 = r1
            r1 = r0
            r0 = r9
        L7c:
            if (r1 == 0) goto L83
            r1.close()     // Catch: java.lang.Throwable -> L82
            goto L83
        L82:
        L83:
            if (r10 == 0) goto L8a
            r10.close()     // Catch: java.lang.Throwable -> L89
            goto L8a
        L89:
        L8a:
            if (r8 == 0) goto L91
            r8.close()     // Catch: java.lang.Throwable -> L90
            goto L91
        L90:
        L91:
            if (r0 == 0) goto L96
            r0.close()     // Catch: java.lang.Throwable -> L96
        L96:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.util.FileUtil.copyFile(java.io.File, java.io.File):void");
    }

    public static long getFolderSize(File file) {
        long folderSize;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e7045ff7", new Object[]{file})).longValue();
        }
        if (file != null && file.exists() && file.isDirectory()) {
            try {
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length != 0) {
                    long j = 0;
                    for (File file2 : listFiles) {
                        if (file2 != null && file2.exists()) {
                            if (file2.isFile()) {
                                folderSize = file2.length();
                            } else {
                                folderSize = getFolderSize(file2);
                            }
                            j += folderSize;
                        }
                    }
                    return j;
                }
                return 0L;
            } catch (Throwable unused) {
                file.getAbsolutePath();
            }
        }
        return 0L;
    }
}
