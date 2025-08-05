package com.taobao.android.tbtheme.kit;

import android.content.res.Configuration;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.view.widgets.bgcontainer.a;
import com.taobao.tao.Globals;
import tb.kge;
import tb.mxw;
import tb.nom;

/* loaded from: classes.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static int f15444a;
    private static int b;
    private static int c;
    private static int d;
    private static float e;
    private static int f;

    static {
        kge.a(-1921991317);
        f15444a = -1;
        e = -1.0f;
        f = -1;
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
        }
        if (f15444a < 0) {
            b();
        }
        return f15444a;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        DisplayMetrics displayMetrics = Globals.getApplication().getResources().getDisplayMetrics();
        if (Build.DEVICE.equalsIgnoreCase("mx2")) {
            b = 96;
        }
        Configuration configuration = Globals.getApplication().getResources().getConfiguration();
        if (Build.DEVICE.equalsIgnoreCase("mx2")) {
            b = 96;
        }
        if (configuration.orientation == 2) {
            c = displayMetrics.heightPixels / 2;
            e = displayMetrics.density;
            f = displayMetrics.heightPixels;
            f15444a = displayMetrics.widthPixels - b;
            d = f << 1;
            return;
        }
        c = displayMetrics.widthPixels / 2;
        e = displayMetrics.density;
        f = displayMetrics.widthPixels;
        f15444a = displayMetrics.heightPixels - b;
        d = f << 1;
    }

    public static ThemeData a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThemeData) ipChange.ipc$dispatch("325e6660", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return a(JSONObject.parseObject(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static ThemeData a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThemeData) ipChange.ipc$dispatch("66ee6fca", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        ThemeData themeData = new ThemeData();
        themeData.actionbarTextColor = jSONObject.getString("actionbarTextColor");
        themeData.actionBarBackgroundImage = jSONObject.getString("actionBarBackgroundImage");
        themeData.actionBarBackgroundColor = jSONObject.getString("actionBarBackgroundColor");
        themeData.skinPic = jSONObject.getString(mxw.KEY_SKIN_PIC);
        themeData.skinColor = jSONObject.getString(mxw.KEY_SKIN_COLOR);
        themeData.statusBarStyle = jSONObject.getString("statusBarStyle");
        themeData.naviStyle = jSONObject.getString(nom.KEY_NAVI_STYLE);
        themeData.isComplexTexture = jSONObject.getString(a.IS_COMPLEX_TEXTURE);
        themeData.themeLevel = jSONObject.getString("themeLevel");
        return themeData;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : 32 == (Globals.getApplication().getResources().getConfiguration().uiMode & 48);
    }
}
