package tb;

import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class ben {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_LBS = "LBS";

    /* renamed from: a  reason: collision with root package name */
    private static String f25833a;

    static {
        kge.a(1400501563);
    }

    private static SharedPreferences b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("ed1f0113", new Object[]{context}) : context.getSharedPreferences("homepage_common", 0);
    }

    public static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str});
        }
        if (StringUtils.isEmpty(str) || !"LBS".equals(str) || context == null) {
            return null;
        }
        if (f25833a == null) {
            f25833a = b(context).getString("tb_homepage_clientCache_lbs", null);
        }
        return f25833a;
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context}) : a(context, "LBS");
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            f25833a = null;
        }
    }
}
