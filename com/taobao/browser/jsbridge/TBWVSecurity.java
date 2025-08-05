package com.taobao.browser.jsbridge;

import android.net.Uri;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import org.json.JSONArray;
import org.json.JSONException;
import tb.kge;
import tb.rrv;

/* loaded from: classes6.dex */
public class TBWVSecurity extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(321452048);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"secureToken".equals(str)) {
            return false;
        }
        secureToken(str2, wVCallBackContext);
        return true;
    }

    public final void secureToken(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3069190", new Object[]{this, str, wVCallBackContext});
            return;
        }
        String[] strArr = {"antsdaq.com", "antgroup.com", "aliloan.com", "mybank.cn", "alipay.com", "alipaydev.com", "alipayobjects.com", "zmxy.com.cn", "antcloud.com.cn", "antfortune.com", "alipay-cloud.com", "alipay-eco.com", "mayibank.net", "koubei.com", "h5.m.taobao.com", "h5.wapa.taobao.com", "h5.waptest.taobao.com", "wapp.waptest.taobao.com", "wapp.wapa.taobao.com", "wapp.m.taobao.com", "alipay.hk", "alipay.net", "taobao.com", "tmall.com", "render.alipaymo.com", "cainiao.com"};
        String config = OrangeConfig.getInstance().getConfig("WindVane", "secureTokenHosts", "");
        JSONArray jSONArray = null;
        if (!TextUtils.isEmpty(config)) {
            try {
                jSONArray = new JSONArray(config);
            } catch (JSONException unused) {
            }
        }
        r rVar = new r();
        try {
            String url = this.mWebView.getUrl();
            if (!TextUtils.isEmpty(url)) {
                String host = Uri.parse(url).getHost();
                for (int i = 0; i < strArr.length; i++) {
                    if (!host.equals(strArr[i])) {
                        if (!host.endsWith("." + strArr[i])) {
                        }
                    }
                    APSecuritySdk.TokenResult tokenResult = APSecuritySdk.getInstance(this.mContext).getTokenResult();
                    rVar.a(rrv.APDIDTOKEN, tokenResult.apdidToken);
                    rVar.a("umidToken", tokenResult.umidToken);
                    wVCallBackContext.success(rVar);
                    return;
                }
                if (jSONArray != null) {
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        String optString = jSONArray.optString(i2);
                        if (!host.equals(optString)) {
                            if (!host.endsWith("." + optString)) {
                            }
                        }
                        APSecuritySdk.TokenResult tokenResult2 = APSecuritySdk.getInstance(this.mContext).getTokenResult();
                        rVar.a(rrv.APDIDTOKEN, tokenResult2.apdidToken);
                        rVar.a("umidToken", tokenResult2.umidToken);
                        wVCallBackContext.success(rVar);
                        return;
                    }
                }
                rVar.a("msg", "url no permission");
                wVCallBackContext.error(rVar);
                return;
            }
            rVar.a("msg", "fail to getUrl");
            wVCallBackContext.error(rVar);
        } catch (Exception unused2) {
            rVar.a("msg", "JSON parse error");
            wVCallBackContext.error(rVar);
        }
    }
}
