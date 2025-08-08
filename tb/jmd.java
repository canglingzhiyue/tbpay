package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public class jmd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1840932543);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        String a2 = jmg.a("tschedule", "cupMaxHz", "null");
        if (!"null".equals(a2)) {
            return a2;
        }
        c();
        return "N/A";
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        String a2 = jmg.a("tschedule", "cpuCores", "");
        if (!StringUtils.isEmpty(a2)) {
            return a2;
        }
        d();
        return "1";
    }

    private static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else {
            Coordinator.execute(new Runnable() { // from class: tb.jmd.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        String readLine = new BufferedReader(new InputStreamReader(new ProcessBuilder("/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq").start().getInputStream())).readLine();
                        if (StringUtils.isEmpty(readLine)) {
                            return;
                        }
                        jmg.b("tschedule", "cupMaxHz", readLine);
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    private static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
        } else {
            Coordinator.execute(new Runnable() { // from class: tb.jmd.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: tb.jmd$2$a */
                /* loaded from: classes6.dex */
                public class a implements FileFilter {
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public a() {
                    }

                    @Override // java.io.FileFilter
                    public boolean accept(File file) {
                        IpChange ipChange = $ipChange;
                        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("50e018ca", new Object[]{this, file})).booleanValue() : Pattern.matches("cpu[0-9]", file.getName());
                    }
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new a());
                        if (listFiles == null) {
                            return;
                        }
                        jmg.b("tschedule", "cpuCores", listFiles.length + "");
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
