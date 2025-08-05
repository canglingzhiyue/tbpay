package com.taobao.taobao.wxapi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

/* loaded from: classes8.dex */
public class WXAppRegister extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else {
            WXAPIFactory.createWXAPI(context, null, false).registerApp(a.a());
        }
    }
}
