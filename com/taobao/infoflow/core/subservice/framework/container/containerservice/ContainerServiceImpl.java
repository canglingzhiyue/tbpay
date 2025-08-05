package com.taobao.infoflow.core.subservice.framework.container.containerservice;

import android.content.Context;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.goodprice.homepage.service.protocol.IGoodPriceFloatLayerService;
import com.taobao.infoflow.core.subservice.framework.container.containerservice.rootcontainer.InfoFlowRootContainer;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.ISubService;
import com.taobao.infoflow.protocol.subservice.biz.IIconBackGuideAnimeService;
import com.taobao.infoflow.protocol.subservice.biz.IPopViewService;
import com.taobao.infoflow.protocol.subservice.biz.IStickyContainerService;
import com.taobao.infoflow.protocol.subservice.biz.multiclasstab.IMulticlassTabService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.protocol.subservice.framework.IThemeService;
import tb.kge;
import tb.ldf;
import tb.lhg;
import tb.lhh;
import tb.lhi;
import tb.ljs;
import tb.lkq;
import tb.nuw;

/* loaded from: classes.dex */
public class ContainerServiceImpl implements IContainerService<ViewGroup> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ContainerServiceImpl";
    private lhi mContainerRefresher;
    private ljs mInfoFlowContext;
    private ViewGroup mRootContainer;
    private final Class<? extends ISubService>[] layerServices = {IThemeService.class, IMainFeedsViewService.class, IMulticlassTabService.class, IStickyContainerService.class, IGoodPriceFloatLayerService.class, IPopViewService.class, IIconBackGuideAnimeService.class};
    private a mContainerLifecycleRegister = new a();
    private lhh mUiRefreshListenerRegister = new lhh();

    static {
        kge.a(-870935130);
        kge.a(1343382601);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.mInfoFlowContext = ljsVar;
        this.mContainerRefresher = new lhi(ljsVar);
        new lhg(ljsVar, this.mContainerLifecycleRegister);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        destroyContainer();
        this.mContainerLifecycleRegister.a();
        this.mUiRefreshListenerRegister.a();
    }

    @Override // tb.lkq
    /* renamed from: createContainer */
    public ViewGroup mo1092createContainer(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("1c667639", new Object[]{this, context});
        }
        this.mContainerLifecycleRegister.a(context);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.mRootContainer = assembledContainer(this.mInfoFlowContext, context);
        ldf.d(TAG, "createContainer 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime));
        this.mContainerLifecycleRegister.c();
        return this.mRootContainer;
    }

    @Override // tb.lkq
    public void destroyContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49a77eae", new Object[]{this});
            return;
        }
        ldf.d(TAG, "destroyContainer");
        if (this.mRootContainer == null) {
            return;
        }
        for (Class<? extends ISubService> cls : this.layerServices) {
            destroyChildLayer(this.mInfoFlowContext, cls);
        }
        this.mRootContainer.removeAllViews();
        this.mRootContainer = null;
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService
    public void uiRefresh(IContainerDataModel iContainerDataModel, IUiRefreshActionModel iUiRefreshActionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19df0ab", new Object[]{this, iContainerDataModel, iUiRefreshActionModel});
            return;
        }
        ldf.d(TAG, "uiRefresh");
        if (this.mRootContainer == null) {
            ldf.d(TAG, "uiRefresh 容器尚未创建，直接返回");
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.mUiRefreshListenerRegister.a(iUiRefreshActionModel);
        this.mContainerRefresher.a(iContainerDataModel, iUiRefreshActionModel);
        this.mUiRefreshListenerRegister.b(iUiRefreshActionModel);
        ldf.e(TAG, "uiRefresh 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService
    public void addUiRefreshListener(IContainerService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5efa0fa", new Object[]{this, aVar});
        } else {
            this.mUiRefreshListenerRegister.a(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService
    public void removeUiRefreshListener(IContainerService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b88fa65d", new Object[]{this, aVar});
        } else {
            this.mUiRefreshListenerRegister.b(aVar);
        }
    }

    @Override // tb.lkq
    public void addOnContainerListener(lkq.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f3597dd", new Object[]{this, aVar});
        } else {
            this.mContainerLifecycleRegister.a(aVar);
        }
    }

    @Override // tb.lkq
    public void removeOnContainerListener(lkq.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8982e05a", new Object[]{this, aVar});
        } else {
            this.mContainerLifecycleRegister.b(aVar);
        }
    }

    private ViewGroup assembledContainer(ljs ljsVar, Context context) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("f27ea1be", new Object[]{this, ljsVar, context});
        }
        FrameLayout createRootViewGroup = createRootViewGroup(context);
        Class<? extends ISubService>[] clsArr = this.layerServices;
        int length = clsArr.length;
        int i2 = 0;
        while (i2 < length) {
            Class<? extends ISubService> cls = clsArr[i2];
            nuw.a(TAG, "createChildLayer_" + cls.getSimpleName());
            long elapsedRealtime = SystemClock.elapsedRealtime();
            addChildToRoot(createChildLayer(ljsVar, context, cls), createRootViewGroup);
            String[] strArr = new String[i];
            strArr[0] = "createChildLayer " + cls.getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime);
            ldf.d(TAG, strArr);
            StringBuilder sb = new StringBuilder();
            sb.append("createChildLayer_");
            sb.append(cls.getSimpleName());
            nuw.b(TAG, sb.toString());
            i2++;
            i = 1;
        }
        return createRootViewGroup;
    }

    private ViewGroup createChildLayer(ljs ljsVar, Context context, Class<? extends ISubService> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("2b27050d", new Object[]{this, ljsVar, context, cls});
        }
        ISubService a2 = ljsVar.a(cls);
        if (a2 instanceof lkq) {
            return ((lkq) a2).mo1092createContainer(context);
        }
        ldf.d(TAG, String.format("未查找到: %s 创建视图", cls));
        return null;
    }

    private void destroyChildLayer(ljs ljsVar, Class<? extends ISubService> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("884b78c", new Object[]{this, ljsVar, cls});
            return;
        }
        ISubService a2 = ljsVar.a(cls);
        if (!(a2 instanceof lkq)) {
            return;
        }
        ((lkq) a2).destroyContainer();
    }

    private void addChildToRoot(ViewGroup viewGroup, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a45d21", new Object[]{this, viewGroup, frameLayout});
        } else if (viewGroup == null) {
        } else {
            frameLayout.addView(viewGroup);
        }
    }

    private FrameLayout createRootViewGroup(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("7ba90b94", new Object[]{this, context});
        }
        InfoFlowRootContainer infoFlowRootContainer = new InfoFlowRootContainer(context);
        infoFlowRootContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return infoFlowRootContainer;
    }
}
