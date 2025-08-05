package com.taobao.accs.init;

import android.app.Application;
import com.alipay.mobile.common.transportext.amnet.Baggage;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.AccsException;
import com.taobao.accs.utl.ALog;
import com.taobao.agoo.ICallback;
import com.taobao.agoo.TaobaoRegister;
import java.io.Serializable;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes.dex */
public class Launcher_Logout implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7022ea09", new Object[0]) : TAG;
    }

    static {
        kge.a(471690004);
        kge.a(1028243835);
        TAG = Launcher_Logout.class.getSimpleName();
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        ALog.i("Launcher_Logout", Baggage.Amnet.USER_O, new Object[0]);
        Launcher_InitAccs.mUserId = null;
        Launcher_InitAccs.mSid = null;
        try {
            ACCSClient.getAccsClient().unbindUser();
            TaobaoRegister.removeAlias(application, new ICallback() { // from class: com.taobao.accs.init.Launcher_Logout.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.agoo.ICallback
                public void onSuccess() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                    } else if (!ALog.isPrintLog(ALog.Level.D)) {
                    } else {
                        ALog.d(Launcher_Logout.access$000(), "removeAlias success", new Object[0]);
                    }
                }

                @Override // com.taobao.agoo.ICallback
                public void onFailure(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
                    } else if (!ALog.isPrintLog(ALog.Level.D)) {
                    } else {
                        String access$000 = Launcher_Logout.access$000();
                        ALog.d(access$000, "removeAlias fail, errDesc:" + str2 + " errorCode:" + str, new Object[0]);
                    }
                }
            });
        } catch (AccsException e) {
            ALog.e(TAG, e.getMessage(), new Object[0]);
        }
    }
}
