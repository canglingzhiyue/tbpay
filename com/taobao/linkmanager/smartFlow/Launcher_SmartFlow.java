package com.taobao.linkmanager.smartFlow;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.utils.c;
import com.taobao.flowcustoms.afc.utils.d;
import java.io.Serializable;
import java.util.HashMap;
import tb.kge;
import tb.rjt;

/* loaded from: classes.dex */
public final class Launcher_SmartFlow implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(904978559);
        kge.a(1028243835);
    }

    public final void init(final Application application, final HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
        } else {
            d.b.a(new Runnable() { // from class: com.taobao.linkmanager.smartFlow.Launcher_SmartFlow.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        rjt.a().b(application, hashMap);
                    } catch (Exception e) {
                        c.b("linkx", "initChannelError" + e.getMessage());
                    }
                }
            });
        }
    }
}
