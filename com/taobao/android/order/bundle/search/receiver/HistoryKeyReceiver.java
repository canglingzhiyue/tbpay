package com.taobao.android.order.bundle.search.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class HistoryKeyReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Handler f14570a;

    static {
        kge.a(809011340);
    }

    public HistoryKeyReceiver(Handler handler) {
        this.f14570a = handler;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (this.f14570a == null || intent == null || !intent.getBooleanExtra(a.f14571a, false)) {
        } else {
            Message message = new Message();
            message.what = 2;
            this.f14570a.sendMessage(message);
        }
    }
}
