package com.taobao.cameralink.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.Dimension;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.uploader.export.e;
import com.ut.device.UTDevice;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONObject;
import tb.kge;
import tb.kna;

/* loaded from: classes3.dex */
public class Utils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Context application;
    private static Handler mainHandler;

    private static int degreesToExif(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("de5faa5d", new Object[]{new Integer(i)})).intValue();
        }
        if (i == 90) {
            return 6;
        }
        if (i == 180) {
            return 3;
        }
        return i != 270 ? 0 : 8;
    }

    static {
        kge.a(-561953934);
        mainHandler = new Handler(Looper.getMainLooper());
    }

    public static boolean deleteDir(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d8c8424", new Object[]{file})).booleanValue();
        }
        if (file == null) {
            return true;
        }
        if (file.isDirectory()) {
            String[] list = file.list();
            if (list == null || list.length <= 0) {
                file.delete();
                return true;
            }
            for (String str : list) {
                if (!deleteDir(new File(file, str))) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    private static void createDir(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deec556f", new Object[]{file});
        } else if (file.exists() || file.mkdirs()) {
        } else {
            throw new IOException("Can not create dir " + file);
        }
    }

    private static void unzipEntry(ZipFile zipFile, ZipEntry zipEntry, String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccbb581b", new Object[]{zipFile, zipEntry, str});
            return;
        }
        String name = zipEntry.getName();
        if (!StringUtils.isEmpty(name) && name.contains("../")) {
            throw new IOException("the name of zip entry contain \"../\", it has potential safety hazards...");
        }
        if (zipEntry.isDirectory()) {
            createDir(new File(str, name));
            return;
        }
        File file = new File(str, name);
        if (!file.getParentFile().exists()) {
            createDir(file.getParentFile());
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(zipEntry));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        byte[] bArr = new byte[4096];
        while (true) {
            int read = bufferedInputStream.read(bArr);
            if (read != -1) {
                bufferedOutputStream.write(bArr, 0, read);
            } else {
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
                bufferedInputStream.close();
                return;
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
    public static boolean unzipToFolder(java.lang.String r6, java.lang.String r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.cameralink.manager.Utils.unzipToFolder(java.lang.String, java.lang.String):boolean");
    }

    private static boolean checkZipWholeness(ZipFile zipFile, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5125ee4", new Object[]{zipFile, str})).booleanValue();
        }
        if (!StringUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isDirectory() && zipFile != null) {
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                while (entries.hasMoreElements()) {
                    if (!new File(str, entries.nextElement().getName()).exists()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static void runInMainThread(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce3b02d8", new Object[]{runnable});
        } else if (runnable == null) {
        } else {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                mainHandler.post(runnable);
            }
        }
    }

    public static synchronized Context getApplication() {
        synchronized (Utils.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("d3bbff99", new Object[0]);
            }
            return application;
        }
    }

    public static synchronized void setApplication(Context context) {
        synchronized (Utils.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4043053", new Object[]{context});
            } else {
                application = context.getApplicationContext();
            }
        }
    }

    public static String getDefaultUploadFileName() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("19a086a6", new Object[0]);
        }
        try {
            String userId = Login.getUserId();
            if (StringUtils.isEmpty(userId)) {
                userId = UTDevice.getUtdid(getApplication());
            }
            str = kna.b(userId);
        } catch (Throwable th) {
            th.printStackTrace();
            str = "Unknown";
        }
        try {
            str2 = UUID.randomUUID().toString();
        } catch (Throwable th2) {
            th2.printStackTrace();
            str2 = "";
        }
        return str + "_" + str2;
    }

    public static String getOssKey(e eVar) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("126e99c9", new Object[]{eVar});
        }
        try {
            return new JSONObject(eVar.a()).getString("ossObjectKey");
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String getUrlWithEXIFAutoRotation(e eVar) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6f8bd1f", new Object[]{eVar});
        }
        try {
            if (eVar.b().contains("x-oss-process=style/auto-ori")) {
                return eVar.b();
            }
            String b = eVar.b();
            StringBuilder sb = new StringBuilder();
            sb.append(b);
            sb.append(b.contains("?") ? "&x-oss-process=style/auto-ori" : "?x-oss-process=style/auto-ori");
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void traceLog(String str, String str2, String[] strArr, String[] strArr2, boolean[] zArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bf2a959", new Object[]{str, str2, strArr, strArr2, zArr});
        } else if (strArr != null && strArr2 != null && zArr != null) {
            DimensionSet create = DimensionSet.create();
            MeasureSet create2 = MeasureSet.create();
            for (int i = 0; i < strArr.length; i++) {
                if (!zArr[i]) {
                    create2.addMeasure(strArr[i]);
                } else {
                    create.addDimension(new Dimension(strArr[i], ""));
                }
            }
            AppMonitor.register(str, str2, create2, create);
            DimensionValueSet create3 = DimensionValueSet.create();
            MeasureValueSet create4 = MeasureValueSet.create();
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (!zArr[i2]) {
                    double d = -1.0d;
                    try {
                        d = Double.parseDouble(strArr2[i2]);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    create4.setValue(strArr[i2], d);
                } else {
                    create3.setValue(strArr[i2], strArr2[i2]);
                }
            }
            AppMonitor.Stat.commit(str, str2, create3, create4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <K, V> boolean compareMap(java.util.Map<K, V> r6, java.util.Map<K, V> r7) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.cameralink.manager.Utils.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1c
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r6
            r1[r2] = r7
            java.lang.String r6 = "fc664022"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L1c:
            if (r6 == 0) goto L28
            int r0 = r6.size()
            if (r0 > 0) goto L25
            goto L29
        L25:
            r1 = r0
            r0 = 0
            goto L2b
        L28:
            r0 = 0
        L29:
            r1 = r0
            r0 = 1
        L2b:
            if (r7 == 0) goto L37
            int r4 = r7.size()
            if (r4 > 0) goto L34
            goto L38
        L34:
            r5 = r4
            r4 = 0
            goto L3a
        L37:
            r4 = 0
        L38:
            r5 = r4
            r4 = 1
        L3a:
            if (r0 == 0) goto L3d
            return r4
        L3d:
            if (r0 != 0) goto L42
            if (r4 == 0) goto L42
            return r3
        L42:
            if (r1 == r5) goto L45
            return r3
        L45:
            java.util.Set r0 = r6.keySet()
            java.util.Iterator r0 = r0.iterator()
        L4d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6d
            java.lang.Object r1 = r0.next()
            boolean r4 = r7.containsKey(r1)
            if (r4 != 0) goto L5e
            return r3
        L5e:
            java.lang.Object r4 = r6.get(r1)
            java.lang.Object r1 = r7.get(r1)
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L4d
            return r3
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.cameralink.manager.Utils.compareMap(java.util.Map, java.util.Map):boolean");
    }
}
