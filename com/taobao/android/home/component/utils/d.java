package com.taobao.android.home.component.utils;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import tb.kge;

/* loaded from: classes5.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f12726a;

    static {
        kge.a(857579282);
        f12726a = null;
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        if (!TextUtils.isEmpty(f12726a)) {
            return f12726a;
        }
        File filesDir = context.getFilesDir();
        if (filesDir != null && !filesDir.canWrite()) {
            filesDir = null;
        }
        if (filesDir == null && (filesDir = context.getCacheDir()) != null && !filesDir.canWrite()) {
            filesDir = null;
        }
        if (filesDir == null) {
            try {
                filesDir = context.getExternalFilesDir(null);
            } catch (Exception e) {
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                e.e("FileStore", "AndroidFileSystemInitDirError" + message);
                filesDir = null;
            }
            if (filesDir != null && !filesDir.canWrite()) {
                filesDir = null;
            }
            if (filesDir == null) {
                File externalCacheDir = context.getExternalCacheDir();
                filesDir = (externalCacheDir == null || externalCacheDir.canWrite()) ? externalCacheDir : null;
            }
        }
        if (filesDir == null) {
            return "";
        }
        String absolutePath = new File(filesDir, "fast_store").getAbsolutePath();
        f12726a = absolutePath;
        return absolutePath;
    }

    public static boolean a(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a35a7c7d", new Object[]{str, bArr})).booleanValue() : a(new File(str), bArr);
    }

    public static boolean a(File file, byte[] bArr) {
        BufferedOutputStream bufferedOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("434598ea", new Object[]{file, bArr})).booleanValue();
        }
        if (bArr == null || file == null) {
            return false;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedOutputStream.write(bArr);
            try {
                bufferedOutputStream.close();
            } catch (Throwable th2) {
                e.a("FileTools", "Close file output stream exception", th2);
            }
            return true;
        } catch (Throwable th3) {
            th = th3;
            bufferedOutputStream2 = bufferedOutputStream;
            try {
                e.a("FileTools", "Write file exception", th);
                return false;
            } finally {
                if (bufferedOutputStream2 != null) {
                    try {
                        bufferedOutputStream2.close();
                    } catch (Throwable th4) {
                        e.a("FileTools", "Close file output stream exception", th4);
                    }
                }
            }
        }
    }

    public static byte[] a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("c85c5cde", new Object[]{file});
        }
        try {
            return b(file);
        } catch (IOException e) {
            e.a("FileTools", "Read all bytes exception", e);
            return null;
        }
    }

    private static byte[] b(File file) throws IOException {
        int read;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("affe333d", new Object[]{file});
        }
        long length = file.length();
        if (length > 2147483639) {
            throw new OutOfMemoryError("Required array size too large");
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        int i2 = (int) length;
        byte[] bArr = new byte[i2];
        while (true) {
            int read2 = fileInputStream.read(bArr, i, i2 - i);
            if (read2 > 0) {
                i += read2;
            } else if (read2 < 0 || (read = fileInputStream.read()) < 0) {
                break;
            } else {
                if (i2 <= 2147483639 - i2) {
                    i2 = Math.max(i2 << 1, 8192);
                } else if (i2 == 2147483639) {
                    throw new OutOfMemoryError("Required array size too large");
                } else {
                    i2 = 2147483639;
                }
                bArr = Arrays.copyOf(bArr, i2);
                bArr[i] = (byte) read;
                i++;
            }
        }
        fileInputStream.close();
        return i2 == i ? bArr : Arrays.copyOf(bArr, i);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public static byte[] a(java.lang.String r7) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.home.component.utils.d.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r7
            java.lang.String r7 = "81233aeb"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            byte[] r7 = (byte[]) r7
            return r7
        L15:
            r0 = 0
            android.app.Application r1 = com.taobao.tao.Globals.getApplication()     // Catch: java.lang.Throwable -> L65
            android.content.res.Resources r1 = r1.getResources()     // Catch: java.lang.Throwable -> L65
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch: java.lang.Throwable -> L65
            java.io.InputStream r7 = com.taobao.codetrack.sdk.assets.AssetsDelegate.proxy_open(r1, r7)     // Catch: java.lang.Throwable -> L65
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L5d
            r1.<init>()     // Catch: java.lang.Throwable -> L5d
            r3 = 8192(0x2000, float:1.14794E-41)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L56
        L2f:
            int r4 = r7.read(r3)     // Catch: java.lang.Throwable -> L56
            r5 = -1
            if (r4 == r5) goto L3a
            r1.write(r3, r2, r4)     // Catch: java.lang.Throwable -> L56
            goto L2f
        L3a:
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L56
            if (r2 <= 0) goto L4d
            byte[] r0 = r1.toByteArray()     // Catch: java.lang.Throwable -> L56
            if (r7 == 0) goto L49
            r7.close()     // Catch: java.lang.Throwable -> L49
        L49:
            r1.close()     // Catch: java.lang.Throwable -> L4c
        L4c:
            return r0
        L4d:
            if (r7 == 0) goto L52
            r7.close()     // Catch: java.lang.Throwable -> L52
        L52:
            r1.close()     // Catch: java.lang.Throwable -> L77
            goto L77
        L56:
            r2 = move-exception
            goto L68
        L58:
            r1 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
            goto L79
        L5d:
            r2 = move-exception
            r1 = r0
            goto L68
        L60:
            r7 = move-exception
            r1 = r0
            r0 = r7
            r7 = r1
            goto L79
        L65:
            r2 = move-exception
            r7 = r0
            r1 = r7
        L68:
            java.lang.String r3 = "FileTools"
            java.lang.String r4 = "Read bytes from asset file exception"
            com.taobao.android.home.component.utils.e.a(r3, r4, r2)     // Catch: java.lang.Throwable -> L78
            if (r7 == 0) goto L74
            r7.close()     // Catch: java.lang.Throwable -> L74
        L74:
            if (r1 == 0) goto L77
            goto L52
        L77:
            return r0
        L78:
            r0 = move-exception
        L79:
            if (r7 == 0) goto L7e
            r7.close()     // Catch: java.lang.Throwable -> L7e
        L7e:
            if (r1 == 0) goto L83
            r1.close()     // Catch: java.lang.Throwable -> L83
        L83:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.home.component.utils.d.a(java.lang.String):byte[]");
    }
}
