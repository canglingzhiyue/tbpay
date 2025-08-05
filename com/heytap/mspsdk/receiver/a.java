package com.heytap.mspsdk.receiver;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import tb.cwe;
import tb.cwg;
import tb.cwn;
import tb.kge;

/* loaded from: classes4.dex */
public class a extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public Handler f7255a;

    /* renamed from: com.heytap.mspsdk.receiver.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class HandlerC0263a extends Handler {
        static {
            kge.a(2088329795);
        }

        public HandlerC0263a(a aVar, Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            cwg a2 = cwg.a();
            Intent intent = (Intent) message.obj;
            if (a2 != null) {
                Activity a3 = cwe.a.f26564a.a();
                if (a3 != null) {
                    a3.startActivity(intent);
                    return;
                }
                cwn.a("SdkRunTime", "app is not foregroud");
                intent.addFlags(268435456);
                if (cwg.a.f26566a == null) {
                    throw null;
                }
                cwg.f26565a.startActivity(intent);
                return;
            }
            throw null;
        }
    }

    static {
        kge.a(136251142);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        cwn.a("CommunicationReceiver", "onReceive  action : " + action);
        if (this.f7255a == null) {
            this.f7255a = new HandlerC0263a(this, Looper.getMainLooper());
        }
        if ("com.heytap.mspsdk.start_intent".equals(action)) {
            Intent intent2 = (Intent) intent.getExtras().getParcelable("to_start_intent");
            if (intent2 != null) {
                this.f7255a.sendMessageDelayed(this.f7255a.obtainMessage(0, intent2), 300L);
            } else if (cwn.b()) {
                throw new RuntimeException("to start intent is null!");
            }
        }
    }
}
