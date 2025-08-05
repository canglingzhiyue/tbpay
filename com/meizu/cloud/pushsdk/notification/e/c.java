package com.meizu.cloud.pushsdk.notification.e;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import com.meizu.cloud.pushsdk.notification.model.AppIconSetting;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;

/* loaded from: classes4.dex */
public class c extends com.meizu.cloud.pushsdk.notification.a {
    public c(Context context, PushNotificationBuilder pushNotificationBuilder) {
        super(context, pushNotificationBuilder);
    }

    @Override // com.meizu.cloud.pushsdk.notification.a
    protected void b(Notification.Builder builder, MessageV3 messageV3) {
        AppIconSetting appIconSetting;
        Bitmap a2;
        String str;
        if ((!MzSystemUtils.isInternational() || MzSystemUtils.isMeizuAndFlyme()) && (appIconSetting = messageV3.getAppIconSetting()) != null) {
            if (!appIconSetting.isDefaultLargeIcon()) {
                if (Thread.currentThread() == this.f8000a.getMainLooper().getThread()) {
                    return;
                }
                Bitmap a3 = a(appIconSetting.getLargeIconUrl());
                if (a3 == null) {
                    builder.setLargeIcon(a(this.f8000a, messageV3.getUploadDataPackageName()));
                    return;
                }
                DebugLogger.i("AbstractPushNotification", "On other Thread down load largeIcon image success");
                builder.setLargeIcon(a3);
                return;
            }
            PushNotificationBuilder pushNotificationBuilder = this.b;
            if (pushNotificationBuilder == null || pushNotificationBuilder.getLargeIcon() == 0) {
                PushNotificationBuilder pushNotificationBuilder2 = this.b;
                if (pushNotificationBuilder2 == null || pushNotificationBuilder2.getAppLargeIcon() == null) {
                    a2 = a(this.f8000a, messageV3.getUploadDataPackageName());
                    str = "set largeIcon by package default large icon";
                } else {
                    a2 = this.b.getAppLargeIcon();
                    str = "set largeIcon by bitmap provided by user setting";
                }
            } else {
                a2 = BitmapFactory.decodeResource(this.f8000a.getResources(), this.b.getLargeIcon());
                str = "set largeIcon by resource id";
            }
            DebugLogger.i("AbstractPushNotification", str);
            builder.setLargeIcon(a2);
        }
    }
}
