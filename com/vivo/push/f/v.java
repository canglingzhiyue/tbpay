package com.vivo.push.f;

import android.content.Context;
import android.net.NetworkInfo;
import mtopsdk.common.util.StringUtils;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.model.NotifyArriveCallbackByUser;
import com.vivo.push.sdk.PushMessageCallback;
import java.util.HashMap;

/* loaded from: classes9.dex */
final class v implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InsideNotificationItem f24200a;
    final /* synthetic */ com.vivo.push.b.q b;
    final /* synthetic */ u c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(u uVar, InsideNotificationItem insideNotificationItem, com.vivo.push.b.q qVar) {
        this.c = uVar;
        this.f24200a = insideNotificationItem;
        this.b = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        Context context2;
        Context context3;
        Context context4;
        Context context5;
        Context context6;
        char c;
        Context context7;
        Context context8;
        Context context9;
        Context context10;
        PushMessageCallback pushMessageCallback = this.c.b;
        context = this.c.f24241a;
        NotifyArriveCallbackByUser onNotificationMessageArrived = pushMessageCallback.onNotificationMessageArrived(context, com.vivo.push.util.v.a(this.f24200a));
        int a2 = this.c.a(onNotificationMessageArrived);
        if (a2 > 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("messageID", String.valueOf(this.b.f()));
            String a3 = com.vivo.push.restructure.a.a().e().a();
            if (!StringUtils.isEmpty(a3)) {
                hashMap.put("remoteAppId", a3);
            }
            context9 = this.c.f24241a;
            context10 = this.c.f24241a;
            hashMap.put("clientsdkver", String.valueOf(com.vivo.push.util.ag.c(context9, context10.getPackageName())));
            com.vivo.push.util.f.a(a2, hashMap);
            return;
        }
        int b = this.c.b();
        if (b > 0) {
            StringBuilder sb = new StringBuilder("pkg name : ");
            context7 = this.c.f24241a;
            sb.append(context7.getPackageName());
            sb.append(" notify channel switch is ");
            sb.append(b);
            com.vivo.push.util.u.b("OnNotificationArrivedTask", sb.toString());
            context8 = this.c.f24241a;
            com.vivo.push.util.u.b(context8, "允许通知开关或者推送通知渠道开关关闭，导致通知无法展示，请到设置页打开应用通知开关 ".concat(String.valueOf(b)));
            HashMap hashMap2 = new HashMap();
            hashMap2.put("messageID", String.valueOf(this.b.f()));
            String a4 = com.vivo.push.restructure.a.a().e().a();
            if (!StringUtils.isEmpty(a4)) {
                hashMap2.put("remoteAppId", a4);
            }
            com.vivo.push.util.f.a(b, hashMap2);
            return;
        }
        context2 = this.c.f24241a;
        InsideNotificationItem insideNotificationItem = this.f24200a;
        long f = this.b.f();
        PushMessageCallback pushMessageCallback2 = this.c.b;
        context3 = this.c.f24241a;
        com.vivo.push.util.p pVar = new com.vivo.push.util.p(context2, insideNotificationItem, f, pushMessageCallback2.isAllowNet(context3), new w(this), onNotificationMessageArrived);
        boolean isShowBigPicOnMobileNet = this.f24200a.isShowBigPicOnMobileNet();
        String purePicUrl = this.f24200a.getPurePicUrl();
        if (StringUtils.isEmpty(purePicUrl)) {
            purePicUrl = this.f24200a.getCoverUrl();
        }
        if (!StringUtils.isEmpty(purePicUrl)) {
            com.vivo.push.util.u.c("OnNotificationArrivedTask", "showCode=".concat(String.valueOf(isShowBigPicOnMobileNet)));
            if (!isShowBigPicOnMobileNet) {
                context5 = this.c.f24241a;
                com.vivo.push.util.u.a(context5, "mobile net unshow");
                context6 = this.c.f24241a;
                NetworkInfo a5 = com.vivo.push.util.x.a(context6);
                if (a5 != null && a5.getState() == NetworkInfo.State.CONNECTED) {
                    int type = a5.getType();
                    c = type == 1 ? (char) 2 : type == 0 ? (char) 1 : (char) 3;
                } else {
                    c = 0;
                }
                if (c == 1) {
                    purePicUrl = null;
                    this.f24200a.clearCoverUrl();
                    this.f24200a.clearPurePicUrl();
                }
            } else {
                context4 = this.c.f24241a;
                com.vivo.push.util.u.a(context4, "mobile net show");
            }
        }
        pVar.execute(this.f24200a.getIconUrl(), purePicUrl);
    }
}
