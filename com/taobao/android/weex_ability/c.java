package com.taobao.android.weex_ability;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.connection.MUSConnectionModule;
import com.taobao.android.weex_ability.modules.WXAPMModule;
import com.taobao.android.weex_ability.modules.WeexExceptionModule;
import com.taobao.android.weex_ability.modules.WeexMegaBridgeModule;
import com.taobao.android.weex_ability.modules.WeexZipModule;
import com.taobao.android.weex_ability.mtop.MUSMtopModule;
import com.taobao.android.weex_ability.page.AliMSNavigationBarModule;
import com.taobao.android.weex_ability.page.AliMUSPageModule;
import com.taobao.android.weex_ability.page.MUSEventModule;
import com.taobao.android.weex_ability.page.MUSLiteAppModule;
import com.taobao.android.weex_ability.windvane.WXWindVaneModule;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import com.taobao.android.weex_framework.monitor.a;
import com.taobao.orange.OrangeConfig;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f15916a;

    static {
        kge.a(-1925131041);
        f15916a = false;
    }

    public static synchronized void a() {
        synchronized (c.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
            } else if (f15916a) {
            } else {
                f15916a = true;
                MUSMonitor.a(new a() { // from class: com.taobao.android.weex_ability.c.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.weex_framework.monitor.a
                    public boolean a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
                        }
                        try {
                            return "true".equals(OrangeConfig.getInstance().getConfig("open_ability_common", "open_ability_monitor", "true"));
                        } catch (Throwable unused) {
                            return false;
                        }
                    }
                });
                com.taobao.android.weex.d dVar = (com.taobao.android.weex.d) com.taobao.android.weex.d.a();
                dVar.a("apm", WXAPMModule.class, WXAPMModule.METHODS);
                dVar.a("windvane", WXWindVaneModule.class, WXWindVaneModule.METHODS);
                dVar.a("userTrack", WXUserTrackModule.class, WXUserTrackModule.METHODS);
                dVar.a("broadcast", WXBroadcastModule.class, WXBroadcastModule.METHODS);
                MUSEngine.registerModule("mtop", MUSMtopModule.class);
                MUSEngine.registerModule("connection", MUSConnectionModule.class);
                MUSEngine.registerModule(AliMSNavigationBarModule.NAME, AliMSNavigationBarModule.class);
                MUSEngine.registerModule(AliMUSPageModule.NAME, AliMUSPageModule.class);
                MUSEngine.registerModule("share", AliMUShareModule.class);
                MUSEngine.registerModule("event", MUSEventModule.class);
                MUSEngine.registerModule(MUSLiteAppModule.NAME, MUSLiteAppModule.class);
                MUSEngine.registerModule(WeexZipModule.NAME, WeexZipModule.class);
                MUSEngine.registerModule("exception", WeexExceptionModule.class);
                dVar.a(WeexMegaBridgeModule.NAME, WeexMegaBridgeModule.class, WeexMegaBridgeModule.METHODS);
            }
        }
    }
}
