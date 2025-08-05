package com.taobao.message.notification.base;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.connection.state.a;
import com.taobao.application.common.c;
import com.taobao.application.common.d;
import com.taobao.message.notification.util.BrandUtil;
import com.taobao.message.notification.util.OverlayPermission;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import tb.kge;

/* loaded from: classes7.dex */
public class DefaultEnvProvider implements IEnvProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-437661006);
        kge.a(1930881866);
    }

    @Override // com.taobao.message.notification.base.IEnvProvider
    public boolean isAppBackGround(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63a3421a", new Object[]{this, str})).booleanValue();
        }
        d a2 = c.a();
        return a2 == null || a2.a("isInBackground", false);
    }

    @Override // com.taobao.message.notification.base.IEnvProvider
    public boolean isProcessRight(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("359ac94e", new Object[]{this, context})).booleanValue();
        }
        if (context != null) {
            try {
                BrandUtil.getInstance();
                if (BrandUtil.isOPPO() && "true".equals(OrangeConfig.getInstance().getConfig("mpm_business_switch", "isEnableMainProcessRightOpt", "true"))) {
                    boolean a2 = a.a().a(context);
                    TLog.loge("TaobaoIntentService.TAG", "isProcessRight:" + a2);
                    return a2;
                }
                String packageName = context.getPackageName();
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                if (activityManager != null) {
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                        Log.e("TaobaoIntentService.TAG", "mainProcess:" + packageName + " appProcess:" + runningAppProcessInfo.processName);
                        if (runningAppProcessInfo.processName.equals(packageName)) {
                            return true;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.taobao.message.notification.base.IEnvProvider
    public boolean isWindowManagerAvaliable(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd1f0055", new Object[]{this, context})).booleanValue();
        }
        if (OverlayPermission.hasPermission(context.getApplicationContext())) {
            return true;
        }
        return Build.VERSION.SDK_INT < 23 && !BrandUtil.isXiaoMi();
    }

    @Override // com.taobao.message.notification.base.IEnvProvider
    public boolean checkBrand(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d97e34b4", new Object[]{this, str})).booleanValue() : Build.BRAND.toLowerCase().equals(str);
    }
}
