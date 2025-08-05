package com.alipay.mobile.common.logging.util;

import android.text.TextUtils;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.fxb;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class ZipUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: classes3.dex */
    public interface ZipFileHandler {
        String handleFileNameInZip(File file);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public static void zipFile(java.util.List<java.io.File> r10, java.lang.String r11, java.io.File r12, com.alipay.mobile.common.logging.util.ZipUtil.ZipFileHandler r13) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.util.ZipUtil.zipFile(java.util.List, java.lang.String, java.io.File, com.alipay.mobile.common.logging.util.ZipUtil$ZipFileHandler):void");
    }

    private static String a(File file, File file2, ZipFileHandler zipFileHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb527df8", new Object[]{file, file2, zipFileHandler});
        }
        String str = null;
        if (file2 == null) {
            return null;
        }
        if (file == null) {
            file = file2.getParentFile();
        }
        if (zipFileHandler != null) {
            try {
                str = zipFileHandler.handleFileNameInZip(file2);
            } catch (Throwable unused) {
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = file2.getName();
        }
        while (true) {
            file2 = file2.getParentFile();
            if (file2 == null || file2.equals(file)) {
                break;
            }
            String name = file2.getName();
            if (TextUtils.isEmpty(name)) {
                break;
            }
            str = name + fxb.DIR + str;
        }
        return str;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public static byte[] unCompressGzip(java.io.InputStream r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.mobile.common.logging.util.ZipUtil.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r4
            java.lang.String r4 = "dd1ccac6"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            byte[] r4 = (byte[]) r4
            return r4
        L15:
            r0 = 0
            if (r4 != 0) goto L19
            return r0
        L19:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            java.util.zip.GZIPInputStream r3 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L47
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L47
            r4 = 256(0x100, float:3.59E-43)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L3a
        L27:
            int r0 = r3.read(r4)     // Catch: java.lang.Throwable -> L3a
            if (r0 < 0) goto L31
            r1.write(r4, r2, r0)     // Catch: java.lang.Throwable -> L3a
            goto L27
        L31:
            r1.close()     // Catch: java.lang.Throwable -> L34
        L34:
            r3.close()     // Catch: java.lang.Throwable -> L4f
            goto L4f
        L38:
            r4 = move-exception
            goto L3e
        L3a:
            r0 = r3
            goto L47
        L3c:
            r4 = move-exception
            r3 = r0
        L3e:
            r1.close()     // Catch: java.lang.Throwable -> L41
        L41:
            if (r3 == 0) goto L46
            r3.close()     // Catch: java.lang.Throwable -> L46
        L46:
            throw r4
        L47:
            r1.close()     // Catch: java.lang.Throwable -> L4a
        L4a:
            if (r0 == 0) goto L4f
            r0.close()     // Catch: java.lang.Throwable -> L4f
        L4f:
            byte[] r4 = r1.toByteArray()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.util.ZipUtil.unCompressGzip(java.io.InputStream):byte[]");
    }
}
