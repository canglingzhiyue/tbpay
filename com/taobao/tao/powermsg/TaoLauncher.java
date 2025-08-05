package com.taobao.tao.powermsg;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes8.dex */
public class TaoLauncher implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TaoLauncher";

    static {
        kge.a(329221519);
        kge.a(1028243835);
    }

    public final void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
        } else {
            PowerMsgReceiver.a();
        }
    }
}
