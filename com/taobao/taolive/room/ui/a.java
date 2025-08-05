package com.taobao.taolive.room.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.utils.b;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.kge;
import tb.pmd;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f21689a;
    private static boolean b;
    private static int c;
    private static int d;
    private static Region e;
    private static int f;

    static {
        kge.a(346428602);
        f21689a = "";
        b = false;
        c = 0;
        d = 0;
        e = null;
        f = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
        if (b() != false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(android.content.Context r4, android.view.WindowInsets r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.taolive.room.ui.a.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1c
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r4
            r1[r3] = r5
            java.lang.String r4 = "f1725575"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L1c:
            boolean r0 = com.taobao.taolive.room.ui.a.b
            if (r0 == 0) goto L21
            return r3
        L21:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L6b
            r1 = 27
            if (r0 < r1) goto L2f
            java.lang.Object r5 = a(r5)     // Catch: java.lang.Exception -> L6b
            if (r5 == 0) goto L2f
            r5 = 1
            goto L30
        L2f:
            r5 = 0
        L30:
            if (r5 != 0) goto L75
            boolean r0 = b(r4)     // Catch: java.lang.Exception -> L69
            if (r0 != 0) goto L4a
            boolean r4 = c(r4)     // Catch: java.lang.Exception -> L69
            if (r4 != 0) goto L4a
            boolean r4 = c()     // Catch: java.lang.Exception -> L69
            if (r4 != 0) goto L4a
            boolean r4 = b()     // Catch: java.lang.Exception -> L69
            if (r4 == 0) goto L4b
        L4a:
            r2 = 1
        L4b:
            if (r2 != 0) goto L67
            tb.pmd r4 = tb.pmd.a()     // Catch: java.lang.Exception -> L64
            tb.pmi r4 = r4.d()     // Catch: java.lang.Exception -> L64
            java.lang.String r5 = "displaycutoutsupport"
            java.lang.String r0 = "cutoutphonelist"
            java.lang.String r1 = ""
            java.lang.String r4 = r4.a(r5, r0, r1)     // Catch: java.lang.Exception -> L64
            boolean r5 = a(r4)     // Catch: java.lang.Exception -> L64
            goto L75
        L64:
            r4 = move-exception
            r5 = r2
            goto L6d
        L67:
            r5 = r2
            goto L75
        L69:
            r4 = move-exception
            goto L6d
        L6b:
            r4 = move-exception
            r5 = 0
        L6d:
            java.lang.String r0 = "SupportDisplayCutout"
            java.lang.String r1 = "isCutoutScreen exception:"
            android.util.Log.e(r0, r1, r4)
        L75:
            com.taobao.taolive.room.ui.a.b = r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.room.ui.a.a(android.content.Context, android.view.WindowInsets):boolean");
    }

    public static Region b(Context context, WindowInsets windowInsets) {
        Object a2;
        Region region = e;
        if (region != null) {
            return region;
        }
        Region region2 = null;
        try {
            if (Build.VERSION.SDK_INT >= 27 && (a2 = a(windowInsets)) != null) {
                try {
                    try {
                        try {
                            Object invoke = a2.getClass().getMethod("getBounds", new Class[0]).invoke(a2, new Object[0]);
                            if (invoke != null && (invoke instanceof Region)) {
                                region2 = (Region) invoke;
                            }
                        } catch (Exception e2) {
                            Log.e("SupportDisplayCutout", "getCutoutBounds exception", e2);
                        }
                    } catch (IllegalAccessException unused) {
                        Log.e("SupportDisplayCutout", "getCutoutBounds IllegalAccess");
                    }
                } catch (NoSuchMethodException unused2) {
                    Log.e("SupportDisplayCutout", "getCutoutBounds NoSuchMethod");
                }
            }
            if (region2 == null && (region2 = d(context)) == null && (region2 = e()) == null && (region2 = e(context)) == null) {
                region2 = a(context, pmd.a().d().a("displaycutoutsupport", "cutoutphonelist", ""));
            }
        } catch (Exception e3) {
            Log.e("SupportDisplayCutout", "getCutoutBounds Exception", e3);
        }
        if (region2 != null) {
            e = region2;
        }
        return region2;
    }

    public static int c(Context context, WindowInsets windowInsets) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c9a6766", new Object[]{context, windowInsets})).intValue();
        }
        int i = d;
        if (i > 0) {
            return i;
        }
        if (a()) {
            int a2 = a(context);
            d = a2;
            if (a2 > 0) {
                return d;
            }
        }
        Region b2 = b(context, windowInsets);
        if (b2 != null) {
            int i2 = b2.getBounds().bottom - b2.getBounds().top;
            d = i2;
            return i2;
        } else if (!a(context, windowInsets)) {
            return 0;
        } else {
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                d = context.getResources().getDimensionPixelSize(identifier);
            }
            Log.e("SupportDisplayCutout", "getCutoutHeight region = null getHeight by status_bar " + d);
            return d;
        }
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        if (!b()) {
            return 0;
        }
        return b.a(context, 27.0f);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : Build.BRAND.contains("vivo") || Build.BRAND.contains("bbk");
    }

    public static boolean b() {
        boolean z = false;
        try {
            Method method = Class.forName("android.util.FtFeature").getMethod("isFeatureSupport", Integer.TYPE);
            if (method != null) {
                z = ((Boolean) method.invoke(null, 32)).booleanValue();
            }
        } catch (Exception e2) {
            if (pmd.a().m() != null) {
                pmd.a().m().d("vivoHasNotch", e2);
            }
        }
        if (pmd.a().m() != null) {
            pmd.a().m().c("vivoHasNotch height = ", String.valueOf(z));
        }
        return z;
    }

    private static boolean a(Context context, Window window) {
        Field field;
        if (context == null || window == null) {
            return false;
        }
        try {
            if (Build.VERSION.SDK_INT >= 27) {
                try {
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    Class<?> cls = attributes.getClass();
                    Field field2 = cls.getField("layoutInDisplayCutoutMode");
                    try {
                        field = cls.getField("LAYOUT_IN_DISPLAY_CUTOUT_MODE_ALWAYS");
                    } catch (NoSuchFieldException unused) {
                        field = cls.getField("LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES");
                    }
                    field2.setInt(attributes, field.getInt(attributes));
                    window.setAttributes(attributes);
                    return true;
                } catch (NoSuchFieldException unused2) {
                    Log.e("SupportDisplayCutout", "fullScreenDisplayInCutout NoSuchField");
                }
            }
            return a(window) || b(window) || b(context.getPackageName()) || b();
        } catch (Exception e2) {
            Log.e("SupportDisplayCutout", "fullScreenDisplayInCutout exception:", e2);
            return false;
        }
    }

    public static boolean a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68a25be", new Object[]{activity})).booleanValue();
        }
        if (activity != null) {
            return a(activity, activity.getWindow());
        }
        return false;
    }

    private static boolean a(Window window) {
        if (window != null) {
            try {
                WindowManager.LayoutParams attributes = window.getAttributes();
                Class<?> cls = Class.forName("com.huawei.android.view.LayoutParamsEx");
                cls.getMethod("addHwFlags", Integer.TYPE).invoke(cls.getConstructor(WindowManager.LayoutParams.class).newInstance(attributes), 65536);
                return true;
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                Log.e("SupportDisplayCutout", "hw notch screen flag api error");
            } catch (Exception unused2) {
                Log.e("SupportDisplayCutout", "other Exception");
            }
        }
        return false;
    }

    private static boolean b(Window window) {
        if (window == null) {
            return false;
        }
        if (f(window.getContext())) {
            try {
                Window.class.getMethod("clearExtraFlags ", Integer.TYPE).invoke(window, 1792);
                return false;
            } catch (Exception unused) {
            }
        }
        try {
            Window.class.getMethod("addExtraFlags", Integer.TYPE).invoke(window, 1792);
            return true;
        } catch (Exception unused2) {
            return false;
        }
    }

    public static int g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2296a0d", new Object[]{context})).intValue();
        }
        int i = f;
        if (i > 0) {
            return i;
        }
        if (context != null) {
            try {
                int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
                if (identifier > 0) {
                    f = context.getResources().getDimensionPixelSize(identifier);
                    String str = "getSystemStatusBarHeight:" + f;
                    return f;
                }
            } catch (Exception e2) {
                Log.e("SupportDisplayCutout", "getSystemStatusBarHeight exception:", e2);
            }
        }
        return 0;
    }

    private static Object a(WindowInsets windowInsets) {
        if (windowInsets != null) {
            try {
                return windowInsets.getClass().getMethod("getDisplayCutout", new Class[0]).invoke(windowInsets, new Object[0]);
            } catch (NoSuchMethodException unused) {
                Log.e("SupportDisplayCutout", "getDisplayCutoutByGoogle NoSuchMethod");
                return null;
            } catch (Exception e2) {
                Log.e("SupportDisplayCutout", "getDisplayCutoutByGoogle exception:", e2);
                return null;
            }
        }
        return null;
    }

    private static boolean b(Context context) {
        boolean z = false;
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            z = ((Boolean) loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0])).booleanValue();
            String str = "isCutoutScreenByHuawei:" + z;
            return z;
        } catch (ClassNotFoundException unused) {
            Log.e("SupportDisplayCutout", "isCutoutScreenByHuawei ClassNotFound");
            return z;
        } catch (Exception e2) {
            Log.e("SupportDisplayCutout", "isCutoutScreenByHuawei exception:", e2);
            return z;
        }
    }

    private static boolean c() {
        boolean z = false;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            if (((Integer) cls.getMethod("getInt", String.class, Integer.TYPE).invoke(cls, "ro.miui.notch", 0)).intValue() == 1) {
                z = true;
            }
            String str = "isCutoutScreenByXiaomi:" + z;
        } catch (ClassNotFoundException unused) {
            Log.e("SupportDisplayCutout", "isCutoutScreenByXiaomi ClassNotFound");
        } catch (Exception e2) {
            Log.e("SupportDisplayCutout", "isCutoutScreenByXiaomi exception:", e2);
        }
        return z;
    }

    private static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue();
        }
        try {
            z = context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
            String str = "isCutoutScreenByOppo:" + z;
            return z;
        } catch (Exception e2) {
            Log.e("SupportDisplayCutout", "isCutoutScreenByOppo exception:", e2);
            return z;
        }
    }

    private static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        String str2 = "isCutoutScreenByOrange, config s:" + str;
        try {
        } catch (Exception e2) {
            Log.e("SupportDisplayCutout", "isCutoutScreenByOrange exception:", e2);
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        JSONArray jSONArray = new JSONArray(str);
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null && optJSONObject.optString("model").equals(d())) {
                return true;
            }
        }
        return false;
    }

    private static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[0]);
        }
        if (TextUtils.isEmpty(f21689a)) {
            f21689a = Build.MODEL;
        }
        return f21689a;
    }

    private static Region a(Context context, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Region) ipChange.ipc$dispatch("6e504327", new Object[]{context, iArr});
        }
        if (iArr == null || iArr[0] <= 0 || iArr[1] <= 0) {
            return null;
        }
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = context.getResources().getDisplayMetrics().widthPixels / 2;
        int i4 = i / 2;
        return new Region(new Rect(i3 - i4, 0, i3 + i4, i2));
    }

    private static Region d(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            int[] iArr = (int[]) loadClass.getMethod("getNotchSize", new Class[0]).invoke(loadClass, new Object[0]);
            if (iArr.length != 2 || iArr[0] <= 0 || iArr[1] <= 0) {
                return null;
            }
            String str = "getCutoutInfoByHuawei:" + iArr[0] + "," + iArr[1];
            return a(context, iArr);
        } catch (ClassNotFoundException unused) {
            Log.e("SupportDisplayCutout", "getCutoutInfoByHuawei ClassNotFound");
            return null;
        } catch (Exception e2) {
            Log.e("SupportDisplayCutout", "getCutoutInfoByHuawei exception:", e2);
            return null;
        }
    }

    private static Region e() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getMethod("get", String.class, String.class).invoke(cls, "ro.oppo.screen.heteromorphism", "");
            String str2 = "getCutoutInfoByOppo property:" + str;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String str3 = "getCutoutInfoByOppo :" + str;
            String[] split = str.split(":");
            if (split.length != 2) {
                return null;
            }
            String[] split2 = split[0].split(",");
            String[] split3 = split[1].split(",");
            if (split2.length != 2 || split3.length != 2) {
                return null;
            }
            int intValue = Integer.valueOf(split2[0]).intValue();
            int intValue2 = Integer.valueOf(split2[1]).intValue();
            int intValue3 = Integer.valueOf(split3[0]).intValue();
            int intValue4 = Integer.valueOf(split3[1]).intValue();
            if (intValue3 - intValue <= 0 || intValue4 - intValue2 <= 0) {
                return null;
            }
            Region region = new Region(intValue, intValue2, intValue3, intValue4);
            String str4 = "getCutoutInfoByOppo region :" + region.toString();
            return region;
        } catch (Exception e2) {
            Log.e("SupportDisplayCutout", "getCutoutInfoByOppo exception:", e2);
            return null;
        }
    }

    private static Region e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Region) ipChange.ipc$dispatch("9d801095", new Object[]{context});
        }
        try {
            int identifier = context.getResources().getIdentifier("notch_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0;
            int identifier2 = context.getResources().getIdentifier("notch_width", "dimen", "android");
            int dimensionPixelSize2 = identifier2 > 0 ? context.getResources().getDimensionPixelSize(identifier2) : 0;
            String str = "getCutoutInfoByXiaoMi width:" + dimensionPixelSize2 + " height: " + dimensionPixelSize;
            if (dimensionPixelSize > 0 && dimensionPixelSize2 > 0) {
                return a(context, new int[]{dimensionPixelSize2, dimensionPixelSize});
            }
            return null;
        } catch (Exception e2) {
            Log.e("SupportDisplayCutout", "getCutoutInfoByXiaoMi exception:", e2);
            return null;
        }
    }

    private static Region a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Region) ipChange.ipc$dispatch("6da4a9e3", new Object[]{context, str});
        }
        String str2 = "getCutoutInfoByOrange, origin s:" + str;
        try {
        } catch (Exception e2) {
            Log.e("SupportDisplayCutout", "getCutoutInfoByOrange exception:", e2);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONArray jSONArray = new JSONArray(str);
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("model");
                int optInt = optJSONObject.optInt("w");
                int optInt2 = optJSONObject.optInt("h");
                if (optString.equals(d())) {
                    String str3 = "getCutoutInfoByOrange w:" + optInt + ",h:" + optInt2;
                    return a(context, new int[]{optInt, optInt2});
                }
            }
        }
        return null;
    }

    private static boolean b(String str) {
        try {
        } catch (ClassNotFoundException unused) {
            Log.e("SupportDisplayCutout", "getOppoSwitchStatus ClassNotFound");
        } catch (IllegalAccessException unused2) {
            Log.e("SupportDisplayCutout", "getOppoSwitchStatus IllegalAccess");
        } catch (NoSuchMethodException unused3) {
            Log.e("SupportDisplayCutout", "getOppoSwitchStatus NoSuchMethod");
        } catch (Exception e2) {
            Log.e("SupportDisplayCutout", "getOppoSwitchStatus exception", e2);
        }
        if (TextUtils.isEmpty(str)) {
            Log.e(RPCDataItems.SWITCH_TAG_LOG, "pkgName can't be null");
            return false;
        }
        Class<?> cls = Class.forName("com.color.util.ColorDisplayCompatUtils");
        if (cls != null) {
            Object invoke = cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            Method method = cls.getMethod("shouldNonImmersiveAdjustForPkg", String.class);
            if (method != null) {
                boolean booleanValue = ((Boolean) method.invoke(invoke, str)).booleanValue();
                StringBuilder sb = new StringBuilder();
                sb.append("switch is open :");
                sb.append(!booleanValue);
                Log.e("SupportDisplayCutout", sb.toString());
                return !booleanValue;
            }
        }
        return true;
    }

    private static boolean f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a17cbe7f", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        return Settings.Global.getInt(context.getContentResolver(), "force_black", 0) == 1;
    }
}
