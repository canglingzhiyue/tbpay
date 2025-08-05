package com.taobao.android.fluid.framework.media.miniwindow;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.support.v4.content.ContextCompat;
import android.view.WindowManager;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.obu;
import tb.obx;

/* loaded from: classes5.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FLOAT_WINDOW_BOTTOM_PADDING;
    public static final int FLOAT_WINDOW_PADDING;
    public static final String SP_KEY_FLOAT_WINDOW_X = "SP_KEY_FLOAT_WINDOW_X1";
    public static final String SP_KEY_FLOAT_WINDOW_Y = "SP_KEY_FLOAT_WINDOW_Y1";

    static {
        kge.a(2019021337);
        FLOAT_WINDOW_PADDING = obx.a(obu.e(), 10.0f);
        FLOAT_WINDOW_BOTTOM_PADDING = obx.a(obu.e(), 60.0f);
    }

    public static WindowManager.LayoutParams a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowManager.LayoutParams) ipChange.ipc$dispatch("fc885378", new Object[0]);
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.type = b();
        layoutParams.format = 1;
        layoutParams.flags = 16777256;
        layoutParams.gravity = 51;
        layoutParams.width = -2;
        layoutParams.height = -2;
        return layoutParams;
    }

    private static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue();
        }
        Application e = obu.e();
        if (Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(e)) {
            Toast.makeText(obu.e(), "当前无权限，请授权！", 0).show();
            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + obu.f()));
            intent.setFlags(268435456);
            e.startActivity(intent);
        }
        if (c()) {
            return 2038;
        }
        return d() ? 2003 : 2005;
    }

    private static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : Build.VERSION.SDK_INT >= 26;
    }

    private static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return true;
        }
        return ContextCompat.checkSelfPermission(obu.e(), "android.permission.SYSTEM_ALERT_WINDOW") == 0 && Build.VERSION.SDK_INT < 19;
    }
}
