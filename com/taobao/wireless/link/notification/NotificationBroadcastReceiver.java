package com.taobao.wireless.link.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.uikit.util.ActivityJumpUtil;
import com.taobao.wireless.link.model.MessageData;
import tb.kge;
import tb.rkg;
import tb.rki;
import tb.rkj;

/* loaded from: classes9.dex */
public class NotificationBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-89484328);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        rkg.a("link_tag", "NotificationBroadcastReceiver === onReceive " + intent);
        if (rkj.a(3000L)) {
            rkg.a("link_tag", "NotificationBroadcastReceiver === onReceive 时间间隔小于3s，不处理");
        } else if (intent == null) {
        } else {
            rkj.e(context);
            try {
                String action = intent.getAction();
                String stringExtra = intent.getStringExtra(ActivityJumpUtil.LANDING_URL);
                MessageData b = b.b(context);
                if (StringUtils.equals(action, "com.taobao.taobao.notification_left")) {
                    b.a(context, stringExtra, rki.ARG1_NOTIFICATION_A_CLICK, "tbopen://m.taobao.com/tbopen/index.html?source=auto&action=ali.open.nav&module=h5&bc_fl_src=noti_hc&h5Url=" + stringExtra, "noti_hc", b.message_id);
                } else if (StringUtils.equals(action, "com.taobao.taobao.notification_right")) {
                    b.a(context, stringExtra, rki.ARG1_NOTIFICATION_B_CLICK, "tbopen://m.taobao.com/tbopen/index.html?source=auto&action=ali.open.nav&module=h5&bc_fl_src=noti_hd&h5Url=" + stringExtra, "noti_hd", b.message_id);
                } else if (!StringUtils.equals(action, "com.taobao.taobao.notification_set")) {
                } else {
                    b.a(context, stringExtra, rki.ARG1_NOTIFICATION_DELETE_CLICK, "tbopen://m.taobao.com/tbopen/index.html?source=auto&action=ali.open.nav&module=h5&bc_fl_src=noti_set&h5Url=" + stringExtra, "noti_set", b.message_id);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
