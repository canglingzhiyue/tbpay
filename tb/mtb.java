package tb;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.taobao.util.k;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;

/* loaded from: classes7.dex */
public class mtb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-268370716);
    }

    private static void a(Context context, String str) {
        ActivityInfo activityInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
            return;
        }
        Intent intent = new Intent();
        intent.setFlags(335544320);
        if (!TextUtils.isEmpty(str)) {
            String str2 = "notification--[url:" + str + riy.ARRAY_END_STR;
            try {
                intent.setData(Uri.parse(str));
                intent.setAction("android.intent.action.VIEW");
                String packageName = context.getPackageName();
                intent.setPackage(packageName);
                ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
                if (resolveActivity != null && (activityInfo = resolveActivity.activityInfo) != null) {
                    String str3 = activityInfo.name;
                    if (!TextUtils.isEmpty(str3)) {
                        intent.setClassName(packageName, str3);
                        String str4 = "activityInfo.name--[" + activityInfo.name + riy.ARRAY_END_STR;
                    }
                }
            } catch (Throwable th) {
                k.a("NotificationUtil", "goToTargetActivity Uri.parse" + th.toString());
                TLog.loge("NotificationUtil", Log.getStackTraceString(th));
                intent = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            }
        } else {
            intent = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        }
        try {
            context.startActivity(intent);
        } catch (Throwable th2) {
            k.a("NotificationUtil", "goToTargetActivity.startActivity" + th2.toString());
            TLog.loge("NotificationUtil", Log.getStackTraceString(th2));
        }
    }

    public static void a(Context context, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a729a6a", new Object[]{context, str, bundle});
        } else if (TextUtils.isEmpty(str)) {
            a(context, str);
        } else {
            Nav.from(context).withExtras(bundle).withFlags(335544320).toUri(str);
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : "1".equals(OrangeConfig.getInstance().getConfig("mpm_business_switch", "use_new_agoo_notification_burying_point", "1"));
    }
}
