package com.ali.user.open.module;

import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.service.SessionService;
import com.ali.user.open.service.impl.SessionManager;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class SessionModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else {
            KernelContext.registerService(new Class[]{SessionService.class}, SessionManager.INSTANCE, null);
        }
    }
}
