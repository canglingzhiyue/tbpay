package com.taobao.android.themis.graphics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class TMSTracing$1 extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        String action = intent.getAction();
        String str = "[Timeline] android broadcast receiver got: " + action;
        if ("com.taobao.android.themis.graphics.tracing.start".equals(action) || "com.taobao.android.themis.graphics.tracing.stop".equals(action)) {
            return;
        }
        Log.e("themis:tracing", "[Timeline] invalid option: " + action);
    }
}
