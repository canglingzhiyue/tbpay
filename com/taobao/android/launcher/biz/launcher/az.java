package com.taobao.android.launcher.biz.launcher;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.speed.TBSpeed;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import tb.gve;

/* loaded from: classes.dex */
public class az extends com.taobao.android.launcher.biz.task.j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(az azVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public az(String str) {
        super(str);
    }

    @Override // com.taobao.android.launcher.biz.task.i
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
        } else {
            a(application, application.getPackageName());
        }
    }

    private void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
            return;
        }
        for (String str2 : new String[]{"com.taobao.android.shop.activity.ShopUrlRouterActivity", "com.taobao.browser.BrowserActivity", "com.taobao.android.auth.AuthEntranceActivity"}) {
            a(context, str, str2);
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 2);
            if (packageInfo.receivers != null) {
                for (ActivityInfo activityInfo : packageInfo.receivers) {
                    a(context, str, activityInfo.name);
                }
            }
        } catch (Throwable th) {
            TLog.loge(gve.MODULE, "InitComponents", "recover receivers info failed:", th);
        }
        b(context, str);
    }

    private void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{this, context, str, str2});
            return;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(str, str2);
            if (packageManager.getComponentEnabledSetting(componentName) != 2) {
                return;
            }
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
            TLog.loge(gve.MODULE, "InitComponents", "component " + componentName + " recovered");
        } catch (Exception e) {
            TLog.loge(gve.MODULE, "InitComponents", "try to change component state failed, component:" + str2, e);
        }
    }

    private boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        if (!"OPPO".equalsIgnoreCase(Build.BRAND) && !"VIVO".equalsIgnoreCase(Build.BRAND) && !"REDMI".equalsIgnoreCase(Build.BRAND) && !"IQOO".equalsIgnoreCase(Build.BRAND) && !"samsung".equalsIgnoreCase(Build.BRAND) && !"REALME".equalsIgnoreCase(Build.BRAND) && !"XIAOMI".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        return TBSpeed.isSpeedEdition(context, "key_huawei_content_provider_load_on_demand");
    }

    private void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{this, context, str});
        } else if (a(context)) {
            String[] strArr = {"com.huawei.agconnect.core.provider.AGConnectInitializeProvider", "com.huawei.hms.aaid.InitProvider"};
            try {
                PackageManager packageManager = context.getPackageManager();
                for (String str2 : strArr) {
                    ComponentName componentName = new ComponentName(str, str2);
                    int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
                    if (componentEnabledSetting == 0 || componentEnabledSetting == 1) {
                        packageManager.setComponentEnabledSetting(componentName, 2, 1);
                        TLog.loge(gve.MODULE, "InitComponents", "component " + componentName + " disabled");
                    } else if (componentEnabledSetting == 2 && TBSpeed.isSpeedEdition(context, "key_huawei_content_provider_restore")) {
                        packageManager.setComponentEnabledSetting(componentName, 0, 1);
                        TLog.loge(gve.MODULE, "InitComponents", "component " + componentName + " enabled");
                    }
                }
            } catch (Exception e) {
                TLog.loge(gve.MODULE, "InitComponents", "try to disable content provider component state failed", e);
            }
        }
    }
}
