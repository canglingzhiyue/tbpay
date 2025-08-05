package com.taobao.linkmanager.launcher;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.utils.d;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import java.io.Serializable;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes.dex */
public final class Launcher_InitLinkManager implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1179838500);
        kge.a(1028243835);
    }

    public final void init(final Application application, final HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        TFCCommonUtils.a(application);
        if (TbFcLinkInit.instance().linkAhead) {
            d.b.a(new Runnable() { // from class: com.taobao.linkmanager.launcher.Launcher_InitLinkManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TbFcLinkInit.instance().init(application, hashMap);
                    }
                }
            });
        } else {
            TbFcLinkInit.instance().init(application, hashMap);
        }
    }
}
