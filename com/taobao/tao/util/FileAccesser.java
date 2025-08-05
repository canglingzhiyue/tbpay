package com.taobao.tao.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import tb.kge;

/* loaded from: classes8.dex */
public class FileAccesser {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(830356026);
    }

    public static boolean hasFile(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ed646d4b", new Object[]{str})).booleanValue() : new File(str).exists();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v7 */
    public static byte[] read(String str) {
        FileInputStream fileInputStream;
        FileChannel fileChannel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("cc4c5616", new Object[]{str});
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                fileInputStream = new FileInputStream(str);
                try {
                    fileChannel = fileInputStream.getChannel();
                } catch (Exception e) {
                    e = e;
                    fileChannel = null;
                } catch (Throwable th) {
                    th = th;
                    str = 0;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                    if (str != 0) {
                        try {
                            str.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                fileChannel = null;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                str = 0;
                fileInputStream = null;
            }
            try {
                ByteBuffer allocate = ByteBuffer.allocate((int) fileChannel.size());
                fileChannel.read(allocate);
                String str2 = "read time cost:" + (System.currentTimeMillis() - currentTimeMillis);
                byte[] array = allocate.array();
                try {
                    fileInputStream.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
                return array;
            } catch (Exception e7) {
                e = e7;
                e.printStackTrace();
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e8) {
                        e8.printStackTrace();
                    }
                }
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException e9) {
                        e9.printStackTrace();
                    }
                }
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c4, code lost:
        r5.delete();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean write(java.lang.String r9, java.nio.ByteBuffer r10) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.util.FileAccesser.write(java.lang.String, java.nio.ByteBuffer):boolean");
    }

    public static boolean delete(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ea815e00", new Object[]{str})).booleanValue() : new File(str).delete();
    }
}
