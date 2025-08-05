package com.taobao.android.fluid.framework.deprecated.message.module;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.deprecated.message.module.proxy.ShortVideoTNodeModuleProxy;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import tb.kge;

/* loaded from: classes5.dex */
public class ShortVideoTNodeModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(998714587);
        kge.a(-818961104);
    }

    public static void sendMessage(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c77e49d9", new Object[]{cVar});
        } else {
            ShortVideoTNodeModuleProxy.sendMessage(cVar);
        }
    }
}
