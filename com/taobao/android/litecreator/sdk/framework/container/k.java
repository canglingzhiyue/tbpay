package com.taobao.android.litecreator.sdk.framework.container;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.hew;
import tb.kge;

/* loaded from: classes5.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static List<c> f13448a;

    static {
        kge.a(832334051);
        f13448a = new ArrayList();
    }

    public static h a(hew hewVar, PluginInfo pluginInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("443c64b", new Object[]{hewVar, pluginInfo});
        }
        for (c cVar : f13448a) {
            h a2 = cVar.a(pluginInfo.pluginClass);
            if (a2 != null) {
                a2.a(hewVar, pluginInfo);
                return a2;
            }
        }
        return null;
    }

    public static void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("828dccc", new Object[]{cVar});
        } else {
            f13448a.add(cVar);
        }
    }
}
