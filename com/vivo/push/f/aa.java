package com.vivo.push.f;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.util.Base64;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.vivo.push.model.NotifyArriveCallbackByUser;
import com.vivo.push.sdk.PushMessageCallback;
import com.vivo.push.util.NotifyAdapterUtil;
import java.security.PublicKey;

/* loaded from: classes9.dex */
public abstract class aa extends com.vivo.push.s {
    protected PushMessageCallback b;
    private int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aa(com.vivo.push.v vVar) {
        super(vVar);
        this.c = 0;
    }

    public final int a(NotifyArriveCallbackByUser notifyArriveCallbackByUser) {
        if (notifyArriveCallbackByUser == null) {
            com.vivo.push.util.u.b("OnVerifyCallBackCommand", "pkg name : " + this.f24241a.getPackageName() + " 应用到达回调返回值为空，不做处理");
            com.vivo.push.util.u.b(this.f24241a, "应用到达回调返回值异常，导致通知无法展示，如需打开请在onNotificationMessageArrived中返回正确的对象");
            return 2163;
        } else if (!notifyArriveCallbackByUser.isIntercept()) {
            return 0;
        } else {
            com.vivo.push.util.u.b("OnVerifyCallBackCommand", "pkg name : " + this.f24241a.getPackageName() + " 应用主动拦截通知");
            com.vivo.push.util.u.b(this.f24241a, "应用主动拦截通知，导致通知无法展示，如需打开请在onNotificationMessageArrived中返回false");
            return 2120;
        }
    }

    public final void a(int i) {
        this.c = i;
    }

    public final void a(PushMessageCallback pushMessageCallback) {
        this.b = pushMessageCallback;
    }

    public final boolean a(PublicKey publicKey, String str, String str2) {
        String str3;
        if (!com.vivo.push.m.a().d()) {
            com.vivo.push.util.u.d("OnVerifyCallBackCommand", "vertify is not support , vertify is ignore");
            return true;
        }
        if (publicKey == null) {
            str3 = "vertify key is null";
        } else if (StringUtils.isEmpty(str)) {
            str3 = "contentTag is null";
        } else if (!StringUtils.isEmpty(str2)) {
            try {
                com.vivo.push.util.u.d("OnVerifyCallBackCommand", str.hashCode() + " = " + str2);
                if (com.vivo.push.util.ab.a(str.getBytes("UTF-8"), publicKey, Base64.decode(str2, 2))) {
                    com.vivo.push.util.u.d("OnVerifyCallBackCommand", "vertify id is success");
                    return true;
                }
                com.vivo.push.util.u.d("OnVerifyCallBackCommand", "vertify fail srcDigest is ".concat(String.valueOf(str)));
                com.vivo.push.util.u.c(this.f24241a, "vertify fail srcDigest is ".concat(String.valueOf(str)));
                return false;
            } catch (Exception e) {
                e.printStackTrace();
                str3 = "vertify exception";
            }
        } else {
            str3 = "vertify id is null";
        }
        com.vivo.push.util.u.d("OnVerifyCallBackCommand", str3);
        return false;
    }

    public final int b() {
        if (Build.VERSION.SDK_INT >= 24) {
            NotificationManager notificationManager = (NotificationManager) this.f24241a.getSystemService(RemoteMessageConst.NOTIFICATION);
            if (notificationManager != null && !notificationManager.areNotificationsEnabled()) {
                return 2104;
            }
            if (Build.VERSION.SDK_INT < 26 || notificationManager == null) {
                return 0;
            }
            try {
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel(NotifyAdapterUtil.PRIMARY_CHANNEL);
                if (notificationChannel == null) {
                    return 0;
                }
                return notificationChannel.getImportance() == 0 ? 2121 : 0;
            } catch (Exception unused) {
                com.vivo.push.util.u.b("OnVerifyCallBackCommand", "判断通知通道出现系统错误");
                return 0;
            }
        }
        return 0;
    }

    public final int c() {
        return this.c;
    }
}
