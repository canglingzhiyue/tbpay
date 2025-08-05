package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.util.a;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public class gmc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2077581815);
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
                a.a("Close file output stream exception", th2);
            }
            return true;
        } catch (Throwable th3) {
            th = th3;
            bufferedOutputStream2 = bufferedOutputStream;
            try {
                a.a("Write file exception", th);
                return false;
            } finally {
                if (bufferedOutputStream2 != null) {
                    try {
                        bufferedOutputStream2.close();
                    } catch (Throwable th4) {
                        a.a("Close file output stream exception", th4);
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
            a.a("Read all bytes exception", e);
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
    public static byte[] a(java.lang.String r6, android.content.Context r7) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.gmc.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L18
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r6
            r6 = 1
            r1[r6] = r7
            java.lang.String r6 = "26177fc7"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            byte[] r6 = (byte[]) r6
            return r6
        L18:
            r0 = 0
            android.content.res.Resources r7 = r7.getResources()     // Catch: java.lang.Throwable -> L64
            android.content.res.AssetManager r7 = r7.getAssets()     // Catch: java.lang.Throwable -> L64
            java.io.InputStream r6 = com.taobao.codetrack.sdk.assets.AssetsDelegate.proxy_open(r7, r6)     // Catch: java.lang.Throwable -> L64
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L5c
            r7.<init>()     // Catch: java.lang.Throwable -> L5c
            r1 = 8192(0x2000, float:1.14794E-41)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L55
        L2e:
            int r3 = r6.read(r1)     // Catch: java.lang.Throwable -> L55
            r4 = -1
            if (r3 == r4) goto L39
            r7.write(r1, r2, r3)     // Catch: java.lang.Throwable -> L55
            goto L2e
        L39:
            int r1 = r7.size()     // Catch: java.lang.Throwable -> L55
            if (r1 <= 0) goto L4c
            byte[] r0 = r7.toByteArray()     // Catch: java.lang.Throwable -> L55
            if (r6 == 0) goto L48
            r6.close()     // Catch: java.lang.Throwable -> L48
        L48:
            r7.close()     // Catch: java.lang.Throwable -> L4b
        L4b:
            return r0
        L4c:
            if (r6 == 0) goto L51
            r6.close()     // Catch: java.lang.Throwable -> L51
        L51:
            r7.close()     // Catch: java.lang.Throwable -> L74
            goto L74
        L55:
            r1 = move-exception
            goto L67
        L57:
            r7 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
            goto L76
        L5c:
            r1 = move-exception
            r7 = r0
            goto L67
        L5f:
            r6 = move-exception
            r7 = r0
            r0 = r6
            r6 = r7
            goto L76
        L64:
            r1 = move-exception
            r6 = r0
            r7 = r6
        L67:
            java.lang.String r2 = "Read bytes from asset file exception"
            com.taobao.android.gateway.util.a.a(r2, r1)     // Catch: java.lang.Throwable -> L75
            if (r6 == 0) goto L71
            r6.close()     // Catch: java.lang.Throwable -> L71
        L71:
            if (r7 == 0) goto L74
            goto L51
        L74:
            return r0
        L75:
            r0 = move-exception
        L76:
            if (r6 == 0) goto L7b
            r6.close()     // Catch: java.lang.Throwable -> L7b
        L7b:
            if (r7 == 0) goto L80
            r7.close()     // Catch: java.lang.Throwable -> L80
        L80:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.gmc.a(java.lang.String, android.content.Context):byte[]");
    }
}
