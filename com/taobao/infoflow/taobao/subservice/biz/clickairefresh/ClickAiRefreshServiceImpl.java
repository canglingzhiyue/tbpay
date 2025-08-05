package com.taobao.infoflow.taobao.subservice.biz.clickairefresh;

import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.model.datamodel.request.a;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IClickAiRefreshService;
import com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import java.util.Map;
import tb.bxp;
import tb.kge;
import tb.ldf;
import tb.liy;
import tb.lje;
import tb.ljs;
import tb.lks;
import tb.llb;
import tb.lli;
import tb.xnk;

/* loaded from: classes7.dex */
public class ClickAiRefreshServiceImpl implements IClickAiRefreshService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ClickAiRefreshServiceImpl";
    private lks.c feedsScrollListener;
    private IContainerDataService<?> mContainerDataService;
    private IDxItemClickService mDxItemClickService;
    private IMainFeedsViewService<?> mFeedsViewService;
    private ljs mInfoFlowContext;
    private boolean mIsClickedInfoFlow = false;
    private IDxItemClickService.a mOnDxItemClickListener;
    private IContainerDataService.b mOnRequestListener;
    private llb mPageLifeCycle;
    private xnk mRefresher;
    private IContainerDataService.c mRequestBizParamsCreator;

    static {
        kge.a(941023099);
        kge.a(2059044512);
    }

    public static /* synthetic */ xnk access$000(ClickAiRefreshServiceImpl clickAiRefreshServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xnk) ipChange.ipc$dispatch("d10234c6", new Object[]{clickAiRefreshServiceImpl}) : clickAiRefreshServiceImpl.mRefresher;
    }

    public static /* synthetic */ void access$100(ClickAiRefreshServiceImpl clickAiRefreshServiceImpl, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5645d4", new Object[]{clickAiRefreshServiceImpl, baseSectionModel});
        } else {
            clickAiRefreshServiceImpl.checkClickedInfoFlow(baseSectionModel);
        }
    }

    public static /* synthetic */ boolean access$200(ClickAiRefreshServiceImpl clickAiRefreshServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b1715f51", new Object[]{clickAiRefreshServiceImpl})).booleanValue() : clickAiRefreshServiceImpl.mIsClickedInfoFlow;
    }

    public static /* synthetic */ boolean access$202(ClickAiRefreshServiceImpl clickAiRefreshServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec9cf369", new Object[]{clickAiRefreshServiceImpl, new Boolean(z)})).booleanValue();
        }
        clickAiRefreshServiceImpl.mIsClickedInfoFlow = z;
        return z;
    }

    public static /* synthetic */ IMainFeedsViewService access$300(ClickAiRefreshServiceImpl clickAiRefreshServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMainFeedsViewService) ipChange.ipc$dispatch("8621c436", new Object[]{clickAiRefreshServiceImpl}) : clickAiRefreshServiceImpl.mFeedsViewService;
    }

    public static /* synthetic */ void access$400(ClickAiRefreshServiceImpl clickAiRefreshServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc670cf", new Object[]{clickAiRefreshServiceImpl});
        } else {
            clickAiRefreshServiceImpl.triggerClickAiRefreshRequest();
        }
    }

    public static /* synthetic */ ljs access$500(ClickAiRefreshServiceImpl clickAiRefreshServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ljs) ipChange.ipc$dispatch("b4e92ee1", new Object[]{clickAiRefreshServiceImpl}) : clickAiRefreshServiceImpl.mInfoFlowContext;
    }

    public static /* synthetic */ void access$600(ClickAiRefreshServiceImpl clickAiRefreshServiceImpl, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f215c64a", new Object[]{clickAiRefreshServiceImpl, iContainerDataModel});
        } else {
            clickAiRefreshServiceImpl.handleRequestData(iContainerDataModel);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.mInfoFlowContext = ljsVar;
        this.mFeedsViewService = (IMainFeedsViewService) this.mInfoFlowContext.a(IMainFeedsViewService.class);
        registerListeners();
        if (this.mRefresher != null) {
            return;
        }
        this.mRefresher = new xnk(ljsVar);
    }

    private void registerListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d654163", new Object[]{this});
            return;
        }
        this.mDxItemClickService = (IDxItemClickService) this.mInfoFlowContext.a(IDxItemClickService.class);
        if (this.mDxItemClickService != null) {
            this.mOnDxItemClickListener = createDXItemClickListener();
            this.mDxItemClickService.addDxItemClickListener(this.mOnDxItemClickListener);
        }
        this.mContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (this.mContainerDataService != null) {
            this.mRequestBizParamsCreator = createRequestBizParamsCreator();
            this.mContainerDataService.addRequestBizParamsCreator(this.mRequestBizParamsCreator);
            this.mOnRequestListener = createRequestListener();
            ldf.d(TAG, "IContainerDataService is null");
            this.mContainerDataService.addRequestListener(this.mOnRequestListener);
        }
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) this.mInfoFlowContext.a(IMainLifecycleService.class);
        if (iMainLifecycleService != null) {
            this.mPageLifeCycle = createPageLifeCycle();
            iMainLifecycleService.getPageLifeCycleRegister().a(this.mPageLifeCycle);
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.mFeedsViewService;
        if (iMainFeedsViewService == null) {
            return;
        }
        lks mo1084getLifeCycleRegister = iMainFeedsViewService.mo1084getLifeCycleRegister();
        this.feedsScrollListener = createFeedsScrollListener();
        mo1084getLifeCycleRegister.a(this.feedsScrollListener);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            unRegisterListeners();
        }
    }

    private void unRegisterListeners() {
        IMainFeedsViewService<?> iMainFeedsViewService;
        IContainerDataService<?> iContainerDataService;
        IContainerDataService.c cVar;
        IDxItemClickService.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5067cc4a", new Object[]{this});
            return;
        }
        IDxItemClickService iDxItemClickService = this.mDxItemClickService;
        if (iDxItemClickService != null && (aVar = this.mOnDxItemClickListener) != null) {
            iDxItemClickService.removeDxItemClickListener(aVar);
        }
        IContainerDataService<?> iContainerDataService2 = this.mContainerDataService;
        if (iContainerDataService2 != null && (cVar = this.mRequestBizParamsCreator) != null) {
            iContainerDataService2.removeRequestBizParamsCreator(cVar);
        }
        IContainerDataService.b bVar = this.mOnRequestListener;
        if (bVar != null && (iContainerDataService = this.mContainerDataService) != null) {
            iContainerDataService.removeRequestListener(bVar);
        }
        if (this.feedsScrollListener != null && (iMainFeedsViewService = this.mFeedsViewService) != null) {
            iMainFeedsViewService.mo1084getLifeCycleRegister().b(this.feedsScrollListener);
            this.feedsScrollListener = null;
        }
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) this.mInfoFlowContext.a(IMainLifecycleService.class);
        if (iMainLifecycleService == null) {
            return;
        }
        iMainLifecycleService.getPageLifeCycleRegister().b(this.mPageLifeCycle);
    }

    private IContainerDataService.c createRequestBizParamsCreator() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.c) ipChange.ipc$dispatch("70453300", new Object[]{this}) : new IContainerDataService.c() { // from class: com.taobao.infoflow.taobao.subservice.biz.clickairefresh.ClickAiRefreshServiceImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
            public Map<String, String> a(lli lliVar, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Map) ipChange2.ipc$dispatch("add74dce", new Object[]{this, lliVar, str});
                }
                if (a.b(str)) {
                    return ClickAiRefreshServiceImpl.access$000(ClickAiRefreshServiceImpl.this).b();
                }
                return null;
            }
        };
    }

    private IDxItemClickService.a createDXItemClickListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDxItemClickService.a) ipChange.ipc$dispatch("1408a256", new Object[]{this}) : new IDxItemClickService.a() { // from class: com.taobao.infoflow.taobao.subservice.biz.clickairefresh.ClickAiRefreshServiceImpl.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService.a
            public void a(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b6a38c", new Object[]{this, baseSectionModel, baseSubItemModel, view});
                    return;
                }
                ClickAiRefreshServiceImpl.access$100(ClickAiRefreshServiceImpl.this, baseSectionModel);
                if (!ClickAiRefreshServiceImpl.access$200(ClickAiRefreshServiceImpl.this) || ClickAiRefreshServiceImpl.access$000(ClickAiRefreshServiceImpl.this) == null) {
                    return;
                }
                ClickAiRefreshServiceImpl.access$000(ClickAiRefreshServiceImpl.this).a(baseSectionModel, ClickAiRefreshServiceImpl.access$300(ClickAiRefreshServiceImpl.this).getPositionBySectionBizCode(baseSectionModel.getSectionBizCode()));
                if (!ClickAiRefreshServiceImpl.access$000(ClickAiRefreshServiceImpl.this).c() || !ClickAiRefreshServiceImpl.access$000(ClickAiRefreshServiceImpl.this).b("clickAiRefresh")) {
                    return;
                }
                ClickAiRefreshServiceImpl.access$202(ClickAiRefreshServiceImpl.this, false);
                ClickAiRefreshServiceImpl.access$400(ClickAiRefreshServiceImpl.this);
            }
        };
    }

    private lks.c<ViewGroup> createFeedsScrollListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lks.c) ipChange.ipc$dispatch("f16f1732", new Object[]{this}) : new lks.c<ViewGroup>() { // from class: com.taobao.infoflow.taobao.subservice.biz.clickairefresh.ClickAiRefreshServiceImpl.3
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
                StaggeredGridLayoutManager staggeredGridLayoutManager;
                int[] findLastVisibleItemPositions;
                BaseSectionModel<?> findItemDataByPosition;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("75913347", new Object[]{this, viewGroup, new Integer(i), new Integer(i2)});
                } else if ((viewGroup instanceof RecyclerView) && (staggeredGridLayoutManager = (StaggeredGridLayoutManager) ((RecyclerView) viewGroup).getLayoutManager()) != null && ClickAiRefreshServiceImpl.access$300(ClickAiRefreshServiceImpl.this) != null) {
                    String str = null;
                    int i3 = -1;
                    for (int i4 : staggeredGridLayoutManager.findLastVisibleItemPositions(null)) {
                        if (i4 != -1) {
                            i3 = Math.max(i3, i4);
                        }
                    }
                    if (i3 == -1) {
                        return;
                    }
                    if (ClickAiRefreshServiceImpl.access$500(ClickAiRefreshServiceImpl.this) != null && i3 < liy.a(ClickAiRefreshServiceImpl.access$500(ClickAiRefreshServiceImpl.this))) {
                        ClickAiRefreshServiceImpl.access$000(ClickAiRefreshServiceImpl.this).a(liy.b(ClickAiRefreshServiceImpl.access$500(ClickAiRefreshServiceImpl.this)));
                        return;
                    }
                    BaseSectionModel<?> findItemDataByPosition2 = ClickAiRefreshServiceImpl.access$300(ClickAiRefreshServiceImpl.this).findItemDataByPosition(i3);
                    if (findItemDataByPosition2 != null && findItemDataByPosition2.getArgs() != null) {
                        try {
                            ClickAiRefreshServiceImpl.access$000(ClickAiRefreshServiceImpl.this).a(Integer.parseInt(findItemDataByPosition2.getArgs().getString("recIndex")) + 1);
                        } catch (NumberFormatException unused) {
                            ldf.d(ClickAiRefreshServiceImpl.TAG, "Invalid firstUnexposedRecIndex");
                        }
                    }
                    int i5 = i3 + 1;
                    if (i5 >= ClickAiRefreshServiceImpl.access$300(ClickAiRefreshServiceImpl.this).getItemCount() - 1) {
                        i5 = ClickAiRefreshServiceImpl.access$300(ClickAiRefreshServiceImpl.this).getItemCount() - 1;
                    }
                    BaseSectionModel<?> findItemDataByPosition3 = ClickAiRefreshServiceImpl.access$300(ClickAiRefreshServiceImpl.this).findItemDataByPosition(i5);
                    if (findItemDataByPosition3 != null && findItemDataByPosition3.getSectionBizCode() != null) {
                        str = findItemDataByPosition3.getSectionBizCode();
                    }
                    if (TextUtils.equals("loading", str) && (findItemDataByPosition = ClickAiRefreshServiceImpl.access$300(ClickAiRefreshServiceImpl.this).findItemDataByPosition(i5 - 1)) != null && findItemDataByPosition.getSectionBizCode() != null) {
                        str = findItemDataByPosition.getSectionBizCode();
                    }
                    if (ClickAiRefreshServiceImpl.access$000(ClickAiRefreshServiceImpl.this) == null || str == null) {
                        return;
                    }
                    ClickAiRefreshServiceImpl.access$000(ClickAiRefreshServiceImpl.this).a(str);
                }
            }
        };
    }

    private IContainerDataService.b createRequestListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.b) ipChange.ipc$dispatch("88e46762", new Object[]{this}) : new IContainerDataService.b() { // from class: com.taobao.infoflow.taobao.subservice.biz.clickairefresh.ClickAiRefreshServiceImpl.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, String str, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("74bec7ed", new Object[]{this, lliVar, str, str2, str3});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("552c8b59", new Object[]{this, lliVar, str});
                } else if (ClickAiRefreshServiceImpl.access$000(ClickAiRefreshServiceImpl.this) == null) {
                } else {
                    if (a.d(str)) {
                        ClickAiRefreshServiceImpl.access$000(ClickAiRefreshServiceImpl.this).e();
                    }
                    if (!a.a(str) || !ClickAiRefreshServiceImpl.access$000(ClickAiRefreshServiceImpl.this).d() || !ClickAiRefreshServiceImpl.access$000(ClickAiRefreshServiceImpl.this).b("clickAiRefresh") || !ClickAiRefreshServiceImpl.access$200(ClickAiRefreshServiceImpl.this)) {
                        return;
                    }
                    ClickAiRefreshServiceImpl.access$202(ClickAiRefreshServiceImpl.this, false);
                    ClickAiRefreshServiceImpl.access$400(ClickAiRefreshServiceImpl.this);
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, IContainerDataModel<?> iContainerDataModel, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d905f556", new Object[]{this, lliVar, iContainerDataModel, str});
                    return;
                }
                ClickAiRefreshServiceImpl.access$600(ClickAiRefreshServiceImpl.this, iContainerDataModel);
                if (!a.b(str) || iContainerDataModel == null || iContainerDataModel.getDelta() == null || iContainerDataModel.getDelta().mo1280getPageParams() == null) {
                    return;
                }
                int pageNum = iContainerDataModel.getDelta().mo1280getPageParams().getPageNum();
                IContainerDataService iContainerDataService = (IContainerDataService) ClickAiRefreshServiceImpl.access$500(ClickAiRefreshServiceImpl.this).a(IContainerDataService.class);
                if (iContainerDataService == null || iContainerDataService.getContainerData() == null || iContainerDataService.getContainerData().getBase() == null || iContainerDataService.getContainerData().getBase().mo1280getPageParams() == null) {
                    return;
                }
                iContainerDataService.getContainerData().getBase().mo1280getPageParams().setPageNum(pageNum);
            }
        };
    }

    private void handleRequestData(IContainerDataModel<?> iContainerDataModel) {
        IContainerInnerDataModel<?> base;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d00a22a3", new Object[]{this, iContainerDataModel});
        } else if (iContainerDataModel == null || this.mRefresher == null || (base = iContainerDataModel.getBase()) == null) {
        } else {
            JSONObject ext = base.getExt();
            if (ext == null) {
                ldf.d(TAG, "ext == null");
            } else {
                this.mRefresher.a(ext);
            }
        }
    }

    private llb createPageLifeCycle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (llb) ipChange.ipc$dispatch("414e763e", new Object[]{this}) : new bxp() { // from class: com.taobao.infoflow.taobao.subservice.biz.clickairefresh.ClickAiRefreshServiceImpl.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bxp, tb.llb
            public void onPause() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2f87fc5e", new Object[]{this});
                } else {
                    ClickAiRefreshServiceImpl.access$000(ClickAiRefreshServiceImpl.this).a();
                }
            }
        };
    }

    private void triggerClickAiRefreshRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c29c42d3", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            return;
        }
        iContainerDataService.triggerEvent("ClickAiRefresh", null, new lje("ClickAiRefresh" + SystemClock.uptimeMillis()));
    }

    private void checkClickedInfoFlow(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("703556a", new Object[]{this, baseSectionModel});
            return;
        }
        JSONObject args = baseSectionModel.getArgs();
        if (args == null) {
            this.mIsClickedInfoFlow = false;
            return;
        }
        if (args.getInteger("recIndex") == null) {
            z = false;
        }
        this.mIsClickedInfoFlow = z;
    }
}
