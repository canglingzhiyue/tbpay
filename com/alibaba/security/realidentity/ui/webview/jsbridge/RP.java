package com.alibaba.security.realidentity.ui.webview.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import com.alibaba.security.realidentity.ui.webview.jsbridge.entity.WVResultWrapper;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class RP extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue() : JsApiManager.getInstance().dispatch(this.mContext, str, str2, new JsCallbackAdapter() { // from class: com.alibaba.security.realidentity.ui.webview.jsbridge.RP.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.security.realidentity.ui.webview.jsbridge.JsCallbackAdapter
            public void error(WVResultWrapper wVResultWrapper) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b6a33162", new Object[]{this, wVResultWrapper});
                    return;
                }
                WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                if (wVCallBackContext2 == null) {
                    return;
                }
                wVCallBackContext2.error(RP.this.transform(wVResultWrapper));
            }

            @Override // com.alibaba.security.realidentity.ui.webview.jsbridge.JsCallbackAdapter
            public void fireEvent(String str3, String str4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7134ec1f", new Object[]{this, str3, str4});
                    return;
                }
                WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                if (wVCallBackContext2 == null) {
                    return;
                }
                wVCallBackContext2.fireEvent(str3, str4);
            }

            @Override // com.alibaba.security.realidentity.ui.webview.jsbridge.JsCallbackAdapter
            public void success(WVResultWrapper wVResultWrapper) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d7b8de9d", new Object[]{this, wVResultWrapper});
                    return;
                }
                WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                if (wVCallBackContext2 == null) {
                    return;
                }
                wVCallBackContext2.success(RP.this.transform(wVResultWrapper));
            }

            @Override // com.alibaba.security.realidentity.ui.webview.jsbridge.JsCallbackAdapter
            public void error(String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("72e35699", new Object[]{this, str3});
                    return;
                }
                WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                if (wVCallBackContext2 == null) {
                    return;
                }
                wVCallBackContext2.error(str3);
            }

            @Override // com.alibaba.security.realidentity.ui.webview.jsbridge.JsCallbackAdapter
            public void success() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b4550b0a", new Object[]{this});
                    return;
                }
                WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                if (wVCallBackContext2 == null) {
                    return;
                }
                wVCallBackContext2.success();
            }

            @Override // com.alibaba.security.realidentity.ui.webview.jsbridge.JsCallbackAdapter
            public void error() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1392128f", new Object[]{this});
                    return;
                }
                WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                if (wVCallBackContext2 == null) {
                    return;
                }
                wVCallBackContext2.error();
            }

            @Override // com.alibaba.security.realidentity.ui.webview.jsbridge.JsCallbackAdapter
            public void success(String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6b54654", new Object[]{this, str3});
                    return;
                }
                WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                if (wVCallBackContext2 == null) {
                    return;
                }
                wVCallBackContext2.success(str3);
            }
        });
    }

    public r transform(WVResultWrapper wVResultWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r) ipChange.ipc$dispatch("592e19a6", new Object[]{this, wVResultWrapper});
        }
        r rVar = new r();
        if (wVResultWrapper.getSuccess() == 1) {
            rVar.b();
        }
        rVar.a(wVResultWrapper.getResult());
        return rVar;
    }
}
