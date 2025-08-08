package org.android.agoo.vivo;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import com.vivo.push.sdk.BasePushMessageReceiver;
import com.vivo.push.sdk.OpenClientPushMessageReceiver;
import org.android.agoo.control.NotifManager;

/* loaded from: classes.dex */
public class PushMessageReceiverImpl extends OpenClientPushMessageReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String VIVO_TOKEN = "VIVO_TOKEN";

    @Override // com.vivo.push.sdk.OpenClientPushMessageReceiver, com.vivo.push.sdk.PushMessageCallback
    public void onReceiveRegId(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("975a4620", new Object[]{this, context, str});
        } else if (StringUtils.isEmpty(str) || context == null) {
        } else {
            ALog.d(BasePushMessageReceiver.TAG, "onReceiveRegId", "token", str);
            NotifManager notifManager = new NotifManager();
            notifManager.init(context.getApplicationContext());
            notifManager.reportThirdPushToken(str, VIVO_TOKEN, "1.1.5", true);
        }
    }
}
