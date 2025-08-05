package android.taobao.windvane.standardmodal;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.IpChange;
import tb.aem;
import tb.kge;

/* loaded from: classes2.dex */
public class WVStandardEventCenter extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1859621328);
    }

    public static void postNotificationToJS(IWVWebView iWVWebView, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3a76d0e", new Object[]{iWVWebView, str, str2});
        } else {
            WVCallBackContext.fireEvent(iWVWebView, str, str2);
        }
    }

    public static void postNotificationToJS(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6551186a", new Object[]{str, str2});
        } else {
            aem.a().a(3006, str, str2);
        }
    }

    public void postNotificationToNative(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65806c4b", new Object[]{this, str, wVCallBackContext});
            return;
        }
        aem.a().a(3005, str, wVCallBackContext);
        wVCallBackContext.success();
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"postNotificationToNative".equals(str)) {
            return false;
        }
        postNotificationToNative(str2, wVCallBackContext);
        return true;
    }
}
