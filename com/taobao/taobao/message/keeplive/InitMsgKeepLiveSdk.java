package com.taobao.taobao.message.keeplive;

import android.app.Application;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.AccsException;
import com.taobao.accs.base.MessageFilter;
import com.taobao.accs.common.Constants;
import com.taobao.tao.log.TLog;
import java.io.Serializable;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes.dex */
public class InitMsgKeepLiveSdk implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "InitMsgKeepLiveSdk";

    static {
        kge.a(-533632928);
        kge.a(1028243835);
    }

    public static void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        TLog.loge(TAG, " start init ");
        try {
            ACCSClient.getAccsClient().registerMessageFilter(Constants.IMPAAS, new MessageFilter() { // from class: com.taobao.taobao.message.keeplive.InitMsgKeepLiveSdk.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.accs.base.MessageFilter
                public boolean onReceiveBackgroundMessage(String str, byte[] bArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("51f36771", new Object[]{this, str, bArr})).booleanValue();
                    }
                    if (!new String(bArr).startsWith("LWP /!")) {
                        return false;
                    }
                    TLog.loge(InitMsgKeepLiveSdk.TAG, " onReceiveBackgroundMessage  true ");
                    return true;
                }
            });
        } catch (AccsException e) {
            e.printStackTrace();
            TLog.loge(TAG, "  init error  " + Log.getStackTraceString(e));
        }
        TLog.loge(TAG, " end init ");
    }
}
