package com.taobao.themis.taobao.env;

import android.app.Application;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import tb.kge;

/* loaded from: classes9.dex */
public class TBEnvironmentAdapterImpl implements IEnvironmentService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-427650217);
        kge.a(-251980465);
    }

    @Override // com.taobao.themis.kernel.adapter.IEnvironmentService
    public String getAppName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("92150ca3", new Object[]{this}) : RVEnvironmentService.PLATFORM_TB;
    }

    @Override // com.taobao.themis.kernel.adapter.IEnvironmentService
    public Application getApplicationContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("4955420b", new Object[]{this}) : Globals.getApplication();
    }

    @Override // com.taobao.themis.kernel.adapter.IEnvironmentService
    public String getAppVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this}) : Globals.getVersionName();
    }
}
