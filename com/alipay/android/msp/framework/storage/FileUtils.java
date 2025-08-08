package com.alipay.android.msp.framework.storage;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.framework.encrypt.EncryptUtil;
import com.alipay.android.msp.framework.encrypt.TriDesCBC;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Closeable;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/* loaded from: classes3.dex */
public class FileUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static char[] f4871a = "0123456789ABCDEF".toCharArray();

    public static String md5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("257656f1", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
        StringBuilder sb = new StringBuilder(digest.length << 1);
        for (byte b : digest) {
            sb.append(f4871a[(b >> 4) & 15]);
            sb.append(f4871a[b & 15]);
        }
        return sb.toString();
    }

    public static void close(Object obj) {
        try {
            if (obj instanceof Closeable) {
                ((Closeable) obj).close();
            } else {
                obj.getClass().getMethod("close", new Class[0]).invoke(obj, new Object[0]);
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public static String buildRandomFileInBasePath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63da5887", new Object[]{str});
        }
        return str + File.separator + System.currentTimeMillis() + "_monitor";
    }

    private static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            lastIndexOf = str.lastIndexOf("\\");
        }
        if (lastIndexOf == -1) {
            return false;
        }
        try {
            File file = new File(str.substring(0, lastIndexOf));
            if (file.exists()) {
                return true;
            }
            return file.mkdirs();
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return true;
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
    public static boolean write(java.lang.String r8, java.lang.String r9) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.android.msp.framework.storage.FileUtils.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1c
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r8
            r1[r2] = r9
            java.lang.String r8 = "1b6c0efe"
            java.lang.Object r8 = r0.ipc$dispatch(r8, r1)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L1c:
            boolean r0 = android.text.StringUtils.isEmpty(r8)
            if (r0 == 0) goto L23
            return r3
        L23:
            java.lang.String r0 = ""
            if (r9 != 0) goto L28
            r9 = r0
        L28:
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]
            a(r8)
            r4 = 0
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L9a
            r5.<init>(r8)     // Catch: java.lang.Throwable -> L9a
            boolean r6 = r5.exists()     // Catch: java.lang.Throwable -> L9a
            if (r6 != 0) goto L4a
            boolean r5 = r5.createNewFile()     // Catch: java.lang.Throwable -> L9a
            if (r5 == 0) goto L42
            goto L4a
        L42:
            java.lang.Exception r8 = new java.lang.Exception     // Catch: java.lang.Throwable -> L9a
            java.lang.String r9 = "cache file create error."
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L9a
            throw r8     // Catch: java.lang.Throwable -> L9a
        L4a:
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L9a
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L9a
            r6.<init>(r8, r3)     // Catch: java.lang.Throwable -> L9a
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L9a
            boolean r8 = android.text.StringUtils.equals(r9, r0)     // Catch: java.lang.Throwable -> L93
            if (r8 == 0) goto L62
            byte[] r8 = r9.getBytes()     // Catch: java.lang.Throwable -> L93
            r5.write(r8)     // Catch: java.lang.Throwable -> L93
            goto L77
        L62:
            java.io.ByteArrayInputStream r8 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L93
            byte[] r9 = r9.getBytes()     // Catch: java.lang.Throwable -> L93
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L93
        L6b:
            int r9 = r8.read(r1)     // Catch: java.lang.Throwable -> L89
            r0 = -1
            if (r9 == r0) goto L76
            r5.write(r1, r3, r9)     // Catch: java.lang.Throwable -> L89
            goto L6b
        L76:
            r4 = r8
        L77:
            r5.flush()     // Catch: java.lang.Throwable -> L93
            r5.close()     // Catch: java.lang.Exception -> L7d
        L7d:
            if (r4 == 0) goto Lac
            r4.close()     // Catch: java.lang.Exception -> Lac
            goto Lac
        L83:
            r9 = move-exception
            r4 = r5
            r7 = r9
            r9 = r8
            r8 = r7
            goto Lae
        L89:
            r9 = move-exception
            r4 = r5
            r7 = r9
            r9 = r8
            r8 = r7
            goto L9c
        L8f:
            r8 = move-exception
            r9 = r4
            r4 = r5
            goto Lae
        L93:
            r8 = move-exception
            r9 = r4
            r4 = r5
            goto L9c
        L97:
            r8 = move-exception
            r9 = r4
            goto Lae
        L9a:
            r8 = move-exception
            r9 = r4
        L9c:
            com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r8)     // Catch: java.lang.Throwable -> Lad
            if (r4 == 0) goto La6
            r4.close()     // Catch: java.lang.Exception -> La5
            goto La6
        La5:
        La6:
            if (r9 == 0) goto Lab
            r9.close()     // Catch: java.lang.Exception -> Lab
        Lab:
            r2 = 0
        Lac:
            return r2
        Lad:
            r8 = move-exception
        Lae:
            if (r4 == 0) goto Lb5
            r4.close()     // Catch: java.lang.Exception -> Lb4
            goto Lb5
        Lb4:
        Lb5:
            if (r9 == 0) goto Lba
            r9.close()     // Catch: java.lang.Exception -> Lba
        Lba:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.storage.FileUtils.write(java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
        if (r4 == null) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String read(java.io.File r6) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.android.msp.framework.storage.FileUtils.$ipChange
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
            if (r6 == 0) goto L5a
            boolean r1 = r6.exists()
            if (r1 != 0) goto L1f
            goto L5a
        L1f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4a
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4a
        L2d:
            int r6 = r4.read(r3)     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L53
            r5 = -1
            if (r6 == r5) goto L3d
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L53
            r5.<init>(r3, r2, r6)     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L53
            r1.append(r5)     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L53
            goto L2d
        L3d:
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L53
        L41:
            r4.close()     // Catch: java.lang.Exception -> L52
            goto L52
        L45:
            r6 = move-exception
            goto L4c
        L47:
            r6 = move-exception
            r4 = r0
            goto L54
        L4a:
            r6 = move-exception
            r4 = r0
        L4c:
            com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r6)     // Catch: java.lang.Throwable -> L53
            if (r4 == 0) goto L52
            goto L41
        L52:
            return r0
        L53:
            r6 = move-exception
        L54:
            if (r4 == 0) goto L59
            r4.close()     // Catch: java.lang.Exception -> L59
        L59:
            throw r6
        L5a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.storage.FileUtils.read(java.io.File):java.lang.String");
    }

    public static boolean exists(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("602541f1", new Object[]{str})).booleanValue();
        }
        if (!StringUtils.isEmpty(str)) {
            return new File(str).exists();
        }
        return false;
    }

    public static boolean delete(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ea815e00", new Object[]{str})).booleanValue() : !StringUtils.isEmpty(str) && delete(new File(str));
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
            a(file.getAbsolutePath(), null);
        }
        return file.delete();
    }

    private static boolean a(String str, List<String> list) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1aa3527", new Object[]{str, list})).booleanValue();
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
                        a(file2.getAbsolutePath(), null);
                    }
                    file2.delete();
                }
            }
        }
        return true;
    }

    public static boolean encryptWrite(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3d4ac99", new Object[]{str, str2})).booleanValue();
        }
        Context context = GlobalHelper.getInstance().getContext();
        String str3 = null;
        if (str2 != null) {
            str3 = TriDesCBC.encrypt(EncryptUtil.generateLocalStorageDesKey(context), str2);
        }
        return write(str, str3);
    }

    public static String decryptRead(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("386e2aff", new Object[]{file});
        }
        String read = read(file);
        Context context = GlobalHelper.getInstance().getContext();
        if (read == null) {
            return null;
        }
        return TriDesCBC.decrypt(EncryptUtil.generateLocalStorageDesKey(context), read);
    }
}
