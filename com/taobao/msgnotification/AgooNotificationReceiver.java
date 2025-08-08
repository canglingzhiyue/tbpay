package com.taobao.msgnotification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.taobao.util.k;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.agoo.TaobaoConstants;
import com.taobao.message.annotation.aspectjx.MethodSpy;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.TaobaoIntentService;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.intent.IntentUtil;
import tb.kge;
import tb.mtb;

/* loaded from: classes7.dex */
public class AgooNotificationReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(824520374);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        String action = intent.getAction();
        if (StringUtils.isEmpty(action)) {
            return;
        }
        String agooCommand = IntentUtil.getAgooCommand(context);
        TLog.loge("AgooNotificationReceiver", "onReceive:" + agooCommand);
        if (!StringUtils.equals(action, agooCommand)) {
            return;
        }
        try {
            a(context, intent);
        } catch (Throwable th) {
            k.a("AgooNotificationReceiver", "AgooNotificationReceiver onUserCommand is error,e=" + th.toString());
            TLog.loge("AgooNotificationReceiver", Log.getStackTraceString(th));
        }
    }

    @MethodSpy(name = "clickNotification")
    public static void a(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c9cc1d", new Object[]{context, intent});
            return;
        }
        String stringExtra = intent.getStringExtra("command");
        h hVar = new h(context);
        if (StringUtils.equals(stringExtra, AgooConstants.AGOO_COMMAND_MESSAGE_READED) || StringUtils.equals(stringExtra, AgooConstants.AGOO_COMMAND_MESSAGE_DELETED)) {
            hVar.a(intent);
            if (!StringUtils.equals(stringExtra, AgooConstants.AGOO_COMMAND_MESSAGE_READED)) {
                return;
            }
            String stringExtra2 = intent.getStringExtra("id");
            String stringExtra3 = intent.getStringExtra("notifyContentTargetUrl");
            if (StringUtils.isEmpty(stringExtra3)) {
                stringExtra3 = intent.getStringExtra(TaobaoConstants.MESSAGE_URL);
            }
            TLog.loge("AgooNotificationReceiver", " targetUrl " + stringExtra3);
            if (StringUtils.isEmpty(stringExtra3)) {
                stringExtra3 = "http://tb.cn/n/ww/p";
            }
            Bundle bundleExtra = intent.getBundleExtra("notifyContentParamBundleKey");
            if (bundleExtra == null) {
                bundleExtra = new Bundle();
            }
            bundleExtra.putString("notifyContentIntentBody", intent.getStringExtra(AgooConstants.MESSAGE_BODY));
            if (stringExtra2 != null) {
                bundleExtra.putString("AliAgooMsgID", stringExtra2);
            }
            TLog.loge("AgooNotificationReceiver", " agooId " + stringExtra2);
            if (StringUtils.isEmpty(stringExtra2)) {
                TLog.loge("AgooNotificationReceiver", " COMMAND_SOUND_PROCESS ");
            }
            mtb.a(context, stringExtra3, bundleExtra);
        } else if (!StringUtils.equals(stringExtra, "commandSoundProcess")) {
        } else {
            TaobaoIntentService.a((Intent) intent.getParcelableExtra("intentKey"), context, true);
        }
    }
}
