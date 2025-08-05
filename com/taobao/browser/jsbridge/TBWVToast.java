package com.taobao.browser.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.util.m;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import tb.ado;
import tb.kge;

/* loaded from: classes6.dex */
public class TBWVToast extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1335081129);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"toast".equals(str)) {
            return false;
        }
        showToast(str2, wVCallBackContext);
        return true;
    }

    public void showToast(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c60ff8", new Object[]{this, str, wVCallBackContext});
        } else if (!ado.a(this.mContext)) {
            r rVar = new r();
            rVar.a("HY_NO_PERMISSION");
            rVar.a("msg", "no permission");
            wVCallBackContext.error(rVar);
            m.e("WVJsBridge", "no permission");
        } else {
            try {
                Object parse = JSONObject.parse(str);
                if (parse != null && (parse instanceof JSONObject)) {
                    String string = ((JSONObject) parse).getString("message");
                    String string2 = ((JSONObject) parse).getString("duration");
                    TBToast makeText = TBToast.makeText(this.mContext, string);
                    if (!TextUtils.isEmpty(string2)) {
                        long longValue = Long.valueOf(string2).longValue() * 1000;
                        if (longValue > 1000) {
                            makeText.setDuration(longValue);
                        }
                    }
                    makeText.show();
                } else {
                    TBToast.makeText(this.mContext, str).show();
                }
                wVCallBackContext.success();
            } catch (Exception unused) {
                wVCallBackContext.error();
            }
        }
    }
}
