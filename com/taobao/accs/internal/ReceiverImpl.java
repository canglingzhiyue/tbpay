package com.taobao.accs.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Process;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.base.IBaseReceiver;
import com.taobao.accs.client.a;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.c;
import tb.dcd;
import tb.kge;

/* loaded from: classes.dex */
public class ReceiverImpl implements IBaseReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ReceiverImpl";

    static {
        kge.a(581162263);
        kge.a(-67420779);
    }

    @Override // com.taobao.accs.base.IBaseReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        ALog.d(TAG, "ReceiverImpl onReceive begin......", new Object[0]);
        if (intent == null || StringUtils.isEmpty(intent.getAction())) {
            intent = new Intent();
        }
        try {
            if (UtilityImpl.getServiceEnabled(context)) {
                intent.setClassName(context.getPackageName(), c.channelService);
                dcd.a(context.getApplicationContext(), intent);
            } else {
                Process.killProcess(Process.myPid());
            }
            if (!UtilityImpl.getAgooServiceEnabled(context)) {
                return;
            }
            intent.setClassName(context, a.a(context.getPackageName()));
            dcd.a(context.getApplicationContext(), intent);
        } catch (Throwable th) {
            ALog.e(TAG, "ReceiverImpl onReceive,exception,e=" + th.getMessage(), new Object[0]);
        }
    }
}
