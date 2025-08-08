package com.meizu.cloud.pushsdk.notification.e;

import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.handler.MessageV4;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import com.meizu.cloud.pushsdk.notification.g.e;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import java.io.File;

/* loaded from: classes4.dex */
public class d extends c {

    /* loaded from: classes4.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f8001a;

        a(String str) {
            this.f8001a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            File[] b;
            for (File file : com.meizu.cloud.pushsdk.notification.g.a.b(this.f8001a, String.valueOf(System.currentTimeMillis() - 86400000))) {
                com.meizu.cloud.pushsdk.notification.g.a.a(file.getPath());
                DebugLogger.i("AbstractPushNotification", "Delete file directory " + file.getName() + "\n");
            }
        }
    }

    public d(Context context, PushNotificationBuilder pushNotificationBuilder) {
        super(context, pushNotificationBuilder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.meizu.cloud.pushsdk.notification.a
    public void a(Notification notification, MessageV3 messageV3) {
        super.a(notification, messageV3);
        MessageV4 parse = MessageV4.parse(messageV3);
        if (parse.getActVideoSetting() == null) {
            DebugLogger.e("AbstractPushNotification", "only wifi can download act");
        } else if (parse.getActVideoSetting().isWifiDisplay() && !com.meizu.cloud.pushsdk.util.a.b(this.f8000a)) {
            DebugLogger.e("AbstractPushNotification", "only wifi can download act");
        } else {
            String str = MzSystemUtils.getDocumentsPath(this.f8000a) + "/pushSdkAct/" + messageV3.getUploadDataPackageName();
            String valueOf = String.valueOf(System.currentTimeMillis());
            String actUrl = parse.getActVideoSetting().getActUrl();
            if (!StringUtils.isEmpty(actUrl) && com.meizu.cloud.pushsdk.e.a.a(actUrl, str, valueOf).a().b().c()) {
                DebugLogger.i("AbstractPushNotification", "down load " + actUrl + " success");
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                String str2 = File.separator;
                sb.append(str2);
                sb.append("ACT-");
                sb.append(valueOf);
                String sb2 = sb.toString();
                boolean b = new e(str + str2 + valueOf, sb2).b();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("zip file ");
                sb3.append(b);
                DebugLogger.i("AbstractPushNotification", sb3.toString());
                if (b) {
                    Bundle bundle = new Bundle();
                    bundle.putString("path", sb2);
                    Bundle bundle2 = new Bundle();
                    bundle2.putBundle(com.taobao.android.weex_framework.util.a.ATOM_EXT_big, bundle);
                    if (MinSdkChecker.isSupportVideoNotification()) {
                        notification.extras.putBundle("flyme.active", bundle2);
                    }
                }
            }
            com.meizu.cloud.pushsdk.f.c.h.b.a(new a(str));
        }
    }

    @Override // com.meizu.cloud.pushsdk.notification.a
    protected void c(Notification.Builder builder, MessageV3 messageV3) {
        if (MinSdkChecker.isSupportNotificationBuild()) {
            Notification.BigTextStyle bigTextStyle = new Notification.BigTextStyle();
            bigTextStyle.setBigContentTitle(messageV3.getTitle());
            bigTextStyle.bigText(messageV3.getNotificationStyle().getExpandableText());
            builder.setStyle(bigTextStyle);
        }
    }
}
