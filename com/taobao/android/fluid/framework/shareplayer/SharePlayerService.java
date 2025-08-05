package com.taobao.android.fluid.framework.shareplayer;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.quickopen.IQuickOpenService;
import com.taobao.avplayer.bl;
import com.taobao.tao.flexbox.layoutmanager.player.b;
import com.taobao.tao.flexbox.layoutmanager.player.c;
import tb.kge;
import tb.ody;
import tb.snv;
import tb.spu;
import tb.spv;
import tb.spw;
import tb.spz;

/* loaded from: classes5.dex */
public class SharePlayerService implements ISharePlayerService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SERVICE_NAME = "ISharePlayerService";
    private static final String TAG = "SharePlayerService";
    private snv mDWInstance;
    private boolean mEnableInnerSharePlayer;
    private final FluidContext mFluidContext;
    private spw mInnerSharePlayerObject;
    private boolean mSharePlayerViewStateNoPlaying;
    private boolean mStillShareVideo;
    private boolean mHasCreateDWInstance = false;
    private boolean mHasShowInnerSharePlayerPV = false;
    private boolean mEnableSharePlayer = false;
    private final spu mSharePlayerServiceConfig = new spu();

    static {
        kge.a(1981506669);
        kge.a(315608262);
    }

    @Override // tb.snd
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    @Override // tb.snd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        }
    }

    @Override // tb.snd
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // tb.snd
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }

    public SharePlayerService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
    }

    @Override // com.taobao.android.fluid.framework.shareplayer.ISharePlayerService
    public boolean isSharePlayerViewStateNoPlaying() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9f8ef362", new Object[]{this})).booleanValue() : this.mSharePlayerViewStateNoPlaying;
    }

    @Override // com.taobao.android.fluid.framework.shareplayer.ISharePlayerService
    public boolean isStillShareVideo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a0a58ca5", new Object[]{this})).booleanValue() : this.mStillShareVideo;
    }

    @Override // com.taobao.android.fluid.framework.shareplayer.ISharePlayerService
    public void clearSharePlayer(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c617d64", new Object[]{this, str});
            return;
        }
        bl e = b.a().e(str);
        boolean a2 = b.a().a(str);
        if (e != null && a2) {
            c.a().a(true, b.a().b(str));
            b.a().b();
            if (spu.c()) {
                e.m();
            }
        }
        spv.a().a(str);
    }

    @Override // com.taobao.android.fluid.framework.shareplayer.ISharePlayerService
    public spu getConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (spu) ipChange.ipc$dispatch("febcbc2f", new Object[]{this}) : this.mSharePlayerServiceConfig;
    }

    @Override // com.taobao.android.fluid.framework.shareplayer.ISharePlayerService
    public snv getDWInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (snv) ipChange.ipc$dispatch("c2047526", new Object[]{this}) : this.mDWInstance;
    }

    @Override // com.taobao.android.fluid.framework.shareplayer.ISharePlayerService
    public void setDWInstance(snv snvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd9c7dc6", new Object[]{this, snvVar});
        } else {
            this.mDWInstance = snvVar;
        }
    }

    @Override // com.taobao.android.fluid.framework.shareplayer.ISharePlayerService
    public spw getInnerSharePlayerObject() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (spw) ipChange.ipc$dispatch("be8dbe06", new Object[]{this}) : this.mInnerSharePlayerObject;
    }

    @Override // com.taobao.android.fluid.framework.shareplayer.ISharePlayerService
    public void setInnerSharePlayerObject(spw spwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bf255c8", new Object[]{this, spwVar});
        } else {
            this.mInnerSharePlayerObject = spwVar;
        }
    }

    @Override // com.taobao.android.fluid.framework.shareplayer.ISharePlayerService
    public void initSharePlayer() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("803a78f7", new Object[]{this});
            return;
        }
        String coverKey = getCoverKey();
        boolean z2 = b.a().a(coverKey) || spv.a().e(coverKey);
        boolean c = b.a().c(coverKey);
        if (z2 && c) {
            z = true;
        }
        this.mStillShareVideo = z;
        ((ISharePlayerService) this.mFluidContext.getService(ISharePlayerService.class)).getConfig().a(b.a().g(coverKey));
        bl e = b.a().e(coverKey);
        if (e != null && !c && e.i() != 1) {
            spz.c(TAG, "view续播，播放器state" + e.i());
            this.mSharePlayerViewStateNoPlaying = true;
        }
        setEnableSharePlayer(z2);
    }

    @Override // com.taobao.android.fluid.framework.shareplayer.ISharePlayerService
    public boolean isEnableInnerSharePlayer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f9bbbde2", new Object[]{this})).booleanValue() : this.mEnableInnerSharePlayer;
    }

    @Override // com.taobao.android.fluid.framework.shareplayer.ISharePlayerService
    public void setEnableInnerSharePlayer(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6df3e7e", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableInnerSharePlayer = z;
        }
    }

    @Override // com.taobao.android.fluid.framework.shareplayer.ISharePlayerService
    public boolean isEnableSharePlayer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5fb1651e", new Object[]{this})).booleanValue() : this.mEnableSharePlayer;
    }

    @Override // com.taobao.android.fluid.framework.shareplayer.ISharePlayerService
    public void setEnableSharePlayer(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5259e632", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableSharePlayer = z;
        }
    }

    @Override // com.taobao.android.fluid.framework.shareplayer.ISharePlayerService
    public boolean isHasCreateDWInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d3d927ff", new Object[]{this})).booleanValue() : this.mHasCreateDWInstance;
    }

    @Override // com.taobao.android.fluid.framework.shareplayer.ISharePlayerService
    public void setHasCreateDWInstance(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3821171", new Object[]{this, new Boolean(z)});
        } else {
            this.mHasCreateDWInstance = z;
        }
    }

    @Override // com.taobao.android.fluid.framework.shareplayer.ISharePlayerService
    public boolean isHasShowInnerSharePlayerPV() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("52a808", new Object[]{this})).booleanValue() : this.mHasShowInnerSharePlayerPV;
    }

    @Override // com.taobao.android.fluid.framework.shareplayer.ISharePlayerService
    public void setHasShowInnerSharePlayerPV(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86144888", new Object[]{this, new Boolean(z)});
        } else {
            this.mHasShowInnerSharePlayerPV = z;
        }
    }

    @Override // tb.snd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else if (!(this.mFluidContext.getContext() instanceof Activity) || !((Activity) this.mFluidContext.getContext()).isFinishing() || ((IQuickOpenService) this.mFluidContext.getService(IQuickOpenService.class)).isTransitionAnimEnd()) {
        } else {
            clearSharePlayer(getCoverKey());
        }
    }

    @Override // tb.snd
    public void cI_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eaece0", new Object[]{this});
            return;
        }
        String coverKey = getCoverKey();
        if (!((IQuickOpenService) this.mFluidContext.getService(IQuickOpenService.class)).isTransitionAnimEnd()) {
            clearSharePlayer(coverKey);
        }
        ody.a().b(coverKey);
        snv snvVar = this.mDWInstance;
        if (snvVar == null) {
            return;
        }
        snvVar.d();
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
            return;
        }
        ((ILifecycleService) this.mFluidContext.getService(ILifecycleService.class)).addPageLifecycleListener(this);
        initSharePlayer();
    }

    private String getCoverKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fe2dfd1b", new Object[]{this}) : this.mFluidContext.getInstanceConfig().getPreCoverKey();
    }
}
