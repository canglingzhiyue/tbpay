package com.taobao.android.icart.utils;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.broadcast.CartWVBroadcast;
import com.taobao.android.ultron.common.utils.UnifyLog;
import tb.kge;
import tb.tpg;

/* loaded from: classes5.dex */
public class ICartWVService extends android.taobao.windvane.jsbridge.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String JS_BRIDGE_NAME = "ICartWVService";

    static {
        kge.a(-783584412);
    }

    public static void register(com.taobao.android.icart.engine.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fd85aca", new Object[]{aVar});
        } else {
            tpg.a(aVar);
        }
    }

    public static void unregister(com.taobao.android.icart.engine.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("decd4b11", new Object[]{aVar});
        } else {
            tpg.b(aVar);
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        UnifyLog.c(JS_BRIDGE_NAME, "action=" + str + ",params=" + str2);
        if (tpg.a(str, str2, wVCallBackContext)) {
            return true;
        }
        Intent intent = new Intent(CartWVBroadcast.ACTION_ICART_WV_SERVICE);
        intent.putExtra(CartWVBroadcast.KEY_ICART_WV_SERVICE_ACTION, str);
        intent.putExtra(CartWVBroadcast.KEY_ICART_WV_SERVICE_PARAMS, str2);
        LocalBroadcastManager.getInstance(this.mContext).sendBroadcast(intent);
        if (wVCallBackContext != null) {
            wVCallBackContext.success();
        }
        return true;
    }
}
