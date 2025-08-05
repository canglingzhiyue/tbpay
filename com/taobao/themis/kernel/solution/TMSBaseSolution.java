package com.taobao.themis.kernel.solution;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.container.a;
import com.taobao.themis.kernel.container.ui.splash.ISplashView;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPageFactory;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qpr;
import tb.qqg;
import tb.qqp;
import tb.sud;

/* loaded from: classes9.dex */
public abstract class TMSBaseSolution implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a mContainerModel;
    public final f mInstance;
    private final f.a mLaunchListener;
    private final qpr mLauncher;
    private final ITMSPageFactory mPageFactory;
    private final qqg mRenderFactory;
    public ISplashView mSplashView;

    static {
        kge.a(865493162);
        kge.a(1394749252);
        kge.a(1028243835);
    }

    public abstract f.a createLaunchListener();

    public abstract qpr createLauncher();

    public abstract qqg createRenderFactory();

    public abstract a generateContainerModel();

    public abstract ISplashView generateSplashView(ViewGroup viewGroup);

    public List<sud> getInstanceExtension() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4e7cabec", new Object[]{this});
        }
        return null;
    }

    public abstract TMSSolutionType getSolutionType();

    public boolean reload(qqp qqpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d80f43c4", new Object[]{this, qqpVar})).booleanValue();
        }
        return false;
    }

    public TMSBaseSolution(f instance) {
        q.d(instance, "instance");
        this.mInstance = instance;
        this.mLauncher = createLauncher();
        this.mRenderFactory = createRenderFactory();
        this.mLaunchListener = createLaunchListener();
        this.mPageFactory = createPageFactory(instance);
    }

    public qpr getLauncher() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qpr) ipChange.ipc$dispatch("8f22d576", new Object[]{this}) : this.mLauncher;
    }

    public qqg getRenderFactory() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qqg) ipChange.ipc$dispatch("9089491a", new Object[]{this}) : this.mRenderFactory;
    }

    public f.a getLaunchListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f.a) ipChange.ipc$dispatch("9bbadc7a", new Object[]{this}) : this.mLaunchListener;
    }

    public a getContainerModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("aa856949", new Object[]{this});
        }
        a aVar = this.mContainerModel;
        if (aVar != null) {
            return aVar;
        }
        this.mContainerModel = generateContainerModel();
        return this.mContainerModel;
    }

    public void createSplashView(ViewGroup splashViewContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0d18f8e", new Object[]{this, splashViewContainer});
            return;
        }
        q.d(splashViewContainer, "splashViewContainer");
        this.mSplashView = generateSplashView(splashViewContainer);
    }

    public ITMSPageFactory createPageFactory(f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPageFactory) ipChange.ipc$dispatch("c996e0f6", new Object[]{this, instance});
        }
        q.d(instance, "instance");
        return new com.taobao.themis.kernel.page.b(instance);
    }

    public ITMSPageFactory getPageFactory() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITMSPageFactory) ipChange.ipc$dispatch("96566cd7", new Object[]{this}) : this.mPageFactory;
    }

    public ISplashView getSplashView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ISplashView) ipChange.ipc$dispatch("ccf1f37e", new Object[]{this}) : this.mSplashView;
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        qqg qqgVar = this.mRenderFactory;
        if (qqgVar != null) {
            qqgVar.onDestroy();
        }
        ISplashView iSplashView = this.mSplashView;
        if (iSplashView == null) {
            return;
        }
        iSplashView.c();
    }
}
