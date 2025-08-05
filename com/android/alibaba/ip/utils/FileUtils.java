package com.android.alibaba.ip.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.android.alibaba.ip.server.InstantPatcher;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import tb.kge;

/* loaded from: classes3.dex */
public class FileUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1578256432);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void copyInputStreamToFile(java.io.InputStream r5, java.io.File r6) throws java.io.IOException {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.android.alibaba.ip.utils.FileUtils.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r5
            r5 = 1
            r1[r5] = r6
            java.lang.String r5 = "2ea77f37"
            r0.ipc$dispatch(r5, r1)
            return
        L15:
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L58
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L58
            java.nio.channels.FileChannel r0 = r1.getChannel()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
        L23:
            int r3 = r5.read(r6)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            if (r3 <= 0) goto L31
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r6, r2, r3)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            r0.write(r3)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            goto L23
        L31:
            if (r5 == 0) goto L3b
            r5.close()     // Catch: java.lang.Exception -> L37
            goto L3b
        L37:
            r5 = move-exception
            r5.printStackTrace()
        L3b:
            if (r0 == 0) goto L45
            r0.close()     // Catch: java.lang.Exception -> L41
            goto L45
        L41:
            r5 = move-exception
            r5.printStackTrace()
        L45:
            r1.close()     // Catch: java.lang.Exception -> L49
            return
        L49:
            r5 = move-exception
            r5.printStackTrace()
            return
        L4e:
            r6 = move-exception
            goto L64
        L50:
            r6 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L5a
        L55:
            r6 = move-exception
            r1 = r0
            goto L64
        L58:
            r6 = move-exception
            r1 = r0
        L5a:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L60
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L60
            throw r2     // Catch: java.lang.Throwable -> L60
        L60:
            r6 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L64:
            if (r5 == 0) goto L6e
            r5.close()     // Catch: java.lang.Exception -> L6a
            goto L6e
        L6a:
            r5 = move-exception
            r5.printStackTrace()
        L6e:
            if (r0 == 0) goto L78
            r0.close()     // Catch: java.lang.Exception -> L74
            goto L78
        L74:
            r5 = move-exception
            r5.printStackTrace()
        L78:
            if (r1 == 0) goto L82
            r1.close()     // Catch: java.lang.Exception -> L7e
            goto L82
        L7e:
            r5 = move-exception
            r5.printStackTrace()
        L82:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.alibaba.ip.utils.FileUtils.copyInputStreamToFile(java.io.InputStream, java.io.File):void");
    }

    public static boolean isSameFile(File file, File file2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2a8db905", new Object[]{file, file2})).booleanValue() : getMD5(file).equals(getMD5(file2));
    }

    public static boolean isSameFile(File file, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ea2a355", new Object[]{file, bArr})).booleanValue();
        }
        try {
            ZipFile zipFile = new ZipFile(file);
            ZipEntry entry = zipFile.getEntry(InstantPatcher.CLASSES_DEX);
            byte[] bArr2 = new byte[0];
            if (entry != null) {
                try {
                    bArr2 = input2byte(zipFile.getInputStream(entry));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return bArr2.equals(bArr);
        } catch (Exception unused) {
            return false;
        }
    }

    public static byte[] getByte(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("e8653ca1", new Object[]{file});
        }
        byte[] bArr = new byte[(int) file.length()];
        try {
            try {
                new FileInputStream(file).read(bArr);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return bArr;
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String getMD5(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("404a476a", new Object[]{bArr});
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            char[] cArr2 = new char[digest.length << 1];
            int i = 0;
            for (byte b : digest) {
                int i2 = i + 1;
                cArr2[i] = cArr[(b >>> 4) & 15];
                i = i2 + 1;
                cArr2[i2] = cArr[b & 15];
            }
            return new String(cArr2);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static final byte[] input2byte(InputStream inputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("78a8d0a1", new Object[]{inputStream});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[100];
        while (true) {
            int read = inputStream.read(bArr, 0, 100);
            if (read > 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static String getMD5(File file) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c149273a", new Object[]{file}) : getMD5(getByte(file));
    }

    public static void writeBytesToFile(byte[] bArr, File file) {
        ZipOutputStream zipOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1dbfe88", new Object[]{bArr, file});
            return;
        }
        ZipOutputStream zipOutputStream2 = null;
        try {
            try {
                zipOutputStream = new ZipOutputStream(new FileOutputStream(file));
                try {
                    new ZipEntry(InstantPatcher.CLASSES_DEX).setMethod(8);
                    zipOutputStream.putNextEntry(new ZipEntry(InstantPatcher.CLASSES_DEX));
                    zipOutputStream.write(bArr, 0, bArr.length);
                    zipOutputStream.closeEntry();
                    try {
                        zipOutputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } catch (FileNotFoundException e2) {
                    e = e2;
                    zipOutputStream2 = zipOutputStream;
                    e.printStackTrace();
                    if (zipOutputStream2 == null) {
                        return;
                    }
                    try {
                        zipOutputStream2.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                } catch (IOException e4) {
                    e = e4;
                    zipOutputStream2 = zipOutputStream;
                    e.printStackTrace();
                    if (zipOutputStream2 == null) {
                        return;
                    }
                    try {
                        zipOutputStream2.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                } catch (Throwable th) {
                    th = th;
                    if (zipOutputStream != null) {
                        try {
                            zipOutputStream.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException e7) {
                e = e7;
            } catch (IOException e8) {
                e = e8;
            }
        } catch (Throwable th2) {
            th = th2;
            zipOutputStream = null;
        }
    }
}
