package com.taobao.infoflow.core.subservice.framework.container.stickyservice;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.framework.container.containerservice.a;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.base.IItemRenderService;
import com.taobao.infoflow.protocol.subservice.biz.IStickyContainerService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.protocol.view.item.c;
import tb.kge;
import tb.ldf;
import tb.liq;
import tb.ljd;
import tb.ljs;
import tb.lkq;
import tb.lks;
import tb.lli;

/* loaded from: classes.dex */
public class StickyContainerServiceImpl implements IStickyContainerService<FrameLayout> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "StickyContainerServiceImpl";
    private BaseSectionModel<?> cacheSectionModel;
    private IContainerDataService.a dataProcessListener;
    private lks.c feedsScrollListener;
    private ljs infoFlowContext;
    private c itemRenderPresenter;
    private View stickyItemView;
    private FrameLayout stickyRootLayout;
    private final a containerLifecycleRegister = new a();
    private final liq stickyDataParse = new liq();

    static {
        kge.a(1407800457);
        kge.a(290058855);
    }

    public static /* synthetic */ void access$000(StickyContainerServiceImpl stickyContainerServiceImpl, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fccf9b9e", new Object[]{stickyContainerServiceImpl, iContainerDataModel});
        } else {
            stickyContainerServiceImpl.dataRefresh(iContainerDataModel);
        }
    }

    public static /* synthetic */ void access$100(StickyContainerServiceImpl stickyContainerServiceImpl, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("248f52c6", new Object[]{stickyContainerServiceImpl, baseSectionModel});
        } else {
            stickyContainerServiceImpl.refresh(baseSectionModel);
        }
    }

    public static /* synthetic */ void access$200(StickyContainerServiceImpl stickyContainerServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85105f7f", new Object[]{stickyContainerServiceImpl});
        } else {
            stickyContainerServiceImpl.updateStickyItemView();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.infoFlowContext = ljsVar;
        initRegisterDataListener();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        unRegisterDataListener();
        unRegisterScrollListener();
        this.containerLifecycleRegister.a();
    }

    @Override // tb.lkq
    /* renamed from: createContainer  reason: collision with other method in class */
    public FrameLayout mo1092createContainer(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("3756b2fd", new Object[]{this, context});
        }
        this.containerLifecycleRegister.a(context);
        this.stickyRootLayout = createStickyContainer(context);
        this.containerLifecycleRegister.c();
        return this.stickyRootLayout;
    }

    @Override // tb.lkq
    public void destroyContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49a77eae", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.stickyRootLayout;
        if (frameLayout == null) {
            return;
        }
        frameLayout.removeAllViews();
        this.stickyRootLayout = null;
    }

    @Override // tb.lkq
    public void addOnContainerListener(lkq.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f3597dd", new Object[]{this, aVar});
        } else {
            this.containerLifecycleRegister.a(aVar);
        }
    }

    @Override // tb.lkq
    public void removeOnContainerListener(lkq.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8982e05a", new Object[]{this, aVar});
        } else {
            this.containerLifecycleRegister.b(aVar);
        }
    }

    private FrameLayout createStickyContainer(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("c5f82b14", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        frameLayout.setVisibility(8);
        return frameLayout;
    }

    private void initRegisterDataListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e5909f8", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.infoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            return;
        }
        this.dataProcessListener = createDataProcessListener();
        iContainerDataService.addDataProcessListener(this.dataProcessListener);
    }

    private void unRegisterDataListener() {
        IContainerDataService.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d5e881", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.infoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService == null || (aVar = this.dataProcessListener) == null) {
            return;
        }
        iContainerDataService.removeDataProcessListener(aVar);
    }

    private IContainerDataService.a createDataProcessListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.a) ipChange.ipc$dispatch("a962c199", new Object[]{this}) : new IContainerDataService.a() { // from class: com.taobao.infoflow.core.subservice.framework.container.stickyservice.StickyContainerServiceImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void a(lli lliVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f302f74f", new Object[]{this, lliVar});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void a(lli lliVar, IContainerDataModel iContainerDataModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ce5cd68c", new Object[]{this, lliVar, iContainerDataModel});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void b(lli lliVar, IContainerDataModel iContainerDataModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("30b7ed6b", new Object[]{this, lliVar, iContainerDataModel});
                } else {
                    StickyContainerServiceImpl.access$000(StickyContainerServiceImpl.this, iContainerDataModel);
                }
            }
        };
    }

    private void dataRefresh(IContainerDataModel<BaseSectionModel<?>> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33cc3a63", new Object[]{this, iContainerDataModel});
        } else if (iContainerDataModel == null || this.stickyRootLayout == null) {
        } else {
            this.stickyDataParse.a(iContainerDataModel);
            final BaseSectionModel<?> b = this.stickyDataParse.b();
            ljd.a().b(new Runnable() { // from class: com.taobao.infoflow.core.subservice.framework.container.stickyservice.StickyContainerServiceImpl.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        StickyContainerServiceImpl.access$100(StickyContainerServiceImpl.this, b);
                    }
                }
            });
        }
    }

    private void refresh(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40b5562a", new Object[]{this, baseSectionModel});
        } else if (baseSectionModel == null) {
            clearStickyContainer();
            unRegisterScrollListener();
        } else {
            registerScrollListener();
            updateStickyItemView();
        }
    }

    private void clearStickyContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7109592", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.stickyRootLayout;
        if (frameLayout == null || this.stickyItemView == null) {
            return;
        }
        frameLayout.removeAllViews();
        this.stickyRootLayout.setVisibility(8);
        this.stickyItemView = null;
    }

    private void registerScrollListener() {
        IMainFeedsViewService iMainFeedsViewService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7d9e6ab", new Object[]{this});
        } else if (this.feedsScrollListener != null || (iMainFeedsViewService = (IMainFeedsViewService) this.infoFlowContext.a(IMainFeedsViewService.class)) == null) {
        } else {
            lks mo1084getLifeCycleRegister = iMainFeedsViewService.mo1084getLifeCycleRegister();
            this.feedsScrollListener = createFeedsScrollListener();
            mo1084getLifeCycleRegister.a(this.feedsScrollListener);
        }
    }

    private void unRegisterScrollListener() {
        IMainFeedsViewService iMainFeedsViewService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d0d1424", new Object[]{this});
        } else if (this.feedsScrollListener == null || (iMainFeedsViewService = (IMainFeedsViewService) this.infoFlowContext.a(IMainFeedsViewService.class)) == null) {
        } else {
            iMainFeedsViewService.mo1084getLifeCycleRegister().b(this.feedsScrollListener);
            this.feedsScrollListener = null;
        }
    }

    private lks.c<ViewGroup> createFeedsScrollListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lks.c) ipChange.ipc$dispatch("f16f1732", new Object[]{this}) : new lks.c<ViewGroup>() { // from class: com.taobao.infoflow.core.subservice.framework.container.stickyservice.StickyContainerServiceImpl.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lks.c
            public void a(ViewGroup viewGroup, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a8f4273c", new Object[]{this, viewGroup, new Integer(i)});
                }
            }

            @Override // tb.lks.c
            public void a(boolean z, boolean z2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
                }
            }

            @Override // tb.lks.c
            public void a(ViewGroup viewGroup, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("75913347", new Object[]{this, viewGroup, new Integer(i), new Integer(i2)});
                } else {
                    StickyContainerServiceImpl.access$200(StickyContainerServiceImpl.this);
                }
            }
        };
    }

    private void updateStickyItemView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3532a611", new Object[]{this});
            return;
        }
        BaseSectionModel<?> b = this.stickyDataParse.b();
        if (b == null) {
            return;
        }
        int firstItemPosition = getFirstItemPosition();
        int a2 = this.stickyDataParse.a();
        if (firstItemPosition >= a2) {
            showStickyItemView(b);
        }
        if (firstItemPosition >= a2) {
            return;
        }
        hideStickyItemView();
    }

    private void showStickyItemView(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11f9c60d", new Object[]{this, baseSectionModel});
        } else if (!isNeedCreateStickyView(baseSectionModel, this.stickyItemView)) {
            ldf.b(TAG, "isNeedCreateView is false");
        } else {
            this.stickyItemView = createStickyItemView(this.stickyRootLayout, baseSectionModel);
            if (this.stickyItemView == null) {
                ldf.d(TAG, "createStickyItemView stickyItemView is null");
                return;
            }
            if (this.stickyRootLayout.getChildCount() != 0) {
                this.stickyRootLayout.removeAllViews();
            }
            this.stickyRootLayout.addView(this.stickyItemView);
            this.stickyRootLayout.setVisibility(0);
        }
    }

    private boolean isNeedCreateStickyView(BaseSectionModel<?> baseSectionModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("742cec9d", new Object[]{this, baseSectionModel, view})).booleanValue();
        }
        if (view == null) {
            return true;
        }
        if (baseSectionModel == this.cacheSectionModel) {
            return false;
        }
        this.cacheSectionModel = baseSectionModel;
        return true;
    }

    private View createStickyItemView(ViewGroup viewGroup, BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2bc970d", new Object[]{this, viewGroup, baseSectionModel});
        }
        c itemRenderPresenter = getItemRenderPresenter();
        if (itemRenderPresenter == null) {
            return null;
        }
        BaseSectionModel<?> createBaseSectionModel = baseSectionModel.createBaseSectionModel(baseSectionModel.toJsonObject());
        View createView = itemRenderPresenter.createView(viewGroup, itemRenderPresenter.getViewType(createBaseSectionModel));
        itemRenderPresenter.bindData(createView, createBaseSectionModel);
        return createView;
    }

    private void hideStickyItemView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("978a7e4a", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.stickyRootLayout;
        if (frameLayout == null || frameLayout.getChildCount() == 0) {
            return;
        }
        this.stickyRootLayout.removeAllViews();
        this.stickyRootLayout.setVisibility(8);
    }

    private c getItemRenderPresenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("e759853b", new Object[]{this});
        }
        IItemRenderService iItemRenderService = (IItemRenderService) this.infoFlowContext.a(IItemRenderService.class);
        if (iItemRenderService == null) {
            return null;
        }
        if (this.itemRenderPresenter == null) {
            this.itemRenderPresenter = iItemRenderService.getItemRenderPresenter();
        }
        return this.itemRenderPresenter;
    }

    private int getFirstItemPosition() {
        int[] visiblePositionRange;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("426eb4f0", new Object[]{this})).intValue();
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.infoFlowContext.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService != null && (visiblePositionRange = iMainFeedsViewService.getVisiblePositionRange()) != null && visiblePositionRange.length >= 2) {
            return visiblePositionRange[0];
        }
        return -1;
    }
}
