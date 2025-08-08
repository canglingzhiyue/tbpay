package tb;

import android.app.Application;
import android.os.Environment;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.alivfssdk.cache.b;
import com.taobao.alivfssdk.cache.c;
import com.taobao.alivfssdk.cache.h;
import com.taobao.tao.Globals;
import java.io.File;

/* loaded from: classes7.dex */
public class mxg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f31309a;
    private static h b;
    private static boolean d;
    private static String e;
    private static String f;

    static {
        kge.a(-687671977);
        b = null;
        d = false;
        e = "cache1";
        f = "persist_images";
        f31309a = "MyTaobao";
    }

    public static synchronized void a(Application application) {
        synchronized (mxg.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("75c56f77", new Object[]{application});
                return;
            }
            if (!d) {
                d = true;
                a();
            }
            b cacheForModule = AVFSCacheManager.getInstance().cacheForModule(f31309a);
            if (cacheForModule != null) {
                cacheForModule.a(application.getClassLoader());
            }
            new c().f8483a = 1048576L;
            if (b == null) {
                b = cacheForModule.a();
            }
        }
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        h hVar = b;
        if (hVar == null) {
            return false;
        }
        return hVar.c(str);
    }

    private static void a() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        Application application = Globals.getApplication();
        if (application == null) {
            return;
        }
        String packageName = application.getPackageName();
        if (!StringUtils.isEmpty("taobao")) {
            str = Environment.getExternalStorageState().toString() + "/taobao/" + packageName;
            str2 = application.getExternalCacheDir() + "/taobao/" + packageName;
        } else {
            str = Environment.getExternalStorageState().toString() + "/" + packageName;
            str2 = application.getExternalCacheDir() + "/" + packageName;
        }
        a(new File(str));
        a(new File(str2));
        a(new File(application.getFilesDir(), e));
        a(new File(application.getFilesDir(), e + ".dat"));
        a(new File(application.getFilesDir(), f));
    }

    private static void a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a979fdf", new Object[]{file});
        } else if (file != null && file.exists()) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles == null || listFiles.length <= 0) {
                    return;
                }
                for (File file2 : listFiles) {
                    a(file2);
                }
                return;
            }
            file.delete();
        }
    }
}
