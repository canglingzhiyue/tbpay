package android.taobao.windvane.util;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.taobao.windvane.config.j;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.webkit.CookieManager;
import com.alipay.zoloz.toyger.blob.BlobManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.alr;
import tb.alt;
import tb.kge;
import tb.qfx;
import tb.qgm;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f1701a;
    private static Boolean b;

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : !TextUtils.isEmpty(str) && str.toLowerCase().startsWith("image");
    }

    public static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue();
        }
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    return packageManager.getPackageInfo(str, 0) != null;
                }
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static String b(Context context, String str) {
        PackageInfo packageInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1da50fb7", new Object[]{context, str});
        }
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                PackageManager packageManager = context.getPackageManager();
                return (packageManager == null || (packageInfo = packageManager.getPackageInfo(str, 0)) == null) ? "" : packageInfo.versionName;
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    public static File a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("72147cad", new Object[]{context});
        }
        if (j.commonConfig.aC && Build.VERSION.SDK_INT >= 29) {
            try {
                File externalFilesDir = context.getExternalFilesDir("apk");
                if (externalFilesDir != null) {
                    if (!externalFilesDir.exists()) {
                        externalFilesDir.mkdir();
                    }
                    return externalFilesDir;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (Build.VERSION.SDK_INT >= 8) {
            try {
                File externalCacheDir = context.getExternalCacheDir();
                if (externalCacheDir != null) {
                    if (!externalCacheDir.exists()) {
                        externalCacheDir.mkdirs();
                    }
                    return externalCacheDir;
                }
            } catch (Exception unused) {
            }
        }
        File file = new File(Environment.getExternalStorageDirectory().getPath() + ("/Android/data/" + context.getPackageName() + "/cache/"));
        try {
            if (!file.exists()) {
                file.mkdirs();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return file;
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        if (str != null && -1 != str.lastIndexOf(".")) {
            String substring = str.substring(str.lastIndexOf(".") + 1, str.length());
            for (String str2 : new String[]{"png", BlobManager.UPLOAD_IMAGE_TYPE_JPEG, com.taobao.android.litecreator.comprehension.f.FILE_TYPE_IMAGE_JPG, BlobManager.UPLOAD_IMAGE_TYPE_WEBP}) {
                if (str2.equals(substring)) {
                    return true;
                }
            }
        }
        return false;
    }

    static {
        kge.a(-597814627);
        f1701a = "";
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        if (b == null) {
            String c = c(context);
            if (context != null && TextUtils.equals(c, context.getPackageName())) {
                z = true;
            }
            b = Boolean.valueOf(z);
        }
        return b.booleanValue();
    }

    public static String c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6ba28c2", new Object[]{context});
        }
        try {
        } catch (Exception e) {
            m.e("getProcessName error", e.toString());
        }
        if (f1701a != null && f1701a.length() > 0) {
            return f1701a;
        }
        if (context == null) {
            return null;
        }
        int myPid = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid == myPid) {
                f1701a = runningAppProcessInfo.processName;
            }
        }
        return f1701a;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : (Build.VERSION.CODENAME.length() == 1 && Build.VERSION.CODENAME.charAt(0) >= 'Q' && Build.VERSION.CODENAME.charAt(0) <= 'Z') || Build.VERSION.SDK_INT == 29;
    }

    public static String a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1003a7b3", new Object[]{th});
        }
        StringWriter stringWriter = new StringWriter();
        try {
            th.printStackTrace(new PrintWriter(stringWriter));
        } catch (Throwable unused) {
        }
        return stringWriter.toString();
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : C0023a.a();
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        try {
            CookieManager.getInstance().flush();
        } catch (Throwable th) {
            m.e("CommonUtils", "CookieManager flush Exception:" + a(th));
        }
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        Uri parse = Uri.parse(str);
        String host = parse.getHost();
        String path = parse.getPath();
        if (path == null) {
            path = "";
        }
        return host + path;
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (str2 != null) {
            return str2;
        }
        String str3 = null;
        try {
            str3 = c(str);
        } catch (Exception unused) {
        }
        return !TextUtils.isEmpty(str3) ? str3 : "windvane";
    }

    public static alt a(String str, String str2, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (alt) ipChange.ipc$dispatch("c0a2d2b1", new Object[]{str, str2, context});
        }
        if (context instanceof MutableContextWrapper) {
            context = ((MutableContextWrapper) context).getBaseContext();
        }
        return new alr(a(str, str2), "WindVane").a(context);
    }

    /* renamed from: android.taobao.windvane.util.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0023a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final AtomicBoolean f1702a;
        private static double d;
        private boolean e;
        private int f;
        private int g = 0;

        public static /* synthetic */ String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : c();
        }

        static {
            kge.a(-1153793137);
            f1702a = new AtomicBoolean(false);
            b();
        }

        private static void b() {
            Application application;
            Resources resources;
            DisplayMetrics displayMetrics;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[0]);
            } else if (f1702a.get() || (application = android.taobao.windvane.config.a.f) == null || (resources = application.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null || !f1702a.compareAndSet(false, true)) {
            } else {
                d = displayMetrics.density;
            }
        }

        private static String c() {
            int i;
            IpChange ipChange = $ipChange;
            int i2 = 0;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
            }
            C0023a d2 = d();
            qfx qfxVar = (qfx) qgm.a().a(qfx.class);
            if (qfxVar != null) {
                i2 = qfxVar.a();
                i = qfxVar.b();
            } else {
                i = 0;
            }
            double d3 = d2.f / d;
            return "w=" + i2 + "&h=" + i + "&ls=" + (d2.e ? 1 : 0) + "&sh=" + d3 + "&dpr=" + d + "&dl=" + d2.g;
        }

        private static C0023a d() {
            Resources resources;
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                return (C0023a) ipChange.ipc$dispatch("8edc7f05", new Object[0]);
            }
            C0023a c0023a = new C0023a();
            Application application = android.taobao.windvane.config.a.f;
            if (application != null && (resources = application.getResources()) != null) {
                int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier > 0) {
                    c0023a.f = resources.getDimensionPixelSize(identifier);
                }
                Configuration configuration = resources.getConfiguration();
                if (configuration != null) {
                    if (configuration.orientation == 2) {
                        z = true;
                    }
                    c0023a.e = z;
                }
            }
            com.taobao.application.common.d a2 = com.taobao.application.common.c.a();
            if (a2 != null) {
                c0023a.g = a2.a("deviceLevel", -1) + 1;
            }
            return c0023a;
        }
    }
}
