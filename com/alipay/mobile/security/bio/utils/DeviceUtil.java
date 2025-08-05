package com.alipay.mobile.security.bio.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.StatFs;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class DeviceUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static int getProcessorNum() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7d9c784", new Object[0])).intValue();
        }
        try {
            return new File("/sys/devices/system/cpu/").listFiles(new FileFilter() { // from class: com.alipay.mobile.security.bio.utils.DeviceUtil.1CpuFilter
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.io.FileFilter
                public boolean accept(File file) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("50e018ca", new Object[]{this, file})).booleanValue() : Pattern.matches("cpu[0-9]+", file.getName());
                }
            }).length;
        } catch (Throwable unused) {
            return 0;
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
    public static long getMemorySize() {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.mobile.security.bio.utils.DeviceUtil.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L16
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "1cd5d913"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            return r0
        L16:
            java.lang.String r0 = "/proc/meminfo"
            r1 = 0
            r3 = 0
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L5d
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L5d
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L4b
            r5 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r4, r5)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r3 = r0.readLine()     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L3d
            java.lang.String r5 = "\\s+"
            java.lang.String[] r3 = r3.split(r5)     // Catch: java.lang.Throwable -> L46
            r5 = 1
            r3 = r3[r5]     // Catch: java.lang.Throwable -> L46
            long r1 = java.lang.Long.parseLong(r3)     // Catch: java.lang.Throwable -> L46
            r3 = 10
            long r1 = r1 << r3
        L3d:
            r4.close()     // Catch: java.lang.Throwable -> L40
        L40:
            r0.close()     // Catch: java.lang.Throwable -> L6a
            goto L6a
        L44:
            r1 = move-exception
            goto L50
        L46:
            r3 = r0
            goto L5e
        L48:
            r1 = move-exception
            r0 = r3
            goto L50
        L4b:
            goto L5e
        L4d:
            r1 = move-exception
            r0 = r3
            r4 = r0
        L50:
            if (r4 == 0) goto L57
            r4.close()     // Catch: java.lang.Throwable -> L56
            goto L57
        L56:
        L57:
            if (r0 == 0) goto L5c
            r0.close()     // Catch: java.lang.Throwable -> L5c
        L5c:
            throw r1
        L5d:
            r4 = r3
        L5e:
            if (r4 == 0) goto L65
            r4.close()     // Catch: java.lang.Throwable -> L64
            goto L65
        L64:
        L65:
            if (r3 == 0) goto L6a
            r3.close()     // Catch: java.lang.Throwable -> L6a
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.security.bio.utils.DeviceUtil.getMemorySize():long");
    }

    public static long getTotalStorageSize(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c712a8e0", new Object[]{file})).longValue();
        }
        try {
            StatFs statFs = new StatFs(file.getPath());
            return statFs.getBlockCount() * statFs.getBlockSize();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static long getAvailableStorageSize(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9657987b", new Object[]{file})).longValue();
        }
        try {
            StatFs statFs = new StatFs(file.getPath());
            return statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static boolean isDebug(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("16deea7c", new Object[]{context})).booleanValue() : (context.getPackageManager().getApplicationInfo(context.getPackageName(), 16384).flags & 2) != 0;
    }

    public static String getVersionName(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("904e852c", new Object[]{context});
        }
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static String getUtdid(Context context) {
        String str;
        try {
            str = (String) Class.forName("com.ut.device.UTDevice").getMethod("getUtdid", Context.class).invoke(null, context);
        } catch (Exception unused) {
            str = "";
        }
        String str2 = "[*] UTDID:" + str;
        return str;
    }
}
