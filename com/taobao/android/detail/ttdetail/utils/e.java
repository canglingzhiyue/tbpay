package com.taobao.android.detail.ttdetail.utils;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.SystemBarDecorator;
import tb.kge;
import tb.lqv;
import tb.odg;

/* loaded from: classes5.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LARGE_SCREEN_STYLE_FULL_SCREEN = "fullscreen";
    public static final String LARGE_SCREEN_STYLE_KEY = "largescreenstyle";
    public static final String LARGE_SCREEN_STYLE_SPILT = "spilt";

    static {
        kge.a(1918526410);
    }

    public static lqv a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lqv) ipChange.ipc$dispatch("f0773ad", new Object[0]) : odg.d().a();
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        Application a2 = f.a();
        return odg.d().a(a2) || odg.d().b(a2);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        boolean b = b();
        boolean c = odg.d().c(context);
        boolean b2 = b(context);
        i.a("DeviceUtils", "isPadDeviceAndLandscape isPadDevice:" + b + " isPortraitLayout:" + c + " isLargeScreenStyleUri:" + b2);
        return b2 && b && !c && !e();
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue();
        }
        Application a2 = f.a();
        boolean b = odg.d().b(a2);
        boolean x = j.x();
        boolean c = odg.d().c(a2);
        i.a("DeviceUtils", "isFoldDeviceAndLandscape enableSingleColumn:" + x + ", isPortraitLayout:" + c);
        return b && x && !c;
    }

    private static boolean b(Context context) {
        Uri data;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue() : (context instanceof Activity) && (data = ((Activity) context).getIntent().getData()) != null && "fullscreen".equals(data.getQueryParameter(LARGE_SCREEN_STYLE_KEY));
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : odg.f().a();
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[0])).intValue() : SystemBarDecorator.SystemBarConfig.getStatusBarHeight(odg.b().a());
    }
}
