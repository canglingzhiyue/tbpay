package com.taobao.mytaobao.newsetting;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Pair;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.utils.Global;
import tb.kge;

/* loaded from: classes7.dex */
public class FontSetting {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_FONT_CHANGE = "taobao.action.ACTION_FONT_CHANGE";

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f18393a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;
    public static final float[] fontSizeFactors;

    static {
        kge.a(1294366532);
        f18393a = new int[]{-2, 0, 2, 4, 8};
        fontSizeFactors = new float[]{0.8f, 1.0f, 1.12f, 1.31f, 1.52f};
        b = new int[]{26, 28, 30, 32, 36};
        c = new int[]{30, 32, 34, 36, 40};
        d = new int[]{0, 1, 2, 3, 4};
    }

    public static JSONObject a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("58b28f80", new Object[]{context});
        }
        com.taobao.mytaobao.basement.monitor.b.a().a("FontSetting.getFontSetting");
        int a2 = a();
        if (1 == a2) {
            a2 = b.b();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fontSizeDelta", (Object) Integer.valueOf(f18393a[a2]));
            jSONObject.put("fontSizeFactor", (Object) Float.valueOf(fontSizeFactors[a2]));
            jSONObject.put("fontSizeText", (Object) Integer.valueOf(b[a2]));
            jSONObject.put("fontSizeTitle", (Object) Integer.valueOf(c[a2]));
            jSONObject.put("fontSizeLevel", (Object) Integer.valueOf(d[a2]));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public static void setFontCofficient(Context context, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da908925", new Object[]{context, new Integer(i), str});
            return;
        }
        com.taobao.mytaobao.basement.monitor.b.a().a("FontSetting.setFontCofficient");
        int c2 = c(context);
        com.taobao.android.dinamicx.monitor.c.a().b(i);
        if (c2 != i) {
            context.getSharedPreferences("fontSetting", 0).edit().putInt("coefficient", i).commit();
            b(context);
        }
        Pair<String, String> pair = com.taobao.mytaobao.ut.b.FONT_SETTING_TRACKS.get(i);
        TBS.Ext.commitEvent(str, Integer.parseInt("2101"), pair.first, null, null, "spm=" + pair.second);
    }

    private static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
            return;
        }
        Intent intent = new Intent();
        intent.setAction(ACTION_FONT_CHANGE);
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public static int c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f76bb91", new Object[]{context})).intValue();
        }
        if (context == null) {
            context = Globals.getApplication();
        }
        return context.getSharedPreferences("fontSetting", 0).getInt("coefficient", 1);
    }

    public static double a(double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a82180c4", new Object[]{new Double(d2)})).doubleValue();
        }
        com.taobao.mytaobao.basement.monitor.b.a().a("FontSetting.sizeByFactor");
        return d2 * fontSizeFactors[a()];
    }

    public static double a(double d2, double d3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0efa16", new Object[]{new Double(d2), new Double(d3)})).doubleValue();
        }
        com.taobao.mytaobao.basement.monitor.b.a().a("FontSetting.sizeByFactor1");
        int a2 = a();
        return a2 == 4 ? d3 : d2 * fontSizeFactors[a2];
    }

    public static double a(double d2, double d3, double d4, double d5, double d6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f45e4544", new Object[]{new Double(d2), new Double(d3), new Double(d4), new Double(d5), new Double(d6)})).doubleValue();
        }
        com.taobao.mytaobao.basement.monitor.b.a().a("FontSetting.sizeByFactor2");
        int a2 = a();
        return a2 != 0 ? a2 != 1 ? a2 != 2 ? a2 != 3 ? a2 != 4 ? d3 : d6 : d5 : d4 : d3 : d2;
    }

    private static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
        }
        if (!"true".equals(OrangeConfig.getInstance().getConfig("fontSizeSetting", "open", "true"))) {
            return 1;
        }
        return Global.getApplication().getSharedPreferences("fontSetting", 0).getInt("coefficient", 1);
    }
}
