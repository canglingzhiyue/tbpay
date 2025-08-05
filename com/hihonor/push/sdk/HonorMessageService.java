package com.hihonor.push.sdk;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.text.TextUtils;
import com.hihonor.push.sdk.common.data.DownMsgType;

/* loaded from: classes4.dex */
public abstract class HonorMessageService extends Service {
    public static final /* synthetic */ int c = 0;

    /* renamed from: a */
    public final a f7258a;
    public final Messenger b;

    /* loaded from: classes4.dex */
    public class a extends Handler {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Looper looper) {
            super(looper);
            HonorMessageService.this = r1;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Bundle data = message.getData();
            if (data != null) {
                Intent intent = new Intent();
                intent.putExtras(data);
                HonorMessageService honorMessageService = HonorMessageService.this;
                int i = HonorMessageService.c;
                honorMessageService.a(intent);
            }
        }
    }

    public HonorMessageService() {
        a aVar = new a(Looper.getMainLooper());
        this.f7258a = aVar;
        this.b = new Messenger(aVar);
    }

    public void a(y yVar) {
        if (!yVar.b()) {
            yVar.d();
            return;
        }
        d dVar = (d) yVar.c();
        if (dVar == null) {
            return;
        }
        String str = "onMessageReceived. msgId is " + dVar.a();
        onMessageReceived(dVar);
    }

    public static /* synthetic */ void lambda$PWh0xAvcDKPZFRS3M1xsZJcJIUM(HonorMessageService honorMessageService, y yVar) {
        honorMessageService.a(yVar);
    }

    public final void a(Intent intent) {
        try {
            if (!TextUtils.equals(intent.getStringExtra("event_type"), DownMsgType.RECEIVE_TOKEN)) {
                b(intent);
                return;
            }
            String stringExtra = intent.getStringExtra("push_token");
            Context a2 = k.e.a();
            i iVar = i.b;
            if (!TextUtils.equals(stringExtra, iVar.a(a2))) {
                iVar.a(a2, stringExtra);
            }
            onNewToken(stringExtra);
        } catch (Exception e) {
            String str = "dispatch message error. " + e.getMessage();
        }
    }

    public final void b(Intent intent) {
        y a2 = e.a(new f(intent));
        an anVar = new an() { // from class: com.hihonor.push.sdk.-$$Lambda$HonorMessageService$PWh0xAvcDKPZFRS3M1xsZJcJIUM
            @Override // com.hihonor.push.sdk.an
            public final void a(y yVar) {
                HonorMessageService.lambda$PWh0xAvcDKPZFRS3M1xsZJcJIUM(HonorMessageService.this, yVar);
            }
        };
        a2.getClass();
        a2.a(new l(ar.c.f7270a, anVar));
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.b.getBinder();
    }

    public void onMessageReceived(d dVar) {
    }

    public void onNewToken(String str) {
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        a(intent);
        return 2;
    }
}
