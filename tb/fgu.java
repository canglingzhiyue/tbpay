package tb;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.graphics.Point;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.datamodel.node.ItemNode;
import com.taobao.android.detail.sdk.utils.f;
import com.taobao.android.detail2.core.framework.base.media.frame.b;
import com.taobao.orange.OrangeConfig;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public class fgu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final double ASPECT_RATIO1_1 = 1.0d;
    public static final double ASPECT_RATIO3_4 = 0.75d;
    public static final double ASPECT_RATIO9_16 = 0.6d;

    /* renamed from: a  reason: collision with root package name */
    private static final Point[] f27934a;

    static {
        kge.a(-1500031841);
        f27934a = new Point[2];
        emu.a("com.taobao.android.detail.wrapper.utils.InsideDetailUtils");
    }

    public static int a(Context context, ItemNode itemNode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b8731a72", new Object[]{context, itemNode})).intValue() : (int) (prc.f(context) / a(itemNode));
    }

    public static void a(Activity activity) {
        if (activity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT != 26 && Build.VERSION.SDK_INT != 27) {
            return;
        }
        try {
            Field declaredField = Activity.class.getDeclaredField("mActivityInfo");
            declaredField.setAccessible(true);
            ((ActivityInfo) declaredField.get(activity)).screenOrientation = -1;
            declaredField.setAccessible(false);
        } catch (Exception e) {
            i.d("InsideDetailUtils", "fixScreenOrientationOnSDK_O error : " + e.getMessage());
            activity.setRequestedOrientation(-1);
        }
    }

    public static void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{activity});
        } else if (Build.VERSION.SDK_INT < 30) {
            c(activity);
        } else {
            d(activity);
        }
    }

    private static void c(Activity activity) {
        try {
            Method declaredMethod = Activity.class.getDeclaredMethod("convertFromTranslucent", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(activity, new Object[0]);
        } catch (Throwable th) {
            f.a("InsideDetailUtils", "convertActivityFromTranslucent error", th);
        }
    }

    private static void d(Activity activity) {
        try {
            Method declaredMethod = Activity.class.getDeclaredMethod("setTranslucent", Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(activity, false);
        } catch (Throwable th) {
            f.a("InsideDetailUtils", "convertActivityFromTranslucent error", th);
        }
    }

    public static float a(ItemNode itemNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c15367", new Object[]{itemNode})).floatValue();
        }
        if (itemNode == null) {
            return 1.0f;
        }
        String str = itemNode.containerDimension;
        if (StringUtils.isEmpty(str) && itemNode.videos != null && itemNode.videos.size() > 0) {
            str = itemNode.videos.get(0).spatialVideoDimension;
        }
        if (StringUtils.isEmpty(str)) {
            return 1.0f;
        }
        if (b.VALUE_THREE_FOUR_RATIO.equals(str)) {
            return 0.75f;
        }
        float a2 = a(str);
        if (a2 == -1.0f) {
            return 1.0f;
        }
        return a2;
    }

    private static float a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c22", new Object[]{str})).floatValue();
        }
        String[] split = str.split(":");
        try {
            return Integer.parseInt(split[0]) / Integer.parseInt(split[1]);
        } catch (Throwable th) {
            f.c("InsideDetailUtils", "detail.getAspectRatio error: " + th.getMessage());
            return -1.0f;
        }
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9eca0ff2", new Object[]{context})).intValue() : eme.f(context) - eme.g(context);
    }

    public static int c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f76bb91", new Object[]{context})).intValue();
        }
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0;
        }
        return context.getResources().getDimensionPixelSize(identifier);
    }

    public static float a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c1152b8", new Object[]{new Integer(i), new Integer(i2)})).floatValue();
        }
        float f = 1.0f - (i / i2);
        if (f >= 0.9f) {
            return Math.min(1.0f, (f - 0.9f) * 10.0f);
        }
        return 0.0f;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("android_detail", "insideDowngrade", "false"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("android_detail", "insideUrlDowngrade", "false"));
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("android_detail", "removeAddInsideDetailLogic", "true"));
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("android_detail", "enableInsideNewHeightAB", "true"));
    }
}
