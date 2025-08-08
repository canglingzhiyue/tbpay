package com.alipay.mobile.verifyidentity.utils.task;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.List;

/* loaded from: classes3.dex */
public class ZFileUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public static boolean write(java.lang.String r7, java.lang.String r8, java.lang.String r9, boolean r10, android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.utils.task.ZFileUtil.write(java.lang.String, java.lang.String, java.lang.String, boolean, android.content.Context):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
        if (r4 == null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String read(java.io.File r6) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.mobile.verifyidentity.utils.task.ZFileUtil.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r6
            java.lang.String r6 = "ed62e14c"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.lang.String r6 = (java.lang.String) r6
            return r6
        L15:
            r0 = 0
            if (r6 == 0) goto L53
            boolean r1 = r6.exists()
            if (r1 != 0) goto L1f
            goto L53
        L1f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4f
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4f
        L2d:
            int r6 = r4.read(r3)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L50
            r5 = -1
            if (r6 == r5) goto L3d
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L50
            r5.<init>(r3, r2, r6)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L50
            r1.append(r5)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L50
            goto L2d
        L3d:
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L50
        L41:
            r4.close()     // Catch: java.lang.Exception -> L53
            goto L53
        L45:
            r6 = move-exception
            goto L49
        L47:
            r6 = move-exception
            r4 = r0
        L49:
            if (r4 == 0) goto L4e
            r4.close()     // Catch: java.lang.Exception -> L4e
        L4e:
            throw r6
        L4f:
            r4 = r0
        L50:
            if (r4 == 0) goto L53
            goto L41
        L53:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.utils.task.ZFileUtil.read(java.io.File):java.lang.String");
    }

    public static boolean delete(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea815e00", new Object[]{str})).booleanValue();
        }
        if (!StringUtils.isEmpty(str)) {
            return delete(new File(str));
        }
        return false;
    }

    public static boolean delete(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("258726ad", new Object[]{file})).booleanValue();
        }
        if (!file.exists()) {
            return true;
        }
        if (file.isDirectory()) {
            clearDir(file.getAbsolutePath());
        }
        return file.delete();
    }

    public static boolean clearDir(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("97da9195", new Object[]{str})).booleanValue() : clearDir(str, null);
    }

    public static boolean clearDir(String str, List<String> list) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35bddc86", new Object[]{str, list})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (!file.isDirectory()) {
            return false;
        }
        if (file.exists() && (listFiles = file.listFiles()) != null && listFiles.length != 0) {
            for (File file2 : listFiles) {
                if (list == null || !list.contains(file2.getName())) {
                    if (file2.isDirectory()) {
                        clearDir(file2.getAbsolutePath(), null);
                    }
                    file2.delete();
                }
            }
        }
        return true;
    }
}
