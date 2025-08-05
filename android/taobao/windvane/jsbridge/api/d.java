package android.taobao.windvane.jsbridge.api;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.api.WVCamera;
import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Context mContext;
    public IWVWebView mWebView;

    static {
        kge.a(-16444121);
    }

    public abstract void doUpload(WVCamera.a aVar, WVCallBackContext wVCallBackContext);

    public void resetMultiPictureResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c33741b8", new Object[]{this});
        }
    }

    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
            return;
        }
        this.mContext = context;
        this.mWebView = iWVWebView;
    }
}
