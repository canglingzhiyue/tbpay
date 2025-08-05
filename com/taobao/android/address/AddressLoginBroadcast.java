package com.taobao.android.address;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.tlog.adapter.AdapterForTLog;
import tb.efe;

/* loaded from: classes4.dex */
public class AddressLoginBroadcast extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (!TextUtils.equals(intent.getAction(), LoginAction.NOTIFY_LOGIN_SUCCESS.name())) {
        } else {
            AdapterForTLog.loge(f.TAG, "login suc, address prefetch");
            efe.c();
            context.unregisterReceiver(this);
        }
    }
}
