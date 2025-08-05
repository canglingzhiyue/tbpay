package com.taobao.infoflow.taobao.subservice.biz.multiclasstabservice;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.multiclasstab.IMulticlassTabService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.bxn;
import tb.kge;
import tb.ldf;
import tb.ljs;
import tb.lke;
import tb.lkq;
import tb.lli;
import tb.llj;
import tb.lll;
import tb.llm;
import tb.loh;

/* loaded from: classes.dex */
public class MulticlassTabServiceImpl implements IMulticlassTabService<FrameLayout> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "MulticlassTabServiceImpl";
    private IContainerInnerDataModel<?> mBaseDataMode;
    private IContainerDataService.a mDataProcessListener;
    private ljs mInfoFlowContext;
    private IMulticlassTabService.b mOnTabContentListener;
    private FrameLayout mRootLayout;
    private final List<IMulticlassTabService.a> mTabChangeListenerList = new CopyOnWriteArrayList();
    private final List<IMulticlassTabService.b> mTabContentListenerList = new CopyOnWriteArrayList();
    private final Handler mMainHandler = new Handler(Looper.getMainLooper());
    private final com.taobao.infoflow.core.subservice.framework.container.containerservice.a mContainerLifecycleRegister = new com.taobao.infoflow.core.subservice.framework.container.containerservice.a();
    private final loh mClassifiedTabWaiter = new loh(createOnTabChangeListener());

    static {
        kge.a(-2066192102);
        kge.a(-1951176496);
    }

    public static /* synthetic */ void access$000(MulticlassTabServiceImpl multiclassTabServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fb475d0", new Object[]{multiclassTabServiceImpl});
        } else {
            multiclassTabServiceImpl.notifyTabContentCreate();
        }
    }

    public static /* synthetic */ void access$100(MulticlassTabServiceImpl multiclassTabServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10363daf", new Object[]{multiclassTabServiceImpl});
        } else {
            multiclassTabServiceImpl.notifyTabContentDestroy();
        }
    }

    public static /* synthetic */ void access$200(MulticlassTabServiceImpl multiclassTabServiceImpl, llm llmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bcfdbf1", new Object[]{multiclassTabServiceImpl, llmVar});
        } else {
            multiclassTabServiceImpl.notifyTabSelect(llmVar);
        }
    }

    public static /* synthetic */ void access$300(MulticlassTabServiceImpl multiclassTabServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d139cd6d", new Object[]{multiclassTabServiceImpl});
        } else {
            multiclassTabServiceImpl.notifyMainFeedsScrollToTop();
        }
    }

    public static /* synthetic */ void access$400(MulticlassTabServiceImpl multiclassTabServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1bb954c", new Object[]{multiclassTabServiceImpl});
        } else {
            multiclassTabServiceImpl.notifyEnablePullReFreshState();
        }
    }

    public static /* synthetic */ void access$500(MulticlassTabServiceImpl multiclassTabServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("923d5d2b", new Object[]{multiclassTabServiceImpl});
        } else {
            multiclassTabServiceImpl.notifyMainFeedsScrollEnable();
        }
    }

    public static /* synthetic */ void access$600(MulticlassTabServiceImpl multiclassTabServiceImpl, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b08adf1", new Object[]{multiclassTabServiceImpl, iContainerDataModel});
        } else {
            multiclassTabServiceImpl.destroy(iContainerDataModel);
        }
    }

    public static /* synthetic */ IContainerInnerDataModel access$702(MulticlassTabServiceImpl multiclassTabServiceImpl, IContainerInnerDataModel iContainerInnerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerInnerDataModel) ipChange.ipc$dispatch("cfee7af", new Object[]{multiclassTabServiceImpl, iContainerInnerDataModel});
        }
        multiclassTabServiceImpl.mBaseDataMode = iContainerInnerDataModel;
        return iContainerInnerDataModel;
    }

    public static /* synthetic */ loh access$800(MulticlassTabServiceImpl multiclassTabServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (loh) ipChange.ipc$dispatch("7d00f619", new Object[]{multiclassTabServiceImpl}) : multiclassTabServiceImpl.mClassifiedTabWaiter;
    }

    public static /* synthetic */ IMulticlassTabService.b access$900(MulticlassTabServiceImpl multiclassTabServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMulticlassTabService.b) ipChange.ipc$dispatch("c2c4bfca", new Object[]{multiclassTabServiceImpl}) : multiclassTabServiceImpl.getOnTabContentListener();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.mInfoFlowContext = ljsVar;
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
        this.mTabChangeListenerList.clear();
        this.mTabContentListenerList.clear();
        this.mContainerLifecycleRegister.a();
    }

    @Override // tb.lkq
    /* renamed from: createContainer  reason: collision with other method in class */
    public FrameLayout mo1092createContainer(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("3756b2fd", new Object[]{this, context});
        }
        this.mContainerLifecycleRegister.a(context);
        this.mRootLayout = createRootContainer(context);
        this.mClassifiedTabWaiter.a(context);
        this.mContainerLifecycleRegister.c();
        return this.mRootLayout;
    }

    @Override // tb.lkq
    public void destroyContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49a77eae", new Object[]{this});
            return;
        }
        this.mClassifiedTabWaiter.d();
        FrameLayout frameLayout = this.mRootLayout;
        if (frameLayout == null) {
            return;
        }
        frameLayout.removeAllViews();
        this.mRootLayout = null;
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

    @Override // com.taobao.infoflow.protocol.subservice.biz.multiclasstab.IMulticlassTabService
    public void loadTabContent(String str, llj lljVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bac08001", new Object[]{this, str, lljVar});
        } else if (this.mRootLayout == null) {
            ldf.d(TAG, "showTabContent mRootLayout is null");
        } else {
            ViewGroup a2 = this.mClassifiedTabWaiter.a(str, lljVar);
            if (a2 == null) {
                ldf.d(TAG, "showTabContent tabContent is null");
            } else {
                addToRoot(this.mRootLayout, a2, lljVar.b());
            }
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.multiclasstab.IMulticlassTabService
    public boolean isShowTabContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("330958d6", new Object[]{this})).booleanValue() : this.mClassifiedTabWaiter.b();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.multiclasstab.IMulticlassTabService
    public void hideTabContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c0deb8d", new Object[]{this});
        } else {
            this.mClassifiedTabWaiter.c();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.multiclasstab.IMulticlassTabService
    public llm getCurrentTabInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (llm) ipChange.ipc$dispatch("59877fb2", new Object[]{this}) : this.mClassifiedTabWaiter.a();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.multiclasstab.IMulticlassTabService
    public void addTabChangeListener(IMulticlassTabService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("756c0715", new Object[]{this, aVar});
        } else {
            this.mTabChangeListenerList.add(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.multiclasstab.IMulticlassTabService
    public void removeTabChangeListener(IMulticlassTabService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23d80ff8", new Object[]{this, aVar});
        } else {
            this.mTabChangeListenerList.remove(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.multiclasstab.IMulticlassTabService
    public void addTabContentListener(IMulticlassTabService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2da3acb3", new Object[]{this, bVar});
        } else {
            this.mTabContentListenerList.add(bVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.multiclasstab.IMulticlassTabService
    public void removeTabContentListener(IMulticlassTabService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cb8c030", new Object[]{this, bVar});
        } else {
            this.mTabContentListenerList.remove(bVar);
        }
    }

    private void addToRoot(FrameLayout frameLayout, ViewGroup viewGroup, lll lllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0c5d2cb", new Object[]{this, frameLayout, viewGroup, lllVar});
        } else if (frameLayout.equals(viewGroup.getParent())) {
        } else {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.topMargin = lllVar.a();
            frameLayout.addView(viewGroup, layoutParams);
            frameLayout.setVisibility(0);
        }
    }

    private FrameLayout createRootContainer(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("a57a8c3b", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setVisibility(8);
        return frameLayout;
    }

    private IMulticlassTabService.b createOnTabContentListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMulticlassTabService.b) ipChange.ipc$dispatch("8a9826bd", new Object[]{this}) : new IMulticlassTabService.b() { // from class: com.taobao.infoflow.taobao.subservice.biz.multiclasstabservice.MulticlassTabServiceImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.biz.multiclasstab.IMulticlassTabService.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    MulticlassTabServiceImpl.access$000(MulticlassTabServiceImpl.this);
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.biz.multiclasstab.IMulticlassTabService.b
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                } else {
                    MulticlassTabServiceImpl.access$100(MulticlassTabServiceImpl.this);
                }
            }
        };
    }

    private void notifyTabContentCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef51eb0", new Object[]{this});
            return;
        }
        for (IMulticlassTabService.b bVar : this.mTabContentListenerList) {
            bVar.a();
        }
    }

    private void notifyTabContentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89b4a5f4", new Object[]{this});
            return;
        }
        for (IMulticlassTabService.b bVar : this.mTabContentListenerList) {
            bVar.b();
        }
    }

    private IMulticlassTabService.a createOnTabChangeListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMulticlassTabService.a) ipChange.ipc$dispatch("9d8105c9", new Object[]{this}) : new IMulticlassTabService.a() { // from class: com.taobao.infoflow.taobao.subservice.biz.multiclasstabservice.MulticlassTabServiceImpl.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.biz.multiclasstab.IMulticlassTabService.a
            public void a(llm llmVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f304c8cb", new Object[]{this, llmVar});
                    return;
                }
                MulticlassTabServiceImpl.access$200(MulticlassTabServiceImpl.this, llmVar);
                MulticlassTabServiceImpl.access$300(MulticlassTabServiceImpl.this);
                MulticlassTabServiceImpl.access$400(MulticlassTabServiceImpl.this);
                MulticlassTabServiceImpl.access$500(MulticlassTabServiceImpl.this);
            }
        };
    }

    private void notifyTabSelect(llm llmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a239dd92", new Object[]{this, llmVar});
            return;
        }
        for (IMulticlassTabService.a aVar : this.mTabChangeListenerList) {
            aVar.a(llmVar);
        }
    }

    private void notifyEnablePullReFreshState() {
        IHostService iHostService;
        lke a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f19574ce", new Object[]{this});
            return;
        }
        ljs ljsVar = this.mInfoFlowContext;
        if (ljsVar == null || (iHostService = (IHostService) ljsVar.a(IHostService.class)) == null || (a2 = iHostService.getInvokeCallback().a()) == null) {
            return;
        }
        a2.a(!this.mClassifiedTabWaiter.b());
    }

    private void notifyMainFeedsScrollEnable() {
        IMainFeedsViewService iMainFeedsViewService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccb3846a", new Object[]{this});
            return;
        }
        ljs ljsVar = this.mInfoFlowContext;
        if (ljsVar == null || (iMainFeedsViewService = (IMainFeedsViewService) ljsVar.a(IMainFeedsViewService.class)) == null) {
            return;
        }
        iMainFeedsViewService.setScrollEnabled(!this.mClassifiedTabWaiter.b());
    }

    private void notifyMainFeedsScrollToTop() {
        IMainFeedsViewService iMainFeedsViewService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22029c81", new Object[]{this});
            return;
        }
        ljs ljsVar = this.mInfoFlowContext;
        if (ljsVar == null || (iMainFeedsViewService = (IMainFeedsViewService) ljsVar.a(IMainFeedsViewService.class)) == null) {
            return;
        }
        iMainFeedsViewService.scrollToPosition(0);
    }

    private void initRegisterDataListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e5909f8", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            return;
        }
        IContainerDataModel containerData = iContainerDataService.getContainerData();
        if (containerData != null) {
            this.mBaseDataMode = containerData.getBase();
        }
        this.mDataProcessListener = createDataProcessListener();
        iContainerDataService.addDataProcessListener(this.mDataProcessListener);
    }

    private void unRegisterDataListener() {
        IContainerDataService.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d5e881", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService == null || (aVar = this.mDataProcessListener) == null) {
            return;
        }
        iContainerDataService.removeDataProcessListener(aVar);
    }

    private IContainerDataService.a createDataProcessListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.a) ipChange.ipc$dispatch("a962c199", new Object[]{this}) : new IContainerDataService.a() { // from class: com.taobao.infoflow.taobao.subservice.biz.multiclasstabservice.MulticlassTabServiceImpl.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void a(lli lliVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f302f74f", new Object[]{this, lliVar});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void b(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("30b7ed6b", new Object[]{this, lliVar, iContainerDataModel});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void a(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ce5cd68c", new Object[]{this, lliVar, iContainerDataModel});
                } else {
                    MulticlassTabServiceImpl.access$600(MulticlassTabServiceImpl.this, iContainerDataModel);
                }
            }
        };
    }

    private void destroy(final IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11de131a", new Object[]{this, iContainerDataModel});
        } else {
            this.mMainHandler.post(new Runnable() { // from class: com.taobao.infoflow.taobao.subservice.biz.multiclasstabservice.MulticlassTabServiceImpl.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!bxn.a(iContainerDataModel)) {
                    } else {
                        MulticlassTabServiceImpl.access$702(MulticlassTabServiceImpl.this, iContainerDataModel.getBase());
                        MulticlassTabServiceImpl.access$800(MulticlassTabServiceImpl.this).d();
                        MulticlassTabServiceImpl.access$900(MulticlassTabServiceImpl.this).b();
                    }
                }
            });
        }
    }

    private IMulticlassTabService.b getOnTabContentListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMulticlassTabService.b) ipChange.ipc$dispatch("30fb497", new Object[]{this});
        }
        IMulticlassTabService.b bVar = this.mOnTabContentListener;
        if (bVar != null) {
            return bVar;
        }
        this.mOnTabContentListener = createOnTabContentListener();
        return this.mOnTabContentListener;
    }
}
