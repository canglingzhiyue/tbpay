package com.meizu.cloud.pushsdk.notification;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import mtopsdk.common.util.StringUtils;
import android.widget.RemoteViews;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.notification.model.styleenum.InnerStyleLayout;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;

/* loaded from: classes4.dex */
public class b extends com.meizu.cloud.pushsdk.notification.f.c {
    public b(Context context, PushNotificationBuilder pushNotificationBuilder) {
        super(context, pushNotificationBuilder);
    }

    @Override // com.meizu.cloud.pushsdk.notification.a
    protected void a(Notification notification, MessageV3 messageV3, PendingIntent pendingIntent) {
        if (MinSdkChecker.isSupportNotificationBuild()) {
            Bitmap a2 = a(messageV3.getNotificationStyle().getBannerImageUrl());
            if (a() || a2 == null) {
                return;
            }
            RemoteViews remoteViews = new RemoteViews(this.f8000a.getPackageName(), com.meizu.cloud.pushsdk.notification.g.c.l(this.f8000a));
            remoteViews.setImageViewBitmap(com.meizu.cloud.pushsdk.notification.g.c.i(this.f8000a), a2);
            remoteViews.setViewVisibility(com.meizu.cloud.pushsdk.notification.g.c.j(this.f8000a), 8);
            remoteViews.setViewVisibility(com.meizu.cloud.pushsdk.notification.g.c.i(this.f8000a), 0);
            notification.contentView = remoteViews;
            if (messageV3.getNotificationStyle().getInnerStyle() != InnerStyleLayout.EXPANDABLE_PIC.getCode()) {
                return;
            }
            Bitmap a3 = a(messageV3.getNotificationStyle().getExpandableImageUrl());
            if (a() || a3 == null) {
                return;
            }
            RemoteViews remoteViews2 = new RemoteViews(this.f8000a.getPackageName(), com.meizu.cloud.pushsdk.notification.g.c.l(this.f8000a));
            remoteViews2.setImageViewBitmap(com.meizu.cloud.pushsdk.notification.g.c.j(this.f8000a), a3);
            remoteViews2.setViewVisibility(com.meizu.cloud.pushsdk.notification.g.c.j(this.f8000a), 0);
            remoteViews2.setViewVisibility(com.meizu.cloud.pushsdk.notification.g.c.i(this.f8000a), 8);
            notification.bigContentView = remoteViews2;
            if (messageV3.getAdvertisementOption() == null || StringUtils.isEmpty(messageV3.getAdvertisementOption().getAdInstallPackage())) {
                return;
            }
            remoteViews2.setViewVisibility(com.meizu.cloud.pushsdk.notification.g.c.k(this.f8000a), 0);
            remoteViews2.setOnClickPendingIntent(com.meizu.cloud.pushsdk.notification.g.c.k(this.f8000a), pendingIntent);
        }
    }
}
