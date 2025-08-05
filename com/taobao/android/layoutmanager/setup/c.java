package com.taobao.android.layoutmanager.setup;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.module.ABTestModule;
import com.taobao.android.layoutmanager.module.AppMonitorModule;
import com.taobao.android.layoutmanager.module.BehaviXModule;
import com.taobao.android.layoutmanager.module.BusinessModule;
import com.taobao.android.layoutmanager.module.FestivalModule;
import com.taobao.android.layoutmanager.module.GuangGuangModule;
import com.taobao.android.layoutmanager.module.ImagePreloadModule;
import com.taobao.android.layoutmanager.module.LBSModule;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.android.layoutmanager.module.NavigationTabModule;
import com.taobao.android.layoutmanager.module.OrangeModule;
import com.taobao.android.layoutmanager.module.PreloadModule;
import com.taobao.android.layoutmanager.module.RouteListenerModule;
import com.taobao.android.layoutmanager.module.ShareModule;
import com.taobao.android.layoutmanager.module.UserModule;
import com.taobao.android.layoutmanager.module.WindvaneModule;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.log.TLog;
import tb.kge;

/* loaded from: classes5.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-673660288);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        ab.b("$user", UserModule.class);
        ab.b("$mtop", MtopModule.class);
        ab.b("$festival", FestivalModule.class);
        ab.b("$appMonitor", AppMonitorModule.class);
        ab.b("$share", ShareModule.class);
        ab.b("$windvane", WindvaneModule.class);
        ab.b("$orange", OrangeModule.class);
        ab.b("$tab", NavigationTabModule.class);
        ab.b("$preload", PreloadModule.class);
        ab.b("$ab", ABTestModule.class);
        ab.b("$behavior", BehaviXModule.class);
        ab.b("$business", BusinessModule.class);
        ab.b("$imagepreload", ImagePreloadModule.class);
        ab.b("$location", LBSModule.class);
        ab.b("$routeListener", RouteListenerModule.class);
        ab.b("$guangguang", GuangGuangModule.class);
        try {
            ab.b("$GuangPickPreloadModule", (Class<? extends Object>) com.taobao.android.fluid.c.b(ab.a()));
            TLog.loge("TBGuangPickPreloadModul", "初始化成功");
        } catch (Throwable th) {
            TLog.loge("TBGuangPickPreloadModul", th.getMessage() + th.getStackTrace());
        }
        try {
            ab.b("$LivePreloadModule", (Class<? extends Object>) Class.forName("com.taobao.android.tab2liveroom.liveroom.preload.TBLivePreloadModule"));
            TLog.loge("LivePreloadModule", "初始化成功");
        } catch (Throwable th2) {
            TLog.loge("LivePreloadModule", th2.getMessage() + th2.getStackTrace());
        }
    }
}
