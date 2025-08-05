package com.taobao.android.detail.ttdetail.utils;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import tb.kge;

/* loaded from: classes5.dex */
public class aa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f10953a;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f10956a;
        public String b;

        static {
            kge.a(-1500408930);
        }
    }

    public static /* synthetic */ a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("3061bbcc", new Object[0]) : f10953a;
    }

    static {
        kge.a(-1870786068);
        a aVar = new a();
        f10953a = aVar;
        aVar.f10956a = "0";
        f10953a.b = "0";
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("ecd69e0b", new Object[0]);
        }
        a aVar = new a();
        aVar.f10956a = f10953a.f10956a;
        aVar.b = f10953a.b;
        if (TextUtils.equals("0", aVar.f10956a)) {
            d();
        }
        if (TextUtils.equals("0", aVar.b)) {
            c();
        }
        return aVar;
    }

    private static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(f.a());
        String string = defaultSharedPreferences.getString("detail_CpuFrequency", "null");
        if (!TextUtils.isEmpty(string)) {
            f10953a.b = string;
        } else {
            bf.a(new Runnable() { // from class: com.taobao.android.detail.ttdetail.utils.aa.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    BufferedReader bufferedReader;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    BufferedReader bufferedReader2 = null;
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(new ProcessBuilder("/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq").start().getInputStream()));
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        String readLine = bufferedReader.readLine();
                        if (TextUtils.isEmpty(readLine)) {
                            try {
                                bufferedReader.close();
                                return;
                            } catch (IOException e) {
                                i.a("CpuInfoUtils", "initCpuFrequency close exception: ", e);
                                return;
                            }
                        }
                        aa.b().b = readLine;
                        SharedPreferences.Editor edit = defaultSharedPreferences.edit();
                        edit.putString("detail_CpuFrequency", readLine);
                        edit.apply();
                        try {
                            bufferedReader.close();
                        } catch (IOException e2) {
                            i.a("CpuInfoUtils", "initCpuFrequency close exception: ", e2);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader2 = bufferedReader;
                        try {
                            i.a("CpuInfoUtils", "initCpuFrequency", th);
                            if (bufferedReader2 == null) {
                                return;
                            }
                            try {
                                bufferedReader2.close();
                            } catch (IOException e3) {
                                i.a("CpuInfoUtils", "initCpuFrequency close exception: ", e3);
                            }
                        } catch (Throwable th3) {
                            if (bufferedReader2 != null) {
                                try {
                                    bufferedReader2.close();
                                } catch (IOException e4) {
                                    i.a("CpuInfoUtils", "initCpuFrequency close exception: ", e4);
                                }
                            }
                            throw th3;
                        }
                    }
                }
            });
        }
    }

    private static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
            return;
        }
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(f.a());
        int i = defaultSharedPreferences.getInt("detail_CpuNumCores", 0);
        if (i != 0) {
            f10953a.f10956a = String.valueOf(i);
            return;
        }
        bf.a(new Runnable() { // from class: com.taobao.android.detail.ttdetail.utils.aa.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new b());
                    if (listFiles == null) {
                        return;
                    }
                    aa.b().f10956a = String.valueOf(listFiles.length);
                    SharedPreferences.Editor edit = defaultSharedPreferences.edit();
                    edit.putInt("detail_CpuNumCores", listFiles.length);
                    edit.apply();
                } catch (Throwable th) {
                    i.a("CpuInfoUtils", "initNumCores", th);
                }
            }
        });
    }

    /* loaded from: classes5.dex */
    public static class b implements FileFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1125711464);
            kge.a(-1123682416);
        }

        private b() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("50e018ca", new Object[]{this, file})).booleanValue();
            }
            try {
            } catch (Throwable th) {
                i.a("CpuInfoUtils", "initNumCores", th);
            }
            return Pattern.matches("cpu[0-9]", file.getName());
        }
    }
}
