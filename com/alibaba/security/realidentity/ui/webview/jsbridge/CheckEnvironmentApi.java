package com.alibaba.security.realidentity.ui.webview.jsbridge;

import com.alibaba.security.realidentity.g2;
import com.alibaba.security.realidentity.u4;
import com.alibaba.security.realidentity.ui.webview.jsbridge.annotation.JSTopic;
import com.alibaba.security.realidentity.ui.webview.jsbridge.entity.WVResultWrapper;
import com.android.alibaba.ip.runtime.IpChange;

@JSTopic(topic = "checkEnvironment")
/* loaded from: classes3.dex */
public class CheckEnvironmentApi extends BaseJsExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public CheckEnvironmentApi(u4 u4Var) {
        super(u4Var);
    }

    @Override // com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor
    public boolean execute(String str, JsCallbackAdapter jsCallbackAdapter) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        boolean z3 = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d162c2f", new Object[]{this, str, jsCallbackAdapter})).booleanValue();
        }
        String str2 = g2.f3421a;
        try {
            Class.forName("android.taobao.windvane.jsbridge.l");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        try {
            Class.forName("android.taobao.windvane.extra.uc.WVUCWebView");
            z2 = true;
        } catch (ClassNotFoundException unused2) {
            z2 = false;
        }
        try {
            Class.forName("");
        } catch (ClassNotFoundException unused3) {
            z3 = false;
        }
        WVResultWrapper wVResultWrapper = new WVResultWrapper();
        wVResultWrapper.addData("isWindvane", Boolean.valueOf(z));
        wVResultWrapper.addData("isWindvaneUCWebview", Boolean.valueOf(z2));
        wVResultWrapper.addData("isSecurityGuard", Boolean.valueOf(z3));
        wVResultWrapper.addData("rpsdkVersion", str2);
        wVResultWrapper.addData("faceLivenessVersion", g2.b);
        jsCallbackAdapter.success(wVResultWrapper);
        return false;
    }

    @Override // com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor
    public String getTrackMethod() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("145b9fe3", new Object[]{this}) : "checkEnvironment";
    }

    @Override // com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor
    public boolean needTrack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("532db860", new Object[]{this})).booleanValue();
        }
        return false;
    }
}
