package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.performance.m;
import com.taobao.android.detail.core.utils.i;
import com.taobao.orange.OrangeConfig;

/* loaded from: classes4.dex */
public class eir {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1281211695);
        emu.a("com.taobao.android.detail.core.performance.orange.DetailUIFeatureOptOrangeConfig");
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : a("enable_sku_price_update", "true");
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : a("enable_avatar_animation", "true");
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : a("enable_ttnavibar", "true");
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : a("enable_ttelevator", "true");
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : a("enable_lightoff_trans_anim", "true") && b(context);
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        if (context != null && (context instanceof DetailCoreActivity)) {
            return ((DetailCoreActivity) context).Q();
        }
        return false;
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue() : a("enable_lightoff_native_pic", "true") && b(context);
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : a("enable_compute_scroll_catch", "true");
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue();
        }
        boolean b = b("enable_desc_pic_option", 0L);
        String a2 = m.a("DetailUIFeatureOptOrangeConfig");
        i.d(a2, "isEnableDescPicOption orange:[" + b + riy.ARRAY_END_STR);
        return b;
    }

    private static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        try {
            return "true".equals(OrangeConfig.getInstance().getConfig("android_detail2", str, str2));
        } catch (Exception e) {
            i.a("DetailUIFeatureOptOrangeConfig", str, e);
            return false;
        }
    }

    private static long a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{str, new Long(j)})).longValue();
        }
        try {
            return Long.parseLong(OrangeConfig.getInstance().getConfig("android_detail2", str, String.valueOf(j)));
        } catch (Exception e) {
            i.a("DetailUIFeatureOptOrangeConfig", str, e);
            return j;
        }
    }

    private static boolean b(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d253fb5", new Object[]{str, new Long(j)})).booleanValue();
        }
        String e = epo.g().e();
        if (TextUtils.isEmpty(e)) {
            return false;
        }
        long a2 = a(str, j);
        return a2 >= 10000 || Long.valueOf(Long.parseLong(e) % 10000).longValue() <= a2;
    }
}
