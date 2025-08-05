package com.alibaba.android.triver.base.api;

import android.content.Context;
import com.alibaba.android.triver.base.api.ITriverRemoteProxy;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(862798049);
    }

    public static boolean a(ITriverRemoteProxy.DependenceMode dependenceMode, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dff72d", new Object[]{dependenceMode, context})).booleanValue();
        }
        ITriverRemoteProxy iTriverRemoteProxy = (ITriverRemoteProxy) RVProxy.get((Class<Object>) ITriverRemoteProxy.class, true);
        if (iTriverRemoteProxy == null) {
            return true;
        }
        return iTriverRemoteProxy.hasInstalled(dependenceMode, context);
    }

    public static void a(String str, String str2, ITriverRemoteProxy.DependenceMode dependenceMode, Context context, ITriverRemoteProxy.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da3742b", new Object[]{str, str2, dependenceMode, context, aVar});
            return;
        }
        ITriverRemoteProxy iTriverRemoteProxy = (ITriverRemoteProxy) RVProxy.get((Class<Object>) ITriverRemoteProxy.class, true);
        if (iTriverRemoteProxy != null) {
            iTriverRemoteProxy.install(str, str2, dependenceMode, context, aVar);
        } else {
            aVar.a();
        }
    }

    public static void a(String str, String str2, ITriverRemoteProxy.DependenceMode dependenceMode, Context context, ITriverRemoteProxy.a aVar, ITriverRemoteProxy.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6298cef8", new Object[]{str, str2, dependenceMode, context, aVar, bVar});
            return;
        }
        ITriverRemoteProxy iTriverRemoteProxy = (ITriverRemoteProxy) RVProxy.get((Class<Object>) ITriverRemoteProxy.class, true);
        if (iTriverRemoteProxy != null) {
            iTriverRemoteProxy.install(str, str2, dependenceMode, context, aVar, bVar);
        } else {
            aVar.a();
        }
    }

    public static void b(String str, String str2, ITriverRemoteProxy.DependenceMode dependenceMode, Context context, ITriverRemoteProxy.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49a7dfec", new Object[]{str, str2, dependenceMode, context, aVar});
            return;
        }
        ITriverRemoteProxy iTriverRemoteProxy = (ITriverRemoteProxy) RVProxy.get((Class<Object>) ITriverRemoteProxy.class, true);
        if (iTriverRemoteProxy != null) {
            iTriverRemoteProxy.installWithRemoUI(str, str2, dependenceMode, context, aVar);
        } else {
            aVar.a();
        }
    }
}
