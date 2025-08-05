package com.taobao.mytaobao.newsetting;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.utils.Global;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.common.WXModule;
import tb.kge;

/* loaded from: classes7.dex */
public class FontSettingModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "FontSettingModule";

    static {
        kge.a(-183925040);
    }

    @JSMethod(uiThread = false)
    public JSONObject getFontSetting() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2589c3f2", new Object[]{this});
        }
        com.taobao.mytaobao.basement.monitor.b.a().a("FontSettingModule.getFontSetting");
        return FontSetting.a(Global.getApplication());
    }

    @JSMethod(uiThread = false)
    public double sizeByFactor1(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("696b115b", new Object[]{this, new Double(d)})).doubleValue();
        }
        com.taobao.mytaobao.basement.monitor.b.a().a("FontSettingModule.sizeByFactor1");
        return FontSetting.a(d);
    }

    @JSMethod(uiThread = false)
    public double sizeByFactor2(double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f8ddb7a0", new Object[]{this, new Double(d), new Double(d2)})).doubleValue();
        }
        com.taobao.mytaobao.basement.monitor.b.a().a("FontSettingModule.sizeByFactor2");
        return FontSetting.a(d, d2);
    }

    @JSMethod(uiThread = false)
    public static double sizeByFactor3(double d, double d2, double d3, double d4, double d5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7429499", new Object[]{new Double(d), new Double(d2), new Double(d3), new Double(d4), new Double(d5)})).doubleValue();
        }
        com.taobao.mytaobao.basement.monitor.b.a().a("FontSettingModule.sizeByFactor3");
        return FontSetting.a(d, d2, d3, d4, d5);
    }
}
