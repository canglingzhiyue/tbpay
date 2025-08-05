package com.taobao.android.litecreator.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import tb.iju;
import tb.kge;

/* loaded from: classes5.dex */
public class bf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BIT32 = 7;
    public static final int BIT64 = 8;
    public static final int UNKNOWN = -1;

    /* renamed from: a  reason: collision with root package name */
    private static Set<String> f13499a;
    private static int b;

    static {
        kge.a(1941441596);
        f13499a = null;
        b = -1;
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        int i = b;
        if (i != -1) {
            return i;
        }
        int a2 = a(context.getApplicationInfo().nativeLibraryDir);
        if (a2 == -1) {
            a2 = b(context);
        }
        b = a2;
        u.d("CpuArch", "getCpuArchValue " + a2);
        return a2;
    }

    private static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        if (str == null) {
            return -1;
        }
        File file = new File(str);
        if (!file.isDirectory()) {
            return -1;
        }
        String lowerCase = file.getName().toLowerCase();
        if (Build.VERSION.SDK_INT >= 21 && lowerCase.startsWith("arm64")) {
            return 8;
        }
        return lowerCase.equals("arm") ? 7 : -1;
    }

    public static Set<String> a(ApplicationInfo applicationInfo) {
        ZipFile zipFile;
        File parentFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("73b7c0a4", new Object[]{applicationInfo});
        }
        Set<String> set = f13499a;
        if (set != null) {
            return set;
        }
        f13499a = new HashSet();
        HashSet<String> hashSet = new HashSet();
        hashSet.add(applicationInfo.sourceDir);
        if (Build.VERSION.SDK_INT >= 21 && applicationInfo.splitSourceDirs != null) {
            hashSet.addAll(Arrays.asList(applicationInfo.splitSourceDirs));
        }
        for (String str : hashSet) {
            ZipFile zipFile2 = null;
            try {
                try {
                    zipFile = new ZipFile(str);
                    try {
                        Enumeration<? extends ZipEntry> entries = zipFile.entries();
                        while (entries.hasMoreElements()) {
                            String name = entries.nextElement().getName();
                            if (!name.contains("../") && (parentFile = new File(name).getParentFile()) != null && parentFile.getPath().startsWith("lib/")) {
                                f13499a.add(parentFile.getName());
                            }
                        }
                        try {
                            zipFile.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } catch (IOException e2) {
                        e = e2;
                        zipFile2 = zipFile;
                        e.printStackTrace();
                        if (zipFile2 != null) {
                            zipFile2.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (IOException e4) {
                    e = e4;
                }
            } catch (Throwable th2) {
                th = th2;
                zipFile = null;
            }
        }
        return f13499a;
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eca0ff2", new Object[]{context})).intValue();
        }
        Set<String> a2 = a(context.getApplicationInfo());
        if (Build.VERSION.SDK_INT < 21 || Build.SUPPORTED_64_BIT_ABIS.length == 0) {
            return 7;
        }
        if (a2 != null && !a2.isEmpty()) {
            for (String str : a2) {
                if (!iju.ABI_ARM64.endsWith(str)) {
                    if (!"x86_64".equals(str)) {
                        if ("mips64".equals(str)) {
                        }
                    }
                }
            }
            return 7;
        }
        return 8;
    }
}
