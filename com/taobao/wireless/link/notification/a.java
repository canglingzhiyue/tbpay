package com.taobao.wireless.link.notification;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.link.model.MessageData;
import tb.kge;
import tb.rkg;
import tb.rki;
import tb.rkk;

/* loaded from: classes9.dex */
public class a extends com.taobao.wireless.link.controller.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: com.taobao.wireless.link.notification.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static class C1020a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static a f23604a;

        static {
            kge.a(1239973270);
            f23604a = new a();
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("38b02e65", new Object[0]) : f23604a;
        }
    }

    static {
        kge.a(-224347453);
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("38b02e65", new Object[0]) : C1020a.a();
    }

    private a() {
    }

    @Override // com.taobao.wireless.link.controller.b
    public void a(Context context, MessageData messageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b28b6b9b", new Object[]{this, context, messageData});
        } else if (!b.g(context)) {
            rkg.a("link_tag", "NotificationClient === execute == 机型和系统版本，不支持通知栏");
            rki.a(rki.ARG1_NOTIFICATION_NOT_IN_WHITELIST, "", "", null);
        } else {
            rkk a2 = rkk.a(context);
            if (StringUtils.equals(com.taobao.wireless.link.controller.a.a().f23587a.noti_type, "other")) {
                com.taobao.wireless.link.controller.a.a().j = (String) a2.b("isShowNotifi", "false");
                com.taobao.wireless.link.controller.a.a().k = (String) a2.b("isShowNotifiSwitch", "false");
            } else {
                com.taobao.wireless.link.controller.a.a().j = com.taobao.wireless.link.controller.a.a().f23587a.noti_type;
                com.taobao.wireless.link.controller.a.a().k = com.taobao.wireless.link.controller.a.a().f23587a.noti_type;
                a2.a("isShowNotifi", com.taobao.wireless.link.controller.a.a().j);
                a2.a("isShowNotifiSwitch", com.taobao.wireless.link.controller.a.a().k);
            }
            if (b.b(0)) {
                if (b.f23605a != null) {
                    b.f(context);
                    b.e(context);
                    return;
                }
                rkg.a("link_tag", "MessageServiceReceiver === handleMessage == 通知开关打开，绘制通知");
                b.a(context);
                return;
            }
            rkg.a("link_tag", "MessageServiceReceiver === handleMessage == 通知开关关闭，绘制通知");
            b.d(context);
        }
    }
}
