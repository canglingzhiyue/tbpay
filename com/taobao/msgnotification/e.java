package com.taobao.msgnotification;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.notification.banner.InnerNotificationAdapter;
import com.taobao.message.notification.banner.InnerPushNotification;
import com.taobao.message.notification.banner.InnerPushVO;
import com.taobao.message.notification.banner.support.ChatInnerNotificationAdapter;
import com.taobao.message.notification.banner.support.MarketingInnerNotificationAdapter;
import com.taobao.msgnotification.mode.MsgNotficationDTO;
import com.taobao.tao.log.TLog;
import tb.kge;
import tb.msy;

/* loaded from: classes7.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-209263579);
    }

    public static InnerPushNotification a(Intent intent, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InnerPushNotification) ipChange.ipc$dispatch("b49cd221", new Object[]{intent, context});
        }
        if (intent == null) {
            TLog.logi("AgooInnerNotificationFactory", "showPersonalMsg intent==null");
            return null;
        }
        MsgNotficationDTO a2 = msy.a(intent);
        Bundle b = msy.b(intent);
        InnerPushVO innerPushVO = new InnerPushVO();
        innerPushVO.mParam = b;
        innerPushVO.iconUrl = a2.personalImgUrl;
        innerPushVO.title = a2.title;
        innerPushVO.content = a2.text;
        innerPushVO.img = a2.extraImgUrl;
        innerPushVO.time = System.currentTimeMillis();
        InnerNotificationAdapter chatInnerNotificationAdapter = a2.bizType >= 0 ? (a2.bizType <= 10000 || a2.bizType >= 20000) ? null : new ChatInnerNotificationAdapter(context, innerPushVO) : new MarketingInnerNotificationAdapter(context, innerPushVO);
        if (chatInnerNotificationAdapter != null) {
            return InnerPushNotification.obtain(chatInnerNotificationAdapter);
        }
        return null;
    }
}
