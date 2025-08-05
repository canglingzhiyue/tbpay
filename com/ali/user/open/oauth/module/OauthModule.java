package com.ali.user.open.oauth.module;

import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.util.CommonUtils;
import com.ali.user.open.oauth.OauthService;
import com.ali.user.open.oauth.OauthServiceImpl;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class OauthModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        CommonUtils.sendUT("init_step_ucc_init_oauth_module");
        KernelContext.registerService(new Class[]{OauthService.class}, new OauthServiceImpl(), null);
    }
}
