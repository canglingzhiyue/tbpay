package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class mxl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_LBS = "LBS";

    /* renamed from: a  reason: collision with root package name */
    private static String f31311a;

    static {
        kge.a(1060821951);
    }

    private static SharedPreferences b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("ed1f0113", new Object[]{context}) : context.getSharedPreferences("homepage_common", 0);
    }

    private static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str});
        }
        if (TextUtils.isEmpty(str) || !"LBS".equals(str) || context == null) {
            return null;
        }
        if (f31311a == null) {
            f31311a = b(context).getString("tb_homepage_clientCache_lbs", null);
        }
        return f31311a;
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context}) : a(context, "LBS");
    }
}
