package com.taobao.monitor.performance.cpu;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashSet;
import java.util.Set;
import tb.eoe;
import tb.mqd;
import tb.mqg;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String[] c;

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<byte[]> f18212a = new ThreadLocal<>();
    private static final long b = 1000 / e.a();
    private static final Set<String> d = new HashSet();
    private static int e = -1;

    static {
        File[] listFiles;
        c = new String[0];
        try {
            File[] listFiles2 = new File("/sys/devices/system/cpu/cpufreq").listFiles($$Lambda$b$CYyneCVlnnnapDGX_ElakXwmW8.INSTANCE);
            c = new String[listFiles2.length];
            for (int i = 0; i < listFiles2.length; i++) {
                c[i] = listFiles2[i].getPath() + "/stats/time_in_state";
            }
            for (int i2 = 0; i2 < a.a(); i2++) {
                for (File file : new File(String.format("/sys/devices/system/cpu/cpu%s/cpuidle", Integer.valueOf(i2))).listFiles($$Lambda$b$5zUsmLW6NC2Jv2XDgrYQ7TR9Hgc.INSTANCE)) {
                    d.add(file.getPath() + "/time");
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean b(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("584201a4", new Object[]{file})).booleanValue();
        }
        String name = file.getName();
        if (!name.startsWith(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_POLICY)) {
            return false;
        }
        for (int i = 6; i < name.length(); i++) {
            if (!Character.isDigit(name.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a979fe3", new Object[]{file})).booleanValue();
        }
        String name = file.getName();
        if (!name.startsWith("state")) {
            return false;
        }
        for (int i = 5; i < name.length(); i++) {
            if (!Character.isDigit(name.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static byte[] b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a9d5fa14", new Object[0]);
        }
        if (f18212a.get() == null) {
            f18212a.set(new byte[1024]);
        }
        return f18212a.get();
    }

    public static int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[0])).intValue();
        }
        int i = e;
        if (i > 0) {
            return i;
        }
        try {
            new File("/sys/devices/system/cpu/").listFiles(new FileFilter() { // from class: com.taobao.monitor.performance.cpu.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.io.FileFilter
                public boolean accept(File file) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("50e018ca", new Object[]{this, file})).booleanValue();
                    }
                    String name = file.getName();
                    if (!name.startsWith(eoe.TYPE_CPU)) {
                        return false;
                    }
                    for (int i2 = 3; i2 < name.length(); i2++) {
                        if (name.charAt(i2) < '0' || name.charAt(i2) > '9') {
                            return false;
                        }
                    }
                    return true;
                }
            });
        } catch (Exception unused) {
            Runtime.getRuntime().availableProcessors();
        }
        return e;
    }

    public static long[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (long[]) ipChange.ipc$dispatch("a821217d", new Object[0]);
        }
        if (Build.VERSION.SDK_INT >= 27) {
            long d2 = d();
            long c2 = c();
            return (d2 <= 0 || c2 <= 0) ? new long[]{0, 0} : new long[]{c2 + d2, d2};
        }
        return e();
    }

    private static long c() {
        String[] strArr;
        RandomAccessFile randomAccessFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5e", new Object[0])).longValue();
        }
        long j = 0;
        mqg.a("ProcessCpuTracker.readPolicy");
        byte[] b2 = b();
        for (String str : c) {
            RandomAccessFile randomAccessFile2 = null;
            try {
                try {
                    randomAccessFile = new RandomAccessFile(new File(str), "r");
                    try {
                        int read = randomAccessFile.read(b2);
                        if (read <= 0) {
                            f.a("CpuUsageTracker", "read file siz == 0: " + str);
                        } else {
                            c cVar = new c(b2, read);
                            cVar.a();
                            cVar.d();
                            while (cVar.b()) {
                                mqg.a("CpuUsageCollector.readLine");
                                j += cVar.c();
                                cVar.d();
                                mqg.a();
                            }
                        }
                        mqd.a(randomAccessFile);
                    } catch (IOException e2) {
                        e = e2;
                        randomAccessFile2 = randomAccessFile;
                        e.printStackTrace();
                        mqd.a(randomAccessFile2);
                    } catch (IllegalArgumentException e3) {
                        e = e3;
                        randomAccessFile2 = randomAccessFile;
                        e.printStackTrace();
                        mqd.a(randomAccessFile2);
                    } catch (SecurityException e4) {
                        e = e4;
                        randomAccessFile2 = randomAccessFile;
                        e.printStackTrace();
                        mqd.a(randomAccessFile2);
                    } catch (Throwable th) {
                        th = th;
                        mqd.a(randomAccessFile);
                        throw th;
                    }
                } catch (IOException e5) {
                    e = e5;
                } catch (IllegalArgumentException e6) {
                    e = e6;
                } catch (SecurityException e7) {
                    e = e7;
                }
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile = null;
            }
        }
        long j2 = j * 10;
        mqg.a();
        return j2;
    }

    private static long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2df", new Object[0])).longValue();
        }
        mqg.a("CpuUsageCollector.idle");
        byte[] b2 = b();
        long j = 0;
        for (String str : d) {
            RandomAccessFile randomAccessFile = null;
            try {
                try {
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "r");
                    try {
                        int read = randomAccessFile2.read(b2);
                        long j2 = 0;
                        for (int i = 0; i < read; i++) {
                            char c2 = (char) b2[i];
                            if (c2 > '9' || c2 < '0') {
                                break;
                            }
                            j2 = (j2 * 10) + (c2 - '0');
                        }
                        j += j2;
                        mqd.a(randomAccessFile2);
                    } catch (Exception e2) {
                        e = e2;
                        randomAccessFile = randomAccessFile2;
                        e.printStackTrace();
                        mqd.a(randomAccessFile);
                    } catch (Throwable th) {
                        th = th;
                        randomAccessFile = randomAccessFile2;
                        mqd.a(randomAccessFile);
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        long j3 = j / 1000;
        mqg.a();
        return j3;
    }

    private static long[] e() {
        RandomAccessFile randomAccessFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (long[]) ipChange.ipc$dispatch("aef483f9", new Object[0]);
        }
        mqg.a("CpuUsageCollector.getCpuTimeLowVersion");
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile("/proc/stat", "r");
                try {
                    byte[] b2 = b();
                    c cVar = new c(b2, randomAccessFile.read(b2));
                    cVar.a();
                    cVar.d();
                    long c2 = cVar.c();
                    cVar.d();
                    long c3 = cVar.c();
                    cVar.d();
                    long c4 = cVar.c();
                    cVar.d();
                    long c5 = cVar.c();
                    cVar.d();
                    long c6 = cVar.c();
                    cVar.d();
                    long c7 = cVar.c();
                    cVar.d();
                    long c8 = cVar.c();
                    cVar.d();
                    long c9 = cVar.c();
                    cVar.d();
                    long[] jArr = {(c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9 + cVar.c()) * b, c5 * b};
                    mqd.a(randomAccessFile);
                    mqg.a();
                    return jArr;
                } catch (Exception e2) {
                    e = e2;
                    randomAccessFile2 = randomAccessFile;
                    f.a("CpuUsageTracker", e.toString());
                    mqd.a(randomAccessFile2);
                    mqg.a();
                    return new long[]{0, 0};
                } catch (Throwable th) {
                    th = th;
                    mqd.a(randomAccessFile);
                    mqg.a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile = randomAccessFile2;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }
}
