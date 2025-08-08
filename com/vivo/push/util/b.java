package com.vivo.push.util;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.model.NotifyArriveCallbackByUser;
import java.security.PublicKey;
import java.util.HashMap;

/* loaded from: classes9.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    protected String f24259a;
    protected long b;
    protected Context c;
    protected NotifyArriveCallbackByUser d;

    public static Intent a(Context context, String str, long j, Intent intent, InsideNotificationItem insideNotificationItem) {
        Intent intent2 = new Intent("com.vivo.pushservice.action.RECEIVE");
        intent2.setPackage(context.getPackageName());
        intent2.setClassName(context.getPackageName(), "com.vivo.push.sdk.service.CommandService");
        intent2.putExtra("command_type", "reflect_receiver");
        intent2.putExtras(intent.getExtras());
        a(intent2, context);
        com.vivo.push.b.p pVar = new com.vivo.push.b.p(str, j, insideNotificationItem);
        pVar.b(intent.getAction());
        if (intent.getComponent() != null) {
            pVar.c(intent.getComponent().getPackageName());
            pVar.d(intent.getComponent().getClassName());
        }
        if (intent.getData() != null) {
            pVar.a(intent.getData());
        }
        pVar.b(intent2);
        return intent2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void a(Intent intent, Context context) {
        try {
            intent.putExtra("security_avoid_pull", a.a(context).a("com.vivo.pushservice"));
            if (Build.VERSION.SDK_INT < 18) {
                return;
            }
            String a2 = com.vivo.push.e.b.a().a(context).a("com.vivo.pushservice");
            PublicKey a3 = com.vivo.push.e.b.a().a(context).a();
            if (StringUtils.isEmpty(a2)) {
                a2 = "com.vivo.pushservice";
            }
            intent.putExtra("security_avoid_pull_rsa", a2);
            intent.putExtra("security_avoid_rsa_public_key", a3 == null ? "com.vivo.pushservice" : ab.a(a3));
        } catch (Exception e) {
            u.a("BaseNotifyClickIntentParam", "pushNotificationBySystem encrypt ：" + e.getMessage());
            intent.putExtra("security_avoid_pull_rsa", "com.vivo.pushservice");
            intent.putExtra("security_avoid_rsa_public_key", "com.vivo.pushservice");
        }
    }

    protected abstract int a();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract PendingIntent a(Context context, Intent intent);

    protected abstract Intent a(Context context, InsideNotificationItem insideNotificationItem, NotifyArriveCallbackByUser notifyArriveCallbackByUser);

    public final Intent a(Context context, String str, long j, InsideNotificationItem insideNotificationItem, NotifyArriveCallbackByUser notifyArriveCallbackByUser) {
        this.b = j;
        this.f24259a = str;
        this.c = context;
        this.d = notifyArriveCallbackByUser;
        Intent a2 = a(context, insideNotificationItem, notifyArriveCallbackByUser);
        int a3 = a();
        if (a3 > 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("messageID", String.valueOf(this.b));
            String a4 = com.vivo.push.restructure.a.a().e().a();
            if (!StringUtils.isEmpty(a4)) {
                hashMap.put("remoteAppId", a4);
            }
            hashMap.put("ap", this.f24259a);
            hashMap.put("clientsdkver", String.valueOf(ag.c(this.c, this.f24259a)));
            f.a(a3, hashMap);
            return null;
        }
        return a2;
    }

    public final long b() {
        return this.b;
    }
}
