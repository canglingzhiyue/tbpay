package com.taobao.android.autosize;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.provider.Settings;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.config.a;
import com.taobao.tao.log.TLog;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import tb.gvn;
import tb.gvo;
import tb.riy;

/* loaded from: classes.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HN_MANUFACTURE_LOWER_CASE = "honor";
    public static final String HW_MANUFACTURE_LOWER_CASE = "huawei";
    public static final String LENOVO_MANUFACTURE_LOWER_CASE = "lenovo";
    public static final String MI_MANUFACTURE_LOWER_CASE = "xiaomi";
    public static final String OP_MANUFACTURE_LOWER_CASE = "oppo";
    public static final String REDMI_MANUFACTURE_LOWER_CASE = "redmi";
    public static final String SS_MANUFACTURE_LOWER_CASE = "samsung";
    public static final String VV_MANUFACTURE_LOWER_CASE = "vivo";
    private static final Pattern j = Pattern.compile("([a-z]+)-\\[(\\d+),(\\d+),(\\d+),(\\d+)]-?(flat|half-opened)?");
    private static volatile int f = -1;
    private static volatile int k = -1;
    private static volatile int g = -1;
    private static volatile int h = -1;
    private static volatile int l = -1;

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f9114a = new ArrayList<String>() { // from class: com.taobao.android.autosize.TBDeviceUtils$1
        {
            add("unknownRLI");
            add("HWTAH");
            add("TAH-AN00m");
            add("HWTAH-C");
            add("RHA-AN00m");
            add("unknownRHA");
            add("HGS-AL10");
        }
    };
    private static final List<String> b = new ArrayList<String>() { // from class: com.taobao.android.autosize.TBDeviceUtils$2
        {
            add("SM-F9000");
            add("SM-W2020");
            add("SM-F9160");
            add("SM-W2021");
            add("SM-F9260");
            add("SM-W2022");
            add("SM-F9360");
            add("SM-F9460");
            add("SM-W9023");
        }
    };
    private static final List<String> c = new ArrayList<String>() { // from class: com.taobao.android.autosize.TBDeviceUtils$3
        {
            add("cetus");
            add("zizhan");
        }
    };
    private static final List<String> d = new ArrayList<String>() { // from class: com.taobao.android.autosize.TBDeviceUtils$4
        {
            add("M2011J18C");
            add("22061218C");
            add("2308CPXD0C");
        }
    };
    private static final List<String> e = new ArrayList<String>() { // from class: com.taobao.android.autosize.TBDeviceUtils$5
        {
            add("PGT110");
            add("BAL-AL00");
            add("BAL-AL60");
            add("BAL-AL80");
            add("BAL-L49");
        }
    };
    private static final List<String> i = new ArrayList<String>() { // from class: com.taobao.android.autosize.TBDeviceUtils$6
        {
            add("ELS-AN00");
            add("ANA-AN00");
            add("TAS-AN00");
            add("NOH-AN00");
            add("LIO-AN00");
            add("SEA-AL10");
            add("M2012K11AC");
            add("FNE-AN00");
            add("2211133C");
            add("23013RK75C");
            add("RVL-AL09");
            add("Mi 10");
            add("23116PN5BC");
            add("M2102J2SC");
            add("M2104K10AC");
            add("M2011K2C");
            add("XT2201-2");
            add("23049RAD8C");
            add("M2012K10C");
            add("22041211AC");
            add("Mi 10 Pro");
            add("M2012K11C");
            add("M2102K1AC");
            add("2304FPN6DC");
            add("M2007J1SC");
            add("XT2175-2");
            add("LIO-AL00");
            add("23127PN0CC");
            add("SM-N975U1");
            add("Pixel 7 Pro");
            add("XT2153-1");
            add("21091116C");
            add("ALT-L29");
            add("2210132C");
            add("M2102K1C");
            add("SM-N950N");
            add("22011211C");
            add("Pixel 6 Pro");
            add("2106118C");
            add("22127RK46C");
            add("SM-S908E");
            add("22041216C");
            add("LIO-AN00m");
            add("Pixel 6");
            add("XQ-DQ72");
            add("Pixel 7");
            add("EDI-AL10");
            add("M2007J17C");
            add("2201122C");
            add("XQ-BC72");
            add("RVL-AL09");
            add("2206122SC");
            add("XT2241-1");
            add("Redmi Note 8 Pro");
            add("2203121C");
            add("M2007J22C");
            add("XT2301-5");
            add("MI 9");
            add("ASUS_I005DA");
            add("22021211RC");
            add("XT2243-2");
            add("Redmi K30 Pro");
        }
    };

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            TLog.loge("TBDeviceUtils", "isEasyGoSupported=false context=null");
            return false;
        }
        if (h == -1) {
            if (i(context)) {
                h = 0;
            } else {
                h = 1;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("isEasyGoSupported=");
        sb.append(h == 0);
        TLog.loge("TBDeviceUtils", sb.toString());
        return h == 0;
    }

    private static boolean i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a382c15c", new Object[]{context})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 19) {
            return false;
        }
        return d(context) || f() || d();
    }

    public static boolean a(Activity activity) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68a25be", new Object[]{activity})).booleanValue();
        }
        if (activity == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 24 && activity.isInMultiWindowMode()) {
            TLog.loge("TBDeviceUtils", "isInMultiWindowMode=true  activity=" + activity);
            return true;
        }
        if (!("huawei".equals(Build.MANUFACTURER.toLowerCase()) ? j(activity) : false) && !i(activity)) {
            z = false;
        }
        TLog.loge("TBDeviceUtils", "isInMultiWindowMode=" + z + " activity=" + activity + com.taobao.tao.flexbox.layoutmanager.player.videodecide.c.ARRAY_KEY_CONFIGURATION + activity.getResources().getConfiguration());
        return z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean b(Activity activity) {
        char c2;
        boolean c3;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fdb367f", new Object[]{activity})).booleanValue();
        }
        if (activity == null) {
            return false;
        }
        String lowerCase = Build.MANUFACTURER.toLowerCase();
        switch (lowerCase.hashCode()) {
            case -1206476313:
                if (lowerCase.equals("huawei")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1106355917:
                if (lowerCase.equals("lenovo")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -759499589:
                if (lowerCase.equals("xiaomi")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 3418016:
                if (lowerCase.equals("oppo")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 3620012:
                if (lowerCase.equals("vivo")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 99462250:
                if (lowerCase.equals("honor")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 108389869:
                if (lowerCase.equals(REDMI_MANUFACTURE_LOWER_CASE)) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 1864941562:
                if (lowerCase.equals("samsung")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                c3 = c(activity);
                break;
            case 1:
                c3 = d(activity);
                break;
            case 2:
                c3 = f(activity);
                break;
            case 3:
                c3 = e(activity);
                break;
            case 4:
            case 5:
                c3 = g(activity);
                break;
            case 6:
                c3 = k(activity);
                break;
            case 7:
                c3 = l(activity);
                break;
            default:
                c3 = false;
                break;
        }
        TLog.loge("TBDeviceUtils", "manufacture: isInMagicWindowMode=" + c3 + " configuration=" + activity.getResources().getConfiguration());
        if (!c3 && !h(activity)) {
            z = false;
        }
        TLog.loge("TBDeviceUtils", "isActivityEmbedded=" + z + " activity=" + activity);
        return z;
    }

    public static boolean a(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("510fd48c", new Object[]{configuration})).booleanValue();
        }
        String configuration2 = configuration.toString();
        return configuration2.contains("hwMultiwindow-magic") || configuration2.contains("hw-magic-windows");
    }

    private static boolean c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("792c4740", new Object[]{activity})).booleanValue();
        }
        return a(activity.getResources().getConfiguration()) || a(activity.getApplication().getResources().getConfiguration());
    }

    private static boolean d(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b27d5801", new Object[]{activity})).booleanValue() : activity.getResources().getConfiguration().toString().contains("magic-windows");
    }

    private static boolean e(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ebce68c2", new Object[]{activity})).booleanValue() : activity.getResources().getConfiguration().toString().contains("oplus-magic-windows");
    }

    private static boolean f(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("251f7983", new Object[]{activity})).booleanValue() : activity.getResources().getConfiguration().toString().contains("multi-landscape");
    }

    private static boolean g(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5e708a44", new Object[]{activity})).booleanValue() : activity.getResources().getConfiguration().toString().contains("miui-magic-windows");
    }

    private static boolean k(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("43b4cd48", new Object[]{activity})).booleanValue() : activity.getResources().getConfiguration().toString().contains("zui-magic-windows");
    }

    private static boolean l(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d05de09", new Object[]{activity})).booleanValue();
        }
        try {
            String configuration = activity.getResources().getConfiguration().toString();
            int indexOf = configuration.indexOf("mBounds=Rect(");
            String substring = configuration.substring(indexOf + 13, configuration.indexOf(riy.BRACKET_END_STR, indexOf));
            int indexOf2 = configuration.indexOf("mMaxBounds=Rect(");
            String substring2 = configuration.substring(indexOf2 + 16, configuration.indexOf(riy.BRACKET_END_STR, indexOf2));
            boolean z = !StringUtils.isEmpty(configuration) && configuration.contains("mWindowingMode=freeform");
            TLog.loge("TBDeviceUtils", "bound=" + substring + " max=" + substring2 + " freeformMode=" + z);
            if (!z && !StringUtils.isEmpty(substring2)) {
                if (!StringUtils.equals(substring2, substring)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            TLog.loge("TBDeviceUtils", "isSamsungEasyGoOpen: ", e2);
            return false;
        }
    }

    private static boolean h(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97c19b05", new Object[]{activity})).booleanValue();
        }
        gvn a2 = gvo.a();
        return a2 != null && a2.a(activity);
    }

    private static boolean j(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a63bc87", new Object[]{activity})).booleanValue();
        }
        String configuration = activity.getResources().getConfiguration().toString();
        return configuration.contains("mWindowingMode=hwMultiwindow-primary") || configuration.contains("mWindowingMode=hwMultiwindow-freeform");
    }

    private static boolean i(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d112abc6", new Object[]{activity})).booleanValue();
        }
        String configuration = activity.getResources().getConfiguration().toString();
        return configuration.contains("mWindowingMode=multi-window") || configuration.contains("mWindowingMode=freeform");
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        if (g == -1) {
            if (c(context)) {
                g = 0;
            } else {
                g = 1;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("isTablet=");
        sb.append(g == 0);
        TLog.loge("TBDeviceUtils", sb.toString());
        return g == 0;
    }

    private static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue();
        }
        if (i.contains(Build.MODEL)) {
            TLog.loge("TBDeviceUtils", "isTabletInternal: PHONE_DEVICES, local result = false");
            return false;
        } else if (a.a().a(context).contains(Build.MODEL)) {
            TLog.loge("TBDeviceUtils", "isTabletInternal: FoldDeviceList, orange result = false");
            return false;
        } else if (a.a().b(context).contains(Build.MODEL)) {
            TLog.loge("TBDeviceUtils", "isTabletInternal: TabletDeviceList, orange result = true");
            return true;
        } else if (a.a().c(context).contains(Build.MODEL)) {
            TLog.loge("TBDeviceUtils", "isTabletInternal: FlipDeviceList, orange result = false");
            return false;
        } else if (!a.a().d(context).contains(Build.MODEL)) {
            return a.a().g(context) ? (r(context) || b() || j(context)) && !d(context) : (r(context) || b()) && !d(context);
        } else {
            TLog.loge("TBDeviceUtils", "isTabletInternal: PhoneDeviceList, orange result = false");
            return false;
        }
    }

    public static boolean r(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a994c9f3", new Object[]{context})).booleanValue();
        }
        String lowerCase = Build.MANUFACTURER.toLowerCase();
        char c2 = 65535;
        int hashCode = lowerCase.hashCode();
        if (hashCode != -1206476313) {
            if (hashCode != 3418016) {
                if (hashCode == 3620012 && lowerCase.equals("vivo")) {
                    c2 = 1;
                }
            } else if (lowerCase.equals("oppo")) {
                c2 = 2;
            }
        } else if (lowerCase.equals("huawei")) {
            c2 = 0;
        }
        if (c2 == 0) {
            z = f();
        } else if (c2 == 1) {
            z = d();
        } else if (c2 == 2) {
            z = a();
        }
        TLog.loge("TBDeviceUtils", "isTabletByExt: manufacture result = " + z);
        return z;
    }

    public static boolean b() {
        String str;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str = (String) cls.getMethod("get", String.class).invoke(cls, "ro.build.characteristics");
            TLog.loge("TBDeviceUtils", "isTabletBySystemProperties: " + str);
        } catch (Exception e2) {
            TLog.loge("TBDeviceUtils", "isTabletBySystemProperties: ", e2);
        }
        if (str == null || !str.equalsIgnoreCase("tablet")) {
            if (str != null && str.contains(",")) {
                return Arrays.asList(str.split(",")).contains("tablet");
            }
            return false;
        }
        return true;
    }

    public static boolean j(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a42f6cfb", new Object[]{context})).booleanValue();
        }
        int i2 = context.getResources().getConfiguration().screenLayout & 15;
        if (i2 >= 3) {
            z = true;
        }
        if (z) {
            TLog.loge("TBDeviceUtils", "isTabletByLayout: tablet, screenLayout=" + i2);
        }
        return z;
    }

    private static boolean f() {
        if (!"huawei".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        try {
            Class<?> cls = Class.forName("com.huawei.android.os.SystemPropertiesEx");
            return "tablet".equals(cls.getMethod("get", String.class, String.class).invoke(cls.newInstance(), "ro.build.characteristics", ""));
        } catch (Throwable th) {
            TLog.loge("TBDeviceUtils", "isHvPad: with exception ", th);
            return false;
        }
    }

    private static boolean d() {
        if (!"vivo".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        try {
            Class<?> cls = Class.forName("android.util.FtDeviceInfo");
            return "tablet".equals(cls.getMethod("getDeviceType", new Class[0]).invoke(cls, new Object[0]));
        } catch (Exception e2) {
            TLog.loge("TBDeviceUtils", "isVivoTablet: ", e2);
            return false;
        }
    }

    private static boolean a() {
        try {
            Class<?> cls = Class.forName("com.oplus.content.OplusFeatureConfigManager");
            Object invoke = cls.getDeclaredMethod("hasFeature", String.class).invoke(cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), "oplus.hardware.type.tablet");
            if (!(invoke instanceof Boolean)) {
                return false;
            }
            return ((Boolean) invoke).booleanValue();
        } catch (ClassNotFoundException e2) {
            TLog.loge("TBDeviceUtils", "isOPPOTablet: ", e2);
            return false;
        } catch (IllegalAccessException e3) {
            TLog.loge("TBDeviceUtils", "isOPPOTablet: ", e3);
            return false;
        } catch (NoSuchMethodException e4) {
            TLog.loge("TBDeviceUtils", "isOPPOTablet: ", e4);
            return false;
        } catch (InvocationTargetException e5) {
            TLog.loge("TBDeviceUtils", "isOPPOTablet: ", e5);
            return false;
        }
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0236741", new Object[]{context})).booleanValue();
        }
        if (f == -1) {
            if (context == null) {
                return false;
            }
            if (k(context)) {
                f = 0;
            } else {
                f = 1;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("isFoldDevice=");
        sb.append(f == 0);
        TLog.loge("TBDeviceUtils", sb.toString());
        return f == 0;
    }

    private static boolean k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4dc189a", new Object[]{context})).booleanValue();
        }
        if (e()) {
            TLog.loge("TBDeviceUtils", "isFoldDeviceInternal: isFoldEnableByDeviceModel, local result = true");
            return true;
        } else if (i.contains(Build.MODEL)) {
            TLog.loge("TBDeviceUtils", "isFoldDeviceInternal: PHONE_DEVICES, local result = false");
            return false;
        } else if (a.a().a(context).contains(Build.MODEL)) {
            TLog.loge("TBDeviceUtils", "isFoldDeviceInternal: FoldDeviceList, orange result = true");
            return true;
        } else if (a.a().b(context).contains(Build.MODEL)) {
            TLog.loge("TBDeviceUtils", "isFoldDeviceInternal: TabletDeviceList, orange result = false");
            return false;
        } else if (a.a().c(context).contains(Build.MODEL)) {
            TLog.loge("TBDeviceUtils", "isFoldDeviceInternal: FlipDeviceList, orange result = false");
            return false;
        } else if (!a.a().d(context).contains(Build.MODEL)) {
            return l(context) && !m(context);
        } else {
            TLog.loge("TBDeviceUtils", "isFoldDeviceInternal: FlipDeviceList, orange result = false");
            return false;
        }
    }

    private static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue();
        }
        if ("Xiaomi".equalsIgnoreCase(Build.MANUFACTURER) && c.contains(Build.DEVICE) && d.contains(Build.MODEL)) {
            TLog.loge("TBDeviceUtils", "is XIAOMI Fold Device");
            return true;
        } else if ("samsung".equalsIgnoreCase(Build.BRAND) && b.contains(Build.MODEL)) {
            TLog.loge("TBDeviceUtils", "is SAMSUNG Fold Device");
            return true;
        } else if (!"HUAWEI".equalsIgnoreCase(Build.BRAND) || !f9114a.contains(Build.DEVICE)) {
            return false;
        } else {
            TLog.loge("TBDeviceUtils", "is HUAWEI Fold Device");
            return true;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
        if (r1.equals("honor") != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean l(android.content.Context r6) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.autosize.l.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L19
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r6
            java.lang.String r6 = "a588c439"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L19:
            java.lang.String r0 = "TBDeviceUtils"
            if (r6 != 0) goto L24
            java.lang.String r6 = "isFolderEnableByExt: input context is empty, exit!"
            com.taobao.tao.log.TLog.loge(r0, r6)
            return r3
        L24:
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r1 = r1.toLowerCase()
            r4 = -1
            int r5 = r1.hashCode()
            switch(r5) {
                case -1206476313: goto L74;
                case -759499589: goto L69;
                case 3418016: goto L5e;
                case 3620012: goto L53;
                case 99462250: goto L49;
                case 108389869: goto L3e;
                case 1864941562: goto L33;
                default: goto L32;
            }
        L32:
            goto L7f
        L33:
            java.lang.String r2 = "samsung"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L7f
            r2 = 6
            goto L80
        L3e:
            java.lang.String r2 = "redmi"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L7f
            r2 = 5
            goto L80
        L49:
            java.lang.String r5 = "honor"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L7f
            goto L80
        L53:
            java.lang.String r2 = "vivo"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L7f
            r2 = 2
            goto L80
        L5e:
            java.lang.String r2 = "oppo"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L7f
            r2 = 3
            goto L80
        L69:
            java.lang.String r2 = "xiaomi"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L7f
            r2 = 4
            goto L80
        L74:
            java.lang.String r2 = "huawei"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L7f
            r2 = 0
            goto L80
        L7f:
            r2 = -1
        L80:
            switch(r2) {
                case 0: goto L9d;
                case 1: goto L98;
                case 2: goto L93;
                case 3: goto L8e;
                case 4: goto L89;
                case 5: goto L89;
                case 6: goto L84;
                default: goto L83;
            }
        L83:
            goto La1
        L84:
            boolean r3 = p(r6)
            goto La1
        L89:
            boolean r3 = o(r6)
            goto La1
        L8e:
            boolean r3 = c()
            goto La1
        L93:
            boolean r3 = n(r6)
            goto La1
        L98:
            boolean r3 = h(r6)
            goto La1
        L9d:
            boolean r3 = s(r6)
        La1:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "isFolderEnableByExt: manufacture result = "
            r6.append(r1)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            com.taobao.tao.log.TLog.loge(r0, r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.autosize.l.l(android.content.Context):boolean");
    }

    private static boolean g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2296a1e", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if ("HUAWEI".equalsIgnoreCase(Build.MANUFACTURER) && packageManager != null && packageManager.hasSystemFeature("com.huawei.hardware.sensor.posture")) {
            TLog.loge("TBDeviceUtils", "isHwFoldableDevice: true");
            return true;
        }
        TLog.loge("TBDeviceUtils", "isHwFoldableDevice: false");
        return false;
    }

    private static boolean s(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa417592", new Object[]{context})).booleanValue() : "foldPhone".equals(t(context));
    }

    private static String t(Context context) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, "hw_sc.build.os.phonetype", "not getProp by key");
        } catch (Exception e2) {
            String message = e2.getMessage();
            TLog.loge("TBDeviceUtils", "getHwDeviceType: ", e2);
            return message;
        }
    }

    private static boolean h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2d615bd", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if ("HONOR".equalsIgnoreCase(Build.MANUFACTURER) && packageManager != null && packageManager.hasSystemFeature("com.hihonor.hardware.sensor.posture")) {
            TLog.loge("TBDeviceUtils", "isHonorFoldableDevice: true");
            return true;
        }
        TLog.loge("TBDeviceUtils", "isHonorFoldableDevice: false");
        return false;
    }

    private static boolean c() {
        try {
            Class<?> cls = Class.forName("com.oplus.content.OplusFeatureConfigManager");
            Object invoke = cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            Method declaredMethod = cls.getDeclaredMethod("hasFeature", String.class);
            Object invoke2 = declaredMethod.invoke(invoke, "oplus.hardware.type.fold");
            Object invoke3 = declaredMethod.invoke(invoke, "oplus.software.fold_remap_display_disabled");
            if (!(invoke2 instanceof Boolean) || !(invoke3 instanceof Boolean) || !((Boolean) invoke2).booleanValue()) {
                return false;
            }
            return !((Boolean) invoke3).booleanValue();
        } catch (ClassNotFoundException e2) {
            TLog.loge("TBDeviceUtils", "isOPPOFoldableDeviceV2: ", e2);
            return false;
        } catch (IllegalAccessException e3) {
            TLog.loge("TBDeviceUtils", "isOPPOFoldableDeviceV2: ", e3);
            return false;
        } catch (NoSuchMethodException e4) {
            TLog.loge("TBDeviceUtils", "isOPPOFoldableDeviceV2: ", e4);
            return false;
        } catch (InvocationTargetException e5) {
            TLog.loge("TBDeviceUtils", "isOPPOFoldableDeviceV2: ", e5);
            return false;
        }
    }

    private static boolean n(Context context) {
        if (Build.VERSION.SDK_INT < 19) {
            return false;
        }
        try {
            return "foldable".equals((String) Class.forName("android.util.FtDeviceInfo").getMethod("getDeviceType", new Class[0]).invoke(null, new Object[0]));
        } catch (Throwable th) {
            TLog.loge("TBDeviceUtils", "is not vivo fold device", th);
            return false;
        }
    }

    private static boolean o(Context context) {
        try {
            return ((Integer) Class.forName("android.os.SystemProperties").getMethod("getInt", String.class, Integer.TYPE).invoke(null, "persist.sys.muiltdisplay_type", 0)).intValue() == 2;
        } catch (ClassNotFoundException e2) {
            TLog.loge("TBDeviceUtils", "isXiaomiFoldableDevice: ", e2);
            return false;
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
            TLog.loge("TBDeviceUtils", "isXiaomiFoldableDevice: ", e3);
            return false;
        } catch (NoSuchMethodException e4) {
            TLog.loge("TBDeviceUtils", "isXiaomiFoldableDevice: ", e4);
            return false;
        } catch (InvocationTargetException e5) {
            TLog.loge("TBDeviceUtils", "isXiaomiFoldableDevice: ", e5);
            return false;
        }
    }

    private static boolean p(Context context) {
        String str;
        try {
            Class<?> cls = Class.forName("com.samsung.android.feature.SemFloatingFeature");
            str = (String) cls.getDeclaredMethod("getString", String.class).invoke(cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), "SEC_FLOATING_FEATURE_FRAMEWORK_SUPPORT_FOLDABLE_TYPE_FOLD");
        } catch (Throwable th) {
            TLog.loge("TBDeviceUtils", "isSamsungFoldableDevice: ", th);
            str = "";
        }
        return StringUtils.equals(str, "TRUE");
    }

    public static boolean e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0d012e0", new Object[]{context})).booleanValue();
        }
        if ("HUAWEI".equalsIgnoreCase(Build.BRAND) && f9114a.contains(Build.DEVICE)) {
            TLog.loge("TBDeviceUtils", "is HUAWEI Fold Device");
            return true;
        }
        return g(context);
    }

    public static boolean f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a17cbe7f", new Object[]{context})).booleanValue();
        }
        if ("samsung".equalsIgnoreCase(Build.BRAND) && b.contains(Build.MODEL)) {
            TLog.loge("TBDeviceUtils", "is isGalaxyFold");
            return true;
        }
        TLog.loge("TBDeviceUtils", "is not isGalaxyFold");
        return false;
    }

    public static boolean m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6356fd8", new Object[]{context})).booleanValue();
        }
        if (k == -1) {
            if (context == null) {
                TLog.loge("TBDeviceUtils", "isFlipDevice=false context=null");
                return false;
            } else if (v(context)) {
                k = 0;
            } else {
                k = 1;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("isFlipDevice=");
        sb.append(k == 0);
        TLog.loge("TBDeviceUtils", sb.toString());
        return k == 0;
    }

    private static boolean v(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac47786f", new Object[]{context})).booleanValue();
        }
        if (e.contains(Build.MODEL)) {
            return true;
        }
        if (i.contains(Build.MODEL) || a.a().a(context).contains(Build.MODEL) || a.a().b(context).contains(Build.MODEL)) {
            return false;
        }
        if (a.a().c(context).contains(Build.MODEL)) {
            return true;
        }
        if (!a.a().d(context).contains(Build.MODEL)) {
            return w(context);
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (r0.equals("honor") != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean w(android.content.Context r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.autosize.l.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L19
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r5
            java.lang.String r5 = "acf4240e"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L19:
            if (r5 != 0) goto L24
            java.lang.String r5 = "TBDeviceUtils"
            java.lang.String r0 = "isFlipDeviceInternal: input context is empty, exit!"
            com.taobao.tao.log.TLog.loge(r5, r0)
            return r3
        L24:
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r0 = r0.toLowerCase()
            r1 = -1
            int r4 = r0.hashCode()
            switch(r4) {
                case -1206476313: goto L74;
                case -759499589: goto L69;
                case 3418016: goto L5e;
                case 3620012: goto L53;
                case 99462250: goto L49;
                case 108389869: goto L3e;
                case 1864941562: goto L33;
                default: goto L32;
            }
        L32:
            goto L7f
        L33:
            java.lang.String r2 = "samsung"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L7f
            r2 = 6
            goto L80
        L3e:
            java.lang.String r2 = "redmi"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L7f
            r2 = 5
            goto L80
        L49:
            java.lang.String r4 = "honor"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L7f
            goto L80
        L53:
            java.lang.String r2 = "vivo"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L7f
            r2 = 2
            goto L80
        L5e:
            java.lang.String r2 = "oppo"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L7f
            r2 = 3
            goto L80
        L69:
            java.lang.String r2 = "xiaomi"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L7f
            r2 = 4
            goto L80
        L74:
            java.lang.String r2 = "huawei"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L7f
            r2 = 0
            goto L80
        L7f:
            r2 = -1
        L80:
            switch(r2) {
                case 0: goto L93;
                case 1: goto L97;
                case 2: goto L8e;
                case 3: goto L89;
                case 4: goto L97;
                case 5: goto L97;
                case 6: goto L84;
                default: goto L83;
            }
        L83:
            goto L97
        L84:
            boolean r3 = h()
            goto L97
        L89:
            boolean r3 = i()
            goto L97
        L8e:
            boolean r3 = g()
            goto L97
        L93:
            boolean r3 = x(r5)
        L97:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.autosize.l.w(android.content.Context):boolean");
    }

    private static boolean x(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ada0cfad", new Object[]{context})).booleanValue() : "flipPhone".equals(t(context));
    }

    private static boolean g() {
        try {
            Class<?> cls = Class.forName("android.util.FtDeviceInfo");
            return "filp".equals((String) cls.getMethod("getDeviceType", new Class[0]).invoke(cls, new Object[0]));
        } catch (Exception e2) {
            TLog.loge("TBDeviceUtils", "isVivoFlipDevice: ", e2);
            return false;
        }
    }

    private static boolean i() {
        try {
            Class<?> cls = Class.forName("com.oplus.content.OplusFeatureConfigManager");
            Object invoke = cls.getDeclaredMethod("hasFeature", String.class).invoke(cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), "oplus.software.fold_remap_display_disabled");
            if (!(invoke instanceof Boolean)) {
                return false;
            }
            return ((Boolean) invoke).booleanValue();
        } catch (ClassNotFoundException e2) {
            TLog.loge("TBDeviceUtils", "isOppoFlipDevice: ", e2);
            return false;
        } catch (IllegalAccessException e3) {
            TLog.loge("TBDeviceUtils", "isOppoFlipDevice: ", e3);
            return false;
        } catch (NoSuchMethodException e4) {
            TLog.loge("TBDeviceUtils", "isOppoFlipDevice: ", e4);
            return false;
        } catch (InvocationTargetException e5) {
            TLog.loge("TBDeviceUtils", "isOppoFlipDevice: ", e5);
            return false;
        }
    }

    private static boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue() : a("SEC_FLOATING_FEATURE_FRAMEWORK_SUPPORT_FOLDABLE_TYPE_FLIP").equals("TRUE");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
        if (r1.equals("huawei") != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int q(android.content.Context r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.autosize.l.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L19
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r5
            java.lang.String r5 = "a8e81e43"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            return r5
        L19:
            r0 = -1
            if (r5 != 0) goto L1d
            return r0
        L1d:
            boolean r1 = d(r5)
            if (r1 != 0) goto L24
            return r0
        L24:
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r1 = r1.toLowerCase()
            int r4 = r1.hashCode()
            switch(r4) {
                case -1206476313: goto L74;
                case -759499589: goto L69;
                case 3418016: goto L5e;
                case 3620012: goto L53;
                case 99462250: goto L48;
                case 108389869: goto L3d;
                case 1864941562: goto L32;
                default: goto L31;
            }
        L31:
            goto L7e
        L32:
            java.lang.String r2 = "samsung"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L7e
            r2 = 6
            goto L7f
        L3d:
            java.lang.String r2 = "redmi"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L7e
            r2 = 5
            goto L7f
        L48:
            java.lang.String r2 = "honor"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L7e
            r2 = 1
            goto L7f
        L53:
            java.lang.String r2 = "vivo"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L7e
            r2 = 2
            goto L7f
        L5e:
            java.lang.String r2 = "oppo"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L7e
            r2 = 3
            goto L7f
        L69:
            java.lang.String r2 = "xiaomi"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L7e
            r2 = 4
            goto L7f
        L74:
            java.lang.String r3 = "huawei"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L7e
            goto L7f
        L7e:
            r2 = -1
        L7f:
            switch(r2) {
                case 0: goto La2;
                case 1: goto L9d;
                case 2: goto L98;
                case 3: goto L93;
                case 4: goto L8e;
                case 5: goto L8e;
                case 6: goto L89;
                default: goto L82;
            }
        L82:
            int r5 = y(r5)
            if (r5 == r0) goto La7
            return r5
        L89:
            int r5 = D(r5)
            return r5
        L8e:
            int r5 = C(r5)
            return r5
        L93:
            int r5 = y(r5)
            return r5
        L98:
            int r5 = B(r5)
            return r5
        L9d:
            int r5 = A(r5)
            return r5
        La2:
            int r5 = z(r5)
            return r5
        La7:
            tb.iuu r5 = tb.iuu.a()
            int r5 = r5.b()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.autosize.l.q(android.content.Context):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0086 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e4 A[Catch: Exception -> 0x0134, TryCatch #0 {Exception -> 0x0134, blocks: (B:16:0x0055, B:20:0x005e, B:34:0x0088, B:36:0x009d, B:38:0x00e4, B:40:0x00ea, B:42:0x00ff, B:45:0x0107, B:50:0x0116, B:53:0x0121, B:25:0x006d, B:28:0x0078), top: B:65:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0121 A[Catch: Exception -> 0x0134, TRY_LEAVE, TryCatch #0 {Exception -> 0x0134, blocks: (B:16:0x0055, B:20:0x005e, B:34:0x0088, B:36:0x009d, B:38:0x00e4, B:40:0x00ea, B:42:0x00ff, B:45:0x0107, B:50:0x0116, B:53:0x0121, B:25:0x006d, B:28:0x0078), top: B:65:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0133 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int y(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.autosize.l.y(android.content.Context):int");
    }

    private static int z(Context context) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aefa26da", new Object[]{context})).intValue();
        }
        if (Build.VERSION.SDK_INT < 17) {
            return -1;
        }
        try {
            i2 = Settings.Global.getInt(context.getContentResolver(), "hw_fold_display_mode_prepare");
        } catch (Settings.SettingNotFoundException e2) {
            TLog.loge("TBDeviceUtils", "getHwFoldStatus: ", e2);
        }
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 2;
        }
        return i2 != 3 ? -1 : 1;
    }

    private static int A(Context context) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8887f073", new Object[]{context})).intValue();
        }
        if (Build.VERSION.SDK_INT < 17) {
            return -1;
        }
        try {
            i2 = Settings.Global.getInt(context.getContentResolver(), "hn_fold_screen_state", 0);
        } catch (Exception e2) {
            TLog.loge("TBDeviceUtils", "getHonorFoldStatus: ", e2);
        }
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 2;
        }
        return i2 != 3 ? -1 : 1;
    }

    private static int B(Context context) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89349c12", new Object[]{context})).intValue();
        }
        if (Build.VERSION.SDK_INT < 17) {
            return -1;
        }
        try {
            i2 = Settings.Global.getInt(context.getContentResolver(), "device_posture", 0);
        } catch (Exception e2) {
            TLog.loge("TBDeviceUtils", "getVivoFoldStatus: ", e2);
        }
        if (i2 == -1) {
            return 2;
        }
        if (i2 == 2) {
            return 1;
        }
        return i2 != 3 ? -1 : 0;
    }

    private static int C(Context context) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89e147b1", new Object[]{context})).intValue();
        }
        if (Build.VERSION.SDK_INT < 17) {
            return -1;
        }
        try {
            i2 = Settings.Global.getInt(context.getContentResolver(), "device_posture", 0);
        } catch (Exception e2) {
            TLog.loge("TBDeviceUtils", "getXiaomiFoldStatus: ", e2);
        }
        if (i2 == 1) {
            return 2;
        }
        if (i2 == 2) {
            return 1;
        }
        return i2 != 3 ? -1 : 0;
    }

    private static int D(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        try {
            Field declaredField = configuration.getClass().getDeclaredField("semDisplayDeviceType");
            declaredField.setAccessible(true);
            int intValue = ((Integer) declaredField.get(configuration)).intValue();
            if (intValue == 0) {
                return 0;
            }
            return intValue != 5 ? -1 : 2;
        } catch (IllegalAccessException e2) {
            TLog.loge("TBDeviceUtils", "getSamsungFoldDisplayType: ", e2);
            return -1;
        } catch (NoSuchFieldException e3) {
            TLog.loge("TBDeviceUtils", "getSamsungFoldDisplayType: ", e3);
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0090 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String a(java.lang.String r9) {
        /*
            java.lang.String r0 = "getSamsungFeature: featureTagName="
            java.lang.String r1 = "TBDeviceUtils"
            java.lang.String r2 = "com.samsung.android.feature.SemFloatingFeature"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.IllegalAccessException -> L35 java.lang.reflect.InvocationTargetException -> L49 java.lang.NoSuchMethodException -> L5d java.lang.ClassNotFoundException -> L71
            java.lang.String r3 = "getInstance"
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.IllegalAccessException -> L35 java.lang.reflect.InvocationTargetException -> L49 java.lang.NoSuchMethodException -> L5d java.lang.ClassNotFoundException -> L71
            java.lang.reflect.Method r3 = r2.getMethod(r3, r5)     // Catch: java.lang.IllegalAccessException -> L35 java.lang.reflect.InvocationTargetException -> L49 java.lang.NoSuchMethodException -> L5d java.lang.ClassNotFoundException -> L71
            r5 = 0
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch: java.lang.IllegalAccessException -> L35 java.lang.reflect.InvocationTargetException -> L49 java.lang.NoSuchMethodException -> L5d java.lang.ClassNotFoundException -> L71
            java.lang.Object r3 = r3.invoke(r5, r6)     // Catch: java.lang.IllegalAccessException -> L35 java.lang.reflect.InvocationTargetException -> L49 java.lang.NoSuchMethodException -> L5d java.lang.ClassNotFoundException -> L71
            java.lang.String r5 = "getString"
            r6 = 1
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.IllegalAccessException -> L35 java.lang.reflect.InvocationTargetException -> L49 java.lang.NoSuchMethodException -> L5d java.lang.ClassNotFoundException -> L71
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r4] = r8     // Catch: java.lang.IllegalAccessException -> L35 java.lang.reflect.InvocationTargetException -> L49 java.lang.NoSuchMethodException -> L5d java.lang.ClassNotFoundException -> L71
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r5, r7)     // Catch: java.lang.IllegalAccessException -> L35 java.lang.reflect.InvocationTargetException -> L49 java.lang.NoSuchMethodException -> L5d java.lang.ClassNotFoundException -> L71
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.IllegalAccessException -> L35 java.lang.reflect.InvocationTargetException -> L49 java.lang.NoSuchMethodException -> L5d java.lang.ClassNotFoundException -> L71
            r5[r4] = r9     // Catch: java.lang.IllegalAccessException -> L35 java.lang.reflect.InvocationTargetException -> L49 java.lang.NoSuchMethodException -> L5d java.lang.ClassNotFoundException -> L71
            java.lang.Object r2 = r2.invoke(r3, r5)     // Catch: java.lang.IllegalAccessException -> L35 java.lang.reflect.InvocationTargetException -> L49 java.lang.NoSuchMethodException -> L5d java.lang.ClassNotFoundException -> L71
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.IllegalAccessException -> L35 java.lang.reflect.InvocationTargetException -> L49 java.lang.NoSuchMethodException -> L5d java.lang.ClassNotFoundException -> L71
            goto L86
        L35:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            com.taobao.tao.log.TLog.loge(r1, r9, r2)
            goto L84
        L49:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            com.taobao.tao.log.TLog.loge(r1, r9, r2)
            goto L84
        L5d:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            com.taobao.tao.log.TLog.loge(r1, r9, r2)
            goto L84
        L71:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            com.taobao.tao.log.TLog.loge(r1, r9, r2)
        L84:
            java.lang.String r2 = ""
        L86:
            if (r2 == 0) goto L90
            boolean r9 = r2.isEmpty()
            if (r9 == 0) goto L8f
            goto L90
        L8f:
            return r2
        L90:
            java.lang.String r9 = "unknown"
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.autosize.l.a(java.lang.String):java.lang.String");
    }
}
