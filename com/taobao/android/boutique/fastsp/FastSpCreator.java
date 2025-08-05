package com.taobao.android.boutique.fastsp;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.esl;
import tb.kge;
import tb.qmx;
import tb.tco;

/* loaded from: classes4.dex */
public class FastSpCreator {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, SharedPreferences> f9222a;
    private static final FastSpCreator b;
    private File d;
    private final Object c = new Object();
    private Set<String> e = new HashSet();

    static {
        kge.a(2000458229);
        f9222a = new ConcurrentHashMap();
        b = new FastSpCreator();
    }

    public static void a(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64b95557", new Object[]{set});
        } else {
            b.b(set);
        }
    }

    public static SharedPreferences create(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("11676488", new Object[]{context, str, new Integer(i)});
        }
        SharedPreferences sharedPreferences = f9222a.get(str);
        if (sharedPreferences == null) {
            synchronized (f9222a) {
                sharedPreferences = f9222a.get(str);
                if (sharedPreferences == null) {
                    SharedPreferences a2 = b.a(context, str, i);
                    f9222a.put(str, a2);
                    sharedPreferences = a2;
                }
            }
        }
        return sharedPreferences;
    }

    private FastSpCreator() {
    }

    public void b(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c5b2bb6", new Object[]{this, set});
        } else if (set == null) {
        } else {
            this.e = set;
        }
    }

    private SharedPreferences a(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("692cecad", new Object[]{this, context, str, new Integer(i)});
        }
        File b2 = b(context, str);
        File a2 = a(context, str);
        if (this.e.contains(str)) {
            tco.c("FastSpCreator", str, "BackupFastSp");
            return new BackupFastSp(b2, a2, i, new esl());
        }
        tco.c("FastSpCreator", str, b2.getAbsolutePath(), a2.getAbsolutePath());
        return new BackupFastSp(b2, a2, i, new qmx());
    }

    private File b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("4a8e03a4", new Object[]{this, context, str});
        }
        File a2 = a(context);
        return a(a2, str + ".kv");
    }

    public File a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("90186323", new Object[]{this, context, str});
        }
        if (Build.VERSION.SDK_INT >= 24) {
            File file = new File(context.getDataDir(), "shared_prefs");
            return a(file, str + ".xml");
        }
        File file2 = new File(context.getFilesDir().getParent(), "shared_prefs");
        return a(file2, str + ".xml");
    }

    private File a(File file, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("430677c4", new Object[]{this, file, str});
        }
        if (str.indexOf(File.separatorChar) < 0) {
            return new File(file, str);
        }
        throw new IllegalArgumentException("File " + str + " contains a path separator");
    }

    private File a(Context context) {
        File a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("72147cad", new Object[]{this, context});
        }
        synchronized (this.c) {
            if (this.d == null) {
                this.d = new File(context.getFilesDir(), "fast_kv");
            }
            a2 = a(this.d);
        }
        return a2;
    }

    private File a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("4659278e", new Object[]{this, file});
        }
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
