package com.taobao.login4android.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.ali.user.mobile.login.model.LoginConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.scan.QrScanActivity;
import tb.kge;

/* loaded from: classes7.dex */
public class QrScanReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-678796465);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (context == null || intent == null) {
        } else {
            try {
                String stringExtra = intent.getStringExtra("url");
                Intent intent2 = new Intent(context, QrScanActivity.class);
                intent2.addFlags(268435456);
                intent2.putExtra(LoginConstant.SCAN_KEY, stringExtra);
                context.startActivity(intent2);
            } catch (Throwable unused) {
            }
        }
    }
}
