package com.meizu.cloud.pushsdk.notification.f;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;

/* loaded from: classes4.dex */
public class b extends c {
    public b(Context context, PushNotificationBuilder pushNotificationBuilder) {
        super(context, pushNotificationBuilder);
    }

    @Override // com.meizu.cloud.pushsdk.notification.a
    protected void a(Notification notification, MessageV3 messageV3, PendingIntent pendingIntent) {
        if (MinSdkChecker.isSupportNotificationBuild()) {
            RemoteViews remoteViews = new RemoteViews(this.f8000a.getPackageName(), com.meizu.cloud.pushsdk.notification.g.c.h(this.f8000a));
            remoteViews.setTextViewText(com.meizu.cloud.pushsdk.notification.g.c.f(this.f8000a), messageV3.getTitle());
            remoteViews.setLong(com.meizu.cloud.pushsdk.notification.g.c.d(this.f8000a), com.taobao.android.weex_framework.util.a.ATOM_EXT_setTime, System.currentTimeMillis());
            a(remoteViews, messageV3);
            if (messageV3.getNotificationStyle() != null && !TextUtils.isEmpty(messageV3.getNotificationStyle().getExpandableText())) {
                remoteViews.setViewVisibility(com.meizu.cloud.pushsdk.notification.g.c.a(this.f8000a), 0);
                remoteViews.setTextViewText(com.meizu.cloud.pushsdk.notification.g.c.a(this.f8000a), messageV3.getNotificationStyle().getExpandableText());
            }
            notification.bigContentView = remoteViews;
        }
    }
}
