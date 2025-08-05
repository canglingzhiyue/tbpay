package android.taobao.windvane.jsbridge.api;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class WVUI extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-602765151);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("showLoadingBox".equals(str)) {
            showLoading(str2, wVCallBackContext);
            return true;
        } else if (!"hideLoadingBox".equals(str)) {
            return false;
        } else {
            hideLoading(str2, wVCallBackContext);
            return true;
        }
    }

    public final void showLoading(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d2a580d", new Object[]{this, str, wVCallBackContext});
            return;
        }
        this.mWebView.showLoadingView();
        wVCallBackContext.success();
    }

    public final void hideLoading(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33353068", new Object[]{this, str, wVCallBackContext});
            return;
        }
        this.mWebView.hideLoadingView();
        wVCallBackContext.success();
    }
}
