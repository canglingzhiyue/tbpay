package com.alipay.mobile.common.transport.utils;

import android.graphics.BitmapFactory;
import com.alibaba.security.realidentity.f;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* loaded from: classes3.dex */
public class FileUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static int calculateInSampleSize(BitmapFactory.Options options, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d72d401b", new Object[]{options, new Integer(i)})).intValue();
        }
        int i2 = options.outWidth;
        if (i2 <= i) {
            return 1;
        }
        return Math.round(i2 / i);
    }

    public static BitmapFactory.Options getFileOption(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapFactory.Options) ipChange.ipc$dispatch("3adbe04f", new Object[]{file});
        }
        if (file == null || !file.exists()) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        return options;
    }

    public static boolean copyFileEnhanced(File file, File file2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b568be0", new Object[]{file, file2})).booleanValue();
        }
        if (copyFile(file, file2)) {
            return true;
        }
        LogCatUtil.info(f.f3394a, "[copyFileEnhanced] Use copyFile fail, Continue to use streamCopyFile retry.");
        if (file2.exists()) {
            file2.delete();
        }
        return streamCopyFile(file, file2);
    }

    public static boolean copyFile(File file, File file2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13188d4a", new Object[]{file, file2})).booleanValue();
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            if (copyToFile(fileInputStream, file2)) {
                if (file.length() != file2.length()) {
                    LogCatUtil.warn(f.f3394a, "[copyFile] Copy finished, but length mismatch.");
                } else {
                    fileInputStream.close();
                    return true;
                }
            }
            if (file2.exists()) {
                file2.delete();
            }
            fileInputStream.close();
            return false;
        } catch (IOException e) {
            LogCatUtil.warn(f.f3394a, e);
            return false;
        }
    }

    public static boolean copyToFile(FileInputStream fileInputStream, File file) {
        FileOutputStream fileOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bb8ef97", new Object[]{fileInputStream, file})).booleanValue();
        }
        if (file.exists()) {
            file.delete();
        } else {
            File parentFile = file.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    FileChannel channel = fileOutputStream.getChannel();
                    FileChannel channel2 = fileInputStream.getChannel();
                    try {
                        channel2.transferTo(0L, channel2.size(), channel);
                        try {
                            fileOutputStream.close();
                        } catch (Exception e) {
                            LogCatUtil.warn(f.f3394a, "outputStream.close exception. " + e.toString());
                        }
                        return true;
                    } finally {
                        if (channel != null) {
                            try {
                                channel.close();
                            } catch (Throwable th) {
                                LogCatUtil.warn(f.f3394a, "[copyToFile] close output exception = " + th.toString());
                            }
                        }
                        if (channel2 != null) {
                            try {
                                channel2.close();
                            } catch (Throwable th2) {
                                LogCatUtil.warn(f.f3394a, "[copyToFile] close input exception = " + th2.toString());
                            }
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    fileOutputStream2 = fileOutputStream;
                    LogCatUtil.error(f.f3394a, "copy file error!", e);
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (Exception e3) {
                            LogCatUtil.warn(f.f3394a, "outputStream.close exception. " + e3.toString());
                        }
                    }
                    return false;
                } catch (Throwable th3) {
                    th = th3;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception e4) {
                            LogCatUtil.warn(f.f3394a, "outputStream.close exception. " + e4.toString());
                        }
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = fileOutputStream2;
            }
        } catch (Exception e5) {
            e = e5;
        }
    }

    @Deprecated
    public static boolean copyToFile(InputStream inputStream, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce9238fb", new Object[]{inputStream, file})).booleanValue();
        }
        try {
            if (file.exists()) {
                file.delete();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read >= 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return true;
                }
            }
        } catch (IOException e) {
            LogCatUtil.warn(f.f3394a, e);
            return false;
        }
    }

    public static boolean streamCopyFile(File file, File file2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e8a40ea", new Object[]{file, file2})).booleanValue();
        }
        try {
            if (file2.exists()) {
                file2.delete();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read < 0) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            fileOutputStream.flush();
            fileOutputStream.close();
            fileInputStream.close();
            if (file.length() == file2.length()) {
                return true;
            }
            if (file2.exists()) {
                file2.delete();
            }
            LogCatUtil.warn(f.f3394a, "srcFile length=" + file.length() + ", destFile length=" + file2.length());
            return false;
        } catch (IOException e) {
            a(file2);
            LogCatUtil.warn(f.f3394a, e);
            return false;
        }
    }

    private static void a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a979fdf", new Object[]{file});
            return;
        }
        try {
            if (!file.exists()) {
                return;
            }
            file.delete();
        } catch (Throwable unused) {
        }
    }

    public static final byte[] readFile(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("f594f96d", new Object[]{file});
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            FileChannel channel = randomAccessFile.getChannel();
            ByteBuffer allocate = ByteBuffer.allocate(1024);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = channel.read(allocate);
                if (read == -1) {
                    break;
                }
                allocate.flip();
                byteArrayOutputStream.write(allocate.array(), 0, read);
                allocate.clear();
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                channel.close();
            } catch (Exception e) {
                LogCatUtil.warn(f.f3394a, "channel.close() exception. " + e.toString());
            }
            try {
                randomAccessFile.close();
            } catch (Exception e2) {
                LogCatUtil.warn(f.f3394a, "randomAccessFile.close() exception. " + e2.toString());
            }
            return byteArray;
        } catch (Throwable th) {
            LogCatUtil.error(f.f3394a, "readFile exception", th);
            return null;
        }
    }

    public static boolean checkFileDirWRPermissions(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c2befc2", new Object[]{file})).booleanValue();
        }
        if (file == null) {
            LogCatUtil.warn(f.f3394a, "checkFileDirWritePermissions. nima! file is null, Are you kidding？");
            return false;
        }
        if (file.exists()) {
            if (!file.isDirectory()) {
                file = file.getParentFile();
            }
        } else {
            file = file.getParentFile();
            if (!file.exists() && !file.mkdirs()) {
                return false;
            }
        }
        return file.canWrite();
    }

    public static boolean checkDataOrSdcardAvailableSpace(File file, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37b448f7", new Object[]{file, new Long(j)})).booleanValue();
        }
        if (file == null) {
            LogCatUtil.warn(f.f3394a, "checkFileAvailableSpace. nima! file is null, Are you kidding？");
            return false;
        } else if (isInDataDir(file)) {
            return SDcardUtils.isDataDirAvailableSpace(j);
        } else {
            return SDcardUtils.isSDcardAvailableSpace(j);
        }
    }

    public static boolean checkDataAvailableSpace(File file, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af588f3b", new Object[]{file, new Long(j)})).booleanValue();
        }
        if (!isInDataDir(file)) {
            return true;
        }
        return SDcardUtils.isDataDirAvailableSpace(j);
    }

    public static boolean isInDataDir(File file) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a58656", new Object[]{file})).booleanValue() : file.getAbsolutePath().startsWith("/data");
    }

    public static boolean checkFileAvailableSpace(File file, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("365b0ba9", new Object[]{file, new Long(j)})).booleanValue();
        }
        try {
            if (!checkFileDirWRPermissions(file)) {
                return false;
            }
            File parentFile = file.isDirectory() ? file : file.getParentFile();
            if (parentFile != null) {
                file = parentFile;
            }
            return SDcardUtils.isAppAvailableSpace(j, file);
        } catch (Throwable th) {
            LogCatUtil.warn(f.f3394a, "checkFileAvailableSpace fail.", th);
            return true;
        }
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
            } catch (Throwable th) {
                LogCatUtil.error(f.f3394a, "deleteFileNotDir:" + file.getAbsolutePath(), th);
            }
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
    public static synchronized boolean saveByte2File(java.io.File r6, byte[] r7) {
        /*
            java.lang.Class<com.alipay.mobile.common.transport.utils.FileUtils> r0 = com.alipay.mobile.common.transport.utils.FileUtils.class
            monitor-enter(r0)
            com.android.alibaba.ip.runtime.IpChange r1 = com.alipay.mobile.common.transport.utils.FileUtils.$ipChange     // Catch: java.lang.Throwable -> L9b
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange     // Catch: java.lang.Throwable -> L9b
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L20
            java.lang.String r2 = "94c49452"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L9b
            r5[r4] = r6     // Catch: java.lang.Throwable -> L9b
            r5[r3] = r7     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r6 = r1.ipc$dispatch(r2, r5)     // Catch: java.lang.Throwable -> L9b
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L9b
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r0)
            return r6
        L20:
            if (r6 == 0) goto L99
            if (r7 != 0) goto L26
            goto L99
        L26:
            java.io.File r1 = r6.getParentFile()     // Catch: java.lang.Throwable -> L9b
            boolean r1 = r1.exists()     // Catch: java.lang.Throwable -> L9b
            if (r1 != 0) goto L3c
            java.io.File r1 = r6.getParentFile()     // Catch: java.lang.Throwable -> L9b
            boolean r1 = r1.mkdirs()     // Catch: java.lang.Throwable -> L9b
            if (r1 != 0) goto L3c
            monitor-exit(r0)
            return r4
        L3c:
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L63
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L63
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L5c
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L5c
            r6.write(r7)     // Catch: java.lang.Throwable -> L56
            r6.flush()     // Catch: java.lang.Throwable -> L56
            r6.close()     // Catch: java.lang.Throwable -> L8b
            r2.close()     // Catch: java.lang.Throwable -> L8b
            goto L8b
        L54:
            r7 = move-exception
            goto L5a
        L56:
            r7 = move-exception
            goto L5e
        L58:
            r7 = move-exception
            r6 = r1
        L5a:
            r1 = r2
            goto L8e
        L5c:
            r7 = move-exception
            r6 = r1
        L5e:
            r1 = r2
            goto L65
        L60:
            r7 = move-exception
            r6 = r1
            goto L8e
        L63:
            r7 = move-exception
            r6 = r1
        L65:
            java.lang.String r2 = "FileUtils"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d
            r3.<init>()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r5 = "saveByte2File:"
            r3.append(r5)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L8d
            r3.append(r7)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r7 = r3.toString()     // Catch: java.lang.Throwable -> L8d
            com.alipay.mobile.common.transport.utils.LogCatUtil.error(r2, r7)     // Catch: java.lang.Throwable -> L8d
            if (r6 == 0) goto L85
            r6.close()     // Catch: java.lang.Throwable -> L8a
        L85:
            if (r1 == 0) goto L8a
            r1.close()     // Catch: java.lang.Throwable -> L8a
        L8a:
            r3 = 0
        L8b:
            monitor-exit(r0)
            return r3
        L8d:
            r7 = move-exception
        L8e:
            if (r6 == 0) goto L93
            r6.close()     // Catch: java.lang.Throwable -> L98
        L93:
            if (r1 == 0) goto L98
            r1.close()     // Catch: java.lang.Throwable -> L98
        L98:
            throw r7     // Catch: java.lang.Throwable -> L9b
        L99:
            monitor-exit(r0)
            return r4
        L9b:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transport.utils.FileUtils.saveByte2File(java.io.File, byte[]):boolean");
    }
}
