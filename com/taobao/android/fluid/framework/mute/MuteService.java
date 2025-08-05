package com.taobao.android.fluid.framework.mute;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.mute.helper.h;
import tb.kge;
import tb.sok;
import tb.som;

/* loaded from: classes5.dex */
public class MuteService implements IMuteService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SERVICE_NAME = "IMuteService";
    private final FluidContext mFluidContext;
    public boolean fadInForFirstTime = false;
    private boolean mIsMuteABTestForSettings = true;
    private final som mMuteFlagChangedManager = new som();

    static {
        kge.a(160758127);
        kge.a(-367574656);
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    public MuteService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
    }

    @Override // com.taobao.android.fluid.framework.mute.IMuteService
    public boolean isFadInForFirstTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("79fd0083", new Object[]{this})).booleanValue() : this.fadInForFirstTime;
    }

    @Override // com.taobao.android.fluid.framework.mute.IMuteService
    public void setFadInForFirstTime(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8181b76d", new Object[]{this, new Boolean(z)});
        } else {
            this.fadInForFirstTime = z;
        }
    }

    @Override // com.taobao.android.fluid.framework.mute.IMuteService
    public boolean isMuteABTestForSettings() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3edc0f41", new Object[]{this})).booleanValue() : this.mIsMuteABTestForSettings;
    }

    @Override // com.taobao.android.fluid.framework.mute.IMuteService
    public void setMuteABTestForSettings(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a197246f", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsMuteABTestForSettings = z;
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
        } else {
            new h(this.mFluidContext);
        }
    }

    @Override // tb.sok
    public void a(FluidContext fluidContext, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7e4f7ae", new Object[]{this, fluidContext, str, str2});
        } else {
            this.mMuteFlagChangedManager.a(fluidContext, str, str2);
        }
    }

    @Override // tb.tbn
    public void a(sok sokVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff2012e9", new Object[]{this, sokVar});
        } else {
            this.mMuteFlagChangedManager.a(sokVar);
        }
    }

    @Override // tb.tbn
    public void b(sok sokVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eda3196a", new Object[]{this, sokVar});
        } else {
            this.mMuteFlagChangedManager.b(sokVar);
        }
    }
}
