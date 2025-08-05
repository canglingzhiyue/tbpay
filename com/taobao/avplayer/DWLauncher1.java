package com.taobao.avplayer;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.component.weex.WXSplayerModule;
import com.taobao.avplayer.plugin.DWVideoPlayerApiPlugin;
import com.taobao.avplayer.plugin.DWVideoPreloadApiPlugin;
import com.taobao.media.MediaSystemUtils;
import com.taobao.tao.Globals;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKEngine;
import java.io.Serializable;
import java.util.HashMap;
import tb.kck;
import tb.kge;
import tb.oyw;

/* loaded from: classes6.dex */
public class DWLauncher1 implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1955224904);
        kge.a(1028243835);
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        if (application != null) {
            kck.f29959a = application;
            MediaSystemUtils.sApplication = application;
            oyw.a(application);
        } else {
            kck.f29959a = Globals.getApplication();
            MediaSystemUtils.sApplication = Globals.getApplication();
            if (Globals.getApplication() != null) {
                oyw.a(Globals.getApplication());
            }
        }
        register();
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_adapter_DWLauncher1);
    }

    private static void register() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
            return;
        }
        try {
            ab.a();
            android.taobao.windvane.jsbridge.q.a("InteractVideoWVPlugin", (Class<? extends android.taobao.windvane.jsbridge.e>) DWVideoPlayerApiPlugin.class, true);
            android.taobao.windvane.jsbridge.q.a("TBVideoPreCache", (Class<? extends android.taobao.windvane.jsbridge.e>) DWVideoPreloadApiPlugin.class, true);
            if (!WXEnvironment.isSupport()) {
                return;
            }
            WXSDKEngine.registerModule("SplayerModule", WXSplayerModule.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
