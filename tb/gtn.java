package tb;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.tao.log.TLog;

/* loaded from: classes.dex */
public class gtn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : LauncherRuntime.n;
    }

    public static boolean a(Context context, ComponentName componentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f46de613", new Object[]{context, componentName})).booleanValue();
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager.getComponentEnabledSetting(componentName) == 2) {
                TLog.loge(gve.MODULE, "LinkOptAbility", componentName + " is disabled, try re-enable it");
                packageManager.setComponentEnabledSetting(componentName, 1, 1);
            }
            return packageManager.getComponentEnabledSetting(componentName) != 2;
        } catch (Exception e) {
            TLog.loge(gve.MODULE, "LinkOptAbility", "try to change component state failed, component:" + componentName, e);
            return false;
        }
    }
}
