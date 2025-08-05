package com.taobao.common.inspector;

import android.system.Os;
import android.system.OsConstants;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.util.Objects;
import tb.kge;
import tb.kgi;
import tb.kgj;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f16928a;

    public static long a() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue();
        }
        String b = g.b("/proc/self/stat");
        String[] split = b.substring(b.lastIndexOf(41) + 2).split(" ");
        return ((Long.parseLong(split[11]) + Long.parseLong(split[12])) * 1000) / Os.sysconf(OsConstants._SC_CLK_TCK);
    }

    public static void a(kgj kgjVar) throws Exception {
        kgi kgiVar;
        kgi.a[] aVarArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1081d8a", new Object[]{kgjVar});
            return;
        }
        if (kgjVar.d != null) {
            kgiVar = kgjVar.d;
        } else {
            kgiVar = new kgi();
            kgjVar.d = kgiVar;
        }
        if (kgiVar.f30051a == 0) {
            kgiVar.f30051a = Runtime.getRuntime().availableProcessors();
        }
        for (int i = 0; i < kgiVar.f30051a; i++) {
            if (b(kgiVar.b, i) == null) {
                try {
                    kgiVar.b = a(kgiVar.b, g.b(d(i), 16));
                } catch (Exception unused) {
                }
            }
        }
        for (kgi.a aVar : kgiVar.b) {
            for (int i2 = 0; i2 < kgiVar.f30051a && aVar.c == null; i2++) {
                if (((1 << i2) & aVar.b) != 0) {
                    aVar.c = a(i2);
                }
            }
        }
        String[] d = g.d("/proc/cpuinfo");
        a(d, kgiVar.b);
        String a2 = a(d);
        if (a2 == null) {
            return;
        }
        kgjVar.c = new String[]{a2};
    }

    private static kgi.a[] a(kgi.a[] aVarArr, int i) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kgi.a[]) ipChange.ipc$dispatch("aaa3717b", new Object[]{aVarArr, new Integer(i)});
        }
        if (aVarArr != null) {
            for (kgi.a aVar : aVarArr) {
                if (aVar.b == i) {
                    return aVarArr;
                }
                if ((aVar.b & i) != 0) {
                    throw new IllegalArgumentException("partial match: " + aVar.b + " vs " + i);
                }
            }
        }
        kgi.a aVar2 = new kgi.a();
        aVar2.b = i;
        kgi.a[] aVarArr2 = new kgi.a[(aVarArr != null ? aVarArr.length : 0) + 1];
        if (aVarArr != null) {
            System.arraycopy(aVarArr, 0, aVarArr2, 0, aVarArr.length);
        }
        aVarArr2[aVarArr2.length - 1] = aVar2;
        return aVarArr2;
    }

    private static kgi.a b(kgi.a[] aVarArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kgi.a) ipChange.ipc$dispatch("913dcfcb", new Object[]{aVarArr, new Integer(i)});
        }
        if (aVarArr == null) {
            return null;
        }
        for (kgi.a aVar : aVarArr) {
            if (((1 << i) & aVar.b) != 0) {
                return aVar;
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static void a(String[] strArr, kgi.a[] aVarArr) {
        kgi.a b;
        char c;
        IpChange ipChange = $ipChange;
        char c2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85c9a064", new Object[]{strArr, aVarArr});
            return;
        }
        short[] sArr = new short[5];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (String str : strArr) {
            String[] split = str.split(":");
            if (split.length == 2) {
                String trim = split[c2].trim();
                String trim2 = split[1].trim();
                switch (trim.hashCode()) {
                    case -1815500307:
                        if (trim.equals("CPU variant")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1509145992:
                        if (trim.equals("CPU implementer")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1094759278:
                        if (trim.equals("processor")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 516911339:
                        if (trim.equals("CPU architecture")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 542854003:
                        if (trim.equals("CPU revision")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1256489867:
                        if (trim.equals("CPU part")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c != 0) {
                    if (c == 1) {
                        sArr[0] = Short.decode(trim2).shortValue();
                    } else if (c == 2) {
                        if (((trim2.hashCode() == -472575691 && trim2.equals("AArch64")) ? (char) 0 : (char) 65535) != 0) {
                            sArr[2] = Short.decode(trim2).shortValue();
                        } else {
                            sArr[2] = 8;
                        }
                    } else if (c == 3) {
                        sArr[1] = Short.decode(trim2).shortValue();
                    } else if (c == 4) {
                        sArr[3] = Short.decode(trim2).shortValue();
                    } else if (c == 5) {
                        sArr[4] = Short.parseShort(trim2);
                    } else if (a(f16928a, trim) < 0) {
                        String str2 = "Unknown field ignored: " + trim;
                    }
                    c2 = 0;
                } else {
                    i2++;
                    if (sArr[2] != 0) {
                        kgi.a b2 = b(aVarArr, i3);
                        if (b2 != null && b2.f30052a == null) {
                            b2.f30052a = (short[]) sArr.clone();
                        }
                        i++;
                        c2 = 0;
                        sArr[2] = 0;
                    } else {
                        c2 = 0;
                    }
                    i3 = Integer.parseInt(trim2);
                }
            }
        }
        if ((i == 0 && i2 > 1) || (b = b(aVarArr, i3)) == null || b.f30052a != null) {
            return;
        }
        b.f30052a = (short[]) sArr.clone();
    }

    public static String a(String[] strArr) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a51c09c9", new Object[]{strArr});
        }
        String a2 = g.a(strArr, "Hardware\t:");
        if (a2 != null) {
            return a2.substring(10).trim();
        }
        return null;
    }

    private static int[] a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("5c10e0a9", new Object[]{new Integer(i)});
        }
        try {
            return g.a(b(i));
        } catch (Exception unused) {
            try {
                return g.a(c(i), 0);
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    private static final String b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da9643a6", new Object[]{new Integer(i)});
        }
        return "/sys/devices/system/cpu/cpu" + i + "/cpufreq/scaling_available_frequencies";
    }

    private static final String c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24c7dce7", new Object[]{new Integer(i)});
        }
        return "/sys/devices/system/cpu/cpu" + i + "/cpufreq/stats/time_in_state";
    }

    private static final String d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ef97628", new Object[]{new Integer(i)});
        }
        return "/sys/devices/system/cpu/cpu" + i + "/topology/core_siblings";
    }

    private static int a(String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a325b9b4", new Object[]{strArr, str})).intValue();
        }
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(strArr[i], str)) {
                return i;
            }
        }
        return -1;
    }

    static {
        kge.a(-765891144);
        f16928a = new String[]{"BogoMIPS", "Features", "model name", "Hardware", "Processor"};
    }
}
