package com.alipay.mobile.common.logging.api;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.StatFs;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;
import tb.eoe;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class DeviceHWInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEVICEINFO_NO_INIT = -100;
    public static final int DEVICEINFO_UNKNOWN = -1;
    public static final String TAG = "DeviceHWInfo";
    public static int sCoreNum = -100;
    public static String sCpuHardware = "-100";
    public static String sCpuName = "-100";
    public static int sFrequency = -100;
    public static int sMinFrequency = Integer.MAX_VALUE;
    public static long sRamSize = -100;
    public static String[] sCpuHardwareArray = {"-1", "-1"};
    public static int sHeapSize = -100;
    public static int sLargeHeapSize = -100;
    public static long sTotalStorage = -100;
    public static long sFreeStorageInterval = 0;
    public static long sFreeStorage = -100;
    public static long sUseMemSize = -1;
    public static long sUseMemSizeInterval = 0;
    public static int sDeviceRootedFlag = -1;
    public static final String[] SU_PATHS = {"/system/bin/su", "/system/xbin/su", "/system/sbin/su", "/sbin/su", "/vendor/bin/su"};
    public static int sPssState = -1;
    public static long sPssInterval = 0;
    public static int[] pssArray = new int[3];

    /* renamed from: a  reason: collision with root package name */
    private static final FileFilter f5411a = new FileFilter() { // from class: com.alipay.mobile.common.logging.api.DeviceHWInfo.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("50e018ca", new Object[]{this, file})).booleanValue();
            }
            String name = file.getName();
            if (!name.startsWith(eoe.TYPE_CPU)) {
                return false;
            }
            for (int i = 3; i < name.length(); i++) {
                if (!Character.isDigit(name.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    };

    public static int getNumberOfCPUCores() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("466e95fc", new Object[0])).intValue();
        }
        int i = sCoreNum;
        if (i == -1) {
            return i;
        }
        if (i == -100) {
            synchronized (DeviceHWInfo.class) {
                if (Build.VERSION.SDK_INT <= 10) {
                    sCoreNum = 1;
                    return 1;
                }
                int a2 = a("/sys/devices/system/cpu/possible");
                sCoreNum = a2;
                if (a2 == -1) {
                    sCoreNum = a("/sys/devices/system/cpu/present");
                }
                if (sCoreNum == -1) {
                    sCoreNum = new File("/sys/devices/system/cpu/").listFiles(f5411a).length;
                }
            }
        }
        return sCoreNum;
    }

    private static int a(String str) {
        FileInputStream fileInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        FileInputStream fileInputStream2 = null;
        int i = -1;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                String readLine = new BufferedReader(new InputStreamReader(fileInputStream)).readLine();
                if (readLine != null && readLine.matches("0-[\\d]+$")) {
                    i = Integer.valueOf(readLine.substring(2)).intValue() + 1;
                }
                try {
                    fileInputStream.close();
                } catch (Throwable unused) {
                }
                return i;
            } catch (IOException unused2) {
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (Throwable unused3) {
                    }
                }
                return -1;
            } catch (Throwable th) {
                th = th;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    public static int getCPUMinFreqKHz() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3dc389f", new Object[0])).intValue();
        }
        int i = sMinFrequency;
        if (i == -1) {
            return i;
        }
        if (i == Integer.MAX_VALUE) {
            getCPUMaxFreqKHz();
        }
        return sMinFrequency;
    }

    public static int getCPUMaxFreqKHz() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9cb47a4d", new Object[0])).intValue();
        }
        int i = sFrequency;
        if (i == -1) {
            return i;
        }
        if (i == -100) {
            synchronized (DeviceHWInfo.class) {
                for (int i2 = 0; i2 < getNumberOfCPUCores(); i2++) {
                    try {
                        File file = new File("/sys/devices/system/cpu/cpu" + i2 + "/cpufreq/cpuinfo_max_freq");
                        if (file.exists()) {
                            byte[] bArr = new byte[128];
                            FileInputStream fileInputStream = new FileInputStream(file);
                            try {
                                fileInputStream.read(bArr);
                                int i3 = 0;
                                while (Character.isDigit(bArr[i3]) && i3 < 128) {
                                    i3++;
                                }
                                Integer valueOf = Integer.valueOf(Integer.parseInt(new String(bArr, 0, i3)));
                                if (valueOf.intValue() > sFrequency) {
                                    sFrequency = valueOf.intValue();
                                }
                                if (valueOf.intValue() < sMinFrequency) {
                                    sMinFrequency = valueOf.intValue();
                                }
                            } catch (NumberFormatException unused) {
                            } catch (Throwable th) {
                                try {
                                    fileInputStream.close();
                                } catch (Throwable unused2) {
                                }
                                throw th;
                            }
                            try {
                                fileInputStream.close();
                            } catch (Throwable unused3) {
                            }
                        }
                    } catch (IOException unused4) {
                        sFrequency = -1;
                        sMinFrequency = -1;
                    }
                }
                if (sFrequency == -100) {
                    FileInputStream fileInputStream2 = new FileInputStream("/proc/cpuinfo");
                    try {
                        int a2 = a("cpu MHz", fileInputStream2) * 1000;
                        if (a2 > sFrequency) {
                            sFrequency = a2;
                        }
                        if (a2 < sMinFrequency) {
                            sMinFrequency = a2;
                        }
                    } finally {
                        try {
                            fileInputStream2.close();
                        } catch (Throwable unused5) {
                        }
                    }
                }
            }
        }
        return sFrequency;
    }

    public static long getTotalMemory(Context context) {
        long j;
        FileInputStream fileInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e13c9746", new Object[]{context})).longValue();
        }
        long j2 = sRamSize;
        if (j2 == -1) {
            return j2;
        }
        if (j2 == -100) {
            synchronized (DeviceHWInfo.class) {
                if (Build.VERSION.SDK_INT >= 16) {
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                    sRamSize = memoryInfo.totalMem;
                } else {
                    try {
                        fileInputStream = new FileInputStream("/proc/meminfo");
                    } catch (IOException unused) {
                        j = -1;
                    }
                    try {
                        j = a("MemTotal", fileInputStream) << 10;
                        sRamSize = j;
                    } finally {
                        try {
                            fileInputStream.close();
                        } catch (Throwable unused2) {
                        }
                    }
                }
            }
        }
        return sRamSize;
    }

    public static String getCpuBrand() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("afdff1e4", new Object[0]);
        }
        initCpuHardware();
        return sCpuHardwareArray[0];
    }

    public static String getCpuModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c419bb82", new Object[0]);
        }
        initCpuHardware();
        return sCpuHardwareArray[1];
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public static void initCpuHardware() {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.api.DeviceHWInfo.initCpuHardware():void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public static java.lang.String getCpuName() {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.mobile.common.logging.api.DeviceHWInfo.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L12
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "7cf5bafc"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L12:
            java.lang.String r0 = com.alipay.mobile.common.logging.api.DeviceHWInfo.sCpuName
            java.lang.String r1 = "-1"
            boolean r0 = android.text.StringUtils.equals(r0, r1)
            if (r0 == 0) goto L1f
            java.lang.String r0 = com.alipay.mobile.common.logging.api.DeviceHWInfo.sCpuName
            return r0
        L1f:
            java.lang.String r0 = com.alipay.mobile.common.logging.api.DeviceHWInfo.sCpuName
            java.lang.String r1 = "-100"
            boolean r0 = android.text.StringUtils.equals(r0, r1)
            if (r0 == 0) goto La1
            java.lang.Class<com.alipay.mobile.common.logging.api.DeviceHWInfo> r0 = com.alipay.mobile.common.logging.api.DeviceHWInfo.class
            monitor-enter(r0)
            r1 = 0
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = "/proc/cpuinfo"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L7b
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L73
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L73
            java.lang.String r1 = r3.readLine()     // Catch: java.lang.Throwable -> L74
            java.lang.String r4 = ":\\s+"
            r5 = 2
            java.lang.String[] r1 = r1.split(r4, r5)     // Catch: java.lang.Throwable -> L74
            r4 = 1
            r1 = r1[r4]     // Catch: java.lang.Throwable -> L74
            com.alipay.mobile.common.logging.api.DeviceHWInfo.sCpuName = r1     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = "0"
            java.lang.String r6 = com.alipay.mobile.common.logging.api.DeviceHWInfo.sCpuName     // Catch: java.lang.Throwable -> L74
            boolean r1 = r1.equals(r6)     // Catch: java.lang.Throwable -> L74
            if (r1 == 0) goto L66
            java.lang.String r1 = r3.readLine()     // Catch: java.lang.Throwable -> L74
            if (r1 == 0) goto L66
            java.lang.String r6 = ":\\s+"
            java.lang.String[] r1 = r1.split(r6, r5)     // Catch: java.lang.Throwable -> L74
            int r5 = r1.length     // Catch: java.lang.Throwable -> L74
            if (r5 <= r4) goto L66
            r1 = r1[r4]     // Catch: java.lang.Throwable -> L74
            com.alipay.mobile.common.logging.api.DeviceHWInfo.sCpuName = r1     // Catch: java.lang.Throwable -> L74
        L66:
            r2.close()     // Catch: java.lang.Throwable -> L69
        L69:
            r3.close()     // Catch: java.lang.Throwable -> L8a
            goto L8a
        L6d:
            r1 = move-exception
            goto L90
        L6f:
            r3 = move-exception
            r7 = r3
            r3 = r1
            goto L8f
        L73:
            r3 = r1
        L74:
            r1 = r2
            goto L7c
        L76:
            r2 = move-exception
            r3 = r1
            r1 = r2
            r2 = r3
            goto L90
        L7b:
            r3 = r1
        L7c:
            java.lang.String r2 = "-1"
            com.alipay.mobile.common.logging.api.DeviceHWInfo.sCpuName = r2     // Catch: java.lang.Throwable -> L8c
            if (r1 == 0) goto L87
            r1.close()     // Catch: java.lang.Throwable -> L86
            goto L87
        L86:
        L87:
            if (r3 == 0) goto L8a
            goto L69
        L8a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L96
            goto La1
        L8c:
            r2 = move-exception
            r7 = r2
            r2 = r1
        L8f:
            r1 = r7
        L90:
            if (r2 == 0) goto L99
            r2.close()     // Catch: java.lang.Throwable -> L98
            goto L99
        L96:
            r1 = move-exception
            goto L9f
        L98:
        L99:
            if (r3 == 0) goto L9e
            r3.close()     // Catch: java.lang.Throwable -> L9e
        L9e:
            throw r1     // Catch: java.lang.Throwable -> L96
        L9f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L96
            throw r1
        La1:
            java.lang.String r0 = com.alipay.mobile.common.logging.api.DeviceHWInfo.sCpuName
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.api.DeviceHWInfo.getCpuName():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0079, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int a(java.lang.String r11, java.io.FileInputStream r12) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.mobile.common.logging.api.DeviceHWInfo.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1c
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r11
            r1[r3] = r12
            java.lang.String r11 = "7133b0b0"
            java.lang.Object r11 = r0.ipc$dispatch(r11, r1)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            return r11
        L1c:
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r0]
            r4 = -1
            int r12 = r12.read(r1)     // Catch: java.lang.Throwable -> L7b
            r5 = 0
        L26:
            if (r5 >= r12) goto L7b
            r6 = r1[r5]     // Catch: java.lang.Throwable -> L7b
            r7 = 10
            if (r6 == r7) goto L30
            if (r5 != 0) goto L79
        L30:
            r6 = r1[r5]     // Catch: java.lang.Throwable -> L7b
            if (r6 != r7) goto L36
            int r5 = r5 + 1
        L36:
            r6 = r5
        L37:
            if (r6 >= r12) goto L79
            int r8 = r6 - r5
            r9 = r1[r6]     // Catch: java.lang.Throwable -> L7b
            char r10 = r11.charAt(r8)     // Catch: java.lang.Throwable -> L7b
            if (r9 != r10) goto L79
            int r9 = r11.length()     // Catch: java.lang.Throwable -> L7b
            int r9 = r9 - r3
            if (r8 != r9) goto L76
        L4a:
            if (r6 >= r0) goto L75
            r11 = r1[r6]     // Catch: java.lang.Throwable -> L7b
            if (r11 == r7) goto L75
            r11 = r1[r6]     // Catch: java.lang.Throwable -> L7b
            boolean r11 = java.lang.Character.isDigit(r11)     // Catch: java.lang.Throwable -> L7b
            if (r11 == 0) goto L72
            int r11 = r6 + 1
        L5a:
            if (r11 >= r0) goto L67
            r12 = r1[r11]     // Catch: java.lang.Throwable -> L7b
            boolean r12 = java.lang.Character.isDigit(r12)     // Catch: java.lang.Throwable -> L7b
            if (r12 == 0) goto L67
            int r11 = r11 + 1
            goto L5a
        L67:
            java.lang.String r12 = new java.lang.String     // Catch: java.lang.Throwable -> L7b
            int r11 = r11 - r6
            r12.<init>(r1, r2, r6, r11)     // Catch: java.lang.Throwable -> L7b
            int r11 = java.lang.Integer.parseInt(r12)     // Catch: java.lang.Throwable -> L7b
            return r11
        L72:
            int r6 = r6 + 1
            goto L4a
        L75:
            return r4
        L76:
            int r6 = r6 + 1
            goto L37
        L79:
            int r5 = r5 + r3
            goto L26
        L7b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.api.DeviceHWInfo.a(java.lang.String, java.io.FileInputStream):int");
    }

    public static int getHeapSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e360947d", new Object[0])).intValue();
        }
        int i = sHeapSize;
        if (i != -100) {
            return i;
        }
        a();
        return sHeapSize;
    }

    public static int getLargeHeapSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cff982c", new Object[0])).intValue();
        }
        int i = sLargeHeapSize;
        if (i != -100) {
            return i;
        }
        a();
        return sLargeHeapSize;
    }

    private static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        try {
            if (LoggerFactory.getLogContext() == null || LoggerFactory.getLogContext().getApplicationContext() == null) {
                return;
            }
            ActivityManager activityManager = (ActivityManager) LoggerFactory.getLogContext().getApplicationContext().getSystemService("activity");
            sHeapSize = activityManager.getMemoryClass();
            sLargeHeapSize = activityManager.getLargeMemoryClass();
        } catch (Throwable th) {
            new StringBuilder("initHeapSize,err=").append(th);
        }
    }

    public static long getTotalStorage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f2e5308", new Object[0])).longValue();
        }
        long j = sTotalStorage;
        if (j != -100) {
            return j;
        }
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            long blockSize = statFs.getBlockSize() * statFs.getBlockCount();
            sTotalStorage = blockSize;
            sTotalStorage = blockSize / 1048576;
        } catch (Throwable th) {
            new StringBuilder("getSDTotalSize,err=").append(th);
        }
        return sTotalStorage;
    }

    public static long getFreeStorage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad5d7934", new Object[0])).longValue();
        }
        if (sFreeStorage == -100) {
            long freeStorageEvent = getFreeStorageEvent();
            sFreeStorage = freeStorageEvent;
            return freeStorageEvent;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - sFreeStorageInterval < TimeUnit.SECONDS.toMillis(30L)) {
            return sFreeStorage;
        }
        sFreeStorageInterval = currentTimeMillis;
        long freeStorageEvent2 = getFreeStorageEvent();
        sFreeStorage = freeStorageEvent2;
        return freeStorageEvent2;
    }

    public static long getFreeStorageEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9a8050dc", new Object[0])).longValue();
        }
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return (statFs.getBlockSize() * statFs.getAvailableBlocks()) / 1048576;
        } catch (Throwable th) {
            new StringBuilder("getFreeStorageEvent,err=").append(th);
            return -1L;
        }
    }

    public static int getDeviceRootedState() {
        boolean z;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb99219e", new Object[0])).intValue();
        }
        if (sDeviceRootedFlag < 0) {
            try {
                z = "0".equals(b("ro.secure"));
                if (!z) {
                    while (true) {
                        try {
                            if (i >= SU_PATHS.length) {
                                break;
                            }
                            File file = new File(SU_PATHS[i]);
                            if (file.exists() && file.isFile()) {
                                z = true;
                                break;
                            }
                            i++;
                        } catch (Throwable th) {
                            th = th;
                            LoggerFactory.getTraceLogger().error(TAG, th);
                            int i2 = z ? 1 : 0;
                            int i3 = z ? 1 : 0;
                            int i4 = z ? 1 : 0;
                            sDeviceRootedFlag = i2;
                            return sDeviceRootedFlag;
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                z = false;
            }
            int i22 = z ? 1 : 0;
            int i32 = z ? 1 : 0;
            int i42 = z ? 1 : 0;
            sDeviceRootedFlag = i22;
        }
        return sDeviceRootedFlag;
    }

    private static String b(String str) {
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class, String.class).invoke(null, str, null);
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error(TAG, "getSystemProperty", th);
            return null;
        }
    }

    public static int[] getPss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("78a2d9e3", new Object[0]);
        }
        if (sPssState == -1) {
            sPssState = 0;
            int[] b = b();
            pssArray = b;
            return b;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - sPssInterval < TimeUnit.SECONDS.toMillis(30L)) {
            return pssArray;
        }
        sPssInterval = currentTimeMillis;
        int[] b2 = b();
        pssArray = b2;
        return b2;
    }

    private static int[] b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("a9d5fa1b", new Object[0]);
        }
        try {
            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            return new int[]{memoryInfo.getTotalPss(), memoryInfo.nativePss, memoryInfo.dalvikPss};
        } catch (Throwable th) {
            new StringBuilder("getPssEvent,err=").append(th);
            return new int[]{-2, -2, -2};
        }
    }

    public static long getUseMemSize(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f6a92750", new Object[]{context})).longValue();
        }
        if (sUseMemSize == -1) {
            long useMemEvent = getUseMemEvent(context);
            sUseMemSize = useMemEvent;
            return useMemEvent;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - sUseMemSizeInterval < TimeUnit.SECONDS.toMillis(30L)) {
            return sUseMemSize;
        }
        sUseMemSizeInterval = currentTimeMillis;
        long useMemEvent2 = getUseMemEvent(context);
        sUseMemSize = useMemEvent2;
        return useMemEvent2;
    }

    public static long getUseMemEvent(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec803d9f", new Object[]{context})).longValue();
        }
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            return (memoryInfo.totalMem - memoryInfo.availMem) / 1048576;
        } catch (Throwable th) {
            new StringBuilder("getUseMem,err=").append(th);
            return -1L;
        }
    }
}
