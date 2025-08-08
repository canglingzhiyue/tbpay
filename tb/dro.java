package tb;

import android.app.Application;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.behavix.behavixswitch.a;
import com.taobao.android.behavix.behavixswitch.e;
import com.taobao.android.behavix.d;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import com.taobao.android.weex_framework.util.a;
import com.taobao.application.common.c;
import com.taobao.login4android.api.Login;
import com.taobao.media.MediaConstant;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.uikit.extend.utils.DisplayUtil;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.intf.Mtop;
import tb.mto;
import tb.nkr;

/* loaded from: classes.dex */
public final class dro {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Application f26927a;
    private static String b;
    private static Map<String, String> c;
    private static Map<String, String> d;
    private static int e;
    private static Boolean f;
    private static final Map<String, Boolean> g;
    private static volatile Boolean h;
    private static String i;
    private static Boolean j;
    private static final Object k;
    private static int l;
    private static int m;
    private static boolean n;

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue();
        }
        return true;
    }

    static {
        kge.a(-1512455717);
        b = "";
        c = new HashMap();
        d = new HashMap();
        e = 0;
        g = new ConcurrentHashMap();
        h = null;
        k = new Object();
        n = false;
    }

    public static synchronized Application a() {
        synchronized (dro.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Application) ipChange.ipc$dispatch("f921f837", new Object[0]);
            }
            if (f26927a == null) {
                f26927a = h();
            }
            return f26927a;
        }
    }

    private static Application h() {
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Method declaredMethod = cls.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            Field declaredField = cls.getDeclaredField("mInitialApplication");
            declaredField.setAccessible(true);
            return (Application) declaredField.get(declaredMethod.invoke(null, new Object[0]));
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        if (r4.equals("2001") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.dro.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r4
            java.lang.String r4 = "9f352ae"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L15:
            r0 = -1
            int r1 = r4.hashCode()
            switch(r1) {
                case 1507454: goto L59;
                case 1537215: goto L50;
                case 1538176: goto L46;
                case 1539137: goto L3c;
                case 1539138: goto L32;
                case 1542981: goto L28;
                case 47007217: goto L1e;
                default: goto L1d;
            }
        L1d:
            goto L63
        L1e:
            java.lang.String r1 = "19999"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L63
            r2 = 4
            goto L64
        L28:
            java.lang.String r1 = "2601"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L63
            r2 = 6
            goto L64
        L32:
            java.lang.String r1 = "2202"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L63
            r2 = 3
            goto L64
        L3c:
            java.lang.String r1 = "2201"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L63
            r2 = 2
            goto L64
        L46:
            java.lang.String r1 = "2101"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L63
            r2 = 1
            goto L64
        L50:
            java.lang.String r1 = "2001"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L63
            goto L64
        L59:
            java.lang.String r1 = "1010"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L63
            r2 = 5
            goto L64
        L63:
            r2 = -1
        L64:
            switch(r2) {
                case 0: goto L7a;
                case 1: goto L76;
                case 2: goto L72;
                case 3: goto L72;
                case 4: goto L6f;
                case 5: goto L6c;
                case 6: goto L68;
                default: goto L67;
            }
        L67:
            return r4
        L68:
            java.lang.String r4 = "scroll"
            return r4
        L6c:
            java.lang.String r4 = "appOut"
            return r4
        L6f:
            java.lang.String r4 = "custom"
            return r4
        L72:
            java.lang.String r4 = "expose"
            return r4
        L76:
            java.lang.String r4 = "tap"
            return r4
        L7a:
            java.lang.String r4 = "pv"
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dro.a(java.lang.String):java.lang.String");
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue();
        }
        if (e == 0 && d.b() != null) {
            e = a(d.b());
        }
        return e;
    }

    private static int a(Context context) {
        Display defaultDisplay;
        Point point;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        if (context == null) {
            return 0;
        }
        try {
            defaultDisplay = ((WindowManager) context.getSystemService(a.ATOM_EXT_window)).getDefaultDisplay();
            point = new Point();
        } catch (Exception unused) {
        }
        if (Build.VERSION.SDK_INT >= 19) {
            defaultDisplay.getRealSize(point);
        } else {
            if (Build.VERSION.SDK_INT >= 13) {
                defaultDisplay.getSize(point);
            }
            return 0;
        }
        return point.y * point.x;
    }

    public static String a(String str, String str2, String str3, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6c45f54", new Object[]{str, str2, str3, view});
        }
        String str4 = str + str2 + str3;
        if (view == null || !a.b.e()) {
            return str4;
        }
        return str4 + view.hashCode();
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : "taobao".equals(d.c());
    }

    public static int d() {
        int g2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[0])).intValue();
        }
        if (nkr.a.sSwitchOpen && (g2 = d.g()) >= 0) {
            return g2;
        }
        Mtop instance = Mtop.instance(d.b(), d.d());
        int envMode = EnvModeEnum.ONLINE.getEnvMode();
        return (instance == null || instance.getMtopConfig() == null) ? envMode : instance.getMtopConfig().envMode.getEnvMode();
    }

    public static boolean a(double d2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f4cc2", new Object[]{new Double(d2), new Boolean(z)})).booleanValue();
        }
        try {
            long a2 = com.taobao.android.ucp.util.d.a();
            if (a2 != 0 && d2 > mto.a.GEO_NOT_SUPPORT && d2 <= 1.0d) {
                return (a2 + (z ? System.currentTimeMillis() / 86400000 : 0L)) % ((long) (1.0d / d2)) == 0;
            }
            return false;
        } catch (Throwable th) {
            dsb.a("sampleByUserId", null, null, th);
            return false;
        }
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[0])).booleanValue();
        }
        if (f == null) {
            f = Boolean.valueOf("1".equals(com.taobao.android.behavix.behavixswitch.a.a("useStringOptimize", "1")));
            TLog.loge("UCP", "stringMemoryOptimizeEnabled", String.valueOf(f));
        }
        return f.booleanValue();
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        try {
            Application b2 = d.b();
            boolean isFeatureOpened = ABGlobal.isFeatureOpened(b2, str + "_android");
            if (!isFeatureOpened) {
                isFeatureOpened = ABGlobal.isFeatureOpened(d.b(), str);
            }
            if (isFeatureOpened && nkr.SWITCH_NAME.equals(str)) {
                isFeatureOpened = d.h();
            }
            TLog.loge("UCP", "getABSwitch", str, String.valueOf(isFeatureOpened));
            return isFeatureOpened;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[0]);
        }
        String str = i;
        if (str != null) {
            return str;
        }
        try {
            i = c.a().a("launchType", mpa.HOT);
        } catch (Throwable unused) {
            i = "";
        }
        return i;
    }

    public static String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("666b162a", new Object[]{str});
        }
        if (!com.taobao.android.behavix.behavixswitch.a.a("enableCutUrlScene", true)) {
            return str;
        }
        if (str == null) {
            return null;
        }
        boolean startsWith = str.startsWith("http");
        int indexOf = str.indexOf("?");
        return (!startsWith || indexOf < 0) ? str : str.substring(0, indexOf);
    }

    public static boolean a(double d2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a82180da", new Object[]{new Double(d2)})).booleanValue() : d2 > Math.random();
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (!a.b.s()) {
        } else {
            UncaughtCrashHeader crashCaughtHeader = TCrashSDK.instance().getCrashCaughtHeader();
            c.put(str, str2);
            crashCaughtHeader.addHeaderInfo("bhx", a(c));
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else if (!a.b.s()) {
        } else {
            d.put(str, str2);
        }
    }

    public static void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{str});
        } else if (!a.b.s()) {
        } else {
            d.remove(str);
        }
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[0]) : !a.b.s() ? "" : a(d);
    }

    private static String a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map});
        }
        StringBuilder sb = new StringBuilder();
        for (String str : map.keySet()) {
            String str2 = map.get(str);
            if (!StringUtils.isEmpty(str2)) {
                sb.append(str);
                sb.append(":");
                sb.append(str2);
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[0]);
            return;
        }
        synchronized (k) {
            j = null;
        }
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue();
        }
        synchronized (k) {
            if (j != null) {
                return j.booleanValue();
            }
            j = false;
            if (b("bhx_close")) {
                j = true;
                return true;
            } else if (b("bhx_closeInLowDevice") && "l".equals(com.taobao.android.behavix.utils.c.c())) {
                j = true;
                return true;
            } else {
                List parseArray = JSON.parseArray(e.a().a(com.taobao.android.behavix.behavixswitch.a.ORANGE_GROUP_NAME, "bxCloseDeviceLevel", MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264), String.class);
                if (parseArray != null && parseArray.contains(com.taobao.android.behavix.utils.c.c())) {
                    j = true;
                    return true;
                }
                List parseArray2 = JSON.parseArray(e.a().a(com.taobao.android.behavix.behavixswitch.a.ORANGE_GROUP_NAME, "bxCloseDeviceModelV3", "[\"mi8lite\",\"mi8\",\"v1965a\"]"), String.class);
                if (parseArray2 != null && parseArray2.contains(Build.MODEL.replaceAll("\\s", "").toLowerCase())) {
                    j = true;
                }
                List parseArray3 = JSON.parseArray(e.a().a(com.taobao.android.behavix.behavixswitch.a.ORANGE_GROUP_NAME, "bxCloseDeviceUID", "[\"62277235\"]"), String.class);
                if (parseArray3 != null && parseArray3.contains(Login.getUserId())) {
                    j = true;
                }
                return j.booleanValue();
            }
        }
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue() : "l".equals(com.taobao.android.behavix.utils.c.c());
    }

    public static int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f95765", new Object[0])).intValue();
        }
        o();
        return l;
    }

    public static int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6239de8", new Object[0])).intValue();
        }
        o();
        return m;
    }

    public static void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[0]);
        } else if (!n && m != 0) {
        } else {
            n = false;
            l = DisplayUtil.getScreenWidth(d.b());
            m = DisplayUtil.getScreenHeight(d.b());
        }
    }

    public static void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[0]);
        } else {
            n = true;
        }
    }

    public static float a(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8218848", new Object[]{new Float(f2)})).floatValue();
        }
        Application b2 = d.b();
        if (b2 == null) {
            b2 = Globals.getApplication();
        }
        return b2 == null ? f2 : f2 / DisplayUtil.getScreenDensity(Globals.getApplication());
    }
}
