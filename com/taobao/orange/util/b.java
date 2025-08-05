package com.taobao.orange.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.k;
import com.taobao.orange.OConstant;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import mtopsdk.mtop.upload.domain.UploadConstants;
import tb.kge;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ORANGE_DIR = "orange_config";

    /* renamed from: a  reason: collision with root package name */
    public static AtomicInteger f18599a;
    public static AtomicInteger b;
    public static AtomicLong c;
    public static AtomicLong d;
    public static AtomicLong e;
    private static File f;

    static {
        kge.a(-355897411);
        f = c();
        f18599a = new AtomicInteger(0);
        b = new AtomicInteger(0);
        c = new AtomicLong(0L);
        d = new AtomicLong(0L);
        e = new AtomicLong(0L);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public static void a(java.lang.Object r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.orange.util.b.a(java.lang.Object, java.lang.String):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public static void b(java.lang.Object r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.orange.util.b.b(java.lang.Object, java.lang.String):void");
    }

    public static <T extends com.taobao.orange.model.a> T a(String str) {
        FileInputStream fileInputStream;
        Closeable closeable;
        ObjectInputStream objectInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("62bcdef6", new Object[]{str});
        }
        if (com.taobao.orange.a.A) {
            return (T) b(str);
        }
        if (OLog.isPrintLog(1)) {
            OLog.d(k.TAG, "restoreObject", UploadConstants.FILE_NAME, str);
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                File file = new File(f, str);
                if (!file.exists()) {
                    if (OLog.isPrintLog(3)) {
                        OLog.w(k.TAG, "restoreObject not exists", UploadConstants.FILE_NAME, str);
                    }
                    f.a((Closeable) null);
                    f.a((Closeable) null);
                    return null;
                }
                fileInputStream = new FileInputStream(file);
                try {
                    objectInputStream = new ObjectInputStream(new BufferedInputStream(fileInputStream));
                } catch (Exception e2) {
                    e = e2;
                    objectInputStream = null;
                } catch (Throwable th) {
                    th = th;
                    closeable = null;
                    f.a(closeable);
                    f.a(fileInputStream);
                    throw th;
                }
                try {
                    T t = (T) objectInputStream.readObject();
                    if (!t.checkValid()) {
                        throw new RuntimeException("check not vaild:" + str);
                    }
                    if (!d.b) {
                        b.incrementAndGet();
                        d.addAndGet(System.currentTimeMillis() - currentTimeMillis);
                        e.addAndGet(System.currentTimeMillis() - currentTimeMillis);
                        d.a(str, true, false, 0, System.currentTimeMillis() - currentTimeMillis);
                    }
                    f.a(objectInputStream);
                    f.a(fileInputStream);
                    return t;
                } catch (Exception e3) {
                    e = e3;
                    OLog.e(k.TAG, "restoreObject", e, new Object[0]);
                    f.a(objectInputStream);
                    f.a(fileInputStream);
                    d.a(OConstant.MONITOR_PRIVATE_MODULE, OConstant.POINT_RESTORE_FAIL_COUNTS, str, 1.0d);
                    d.a(str, false, false, 0, System.currentTimeMillis() - currentTimeMillis);
                    return null;
                }
            } catch (Exception e4) {
                e = e4;
                fileInputStream = null;
                objectInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = null;
                closeable = null;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0175 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r21v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T extends com.taobao.orange.model.a> T b(java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.orange.util.b.b(java.lang.String):com.taobao.orange.model.a");
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
            return;
        }
        File file = new File(f, str);
        if (!file.exists()) {
            return;
        }
        boolean delete = file.delete();
        if (!OLog.isPrintLog(1)) {
            return;
        }
        OLog.d(k.TAG, "deleteConfigFile", UploadConstants.FILE_NAME, str, "result", Boolean.valueOf(delete));
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        OLog.i(k.TAG, "clearCacheFile", new Object[0]);
        a(f);
    }

    public static File b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("64f2a3c4", new Object[0]) : f;
    }

    private static void a(File file) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a979fdf", new Object[]{file});
        } else if (file != null && file.exists() && file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (file2.isFile()) {
                    file2.delete();
                } else if (file2.isDirectory()) {
                    a(file2);
                }
            }
        }
    }

    private static File c() {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("298485e3", new Object[0]);
        }
        try {
            file = new File(new File(com.taobao.orange.a.g.getFilesDir(), ORANGE_DIR), com.taobao.orange.a.J.getDes());
        } catch (Throwable th) {
            th = th;
            file = null;
        }
        try {
            if (file.exists() && file.isFile() && !file.delete()) {
                OLog.w(k.TAG, "getTargetDir target dir delete fail", new Object[0]);
            }
            if (!file.exists() && !file.mkdirs()) {
                OLog.w(k.TAG, "getTargetDir mkdirs fail", new Object[0]);
                d.a(OConstant.MONITOR_MODULE, OConstant.POINT_EXCEPTION, "getTargetDir", "103", "getTargetDir mkdirs fail");
            }
            OLog.d(k.TAG, "getTargetDir", file.getAbsolutePath());
        } catch (Throwable th2) {
            th = th2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            th.printStackTrace(new PrintStream(byteArrayOutputStream));
            d.a(OConstant.MONITOR_MODULE, OConstant.POINT_EXCEPTION, "0", "103", byteArrayOutputStream.toString());
            return file;
        }
        return file;
    }
}
