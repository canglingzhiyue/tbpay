package tb;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.provider.Settings;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class gfe {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static String f28305a = "";
    private static boolean b = false;
    private static int c;
    private static int d;
    private static Region e;
    private static int f;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
        if (a() != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(android.content.Context r4, android.view.WindowInsets r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.gfe.$ipChange
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
            boolean r0 = tb.gfe.b
            if (r0 == 0) goto L21
            return r3
        L21:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L61
            r1 = 27
            if (r0 < r1) goto L2f
            java.lang.Object r5 = a(r5)     // Catch: java.lang.Exception -> L61
            if (r5 == 0) goto L2f
            r5 = 1
            goto L30
        L2f:
            r5 = 0
        L30:
            if (r5 != 0) goto L6a
            boolean r0 = b(r4)     // Catch: java.lang.Exception -> L5f
            if (r0 != 0) goto L44
            boolean r4 = c(r4)     // Catch: java.lang.Exception -> L5f
            if (r4 != 0) goto L44
            boolean r4 = a()     // Catch: java.lang.Exception -> L5f
            if (r4 == 0) goto L45
        L44:
            r2 = 1
        L45:
            if (r2 != 0) goto L5d
            com.taobao.orange.OrangeConfig r4 = com.taobao.orange.OrangeConfig.getInstance()     // Catch: java.lang.Exception -> L5a
            java.lang.String r5 = "displaycutoutsupport"
            java.lang.String r0 = "cutoutphonelist"
            java.lang.String r1 = ""
            java.lang.String r4 = r4.getConfig(r5, r0, r1)     // Catch: java.lang.Exception -> L5a
            boolean r5 = a(r4)     // Catch: java.lang.Exception -> L5a
            goto L6a
        L5a:
            r4 = move-exception
            r5 = r2
            goto L63
        L5d:
            r5 = r2
            goto L6a
        L5f:
            r4 = move-exception
            goto L63
        L61:
            r4 = move-exception
            r5 = 0
        L63:
            java.lang.String r0 = "SupportDisplayCutout"
            java.lang.String r1 = "isCutoutScreen exception:"
            android.util.Log.e(r0, r1, r4)
        L6a:
            tb.gfe.b = r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.gfe.a(android.content.Context, android.view.WindowInsets):boolean");
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
            if (region2 == null && (region2 = d(context)) == null && (region2 = c()) == null && (region2 = e(context)) == null) {
                region2 = a(context, OrangeConfig.getInstance().getConfig("displaycutoutsupport", "cutoutphonelist", ""));
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
        Region b2 = b(context, windowInsets);
        if (b2 == null) {
            return 0;
        }
        int i2 = b2.getBounds().bottom - b2.getBounds().top;
        d = i2;
        return i2;
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
            if (a(window) || b(window)) {
                return true;
            }
            return b(context.getPackageName());
        } catch (Exception e2) {
            Log.e("SupportDisplayCutout", "fullScreenDisplayInCutout exception:", e2);
            return false;
        }
    }

    public static boolean a(Dialog dialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5396925", new Object[]{dialog})).booleanValue();
        }
        if (dialog != null) {
            return a(dialog.getContext(), dialog.getWindow());
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

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
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

    private static boolean a() {
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
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        JSONArray jSONArray = new JSONArray(str);
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null && optJSONObject.optString("model").equals(b())) {
                return true;
            }
        }
        return false;
    }

    private static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        if (StringUtils.isEmpty(f28305a)) {
            f28305a = Build.MODEL;
        }
        return f28305a;
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

    private static Region c() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getMethod("get", String.class, String.class).invoke(cls, "ro.oppo.screen.heteromorphism", "");
            String str2 = "getCutoutInfoByOppo property:" + str;
            if (StringUtils.isEmpty(str)) {
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
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        JSONArray jSONArray = new JSONArray(str);
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("model");
                int optInt = optJSONObject.optInt("w");
                int optInt2 = optJSONObject.optInt("h");
                if (optString.equals(b())) {
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
        if (StringUtils.isEmpty(str)) {
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
