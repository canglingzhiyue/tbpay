package com.taobao.mytaobao.newsetting;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.utils.Global;
import tb.kge;

/* loaded from: classes7.dex */
public class FontSettingJSBridge extends android.taobao.windvane.jsbridge.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String GET_FONT_SETTING = "getFontSetting";
    public static final String NAME = "FontSettingJSBridge";
    private static final String SIZE_BY_FACTOR = "sizeByFactor";

    static {
        kge.a(-1648316042);
    }

    public static /* synthetic */ Object ipc$super(FontSettingJSBridge fontSettingJSBridge, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        com.taobao.mytaobao.basement.monitor.b.a().a(NAME);
        if (str == null) {
            return false;
        }
        if (GET_FONT_SETTING.equals(str)) {
            try {
                JSONObject a2 = FontSetting.a(Global.getApplication());
                r rVar = new r("HY_SUCCESS");
                rVar.a("fontSetting", a2);
                wVCallBackContext.success(rVar);
                return true;
            } catch (Throwable th) {
                wVCallBackContext.error(th.getMessage());
            }
        } else if ("sizeByFactor".equals(str)) {
            double sizeByFactor = sizeByFactor(str2);
            r rVar2 = new r("HY_SUCCESS");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fontSize", (Object) Double.valueOf(sizeByFactor));
            rVar2.a("result", jSONObject);
            wVCallBackContext.success(rVar2);
            return true;
        }
        return false;
    }

    private double sizeByFactor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4049bae6", new Object[]{this, str})).doubleValue();
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            if (parseObject.containsKey("baseFontSize")) {
                double doubleValue = parseObject.getDoubleValue("baseFontSize");
                if (parseObject.containsKey("levelFiveFontSize")) {
                    return FontSetting.a(doubleValue, parseObject.getDoubleValue("levelFiveFontSize"));
                }
                return FontSetting.a(doubleValue);
            }
            return FontSetting.a(parseObject.getDoubleValue("levelZeroFontSize"), parseObject.getDoubleValue("levelOneFontSize"), parseObject.getDoubleValue("levelTwoFontSize"), parseObject.getDoubleValue("levelThreeFontSize"), parseObject.getDoubleValue("levelFourFontSize"));
        } catch (Throwable th) {
            TLog.loge(NAME, th.toString());
            return -1.0d;
        }
    }
}
