package com.taobao.weex;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.weex2.AppWeexEngineAutoInit;
import com.taobao.weex.bridge.WXInitDelayTask;
import com.taobao.weex.common.WXConfig;
import com.taobao.weex.utils.TBWXConfigManger;
import java.io.Serializable;
import java.util.HashMap;
import tb.kge;
import tb.nya;

/* loaded from: classes9.dex */
public class LauncherInitWeexNew implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1101931276);
        kge.a(1028243835);
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        TLog.loge("Weex", "Weex", "enter LauncherInitWeex");
        long currentTimeMillis = System.currentTimeMillis();
        if (hashMap != null) {
            Object obj = hashMap.get("isDebuggable");
            if (obj instanceof Boolean) {
                WXEnvironment.addCustomOptions(WXConfig.debugMode, String.valueOf(obj));
            }
        }
        if (!com.taobao.weex.remote.e.b() && !TBWXConfigManger.getInstance().offSingleProcessTask()) {
            WXSDKManager.getInstance().setUseSingleProcess(true);
        }
        WXInitDelayTask.getInstance().setEnableInitDelay(true);
        if (TBWXConfigManger.enableInitV2InsideV1(application)) {
            AppWeexEngineAutoInit.init(application);
            nya.a();
        }
        j.a(application, false, true, false, null);
        TLog.loge("weex", "init weex cost " + (System.currentTimeMillis() - currentTimeMillis));
        WXEnvironment.sSDKInitTaskTime = System.currentTimeMillis() - currentTimeMillis;
    }
}
