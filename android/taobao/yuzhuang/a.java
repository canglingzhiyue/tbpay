package android.taobao.yuzhuang;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.preference.PreferenceManager;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.c;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-888824797);
    }

    private static void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
            return;
        }
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            ComponentName componentName = new ComponentName(str, str2);
            if (packageManager.getComponentEnabledSetting(componentName) != 2) {
                return;
            }
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        } catch (Exception e) {
            Log.e("ComponentStateInner", "try to change component state failed, component:" + str2, e);
        }
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("is_yuzhuang_state_recovered", true).commit();
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue() : PreferenceManager.getDefaultSharedPreferences(context).getBoolean("is_yuzhuang_state_recovered", false);
    }

    public static void a(Context context, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9591153", new Object[]{context, hashMap});
        } else {
            c(context);
        }
    }

    private static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
            return;
        }
        String packageName = context.getPackageName();
        a(context, packageName, "com.taobao.alivfssdk.monitor.AVFSMonitorService");
        a(context, packageName, "com.taobao.taobao.TaobaoIntentService");
        a(context, packageName, c.channelService);
        a(context, packageName, "com.taobao.accs.EventReceiver");
        a(context, packageName, c.msgService);
        a(context, packageName, "org.android.agoo.accs.AgooService");
        a(context, packageName, "com.taobao.agoo.AgooCommondReceiver");
        a(context, packageName, "com.taobao.accs.internal.AccsJobService");
        a(context, packageName, "com.taobao.wireless.bcportserver.PortServerReceiver");
        a(context, packageName, "com.taobao.wireless.bcportserver.PortsService");
        a(context, packageName, "com.taobao.accs.ServiceReceiver");
        a(context, packageName, "com.alibaba.analytics.AnalyticsService");
        a(context, packageName, "mtopsdk.xstate.XStateService");
        a(context, packageName, "com.taobao.orange.service.OrangeApiService");
        a(context, packageName, "com.taobao.activelocation.service.aidl.TBLocationServiceImpl");
        a(context, packageName, "com.taobao.acds.compact.ACDSBusinessService");
        a(context, packageName, "com.taobao.passivelocation.aidl.PassiveLocationServiceImpl");
        a(context, packageName, "anetwork.channel.aidl.NetworkService");
        a(context, packageName, "org.chromium.content.app.SandboxedProcessService0");
        a(context, packageName, "com.taobao.activelocation.report.service.ActiveReportService");
        a(context, packageName, "com.taobao.passivelocation.report.service.LocationReportService");
        a(context, packageName, "com.taobao.passivelocation.gathering.service.LocationGatheringService");
        a(context, packageName, "com.amap.api.location.APSService");
        a(context, packageName, "com.taobao.acds.compact.AccsACDSService");
        a(context, packageName, "com.taobao.passivelocation.gathering.receiver.LocationChangedReceiver");
        a(context, packageName, "com.taobao.favorites.service.FavGoodService");
        a(context, packageName, "com.laiwang.protocol.android.LwpAccsService");
        a(context, packageName, "com.laiwang.protocol.android.LWPService");
    }
}
