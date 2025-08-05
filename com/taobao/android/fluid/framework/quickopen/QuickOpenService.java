package com.taobao.android.fluid.framework.quickopen;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.kge;
import tb.spa;
import tb.spb;

/* loaded from: classes5.dex */
public class QuickOpenService implements IQuickOpenService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SERVICE_NAME = "IQuickOpenService";
    private final String TAG = "QuickOpenService";
    private final FluidContext mFluidContext;
    private boolean mIsInQuickOpenMode;
    private boolean mIsQuickOpenMode;
    public TUrlImageView mLoadingImage;
    private final spa mTransitionAnimManager;
    private boolean mUsePreSize;

    static {
        kge.a(-1637245633);
        kge.a(322738982);
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    public QuickOpenService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
        this.mTransitionAnimManager = new spa(fluidContext);
    }

    public void addTransitionAnimListener(spb spbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f59e58d", new Object[]{this, spbVar});
        } else {
            this.mTransitionAnimManager.a(spbVar);
        }
    }

    @Override // tb.soz
    public void addTransitionAnimListener(spb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af4bae70", new Object[]{this, aVar});
        } else {
            this.mTransitionAnimManager.addTransitionAnimListener(aVar);
        }
    }

    public void removeTransitionAnimListener(spb spbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eb5acb0", new Object[]{this, spbVar});
        } else {
            this.mTransitionAnimManager.b(spbVar);
        }
    }

    public void removeTransitionAnimListener(spb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76d238d3", new Object[]{this, aVar});
        } else {
            this.mTransitionAnimManager.a(aVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.quickopen.IQuickOpenService
    public TUrlImageView getLoadingImage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("525dc880", new Object[]{this}) : this.mLoadingImage;
    }

    @Override // com.taobao.android.fluid.framework.quickopen.IQuickOpenService
    public void setLoadingImage(TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b68d4dee", new Object[]{this, tUrlImageView});
        } else {
            this.mLoadingImage = tUrlImageView;
        }
    }

    @Override // com.taobao.android.fluid.framework.quickopen.IQuickOpenService
    public boolean isInQuickOpenMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4fbf1b76", new Object[]{this})).booleanValue() : this.mIsInQuickOpenMode;
    }

    @Override // com.taobao.android.fluid.framework.quickopen.IQuickOpenService
    public void setInQuickOpenMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeeee8da", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsInQuickOpenMode = z;
        }
    }

    @Override // com.taobao.android.fluid.framework.quickopen.IQuickOpenService
    public boolean isQuickOpenMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a374bf9b", new Object[]{this})).booleanValue() : this.mIsQuickOpenMode;
    }

    @Override // com.taobao.android.fluid.framework.quickopen.IQuickOpenService
    public void setQuickOpenMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2fd3755", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsQuickOpenMode = z;
        }
    }

    @Override // com.taobao.android.fluid.framework.quickopen.IQuickOpenService
    public boolean isUsePreSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("146abf92", new Object[]{this})).booleanValue() : this.mUsePreSize;
    }

    @Override // com.taobao.android.fluid.framework.quickopen.IQuickOpenService
    public void setUsePreSize(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6560dece", new Object[]{this, new Boolean(z)});
        } else {
            this.mUsePreSize = z;
        }
    }

    @Override // tb.soz
    public boolean isTransitionAnimEnd() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3281bcf6", new Object[]{this})).booleanValue() : this.mTransitionAnimManager.isTransitionAnimEnd();
    }

    @Override // tb.spb
    public void onAnimationEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c281bbd", new Object[]{this});
        } else {
            this.mTransitionAnimManager.onAnimationEnd();
        }
    }

    @Override // tb.spb
    public void onAnimationStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("771cb104", new Object[]{this});
        } else {
            this.mTransitionAnimManager.onAnimationStart();
        }
    }
}
