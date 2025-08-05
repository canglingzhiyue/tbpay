package com.taobao.browser.jsbridge;

import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog;
import tb.kge;

/* loaded from: classes6.dex */
public class TBWVDialog extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TBMaterialDialog mDialog;

    static {
        kge.a(1098543640);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"show".equals(str)) {
            return false;
        }
        showDialog(str2, wVCallBackContext);
        return true;
    }

    public void showDialog(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b450bb3", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            Object parse = JSONObject.parse(str);
            r rVar = new r();
            if (parse != null && (parse instanceof JSONObject)) {
                if (!TextUtils.isEmpty(((JSONObject) parse).getString("url"))) {
                    WVUCWebView wVUCWebView = new WVUCWebView(this.mContext);
                    wVUCWebView.loadUrl(((JSONObject) parse).getString("url"));
                    this.mDialog = new TBMaterialDialog.Builder(this.mContext).cardDialog(true).customView((View) wVUCWebView, false).build();
                    this.mDialog.show();
                    wVCallBackContext.success();
                    return;
                }
                rVar.a("msg", "url parameter not found!");
                wVCallBackContext.error(rVar);
                return;
            }
            rVar.a("msg", "JSON parse error");
            wVCallBackContext.error(rVar);
        } catch (Exception unused) {
            r rVar2 = new r();
            rVar2.a("msg", "Context maybe null!");
            wVCallBackContext.error(rVar2);
        }
    }
}
