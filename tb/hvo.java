package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.CoreConstants;

/* loaded from: classes6.dex */
public class hvo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Context f28814a;
    private static String b;
    private static String c;

    static {
        kge.a(-1395903498);
        b = "tborder";
        c = "3.0";
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            f28814a = context;
        }
    }

    public static SharedPreferences a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("3f11033c", new Object[0]);
        }
        Context context = f28814a;
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences("trade_debug_order", 32768);
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        SharedPreferences a2 = a();
        String string = a2 != null ? a2.getString(CoreConstants.ORDER_APP_NAME_KEY, null) : "";
        if (TextUtils.isEmpty(string)) {
            string = b;
        }
        hyn.a("OrderCore", "getAppName", "appName = " + string);
        return string;
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
        }
        SharedPreferences a2 = a();
        String string = a2 != null ? a2.getString(CoreConstants.ORDER_APP_V_KEY, null) : "";
        if (TextUtils.isEmpty(string)) {
            string = c;
        }
        hyn.a("OrderCore", "getAppVersion", "appV = " + string);
        return string;
    }
}
