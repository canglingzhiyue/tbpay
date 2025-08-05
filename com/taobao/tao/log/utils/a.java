package com.taobao.tao.log.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.log.TLogNative;
import com.taobao.tao.log.g;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOG_SUFFIX_DATA = ".data";
    public static final String LOG_SUFFIX_TLOG = ".tlog";

    /* renamed from: a */
    public static String f20701a;
    public static AtomicBoolean b;
    private static File c;
    private static File d;
    private static File e;
    private static File f;
    private static b g;
    private static String[] h;
    private static File i;

    /* renamed from: com.taobao.tao.log.utils.a$a */
    /* loaded from: classes8.dex */
    public static class C0867a {

        /* renamed from: a */
        public String f20702a;
        public long b;

        static {
            kge.a(-1962314846);
        }

        public C0867a(String str, long j) {
            this.f20702a = str;
            this.b = j;
        }
    }

    public static /* synthetic */ void lambda$ClpRdFXu06RdOqZHhv6tEwh0tyY(File file, File file2, File file3, File file4) {
        a(file, file2, file3, file4);
    }

    public static /* synthetic */ boolean lambda$SEEEg7NY7FyNFLFPG5I2zFwlbUY(String[] strArr, File file, String str) {
        return a(strArr, file, str);
    }

    public static File a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("a060c1a5", new Object[0]) : d;
    }

    public static File b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("64f2a3c4", new Object[0]) : c;
    }

    public static File c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("298485e3", new Object[0]) : e;
    }

    public static File d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("ee166802", new Object[0]) : f;
    }

    public static File g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("3bcc0e5f", new Object[0]) : i;
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]) : f20701a;
    }

    public static void a(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        File file = new File(context.getFilesDir(), "tlog_config");
        f = file;
        if (!file.exists()) {
            f.mkdirs();
        }
        d = new File(context.getFilesDir(), "tlog_v" + com.taobao.tao.log.d.b());
        if (com.taobao.tao.log.d.d()) {
            str = "tdata_v" + com.taobao.tao.log.d.b();
            f20701a = LOG_SUFFIX_DATA;
        } else {
            str = "tlog_v" + com.taobao.tao.log.d.b();
            f20701a = LOG_SUFFIX_TLOG;
        }
        if (com.taobao.tao.log.d.c()) {
            c = context.getDir(str, 0);
        } else {
            try {
                c = context.getExternalFilesDir(str);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (c == null) {
                c = context.getDir(str, 0);
            }
        }
        i = context.getDir("tmini_v", 0);
        e = new File(c, "upload");
        b bVar = new b(c.getAbsolutePath());
        g = bVar;
        bVar.startWatching();
        b(context);
        String.format("LogDir :%s, CacheDir: %s, LogSuffix: %s", c.getAbsolutePath(), d.getAbsolutePath(), f20701a);
    }

    private static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
            return;
        }
        final File externalFilesDir = context.getExternalFilesDir("tdata_v9");
        final File externalFilesDir2 = context.getExternalFilesDir("tlog_v9");
        final File dir = context.getDir("tdata_v9", 0);
        final File dir2 = context.getDir("tlog_v9", 0);
        d.a().a(new Runnable() { // from class: com.taobao.tao.log.utils.-$$Lambda$a$ClpRdFXu06RdOqZHhv6tEwh0tyY
            @Override // java.lang.Runnable
            public final void run() {
                a.lambda$ClpRdFXu06RdOqZHhv6tEwh0tyY(externalFilesDir2, dir2, externalFilesDir, dir);
            }
        });
        ArrayList arrayList = new ArrayList();
        arrayList.add(dir.getAbsolutePath());
        arrayList.add(dir2.getAbsolutePath());
        if (externalFilesDir != null) {
            arrayList.add(externalFilesDir.getAbsolutePath());
        }
        if (externalFilesDir2 != null) {
            arrayList.add(externalFilesDir2.getAbsolutePath());
        }
        h = (String[]) arrayList.toArray(new String[0]);
    }

    public static /* synthetic */ void a(File file, File file2, File file3, File file4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2e5d0c4", new Object[]{file, file2, file3, file4});
            return;
        }
        if (com.taobao.tao.log.d.d()) {
            a(file);
            a(file2);
        } else {
            a(file3);
            a(file4);
        }
        g.b(e);
    }

    private static void a(File file) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a979fdf", new Object[]{file});
        } else if (file != null && file.isDirectory() && file.exists() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.getName().endsWith(LOG_SUFFIX_TLOG) && System.currentTimeMillis() - file2.lastModified() > com.taobao.tao.log.d.i() * 24 * 3600000) {
                    file2.delete();
                }
            }
        }
    }

    public static List<String> a(FilenameFilter filenameFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2ebfac6b", new Object[]{filenameFilter});
        }
        ArrayList arrayList = new ArrayList();
        for (String str : h) {
            List<String> a2 = a(str, filenameFilter);
            if (a2 != null) {
                arrayList.addAll(a2);
            }
        }
        return arrayList;
    }

    public static List<String> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e89f38ba", new Object[0]) : a((FilenameFilter) null);
    }

    public static List<String> a(final String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a10d1db0", new Object[]{strArr});
        }
        if (strArr != null) {
            return a(new FilenameFilter() { // from class: com.taobao.tao.log.utils.-$$Lambda$a$SEEEg7NY7FyNFLFPG5I2zFwlbUY
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) {
                    return a.lambda$SEEEg7NY7FyNFLFPG5I2zFwlbUY(strArr, file, str);
                }
            });
        }
        return null;
    }

    public static /* synthetic */ boolean a(String[] strArr, File file, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2cb373c", new Object[]{strArr, file, str})).booleanValue();
        }
        for (String str2 : strArr) {
            if (!str.contains("_" + str2 + LOG_SUFFIX_TLOG)) {
                if (!str.contains("_" + str2 + LOG_SUFFIX_DATA)) {
                }
            }
            return true;
        }
        return false;
    }

    public static List<String> a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{str}) : a(new String[]{str});
    }

    public static List<String> a(long j, long j2) {
        C0867a c0867a;
        long j3 = j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a597da5f", new Object[]{new Long(j3), new Long(j2)});
        }
        if (j3 < 0 || j2 < 0 || j3 > j2) {
            return null;
        }
        List<String> f2 = f();
        if (f2.isEmpty()) {
            return f2;
        }
        String a2 = g.a(j);
        String a3 = g.a(j2);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (String str : f2) {
            File file = new File(str);
            String name = file.getName();
            long lastModified = file.lastModified();
            int i2 = (lastModified > j3 ? 1 : (lastModified == j3 ? 0 : -1));
            if (i2 >= 0 && lastModified <= j2) {
                arrayList.add(str);
            } else {
                int lastIndexOf = name.lastIndexOf("_");
                if (lastIndexOf != -1) {
                    String substring = name.substring(0, lastIndexOf);
                    if (i2 < 0 && name.contains(a2)) {
                        C0867a c0867a2 = (C0867a) hashMap.get(substring);
                        if (c0867a2 == null || c0867a2.b < lastModified) {
                            hashMap.put(substring, new C0867a(str, lastModified));
                        }
                    } else if (lastModified > j2 && name.contains(a3) && ((c0867a = (C0867a) hashMap2.get(substring)) == null || c0867a.b > lastModified)) {
                        hashMap2.put(substring, new C0867a(str, lastModified));
                    }
                }
                j3 = j;
            }
        }
        for (C0867a c0867a3 : hashMap2.values()) {
            arrayList.add(c0867a3.f20702a);
        }
        if (arrayList.isEmpty()) {
            for (C0867a c0867a4 : hashMap.values()) {
                arrayList.add(c0867a4.f20702a);
            }
        }
        return arrayList;
    }

    public static List<String> a(com.taobao.android.tlog.protocol.model.request.base.a[] aVarArr) {
        List<String> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9cffd307", new Object[]{aVarArr});
        }
        if (aVarArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (com.taobao.android.tlog.protocol.model.request.base.a aVar : aVarArr) {
            if (aVar.d > 0 && aVar.e > aVar.d) {
                a2 = a(aVar.d, aVar.e);
            } else {
                a2 = a(g.a(aVar.c.intValue()));
            }
            if (a2 != null) {
                if (!TextUtils.isEmpty(aVar.f15568a)) {
                    for (String str : a2) {
                        if (str.startsWith(aVar.f15568a + "_")) {
                            arrayList.add(str);
                        }
                    }
                } else {
                    arrayList.addAll(a2);
                }
            }
        }
        return arrayList;
    }

    private static List<String> a(String str, FilenameFilter filenameFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f4d8fd61", new Object[]{str, filenameFilter});
        }
        ArrayList arrayList = new ArrayList();
        File file = new File(str);
        if (file.isDirectory() && file.exists()) {
            String[] list = file.list();
            if (list == null) {
                return null;
            }
            if (filenameFilter == null) {
                filenameFilter = $$Lambda$a$PfcraNWHEZTyP_barQHHew7GLwk.INSTANCE;
            }
            for (String str2 : list) {
                if (filenameFilter.accept(file, str2)) {
                    arrayList.add(file.getAbsolutePath() + File.separator + str2);
                }
            }
        }
        return arrayList;
    }

    public static /* synthetic */ boolean a(File file, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2fbe2fed", new Object[]{file, str})).booleanValue() : str.contains(LOG_SUFFIX_TLOG) || str.contains(LOG_SUFFIX_DATA);
    }

    static {
        kge.a(2018290360);
        b = new AtomicBoolean(false);
    }

    public static int a(int i2, int i3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b279fb0", new Object[]{new Integer(i2), new Integer(i3), map})).intValue();
        }
        Log.e("TLogFileManager", String.format("Clear log storage. expected: %d, realSize:%d", Integer.valueOf(i2), Integer.valueOf(i3)));
        if (i2 < 0) {
            return -1;
        }
        if (!b.compareAndSet(false, true)) {
            Log.e("TLogFileManager", "Current in clear process....");
            return -1;
        }
        try {
            int clearLogFiles = TLogNative.clearLogFiles(i2);
            TLog.loge("TLogFileManager", "", String.format("Clear log storage. expected: %d, actual:%d", Integer.valueOf(i2), Integer.valueOf(clearLogFiles)));
            return clearLogFiles;
        } catch (Exception unused) {
            return -1;
        } finally {
            b.set(false);
        }
    }
}
