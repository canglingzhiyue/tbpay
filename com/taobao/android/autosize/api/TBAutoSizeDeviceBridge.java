package com.taobao.android.autosize.api;

import android.os.Build;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.webview.IWVWebView;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.tao.log.TLog;

@Deprecated
/* loaded from: classes4.dex */
public class TBAutoSizeDeviceBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String IS_FOLDER_DEVICE_ACTION = "isFolderDevice";
    private static String TAG = "TBAutoSizeDeviceBridge";

    public static /* synthetic */ Object ipc$super(TBAutoSizeDeviceBridge tBAutoSizeDeviceBridge, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!StringUtils.equals(str, IS_FOLDER_DEVICE_ACTION)) {
            return false;
        }
        isFolderDevice(str2, wVCallBackContext);
        return true;
    }

    private void isFolderDevice(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c54c487c", new Object[]{this, str, wVCallBackContext});
            return;
        }
        r rVar = new r();
        try {
            IWVWebView webview = wVCallBackContext.getWebview();
            if (webview == null) {
                rVar.a("msg", "error: webview is empty!");
                wVCallBackContext.error(rVar);
                return;
            }
            if (Build.VERSION.SDK_INT >= 19) {
                rVar.a("isFolder", Boolean.valueOf(l.d(webview.getContext())));
            } else {
                rVar.a("isFolder", (Object) false);
            }
            wVCallBackContext.success(rVar);
        } catch (Throwable th) {
            TLog.loge(TAG, "isFolderDevice: with exception ", th);
            rVar.a("msg", "error: with exception " + th);
            wVCallBackContext.error(rVar);
        }
    }
}
