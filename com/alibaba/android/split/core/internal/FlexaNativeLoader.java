package com.alibaba.android.split.core.internal;

import android.util.Log;
import com.alibaba.android.split.core.splitcompat.Reflector;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.android.split.q;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import tb.bgy;
import tb.bib;
import tb.kge;

/* loaded from: classes2.dex */
public class FlexaNativeLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FlexaNativeLoader";

    static {
        kge.a(939287066);
    }

    public static void loadLibrary(String str) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5824adc6", new Object[]{str});
            return;
        }
        Log.e(TAG, "load loadLibrary:" + str);
        try {
            System.loadLibrary(str);
        } catch (Throwable th) {
            if ((th instanceof UnsatisfiedLinkError) && th.getMessage().contains("has bad ELF magic")) {
                z = true;
            }
            th.printStackTrace();
            String findLibrary = findLibrary(System.mapLibraryName(str));
            if (findLibrary != null && new File(findLibrary).exists()) {
                load(findLibrary, z);
                return;
            }
            try {
                bgy b = j.h().b();
                File a2 = b.a("messagesdkwrapper", "lib" + str + bgy.SO_EXTENSION);
                if (a2.exists()) {
                    load(a2.getAbsolutePath(), z);
                } else {
                    Log.e(TAG, "load loadLibrary:" + str + " soFile:" + a2.getAbsolutePath() + " is not exit");
                }
            } catch (IOException unused) {
                th.printStackTrace();
            }
            Log.e(TAG, "load loadLibrary:" + str + " path not exit!" + FlexaNativeLoader.class.getClassLoader() + " path:" + findLibrary);
        }
    }

    private static String findLibrary(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a450832d", new Object[]{str});
        }
        try {
            return (String) Reflector.a(FlexaNativeLoader.class.getClassLoader()).a("findLibrary", String.class).b(str);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static void load(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86e3e2bd", new Object[]{str, new Boolean(z)});
            return;
        }
        Log.e(TAG, "load :" + str);
        try {
            System.load(str);
        } catch (Throwable th) {
            th.printStackTrace();
            Log.e(TAG, "fileName:" + str + "fileMd5:" + bib.a(new File(str)));
            if (!(th instanceof UnsatisfiedLinkError) || !th.getMessage().contains("has bad ELF magic") || !z) {
                return;
            }
            new File(str).delete();
        }
    }

    public static void loadFeature(q qVar, bgy bgyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad47984b", new Object[]{qVar, bgyVar});
        } else if (!qVar.b().equals("messagesdkwrapper") || !bgyVar.h()) {
        } else {
            loadLibrary("sqlite3");
            loadLibrary("FTSEngine");
            loadLibrary("aim");
            loadLibrary("messagesdkwrapper");
        }
    }
}
