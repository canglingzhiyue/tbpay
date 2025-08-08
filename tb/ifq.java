package tb;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.adapter.IWXFoldDeviceAdapter;
import com.taobao.weex.utils.WXLogUtils;
import com.taobao.weex.utils.WXUtils;
import dalvik.system.BaseDexClassLoader;
import java.io.File;

/* loaded from: classes9.dex */
public class ifq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1771757762);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
        if (r2 == null) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a() {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.ifq.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L12
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "aff6e538"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L12:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/proc/self/maps"
            r0.<init>(r1)
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L50
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L50
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L50
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L50
        L24:
            java.lang.String r0 = r2.readLine()     // Catch: java.io.IOException -> L4b java.lang.Throwable -> L59
            if (r0 == 0) goto L44
            java.lang.String r3 = "icudt"
            boolean r3 = r0.contains(r3)     // Catch: java.io.IOException -> L4b java.lang.Throwable -> L59
            if (r3 == 0) goto L24
            r3 = 47
            int r3 = r0.indexOf(r3)     // Catch: java.io.IOException -> L4b java.lang.Throwable -> L59
            java.lang.String r0 = r0.substring(r3)     // Catch: java.io.IOException -> L4b java.lang.Throwable -> L59
            java.lang.String r0 = r0.trim()     // Catch: java.io.IOException -> L4b java.lang.Throwable -> L59
            r2.close()     // Catch: java.io.IOException -> L43
        L43:
            return r0
        L44:
            r2.close()     // Catch: java.io.IOException -> L4b java.lang.Throwable -> L59
        L47:
            r2.close()     // Catch: java.io.IOException -> L58
            goto L58
        L4b:
            r0 = move-exception
            goto L52
        L4d:
            r0 = move-exception
            r2 = r1
            goto L5a
        L50:
            r0 = move-exception
            r2 = r1
        L52:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L59
            if (r2 == 0) goto L58
            goto L47
        L58:
            return r1
        L59:
            r0 = move-exception
        L5a:
            if (r2 == 0) goto L5f
            r2.close()     // Catch: java.io.IOException -> L5f
        L5f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ifq.a():java.lang.String");
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        String findLibrary = ((BaseDexClassLoader) WXEnvironment.class.getClassLoader()).findLibrary(str);
        if (!StringUtils.isEmpty(findLibrary)) {
            File file = new File(findLibrary);
            if (file.exists()) {
                WXLogUtils.e(str + "'s Path is" + findLibrary);
                return file.getAbsolutePath();
            }
            WXLogUtils.e(str + "'s Path is " + findLibrary + " but file does not exist");
        }
        String str2 = "lib" + str + bgy.SO_EXTENSION;
        String b = b();
        if (StringUtils.isEmpty(b)) {
            WXLogUtils.e("cache dir is null");
            return "";
        }
        if (b.indexOf("/cache") > 0) {
            findLibrary = new File(b.replace("/cache", "/lib"), str2).getAbsolutePath();
        }
        if (new File(findLibrary).exists()) {
            WXLogUtils.e(str + "use lib so");
        }
        return findLibrary;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        Application application = WXEnvironment.getApplication();
        if (application != null && application.getApplicationContext() != null) {
            return application.getApplicationContext().getCacheDir().getPath();
        }
        return null;
    }

    public static boolean c() {
        IWXFoldDeviceAdapter wXFoldDeviceAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        if (WXUtils.disableBuildVersionFix() || (wXFoldDeviceAdapter = WXSDKManager.getInstance().getWXFoldDeviceAdapter()) == null) {
            return false;
        }
        return wXFoldDeviceAdapter.isTablet();
    }

    public static boolean d() {
        IWXFoldDeviceAdapter wXFoldDeviceAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        if (WXUtils.disableBuildVersionFix() || (wXFoldDeviceAdapter = WXSDKManager.getInstance().getWXFoldDeviceAdapter()) == null) {
            return false;
        }
        return wXFoldDeviceAdapter.isFoldDevice();
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return -1;
        }
        return resources.getDimensionPixelSize(identifier);
    }

    public static Boolean a(Object obj, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("17324fc6", new Object[]{obj, bool});
        }
        if (obj == null) {
            return bool;
        }
        if (StringUtils.equals("false", obj.toString())) {
            return false;
        }
        if (!StringUtils.equals("true", obj.toString())) {
            return bool;
        }
        return true;
    }
}
