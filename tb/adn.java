package tb;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class adn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEVICEINFO_UNKNOWN = -1;

    /* renamed from: a  reason: collision with root package name */
    private static final FileFilter f25270a;

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
        }
        if (Build.VERSION.SDK_INT <= 10) {
            return 1;
        }
        try {
            return new File("/sys/devices/system/cpu/").listFiles(f25270a).length;
        } catch (NullPointerException | SecurityException unused) {
            return -1;
        }
    }

    static {
        kge.a(-1976746117);
        f25270a = new FileFilter() { // from class: tb.adn.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.io.FileFilter
            public boolean accept(File file) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("50e018ca", new Object[]{this, file})).booleanValue();
                }
                String name = file.getName();
                if (!name.startsWith(eoe.TYPE_CPU)) {
                    return false;
                }
                for (int i = 3; i < name.length(); i++) {
                    if (name.charAt(i) < '0' || name.charAt(i) > '9') {
                        return false;
                    }
                }
                return true;
            }
        };
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue();
        }
        int i = -1;
        for (int i2 = 0; i2 < a(); i2++) {
            try {
                File file = new File("/sys/devices/system/cpu/cpu" + i2 + "/cpufreq/cpuinfo_max_freq");
                if (file.exists()) {
                    byte[] bArr = new byte[128];
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        fileInputStream.read(bArr);
                        int i3 = 0;
                        while (bArr[i3] >= 48 && bArr[i3] <= 57 && i3 < bArr.length) {
                            i3++;
                        }
                        Integer valueOf = Integer.valueOf(Integer.parseInt(new String(bArr, 0, i3)));
                        if (valueOf.intValue() > i) {
                            i = valueOf.intValue();
                        }
                    } catch (NumberFormatException unused) {
                    } catch (Throwable th) {
                        fileInputStream.close();
                        throw th;
                    }
                    fileInputStream.close();
                }
            } catch (IOException unused2) {
                return -1;
            }
        }
        if (i != -1) {
            return i;
        }
        FileInputStream fileInputStream2 = new FileInputStream("/proc/cpuinfo");
        int a2 = a("cpu MHz", fileInputStream2) * 1000;
        if (a2 <= i) {
            a2 = i;
        }
        fileInputStream2.close();
        return a2;
    }

    public static long a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6454", new Object[]{context})).longValue();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            return memoryInfo.totalMem;
        }
        long j = -1;
        try {
            FileInputStream fileInputStream = new FileInputStream("/proc/meminfo");
            j = a("MemTotal", fileInputStream) << 10;
            fileInputStream.close();
        } catch (IOException unused) {
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0050, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int a(java.lang.String r7, java.io.FileInputStream r8) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.adn.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1c
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r7
            r1[r3] = r8
            java.lang.String r7 = "7133b0b0"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            return r7
        L1c:
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]
            int r8 = r8.read(r0)     // Catch: java.lang.Throwable -> L52
        L24:
            if (r2 >= r8) goto L52
            r1 = r0[r2]     // Catch: java.lang.Throwable -> L52
            r4 = 10
            if (r1 == r4) goto L2e
            if (r2 != 0) goto L50
        L2e:
            r1 = r0[r2]     // Catch: java.lang.Throwable -> L52
            if (r1 != r4) goto L34
            int r2 = r2 + 1
        L34:
            r1 = r2
        L35:
            if (r1 >= r8) goto L50
            int r4 = r1 - r2
            r5 = r0[r1]     // Catch: java.lang.Throwable -> L52
            char r6 = r7.charAt(r4)     // Catch: java.lang.Throwable -> L52
            if (r5 != r6) goto L50
            int r5 = r7.length()     // Catch: java.lang.Throwable -> L52
            int r5 = r5 - r3
            if (r4 != r5) goto L4d
            int r7 = a(r0, r1)     // Catch: java.lang.Throwable -> L52
            return r7
        L4d:
            int r1 = r1 + 1
            goto L35
        L50:
            int r2 = r2 + r3
            goto L24
        L52:
            r7 = -1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.adn.a(java.lang.String, java.io.FileInputStream):int");
    }

    private static int a(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2713f1a7", new Object[]{bArr, new Integer(i)})).intValue();
        }
        while (i < bArr.length && bArr[i] != 10) {
            if (bArr[i] >= 48 && bArr[i] <= 57) {
                int i2 = i + 1;
                while (i2 < bArr.length && bArr[i2] >= 48 && bArr[i2] <= 57) {
                    i2++;
                }
                return Integer.parseInt(new String(bArr, 0, i, i2 - i));
            }
            i++;
        }
        return -1;
    }

    public static float c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5a", new Object[0])).floatValue();
        }
        ArrayList<Long> d = d();
        if (d != null && d.size() >= 2) {
            float longValue = (float) d.get(0).longValue();
            float longValue2 = (float) d.get(1).longValue();
            try {
                Thread.sleep(360L);
            } catch (Exception unused) {
            }
            ArrayList<Long> d2 = d();
            if (d2 != null && d2.size() >= 2) {
                float longValue3 = (float) d2.get(0).longValue();
                return ((longValue3 - ((float) d2.get(1).longValue())) - (longValue - longValue2)) / (longValue3 - longValue);
            }
        }
        return 0.0f;
    }

    private static ArrayList<Long> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("379df345", new Object[0]);
        }
        ArrayList<Long> arrayList = new ArrayList<>();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("/proc/stat", "r");
            while (true) {
                String readLine = randomAccessFile.readLine();
                if (readLine == null || !readLine.startsWith(eoe.TYPE_CPU)) {
                    break;
                }
                String[] split = readLine.split("\\s+");
                long parseLong = Long.parseLong(split[4]);
                arrayList.add(Long.valueOf(Long.parseLong(split[1]) + Long.parseLong(split[2]) + Long.parseLong(split[3]) + Long.parseLong(split[4]) + Long.parseLong(split[6]) + Long.parseLong(split[5]) + Long.parseLong(split[7])));
                arrayList.add(Long.valueOf(parseLong));
            }
            randomAccessFile.close();
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public static long b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eca0ff3", new Object[]{context})).longValue();
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }
}
