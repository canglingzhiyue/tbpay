package com.taobao.wangxin.app;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.launcher.init.FeatureInitHelper;
import com.taobao.message.launcher.init.InitOpenPoint;
import com.taobao.tao.log.TLog;
import java.io.Serializable;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes9.dex */
public class InitMessage implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INIT_CLASS_NAME = "com.taobao.wangxin.app.InitHelper";
    private final String TAG = "InitMessage";
    private final String MODULE = "MPMSGS";

    static {
        kge.a(1476689121);
        kge.a(1028243835);
    }

    public final void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        InitOpenPoint.registerProcessor(new DefaultInitProcessor(application));
        TLog.loge("MPMSGS", "InitMessage", "init");
        FeatureInitHelper.init("InitMessage", INIT_CLASS_NAME);
    }
}
