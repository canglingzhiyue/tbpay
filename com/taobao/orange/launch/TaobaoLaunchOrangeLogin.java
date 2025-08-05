package com.taobao.orange.launch;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.io.Serializable;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes.dex */
public class TaobaoLaunchOrangeLogin implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-134622260);
        kge.a(1028243835);
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        String str = null;
        try {
            str = (String) hashMap.get("userId");
        } catch (Throwable unused) {
        }
        if (str == null) {
            str = "";
        }
        OrangeConfig.getInstance().setUserId(str);
    }
}
