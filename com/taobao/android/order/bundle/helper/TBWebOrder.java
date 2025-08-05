package com.taobao.android.order.bundle.helper;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class TBWebOrder extends android.taobao.windvane.jsbridge.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-650910512);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("closeFullWebView".equals(str)) {
            if (this.mContext != null) {
                Intent intent = new Intent();
                intent.setAction("closeFullWebView");
                LocalBroadcastManager.getInstance(this.mContext).sendBroadcast(intent);
                if (wVCallBackContext != null) {
                    wVCallBackContext.success();
                }
                return true;
            }
        } else if ("hideCloseIcon".equals(str) && this.mContext != null) {
            Intent intent2 = new Intent();
            intent2.setAction("hideCloseIcon");
            LocalBroadcastManager.getInstance(this.mContext).sendBroadcast(intent2);
            if (wVCallBackContext != null) {
                wVCallBackContext.success();
            }
            return true;
        }
        if (wVCallBackContext != null) {
            wVCallBackContext.error();
        }
        return false;
    }
}
