package android.taobao.windvane.file;

import android.taobao.windvane.util.m;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1320405308);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (str != null) {
            return new File(str).exists();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.nio.channels.FileChannel] */
    /* JADX WARN: Type inference failed for: r5v7 */
    public static byte[] a(File file) {
        Throwable th;
        FileChannel fileChannel;
        IpChange ipChange = $ipChange;
        ?? r1 = ipChange instanceof IpChange;
        if (r1 != 0) {
            return (byte[]) ipChange.ipc$dispatch("c85c5cde", new Object[]{file});
        }
        try {
            try {
                if (!file.exists()) {
                    return null;
                }
                r1 = new FileInputStream(file);
                try {
                    fileChannel = r1.getChannel();
                } catch (Exception unused) {
                    fileChannel = null;
                } catch (Throwable th2) {
                    th = th2;
                    file = 0;
                    if (r1 != 0) {
                        try {
                            r1.close();
                        } catch (IOException unused2) {
                        }
                    }
                    if (file != 0) {
                        try {
                            file.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
                try {
                    ByteBuffer allocate = ByteBuffer.allocate((int) fileChannel.size());
                    fileChannel.read(allocate);
                    byte[] array = allocate.array();
                    try {
                        r1.close();
                    } catch (IOException unused4) {
                    }
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException unused5) {
                        }
                    }
                    return array;
                } catch (Exception unused6) {
                    m.d("FileAccesser", "read loacl file failed");
                    if (r1 != 0) {
                        try {
                            r1.close();
                        } catch (IOException unused7) {
                        }
                    }
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException unused8) {
                        }
                    }
                    return null;
                }
            } catch (Exception unused9) {
                fileChannel = null;
                r1 = 0;
            } catch (Throwable th3) {
                r1 = 0;
                th = th3;
                file = 0;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static byte[] b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("7d24c9ca", new Object[]{str});
        }
        if (str != null) {
            return a(new File(str));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x007d, code lost:
        r6.delete();
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(java.io.File r6, java.nio.ByteBuffer r7) throws android.taobao.windvane.file.NotEnoughSpace {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = android.taobao.windvane.file.a.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1c
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r6
            r1[r2] = r7
            java.lang.String r6 = "4d7136d6"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L1c:
            r0 = 0
            boolean r1 = r6.exists()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            if (r1 != 0) goto L30
            java.io.File r1 = r6.getParentFile()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            if (r1 != 0) goto L2a
            return r3
        L2a:
            r1.mkdirs()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r6.createNewFile()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
        L30:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            java.nio.channels.FileChannel r0 = r1.getChannel()     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L5a
            r7.position(r3)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L5a
            r0.write(r7)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L5a
            r0.force(r2)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L5a
            r1.close()     // Catch: java.io.IOException -> L46
            goto L4a
        L46:
            r6 = move-exception
            r6.printStackTrace()
        L4a:
            if (r0 == 0) goto L54
            r0.close()     // Catch: java.io.IOException -> L50
            goto L54
        L50:
            r6 = move-exception
            r6.printStackTrace()
        L54:
            return r2
        L55:
            r6 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L99
        L5a:
            r7 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L64
        L5f:
            r6 = move-exception
            r1 = r0
            goto L99
        L62:
            r7 = move-exception
            r1 = r0
        L64:
            java.lang.String r2 = r7.getMessage()     // Catch: java.lang.Throwable -> L98
            if (r2 == 0) goto L7b
            java.lang.String r4 = "ENOSPC"
            boolean r2 = r2.contains(r4)     // Catch: java.lang.Throwable -> L98
            if (r2 != 0) goto L73
            goto L7b
        L73:
            android.taobao.windvane.file.NotEnoughSpace r6 = new android.taobao.windvane.file.NotEnoughSpace     // Catch: java.lang.Throwable -> L98
            java.lang.String r7 = "not enouth space in flash"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L98
            throw r6     // Catch: java.lang.Throwable -> L98
        L7b:
            if (r6 == 0) goto L80
            r6.delete()     // Catch: java.lang.Throwable -> L98
        L80:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L8d
            r0.close()     // Catch: java.io.IOException -> L89
            goto L8d
        L89:
            r6 = move-exception
            r6.printStackTrace()
        L8d:
            if (r1 == 0) goto L97
            r1.close()     // Catch: java.io.IOException -> L93
            goto L97
        L93:
            r6 = move-exception
            r6.printStackTrace()
        L97:
            return r3
        L98:
            r6 = move-exception
        L99:
            if (r0 == 0) goto La3
            r0.close()     // Catch: java.io.IOException -> L9f
            goto La3
        L9f:
            r7 = move-exception
            r7.printStackTrace()
        La3:
            if (r1 == 0) goto Lad
            r1.close()     // Catch: java.io.IOException -> La9
            goto Lad
        La9:
            r7 = move-exception
            r7.printStackTrace()
        Lad:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.file.a.a(java.io.File, java.nio.ByteBuffer):boolean");
    }

    public static boolean a(String str, ByteBuffer byteBuffer) throws NotEnoughSpace {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fe18c63", new Object[]{str, byteBuffer})).booleanValue();
        }
        if (str != null) {
            return a(new File(str), byteBuffer);
        }
        return false;
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue();
        }
        if (str != null) {
            return a(new File(str), true);
        }
        return false;
    }

    public static boolean b(File file) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("584201a4", new Object[]{file})).booleanValue() : a(file, true);
    }

    public static boolean a(File file, boolean z) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c85d0ed9", new Object[]{file, new Boolean(z)})).booleanValue();
        }
        if (file != null && file.exists()) {
            if (file.isDirectory()) {
                try {
                    for (File file2 : file.listFiles()) {
                        if (file2.isDirectory()) {
                            a(file2, true);
                        } else {
                            try {
                                file2.delete();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                } catch (NullPointerException e2) {
                    e2.printStackTrace();
                }
            }
            if (z) {
                try {
                    return file.delete();
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
        }
        return false;
    }
}
