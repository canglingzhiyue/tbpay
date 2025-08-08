package tb;

import android.app.Application;
import android.os.Environment;
import android.support.v4.util.LruCache;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.alivfssdk.cache.b;
import com.taobao.alivfssdk.cache.c;
import com.taobao.alivfssdk.cache.h;
import com.taobao.tao.Globals;
import com.taobao.tao.util.Constants;
import java.io.File;

@Deprecated
/* loaded from: classes2.dex */
public class acv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f25254a;
    private static h b;
    private static LruCache<String, Object> c;
    private static boolean d;
    private static String e;
    private static String f;
    private static int g;

    static {
        kge.a(-666041644);
        b = null;
        c = null;
        d = false;
        e = "cache1";
        f = "persist_images";
        f25254a = "tao_sdk";
        g = 10;
    }

    public static synchronized void a(Application application) {
        synchronized (acv.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("75c56f77", new Object[]{application});
                return;
            }
            if (!d) {
                d = true;
                a();
            }
            b cacheForModule = AVFSCacheManager.getInstance().cacheForModule(f25254a);
            if (cacheForModule != null) {
                cacheForModule.a(application.getClassLoader());
            }
            new c().f8483a = 1048576L;
            if (b == null && cacheForModule != null) {
                b = cacheForModule.a();
            }
            if (c == null) {
                c = new LruCache<>(g);
            }
        }
    }

    private static void a() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        String str3 = Constants.SAVE_FILE_ROOT_DIR;
        Application application = Globals.getApplication();
        if (application == null) {
            return;
        }
        String packageName = application.getPackageName();
        if (!StringUtils.isEmpty(str3)) {
            str = Environment.getExternalStorageState().toString() + "/" + str3 + "/" + packageName;
            str2 = application.getExternalCacheDir() + "/" + str3 + "/" + packageName;
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
