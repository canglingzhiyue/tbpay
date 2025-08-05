package tb;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class kii {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-618714875);
    }

    public static int a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821884b", new Object[]{new Float(f)})).intValue() : (int) ((f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
            return;
        }
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            ComponentName componentName = new ComponentName(context.getPackageName(), str);
            int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
            kif.a("setWidgetDisable enabledSetting" + componentEnabledSetting);
            if (componentEnabledSetting != 1 && componentEnabledSetting != 0) {
                return;
            }
            packageManager.setComponentEnabledSetting(componentName, 2, 1);
            kif.a("setWidgetDisable receiverName" + str);
        } catch (Throwable th) {
            kif.a("setWidgetDisable error" + th.getMessage());
        }
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter(str2, str3);
        buildUpon.build();
        return buildUpon.toString();
    }
}
