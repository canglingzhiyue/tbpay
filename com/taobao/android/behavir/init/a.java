package com.taobao.android.behavir.init;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.Utils;
import com.taobao.android.behavir.util.h;
import com.taobao.android.behavir.util.i;
import com.taobao.android.behavix.bhxbridge.BHXCXXBaseBridge;
import com.taobao.android.behavix.d;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.speed.TBSpeed;
import com.taobao.android.ucp.bridge.NativeDelegate;
import com.taobao.android.ucp.track.c;
import com.taobao.tao.navigation.e;
import tb.dro;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(884402533);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        c.a("BXInit");
        h.a();
        NativeDelegate.init();
        b();
        if (d.b() == null || !Utils.c()) {
            return;
        }
        boolean isSpeedEdition = TBSpeed.isSpeedEdition(d.b(), "bx_init_at_activity_start");
        if (LauncherRuntime.m || isSpeedEdition) {
            return;
        }
        BHXCXXBaseBridge.LoadCXXLib();
        i.a(new i.a() { // from class: com.taobao.android.behavir.init.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.behavix.utils.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    BHXCXXBaseBridge.setupBHXCpp();
                }
            }
        });
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else if (!dro.c()) {
        } else {
            try {
                com.taobao.android.behavir.util.a c = com.taobao.android.behavir.util.a.c();
                d.b().registerActivityLifecycleCallbacks(c);
                e.a(c);
            } catch (Throwable unused) {
            }
        }
    }
}
