package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class ecl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(302238514);
        emu.a("com.taobao.android.detail.core.detail.utils.CpuInfoUtils");
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        Context applicationContext = context.getApplicationContext();
        String string = PreferenceManager.getDefaultSharedPreferences(applicationContext).getString("detail_CpuFrequence", "null");
        if (!"null".equals(string)) {
            return string;
        }
        c(applicationContext);
        return "N/A";
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eca0ff2", new Object[]{context})).intValue();
        }
        Context applicationContext = context.getApplicationContext();
        int i = PreferenceManager.getDefaultSharedPreferences(applicationContext).getInt("detail_CpuNumCores", 0);
        if (i != 0) {
            return i;
        }
        d(applicationContext);
        return 1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [tb.ecl$1] */
    private static void c(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
        } else {
            new AsyncTask<Void, Void, Void>() { // from class: tb.ecl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
                @Override // android.os.AsyncTask
                public /* synthetic */ Void doInBackground(Void[] voidArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
                }

                public Void a(Void... voidArr) {
                    String readLine;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Void) ipChange2.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
                    }
                    try {
                        readLine = new BufferedReader(new InputStreamReader(new ProcessBuilder("/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq").start().getInputStream())).readLine();
                    } catch (Throwable th) {
                        i.a("CpuInfoUtils", "initCpuFrequenceToPreference", th);
                    }
                    if (StringUtils.isEmpty(readLine)) {
                        return null;
                    }
                    SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
                    edit.putString("detail_CpuFrequence", readLine);
                    edit.commit();
                    return null;
                }
            }.execute(new Void[0]);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [tb.ecl$2] */
    private static void d(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{context});
        } else {
            new AsyncTask<Void, Void, Void>() { // from class: tb.ecl.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: tb.ecl$2$a */
                /* loaded from: classes4.dex */
                public class a implements FileFilter {
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public a() {
                    }

                    @Override // java.io.FileFilter
                    public boolean accept(File file) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            return ((Boolean) ipChange.ipc$dispatch("50e018ca", new Object[]{this, file})).booleanValue();
                        }
                        try {
                        } catch (Throwable th) {
                            i.a("CpuInfoUtils", "initNumCores1", th);
                        }
                        return Pattern.matches("cpu[0-9]", file.getName());
                    }
                }

                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
                @Override // android.os.AsyncTask
                public /* synthetic */ Void doInBackground(Void[] voidArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
                }

                public Void a(Void... voidArr) {
                    File[] listFiles;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Void) ipChange2.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
                    }
                    try {
                        listFiles = new File("/sys/devices/system/cpu/").listFiles(new a());
                    } catch (Throwable th) {
                        i.a("CpuInfoUtils", "initNumCores2", th);
                    }
                    if (listFiles == null) {
                        return null;
                    }
                    SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
                    edit.putInt("detail_CpuNumCores", listFiles.length);
                    edit.commit();
                    return null;
                }
            }.execute(new Void[0]);
        }
    }
}
