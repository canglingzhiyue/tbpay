package com.meizu.cloud.pushsdk.handler.e.m;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSettingEx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private Context f7997a;
    private List<Intent> b;
    private BroadcastReceiver c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.meizu.cloud.pushsdk.handler.e.m.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class RunnableC0290a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Intent f7998a;

        RunnableC0290a(Intent intent) {
            this.f7998a = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(1000L);
                DebugLogger.d("BrightNotification", "start bright notification service " + this.f7998a);
                a.this.f7997a.startService(this.f7998a);
            } catch (Exception e) {
                DebugLogger.e("BrightNotification", "send bright notification error " + e.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!"android.intent.action.USER_PRESENT".equalsIgnoreCase(intent.getAction())) {
                return;
            }
            a.this.b();
        }
    }

    public a(Context context) {
        this.f7997a = context.getApplicationContext();
        a();
    }

    private void a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        if (this.c == null) {
            this.c = new b();
        }
        this.f7997a.registerReceiver(this.c, intentFilter);
    }

    private void a(Intent intent) {
        MessageV3 messageV3 = (MessageV3) intent.getParcelableExtra(PushConstants.EXTRA_APP_PUSH_BRIGHT_NOTIFICATION_MESSAGE);
        if (messageV3 == null) {
            return;
        }
        AdvanceSetting advanceSetting = messageV3.getAdvanceSetting();
        AdvanceSettingEx advanceSettingEx = messageV3.getAdvanceSettingEx();
        if (advanceSetting == null || advanceSettingEx == null) {
            return;
        }
        advanceSettingEx.setSoundTitle(null);
        advanceSetting.getNotifyType().setSound(false);
        advanceSetting.getNotifyType().setLights(false);
        advanceSetting.getNotifyType().setVibrate(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        List<Intent> list = this.b;
        if (list == null || list.size() == 0) {
            return;
        }
        int size = this.b.size();
        int i = 0;
        Iterator<Intent> it = this.b.iterator();
        while (it.hasNext()) {
            Intent next = it.next();
            if (i != size - 1) {
                a(next);
            }
            b(next);
            it.remove();
            i++;
        }
    }

    private void b(Intent intent) {
        com.meizu.cloud.pushsdk.d.m.c.a().execute(new RunnableC0290a(intent));
    }

    public void a(Intent intent, String str) {
        if (intent == null || TextUtils.isEmpty(str)) {
            return;
        }
        List<Intent> list = this.b;
        if (list != null) {
            Iterator<Intent> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Intent next = it.next();
                MessageV3 messageV3 = (MessageV3) next.getParcelableExtra(PushConstants.EXTRA_APP_PUSH_BRIGHT_NOTIFICATION_MESSAGE);
                if (messageV3 != null && messageV3.getUploadDataPackageName() != null && str.equalsIgnoreCase(messageV3.getUploadDataPackageName())) {
                    this.b.remove(next);
                    break;
                }
            }
        } else {
            this.b = new ArrayList();
        }
        this.b.add(intent);
        DebugLogger.d("BrightNotification", "add bright notification intent, intent list: " + this.b);
    }
}
