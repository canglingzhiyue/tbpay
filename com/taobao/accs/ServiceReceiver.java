package com.taobao.accs;

import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.base.BaseReceiver;
import com.taobao.accs.common.Constants;
import com.taobao.accs.connection.d;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.m;
import tb.kge;

/* loaded from: classes.dex */
public class ServiceReceiver extends BaseReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(976417370);
    }

    public static /* synthetic */ Object ipc$super(ServiceReceiver serviceReceiver, String str, Object... objArr) {
        if (str.hashCode() == 1006950490) {
            super.onReceive((Context) objArr[0], (Intent) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.accs.base.BaseReceiver, android.content.BroadcastReceiver
    public void onReceive(final Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        super.onReceive(context, intent);
        String action = intent == null ? "" : intent.getAction();
        ALog.e("ServiceReceiver", "onReceive: " + action, new Object[0]);
        if (StringUtils.isEmpty(action) || !Constants.ACTION_COMMAND.equals(action) || !m.k()) {
            return;
        }
        com.taobao.accs.common.a.a(new Runnable() { // from class: com.taobao.accs.ServiceReceiver.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    d.getConnection(context, "default", true, 0).a(true, false);
                } catch (Throwable th) {
                    ALog.e("ServiceReceiver", "accsPing err", th, new Object[0]);
                }
            }
        });
    }
}
