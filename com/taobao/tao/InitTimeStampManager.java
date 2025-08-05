package com.taobao.tao;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.timestamp.TimeStampManager;
import java.io.Serializable;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes8.dex */
public class InitTimeStampManager implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-669171545);
        kge.a(1028243835);
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
        } else {
            TimeStampManager.instance().onCreated();
        }
    }
}
