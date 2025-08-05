package org.android.agoo.honor;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.hihonor.push.sdk.HonorMessageService;
import com.hihonor.push.sdk.d;
import com.taobao.accs.utl.ALog;
import org.android.agoo.control.AgooFactory;
import org.android.agoo.control.NotifManager;

/* loaded from: classes.dex */
public class HonorPushMessageService extends HonorMessageService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HonorPushMessageService";
    private AgooFactory agooFactory;

    @Override // com.hihonor.push.sdk.HonorMessageService
    public void onMessageReceived(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0368471", new Object[]{this, dVar});
            return;
        }
        try {
            String b = dVar.b();
            ALog.i(TAG, "onMessageReceived", "content", b);
            if (this.agooFactory == null) {
                this.agooFactory = new AgooFactory();
                this.agooFactory.init(this, null, null);
            }
            this.agooFactory.msgRecevie(b.getBytes(), "honor", null);
        } catch (Throwable th) {
            ALog.e(TAG, "onMessageReceived err", th, new Object[0]);
        }
    }

    @Override // com.hihonor.push.sdk.HonorMessageService
    public void onNewToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c0ac7c9", new Object[]{this, str});
            return;
        }
        try {
            ALog.e(TAG, "honor.onNewToken", "token", str);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            NotifManager notifManager = new NotifManager();
            notifManager.init(getApplicationContext());
            notifManager.reportThirdPushToken(str, HonorRegister.HONOR_TOKEN);
        } catch (Throwable th) {
            ALog.e(TAG, "onToken", th, new Object[0]);
        }
    }
}
