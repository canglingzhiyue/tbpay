package com.taobao.android.weex_framework.module.builtin;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.android.weex_framework.widget.FontDO;
import tb.kge;

/* loaded from: classes6.dex */
public class MUSDomModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final Object LOCK;
    public static final String NAME = "dom";

    static {
        kge.a(-1641674282);
        LOCK = new Object();
    }

    public MUSDomModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    @MUSMethod(uiThread = false)
    public void scrollToElement(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4d7b44b", new Object[]{this, str, jSONObject});
            return;
        }
        p mUSDomModule = getInstance();
        if (mUSDomModule == null) {
            return;
        }
        try {
            mUSDomModule.callNativeUINode(Integer.valueOf(str).intValue(), "scrollTo", new MUSValue[]{MUSValue.ofJSON(jSONObject)});
        } catch (Throwable unused) {
        }
    }

    @MUSMethod(uiThread = false)
    public void addRule(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63306aa2", new Object[]{this, str, jSONObject});
            return;
        }
        MUSDKInstance mUSDKInstance = (MUSDKInstance) getInstance();
        if (mUSDKInstance == null || mUSDKInstance.isDestroyed() || !TextUtils.equals("fontFace", str)) {
            return;
        }
        if (mUSDKInstance.getInstanceConfig() != null && mUSDKInstance.getInstanceConfig().j() == MUSInstanceConfig.MUSRenderType.MUSRenderTypeUnicorn) {
            mUSDKInstance.registerCSSRule(str, jSONObject);
            return;
        }
        FontDO parseFontDO = parseFontDO(jSONObject, mUSDKInstance);
        if (parseFontDO == null || TextUtils.isEmpty(parseFontDO.e())) {
            return;
        }
        synchronized (LOCK) {
            FontDO a2 = com.taobao.android.weex_framework.widget.a.a().a(parseFontDO.e());
            if (a2 != null && TextUtils.equals(a2.a(), parseFontDO.a())) {
                com.taobao.android.weex_framework.widget.a.a().a(a2, true);
            }
            com.taobao.android.weex_framework.widget.a.a().a(parseFontDO);
            com.taobao.android.weex_framework.widget.a.a().a(parseFontDO, true);
        }
    }

    private static FontDO parseFontDO(JSONObject jSONObject, MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FontDO) ipChange.ipc$dispatch("83abfde2", new Object[]{jSONObject, mUSDKInstance});
        }
        if (jSONObject != null) {
            return new FontDO(jSONObject.getString("fontFamily"), jSONObject.getString("src"), mUSDKInstance);
        }
        return null;
    }
}
