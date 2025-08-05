package com.taobao.android.detail2.core.framework.floatwindow;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.support.v4.content.ContextCompat;
import android.view.WindowManager;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.utils.Global;
import tb.fjl;
import tb.fjm;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-992883896);
    }

    public static WindowManager.LayoutParams a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowManager.LayoutParams) ipChange.ipc$dispatch("81df59d8", new Object[]{new Integer(i), new Integer(i2)});
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.type = a();
        layoutParams.format = 1;
        layoutParams.flags = 16777256;
        layoutParams.gravity = 51;
        layoutParams.width = i;
        layoutParams.height = i2;
        Application application = Global.getApplication();
        int a2 = fjm.a(application);
        int a3 = fjl.a(application, 10.0f);
        int a4 = fjl.a(application, 60.0f);
        int min = Math.min(fjl.b(application), fjl.a(application));
        int max = Math.max(fjl.b(application), fjl.a(application));
        layoutParams.x = (min - i) - a3;
        layoutParams.y = ((max - a2) - i2) - a4;
        return layoutParams;
    }

    private static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
        }
        Application application = Global.getApplication();
        if (Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(application)) {
            Toast.makeText(Global.getApplication(), "当前无权限，请授权！", 0).show();
            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + Global.getPackageName()));
            intent.setFlags(268435456);
            application.startActivity(intent);
        }
        if (b()) {
            return 2038;
        }
        return c() ? 2003 : 2005;
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : Build.VERSION.SDK_INT >= 26;
    }

    private static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return true;
        }
        return ContextCompat.checkSelfPermission(Global.getApplication(), "android.permission.SYSTEM_ALERT_WINDOW") == 0 && Build.VERSION.SDK_INT < 19;
    }
}
