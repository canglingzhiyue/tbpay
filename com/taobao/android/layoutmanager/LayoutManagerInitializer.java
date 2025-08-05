package com.taobao.android.layoutmanager;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.setup.NotifyRegister;
import com.taobao.android.layoutmanager.setup.WindvanePluginRegister;
import com.taobao.android.layoutmanager.setup.c;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.core.e;
import com.taobao.tao.flexbox.layoutmanager.jscore.TNodeJSCore;
import tb.gwc;
import tb.gwd;
import tb.kge;

/* loaded from: classes5.dex */
public class LayoutManagerInitializer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(200640958);
    }

    public static void setup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cce3884", new Object[0]);
            return;
        }
        autoComponentFactoryRegister();
        autoModuleFactoryRegister();
        com.taobao.android.layoutmanager.setup.a.a();
        c.a();
        NotifyRegister.a();
        WindvanePluginRegister.a();
        com.taobao.android.layoutmanager.setup.b.a();
        ab.d(new Runnable() { // from class: com.taobao.android.layoutmanager.LayoutManagerInitializer.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    TNodeJSCore.b();
                }
            }
        });
    }

    private static void autoComponentFactoryRegister() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("824b9ce6", new Object[0]);
        } else {
            e.a(new gwc());
        }
    }

    private static void autoModuleFactoryRegister() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b842b6d9", new Object[0]);
        } else {
            com.taobao.tao.flexbox.layoutmanager.module.b.a(new gwd());
        }
    }
}
