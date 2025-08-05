package com.taobao.android.opencart.broadcast;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public class TBCartWVService extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_ADD_CART_NOTIFY = "addCartNotify";
    private static final String CART_JSBRIDGE_NAME = "TBCartWVService";
    private static final String KEY_ADD_CART_NOTIFY_PARAMS = "params";
    private static AtomicBoolean sRegisterAtomicBoolean = new AtomicBoolean();

    public static void registerPlugin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39467d3d", new Object[0]);
        } else if (sRegisterAtomicBoolean.getAndSet(true)) {
        } else {
            q.a(CART_JSBRIDGE_NAME, (Class<? extends e>) TBCartWVService.class, true);
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!ACTION_ADD_CART_NOTIFY.equals(str) || this.mContext == null) {
            return false;
        }
        Intent intent = new Intent();
        intent.setAction("cartRefreshData");
        intent.putExtra("params", str2);
        intent.putExtra("cartWVAddCartNotify", true);
        LocalBroadcastManager.getInstance(this.mContext).sendBroadcast(intent);
        if (wVCallBackContext != null) {
            wVCallBackContext.success();
        }
        return true;
    }
}
