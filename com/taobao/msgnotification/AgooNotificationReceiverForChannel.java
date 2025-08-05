package com.taobao.msgnotification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.notification.util.EnvUtil;
import com.taobao.tao.log.TLog;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.intent.IntentUtil;
import tb.kge;

/* loaded from: classes7.dex */
public class AgooNotificationReceiverForChannel extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1595546800);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (!"com.taobao.taobao.intent.action.COMMAND.channel".equals(intent.getAction()) || !TextUtils.equals(intent.getStringExtra("command"), AgooConstants.AGOO_COMMAND_MESSAGE_DELETED)) {
        } else {
            if (EnvUtil.isProcessRight(context)) {
                TLog.loge("AgooNotificationReceiverForChannel", "转发到主进程处理事件");
                Intent createComandIntent = IntentUtil.createComandIntent(context, AgooConstants.AGOO_COMMAND_MESSAGE_DELETED);
                createComandIntent.setPackage("com.taobao.taobao");
                if (intent.getExtras() != null) {
                    createComandIntent.putExtras(intent);
                }
                context.sendBroadcast(createComandIntent);
                return;
            }
            TLog.loge("AgooNotificationReceiverForChannel", "handle message delete");
            try {
                new h(context).b(intent);
            } catch (Throwable th) {
                TLog.loge("AgooNotificationReceiverForChannel", "error:" + th.toString());
            }
        }
    }
}
